package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fmm  reason: case insensitive filesystem */
public final /* synthetic */ class C50999Fmm implements MT4 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4DU A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C50999Fmm(UserSession userSession, AnonymousClass4DU r2, String str, String str2, String str3, boolean z) {
        this.A05 = z;
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final void DgT() {
        boolean z = this.A05;
        UserSession userSession = this.A00;
        AnonymousClass4DU r1 = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        String str3 = this.A04;
        if (z) {
            C22031Xty.A0I(r1, userSession, str, str2, "download_qr_code", str3);
        }
    }
}
