package X;

import java.util.List;

/* renamed from: X.WGw  reason: case insensitive filesystem */
public final class C19020WGw implements X5s {
    public final String A00;
    public final String A01;

    public final boolean CmQ(W2K w2k) {
        String str = this.A01;
        char c = 65535;
        switch (str.hashCode()) {
            case 3392903:
                if (str.equals("null")) {
                    c = 0;
                    break;
                }
                break;
            case 104980213:
                if (str.equals("nnull")) {
                    c = 1;
                    break;
                }
                break;
            case 1509016093:
                if (str.equals("catch_all")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "NULL".equals(w2k.A02);
            case 1:
                return !"NULL".equals(w2k.A02);
            case 2:
                return true;
            default:
                return false;
        }
    }

    public final String getName() {
        return this.A00;
    }

    public C19020WGw(String str, String str2, List list) {
        if (list == null || list.isEmpty()) {
            this.A00 = str;
            this.A01 = str2;
            return;
        }
        throw new C16687V1q("Mismatching number of values", str);
    }
}
