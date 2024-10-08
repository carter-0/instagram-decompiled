package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ia7  reason: case insensitive filesystem */
public final class C57401Ia7 implements C262944Gp {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass3W1 A05;
    public final Activity A06;
    public final View A07;
    public final View A08;
    public final C267324bN A09;
    public final UserSession A0A;
    public final 1Xj A0B;
    public final AnonymousClass5Gv A0C;
    public final S6e A0D;
    public final GD6 A0E;
    public final C52016GBn A0F;
    public final C52012GBj A0G;

    public final /* synthetic */ void Cv7(Integer num, float f) {
    }

    public final void D4N() {
        A03(true);
        if (this.A01) {
            AnonymousClass3W1 r2 = this.A05;
            if (r2.A1r) {
                r2.A1r = false;
            }
            this.A0G.A0F();
            A00();
            A01();
            this.A0E.Cs9(this.A0B);
            r2.A0N(GJF.COLLAPSED);
        }
    }

    public final /* synthetic */ void D4O(Integer num) {
    }

    public final void Dx6(C61065Jw3 jw3) {
        0qQ.A0B(jw3, 0);
        int i = jw3.A01;
        if (i == 1) {
            A02();
            this.A03 = true;
            A03(true);
            this.A05.A0N(GJF.CLOSED);
            return;
        }
        if (i == 3) {
            this.A05.A0d(true);
        }
        this.A03 = false;
    }

    private final void A00() {
        AnonymousClass3W1 r1 = this.A05;
        if (r1.A1q) {
            r1.A0d(false);
            AnonymousClass1Nd.A00(this.A0A).A00(new C240163Jv(this.A0B, 1sy.A07));
        }
    }

    private final void A01() {
        C52016GBn gBn = this.A0F;
        C52078GDy A022 = C52019GBq.A02(gBn);
        if (A022 != null) {
            C52058GDe A002 = JSx.A00(this.A09, this.A0E);
            JRN A023 = C52016GBn.A02(gBn, A022);
            if ((A023 == null || !A023.CeZ()) && A002.A0J == null && !A002.A0Y) {
                gBn.A0R("resume", false);
            }
        }
    }

