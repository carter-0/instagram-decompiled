package X;

/* renamed from: X.NuC  reason: case insensitive filesystem */
public abstract class C69910NuC {
    public static final Integer A00(String str) {
        int A0F = JTR.A0F(str);
        if (A0F != 1501196714) {
            if (A0F != 1563991648) {
                if (A0F == 1885454214 && str.equals("upload_failed_transient")) {
                    return AnonymousClass05K.A01;
                }
            } else if (str.equals("uploaded")) {
                return AnonymousClass05K.A0N;
            }
        } else if (str.equals("upload_failed_permanent")) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A00;
    }
}
