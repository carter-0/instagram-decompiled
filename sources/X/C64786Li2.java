package X;

/* renamed from: X.Li2  reason: case insensitive filesystem */
public final class C64786Li2 implements C232262tL {
    public final DU2 A00;
    public final String A01;
    public final boolean A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        String accessToken;
        DU2 du2 = this.A00;
        if (du2 == null || (accessToken = du2.getAccessToken()) == null) {
            return "";
        }
        return accessToken;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        String str2;
        C64786Li2 li2 = (C64786Li2) obj;
        DU2 du2 = this.A00;
        if (du2 == null || (str = du2.getAccessToken()) == null) {
            str = "";
        }
        if (li2 != null) {
            DU2 du22 = li2.A00;
            if (du22 == null || (str2 = du22.getAccessToken()) == null) {
                str2 = "";
            }
        } else {
            str2 = null;
        }
        if (!str.equals(str2) || li2 == null || this.A02 != li2.A02) {
            return false;
        }
        return true;
    }

    public C64786Li2(DU2 du2, String str, boolean z) {
        this.A00 = du2;
        this.A02 = z;
        this.A01 = str;
    }
}
