package X;

/* renamed from: X.9C2  reason: invalid class name */
public abstract class AnonymousClass9C2 {
    public static final AnonymousClass9C3 A00;
    public static final AnonymousClass9C3 A01 = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.9C3] */
    static {
        AnonymousClass9C3 r0;
        try {
            r0 = (AnonymousClass9C3) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            r0 = null;
        }
        A00 = r0;
    }
}
