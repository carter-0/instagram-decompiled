package X;

/* renamed from: X.6rK  reason: invalid class name and case insensitive filesystem */
public abstract class C319846rK {
    public static final 2YL A00(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            0qQ.A07(newInstance);
            return (2YL) newInstance;
        } catch (NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create an instance of ");
            sb.append(cls);
            throw new RuntimeException(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot create an instance of ");
            sb2.append(cls);
            throw new RuntimeException(sb2.toString(), e2);
        } catch (IllegalAccessException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot create an instance of ");
            sb3.append(cls);
            throw new RuntimeException(sb3.toString(), e3);
        }
    }
}
