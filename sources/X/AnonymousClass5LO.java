package X;

/* renamed from: X.5LO  reason: invalid class name */
public abstract class AnonymousClass5LO {
    public static final AnonymousClass5LQ A00;
    public static final AnonymousClass5LQ A01 = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [X.5LQ, java.lang.Object] */
    static {
        AnonymousClass5LQ r0;
        try {
            r0 = (AnonymousClass5LQ) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            r0 = null;
        }
        A00 = r0;
    }
}
