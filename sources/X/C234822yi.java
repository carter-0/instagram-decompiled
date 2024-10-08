package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2yi  reason: invalid class name and case insensitive filesystem */
public final class C234822yi extends C234532y8 {
    public final AnonymousClass4DU A00;
    public final C234772yd A01;
    public final C234782ye A02;
    public final C234682yS A03;
    public final C234702yW A04;
    public final C234752yb A05;
    public final UserSession A06;
    public final C234812yh A07;

    public final void Csj(C2354830a r7, 1Xj r8, AnonymousClass3W1 r9) {
        C250603lj r0;
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 1);
        0qQ.A0B(r9, 2);
        AnonymousClass4DU r5 = this.A00;
        if (AnonymousClass3WX.A02(r8, r5)) {
            C234682yS r4 = this.A03;
            r7.A00(r4.A03);
            r7.A00(this.A04.A01);
            if (182.A06(0Tu.A05, this.A06, 36316860475577018L) && 0qQ.A0K(r5.getModuleName(), "feed_timeline")) {
                r7.A00(r4.A04);
            }
            if (r9.A0o == 1sy.A0H) {
                r0 = this.A07.A00;
            } else {
                return;
            }
        } else if (AnonymousClass3WX.A01(r8, r5)) {
            r7.A00(this.A03.A01);
            r0 = this.A04.A01;
        } else {
            return;
        }
        r7.A00(r0);
    }

    public C234822yi(UserSession userSession, AnonymousClass4DU r2, C234812yh r3, C234772yd r4, C234782ye r5, C234682yS r6, C234702yW r7, C234752yb r8) {
        this.A03 = r6;
        this.A04 = r7;
        this.A05 = r8;
        this.A01 = r4;
        this.A02 = r5;
        this.A07 = r3;
        this.A00 = r2;
        this.A06 = userSession;
    }
}
