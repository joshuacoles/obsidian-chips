package org.joshuacoles.groovySponge.extensions;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class RichGroovy {
    public static Class toClass(String self) throws ClassNotFoundException {
        return Class.forName(self);
    }

    public static Object toObject(String self) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return Class.forName(self).newInstance();
    }

    public static Object toObject(String self, Object... args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ArrayList<Class> classes = new ArrayList<Class>();

        for (Object object: args) {
            classes.add(object.getClass());
        }

        return Class.forName(self).getConstructor((Class<?>[]) classes.toArray()).newInstance(args);
    }
}
