package X;

import go.Seq;
import java.util.List;

public final class MPB extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MPB(int i, List list, 0sP r4) {
        super(1);
        this.A00 = i;
        switch (i) {
            case 15:
            case 34:
            case 36:
            case Seq.NULL_REFNUM:
            case 48:
                this.A01 = r4;
                this.A02 = list;
                break;
            default:
                this.A02 = r4;
                this.A01 = list;
                break;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v253, resolved type: java.lang.Throwable} */
    /* JADX WARNING: type inference failed for: r1v144, types: [X.GYS, X.0Ya] */
    /* JADX WARNING: type inference failed for: r0v189, types: [X.JaF, X.0Ya] */
    /* JADX WARNING: type inference failed for: r0v190, types: [X.JaG, X.0Ya] */
    /* JADX WARNING: type inference failed for: r0v191, types: [X.JaH, X.0Ya] */
    /* JADX WARNING: type inference failed for: r2v67, types: [X.MIi, X.0Ya] */
    /* JADX WARNING: type inference failed for: r1v159, types: [X.MIj, X.0Ya] */
    /* JADX WARNING: type inference failed for: r2v69, types: [X.MIk, X.0Ya] */
    /* JADX WARNING: type inference failed for: r1v164, types: [X.MIl, X.0Ya] */
    /* JADX WARNING: type inference failed for: r1v165, types: [X.MIm, X.0Ya] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x048f, code lost:
        if (r1.A00 == null) goto L_0x0491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x04ea, code lost:
        r2.A04((com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r1, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x068a, code lost:
        r5.setFooterText(r3.A08(r4.getActivity(), r2, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x074c, code lost:
        X.C51965G9l.A1W(r3.A02, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x07dd, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x07e4, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0992, code lost:
        if (r3 != X.AnonymousClass4A5.A09) goto L_0x0994;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0996, code lost:
        if (r6 == false) goto L_0x0998;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0998, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0999, code lost:
        if (r3 != r2) goto L_0x099c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x099b, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x099c, code lost:
        r5 = r4.A00;
        r4 = r4.A01;
        r3 = r0.A02;
        r2 = r0.A06;
        r1 = r0.A05;
        r0 = r0.A07;
        X.0qQ.A0B(r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x09bd, code lost:
        return new X.C53546GqH(r10, r3, r5, r4, r8, r15, r16, r17, r2, r1, r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x016c, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01b5, code lost:
        X.DbS.A1a(r5, r0, r4, r2, r1);
        X.AnonymousClass931.A00((com.instagram.common.session.UserSession) r3.A02, (android.content.Context) r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        return r1.invoke(X.C51966G9m.A19(r0, r2));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r29) {
        /*
            r28 = this;
            r3 = r28
            r0 = r29
            int r1 = r3.A00
            switch(r1) {
                case 0: goto L_0x0a49;
                case 1: goto L_0x09c5;
                case 2: goto L_0x0969;
                case 3: goto L_0x091c;
                case 4: goto L_0x08dd;
                case 5: goto L_0x0864;
                case 6: goto L_0x0842;
                case 7: goto L_0x0805;
                case 8: goto L_0x07ed;
                case 9: goto L_0x0782;
                case 10: goto L_0x0753;
                case 11: goto L_0x072d;
                case 12: goto L_0x0722;
                case 13: goto L_0x0701;
                case 14: goto L_0x06de;
                case 15: goto L_0x0009;
                case 16: goto L_0x06ab;
                case 17: goto L_0x0697;
                case 18: goto L_0x04f1;
                case 19: goto L_0x04de;
                case 20: goto L_0x04ca;
                case 21: goto L_0x04ca;
                case 22: goto L_0x04de;
                case 23: goto L_0x04de;
                case 24: goto L_0x04b5;
                case 25: goto L_0x0313;
                case 26: goto L_0x02bd;
                case 27: goto L_0x0295;
                case 28: goto L_0x0211;
                case 29: goto L_0x01ed;
                case 30: goto L_0x01c5;
                case 31: goto L_0x01ab;
                case 32: goto L_0x01a0;
                case 33: goto L_0x001c;
                case 34: goto L_0x0009;
                case 35: goto L_0x001c;
                case 36: goto L_0x0009;
                case 37: goto L_0x0184;
                case 38: goto L_0x0171;
                case 39: goto L_0x0160;
                case 40: goto L_0x001c;
                case 41: goto L_0x0009;
                case 42: goto L_0x0120;
                case 43: goto L_0x0107;
                case 44: goto L_0x0107;
                case 45: goto L_0x00f6;
                case 46: goto L_0x00b3;
                case 47: goto L_0x001c;
                case 48: goto L_0x0009;
                case 49: goto L_0x0027;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r2 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r1 = r3.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r3.A02
        L_0x0013:
            java.lang.Object r0 = X.C51966G9m.A19(r0, r2)
            java.lang.Object r7 = r1.invoke(r0)
            return r7
        L_0x001c:
            int r2 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r1 = r3.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r3.A01
            goto L_0x0013
        L_0x0027:
            X.Gln r0 = (X.C53301Gln) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r6 = r3.A02
            com.instagram.profilecard.domain.ProfileCardViewModel r6 = (com.instagram.profilecard.domain.ProfileCardViewModel) r6
            r4 = 0
            com.instagram.profilecard.domain.ProfileCardViewModel.A04(r6, r2)
            r1 = 5
            java.lang.Integer[] r1 = X.AnonymousClass05K.A00(r1)
            int r0 = r0.A00
            int r1 = X.JTO.A0A(r1, r0)
            if (r1 == r2) goto L_0x00a6
            r0 = 1
            if (r1 == r0) goto L_0x008b
            r0 = 2
            if (r1 == r0) goto L_0x0070
            r2 = 3
            if (r1 == r2) goto L_0x007d
            r0 = 4
            if (r1 != r0) goto L_0x00ae
            java.lang.Object r5 = r3.A01
            android.app.Activity r5 = (android.app.Activity) r5
            X.0qQ.A0B(r5, r4)
            com.instagram.common.session.UserSession r7 = r6.A0F
            X.0Ud r0 = r6.A0L
            java.lang.Object r0 = r0.getValue()
            X.GnU r0 = (X.C53397GnU) r0
            java.lang.String r10 = r0.A0A
            X.TpH r8 = X.C14068TpH.PROFILE
            X.UzD r9 = X.C16677UzD.USER
            X.OcF r1 = X.ORV.A01(r5, r6, r7, r8, r9, r10)
            r0 = 0
            X.C71093OcF.A00(r0, r1)
        L_0x006d:
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x0070:
            X.6oS r3 = X.C318116oQ.A00(r6)
            r2 = 0
            r0 = 12
            X.MG3 r1 = new X.MG3
            r1.<init>((java.lang.Object) r6, (X.AnonymousClass4D7) r2, (int) r0)
            goto L_0x0087
        L_0x007d:
            X.6oS r3 = X.C318116oQ.A00(r6)
            r0 = 0
            X.MFx r1 = new X.MFx
            r1.<init>(r6, r0, r2)
        L_0x0087:
            X.AnonymousClass7TE.A1Z(r1, r3)
            goto L_0x006d
        L_0x008b:
            java.lang.Object r2 = r3.A01
            android.app.Activity r2 = (android.app.Activity) r2
            X.0qQ.A0B(r2, r4)
            boolean r0 = X.C2604245p.A03(r2)
            if (r0 != 0) goto L_0x00a2
            r1 = 6
            X.Lh6 r0 = new X.Lh6
            r0.<init>(r1, r2, r6)
            X.C2604245p.A01(r2, r0)
            goto L_0x006d
        L_0x00a2:
            com.instagram.profilecard.domain.ProfileCardViewModel.A02(r2, r6)
            goto L_0x006d
        L_0x00a6:
            java.lang.Object r0 = r3.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r6.A08(r0)
            goto L_0x006d
        L_0x00ae:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b3:
            X.JP8 r0 = (X.JP8) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r6 = r3.A02
            X.JwK r6 = (X.C61082JwK) r6
            java.lang.Object r1 = r6.A00
            X.JwF r1 = (X.C61077JwF) r1
            java.lang.Object r5 = r1.A00
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r3.A01
            int r12 = r5.size()
            r1 = 4
            X.G4S r3 = new X.G4S
            r3.<init>(r5, r1)
            r1 = 20
            X.GaB r2 = new X.GaB
            r2.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r5)
            r1 = 1229287273(0x49456f69, float:808694.56)
            X.5PJ r11 = X.AnonymousClass5PI.A03(r2, r1)
            r4 = 0
            r10 = r4
            r7 = r0
            r8 = r4
            r9 = r3
            r7.CfC(r8, r9, r10, r11, r12)
            boolean r1 = r6.A01
            if (r1 == 0) goto L_0x0a7c
            X.J4G r3 = X.J4G.A00
            X.0sK r2 = X.C55350HgI.A00
            java.lang.String r1 = "loading"
            r0.Cf5(r1, r4, r3, r2)
            goto L_0x0a7c
        L_0x00f6:
            java.lang.Object r1 = r3.A02
            X.MUb r1 = (X.C66498MUb) r1
            java.lang.Object r0 = r3.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r0 = r0.A00
            X.MPe r0 = (X.C66373MPe) r0
            r1.AGB(r0)
            goto L_0x0a7c
        L_0x0107:
            int r1 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r3.A01
            X.5Tq r0 = (X.C286025Tq) r0
            java.util.List r0 = r0.A03(r1, r1)
            java.lang.Object r0 = X.00k.A0J(r0)
            if (r0 == 0) goto L_0x0a7c
            java.lang.Object r1 = r3.A02
            X.0sP r1 = (X.0sP) r1
            X.EOf r0 = X.C47954EOf.A00
            goto L_0x016c
        L_0x0120:
            android.view.View r1 = X.C51969G9p.A0O(r0)
            r0 = 2131432290(0x7f0b1362, float:1.8486333E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r1, r0)     // Catch:{ Exception -> 0x0a7c }
            android.view.ViewStub r0 = (android.view.ViewStub) r0     // Catch:{ Exception -> 0x0a7c }
            X.6hg r5 = new X.6hg     // Catch:{ Exception -> 0x0a7c }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0a7c }
            java.lang.String r4 = "👀"
            java.lang.Object r1 = r3.A01     // Catch:{ Exception -> 0x0a7c }
            X.0sa r1 = (X.C62320sa) r1     // Catch:{ Exception -> 0x0a7c }
            java.lang.Object r0 = r3.A02     // Catch:{ Exception -> 0x0a7c }
            X.5Oz r0 = (X.C284945Oz) r0     // Catch:{ Exception -> 0x0a7c }
            X.LzW r3 = new X.LzW     // Catch:{ Exception -> 0x0a7c }
            r3.<init>(r0, r1)     // Catch:{ Exception -> 0x0a7c }
            r1 = 1
            X.7fS r2 = X.C317486nL.A04     // Catch:{ Exception -> 0x0a7c }
            boolean r0 = X.C336957fS.A03(r4)     // Catch:{ Exception -> 0x0a7c }
            if (r0 == 0) goto L_0x0a7c
            X.Kgf r0 = X.C62490Kgf.FewEmoji     // Catch:{ Exception -> 0x0a7c }
            X.C314116hg.A00(r5, r3, r0, r1)     // Catch:{ Exception -> 0x0a7c }
            X.3oV r0 = r5.A00     // Catch:{ Exception -> 0x0a7c }
            android.view.View r1 = r0.getView()     // Catch:{ Exception -> 0x0a7c }
            com.instagram.ui.widget.balloonsview.BalloonsView r1 = (com.instagram.ui.widget.balloonsview.BalloonsView) r1     // Catch:{ Exception -> 0x0a7c }
            com.instagram.common.typedurl.SimpleImageUrl r0 = r2.A04(r4)     // Catch:{ Exception -> 0x0a7c }
            r1.A01(r0)     // Catch:{ Exception -> 0x0a7c }
            goto L_0x0a7c
        L_0x0160:
            java.lang.Object r1 = r3.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r3.A02
            X.JOQ r0 = (X.JOQ) r0
            X.GqO r0 = (X.C53553GqO) r0
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository$OpalAudience r0 = r0.A00
        L_0x016c:
            r1.invoke(r0)
            goto L_0x0a7c
        L_0x0171:
            X.11X r0 = (X.AnonymousClass11X) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r2 = r3.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r3.A02
            X.07i r1 = (X.AnonymousClass07i) r1
            X.1ES.A00(r2, r1, r0)
            goto L_0x0a7c
        L_0x0184:
            X.G64 r0 = (X.G64) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r5 = r3.A02
            android.content.Context r5 = (android.content.Context) r5
            java.util.concurrent.Executor r4 = r5.getMainExecutor()
            java.lang.Object r2 = r3.A01
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            X.M97 r1 = new X.M97
            r1.<init>(r5, r2, r0)
            r4.execute(r1)
            goto L_0x0a7c
        L_0x01a0:
            X.0tS r5 = X.DbT.A0h()
            X.0s0 r4 = r5.A2W
            X.0YZ[] r2 = X.0tS.A4G
            r1 = 248(0xf8, float:3.48E-43)
            goto L_0x01b5
        L_0x01ab:
            X.0tS r5 = X.DbT.A0h()
            X.0s0 r4 = r5.A2V
            X.0YZ[] r2 = X.0tS.A4G
            r1 = 247(0xf7, float:3.46E-43)
        L_0x01b5:
            X.DbS.A1a(r5, r0, r4, r2, r1)
            java.lang.Object r1 = r3.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r3.A01
            android.content.Context r0 = (android.content.Context) r0
            X.AnonymousClass931.A00(r1, r0)
            goto L_0x0a7c
        L_0x01c5:
            X.C51965G9l.A1U(r0)
            java.lang.Object r5 = r3.A02
            X.K5B r5 = (X.K5B) r5
            X.JjV r4 = X.JTT.A0Z(r5)
            java.lang.Object r0 = r3.A01
            com.instagram.ui.widget.mediapicker.Folder r0 = (com.instagram.ui.widget.mediapicker.Folder) r0
            int r2 = r0.A02
            java.lang.String r1 = r0.A03
            if (r1 != 0) goto L_0x01dc
            java.lang.String r1 = ""
        L_0x01dc:
            X.LtU r0 = new X.LtU
            r0.<init>(r2, r1)
            X.MQl[] r0 = new X.C66405MQl[]{r0}
            r4.A03(r0)
            X.DbZ.A15(r5)
            goto L_0x0a7c
        L_0x01ed:
            int r2 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r1 = r3.A01
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x0a7c
            boolean r0 = r1.isDestroyed()
            if (r0 != 0) goto L_0x0a7c
            java.lang.Object r1 = r3.A02
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setImageLevel(r2)
            boolean r0 = X.AnonymousClass7TF.A1R(r2)
            r1.setActivated(r0)
            goto L_0x0a7c
        L_0x0211:
            X.2WE r0 = (X.2WE) r0
            r7 = 0
            X.0qQ.A0B(r0, r7)
            java.lang.Object r2 = r3.A01
            X.3bE r2 = (X.C244463bE) r2
            java.lang.Object r5 = r3.A02
            X.GxS r5 = (X.C53984GxS) r5
            boolean r1 = r5.A06
            r2.A00 = r1
            com.instagram.common.typedurl.ImageUrl r2 = r5.A05
            java.lang.String r8 = r2.getUrl()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            int r1 = r2.getWidth()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r6 = 1
            int r1 = r2.getHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            X.0iw r1 = r5.A04
            java.lang.Object[] r2 = new java.lang.Object[]{r8, r3, r2, r1}
            X.JFx r1 = new X.JFx
            r1.<init>(r5, r7)
            r0.A02(r1, r2)
            android.widget.ImageView$ScaleType r1 = r5.A03
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            X.JFx r1 = new X.JFx
            r1.<init>(r5, r6)
            r0.A02(r1, r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            X.MIi r2 = X.C66201MIi.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r0.A00(r3, r1, r2)
            int r1 = r5.A02
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            X.MIj r1 = X.C66202MIj.A00
            r0.A00(r2, r4, r1)
            float r1 = r5.A00
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            X.MIk r2 = X.C66203MIk.A00
            r1 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0.A00(r3, r1, r2)
            int r1 = r5.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            X.MIl r1 = X.C66204MIl.A00
            r0.A00(r2, r4, r1)
            r2 = 0
            X.MIm r1 = X.C66205MIm.A00
            r0.A00(r2, r2, r1)
            goto L_0x0a7c
        L_0x0295:
            X.2WE r6 = X.C51968G9o.A0f(r0)
            java.lang.Object r5 = r3.A02
            X.GxF r5 = (X.C53971GxF) r5
            X.3NV r2 = r5.A00
            boolean r0 = r5.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r5.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r4 = new java.lang.Object[]{r2, r1, r0}
            java.lang.Object r2 = r3.A01
            r1 = 34
            X.JG2 r0 = new X.JG2
            r0.<init>(r1, r2, r5)
            r6.A02(r0, r4)
            goto L_0x0a7c
        L_0x02bd:
            X.2WE r4 = X.C51968G9o.A0f(r0)
            java.lang.Object r1 = r3.A01
            X.3bE r1 = (X.C244463bE) r1
            java.lang.Object r3 = r3.A02
            X.GYW r3 = (X.GYW) r3
            boolean r0 = r3.A07
            r1.A00 = r0
            com.instagram.common.typedurl.ImageUrl r1 = r3.A03
            java.lang.String r5 = r1.getUrl()
            int r0 = r1.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r1.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.0iw r0 = r3.A01
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r2, r1, r0}
            r1 = 44
            X.JFt r0 = new X.JFt
            r0.<init>(r3, r1)
            r4.A02(r0, r2)
            android.widget.ImageView$ScaleType r2 = r3.A00
            X.GYS r1 = X.GYS.A00
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r4.A00(r2, r0, r1)
            r1 = 0
            X.JaF r0 = X.C59839JaF.A00
            r2 = 0
            r4.A00(r1, r1, r0)
            java.lang.String r1 = r3.A06
            X.JaG r0 = X.C59840JaG.A00
            r4.A00(r1, r2, r0)
            X.3Ni r1 = r3.A04
            X.JaH r0 = X.C59841JaH.A00
            r4.A00(r1, r2, r0)
            goto L_0x0a7c
        L_0x0313:
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            if (r0 == 0) goto L_0x0a7c
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r5) goto L_0x0a7c
            java.lang.Object r4 = r3.A02
            X.UaI r4 = (X.C15311UaI) r4
            java.lang.Object r3 = r3.A01
            android.view.View r3 = (android.view.View) r3
            X.U8t r0 = r4.A01()
            X.Vk6 r1 = r0.A07
            java.lang.String r0 = r0.A0C
            r1.A00(r0)
            r0 = 2131433855(0x7f0b197f, float:1.8489507E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r3, r0)
            r0 = 2131433848(0x7f0b1978, float:1.8489493E38)
            android.widget.TextView r6 = X.AnonymousClass7TG.A0R(r3, r0)
            r0 = 2131429392(0x7f0b0810, float:1.8480455E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r3, r0)
            r0 = 2131429391(0x7f0b080f, float:1.8480453E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r3, r0)
            r0 = 2131430936(0x7f0b0e18, float:1.8483587E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A01 = r0
            r0 = 2131435292(0x7f0b1f1c, float:1.8492422E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A02 = r0
            r0 = 2131964834(0x7f1333a2, float:1.956646E38)
            X.DbU.A1G(r7, r4, r0)
            r0 = 2131964833(0x7f1333a1, float:1.9566459E38)
            X.DbU.A1G(r6, r4, r0)
            r0 = 2131964832(0x7f1333a0, float:1.9566457E38)
            X.DbU.A1G(r2, r4, r0)
            r0 = 2131964831(0x7f13339f, float:1.9566455E38)
            X.DbU.A1G(r1, r4, r0)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r0 = r4.A05
            if (r0 == 0) goto L_0x037e
            r0.removeAllViews()
        L_0x037e:
            X.U8t r0 = r4.A01()
            com.instagram.leadgen.core.model.LeadGenBaseFormList r0 = r0.A08
            com.instagram.leadgen.core.api.LeadForm r1 = r0.A01
            if (r1 == 0) goto L_0x03c9
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.U5O r7 = new X.U5O
            r7.<init>(r0)
            java.lang.String r0 = r1.A02
            r7.setPrimaryText((java.lang.CharSequence) r0)
            java.lang.String r0 = r1.A03
            r7.setTag(r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r0 = 2131964712(0x7f133328, float:1.9566213E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r1, r0)
            X.U8t r0 = r4.A01()
            com.instagram.common.session.UserSession r2 = r0.A06
            r1 = 42
            X.WBA r0 = new X.WBA
            r0.<init>((java.lang.Object) r4, (int) r1)
            r7.setActionLabel(r6, r2, r0)
            r1 = 5
            X.Wem r0 = new X.Wem
            r0.<init>(r7, r1)
            r7.A9W(r0)
            r7.setChecked(r5)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r0 = r4.A05
            if (r0 == 0) goto L_0x03c9
            r0.addView(r7)
        L_0x03c9:
            android.view.View r1 = r4.A03
            if (r1 == 0) goto L_0x03dc
            r0 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.widget.TextView r1 = X.DbU.A0G(r1, r0)
            if (r1 == 0) goto L_0x03dc
            r0 = 2131970406(0x7f134966, float:1.9577762E38)
            X.DbU.A1G(r1, r4, r0)
        L_0x03dc:
            android.view.View r2 = r4.A03
            if (r2 == 0) goto L_0x03f8
            X.U8t r0 = r4.A01()
            X.2Fk r0 = r0.A05
            java.lang.Object r0 = r0.A02()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x047a
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r5) goto L_0x047a
        L_0x03f5:
            r2.setVisibility(r1)
        L_0x03f8:
            android.view.View r2 = r4.A03
            if (r2 == 0) goto L_0x0406
            r1 = 45
            X.WBA r0 = new X.WBA
            r0.<init>((java.lang.Object) r4, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x0406:
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x0419
            r0 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.widget.TextView r1 = X.DbU.A0G(r1, r0)
            if (r1 == 0) goto L_0x0419
            r0 = 2131964830(0x7f13339e, float:1.9566453E38)
            X.DbU.A1G(r1, r4, r0)
        L_0x0419:
            android.view.View r2 = r4.A01
            if (r2 == 0) goto L_0x0427
            r1 = 44
            X.WBA r0 = new X.WBA
            r0.<init>((java.lang.Object) r4, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x0427:
            r0 = 2131435337(0x7f0b1f49, float:1.8492513E38)
            android.view.ViewGroup r7 = X.DbX.A0I(r3, r0)
            r7.removeAllViews()
            java.util.List r0 = X.W3L.A05()
            java.util.Iterator r6 = r0.iterator()
        L_0x0439:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x047e
            java.lang.Object r3 = r6.next()
            com.instagram.api.schemas.XIGIGBoostCallToAction r3 = (com.instagram.api.schemas.XIGIGBoostCallToAction) r3
            android.content.Context r0 = r4.requireContext()
            X.U5O r2 = new X.U5O
            r2.<init>(r0)
            r2.setTag(r3)
            android.content.Context r1 = r4.requireContext()
            int r0 = X.C48959Emx.A00(r3)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r2.setPrimaryText((java.lang.CharSequence) r0)
            r1 = 7
            X.Wen r0 = new X.Wen
            r0.<init>(r1, r3, r4)
            r2.A9W(r0)
            r7.addView(r2)
            X.U8t r0 = r4.A01()
            com.instagram.leadgen.core.model.LeadGenBaseFormList r0 = r0.A08
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r0.A00
            if (r0 != r3) goto L_0x0439
            r2.setChecked(r5)
            goto L_0x0439
        L_0x047a:
            r1 = 8
            goto L_0x03f5
        L_0x047e:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r4.A04
            if (r2 == 0) goto L_0x0495
            X.U8t r0 = r4.A01()
            com.instagram.leadgen.core.model.LeadGenBaseFormList r1 = r0.A08
            com.instagram.leadgen.core.api.LeadForm r0 = r1.A01
            if (r0 == 0) goto L_0x0491
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r1.A00
            r0 = 1
            if (r1 != 0) goto L_0x0492
        L_0x0491:
            r0 = 0
        L_0x0492:
            r2.setPrimaryButtonEnabled(r0)
        L_0x0495:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r4.A04
            if (r2 == 0) goto L_0x04a3
            r1 = 43
            X.WBA r0 = new X.WBA
            r0.<init>((java.lang.Object) r4, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x04a3:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r5 = r4.A04
            if (r5 == 0) goto L_0x0a7c
            X.W3L r3 = X.VK1.A00
            android.content.Context r2 = r4.requireContext()
            X.U8t r0 = r4.A01()
            com.instagram.common.session.UserSession r1 = r0.A06
            goto L_0x068a
        L_0x04b5:
            X.X7s r0 = (X.C20979X7s) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r2 = r3.A01
            X.Vl6 r2 = (X.C18077Vl6) r2
            java.lang.Object r1 = r3.A02
            X.UKy r1 = (X.C15045UKy) r1
            java.util.List r1 = r1.A08
            java.lang.Object r1 = r1.get(r4)
            goto L_0x04ea
        L_0x04ca:
            X.X7s r0 = (X.C20979X7s) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r4 = r3.A01
            X.Vl6 r4 = (X.C18077Vl6) r4
            java.lang.Object r2 = r3.A02
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r2 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r2
            r1 = 1
            r4.A04(r2, r0, r1)
            goto L_0x0a7c
        L_0x04de:
            X.X7s r0 = (X.C20979X7s) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r2 = r3.A01
            X.Vl6 r2 = (X.C18077Vl6) r2
            java.lang.Object r1 = r3.A02
        L_0x04ea:
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r1 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r1
            r2.A04(r1, r0, r4)
            goto L_0x0a7c
        L_0x04f1:
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            if (r0 == 0) goto L_0x0a7c
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r5) goto L_0x0a7c
            java.lang.Object r4 = r3.A02
            X.UaM r4 = (X.UaM) r4
            java.lang.Object r3 = r3.A01
            android.view.View r3 = (android.view.View) r3
            X.Unn r0 = r4.A02()
            X.Vk6 r1 = r0.A05
            java.lang.String r0 = r0.A03()
            r1.A00(r0)
            r0 = 2131433855(0x7f0b197f, float:1.8489507E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r3, r0)
            r0 = 2131433848(0x7f0b1978, float:1.8489493E38)
            android.widget.TextView r6 = X.AnonymousClass7TG.A0R(r3, r0)
            r0 = 2131429392(0x7f0b0810, float:1.8480455E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r3, r0)
            r0 = 2131429391(0x7f0b080f, float:1.8480453E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r3, r0)
            r0 = 2131430936(0x7f0b0e18, float:1.8483587E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A01 = r0
            r0 = 2131435292(0x7f0b1f1c, float:1.8492422E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A02 = r0
            r0 = 2131964834(0x7f1333a2, float:1.956646E38)
            X.DbU.A1G(r7, r4, r0)
            r0 = 2131964833(0x7f1333a1, float:1.9566459E38)
            X.DbU.A1G(r6, r4, r0)
            r0 = 2131964832(0x7f1333a0, float:1.9566457E38)
            X.DbU.A1G(r2, r4, r0)
            r0 = 2131964831(0x7f13339f, float:1.9566455E38)
            X.DbU.A1G(r1, r4, r0)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r0 = r4.A05
            if (r0 == 0) goto L_0x055e
            r0.removeAllViews()
        L_0x055e:
            X.Unn r0 = r4.A02()
            com.instagram.leadgen.core.model.LeadGenBaseFormList r0 = r0.A02()
            com.instagram.leadgen.core.api.LeadForm r1 = r0.A01
            if (r1 == 0) goto L_0x05ad
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.U5O r7 = new X.U5O
            r7.<init>(r0)
            java.lang.String r0 = r1.A02
            r7.setPrimaryText((java.lang.CharSequence) r0)
            java.lang.String r0 = r1.A03
            r7.setTag(r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r0 = 2131964712(0x7f133328, float:1.9566213E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r1, r0)
            X.Unn r0 = r4.A02()
            com.instagram.common.session.UserSession r2 = r0.A01()
            r1 = 10
            X.WBA r0 = new X.WBA
            r0.<init>((java.lang.Object) r4, (int) r1)
            r7.setActionLabel(r6, r2, r0)
            r1 = 4
            X.Wem r0 = new X.Wem
            r0.<init>(r7, r1)
            r7.A9W(r0)
            r7.setChecked(r5)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r0 = r4.A05
            if (r0 == 0) goto L_0x05ad
            r0.addView(r7)
        L_0x05ad:
            android.view.View r1 = r4.A03
            if (r1 == 0) goto L_0x05c0
            r0 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.widget.TextView r1 = X.DbU.A0G(r1, r0)
            if (r1 == 0) goto L_0x05c0
            r0 = 2131970406(0x7f134966, float:1.9577762E38)
            X.DbU.A1G(r1, r4, r0)
        L_0x05c0:
            android.view.View r2 = r4.A03
            if (r2 == 0) goto L_0x05dc
            X.Unn r0 = r4.A02()
            X.2Fk r0 = r0.A04
            java.lang.Object r0 = r0.A02()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x0660
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r5) goto L_0x0660
        L_0x05d9:
            r2.setVisibility(r1)
        L_0x05dc:
            android.view.View r2 = r4.A03
            if (r2 == 0) goto L_0x05ea
            r1 = 12
            X.WBA r0 = new X.WBA
            r0.<init>((java.lang.Object) r4, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x05ea:
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x05fd
            r0 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.widget.TextView r1 = X.DbU.A0G(r1, r0)
            if (r1 == 0) goto L_0x05fd
            r0 = 2131964830(0x7f13339e, float:1.9566453E38)
            X.DbU.A1G(r1, r4, r0)
        L_0x05fd:
            android.view.View r2 = r4.A01
            if (r2 == 0) goto L_0x060b
            r1 = 11
            X.WBA r0 = new X.WBA
            r0.<init>((java.lang.Object) r4, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x060b:
            r0 = 2131435337(0x7f0b1f49, float:1.8492513E38)
            android.view.ViewGroup r7 = X.DbX.A0I(r3, r0)
            r7.removeAllViews()
            java.util.List r0 = X.W3L.A05()
            java.util.Iterator r6 = r0.iterator()
        L_0x061d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0664
            java.lang.Object r3 = r6.next()
            com.instagram.api.schemas.XIGIGBoostCallToAction r3 = (com.instagram.api.schemas.XIGIGBoostCallToAction) r3
            android.content.Context r0 = r4.requireContext()
            X.U5O r2 = new X.U5O
            r2.<init>(r0)
            r2.setTag(r3)
            android.content.Context r1 = r4.requireContext()
            int r0 = X.C48959Emx.A00(r3)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r2.setPrimaryText((java.lang.CharSequence) r0)
            r1 = 5
            X.Wen r0 = new X.Wen
            r0.<init>(r1, r3, r4)
            r2.A9W(r0)
            r7.addView(r2)
            X.Unn r0 = r4.A02()
            com.instagram.leadgen.core.model.LeadGenBaseFormList r0 = r0.A02()
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r0.A00
            if (r0 != r3) goto L_0x061d
            r2.setChecked(r5)
            goto L_0x061d
        L_0x0660:
            r1 = 8
            goto L_0x05d9
        L_0x0664:
            X.Unn r0 = r4.A02()
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x0a7c
            X.UaM.A00(r4)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r4.A04
            if (r1 == 0) goto L_0x067a
            r0 = 40
            X.LY6.A01(r1, r0, r4)
        L_0x067a:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r5 = r4.A04
            if (r5 == 0) goto L_0x0a7c
            X.W3L r3 = X.VK1.A00
            android.content.Context r2 = r4.requireContext()
            X.Unn r0 = r4.A02()
            com.instagram.common.session.UserSession r1 = r0.A02
        L_0x068a:
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            android.text.SpannableStringBuilder r0 = r3.A08(r0, r2, r1)
            r5.setFooterText(r0)
            goto L_0x0a7c
        L_0x0697:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r4 = r3.A01
            X.6vJ r4 = (X.C322136vJ) r4
            java.lang.Object r2 = r3.A02
            X.UYc r2 = (X.C15262UYc) r2
            X.M4X r1 = new X.M4X
            r1.<init>(r2)
            r4.submitList(r0, r1)
            goto L_0x0a7c
        L_0x06ab:
            long r6 = X.AnonymousClass7TE.A0R(r0)
            java.lang.Object r4 = r3.A02
            X.SHP r4 = (X.SHP) r4
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x06d5
            long r4 = java.lang.System.currentTimeMillis()
            r0 = 60
            long r6 = r6 * r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r0
            long r4 = r4 + r6
            java.lang.Object r1 = r3.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r1.invoke(r0)
            goto L_0x0a7c
        L_0x06d5:
            java.lang.Object r0 = r3.A01
            X.0sP r0 = (X.0sP) r0
            X.SHP.A00(r4, r0)
            goto L_0x0a7c
        L_0x06de:
            float r6 = X.AnonymousClass7TE.A04(r0)
            java.lang.Object r5 = r3.A02
            X.4WO r5 = (X.AnonymousClass4WO) r5
            android.view.ViewGroup r1 = X.AnonymousClass4WO.A00(r5)
            r4 = 0
            androidx.core.view.ViewKt$allViews$1 r0 = new androidx.core.view.ViewKt$allViews$1
            r0.<init>(r1, r4)
            X.GTJ r2 = X.AnonymousClass2YZ.A04(r0)
            java.lang.Object r1 = r3.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Float r0 = java.lang.Float.valueOf(r6)
            X.AnonymousClass4WO.A03(r1, r5, r4, r0, r2)
            goto L_0x0a7c
        L_0x0701:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x0a7c
            java.lang.Object r5 = r3.A01
            X.SHc r5 = (X.C11242SHc) r5
            java.lang.Object r4 = r3.A02
            X.0sP r4 = (X.0sP) r4
            X.0wj r3 = X.0wj.A01
            r2 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r1 = "IAB Save Link History error"
            X.AnonymousClass7TG.A1I(r3, r1, r0, r2)
            java.lang.String r2 = "history_write_error"
            r1 = 0
            X.C11242SHc.A00(r5, r2, r1)
            r4.invoke(r0)
            goto L_0x0a7c
        L_0x0722:
            java.lang.Object r4 = r3.A01
            X.SHc r4 = (X.C11242SHc) r4
            java.lang.String r2 = "history_write_finished"
            r1 = 0
            X.C11242SHc.A00(r4, r2, r1)
            goto L_0x074c
        L_0x072d:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r4 = r3.A01
            X.SHc r4 = (X.C11242SHc) r4
            java.lang.String r2 = r0.getMessage()
            if (r2 != 0) goto L_0x0747
            java.lang.String r2 = X.2Og.A00(r0)
            r1 = 300(0x12c, float:4.2E-43)
            java.lang.String r2 = X.00R.A03(r2, r1)
        L_0x0747:
            java.lang.String r1 = "opt_in_status_read_error"
            X.C11242SHc.A00(r4, r1, r2)
        L_0x074c:
            java.lang.Object r1 = r3.A02
            X.C51965G9l.A1W(r1, r0)
            goto L_0x0a7c
        L_0x0753:
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Object r4 = r3.A02
            X.K6s r4 = (X.C61421K6s) r4
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r4.A06
            r2 = 1
            if (r1 == 0) goto L_0x07d7
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r1 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r1
            boolean r1 = r1.A04
            if (r1 != r2) goto L_0x07d7
            java.lang.Object r1 = r3.A01
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            X.3QG r1 = r1.A1i
            int r2 = r1.A01
            int r1 = X.JTP.A09(r0)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r4.A06
            if (r0 == 0) goto L_0x077d
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r0 = r0.A02
            X.C63122Krq.A00(r0, r2, r1)
            goto L_0x0a7c
        L_0x077d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0782:
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Object r1 = r3.A01
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            X.3QG r5 = r1.A1i
            int r4 = r0.intValue()
            r5.A01 = r4
            java.lang.Object r3 = r3.A02
            X.K6s r3 = (X.C61421K6s) r3
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r2 = r3.A06
            r1 = 1
            if (r2 == 0) goto L_0x07d0
            r0 = r2
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r0
            boolean r0 = r0.A04
            if (r0 != r1) goto L_0x07d0
        L_0x07a0:
            java.lang.String r6 = "videoPreviewDelegate"
            if (r1 == 0) goto L_0x07b8
            int r1 = r5.A00
            if (r2 == 0) goto L_0x07d2
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r2 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r2
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r0 = r2.A02
            X.C63122Krq.A00(r0, r4, r1)
        L_0x07af:
            X.9Pn r0 = r3.A04
            if (r0 == 0) goto L_0x07dd
            r0.CnC()
            goto L_0x0a7c
        L_0x07b8:
            X.9Pn r0 = r3.A04
            if (r0 == 0) goto L_0x07dd
            X.0eM r0 = r3.A0A
            X.JhP r0 = X.JTT.A0V(r0)
            X.2Fj r1 = r0.A00
            X.9Pn r0 = r3.A04
            if (r0 == 0) goto L_0x07dd
            com.instagram.filterkit.filter.VideoFilter r0 = r0.B5q()
            r1.A0B(r0)
            goto L_0x07af
        L_0x07d0:
            r1 = 0
            goto L_0x07a0
        L_0x07d2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x07d7:
            X.9Pn r1 = r4.A04
            if (r1 != 0) goto L_0x07e5
            java.lang.String r6 = "videoPreviewDelegate"
        L_0x07dd:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x07e5:
            X.0qQ.A0A(r0)
            r0.intValue()
            goto L_0x0a7c
        L_0x07ed:
            double r4 = X.JTO.A00(r0)
            java.lang.Object r0 = r3.A02
            com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker r0 = (com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker) r0
            android.os.Handler r2 = r0.A07
            java.lang.Object r1 = r3.A01
            X.0sP r1 = (X.0sP) r1
            X.M7c r0 = new X.M7c
            r0.<init>(r1, r4)
            r2.post(r0)
            goto L_0x0a7c
        L_0x0805:
            com.instagram.igsignals.core.IgSignalsModelPrediction r0 = (com.instagram.igsignals.core.IgSignalsModelPrediction) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r4 = r3.A02
            X.LsL r4 = (X.C65380LsL) r4
            boolean r1 = r0.A06
            if (r1 != 0) goto L_0x081a
            X.MOH r1 = X.MOH.A00
            X.C65380LsL.A00(r4, r0, r1)
            goto L_0x0a7c
        L_0x081a:
            java.util.concurrent.locks.ReentrantLock r3 = r4.A08
            r3.lock()
            X.Vzm r1 = r0.A02     // Catch:{ all -> 0x083d }
            if (r1 == 0) goto L_0x082c
            java.util.Map r2 = r4.A06     // Catch:{ all -> 0x083d }
            java.lang.String r1 = r1.A00()     // Catch:{ all -> 0x083d }
            r2.put(r1, r0)     // Catch:{ all -> 0x083d }
        L_0x082c:
            java.util.List r2 = r4.A01     // Catch:{ all -> 0x083d }
            if (r2 == 0) goto L_0x0838
            r1 = 6
            X.MPA r1 = X.MPA.A00(r2, r1)     // Catch:{ all -> 0x083d }
            X.C65380LsL.A00(r4, r0, r1)     // Catch:{ all -> 0x083d }
        L_0x0838:
            r3.unlock()
            goto L_0x0a7c
        L_0x083d:
            r0 = move-exception
            r3.unlock()
            throw r0
        L_0x0842:
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            int r0 = r0.A05
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.Object r0 = r3.A01
            java.util.Set r0 = (java.util.Set) r0
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L_0x085f
            java.lang.Object r0 = r3.A02
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r2)
        L_0x085f:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            return r7
        L_0x0864:
            X.N8r r0 = (X.C68280N8r) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r6 = r3.A02
            X.NdD r6 = (X.C69028NdD) r6
            java.lang.Object r5 = r3.A01
            X.O93 r5 = (X.O93) r5
            X.JM9 r1 = r6.A0O()
            X.N8r r1 = (X.C68280N8r) r1
            java.util.Set r2 = r1.A03
            boolean r1 = r2 instanceof java.util.Collection
            r7 = 0
            if (r1 == 0) goto L_0x08b6
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x08b6
        L_0x0885:
            X.JM9 r1 = r6.A0O()
            X.N8r r1 = (X.C68280N8r) r1
            java.util.Set r1 = r1.A03
            boolean r8 = X.C69028NdD.A0N(r6, r1)
            X.JM9 r1 = r6.A0O()
            X.N8r r1 = (X.C68280N8r) r1
            java.util.Set r1 = r1.A03
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r1.iterator()
        L_0x08a1:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x08cc
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.N4t r1 = (X.N4t) r1
            boolean r1 = r1.A0J
            if (r1 == 0) goto L_0x08a1
            r4.add(r2)
            goto L_0x08a1
        L_0x08b6:
            java.util.Iterator r2 = r2.iterator()
        L_0x08ba:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0885
            java.lang.Object r1 = r2.next()
            X.N4t r1 = (X.N4t) r1
            boolean r1 = r1.A0H
            if (r1 == 0) goto L_0x08ba
            r7 = 1
            goto L_0x0885
        L_0x08cc:
            int r1 = r4.size()
            X.Gmr r2 = X.C69028NdD.A07(r5, r6, r1, r7, r8)
            java.util.Set r1 = r0.A03
            java.util.List r0 = r0.A02
            X.N8r r7 = X.C68280N8r.A00(r5, r2, r0, r1)
            return r7
        L_0x08dd:
            X.GqH r0 = (X.C53546GqH) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r8 = r3.A01
            X.4A5 r8 = (X.AnonymousClass4A5) r8
            X.4A5 r1 = X.AnonymousClass4A5.PRIVATE
            boolean r1 = X.AnonymousClass7TF.A1W(r8, r1)
            r15 = r1 ^ 1
            java.lang.Object r1 = r3.A02
            X.HBN r1 = (X.HBN) r1
            X.4A5 r1 = r1.A00
            boolean r13 = X.C51969G9p.A1a(r8, r1)
            boolean r12 = r0.A0A
            boolean r14 = r0.A08
            int r9 = r0.A02
            boolean r3 = r0.A06
            boolean r2 = r0.A05
            int r10 = r0.A00
            int r11 = r0.A01
            boolean r1 = r0.A07
            boolean r0 = r0.A09
            X.0qQ.A0B(r8, r4)
            X.GqH r7 = new X.GqH
            r16 = r3
            r17 = r2
            r18 = r1
            r19 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r7
        L_0x091c:
            X.GqH r0 = (X.C53546GqH) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r8 = r3.A01
            X.4A5 r8 = (X.AnonymousClass4A5) r8
            X.4A5 r1 = X.AnonymousClass4A5.PRIVATE
            r13 = 0
            boolean r15 = X.C51969G9p.A1a(r8, r1)
            java.lang.Object r1 = r3.A02
            X.HBN r1 = (X.HBN) r1
            X.4A5 r1 = r1.A00
            if (r8 == r1) goto L_0x0946
            X.4A5 r1 = X.AnonymousClass4A5.ALLOWLIST
            if (r8 != r1) goto L_0x093d
            int r1 = r0.A00
            if (r1 == 0) goto L_0x0946
        L_0x093d:
            X.4A5 r1 = X.AnonymousClass4A5.BLOCKLIST
            if (r8 != r1) goto L_0x0945
            int r1 = r0.A01
            if (r1 == 0) goto L_0x0946
        L_0x0945:
            r13 = 1
        L_0x0946:
            boolean r12 = r0.A0A
            boolean r14 = r0.A08
            int r9 = r0.A02
            boolean r3 = r0.A06
            boolean r2 = r0.A05
            int r10 = r0.A00
            int r11 = r0.A01
            boolean r1 = r0.A07
            boolean r0 = r0.A09
            X.0qQ.A0B(r8, r4)
            X.GqH r7 = new X.GqH
            r16 = r3
            r17 = r2
            r18 = r1
            r19 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r7
        L_0x0969:
            X.GqH r0 = (X.C53546GqH) r0
            r7 = 0
            X.0qQ.A0B(r0, r7)
            java.lang.Object r1 = r3.A02
            X.HBN r1 = (X.HBN) r1
            java.lang.Object r4 = r3.A01
            X.4A6 r4 = (X.AnonymousClass4A6) r4
            boolean r6 = r1.A04
            X.4A5 r10 = r4.A04
            r3 = r10
            X.4A5 r2 = X.AnonymousClass4A5.UNSET
            if (r10 == r2) goto L_0x0986
            X.4A5 r1 = X.AnonymousClass4A5.PRIVATE
            if (r10 != r1) goto L_0x09be
            if (r6 == 0) goto L_0x09be
        L_0x0986:
            X.4A5 r10 = X.AnonymousClass4A5.A01
        L_0x0988:
            boolean r8 = r4.A07
            r16 = r8 ^ 1
            if (r6 != 0) goto L_0x0994
            X.4A5 r1 = X.AnonymousClass4A5.PRIVATE
            r17 = 0
            if (r3 == r1) goto L_0x0998
        L_0x0994:
            r17 = 1
            if (r6 != 0) goto L_0x099b
        L_0x0998:
            r15 = 0
            if (r3 != r2) goto L_0x099c
        L_0x099b:
            r15 = 1
        L_0x099c:
            int r5 = r4.A00
            int r4 = r4.A01
            int r3 = r0.A02
            boolean r2 = r0.A06
            boolean r1 = r0.A05
            boolean r0 = r0.A07
            X.0qQ.A0B(r10, r7)
            X.GqH r7 = new X.GqH
            r9 = r7
            r11 = r3
            r12 = r5
            r13 = r4
            r14 = r8
            r18 = r2
            r19 = r1
            r20 = r0
            r21 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r7
        L_0x09be:
            X.4A5 r1 = X.AnonymousClass4A5.INTERNAL
            if (r10 != r1) goto L_0x0988
            X.4A5 r10 = X.AnonymousClass4A5.MUTUAL_FOLLOWS
            goto L_0x0988
        L_0x09c5:
            int r17 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r3.A02
            X.Gzz r0 = (X.C54130Gzz) r0
            X.0eM r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.HBN r0 = (X.HBN) r0
            java.lang.Object r9 = r3.A01
            X.4A5 r9 = (X.AnonymousClass4A5) r9
            r8 = 0
            X.0qQ.A0B(r9, r8)
            com.instagram.friendmap.data.FriendMapRepository r0 = r0.A03
            X.05G r7 = r0.A0I
        L_0x09e1:
            java.lang.Object r6 = r7.getValue()
            r13 = r6
            X.4A6 r13 = (X.AnonymousClass4A6) r13
            int r1 = r9.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x0a24
            r12 = 5
            if (r1 != r12) goto L_0x0a1d
            X.4A5 r11 = r13.A04
            long r3 = r13.A03
            boolean r10 = r13.A07
            int r5 = r13.A00
            java.util.List r2 = r13.A06
            int r1 = r13.A02
            java.util.List r0 = r13.A05
            X.0qQ.A0B(r11, r8)
            X.AnonymousClass7TF.A1E(r2, r12, r0)
            X.4A6 r13 = new X.4A6
            r18 = r13
            r19 = r11
            r20 = r2
            r21 = r0
            r22 = r5
            r23 = r17
            r24 = r1
            r25 = r3
            r27 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r27)
        L_0x0a1d:
            boolean r0 = r7.AIY(r6, r13)
            if (r0 == 0) goto L_0x09e1
            goto L_0x0a7c
        L_0x0a24:
            X.4A5 r14 = r13.A04
            long r0 = r13.A03
            boolean r10 = r13.A07
            int r5 = r13.A01
            java.util.List r15 = r13.A06
            int r4 = r13.A02
            java.util.List r3 = r13.A05
            X.DbW.A1N(r14, r8, r15)
            r2 = 7
            X.0qQ.A0B(r3, r2)
            X.4A6 r13 = new X.4A6
            r16 = r3
            r18 = r5
            r19 = r4
            r20 = r0
            r22 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r22)
            goto L_0x0a1d
        L_0x0a49:
            int r2 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r1 = r3.A02
            X.5Tq r1 = (X.C286025Tq) r1
            java.lang.String r0 = "link"
            java.util.List r0 = r1.A06(r0, r2, r2)
            java.lang.Object r0 = X.00k.A0J(r0)
            X.62b r0 = (X.C3022062b) r0
            if (r0 == 0) goto L_0x0a7c
            java.lang.Object r2 = r3.A01
            X.Hiq r2 = (X.C55508Hiq) r2
            java.lang.Object r1 = r0.A02
            r0 = 776(0x308, float:1.087E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0a7c
            X.Gzz r1 = r2.A00
            X.0eM r0 = r1.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.C71054OaW.A02(r1, r0)
        L_0x0a7c:
            X.0gF r7 = X.C60340gF.A00
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MPB.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MPB(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
