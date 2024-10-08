package X;

/* renamed from: X.3XB  reason: invalid class name */
public abstract class AnonymousClass3XB {
    public static final String A00(Class cls) {
        0qQ.A0B(cls, 0);
        String name = cls.getName();
        String simpleName = cls.getSimpleName();
        if (simpleName.length() < 5) {
            return 002.A0g("<cls>", name, "</cls>");
        }
        return simpleName;
    }
}
