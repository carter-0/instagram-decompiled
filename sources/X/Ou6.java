package X;

import com.instagram.common.typedurl.ImageUrl;

public final class Ou6 implements C232262tL {
    public String A00;
    public String A01;
    public boolean A02;
    public final ImageUrl A03;
    public final String A04;
    public final String A05;

    public Ou6(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, boolean z) {
        C51973G9u.A0r(1, str, str3, str4);
        this.A05 = str;
        this.A03 = imageUrl;
        this.A04 = str2;
        this.A01 = str3;
        this.A02 = z;
        this.A00 = str5;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        Ou6 ou6 = (Ou6) obj;
        String str2 = this.A05;
        if (ou6 != null) {
            str = ou6.A05;
        } else {
            str = null;
        }
        if (!0qQ.A0K(str2, str) || !0qQ.A0K(this.A01, ou6.A01) || this.A02 != ou6.A02 || !0qQ.A0K(this.A00, ou6.A00)) {
            return false;
        }
        return true;
    }
}
