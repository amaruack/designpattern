package design.factoryupgrade;

import com.google.common.reflect.ClassPath;
import org.checkerframework.checker.units.qual.C;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class AnimalFactory {

    private AnimalFactory() {
    }

    private static class SingletonHolder {
        static final AnimalFactory instance = new AnimalFactory();
    }

    public static AnimalFactory getInstance() {
        return AnimalFactory.SingletonHolder.instance;
    }

    private Map<String, Class<?>> list = new HashMap<>();

    public void init(String packageName){
        try {
            Set<Class> classes = findAllClasses(packageName);

            for (Class clazz : classes) {
                if (Animal.class.isAssignableFrom(clazz)){
                    // abstract 가 아닌 class 라면 ! 생성 로직 한번 돌자
                    if (!Modifier.isAbstract(clazz.getModifiers())) {
//                        System.out.println("TT!!"+clazz.getName());
                        clazz.newInstance();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private Set<Class> findAllClasses(String packageName) throws IOException {
        return ClassPath.from(ClassLoader.getSystemClassLoader())
                .getAllClasses()
                .stream()
                .filter(clazz -> clazz.getPackageName()
                        .equalsIgnoreCase(packageName))

                /// 여기 필터에서 처리 할까 ?? assignable, abstract ??
                .map(clazz -> clazz.load())
                .collect(Collectors.toSet());
    }


    private Class<?> getClass(String type) {
        return list.get(type.toLowerCase());
    }

    private Object buildObject(Class clazz) throws InstantiationException, IllegalAccessException {
        Object obj = clazz.newInstance();
        return obj;
    }

    public void setType(String type, Class clazz) {
        list.put(type.toLowerCase(), clazz);
    }

    public Animal create(String animalName) throws InstantiationException, IllegalAccessException {
        if (animalName == null) {
            throw new IllegalArgumentException("no null");
        }

        Object obj = buildObject(getClass(animalName));
        if (Animal.class.isAssignableFrom(obj.getClass())) {
            return (Animal) getClass(animalName).newInstance();
        } else {
            return null;
        }
    }
}

