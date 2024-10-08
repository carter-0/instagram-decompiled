package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2yx  reason: invalid class name and case insensitive filesystem */
public final class C234972yx extends C234532y8 {
    public C234982yy A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass2z8 A03;
    public final AnonymousClass2z8 A04;
    public final AnonymousClass2z1 A05;
    public final C235012z6 A06;
    public final C235012z6 A07;
    public final 1Ua A08;

    public final void Csj(C2354830a r2, 1Xj r3, AnonymousClass3W1 r4) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        if (AnonymousClass3WX.A02(r3, this.A02)) {
            r2.A00(this.A07);
        }
    }

    public C234972yx(Context context, UserSession userSession, AnonymousClass4DU r13, C228182kv r14, C249763kK r15) {
        UserSession userSession2 = userSession;
        this.A01 = userSession;
        AnonymousClass4DU r5 = r13;
        this.A02 = r13;
        boolean A062 = 182.A06(0Tu.A05, userSession, 36318913469946605L);
        AnonymousClass2pP r1 = new AnonymousClass2pP(C60510iO.A00(userSession), false);
        if (A062) {
            this.A00 = new C234982yy(userSession, r13, AnonymousClass2oO.A00(userSession), r1);
        }
        1Ua A002 = 1UX.A00(context, userSession);
        this.A08 = A002;
        this.A05 = new AnonymousClass2z1(r1);
        C228182kv r6 = r14;
        C249763kK r7 = r15;
        this.A06 = new C235012z6(new AnonymousClass2z2(userSession2, r5, r6, r7, A002, "instagram_organic_vpvd_imp"), r1);
        this.A04 = new AnonymousClass2z8(new AnonymousClass2z7(userSession2, r5, r6, r7, A002, "instagram_organic_carousel_vpvd_imp"), r1);
        this.A07 = new C235012z6(new AnonymousClass2z2(userSession2, r5, r6, r7, A002, "instagram_ad_vpvd_imp"), r1);
        this.A03 = new AnonymousClass2z8(new AnonymousClass2z7(userSession2, r5, r6, r7, A002, "instagram_ad_carousel_vpvd_imp"), r1);
    }
}
