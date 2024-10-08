package X;

/* renamed from: X.VlY  reason: case insensitive filesystem */
public final class C18104VlY {
    public static final Integer A00(String str) {
        String A0j = AnonymousClass7TF.A0j(str);
        int hashCode = A0j.hashCode();
        if (hashCode != -1338941519) {
            if (hashCode != -1325970902) {
                if (hashCode != 109618859 || !A0j.equals("solid")) {
                    return null;
                }
                return AnonymousClass05K.A00;
            } else if (A0j.equals("dotted")) {
                return AnonymousClass05K.A0C;
            } else {
                return null;
            }
        } else if (A0j.equals("dashed")) {
            return AnonymousClass05K.A01;
        } else {
            return null;
        }
    }
}
