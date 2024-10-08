package X;

/* renamed from: X.Hbd  reason: case insensitive filesystem */
public abstract class C55068Hbd {
    public static final Integer A00(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1871442027) {
                if (hashCode != 3500751) {
                    if (hashCode == 492830541 && str.equals("integrity")) {
                        return AnonymousClass05K.A0u;
                    }
                } else if (str.equals("risk")) {
                    return AnonymousClass05K.A0j;
                }
            } else if (str.equals("banhammer")) {
                return AnonymousClass05K.A01;
            }
        }
        0wb.A03("PromoteErrorNativeUri", "Server sending unsupported type");
        return AnonymousClass05K.A15;
    }
}
