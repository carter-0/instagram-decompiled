package X;

/* renamed from: X.VlZ  reason: case insensitive filesystem */
public final class C18105VlZ {
    public static final Integer A00(String str) {
        String A0j = AnonymousClass7TF.A0j(str);
        int hashCode = A0j.hashCode();
        if (hashCode != -1217487446) {
            if (hashCode != -907680051) {
                if (hashCode != 466743410 || !A0j.equals("visible")) {
                    return null;
                }
                return AnonymousClass05K.A00;
            } else if (A0j.equals("scroll")) {
                return AnonymousClass05K.A0C;
            } else {
                return null;
            }
        } else if (A0j.equals("hidden")) {
            return AnonymousClass05K.A01;
        } else {
            return null;
        }
    }
}
