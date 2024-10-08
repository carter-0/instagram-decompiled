package X;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.GHv  reason: case insensitive filesystem */
public final class C52179GHv extends C52050GCw implements JRF, AnonymousClass32U, C246873fN, JQ7 {
    public C61068Jw6 A00;
    public boolean A01;
    public final Context A02;
    public final Handler A03 = AnonymousClass7TF.A0D();
    public final Fragment A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final C52016GBn A07;
    public final Set A08 = DbS.A0y();

    private final void A01(boolean z) {
        1Xj r3;
        C256003v4 r2;
        Object obj;
        boolean z2;
        C267324bN A042;
        boolean z3 = z;
        C52078GDy A022 = C52019GBq.A02(this.A07);
        C52012GBj gBj = this.A02;
        C61068Jw6 jw6 = null;
        if (gBj == null || (A042 = C52012GBj.A04(gBj)) == null) {
            r3 = null;
        } else {
            r3 = A042.A02;
        }
        if (A022 != null) {
            r2 = A022.A0C;
        } else {
            r2 = null;
        }
        C61068Jw6 jw62 = this.A00;
        if (jw62 != null) {
            obj = jw62.A03;
        } else {
            obj = null;
        }
        if (!0qQ.A0K(r3, obj) && r2 != null) {
            C263164Jj.A00(r2);
        }
        if (!(A022 == null || r2 == null || r3 == null)) {
            C61068Jw6 jw63 = this.A00;
            if (jw63 != null) {
                z3 = jw63.A01;
            }
            if (jw63 != null) {
                z2 = jw63.A00;
            } else {
                z2 = false;
            }
            jw6 = new C61068Jw6(r2, r3, A022, z3, z2);
        }
        this.A00 = jw6;
        if (r2 != null) {
            r2.A01 = this;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D7O(X.C267324bN r18, java.util.List r19) {
        /*
            r17 = this;
            r12 = 0
            r5 = r18
            r1 = r19
            boolean r2 = X.AnonymousClass7TF.A1U(r12, r5, r1)
            r3 = r17
            X.Jw6 r0 = r3.A00
            if (r0 != 0) goto L_0x001b
            com.instagram.common.session.UserSession r0 = r3.A06
            X.0qQ.A0B(r0, r12)
            boolean r0 = X.AnonymousClass3WS.A06(r0)
            r3.A01(r0)
        L_0x001b:
            X.Jw6 r0 = r3.A00
            r9 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r0.A04
            X.3v4 r0 = (X.C256003v4) r0
            if (r0 == 0) goto L_0x0051
            X.2eb r0 = r0.A03
            android.view.View r0 = r0.A01()
            if (r0 == 0) goto L_0x0051
            X.Jw6 r0 = r3.A00
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r4 = r0.A03
        L_0x0034:
            X.1Xj r0 = r5.A02
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x0052
            X.0wj r2 = X.0wj.A01
            r1 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r0 = "ClipsVideoSubtitlesCuingMismatch"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = "message"
            java.lang.String r0 = "Cue caught for wrong media id in NON-Litho impl"
            r2.ABQ(r1, r0)
            r2.report()
        L_0x0051:
            return
        L_0x0052:
            X.GBn r0 = r3.A07
            X.4Nf r5 = r0.Auf()
            if (r5 == 0) goto L_0x0051
            X.Jw6 r0 = r3.A00
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r4 = r0.A03
            X.1Xj r4 = (X.1Xj) r4
            if (r4 == 0) goto L_0x00cd
            com.instagram.common.session.UserSession r6 = r3.A06
            boolean r0 = r5.A00
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            boolean r13 = r4.CcK()
            boolean r14 = r4.CeS()
            boolean r15 = r4.A51()
            boolean r16 = r4.A4L()
            java.util.List r11 = X.C51965G9l.A0w(r4)
            X.3WR r7 = r4.CEL()
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r4)
            if (r0 == 0) goto L_0x008e
            java.lang.String r9 = r0.getId()
        L_0x008e:
            java.lang.String r10 = X.C51966G9m.A1D(r4)
            boolean r0 = X.AnonymousClass3WP.A09(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r0 != r2) goto L_0x00cd
            r6 = 1
            X.Jw6 r0 = r3.A00
            if (r0 == 0) goto L_0x009f
            r0.A00 = r12
        L_0x009f:
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x00bf
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x00bf
            r5 = 91
            android.content.Context r4 = r3.A02
            r0 = 2131954771(0x7f130c53, float:1.954605E38)
            java.lang.String r4 = r4.getString(r0)
            r0 = 93
            java.lang.String r0 = X.002.A0E(r4, r5, r0)
            r1.add(r12, r0)
            r3.A01 = r2
        L_0x00bf:
            X.Jw6 r0 = r3.A00
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r0.A04
            X.3v4 r0 = (X.C256003v4) r0
            if (r0 == 0) goto L_0x0051
            X.C263164Jj.A02(r0, r1, r6)
            return
        L_0x00cd:
            r6 = 0
            goto L_0x00bf
        L_0x00cf:
            r4 = r9
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52179GHv.D7O(X.4bN, java.util.List):void");
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final /* synthetic */ void DhU(Integer num) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public final void Dxm(C267324bN r3, Integer num, int i) {
        this.A01 = false;
        UserSession userSession = this.A06;
        0qQ.A0B(userSession, 0);
        A01(AnonymousClass3WS.A06(userSession));
        C61068Jw6 jw6 = this.A00;
        if (jw6 != null) {
            jw6.A00 = false;
        }
    }

    public final void EDt(C52177GHt gHt) {
        0qQ.A0B(gHt, 0);
        this.A08.remove(gHt);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (X.AnonymousClass3WS.A0D(r7) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
        r6 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C61068Jw6 r13, X.C61079JwH r14, X.C52179GHv r15, boolean r16) {
        /*
            java.lang.Object r3 = r14.A01
            X.2V1 r3 = (X.2V1) r3
            java.lang.Object r5 = r14.A00
            X.2VW r5 = (X.AnonymousClass2VW) r5
            if (r3 == 0) goto L_0x00de
            if (r5 == 0) goto L_0x00de
            r0 = -2
            android.widget.PopupWindow r2 = new android.widget.PopupWindow
            r2.<init>(r0, r0)
            r0 = 1
            r2.setFocusable(r0)
            android.content.Context r6 = r15.A02
            java.lang.Object r7 = r13.A03
            X.1Xj r7 = (X.1Xj) r7
            java.util.List r0 = X.C51965G9l.A0w(r7)
            if (r0 == 0) goto L_0x0028
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != 0) goto L_0x0035
        L_0x0028:
            boolean r0 = X.AnonymousClass3WS.A0C(r7)
            if (r0 != 0) goto L_0x0035
            boolean r0 = X.AnonymousClass3WS.A0D(r7)
            r11 = 0
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            r11 = 1
        L_0x0036:
            boolean r12 = r13.A01
            r0 = 15
            X.J6Q r9 = X.J6Q.A00(r2, r15, r0)
            r0 = 7
            X.Iny r8 = new X.Iny
            r8.<init>(r0, r13, r15, r2)
            r0 = 16
            X.J6Q r10 = X.J6Q.A00(r13, r15, r0)
            java.lang.String r4 = r14.A02
            com.instagram.common.session.UserSession r1 = r15.A06
            java.lang.String r0 = X.C51966G9m.A1D(r7)
            java.lang.String r0 = X.AnonymousClass3WS.A00(r1, r0)
            boolean r13 = X.C51966G9m.A1a(r4, r0)
            X.Gw5 r7 = new X.Gw5
            r14 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            com.facebook.litho.LithoView r0 = com.facebook.litho.LithoView.A00(r6, r7)
            r2.setContentView(r0)
            android.content.Context r0 = r3.A0C
            android.content.res.Resources r1 = X.AnonymousClass7TF.A0A(r0)
            r0 = 2131165377(0x7f0700c1, float:1.794497E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r7 = -r0
            r0 = 2131165217(0x7f070021, float:1.7944645E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r7 = r7 - r0
            X.2Sn r0 = r5.A00
            if (r0 == 0) goto L_0x00ca
            android.view.View r6 = r0.BUI()
            if (r6 == 0) goto L_0x00ca
            boolean r0 = r6 instanceof com.facebook.litho.LithoView
            if (r0 == 0) goto L_0x00ca
            com.facebook.litho.LithoView r6 = (com.facebook.litho.LithoView) r6
            X.2T4 r0 = r6.getMountedLayoutState()
            if (r0 == 0) goto L_0x00ca
            r1 = 0
            X.AnonymousClass2VL.A00()
            java.util.Map r0 = r0.A0T
            java.lang.Object r4 = r0.get(r5)
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            if (r4 != 0) goto L_0x00df
            X.3mp r0 = r3.A01
            if (r0 == 0) goto L_0x00ac
            java.lang.String r4 = r0.A0J()
            if (r4 != 0) goto L_0x00ae
        L_0x00ac:
            java.lang.String r4 = "null"
        L_0x00ae:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Cannot find a component with handle "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " to use as anchor.\nComponent: "
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r4, r1)
            java.lang.String r0 = "LithoTooltipController:InvalidHandle"
            X.2W6.A01(r0, r3, r1)
        L_0x00ca:
            boolean r0 = r2.isShowing()
            if (r0 == 0) goto L_0x00de
            android.view.View r4 = r2.getContentView()
            X.IgN r3 = new X.IgN
            r3.<init>(r2)
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.postDelayed(r3, r0)
        L_0x00de:
            return
        L_0x00df:
            android.view.View r0 = r2.getContentView()
            r0.measure(r1, r1)
            int r3 = r4.left
            int r1 = r4.width()
            android.view.View r0 = r2.getContentView()
            int r0 = r0.getMeasuredWidth()
            int r1 = r1 - r0
            int r0 = r1 / 2
            int r3 = r3 + r0
            int r1 = r4.top
            android.view.View r0 = r2.getContentView()
            int r0 = r0.getMeasuredHeight()
            int r1 = r1 - r0
            int r1 = r1 + r7
            r2.showAsDropDown(r6, r3, r1)
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52179GHv.A00(X.Jw6, X.JwH, X.GHv, boolean):void");
    }

    public final void A0C(boolean z) {
        String str;
        C61068Jw6 jw6 = this.A00;
        if (jw6 != null && jw6.A01 != z) {
            jw6.A01 = z;
            if (!jw6.A00) {
                C52016GBn gBn = this.A07;
                if (z) {
                    str = AnonymousClass3WS.A00(this.A06, C51966G9m.A1D((1Xj) jw6.A03));
                } else {
                    str = null;
                }
                gBn.A0U(true, str);
            }
        }
    }

    public final void A93(C52177GHt gHt) {
        this.A08.add(gHt);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        if (X.AnonymousClass3WS.A0D(r5) != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DQq(X.C61079JwH r18) {
        /*
            r17 = this;
            r0 = r17
            X.Jw6 r1 = r0.A00
            if (r1 == 0) goto L_0x005d
            r4 = r18
            if (r18 == 0) goto L_0x0039
            X.0iw r6 = r0.A05
            com.instagram.common.session.UserSession r7 = r0.A06
            java.lang.Object r8 = r1.A03
            X.1Xj r8 = (X.1Xj) r8
            X.GKd r5 = X.C52236GKd.A0R
            java.lang.String r2 = X.C51966G9m.A1D(r8)
            java.lang.String r9 = X.AnonymousClass3WP.A01(r2)
            boolean r2 = r1.A01
            if (r2 == 0) goto L_0x0111
            java.lang.Object r2 = r1.A03
            X.1Xj r2 = (X.1Xj) r2
            java.lang.String r10 = X.AnonymousClass3WP.A00(r7, r2)
        L_0x0028:
            boolean r11 = r1.A01
            r2 = 0
            X.0qQ.A0B(r7, r2)
            boolean r12 = X.AnonymousClass3WS.A06(r7)
            boolean r13 = X.AnonymousClass3WP.A07(r7)
            X.C52086GEg.A0B(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0039:
            com.instagram.common.session.UserSession r9 = r0.A06
            r12 = 0
            X.0Tu r5 = X.DbS.A0J(r9, r12)
            r2 = 36322920674437800(0x810b8100012aa8, double:3.0340995229517677E-306)
            boolean r2 = X.182.A06(r5, r9, r2)
            if (r2 == 0) goto L_0x005e
            if (r18 == 0) goto L_0x005e
            boolean r2 = X.AnonymousClass3WP.A05(r9)
            if (r2 != 0) goto L_0x005e
            android.os.Handler r3 = r0.A03
            X.Iil r2 = new X.Iil
            r2.<init>(r1, r4, r0)
            r3.post(r2)
        L_0x005d:
            return
        L_0x005e:
            X.GBn r3 = r0.A07
            r4 = 0
            java.lang.String r2 = "fragment_paused"
            r13 = 1
            r3.A0N(r4, r2, r12, r13)
            android.content.Context r6 = r0.A02
            java.lang.Object r5 = r1.A03
            X.1Xj r5 = (X.1Xj) r5
            X.2R8.A02(r9, r5)
            androidx.fragment.app.Fragment r3 = r0.A04
            java.lang.String r11 = r5.A2n()
            java.util.List r2 = X.C51965G9l.A0w(r5)
            if (r2 == 0) goto L_0x010e
            boolean r14 = X.AnonymousClass7TE.A1b(r2)
        L_0x0080:
            boolean r2 = X.AnonymousClass3WS.A0C(r5)
            if (r2 != 0) goto L_0x008d
            boolean r2 = X.AnonymousClass3WS.A0D(r5)
            r15 = 0
            if (r2 == 0) goto L_0x008e
        L_0x008d:
            r15 = 1
        L_0x008e:
            X.3WR r5 = r5.CEL()
            java.util.Locale r2 = X.AnonymousClass1Q2.A02()
            java.lang.String r2 = r2.getLanguage()
            X.0qQ.A07(r2)
            boolean r16 = r5.A09(r2)
            X.I9G r2 = new X.I9G
            r2.<init>(r13, r1, r0)
            r0 = 425(0x1a9, float:5.96E-43)
            java.lang.String r10 = X.C273654mx.A00(r0)
            X.0qQ.A0B(r6, r12)
            boolean r0 = X.AnonymousClass3WP.A05(r9)
            r8 = 0
            if (r0 == 0) goto L_0x0109
            X.E2R r7 = X.C48763Ejm.A00(r12)
        L_0x00ba:
            boolean r0 = X.AnonymousClass3WS.A04(r9)
            if (r0 != 0) goto L_0x00c6
            boolean r0 = X.AnonymousClass3WS.A02(r9)
            if (r0 == 0) goto L_0x00c7
        L_0x00c6:
            r8 = 1
        L_0x00c7:
            X.7Pr r5 = X.DbS.A0W(r9)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131954758(0x7f130c46, float:1.9546024E38)
            if (r8 == 0) goto L_0x00d7
            r0 = 2131954760(0x7f130c48, float:1.9546028E38)
        L_0x00d7:
            java.lang.String r0 = r1.getString(r0)
            r5.A0d = r0
            X.7Pu r5 = r5.A00()
            java.lang.String r1 = "video_overflow_menu"
            r0 = 56
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.FCT.A01(r4, r9, r1, r0, r4)
            if (r3 == 0) goto L_0x005d
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x005d
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            r5.A02(r0, r7)
            X.37D r1 = X.DbT.A0i(r0)
            if (r1 == 0) goto L_0x005d
            X.IZx r0 = new X.IZx
            r0.<init>(r2)
            X.37F r1 = (X.AnonymousClass37F) r1
            r1.A0H = r0
            return
        L_0x0109:
            X.ES1 r7 = X.C48762Ejl.A00(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00ba
        L_0x010e:
            r14 = 0
            goto L_0x0080
        L_0x0111:
            java.lang.String r10 = ""
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52179GHv.DQq(X.JwH):void");
    }

    public final void DVz(int i) {
        C61068Jw6 jw6;
        C256003v4 r0;
        if (182.A06(0Tu.A05, this.A06, 36318226275309575L) && (jw6 = this.A00) != null && (r0 = (C256003v4) jw6.A04) != null) {
            C263164Jj.A00(r0);
        }
    }

    public final void DW8(int i, int i2) {
        C61068Jw6 jw6;
        1Xj r0;
        C61068Jw6 jw62;
        C256003v4 r02;
        if (182.A06(0Tu.A05, this.A06, 36318226275375112L) && (jw6 = this.A00) != null && (r0 = (1Xj) jw6.A03) != null && !r0.A51() && (jw62 = this.A00) != null && (r02 = (C256003v4) jw62.A04) != null) {
            C263164Jj.A00(r02);
        }
    }

    public final void Dzs() {
    }

    public C52179GHv(Context context, Fragment fragment, AnonymousClass0iw r4, UserSession userSession, C52016GBn gBn) {
        this.A02 = context;
        this.A04 = fragment;
        this.A06 = userSession;
        this.A05 = r4;
        this.A07 = gBn;
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void DxZ(C267324bN r1, int i, int i2) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void DaS(C267324bN r1, int i, int i2, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
