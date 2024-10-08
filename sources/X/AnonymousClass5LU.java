package X;

/* renamed from: X.5LU  reason: invalid class name */
public abstract class AnonymousClass5LU {
    public static final AnonymousClass5LV A00;
    public static final AnonymousClass5LV A01 = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.5LV, java.lang.Object] */
    static {
        AnonymousClass5LV r0;
        try {
            r0 = (AnonymousClass5LV) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            r0 = null;
        }
        A00 = r0;
    }
}
