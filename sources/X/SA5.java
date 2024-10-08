package X;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;

public abstract class SA5 {
    public SA5() {
        throw AnonymousClass00P.createAndThrow();
    }

    public static C11371SQf A00() {
        String str;
        Throwable th;
        Class<C11371SQf> cls = C11371SQf.class;
        Class<SA5> cls2 = SA5.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(cls)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw AnonymousClass7TE.A0w(cls.getName());
        }
        try {
            try {
                Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]);
                th = AnonymousClass7TE.A11("zza");
            } catch (NoSuchMethodException e) {
                th = new IllegalStateException(e);
            } catch (InstantiationException e2) {
                th = new IllegalStateException(e2);
            } catch (IllegalAccessException e3) {
                th = new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                th = new IllegalStateException(e4);
            }
            throw th;
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList A1C = AnonymousClass7TE.A1C();
            while (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("zza");
            }
            if (A1C.size() == 1) {
                return (C11371SQf) A1C.get(0);
            }
            if (A1C.size() == 0) {
                return null;
            }
            try {
                return (C11371SQf) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{A1C});
            } catch (NoSuchMethodException e5) {
                throw new IllegalStateException(e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(e7);
            }
        } catch (ServiceConfigurationError e8) {
            Pxf.A11(C8567Qx5.class).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(cls.getSimpleName())), e8);
        }
    }
}
