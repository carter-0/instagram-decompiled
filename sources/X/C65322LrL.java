package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.LrL  reason: case insensitive filesystem */
public final class C65322LrL implements 1Nv, JSt {
    public final int A00;
    public final long A01;
    public final long A02;
    public final ImageUrl A03;
    public final 1Xj A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final C270194gL Ahy() {
        return null;
    }

    public final String ByO(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return this.A04.A2v();
    }

    public final boolean CUz() {
        return this.A04.CUz();
    }

    public final boolean CYg() {
        return this.A04.CYg();
    }

    public final boolean CcK() {
        return this.A04.CcK();
    }

    public final String Aml() {
        return this.A08;
    }

    public final 1Xj BPf() {
        return this.A04;
    }

    public final String getId() {
        String id = this.A04.getId();
        if (id != null) {
            return id;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C65322LrL(ImageUrl imageUrl, 1Xj r2, String str, String str2, String str3, String str4, int i, long j, long j2) {
        this.A08 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A03 = imageUrl;
        this.A05 = str4;
        this.A02 = j;
        this.A00 = i;
        this.A01 = j2;
        this.A04 = r2;
    }
}
