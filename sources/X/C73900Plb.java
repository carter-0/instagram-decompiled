package X;

/* renamed from: X.Plb  reason: case insensitive filesystem */
public final class C73900Plb extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73900Plb(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C73900Plb(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0439, code lost:
        r1 = X.182.A06(r2, r3, r0);
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x043e, code lost:
        if (r1 != false) goto L_0x0441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0440, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0445, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r3.invoke();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0116;
                case 1: goto L_0x0149;
                case 2: goto L_0x016d;
                case 3: goto L_0x0191;
                case 4: goto L_0x002b;
                case 5: goto L_0x0037;
                case 6: goto L_0x01ae;
                case 7: goto L_0x01c9;
                case 8: goto L_0x01ed;
                case 9: goto L_0x0211;
                case 10: goto L_0x022c;
                case 11: goto L_0x0246;
                case 12: goto L_0x0260;
                case 13: goto L_0x0273;
                case 14: goto L_0x0285;
                case 15: goto L_0x0048;
                case 16: goto L_0x0297;
                case 17: goto L_0x02bb;
                case 18: goto L_0x005d;
                case 19: goto L_0x02c9;
                case 20: goto L_0x02d4;
                case 21: goto L_0x02e2;
                case 22: goto L_0x00b6;
                case 23: goto L_0x02f0;
                case 24: goto L_0x02fe;
                case 25: goto L_0x0310;
                case 26: goto L_0x032f;
                case 27: goto L_0x0341;
                case 28: goto L_0x0353;
                case 29: goto L_0x0365;
                case 30: goto L_0x0373;
                case 31: goto L_0x0385;
                case 32: goto L_0x0390;
                case 33: goto L_0x039c;
                case 34: goto L_0x03ae;
                case 35: goto L_0x03bc;
                case 36: goto L_0x03ca;
                case 37: goto L_0x03dc;
                case 38: goto L_0x03ea;
                case 39: goto L_0x03fc;
                case 40: goto L_0x0412;
                case 41: goto L_0x0424;
                case 42: goto L_0x0446;
                case 43: goto L_0x0458;
                case 44: goto L_0x047a;
                case 45: goto L_0x00cd;
                case 46: goto L_0x010d;
                case 47: goto L_0x048a;
                case 48: goto L_0x04ab;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            X.PMU r0 = (X.PMU) r0
            X.OYY r0 = r0.A08()
            X.Nen r1 = r0.A00
            X.C69108Nen.A00(r1)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0028
            com.facebook.rsys.audio.gen.AudioOutputRoute r2 = com.facebook.rsys.audio.gen.AudioOutputRoute.SPEAKER
        L_0x0018:
            X.Ocu r1 = r1.A0L
            X.0qQ.A0A(r2)
            X.PLZ r0 = new X.PLZ
            r0.<init>(r2)
            r1.A03(r0)
        L_0x0025:
            X.0gF r6 = X.C60340gF.A00
        L_0x0027:
            return r6
        L_0x0028:
            com.facebook.rsys.audio.gen.AudioOutputRoute r2 = com.facebook.rsys.audio.gen.AudioOutputRoute.EARPIECE
            goto L_0x0018
        L_0x002b:
            X.2S0 r2 = X.AnonymousClass2S0.A01
            r0 = 5
            r2.A05(r0)
            java.lang.Object r3 = r12.A01
            X.0sa r3 = (X.C62320sa) r3
            goto L_0x0044
        L_0x0037:
            java.lang.Object r3 = r12.A01
            X.0sa r3 = (X.C62320sa) r3
            if (r3 == 0) goto L_0x0025
            X.2S0 r2 = X.AnonymousClass2S0.A01
            r0 = 5
            r2.A05(r0)
        L_0x0044:
            r3.invoke()
            goto L_0x0025
        L_0x0048:
            java.lang.Object r1 = r12.A01
            X.PMT r1 = (X.PMT) r1
            r0 = 0
            X.PMT.A02(r1, r0)
            X.0eM r0 = r1.A0A
            java.lang.Object r1 = r0.getValue()
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0 = 0
            r1.setProgress(r0)
            goto L_0x0025
        L_0x005d:
            java.lang.Object r4 = r12.A01
            X.PM4 r4 = (X.PM4) r4
            android.view.View r0 = r4.A01
            android.content.Context r5 = r0.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r5)
            r2 = 2131624680(0x7f0e02e8, float:1.8876547E38)
            X.0eM r0 = r4.A02
            android.view.ViewGroup r1 = X.C66583MXo.A0C(r0)
            r0 = 0
            android.view.View r6 = X.DbW.A09(r3, r1, r2, r0)
            r0 = 2131428450(0x7f0b0462, float:1.8478545E38)
            android.view.View r3 = r6.findViewById(r0)
            com.instagram.igds.components.button.IgdsButton r3 = (com.instagram.igds.components.button.IgdsButton) r3
            r0 = 2131428451(0x7f0b0463, float:1.8478547E38)
            android.view.View r2 = r6.findViewById(r0)
            com.instagram.igds.components.button.IgdsButton r2 = (com.instagram.igds.components.button.IgdsButton) r2
            if (r3 == 0) goto L_0x0027
            if (r2 == 0) goto L_0x0027
            android.content.res.Resources r1 = X.DbU.A05(r6)
            r0 = 2131956842(0x7f13146a, float:1.9550251E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setText((java.lang.String) r0)
            r0 = 29
            X.C71396Ojv.A00(r3, r0, r4)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131954725(0x7f130c25, float:1.9545957E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText((java.lang.String) r0)
            r0 = 30
            X.C71396Ojv.A00(r2, r0, r4)
            return r6
        L_0x00b6:
            java.lang.Object r0 = r12.A01
            X.PMP r0 = (X.PMP) r0
            android.view.View r1 = r0.A05
            r0 = 2131428952(0x7f0b0658, float:1.8479563E38)
            android.view.View r6 = r1.findViewById(r0)
            if (r6 != 0) goto L_0x0027
            r0 = 2131428953(0x7f0b0659, float:1.8479565E38)
            android.view.View r6 = X.JTR.A0V(r1, r0)
            return r6
        L_0x00cd:
            java.lang.Object r0 = r12.A01
            X.PMU r0 = (X.PMU) r0
            X.OYY r0 = r0.A08()
            X.Nen r2 = r0.A00
            X.C69108Nen.A00(r2)
            X.0eM r1 = r2.A0U
            java.lang.Object r0 = r1.getValue()
            X.SJD r0 = (X.SJD) r0
            java.lang.String r4 = "android.permission.RECORD_AUDIO"
            X.OKx r0 = r0.A04
            android.app.Activity r0 = r0.A01
            boolean r0 = X.1DL.A07(r0, r4)
            if (r0 == 0) goto L_0x00f3
            X.C69108Nen.A02(r2)
            goto L_0x0025
        L_0x00f3:
            r3 = 1
            r2.A09 = r3
            java.lang.Object r2 = r1.getValue()
            X.SJD r2 = (X.SJD) r2
            r1 = 2131966510(0x7f133a2e, float:1.956986E38)
            X.QPm r0 = new X.QPm
            r0.<init>(r4, r1)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.SJD.A00(r2, r0, r3)
            goto L_0x0025
        L_0x010d:
            java.lang.Object r0 = r12.A01
            X.PMU r0 = (X.PMU) r0
            r0.A08()
            goto L_0x0025
        L_0x0116:
            java.lang.Object r3 = r12.A01
            X.PMT r3 = (X.PMT) r3
            X.0eM r0 = r3.A0L
            android.view.View r2 = X.AnonymousClass7TH.A06(r0)
            com.instagram.common.session.UserSession r0 = r3.A06
            java.lang.Boolean r0 = X.C306096Kt.A00(r0)
            boolean r1 = r0.booleanValue()
            r0 = 2131238141(0x7f081cfd, float:1.8092552E38)
            if (r1 == 0) goto L_0x0132
            r0 = 2131238609(0x7f081ed1, float:1.8093502E38)
        L_0x0132:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            X.O9k r1 = r3.A05()
            r0 = 52
            X.PgO r5 = X.C66580MXl.A15(r1, r0)
            r6 = 0
            r7 = 2131432878(0x7f0b15ae, float:1.8487526E38)
            com.instagram.rtc.presentation.arsidebar.ArSidebarButton r6 = X.PMT.A00(r2, r3, r4, r5, r6, r7)
            return r6
        L_0x0149:
            java.lang.Object r3 = r12.A01
            X.PMT r3 = (X.PMT) r3
            X.0eM r0 = r3.A0L
            android.view.View r2 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131237496(0x7f081a78, float:1.8091244E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            X.O9k r1 = r3.A05()
            r0 = 53
            X.PgO r5 = X.C66580MXl.A15(r1, r0)
            r6 = 0
            r7 = 2131437651(0x7f0b2853, float:1.8497207E38)
            com.instagram.rtc.presentation.arsidebar.ArSidebarButton r6 = X.PMT.A00(r2, r3, r4, r5, r6, r7)
            return r6
        L_0x016d:
            java.lang.Object r3 = r12.A01
            X.PMT r3 = (X.PMT) r3
            X.0eM r0 = r3.A0L
            android.view.View r2 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131238722(0x7f081f42, float:1.809373E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            X.O9k r1 = r3.A05()
            r0 = 54
            X.PgO r5 = X.C66580MXl.A15(r1, r0)
            r6 = 0
            r7 = 2131439958(0x7f0b3156, float:1.8501886E38)
            com.instagram.rtc.presentation.arsidebar.ArSidebarButton r6 = X.PMT.A00(r2, r3, r4, r5, r6, r7)
            return r6
        L_0x0191:
            android.view.View$AccessibilityDelegate r0 = X.02Z.A02
            java.lang.Object r2 = r12.A01
            X.PMT r2 = (X.PMT) r2
            X.0eM r0 = r2.A0N
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            X.0eM r0 = r2.A0O
            java.lang.Object r0 = r0.getValue()
            com.instagram.rtc.presentation.arsidebar.RtcCallArSidebarTouchUpSlider r0 = (com.instagram.rtc.presentation.arsidebar.RtcCallArSidebarTouchUpSlider) r0
            X.0qQ.A07(r0)
            X.MtJ r6 = new X.MtJ
            r6.<init>(r1, r0)
            return r6
        L_0x01ae:
            java.lang.Object r0 = r12.A01
            X.PMT r0 = (X.PMT) r0
            android.view.ViewGroup r1 = r0.A04
            r0 = 2131441375(0x7f0b36df, float:1.850476E38)
            android.view.View r6 = X.JTR.A0V(r1, r0)
            X.GIa r2 = com.instagram.igds.components.gradient.IGGradientView.A00
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            r0 = 76
            android.graphics.drawable.GradientDrawable r0 = r2.A01(r1, r0)
            r6.setBackground(r0)
            return r6
        L_0x01c9:
            java.lang.Object r3 = r12.A01
            X.PMT r3 = (X.PMT) r3
            X.0eM r0 = r3.A0L
            android.view.View r2 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131238626(0x7f081ee2, float:1.8093536E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            X.O9k r1 = r3.A05()
            r0 = 55
            X.PgO r5 = X.C66580MXl.A15(r1, r0)
            r6 = 0
            r7 = 2131441551(0x7f0b378f, float:1.8505117E38)
            com.instagram.rtc.presentation.arsidebar.ArSidebarButton r6 = X.PMT.A00(r2, r3, r4, r5, r6, r7)
            return r6
        L_0x01ed:
            java.lang.Object r3 = r12.A01
            X.PMT r3 = (X.PMT) r3
            X.0eM r0 = r3.A0L
            android.view.View r2 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131238518(0x7f081e76, float:1.8093317E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            X.O9k r1 = r3.A05()
            r0 = 56
            X.PgO r5 = X.C66580MXl.A15(r1, r0)
            r6 = 0
            r7 = 2131443122(0x7f0b3db2, float:1.8508303E38)
            com.instagram.rtc.presentation.arsidebar.ArSidebarButton r6 = X.PMT.A00(r2, r3, r4, r5, r6, r7)
            return r6
        L_0x0211:
            java.lang.Object r2 = r12.A01
            X.PMT r2 = (X.PMT) r2
            X.0eM r0 = r2.A0L
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131443123(0x7f0b3db3, float:1.8508305E38)
            android.view.View r6 = r1.findViewById(r0)
            com.instagram.rtc.presentation.arsidebar.RtcCallArSidebarTouchUpSlider r6 = (com.instagram.rtc.presentation.arsidebar.RtcCallArSidebarTouchUpSlider) r6
            X.POU r0 = new X.POU
            r0.<init>(r2)
            r6.A01 = r0
            return r6
        L_0x022c:
            java.lang.Object r0 = r12.A01
            X.PMT r0 = (X.PMT) r0
            android.view.ViewGroup r0 = r0.A04
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165224(0x7f070028, float:1.794466E38)
            float r0 = r1.getDimension(r0)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            return r6
        L_0x0246:
            java.lang.Object r0 = r12.A01
            X.PMT r0 = (X.PMT) r0
            android.view.ViewGroup r0 = r0.A04
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165324(0x7f07008c, float:1.7944862E38)
            float r0 = r1.getDimension(r0)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            return r6
        L_0x0260:
            java.lang.Object r0 = r12.A01
            X.PMT r0 = (X.PMT) r0
            android.view.ViewGroup r0 = r0.A04
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            float r0 = X.JTR.A02(r0)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            return r6
        L_0x0273:
            java.lang.Object r0 = r12.A01
            X.PMT r0 = (X.PMT) r0
            X.0eM r0 = r0.A0L
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131443124(0x7f0b3db4, float:1.8508307E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x0285:
            java.lang.Object r0 = r12.A01
            X.PMT r0 = (X.PMT) r0
            X.0eM r0 = r0.A0L
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131443125(0x7f0b3db5, float:1.850831E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x0297:
            java.lang.Object r3 = r12.A01
            X.PMT r3 = (X.PMT) r3
            X.0eM r0 = r3.A0L
            android.view.View r2 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131238332(0x7f081dbc, float:1.809294E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            X.O9k r1 = r3.A05()
            r0 = 57
            X.PgO r5 = X.C66580MXl.A15(r1, r0)
            r6 = 0
            r7 = 2131443975(0x7f0b4107, float:1.8510033E38)
            com.instagram.rtc.presentation.arsidebar.ArSidebarButton r6 = X.PMT.A00(r2, r3, r4, r5, r6, r7)
            return r6
        L_0x02bb:
            java.lang.Object r0 = r12.A01
            X.PM4 r0 = (X.PM4) r0
            android.view.View r1 = r0.A01
            r0 = 2131428963(0x7f0b0663, float:1.8479585E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x02c9:
            java.lang.Object r0 = r12.A01
            X.Nem r0 = (X.C69107Nem) r0
            android.app.Activity r0 = r0.A08
            java.lang.Object r6 = X.C66582MXn.A0o(r0)
            return r6
        L_0x02d4:
            java.lang.Object r0 = r12.A01
            X.PMP r0 = (X.PMP) r0
            android.view.View r1 = r0.A05
            r0 = 2131428963(0x7f0b0663, float:1.8479585E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x02e2:
            java.lang.Object r0 = r12.A01
            X.PMP r0 = (X.PMP) r0
            android.view.View r1 = r0.A05
            r0 = 2131430808(0x7f0b0d98, float:1.8483327E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x02f0:
            java.lang.Object r0 = r12.A01
            X.PMD r0 = (X.PMD) r0
            android.view.View r1 = r0.A00
            r0 = 2131427890(0x7f0b0232, float:1.847741E38)
            X.3Nc r6 = X.C240903Nb.A00(r1, r0)
            return r6
        L_0x02fe:
            java.lang.Object r0 = r12.A01
            X.PMD r0 = (X.PMD) r0
            X.0eM r0 = r0.A08
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131443783(0x7f0b4047, float:1.8509644E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x0310:
            java.lang.Object r2 = r12.A01
            X.PMD r2 = (X.PMD) r2
            X.0eM r0 = r2.A08
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131443784(0x7f0b4048, float:1.8509646E38)
            android.view.View r6 = r1.findViewById(r0)
            X.0eM r0 = r2.A04
            java.lang.Object r2 = r0.getValue()
            com.instagram.ui.widget.imageview.PulsingMultiImageView r2 = (com.instagram.ui.widget.imageview.PulsingMultiImageView) r2
            r0 = 1333(0x535, double:6.586E-321)
            r2.setPulseDurationMs(r0)
            return r6
        L_0x032f:
            java.lang.Object r0 = r12.A01
            X.PMD r0 = (X.PMD) r0
            X.0eM r0 = r0.A08
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131443807(0x7f0b405f, float:1.8509693E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x0341:
            java.lang.Object r0 = r12.A01
            X.PMD r0 = (X.PMD) r0
            X.0eM r0 = r0.A08
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131443781(0x7f0b4045, float:1.850964E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x0353:
            java.lang.Object r0 = r12.A01
            X.PMD r0 = (X.PMD) r0
            X.0eM r0 = r0.A09
            android.view.View r6 = X.JTR.A0W(r0)
            r0 = 1
            r6.setFitsSystemWindows(r0)
            r6.requestApplyInsets()
            return r6
        L_0x0365:
            java.lang.Object r0 = r12.A01
            X.PMD r0 = (X.PMD) r0
            android.view.View r1 = r0.A00
            r0 = 2131429357(0x7f0b07ed, float:1.8480384E38)
            X.3Nc r6 = X.C240903Nb.A00(r1, r0)
            return r6
        L_0x0373:
            java.lang.Object r0 = r12.A01
            X.PMD r0 = (X.PMD) r0
            X.0eM r0 = r0.A08
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131443782(0x7f0b4046, float:1.8509642E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x0385:
            java.lang.Object r0 = r12.A01
            X.PM2 r0 = (X.PM2) r0
            X.0eM r0 = r0.A01
            android.view.View r6 = X.JTR.A0W(r0)
            return r6
        L_0x0390:
            java.lang.Object r1 = r12.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131429371(0x7f0b07fb, float:1.8480413E38)
            X.3Nc r6 = X.C240903Nb.A00(r1, r0)
            return r6
        L_0x039c:
            java.lang.Object r0 = r12.A01
            X.PM2 r0 = (X.PM2) r0
            X.0eM r0 = r0.A00
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131443787(0x7f0b404b, float:1.8509652E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x03ae:
            java.lang.Object r0 = r12.A01
            X.NeK r0 = (X.C69080NeK) r0
            android.content.Context r1 = r0.A05
            r0 = 2131976537(0x7f136159, float:1.9590197E38)
            java.lang.String r6 = r1.getString(r0)
            return r6
        L_0x03bc:
            java.lang.Object r0 = r12.A01
            X.NeK r0 = (X.C69080NeK) r0
            android.content.Context r1 = r0.A05
            r0 = 2131976542(0x7f13615e, float:1.9590207E38)
            java.lang.String r6 = r1.getString(r0)
            return r6
        L_0x03ca:
            java.lang.Object r0 = r12.A01
            X.NeK r0 = (X.C69080NeK) r0
            com.instagram.common.session.UserSession r3 = r0.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342172561317839027(0x20811189000440b3, double:4.073685254270149E-152)
            java.lang.Boolean r6 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r6
        L_0x03dc:
            java.lang.Object r0 = r12.A01
            X.NeK r0 = (X.C69080NeK) r0
            android.content.Context r1 = r0.A05
            r0 = 2131976579(0x7f136183, float:1.9590283E38)
            java.lang.String r6 = r1.getString(r0)
            return r6
        L_0x03ea:
            java.lang.Object r0 = r12.A01
            X.Nen r0 = (X.C69108Nen) r0
            android.view.ViewGroup r0 = r0.A0G
            android.content.Context r1 = r0.getContext()
            r0 = 2131954443(0x7f130b0b, float:1.9545385E38)
            java.lang.String r6 = r1.getString(r0)
            return r6
        L_0x03fc:
            java.lang.Object r1 = r12.A01
            X.Nen r1 = (X.C69108Nen) r1
            X.0eM r0 = r1.A0R
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0440
            com.instagram.common.session.UserSession r3 = r1.A0H
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316985029628646(0x81061b000112e6, double:3.0303457972735354E-306)
            goto L_0x0439
        L_0x0412:
            java.lang.Object r0 = r12.A01
            X.Nen r0 = (X.C69108Nen) r0
            com.instagram.common.session.UserSession r3 = r0.A0H
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316985029563109(0x81061b000012e5, double:3.0303457972320896E-306)
            java.lang.Boolean r6 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r6
        L_0x0424:
            java.lang.Object r1 = r12.A01
            X.Nen r1 = (X.C69108Nen) r1
            X.0eM r0 = r1.A0R
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0440
            com.instagram.common.session.UserSession r3 = r1.A0H
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316985029694183(0x81061b000212e7, double:3.030345797314981E-306)
        L_0x0439:
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0441
        L_0x0440:
            r0 = 0
        L_0x0441:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x0446:
            java.lang.Object r0 = r12.A01
            X.Nen r0 = (X.C69108Nen) r0
            com.instagram.common.session.UserSession r3 = r0.A0H
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317380166554714(0x8106770000145a, double:3.0305956834566695E-306)
            java.lang.Boolean r6 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r6
        L_0x0458:
            java.lang.Object r2 = r12.A01
            X.Nen r2 = (X.C69108Nen) r2
            com.instagram.common.session.UserSession r9 = r2.A0H
            android.app.Activity r7 = r2.A0F
            android.view.View r1 = X.C66581MXm.A0A(r7)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r8 = X.AnonymousClass7TE.A0b(r1, r0)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            X.POe r11 = new X.POe
            r11.<init>(r2)
            X.OKx r10 = r2.A0O
            X.SJD r6 = new X.SJD
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x047a:
            java.lang.Object r0 = r12.A01
            X.Nen r0 = (X.C69108Nen) r0
            android.app.Activity r0 = r0.A0F
            android.content.Context r0 = X.DbT.A05(r0)
            X.OVK r6 = new X.OVK
            r6.<init>(r0)
            return r6
        L_0x048a:
            java.lang.Object r4 = r12.A01
            X.PMU r4 = (X.PMU) r4
            android.view.View r3 = X.PMU.A01(r4)
            r0 = 45
            X.Plb r2 = new X.Plb
            r2.<init>(r4, r0)
            r0 = 46
            X.Plb r1 = new X.Plb
            r1.<init>(r4, r0)
            r0 = 2131428254(0x7f0b039e, float:1.8478147E38)
            android.view.View r6 = X.PMU.A00(r3, r2, r1, r0)
            X.PMU.A04(r6)
            return r6
        L_0x04ab:
            java.lang.Object r0 = r12.A01
            X.PMU r0 = (X.PMU) r0
            android.content.Context r1 = r0.A0C
            X.PX7 r3 = new X.PX7
            r3.<init>(r0)
            X.8ab r2 = X.DbS.A0Y(r1)
            r0 = 2131976535(0x7f136157, float:1.9590193E38)
            r2.A09(r0)
            r0 = 2131976534(0x7f136156, float:1.9590191E38)
            r2.A08(r0)
            r0 = 2131953274(0x7f13067a, float:1.9543014E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 69
            X.OgE r0 = X.C71249OgE.A00(r3, r0)
            r2.A0c(r0, r1)
            android.app.Dialog r6 = r2.A02()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73900Plb.invoke():java.lang.Object");
    }
}
