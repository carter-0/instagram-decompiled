package X;

import java.util.List;

public final class J6T extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6T(int i, List list, 0sP r4) {
        super(1);
        this.A00 = i;
        switch (i) {
            case 16:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                this.A02 = r4;
                this.A01 = list;
                break;
            default:
                this.A01 = r4;
                this.A02 = list;
                break;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v164, types: [X.LhL, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x08dd, code lost:
        if (X.182.A06(X.0Tu.A05, X.C56316HwT.A00(r4.A01), 36328998053560019L) != false) goto L_0x08b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0947, code lost:
        if (r18 == null) goto L_0x0976;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0962, code lost:
        r0 = r3.A00;
        X.0qQ.A06(r0);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0971, code lost:
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0973, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0978, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017a, code lost:
        r1 = r1.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017e, code lost:
        if (r1 == null) goto L_0x0976;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0180, code lost:
        ((X.C53877Gvi) r2.A02).A08.invoke(r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x080a  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x08a5  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x08ae  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x08be  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x08c8  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x08e2  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x08fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r18) {
        /*
            r17 = this;
            r5 = r18
            r2 = r17
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0095;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00e3;
                case 4: goto L_0x015e;
                case 5: goto L_0x0172;
                case 6: goto L_0x0169;
                case 7: goto L_0x094a;
                case 8: goto L_0x094a;
                case 9: goto L_0x01b9;
                case 10: goto L_0x0197;
                case 11: goto L_0x01c1;
                case 12: goto L_0x01d9;
                case 13: goto L_0x01d9;
                case 14: goto L_0x0237;
                case 15: goto L_0x024b;
                case 16: goto L_0x0009;
                case 17: goto L_0x0264;
                case 18: goto L_0x0277;
                case 19: goto L_0x040b;
                case 20: goto L_0x0537;
                case 21: goto L_0x05d8;
                case 22: goto L_0x061c;
                case 23: goto L_0x0009;
                case 24: goto L_0x0009;
                case 25: goto L_0x0009;
                case 26: goto L_0x0009;
                case 27: goto L_0x0009;
                case 28: goto L_0x0264;
                case 29: goto L_0x0652;
                case 30: goto L_0x0680;
                case 31: goto L_0x069b;
                case 32: goto L_0x06b0;
                case 33: goto L_0x06d3;
                case 34: goto L_0x06f5;
                case 35: goto L_0x0746;
                case 36: goto L_0x0783;
                case 37: goto L_0x0792;
                case 38: goto L_0x080e;
                case 39: goto L_0x081f;
                case 40: goto L_0x0868;
                case 41: goto L_0x087d;
                case 42: goto L_0x0904;
                case 43: goto L_0x0934;
                case 44: goto L_0x096b;
                case 45: goto L_0x01b1;
                case 46: goto L_0x018b;
                case 47: goto L_0x001c;
                case 48: goto L_0x0979;
                case 49: goto L_0x0982;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r3 = X.AnonymousClass7TE.A0M(r5)
            java.lang.Object r1 = r2.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r2.A01
            java.lang.Object r0 = X.C51966G9m.A19(r0, r3)
            java.lang.Object r5 = r1.invoke(r0)
            return r5
        L_0x001c:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 >= r0) goto L_0x0030
            java.lang.Object r3 = r2.A01
            X.Hpr r3 = (X.C55929Hpr) r3
            int r1 = r3.A00
            r0 = 0
            if (r1 == r0) goto L_0x0030
            r3.A00()
            goto L_0x0976
        L_0x0030:
            java.lang.Object r0 = r2.A02
            X.GtY r0 = (X.C53743GtY) r0
            X.0sP r1 = r0.A01
            if (r1 == 0) goto L_0x0976
            X.Hsu r0 = r0.A00
            goto L_0x0973
        L_0x003c:
            boolean r0 = X.AnonymousClass7TE.A1a(r5)
            if (r0 == 0) goto L_0x0976
            java.lang.Object r8 = r2.A01
            android.content.Context r8 = (android.content.Context) r8
            r7 = 0
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            r4 = 0
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>(r4)
            java.lang.Object r3 = r2.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.DbS.A0N(r3)
            java.util.HashMap r1 = X.C359608dC.A01(r1)
            java.lang.String r0 = "com.bloks.www.ugc.auto_approve.nudge_bottomsheet"
            X.DiU r1 = X.C46649DiU.A06(r0, r1, r6)
            r0 = 719983200(0x2aea1260, float:4.15795E-13)
            X.C46649DiU.A0B(r1, r0)
            r1.A03 = r7
            r1.A02 = r7
            r1.A04 = r7
            r1.A0H(r5)
            r1.A0E(r8, r2)
            X.0qQ.A0B(r3, r4)
            X.W3U r0 = X.W3U.A00
            X.0xa r0 = X.W3U.A02(r3, r0)
            X.0xY r1 = r0.AR4()
            r0 = 3235(0xca3, float:4.533E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DbW.A1L(r1, r0)
            goto L_0x0976
        L_0x0095:
            java.lang.Object r1 = r2.A02
            X.LQV r1 = (X.LQV) r1
            java.lang.Object r3 = r2.A01
            X.JuT r3 = (X.C60971JuT) r3
            java.lang.Integer r0 = r3.A02
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x00b1;
                case 2: goto L_0x00b1;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            X.LM8 r2 = r1.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.MCA r5 = X.LM8.A00(r2, r3, r1, r0)
            return r5
        L_0x00b1:
            X.0gF r2 = X.C60340gF.A00
            r1 = 0
            X.JTj r0 = new X.JTj
            r0.<init>(r2, r1)
            X.0rr r5 = new X.0rr
            r5.<init>(r0)
            return r5
        L_0x00bf:
            java.lang.Object r0 = r2.A02
            X.LQV r0 = (X.LQV) r0
            java.lang.Object r3 = r2.A01
            X.JuT r3 = (X.C60971JuT) r3
            X.LM8 r2 = r0.A01
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.Integer r0 = r3.A02
            int r0 = r0.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x00e0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x00db:
            X.MCA r5 = X.LM8.A00(r2, r3, r1, r0)
            return r5
        L_0x00e0:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x00db
        L_0x00e3:
            X.Jv4 r5 = (X.Jv4) r5
            r7 = 0
            X.0qQ.A0B(r5, r7)
            java.lang.Object r0 = r2.A02
            X.JTj r0 = (X.C59678JTj) r0
            java.lang.Object r0 = r0.A01
            X.JwL r0 = (X.C61083JwL) r0
            java.lang.Object r6 = r0.A00
            X.CGL r6 = (X.CGL) r6
            java.lang.Object r0 = r2.A01
            X.JuT r0 = (X.C60971JuT) r0
            boolean r0 = r0.A0A
            r4 = 1
            X.0qQ.A0B(r6, r4)
            if (r0 == 0) goto L_0x0120
            java.util.List r2 = r6.A01
            if (r2 != 0) goto L_0x0107
            X.0sn r2 = X.0sn.A00
        L_0x0107:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x011d
            java.lang.String r1 = r6.A00
            X.KZq r0 = new X.KZq
            r0.<init>(r1)
        L_0x0114:
            com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint r3 = r5.A01
            java.util.List r1 = r5.A04
            X.Jv4 r5 = X.Jv4.A00(r0, r3, r4, r1, r2)
            return r5
        L_0x011d:
            X.HER r0 = X.HER.A00
            goto L_0x0114
        L_0x0120:
            java.util.List r3 = r5.A03
            java.util.List r2 = r6.A01
            if (r2 != 0) goto L_0x0128
            X.0sn r2 = X.0sn.A00
        L_0x0128:
            X.0qQ.A0B(r3, r7)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0107
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x015c
            java.lang.Object r1 = X.00k.A0K(r3)
            X.JwH r1 = (X.C61079JwH) r1
            java.lang.Object r0 = X.00k.A0I(r2)
            X.JwH r0 = (X.C61079JwH) r0
            java.lang.Object r1 = r1.A01
            java.lang.Object r0 = r0.A01
            X.KhY r0 = (X.C62542KhY) r0
            if (r1 != r0) goto L_0x0158
            int r0 = X.DbU.A02(r0, r7)
            if (r0 == r7) goto L_0x0158
            if (r0 == r4) goto L_0x0158
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0158:
            java.util.ArrayList r3 = X.00k.A0S(r2, r3)
        L_0x015c:
            r2 = r3
            goto L_0x0107
        L_0x015e:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r0 = r2.A01
            X.C51965G9l.A1W(r0, r5)
            goto L_0x0976
        L_0x0169:
            java.lang.Object r0 = r2.A01
            X.2Wb r0 = (X.2Wb) r0
            X.2V1 r1 = r0.A00
            java.lang.String r0 = "reels_clips_end_scene_continue_watching_text"
            goto L_0x017a
        L_0x0172:
            java.lang.Object r0 = r2.A01
            X.2Wb r0 = (X.2Wb) r0
            X.2V1 r1 = r0.A00
            java.lang.String r0 = "reels_clips_end_scene_close_button"
        L_0x017a:
            android.view.View r1 = r1.A03(r0)
            if (r1 == 0) goto L_0x0976
            java.lang.Object r0 = r2.A02
            X.Gvi r0 = (X.C53877Gvi) r0
            X.0sP r0 = r0.A08
            r0.invoke(r1)
            goto L_0x0976
        L_0x018b:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r1 = r2.A02
            X.0sL r1 = (X.0sL) r1
            java.lang.Object r0 = r2.A01
            goto L_0x0967
        L_0x0197:
            X.2WA r3 = X.G9w.A0R(r5)
            java.lang.Object r0 = r2.A01
            X.2Wa r0 = (X.2Wa) r0
            java.lang.Object r5 = r0.A03
            java.lang.String r5 = (java.lang.String) r5
            boolean r0 = X.C51966G9m.A1X(r5)
            if (r0 == 0) goto L_0x0976
            java.lang.Object r0 = r2.A02
            X.GsB r0 = (X.C53658GsB) r0
            X.0sL r1 = r0.A01
            goto L_0x0962
        L_0x01b1:
            java.lang.Object r0 = r2.A02
            X.GwM r0 = (X.C53916GwM) r0
            X.0sP r1 = r0.A08
            goto L_0x0971
        L_0x01b9:
            java.lang.Object r0 = r2.A02
            X.Gu1 r0 = (X.C53772Gu1) r0
            X.0sP r1 = r0.A02
            goto L_0x0971
        L_0x01c1:
            java.lang.Object r1 = r2.A02
            X.Myb r1 = (X.C68009Myb) r1
            com.instagram.model.direct.DirectSearchPrompt r3 = r1.A01
            if (r3 == 0) goto L_0x0976
            java.lang.Object r0 = r2.A01
            X.O7R r0 = (X.O7R) r0
            if (r0 == 0) goto L_0x0976
            int r2 = r1.A00
            X.OsH r1 = r0.A00
            r0 = 1
            X.C71874OsH.A00(r1, r3, r2, r0)
            goto L_0x0976
        L_0x01d9:
            java.lang.Object r1 = r2.A01
            X.V2e r1 = (X.C16701V2e) r1
            boolean r0 = r1 instanceof X.C16346UtL
            if (r0 == 0) goto L_0x0976
            java.lang.Object r0 = r2.A02
            X.UbS r0 = (X.C15374UbS) r0
            X.1Xj r4 = X.C15374UbS.A00(r0)
            if (r4 == 0) goto L_0x0976
            X.UtL r1 = (X.C16346UtL) r1
            X.UtO r3 = r1.A00
            X.UtK r5 = r3.A00
            com.instagram.common.session.UserSession r0 = r5.A01
            java.lang.String r1 = r0.A06
            com.instagram.user.model.User r0 = r4.A2A(r0)
            java.lang.String r0 = X.C51968G9o.A15(r0)
            boolean r2 = X.0qQ.A0K(r1, r0)
            com.instagram.user.model.UpcomingEventLiveMetadata r1 = r3.A01
            java.lang.String r0 = r1.Ai3()
            if (r0 == 0) goto L_0x0213
            X.Iah r0 = new X.Iah
            r0.<init>()
            r3.A02(r4, r0)
            goto L_0x0976
        L_0x0213:
            java.lang.String r0 = r1.BeF()
            if (r0 == 0) goto L_0x021e
            r3.A00(r4)
            goto L_0x0976
        L_0x021e:
            if (r2 == 0) goto L_0x0976
            com.instagram.user.model.UpcomingEvent r2 = r5.A00
            boolean r0 = X.C18810W3l.A08(r2)
            if (r0 == 0) goto L_0x0976
            long r0 = java.lang.System.currentTimeMillis()
            boolean r0 = X.C18810W3l.A0D(r2, r0)
            if (r0 != 0) goto L_0x0976
            r3.A01(r4)
            goto L_0x0976
        L_0x0237:
            java.lang.Object r5 = r2.A02
            X.ViN r5 = (X.C17932ViN) r5
            X.0xx r4 = r5.A01
            java.lang.Object r3 = r2.A01
            r2 = 0
            r1 = 7
            X.MGD r0 = new X.MGD
            r0.<init>(r3, r5, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r4)
            goto L_0x0976
        L_0x024b:
            int r1 = X.AnonymousClass7TE.A0M(r5)
            java.lang.Object r0 = r2.A01
            X.5Tq r0 = (X.C286025Tq) r0
            java.util.List r0 = r0.A03(r1, r1)
            java.lang.Object r0 = X.00k.A0J(r0)
            if (r0 == 0) goto L_0x0976
            java.lang.Object r0 = r2.A02
            X.DbS.A1U(r0)
            goto L_0x0976
        L_0x0264:
            int r3 = X.AnonymousClass7TE.A0M(r5)
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r2.A02
            java.lang.Object r0 = X.C51966G9m.A19(r0, r3)
            java.lang.Object r5 = r1.invoke(r0)
            return r5
        L_0x0277:
            X.GmG r5 = (X.C53330GmG) r5
            java.lang.Object r1 = r2.A02
            X.IOu r1 = (X.C57106IOu) r1
            android.view.View r3 = r1.A02
            boolean r0 = r5.A07
            r4 = 8
            r10 = 0
            int r0 = X.DbW.A01(r0)
            r3.setVisibility(r0)
            X.0eM r9 = r1.A0E
            android.view.View r3 = X.AnonymousClass7TE.A0c(r9)
            if (r3 == 0) goto L_0x029c
            boolean r0 = r5.A0E
            int r0 = X.DbW.A01(r0)
            r3.setVisibility(r0)
        L_0x029c:
            X.0eM r8 = r1.A0F
            android.view.View r3 = X.AnonymousClass7TH.A06(r8)
            boolean r0 = r5.A0G
            if (r0 == 0) goto L_0x02a7
            r4 = 0
        L_0x02a7:
            r3.setVisibility(r4)
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r8)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r7 = r2.A01
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            X.4Yx r0 = r5.A04
            java.lang.CharSequence r0 = X.C66909Mes.A01(r7, r0)
            r3.setText(r0)
            boolean r2 = r5.A0A
            android.widget.EditText r6 = r1.A07
            boolean r0 = r6.isFocusable()
            if (r2 == r0) goto L_0x02d0
            r6.setFocusable(r2)
            r6.setFocusableInTouchMode(r2)
            X.C57106IOu.A01(r1)
        L_0x02d0:
            boolean r4 = r5.A09
            android.view.View r2 = r1.A05
            boolean r0 = r2.isEnabled()
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r4 == r0) goto L_0x02ec
            r2.setEnabled(r4)
            r0 = 1053609165(0x3ecccccd, float:0.4)
            if (r4 == 0) goto L_0x02e6
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x02e6:
            r2.setAlpha(r0)
            X.C57106IOu.A01(r1)
        L_0x02ec:
            android.view.View r2 = X.AnonymousClass7TE.A0c(r9)
            if (r2 == 0) goto L_0x02f7
            boolean r0 = r5.A0D
            r2.setEnabled(r0)
        L_0x02f7:
            android.view.View r0 = X.AnonymousClass7TH.A06(r8)
            boolean r2 = r5.A0F
            r0.setEnabled(r2)
            android.view.View r0 = X.AnonymousClass7TH.A06(r8)
            if (r2 != 0) goto L_0x0309
            r3 = 1053609165(0x3ecccccd, float:0.4)
        L_0x0309:
            r0.setAlpha(r3)
            android.view.View r2 = r1.A04
            boolean r0 = r5.A08
            r3 = 1
            android.view.View[] r2 = new android.view.View[]{r2}
            if (r0 == 0) goto L_0x0406
            r0 = 0
            X.C294975nL.A04(r0, r2, r3)
        L_0x031b:
            android.view.View r4 = r1.A03
            android.content.Context r2 = r7.requireContext()
            int r0 = r5.A03
            X.DbU.A11(r2, r4, r0)
            float r0 = r5.A00
            r4.setAlpha(r0)
            android.content.Context r7 = r6.getContext()
            android.content.res.Resources r4 = r7.getResources()
            int r2 = r5.A02
            java.lang.String r0 = r5.A05
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r4, r0, r2)
            r6.setHint(r0)
            int r0 = r5.A01
            int r0 = r7.getColor(r0)
            r6.setHintTextColor(r0)
            java.lang.String r2 = r5.A06
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r6)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x0356
            r6.setText(r2)
        L_0x0356:
            boolean r2 = r5.A0C
            boolean r0 = r5.A0B
            if (r2 == 0) goto L_0x03ab
            if (r0 != 0) goto L_0x0976
            r6.requestFocus()
            X.0nA.A0Q(r6)
            X.Vsj r7 = r1.A0D
            X.Iax r6 = new X.Iax
            r6.<init>(r1)
            r7.A00 = r3
            android.view.View r0 = r7.A02
            int r8 = r0.getWidth()
            android.view.View r4 = r7.A03
            int r9 = r4.getWidth()
            boolean r3 = r7.A04
            if (r3 == 0) goto L_0x03a6
            int r2 = r4.getWidth()
            int r0 = r0.getRight()
            int r2 = r2 - r0
        L_0x0386:
            int r0 = r2 * 2
            int r9 = r9 - r0
            if (r3 == 0) goto L_0x03a1
            int r11 = r4.getPaddingLeft()
        L_0x038f:
            android.animation.ValueAnimator r2 = X.C18488Vsj.A00(r6, r7, r8, r9, r10, r11)
        L_0x0393:
            android.animation.Animator r0 = r1.A00
            if (r0 == 0) goto L_0x039a
            r0.cancel()
        L_0x039a:
            r2.start()
            r1.A00 = r2
            goto L_0x0976
        L_0x03a1:
            int r11 = r4.getPaddingRight()
            goto L_0x038f
        L_0x03a6:
            int r2 = r0.getLeft()
            goto L_0x0386
        L_0x03ab:
            if (r0 == 0) goto L_0x0976
            X.0nA.A0N(r6)
            X.Vsj r12 = r1.A0D
            X.Iay r11 = new X.Iay
            r11.<init>(r1)
            r12.A00 = r10
            android.view.View r5 = r12.A02
            int r13 = r5.getWidth()
            android.view.View r0 = r12.A03
            int r14 = r0.getWidth()
            boolean r4 = r12.A04
            if (r4 == 0) goto L_0x0401
            int r2 = r0.getWidth()
            int r0 = r5.getRight()
            int r2 = r2 - r0
        L_0x03d2:
            int r14 = r14 - r2
            android.view.View r3 = r12.A01
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r10)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r10)
            r3.measure(r2, r0)
            int r0 = r3.getMeasuredWidth()
            int r14 = r14 - r0
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            r0 = 6
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r4 == 0) goto L_0x03fe
            int r15 = r2.leftMargin
        L_0x03f7:
            r16 = r10
            android.animation.ValueAnimator r2 = X.C18488Vsj.A00(r11, r12, r13, r14, r15, r16)
            goto L_0x0393
        L_0x03fe:
            int r15 = r2.rightMargin
            goto L_0x03f7
        L_0x0401:
            int r2 = r5.getLeft()
            goto L_0x03d2
        L_0x0406:
            X.C294975nL.A06(r2, r3)
            goto L_0x031b
        L_0x040b:
            X.Gm5 r5 = (X.C53319Gm5) r5
            java.lang.Object r4 = r2.A02
            X.IOt r4 = (X.C57105IOt) r4
            X.0eM r0 = r4.A02
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            boolean r0 = r5.A05
            r7 = 8
            r9 = 0
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            boolean r3 = r5.A09
            X.0eM r1 = r4.A00
            java.lang.Object r0 = r1.getValue()
            X.3Nc r0 = (X.C240913Nc) r0
            if (r3 == 0) goto L_0x04ef
            android.view.View r0 = r0.A00()
            r0.setVisibility(r9)
        L_0x0436:
            X.0eM r0 = r4.A0B
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            boolean r0 = r5.A0A
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            X.0eM r10 = r4.A0A
            java.lang.Object r6 = X.AnonymousClass7TE.A14(r10)
            android.widget.TextView r6 = (android.widget.TextView) r6
            X.4Yx r1 = r5.A02
            r3 = 0
            if (r1 == 0) goto L_0x04ec
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.CharSequence r0 = X.C66909Mes.A01(r0, r1)
        L_0x045a:
            r6.setText(r0)
            java.lang.Object r8 = X.AnonymousClass7TE.A14(r10)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.Object r6 = r2.A01
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            android.content.res.Resources r1 = X.DbV.A05(r6)
            int r0 = r5.A01
            float r0 = r1.getDimension(r0)
            r8.setTextSize(r9, r0)
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r10)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r5.A03
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r9)
            r1.setTypeface(r0)
            X.0eM r0 = r4.A03
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            boolean r0 = r5.A06
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            X.0eM r0 = r4.A01
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            boolean r0 = r5.A04
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            X.0eM r0 = r4.A05
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x04ac
            r7 = 0
        L_0x04ac:
            r1.setVisibility(r7)
            boolean r0 = r5.A08
            r2 = 1
            if (r0 == 0) goto L_0x0504
            X.0eM r0 = r4.A06
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r5.A00
            X.DbU.A1G(r1, r6, r0)
            X.0eM r0 = r4.A09
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 41
            X.ID1.A01(r1, r0, r4)
            X.0eM r0 = r4.A08
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 42
            X.ID1.A01(r1, r0, r4)
            X.0eM r0 = r4.A07
            java.lang.Object r0 = r0.getValue()
            X.3Nc r0 = (X.C240913Nc) r0
            android.view.View r0 = r0.A00()
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A04(r3, r0, r2)
            goto L_0x0976
        L_0x04ec:
            r0 = r3
            goto L_0x045a
        L_0x04ef:
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0436
            java.lang.Object r0 = r1.getValue()
            X.3Nc r0 = (X.C240913Nc) r0
            android.view.View r0 = r0.A00()
            r0.setVisibility(r7)
            goto L_0x0436
        L_0x0504:
            X.0eM r1 = r4.A07
            java.lang.Object r0 = r1.getValue()
            X.3Nc r0 = (X.C240913Nc) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0976
            java.lang.Object r0 = r1.getValue()
            X.3Nc r0 = (X.C240913Nc) r0
            android.view.View r0 = r0.A00()
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A05(r0, r2)
            X.0eM r0 = r4.A09
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r0.setOnClickListener(r3)
            X.0eM r0 = r4.A08
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r0.setOnClickListener(r3)
            goto L_0x0976
        L_0x0537:
            X.GmU r5 = (X.C53344GmU) r5
            java.lang.Object r4 = r2.A01
            android.view.View r4 = (android.view.View) r4
            java.lang.Integer r1 = r5.A00
            if (r1 == 0) goto L_0x05d6
            java.lang.Object r0 = r2.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            int r3 = r1.intValue()
            android.content.Context r1 = r0.requireContext()
            android.content.Context r0 = r0.requireContext()
            int r0 = X.2Yu.A0H(r0, r3)
            int r0 = r1.getColor(r0)
        L_0x0559:
            r4.setBackgroundColor(r0)
            java.lang.Object r3 = r2.A02
            X.Kcv r3 = (X.C62261Kcv) r3
            X.M0a r6 = r3.A01
            if (r6 == 0) goto L_0x0580
            r0 = 1
            r6.A02 = r0
            java.util.List r4 = r5.A03
            boolean r1 = r5.A04
            X.0qQ.A0B(r4, r0)
            X.LhL r0 = new X.LhL
            r0.<init>()
            r0.A00 = r4
            r0.A01 = r1
            X.LhL r2 = r6.A00
            if (r2 != 0) goto L_0x05bc
            r6.A00 = r0
            X.C65808M0a.A00(r6)
        L_0x0580:
            X.M0a r2 = r3.A01
            if (r2 == 0) goto L_0x0598
            r0 = 1
            r2.A01 = r0
            java.util.List r1 = r5.A02
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.List r0 = r2.A0C
            r0.clear()
            r0.addAll(r1)
            X.C65808M0a.A00(r2)
        L_0x0598:
            X.M0a r2 = r3.A01
            if (r2 == 0) goto L_0x05ad
            java.util.List r1 = r5.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.List r0 = r2.A0B
            r0.clear()
            r0.addAll(r1)
            X.C65808M0a.A00(r2)
        L_0x05ad:
            X.M0a r2 = r3.A01
            if (r2 == 0) goto L_0x0976
            boolean r1 = r5.A05
            X.LA4 r0 = r2.A08
            r0.A02 = r1
            X.C65808M0a.A00(r2)
            goto L_0x0976
        L_0x05bc:
            r2.A00 = r4
            X.KFm r0 = r6.A09
            java.util.List r0 = r0.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x05c6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0580
            java.lang.Object r0 = r1.next()
            X.LDb r0 = (X.LDb) r0
            r0.A00(r2)
            goto L_0x05c6
        L_0x05d6:
            r0 = 0
            goto L_0x0559
        L_0x05d8:
            int r1 = X.AnonymousClass7TE.A0M(r5)
            java.lang.Object r0 = r2.A01
            X.5Oz r0 = (X.C284945Oz) r0
            int r0 = X.C51971G9r.A0B(r0)
            if (r1 >= r0) goto L_0x0976
            java.lang.Object r2 = r2.A02
            X.GzT r2 = (X.C54098GzT) r2
            X.HlJ r0 = r2.A00
            if (r0 == 0) goto L_0x05ff
            X.0eM r0 = r2.A01
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.1Yp.A02(r1, r0)
        L_0x05ff:
            X.FEe r4 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            X.0eM r0 = r2.A02
            X.0lg r2 = X.DbT.A0X(r0)
            java.lang.String r0 = "https://about.meta.com/actions/safety/resource/f/294901175461996/"
            X.SFz r1 = new X.SFz
            r1.<init>((java.lang.String) r0)
            com.instagram.simplewebview.SimpleWebViewConfig r0 = new com.instagram.simplewebview.SimpleWebViewConfig
            r0.<init>(r1)
            r4.A02(r3, r2, r0)
            goto L_0x0976
        L_0x061c:
            int r4 = X.AnonymousClass7TE.A0M(r5)
            java.lang.Object r3 = r2.A02
            X.GhK r3 = (X.C53029GhK) r3
            java.lang.Object r1 = r2.A01
            X.5Tq r1 = (X.C286025Tq) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.List r0 = r1.A03(r4, r4)
            java.lang.Object r2 = X.00k.A0J(r0)
            X.62b r2 = (X.C3022062b) r2
            if (r2 == 0) goto L_0x0976
            java.lang.String r1 = r2.A03
            java.lang.String r0 = X.AnonymousClass9NF.A00()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0976
            java.lang.Object r1 = r2.A02
            java.lang.String r1 = (java.lang.String) r1
            X.Ibp r0 = new X.Ibp
            r0.<init>(r1)
            X.C53029GhK.A00(r0, r3)
            goto L_0x0976
        L_0x0652:
            X.6Gb r8 = X.C51968G9o.A0L(r5)
            java.lang.Object r7 = r2.A02
            java.util.List r7 = (java.util.List) r7
            X.J4o r6 = X.C59055J4o.A00
            java.lang.Object r5 = r2.A01
            X.0sP r5 = (X.0sP) r5
            X.J4p r1 = X.C59056J4p.A00
            int r4 = r7.size()
            r0 = 27
            X.J6T r3 = new X.J6T
            r3.<init>((int) r0, (java.util.List) r7, (X.0sP) r6)
            r0 = 28
            X.J6T r2 = new X.J6T
            r2.<init>((int) r0, (java.util.List) r7, (X.0sP) r1)
            r1 = 25
            X.GaB r0 = new X.GaB
            r0.<init>((int) r1, (java.util.List) r7, (X.0sP) r5)
            X.C51967G9n.A12(r8, r0, r3, r2, r4)
            goto L_0x0976
        L_0x0680:
            java.lang.String r1 = X.C41847B3o.A1E(r5)
            java.lang.Object r0 = r2.A01
            com.instagram.wonderwall.model.WallPostItem r0 = (com.instagram.wonderwall.model.WallPostItem) r0
            com.instagram.wonderwall.model.WallPostInfo r0 = r0.BeB()
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0976
            java.lang.Object r0 = r2.A02
            X.Ghg r0 = (X.C53048Ghg) r0
            r0.Dzy(r1)
            goto L_0x0976
        L_0x069b:
            java.lang.Object r0 = r2.A02
            X.Ghf r0 = (X.C53047Ghf) r0
            com.instagram.wonderwall.repository.WallFeedRepository r1 = r0.A02
            java.lang.Object r0 = r2.A01
            com.instagram.wonderwall.model.WallPostItem r0 = (com.instagram.wonderwall.model.WallPostItem) r0
            com.instagram.wonderwall.model.WallPostInfo r0 = r0.BeB()
            java.lang.String r0 = r0.A06
            r1.A02(r0)
            goto L_0x0976
        L_0x06b0:
            boolean r0 = X.AnonymousClass7TE.A1a(r5)
            if (r0 == 0) goto L_0x0976
            java.lang.Object r5 = r2.A02
            X.Ghg r5 = (X.C53048Ghg) r5
            X.1Ng r4 = r5.A00
            com.instagram.wonderwall.model.WallInfo r0 = r5.A02
            java.lang.String r3 = r0.A01
            java.lang.Object r1 = r2.A01
            com.instagram.wonderwall.model.WallPostItem r1 = (com.instagram.wonderwall.model.WallPostItem) r1
            X.IbX r0 = new X.IbX
            r0.<init>(r1)
            X.G9w.A1K(r4, r0, r3)
            X.Ic2 r0 = X.C57514Ic2.A00
            X.C53048Ghg.A02(r0, r5)
            goto L_0x0976
        L_0x06d3:
            X.5b4 r5 = (X.AnonymousClass5b4) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r6 = r2.A01
            X.JNO r6 = (X.JNO) r6
            X.5b5 r4 = r5.A04
            float r3 = X.C51975G9x.A01(r4)
            java.lang.Object r1 = r2.A02
            X.0rh r1 = (X.0rh) r1
            float r0 = r1.A00
            float r3 = r3 - r0
            r6.AQD(r3)
            float r0 = X.C51975G9x.A01(r4)
            r1.A00 = r0
            goto L_0x0976
        L_0x06f5:
            X.5SW r5 = (X.AnonymousClass5SW) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Object r3 = r2.A02
            X.Hri r3 = (X.C56035Hri) r3
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r6 = r3.A02
            X.5Oz r4 = r6.A05
            java.lang.Object r1 = r4.getValue()
            X.HLh r0 = X.C54624HLh.Hidden
            if (r1 == r0) goto L_0x0976
            java.lang.Object r2 = r2.A01
            r0 = 12
            X.Ivw r1 = X.C58687Ivw.A00(r2, r3, r0)
            X.5Sb r0 = X.C290125en.A05
            X.C51968G9o.A1H(r0, r5, r1)
            java.lang.Object r0 = r4.getValue()
            X.HLh r1 = X.C54624HLh.HalfExpanded
            if (r0 != r1) goto L_0x072d
            r0 = 13
            X.Ivw r1 = X.C58687Ivw.A00(r2, r3, r0)
            X.5Sb r0 = X.C290125en.A06
            X.C51968G9o.A1H(r0, r5, r1)
            goto L_0x0976
        L_0x072d:
            X.Htm r0 = com.meta.compose.material.bottomsheet.AnchoredDraggableState.A01(r6)
            java.util.Map r0 = r0.A00
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0976
            r0 = 14
            X.Ivw r1 = X.C58687Ivw.A00(r2, r3, r0)
            X.5Sb r0 = X.C290125en.A01
            X.C51968G9o.A1H(r0, r5, r1)
            goto L_0x0976
        L_0x0746:
            X.7en r5 = (X.C336547en) r5
            r6 = 0
            X.0qQ.A0B(r5, r6)
            java.lang.Object r4 = r2.A02
            java.util.List r4 = (java.util.List) r4
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0769
            r0 = 2131962812(0x7f132bbc, float:1.956236E38)
            java.lang.String r0 = X.C244013aV.A0E(r5, r0)
            X.2Tp r2 = X.C55214He5.A00(r5, r0)
            r1 = 0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.A00(r2, r1, r0, r0)
            goto L_0x0976
        L_0x0769:
            r0 = 2131962813(0x7f132bbd, float:1.9562362E38)
            java.lang.String r0 = X.C244013aV.A0E(r5, r0)
            X.2Tp r3 = X.C55214He5.A00(r5, r0)
            r1 = 0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.A00(r3, r1, r0, r0)
            java.lang.Object r0 = r2.A01
            X.0sK r0 = (X.0sK) r0
            X.C51967G9n.A1N(r5, r4, r0, r6)
            goto L_0x0976
        L_0x0783:
            r3 = 0
            X.0qQ.A0B(r5, r3)
            java.lang.Object r1 = r2.A02
            X.0sK r1 = (X.0sK) r1
            java.lang.Object r0 = r2.A01
            X.C51967G9n.A1N(r5, r0, r1, r3)
            goto L_0x0976
        L_0x0792:
            X.2Uy r5 = (X.C70762Uy) r5
            r1 = 0
            X.0qQ.A0B(r5, r1)
            android.view.MotionEvent r0 = r5.A00
            int r3 = r0.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x07ab
            if (r3 == r4) goto L_0x07d3
            r0 = 3
            if (r3 == r0) goto L_0x07d3
        L_0x07a6:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L_0x07ab:
            java.lang.Object r3 = r2.A01
            X.3Zt r3 = (X.C243673Zt) r3
            X.AnonymousClass2VL.A00()
            java.lang.Object r0 = r3.A00
            X.JQa r0 = (X.C59606JQa) r0
            if (r0 == 0) goto L_0x07ca
            boolean r0 = r0.isActive()
            if (r0 != r4) goto L_0x07ca
            X.AnonymousClass2VL.A00()
            java.lang.Object r0 = r3.A00
            X.JQa r0 = (X.C59606JQa) r0
            if (r0 == 0) goto L_0x07ca
            r0.cancel()
        L_0x07ca:
            java.lang.Object r0 = r2.A02
            X.Gso r0 = (X.C53697Gso) r0
            X.HlR r0 = r0.A00
            X.0sa r0 = r0.A00
            goto L_0x07fa
        L_0x07d3:
            java.lang.Object r3 = r2.A01
            X.3Zt r3 = (X.C243673Zt) r3
            X.AnonymousClass2VL.A00()
            java.lang.Object r0 = r3.A00
            X.JQa r0 = (X.C59606JQa) r0
            if (r0 == 0) goto L_0x07f2
            boolean r0 = r0.isActive()
            if (r0 != r4) goto L_0x07f2
            X.AnonymousClass2VL.A00()
            java.lang.Object r0 = r3.A00
            X.JQa r0 = (X.C59606JQa) r0
            if (r0 == 0) goto L_0x07f2
            r0.cancel()
        L_0x07f2:
            java.lang.Object r0 = r2.A02
            X.Gso r0 = (X.C53697Gso) r0
            X.HlR r0 = r0.A00
            X.0sa r0 = r0.A01
        L_0x07fa:
            java.lang.Object r0 = r0.invoke()
            r3.A00(r0)
            X.AnonymousClass2VL.A00()
            java.lang.Object r0 = r3.A00
            X.JQa r0 = (X.C59606JQa) r0
            if (r0 == 0) goto L_0x07a6
            r0.start()
            goto L_0x07a6
        L_0x080e:
            java.lang.Object r1 = r2.A02
            X.MUb r1 = (X.C66498MUb) r1
            java.lang.Object r0 = r2.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r0 = r0.A00
            X.MPe r0 = (X.C66373MPe) r0
            r1.AGB(r0)
            goto L_0x0976
        L_0x081f:
            java.lang.Object r3 = r2.A02
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r3 = (com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository) r3
            X.05G r0 = r3.A0C
            java.lang.Object r0 = r0.getValue()
            X.HtB r0 = (X.C56123HtB) r0
            if (r0 == 0) goto L_0x0866
            java.util.List r0 = r0.A02
            java.lang.Object r0 = X.00k.A0J(r0)
            X.I1k r0 = (X.C56556I1k) r0
            if (r0 == 0) goto L_0x0866
            X.HtY r0 = r0.A01
            if (r0 == 0) goto L_0x0866
            java.lang.Integer r1 = r0.A01
        L_0x083d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            java.lang.Object r0 = r2.A01
            X.0sP r0 = (X.0sP) r0
            X.C51968G9o.A1O(r0, r1)
            X.I25 r3 = r3.A03
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "is_personalized"
            r3.A07(r0, r1)
            java.lang.String r2 = "query_end"
            com.facebook.quicklog.QuickPerformanceLogger r1 = r3.A00
            if (r1 == 0) goto L_0x0861
            r0 = 325715894(0x136a07b6, float:2.9538754E-27)
            r1.markerPoint(r0, r2)
        L_0x0861:
            r3.A05(r2)
            goto L_0x0976
        L_0x0866:
            r1 = 0
            goto L_0x083d
        L_0x0868:
            java.lang.Object r0 = r2.A01
            boolean r0 = r0 instanceof X.HIG
            java.lang.Object r1 = r2.A02
            X.HIr r1 = (X.C54556HIr) r1
            if (r0 == 0) goto L_0x0878
            r0 = 0
            r1.A0H(r0)
            goto L_0x0976
        L_0x0878:
            X.C54556HIr.A02(r1)
            goto L_0x0976
        L_0x087d:
            java.lang.Object r4 = r2.A02
            X.HIr r4 = (X.C54556HIr) r4
            java.lang.Object r7 = r2.A01
            X.HtY r7 = (X.C56146HtY) r7
            if (r7 == 0) goto L_0x08fc
            java.lang.Integer r0 = r7.A01
            int r0 = r0.intValue()
        L_0x088d:
            r6 = 0
            X.Htc r5 = r4.A0D
            if (r0 != r6) goto L_0x08e4
            boolean r0 = r5.A0E
        L_0x0894:
            if (r0 == 0) goto L_0x08fa
            X.HtR r0 = r5.A03
            if (r0 == 0) goto L_0x08a2
            java.lang.Boolean r0 = r0.A00
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r6)
            if (r0 != 0) goto L_0x08fa
        L_0x08a2:
            r8 = 1
        L_0x08a3:
            if (r7 == 0) goto L_0x08e2
            java.lang.Integer r0 = r7.A01
            int r0 = r0.intValue()
        L_0x08ab:
            r9 = 1
            if (r0 != r6) goto L_0x08c8
            boolean r9 = r5.A0H
        L_0x08b0:
            X.HtR r0 = r5.A03
            boolean r10 = X.AnonymousClass7TF.A1V(r0)
            X.HMY r7 = r5.A01
            boolean r11 = r4.A0K
            X.GgI r6 = r4.A02
            if (r6 != 0) goto L_0x08fe
            java.lang.String r0 = "editViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x08c8:
            boolean r0 = r5.A0H
            if (r0 == 0) goto L_0x08e0
            com.meta.foa.session.FoaUserSession r0 = r4.A01
            com.instagram.common.session.UserSession r3 = X.C56316HwT.A00(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328998053560019(0x81110800073ed3, double:3.0379428819803004E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x08e0
            goto L_0x08b0
        L_0x08e0:
            r9 = 0
            goto L_0x08b0
        L_0x08e2:
            r0 = -1
            goto L_0x08ab
        L_0x08e4:
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x08fa
            com.meta.foa.session.FoaUserSession r0 = r4.A01
            com.instagram.common.session.UserSession r3 = X.C56316HwT.A00(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328998053101263(0x81110800003ecf, double:3.037942881690181E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x0894
        L_0x08fa:
            r8 = 0
            goto L_0x08a3
        L_0x08fc:
            r0 = -1
            goto L_0x088d
        L_0x08fe:
            X.GuQ r5 = new X.GuQ
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L_0x0904:
            java.lang.Object r0 = r2.A01
            X.HQ3 r0 = (X.HQ3) r0
            X.HIN r0 = (X.HIN) r0
            X.Hsu r0 = r0.A00
            if (r0 == 0) goto L_0x0912
            java.lang.Integer r4 = r0.A01
            if (r4 != 0) goto L_0x0914
        L_0x0912:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
        L_0x0914:
            r1 = 0
            if (r0 == 0) goto L_0x0932
            X.HtI r0 = r0.A00
        L_0x0919:
            X.Hsu r3 = new X.Hsu
            r3.<init>(r0, r4, r1)
            java.lang.Object r2 = r2.A02
            r0 = 37
            X.JFy r1 = X.C59346JFy.A00(r2, r0)
            r0 = 29
            X.Ivm r0 = X.C58677Ivm.A00(r2, r0)
            X.Gsr r5 = new X.Gsr
            r5.<init>(r3, r0, r1)
            return r5
        L_0x0932:
            r0 = 0
            goto L_0x0919
        L_0x0934:
            java.lang.Object r1 = r2.A01
            X.2Wa r1 = (X.2Wa) r1
            X.J5E r0 = X.J5E.A00
            r1.A03(r0)
            java.lang.Object r0 = r2.A02
            X.Gv4 r0 = (X.C53837Gv4) r0
            X.0sL r1 = r0.A04
            if (r1 == 0) goto L_0x0976
            X.HnQ r0 = r0.A01
            if (r18 != 0) goto L_0x0967
            goto L_0x0976
        L_0x094a:
            X.2WA r3 = X.G9w.A0R(r5)
            java.lang.Object r1 = r2.A02
            X.GvQ r1 = (X.C53859GvQ) r1
            java.lang.Object r0 = r2.A01
            X.2Wa r0 = (X.2Wa) r0
            java.lang.Object r5 = r0.A03
            java.lang.String r5 = (java.lang.String) r5
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x0976
            X.0sL r1 = r1.A07
        L_0x0962:
            android.view.View r0 = r3.A00
            X.0qQ.A06(r0)
        L_0x0967:
            r1.invoke(r0, r5)
            goto L_0x0976
        L_0x096b:
            java.lang.Object r0 = r2.A02
            X.GwM r0 = (X.C53916GwM) r0
            X.0sP r1 = r0.A06
        L_0x0971:
            java.lang.Object r0 = r2.A01
        L_0x0973:
            r1.invoke(r0)
        L_0x0976:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0979:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r2.A02
            java.lang.Object[] r5 = new java.lang.Object[]{r1, r0}
            return r5
        L_0x0982:
            java.lang.Object r0 = r2.A02
            X.HIq r0 = (X.C54555HIq) r0
            com.meta.foa.session.FoaUserSession r3 = r0.A01
            X.GgN r1 = X.C54555HIq.A00(r0)
            java.lang.Object r0 = r2.A01
            X.HlT r0 = (X.C55670HlT) r0
            X.Gst r5 = new X.Gst
            r5.<init>(r3, r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J6T.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6T(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
