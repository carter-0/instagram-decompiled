package X;

/* renamed from: X.48D  reason: invalid class name */
public abstract class AnonymousClass48D {
    public static final int A00;

    static {
        Integer num;
        int i;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            0qQ.A07(property);
            num = 00y.A0l(property);
        } catch (Throwable th) {
            num = new 0eQ(th);
        }
        if (num instanceof 0eQ) {
            num = null;
        }
        Number number = num;
        if (number != null) {
            i = number.intValue();
        } else {
            i = 2097152;
        }
        A00 = i;
    }
}
