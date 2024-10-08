package X;

/* renamed from: X.5LW  reason: invalid class name */
public abstract class AnonymousClass5LW {
    public static final AnonymousClass5LY A00;
    public static final AnonymousClass5LY A01 = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [X.5LY, java.lang.Object] */
    static {
        AnonymousClass5LY r0;
        try {
            r0 = (AnonymousClass5LY) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            r0 = null;
        }
        A00 = r0;
    }
}
