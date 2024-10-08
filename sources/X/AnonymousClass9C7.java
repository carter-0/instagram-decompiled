package X;

/* renamed from: X.9C7  reason: invalid class name */
public abstract class AnonymousClass9C7 {
    public static final AnonymousClass9C8 A00;
    public static final AnonymousClass9C8 A01 = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [X.9C8, java.lang.Object] */
    static {
        AnonymousClass9C8 r0;
        try {
            r0 = (AnonymousClass9C8) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            r0 = null;
        }
        A00 = r0;
    }
}
