package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lx6  reason: case insensitive filesystem */
public final class C65629Lx6 implements G7M {
    public final /* synthetic */ AnonymousClass818 A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C311296cS A02;

    public C65629Lx6(AnonymousClass818 r1, C255773uh r2, C311296cS r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onAuthorizeFail() {
        C311296cS r1 = this.A02;
        if (r1.A02) {
            r1.A02 = false;
            r1.A0A.EHd();
        }
    }

    public final void onAuthorizeSuccess(String str) {
        C311296cS r7 = this.A02;
        if (r7.A02) {
            r7.A02 = false;
            r7.A0A.EHd();
        }
        C255773uh r6 = this.A01;
        AnonymousClass818 r5 = this.A00;
        UserSession userSession = r7.A07;
        if (!182.A06(0Tu.A05, userSession, 36326618641479553L)) {
            r7.A01 = true;
            C363388je.A00(userSession).A01(r7.A06, new C65242Lpm(2, r5, r6, r7), "story_viewer");
        }
    }
}