    private final void A02() {
        AnonymousClass3W1 r1 = this.A05;
        if (r1.A1r) {
            r1.A1r = false;
        }
        A00();
        if (r1.A1p) {
            r1.A1p = false;
        }
        this.A0E.Cs9(this.A0B);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.182.A06(X.0Tu.A06, r5.A0A, 36321584941442614L) != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03(boolean r6) {
        /*
            r5 = this;
            android.view.View r4 = r5.A08
            if (r4 == 0) goto L_0x0047
            com.instagram.common.session.UserSession r3 = r5.A0A
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321584941442614(0x810a4a001d2636, double:3.033254800027047E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0047
        L_0x0013:
            r1 = 300(0x12c, double:1.48E-321)
            r3 = 0
            int r0 = r4.getVisibility()
            if (r6 == 0) goto L_0x0032
            if (r0 == 0) goto L_0x0031
            r4.setAlpha(r3)
            r0 = 0
            r4.setVisibility(r0)
            android.view.ViewPropertyAnimator r0 = X.DbY.A0G(r4)
            android.view.ViewPropertyAnimator r2 = r0.setDuration(r1)
            r1 = 0
        L_0x002e:
            r2.setListener(r1)
        L_0x0031:
            return
        L_0x0032:
            if (r0 != 0) goto L_0x0031
            android.view.ViewPropertyAnimator r0 = r4.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            android.view.ViewPropertyAnimator r2 = r0.setDuration(r1)
            r0 = 6
            X.GcS r1 = new X.GcS
            r1.<init>(r4, r0)
            goto L_0x002e
        L_0x0047:
            android.view.View r4 = r5.A07
            if (r4 == 0) goto L_0x0031
            com.instagram.common.session.UserSession r3 = r5.A0A
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321584941311540(0x810a4a001b2634, double:3.033254799944155E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57401Ia7.A03(boolean):void");
    }

    public final void Cv6(float f) {
        UserSession userSession = this.A0A;
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36321584940394027L)) {
            this.A0G.A0E();
        }
        if (!this.A01) {
            this.A01 = true;
        } else {
            AnonymousClass3W1 r1 = this.A05;
            if (r1.A1r) {
                r1.A1r = false;
            }
            this.A0E.Cs9(this.A0B);
            if (182.A06(r2, userSession, 36321584939935271L)) {
                A01();
            }
        }
        this.A05.A0N(GJF.ANCHORED);
    }

    public final void D9d() {
        if (!this.A03) {
            A02();
        }
        UserSession userSession = this.A0A;
        if (!182.A06(0Tu.A06, userSession, 36321584939738661L)) {
            this.A0G.A0F();
        }
        C52058GDe A002 = JSx.A00(this.A09, this.A0E);
        if (A002.A0J == null && !A002.A0Y) {
            this.A0F.A0R("resume", false);
        }
        this.A05.A0N(GJF.CLOSED);
        S6e s6e = this.A0D;
        if (s6e != null) {
            s6e.A02("secondary_cta", "dismiss", "interaction_tap");
        }
        2db.A01 = false;
        A03(true);
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(this.A06);
        if (A012 != null) {
            AnonymousClass37F r2 = (AnonymousClass37F) A012;
            C71392co r1 = AnonymousClass37F.A18;
            r2.A0A = r1;
            r2.A0t.A09(r1);
            C7218Pzn pzn = r2.A0D;
            if (pzn != null) {
                pzn.A0V.A09(r1);
            }
        }
        AnonymousClass5Gv r0 = this.A0C;
        if (r0 != null) {
            r0.A07(userSession);
        }
    }

    public final void DHB(Integer num) {
        AnonymousClass3W1 r1;
        GJF gjf;
        C52016GBn gBn = this.A0F;
        if (C52019GBq.A02(gBn) != null) {
            C52058GDe A002 = JSx.A00(this.A09, this.A0E);
            if (A002.A0J == null && !A002.A0Y) {
                gBn.A0N((C267324bN) null, "caption_and_browse", true, false);
                this.A04 = true;
            }
        }
        if (!182.A06(0Tu.A06, this.A0A, 36321584939935271L)) {
            A02();
            this.A03 = true;
            r1 = this.A05;
            gjf = GJF.EXPANDED;
        } else {
            r1 = this.A05;
            gjf = GJF.COLLAPSED;
        }
        r1.A0N(gjf);
    }

    public final void DYG(int i, int i2) {
        if (!this.A01 || this.A02) {
            if (this.A02 && !this.A03) {
                AnonymousClass3W1 r1 = this.A05;
                if (!r1.A1r) {
                    r1.A1r = true;
                }
                this.A0E.Cs9(this.A0B);
            }
            if (!this.A00 && !this.A01) {
                A03(false);
                this.A00 = true;
            }
            if (this.A04) {
                this.A0F.A0R("resume", false);
                this.A04 = false;
                return;
            }
            return;
        }
        this.A02 = true;
    }

    public C57401Ia7(Activity activity, C267324bN r3, UserSession userSession, 1Xj r5, AnonymousClass3W1 r6, AnonymousClass5Gv r7, S6e s6e, GD6 gd6, C52016GBn gBn, C52012GBj gBj) {
        ViewGroup viewGroup;
        this.A0B = r5;
        this.A05 = r6;
        this.A06 = activity;
        this.A09 = r3;
        this.A0E = gd6;
        this.A0G = gBj;
        this.A0F = gBn;
        this.A0A = userSession;
        this.A0D = s6e;
        this.A0C = r7;
        2dZ A002 = 2dY.A00(activity);
        if (A002 != null) {
            viewGroup = A002.A0O;
        } else {
            viewGroup = null;
        }
        this.A08 = viewGroup;
        this.A07 = activity.findViewById(R.id.action_bar_right_side_buttons_wrapper);
    }
}
