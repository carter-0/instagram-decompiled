package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.348  reason: invalid class name */
public final class AnonymousClass348 extends C252233om {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass349 A03 = new AnonymousClass349(this);
    public final C231292rN A04;
    public final 0MB A05;
    public final C249763kK A06;
    public final 1Ng A07;
    public final 1wn A08 = new AnonymousClass34F(this);
    public final 1wn A09 = new AnonymousClass34B(this);
    public final 1wn A0A = new AnonymousClass34C(this);
    public final 1wn A0B = new AnonymousClass34G(this);
    public final 1wn A0C = new AnonymousClass34D(this);
    public final 1wn A0D = new AnonymousClass34H(this);
    public final 1wn A0E = new AnonymousClass34E(this);
    public final C228232l0 A0F;
    public final C228232l0 A0G;

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.1Xj r18, X.AnonymousClass348 r19, X.1sy r20, X.AnonymousClass34A r21, com.instagram.search.common.analytics.SearchContext r22, java.lang.Boolean r23, java.lang.Integer r24, java.util.HashMap r25) {
        /*
            X.1sy r6 = X.1sy.A07
            r4 = r19
            r7 = r20
            if (r7 != r6) goto L_0x001f
            com.instagram.common.session.UserSession r0 = r4.A01
            X.JU5 r5 = X.C63289KuY.A00(r0)
            X.4Cq r3 = r5.A0N
            r1 = 0
            r0 = 49
            X.MGs r2 = new X.MGs
            r2.<init>(r5, r1, r0)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r2, r3)
        L_0x001f:
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r9 = 0
            r0 = 0
            r8 = r24
            if (r8 != r5) goto L_0x0028
            r0 = 1
        L_0x0028:
            r11 = r18
            r1 = r21
            r1.D0l(r11, r0)
            X.2rN r0 = r4.A04
            X.3W1 r3 = r0.BQr(r11)
            if (r3 == 0) goto L_0x013b
            com.instagram.common.session.UserSession r10 = r4.A01
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321584941377077(0x810a4a001c2635, double:3.033254799985601E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x004f
            if (r7 != r6) goto L_0x004f
            boolean r0 = r11.CcK()
            if (r0 == 0) goto L_0x004f
            r9 = 1
        L_0x004f:
            if (r8 != r5) goto L_0x015a
            java.lang.String r19 = "caption_more_click"
        L_0x0053:
            java.lang.String r0 = r11.getId()
            r14 = 0
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = r11.getId()
            java.lang.Long r1 = X.C271444ir.A01(r0)
        L_0x0062:
            X.4DU r12 = r4.A02
            int r9 = r3.A03
            boolean r0 = r3.A0p()
            if (r0 == 0) goto L_0x0154
            int r0 = r3.getPosition()
        L_0x0070:
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r15 = r3.A0y
            if (r1 == 0) goto L_0x0150
            double r0 = r1.doubleValue()
            java.lang.Double r16 = java.lang.Double.valueOf(r0)
        L_0x0080:
            if (r7 != r6) goto L_0x014d
            boolean r0 = r11.CcK()
            if (r0 == 0) goto L_0x014d
            r0 = 36321584939542052(0x810a4a00002624, double:3.033254798825124E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x014d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.1Xy r0 = r11.A0C
            X.4xI r0 = r0.Aq4()
            if (r0 == 0) goto L_0x014d
            X.1Xy r0 = r11.A0C
            X.4xI r0 = r0.Aq4()
            java.util.List r0 = r0.AiA()
            if (r0 == 0) goto L_0x014d
            java.util.Iterator r7 = r0.iterator()
        L_0x00b0:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x014d
            java.lang.Object r0 = r7.next()
            X.4xG r0 = (X.C278624xG) r0
            com.instagram.api.schemas.IGConsiderAndBrowseType r6 = r0.CGB()
            com.instagram.api.schemas.IGConsiderAndBrowseType r0 = com.instagram.api.schemas.IGConsiderAndBrowseType.REELS_TAP_ON_CAPTION_AND_BROWSE
            if (r6 != r0) goto L_0x00b0
            r0 = 4572(0x11dc, float:6.407E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.add(r0)
        L_0x00cd:
            X.3kK r0 = r4.A06
            if (r0 == 0) goto L_0x014a
            java.lang.String r21 = r0.getSessionId()
        L_0x00d5:
            r13 = r22
            r23 = r25
            r18 = r14
            r20 = r14
            r22 = r1
            r24 = r9
            X.C233822wX.A0P(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            if (r8 != r5) goto L_0x013b
            X.2l0 r5 = r4.A0F
            if (r5 == 0) goto L_0x013c
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r0 = 36319239888313382(0x810828000e1c26, double:3.0317717789853496E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x013c
            X.5o3 r0 = X.C267324bN.A0d
            X.4bN r4 = r0.A04(r11)
            X.2v9 r2 = X.C233162v9.CAPTION_CLICK
            X.1se r0 = X.1sd.A00(r10)
            X.GDe r1 = X.C52057GDd.A01(r4, r10, r0, r14, r14)
            X.5yf r0 = X.C301155ye.A00()
            r5.DUE(r0, r2, r4, r1)
        L_0x0110:
            X.32g r1 = X.C2360432f.A00(r10)
            int r0 = r3.A02
            boolean r0 = X.C253933re.A00(r11, r0)
            if (r0 == 0) goto L_0x013b
            boolean r0 = r1.A02(r11, r3)
            if (r0 != 0) goto L_0x013b
            com.instagram.common.session.UserSession r4 = r1.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342159079416270751(0x2081054600100f9f, double:4.062253745377868E-152)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x013b
            X.C292885jg.A00(r10)
            X.C292905ji.A00(r10, r11, r12, r3)
            r0 = 1
            r3.A0m(r0, r0)
        L_0x013b:
            return
        L_0x013c:
            X.2l0 r2 = r4.A0G
            if (r2 == 0) goto L_0x0110
            X.2v9 r1 = X.C233162v9.CAPTION_CLICK
            X.5yf r0 = X.C301155ye.A00()
            r2.DUE(r0, r1, r11, r3)
            goto L_0x0110
        L_0x014a:
            r21 = r14
            goto L_0x00d5
        L_0x014d:
            r1 = r14
            goto L_0x00cd
        L_0x0150:
            r16 = r14
            goto L_0x0080
        L_0x0154:
            r0 = -1
            goto L_0x0070
        L_0x0157:
            r1 = r14
            goto L_0x0062
        L_0x015a:
            if (r9 == 0) goto L_0x0160
            java.lang.String r19 = "caption_dismiss"
            goto L_0x0053
        L_0x0160:
            boolean r0 = r23.booleanValue()
            if (r0 == 0) goto L_0x016a
            java.lang.String r19 = "caption_less_scroll"
            goto L_0x0053
        L_0x016a:
            r0 = 1159(0x487, float:1.624E-42)
            java.lang.String r19 = X.AnonymousClass000.A00(r0)
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass348.A00(X.1Xj, X.348, X.1sy, X.34A, com.instagram.search.common.analytics.SearchContext, java.lang.Boolean, java.lang.Integer, java.util.HashMap):void");
    }

    public final void onPause() {
        1Ng r4 = this.A07;
        r4.A02(this.A0A, C240153Ju.class);
        r4.A02(this.A09, C240163Jv.class);
        Class<C240173Jw> cls = C240173Jw.class;
        1wn r2 = this.A08;
        r4.A02(r2, cls);
        r4.A02(this.A0E, C240183Jx.class);
        r4.A02(r2, cls);
        r4.A02(this.A0B, C240193Jy.class);
        r4.A02(this.A0D, C240203Jz.class);
        r4.A02(this.A0C, AnonymousClass3K0.class);
    }

    public final void onResume() {
        1Ng r4 = this.A07;
        r4.A01(this.A0A, C240153Ju.class);
        r4.A01(this.A09, C240163Jv.class);
        Class<C240173Jw> cls = C240173Jw.class;
        1wn r2 = this.A08;
        r4.A01(r2, cls);
        r4.A01(this.A0E, C240183Jx.class);
        r4.A01(r2, cls);
        r4.A01(this.A0B, C240193Jy.class);
        r4.A01(this.A0D, C240203Jz.class);
        r4.A01(this.A0C, AnonymousClass3K0.class);
    }

    public AnonymousClass348(Fragment fragment, UserSession userSession, AnonymousClass4DU r4, C231292rN r5, 0MB r6, C228232l0 r7, C228232l0 r8, C249763kK r9) {
        this.A01 = userSession;
        this.A07 = AnonymousClass1Nd.A00(userSession);
        this.A04 = r5;
        this.A00 = fragment;
        this.A02 = r4;
        this.A05 = r6;
        this.A06 = r9;
        this.A0G = r7;
        this.A0F = r8;
    }
}
