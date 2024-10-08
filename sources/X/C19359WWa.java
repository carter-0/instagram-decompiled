package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.WWa  reason: case insensitive filesystem */
public final class C19359WWa implements 1Xl, 1Nv {
    public C45884D9d A00 = null;
    public final ImageUrl A01;
    public final 1Xj A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C19359WWa(ImageUrl imageUrl, 1Xj r3, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A01 = imageUrl;
        this.A02 = r3;
        this.A07 = str4;
        this.A03 = str5;
        this.A08 = str6;
    }

    public final boolean CUz() {
        return true;
    }

    public final boolean CYg() {
        return false;
    }

    public final boolean CcK() {
        return true;
    }

    public final 1Xj BPf() {
        return this.A02;
    }

    public final String ByO(UserSession userSession) {
        return this.A08;
    }

    public final String getId() {
        return this.A03;
    }
}
