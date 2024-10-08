package X;

/* renamed from: X.9Le  reason: invalid class name and case insensitive filesystem */
public final class C377269Le extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377269Le(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object, X.2jE] */
    /* JADX WARNING: type inference failed for: r0v135, types: [java.lang.Object, X.5n1] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0468, code lost:
        r3.Epx(r4, java.lang.Integer.valueOf(((java.lang.Number) r3.CDM(r4, r2[r1])).intValue() + 1), r2[r1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0481, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x04c5, code lost:
        if (((long) ((java.lang.Number) r2.A0s.CDM(r2, r3[515(0x203, float:7.22E-43)])).intValue()) < (2 * X.182.A01(X.0Tu.A05, r7, 36606676279170535L))) goto L_0x04f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x04f2, code lost:
        if (((long) ((java.lang.Number) r3.A0t.CDM(r3, X.1Av.A8a[513(0x201, float:7.19E-43)])).intValue()) >= X.182.A01(X.0Tu.A05, r5, 36606676279170535L)) goto L_0x04f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x04f4, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x04f9, code lost:
        return java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x04fa, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x032d, code lost:
        if (r0.A07 == true) goto L_0x04f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r16 = this;
            r2 = r16
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x04c8;
                case 1: goto L_0x0482;
                case 2: goto L_0x0458;
                case 3: goto L_0x0447;
                case 4: goto L_0x0431;
                case 5: goto L_0x041d;
                case 6: goto L_0x040f;
                case 7: goto L_0x03ff;
                case 8: goto L_0x03e9;
                case 9: goto L_0x03df;
                case 10: goto L_0x03ce;
                case 11: goto L_0x03b5;
                case 12: goto L_0x03a8;
                case 13: goto L_0x0396;
                case 14: goto L_0x0372;
                case 15: goto L_0x0007;
                case 16: goto L_0x0007;
                case 17: goto L_0x0344;
                case 18: goto L_0x0280;
                case 19: goto L_0x033a;
                case 20: goto L_0x0331;
                case 21: goto L_0x0324;
                case 22: goto L_0x031b;
                case 23: goto L_0x02e6;
                case 24: goto L_0x02dd;
                case 25: goto L_0x0280;
                case 26: goto L_0x02bb;
                case 27: goto L_0x02a3;
                case 28: goto L_0x0292;
                case 29: goto L_0x0289;
                case 30: goto L_0x0280;
                case 31: goto L_0x0269;
                case 32: goto L_0x0252;
                case 33: goto L_0x0208;
                case 34: goto L_0x01f4;
                case 35: goto L_0x01e3;
                case 36: goto L_0x0198;
                case 37: goto L_0x0181;
                case 38: goto L_0x0137;
                case 39: goto L_0x0124;
                case 40: goto L_0x0111;
                case 41: goto L_0x00fe;
                case 42: goto L_0x00e8;
                case 43: goto L_0x00d5;
                case 44: goto L_0x00c9;
                case 45: goto L_0x00bf;
                case 46: goto L_0x00b0;
                case 47: goto L_0x0055;
                case 48: goto L_0x0036;
                case 49: goto L_0x0010;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A01
            X.8Z9 r0 = (X.AnonymousClass8Z9) r0
            X.3pa r9 = r0.A00()
        L_0x000f:
            return r9
        L_0x0010:
            java.lang.Object r3 = r2.A01
            X.88Y r3 = (X.AnonymousClass88Y) r3
            X.89T r0 = r3.A03
            r9 = 0
            if (r0 == 0) goto L_0x000f
            X.0Ud r2 = r0.A07
            r1 = 14
            X.MG0 r0 = new X.MG0
            r0.<init>(r3, r9, r1)
            X.0pz r1 = new X.0pz
            r1.<init>(r0, r2)
            androidx.fragment.app.Fragment r0 = r3.A02
            X.07Z r0 = r0.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r0)
            X.4Co r9 = X.AnonymousClass11O.A03(r0, r1)
            return r9
        L_0x0036:
            java.lang.Object r0 = r2.A01
            X.8CV r0 = (X.AnonymousClass8CV) r0
            androidx.activity.ComponentActivity r3 = r0.A02
            com.instagram.common.session.UserSession r2 = r0.A03
            android.view.ViewStub r0 = r0.A01
            android.view.View r1 = r0.inflate()
            r0 = 9
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            com.instagram.common.ui.base.IgTextView r1 = (com.instagram.common.ui.base.IgTextView) r1
            X.Jc3 r9 = new X.Jc3
            r9.<init>(r3, r2, r1)
            return r9
        L_0x0055:
            android.animation.AnimatorSet r9 = new android.animation.AnimatorSet
            r9.<init>()
            java.lang.Object r4 = r2.A01
            X.8CV r4 = (X.AnonymousClass8CV) r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r8 = 2
            float[] r1 = new float[r8]
            r7 = 0
            r1[r7] = r0
            r0 = 1
            r1[r0] = r2
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r2 = 350(0x15e, double:1.73E-321)
            r1.setDuration(r2)
            r1.setRepeatCount(r7)
            android.animation.ValueAnimator$AnimatorUpdateListener r6 = r4.A00
            r1.addUpdateListener(r6)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            android.animation.AnimatorSet$Builder r4 = r9.play(r1)
            r0 = 4000(0xfa0, double:1.9763E-320)
            android.animation.AnimatorSet$Builder r5 = r4.after(r0)
            r0 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            float[] r1 = new float[r8]
            r1[r7] = r0
            r0 = 1
            r1[r0] = r4
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r1.setDuration(r2)
            r1.setRepeatCount(r7)
            r1.addUpdateListener(r6)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            r5.after(r1)
            return r9
        L_0x00b0:
            java.lang.Object r0 = r2.A01
            X.8Oj r0 = (X.C355048Oj) r0
            com.instagram.common.session.UserSession r0 = r0.A0d
            boolean r0 = X.AnonymousClass8IK.A01(r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            return r9
        L_0x00bf:
            java.lang.Object r0 = r2.A01
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider) r0
            X.8q2 r9 = new X.8q2
            r9.<init>(r0)
            return r9
        L_0x00c9:
            java.lang.Object r0 = r2.A01
            X.8Oj r0 = (X.C355048Oj) r0
            com.instagram.common.session.UserSession r0 = r0.A0d
            X.A8X r9 = new X.A8X
            r9.<init>(r0)
            return r9
        L_0x00d5:
            java.lang.Object r0 = r2.A01
            X.8Oj r0 = (X.C355048Oj) r0
            android.view.View r1 = r0.A0N()
            r0 = 2131435788(0x7f0b210c, float:1.8493428E38)
            android.view.View r9 = r1.requireViewById(r0)
            X.0qQ.A07(r9)
            return r9
        L_0x00e8:
            java.lang.Object r0 = r2.A01
            X.8Oj r0 = (X.C355048Oj) r0
            android.content.Context r3 = r0.A0F
            com.instagram.common.session.UserSession r2 = r0.A0d
            r0 = 2131239407(0x7f0821ef, float:1.809512E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            X.8Ov r9 = new X.8Ov
            r9.<init>(r3, r2, r1, r0)
            return r9
        L_0x00fe:
            java.lang.Object r0 = r2.A01
            X.8Oj r0 = (X.C355048Oj) r0
            android.view.View r1 = r0.A0N()
            r0 = 2131435786(0x7f0b210a, float:1.8493424E38)
            android.view.View r9 = r1.requireViewById(r0)
            X.0qQ.A07(r9)
            return r9
        L_0x0111:
            java.lang.Object r0 = r2.A01
            X.8Oj r0 = (X.C355048Oj) r0
            android.view.View r1 = r0.A0N()
            r0 = 2131435785(0x7f0b2109, float:1.8493422E38)
            android.view.View r9 = r1.requireViewById(r0)
            X.0qQ.A07(r9)
            return r9
        L_0x0124:
            java.lang.Object r0 = r2.A01
            X.8Oj r0 = (X.C355048Oj) r0
            android.view.View r1 = r0.A0N()
            r0 = 2131427894(0x7f0b0236, float:1.8477417E38)
            android.view.View r9 = r1.requireViewById(r0)
            X.0qQ.A07(r9)
            return r9
        L_0x0137:
            java.lang.Object r4 = r2.A01
            X.7vS r4 = (X.C346607vS) r4
            boolean r0 = X.C346607vS.A0C(r4)
            if (r0 == 0) goto L_0x047f
            com.instagram.common.session.UserSession r3 = r4.A0C
            X.0Tu r2 = X.0Tu.A06
            r0 = 36320313629286624(0x810922000120e0, double:3.032450817100436E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x047f
            X.1Av r3 = X.1Au.A00(r3)
            X.0s0 r2 = r3.A3Z
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 173(0xad, float:2.42E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x047f
            X.846 r1 = r4.A0N
            X.7zw r0 = r1.A00()
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x047f
            X.7zw r3 = r1.A00()
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r2 = r4.A0G
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r4.A0P
            X.8pz r0 = X.C366978pz.A0P
            r3.A01(r2, r1, r0)
            goto L_0x047f
        L_0x0181:
            java.lang.Object r0 = r2.A01
            X.7vS r0 = (X.C346607vS) r0
            X.0eM r0 = r0.A0W
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            r0 = 2131437940(0x7f0b2974, float:1.8497793E38)
            android.view.View r9 = r1.requireViewById(r0)
            X.0qQ.A07(r9)
            return r9
        L_0x0198:
            java.lang.Object r3 = r2.A01
            X.7vS r3 = (X.C346607vS) r3
            X.0eM r0 = r3.A0U
            java.lang.Object r1 = r0.getValue()
            X.0qQ.A07(r1)
            android.view.View r1 = (android.view.View) r1
            r0 = 2131437976(0x7f0b2998, float:1.8497866E38)
            android.view.View r9 = r1.requireViewById(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r9 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r9
            android.content.Context r1 = r9.getContext()
            r0 = 2131972894(0x7f13531e, float:1.9582808E38)
            java.lang.String r2 = r1.getString(r0)
            X.0qQ.A07(r2)
            X.5pj r0 = X.C296235pj.CREATION_FLOW
            r9.setButtonStyle(r0)
            X.5pk r0 = X.C296245pk.LARGE
            r9.setSize(r0)
            r1 = 2131238270(0x7f081d7e, float:1.8092814E38)
            X.5n1 r0 = new X.5n1
            r0.<init>()
            r0.A00 = r1
            r9.setStartAddOn(r0, r2)
            r9.setLabel(r2)
            r1 = 9
            X.AOX r0 = new X.AOX
            r0.<init>((java.lang.Object) r3, (int) r1)
            X.AnonymousClass0fU.A00(r0, r9)
            return r9
        L_0x01e3:
            java.lang.Object r0 = r2.A01
            X.7vS r0 = (X.C346607vS) r0
            X.0eM r0 = r0.A0V
            java.lang.Object r0 = r0.getValue()
            X.8Oj r0 = (X.C355048Oj) r0
            android.view.View r9 = r0.A0N()
            return r9
        L_0x01f4:
            java.lang.Object r0 = r2.A01
            X.7vS r0 = (X.C346607vS) r0
            X.0eM r0 = r0.A0W
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            r0 = 2131437973(0x7f0b2995, float:1.849786E38)
            android.view.View r9 = r1.requireViewById(r0)
            return r9
        L_0x0208:
            java.lang.Object r4 = r2.A01
            X.7vS r4 = (X.C346607vS) r4
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r3 = r4.A0G
            android.content.Context r1 = r3.getContext()
            X.0qQ.A07(r1)
            r2 = 0
            r0 = 0
            com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView r9 = new com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView
            r9.<init>(r1, r2, r0)
            r1 = -2
            X.2dQ r0 = new X.2dQ
            r0.<init>(r1, r1)
            r9.setLayoutParams(r0)
            int r0 = android.view.View.generateViewId()
            r9.setId(r0)
            r3.A00 = r9
            r3.addView(r9)
            r3.A0F(r2)
            android.content.Context r11 = r4.A09
            com.instagram.common.session.UserSession r13 = r4.A0C
            X.9IV r1 = r4.A0A
            java.lang.Object r0 = r1.A00
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            com.google.common.collect.ImmutableList r12 = com.google.common.collect.ImmutableList.copyOf((java.lang.Object[]) r0)
            X.0qQ.A07(r12)
            java.lang.Object r14 = r1.A01
            X.8Bf r14 = (X.C351988Bf) r14
            X.8ph r10 = new X.8ph
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            r4.A01 = r10
            return r9
        L_0x0252:
            java.lang.Object r0 = r2.A01
            X.7vS r0 = (X.C346607vS) r0
            X.0eM r0 = r0.A0U
            java.lang.Object r1 = r0.getValue()
            X.0qQ.A07(r1)
            android.view.View r1 = (android.view.View) r1
            r0 = 2131437948(0x7f0b297c, float:1.849781E38)
            android.view.View r9 = r1.requireViewById(r0)
            return r9
        L_0x0269:
            java.lang.Object r0 = r2.A01
            X.7vS r0 = (X.C346607vS) r0
            X.0eM r0 = r0.A0U
            java.lang.Object r1 = r0.getValue()
            X.0qQ.A07(r1)
            android.view.View r1 = (android.view.View) r1
            r0 = 2131441885(0x7f0b38dd, float:1.8505794E38)
            android.view.View r9 = r1.requireViewById(r0)
            return r9
        L_0x0280:
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r9 = r0.invoke()
            return r9
        L_0x0289:
            java.lang.Object r0 = r2.A01
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            X.07f r9 = r0.getViewModelStore()
            return r9
        L_0x0292:
            java.lang.Object r0 = r2.A01
            X.8CY r0 = (X.AnonymousClass8CY) r0
            X.0eM r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.7Pr r0 = (X.C331127Pr) r0
            X.7Pu r9 = r0.A00()
            return r9
        L_0x02a3:
            java.lang.Object r2 = r2.A01
            X.6bB r2 = (X.C310516bB) r2
            androidx.fragment.app.FragmentActivity r1 = r2.A05
            r0 = 1
            X.6ST r9 = new X.6ST
            r9.<init>(r1, r0)
            X.0eM r0 = r2.A08
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r9.setContentView(r0)
            return r9
        L_0x02bb:
            java.lang.Object r0 = r2.A01
            X.6bB r0 = (X.C310516bB) r0
            androidx.fragment.app.FragmentActivity r2 = r0.A05
            r1 = 0
            r0 = 16842874(0x101007a, float:2.36939E-38)
            com.instagram.common.ui.base.IgProgressBar r9 = new com.instagram.common.ui.base.IgProgressBar
            r9.<init>(r2, r1, r0)
            r0 = 1
            r9.setIndeterminate(r0)
            android.content.Context r1 = r9.getContext()
            r0 = 2131240284(0x7f08255c, float:1.8096899E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r9.setIndeterminateDrawable(r0)
            return r9
        L_0x02dd:
            java.lang.Object r0 = r2.A01
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r9 = r0.inflate()
            return r9
        L_0x02e6:
            java.lang.Object r3 = r2.A01
            X.8Cr r3 = (X.C352268Cr) r3
            X.0eM r2 = r3.A0C
            java.lang.Object r1 = r2.getValue()
            X.0qQ.A07(r1)
            android.view.View r1 = (android.view.View) r1
            r0 = 2131437984(0x7f0b29a0, float:1.8497882E38)
            android.view.View r9 = r1.requireViewById(r0)
            com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip r9 = (com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip) r9
            com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView r1 = r9.A07
            r0 = 0
            r1.setAllowSeekbarTouch(r0)
            r0 = 1015580809(0x3c888889, float:0.016666668)
            r1.setTrimmerMinimumRange(r0)
            java.lang.Object r0 = r2.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            X.0nA.A0m(r9, r0)
            X.8Cv r0 = r3.A09
            r9.A02 = r0
            return r9
        L_0x031b:
            java.lang.Object r0 = r2.A01
            X.8Kx r0 = (X.C354168Kx) r0
            r0.A00()
            goto L_0x047f
        L_0x0324:
            java.lang.Object r0 = r2.A01
            X.9cJ r0 = (X.C381779cJ) r0
            r1 = 1
            if (r0 == 0) goto L_0x04fa
            boolean r0 = r0.A07
            if (r0 != r1) goto L_0x04fa
            goto L_0x04f5
        L_0x0331:
            java.lang.Object r0 = r2.A01
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            X.3sy r9 = r0.A02()
            return r9
        L_0x033a:
            java.lang.Object r0 = r2.A01
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            X.3t2 r9 = r0.A09
            r9.getClass()
            return r9
        L_0x0344:
            java.lang.Object r2 = r2.A01
            X.8Cm r2 = (X.C352228Cm) r2
            android.view.View r1 = r2.A02
            r0 = 2131433596(0x7f0b187c, float:1.8488982E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A07(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r9 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.xme.threed.view.IgGltfSceneLayoutView"
            X.0qQ.A0C(r9, r0)
            com.instagram.xme.threed.view.IgGltfSceneLayoutView r9 = (com.instagram.xme.threed.view.IgGltfSceneLayoutView) r9
            android.content.Context r0 = r2.A01
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r9.setCornerRadius(r0)
            return r9
        L_0x0372:
            java.lang.Object r1 = r2.A01
            X.8XA r1 = (X.AnonymousClass8XA) r1
            com.instagram.common.session.UserSession r12 = r1.A0F
            X.4DH r10 = r1.A0B
            X.AeG r15 = new X.AeG
            r15.<init>(r1)
            X.8Hx r13 = r1.A0a
            r0 = 1629(0x65d, float:2.283E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r13, r0)
            X.89f r13 = (X.C3515289f) r13
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r14 = r1.A0b
            X.0iw r11 = r1.A0E
            X.LnR r9 = new X.LnR
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        L_0x0396:
            java.lang.Object r2 = r2.A01
            X.8XA r2 = (X.AnonymousClass8XA) r2
            X.4DH r0 = r2.A0B
            android.content.Context r1 = r0.requireContext()
            com.instagram.common.session.UserSession r0 = r2.A0F
            X.8h1 r9 = new X.8h1
            r9.<init>(r1, r0)
            return r9
        L_0x03a8:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.07f r9 = r0.getViewModelStore()
            return r9
        L_0x03b5:
            java.lang.Object r5 = r2.A01
            X.8XA r5 = (X.AnonymousClass8XA) r5
            com.instagram.common.session.UserSession r4 = r5.A0F
            X.4DH r3 = r5.A0B
            X.AeF r2 = new X.AeF
            r2.<init>(r5)
            r1 = 0
            X.LnS r0 = new X.LnS
            r0.<init>(r5, r1)
            X.AbY r9 = new X.AbY
            r9.<init>(r3, r4, r0, r2)
            return r9
        L_0x03ce:
            java.lang.Object r0 = r2.A01
            X.8XA r0 = (X.AnonymousClass8XA) r0
            X.8hG r0 = r0.A02
            if (r0 == 0) goto L_0x03dd
            X.0eM r0 = r0.A1K
            java.lang.Object r9 = r0.getValue()
            return r9
        L_0x03dd:
            r9 = 0
            return r9
        L_0x03df:
            java.lang.Object r1 = r2.A01
            X.8XA r1 = (X.AnonymousClass8XA) r1
            r0 = 1
            r1.A0M(r0)
            goto L_0x047f
        L_0x03e9:
            java.lang.Object r3 = r2.A01
            X.8XA r3 = (X.AnonymousClass8XA) r3
            android.app.Activity r2 = r3.A08
            com.instagram.common.session.UserSession r1 = r3.A0F
            X.8Yz r0 = r3.A0G
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = r0.A06()
            boolean r0 = r0.A02
            X.8hF r9 = new X.8hF
            r9.<init>(r2, r1, r3, r0)
            return r9
        L_0x03ff:
            X.2cp r0 = X.C61340me.A00()
            X.2cs r9 = r0.A02()
            java.lang.Object r0 = r2.A01
            X.8XJ r0 = (X.AnonymousClass8XJ) r0
            r9.A0A(r0)
            return r9
        L_0x040f:
            java.lang.Object r0 = r2.A01
            X.8iX r0 = (X.C362818iX) r0
            android.app.Activity r1 = r0.A01
            com.instagram.common.session.UserSession r0 = r0.A03
            X.9SS r9 = new X.9SS
            r9.<init>(r1, r0)
            return r9
        L_0x041d:
            X.2jE r1 = new X.2jE
            r1.<init>()
            java.lang.Object r0 = r2.A01
            X.8hT r0 = (X.C362178hT) r0
            com.instagram.common.session.UserSession r0 = r0.A0J
            boolean r0 = r1.A00(r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            return r9
        L_0x0431:
            java.lang.Object r3 = r2.A01
            X.8hT r3 = (X.C362178hT) r3
            com.instagram.common.session.UserSession r2 = r3.A0J
            X.0eM r0 = r3.A0R
            java.lang.Object r1 = r0.getValue()
            X.8XW r1 = (X.AnonymousClass8XW) r1
            X.8Yz r0 = r3.A0K
            X.8iK r9 = new X.8iK
            r9.<init>(r2, r0, r1)
            return r9
        L_0x0447:
            java.lang.Object r0 = r2.A01
            X.8hW r0 = (X.C362208hW) r0
            com.instagram.common.session.UserSession r0 = r0.A05
            X.1Av r4 = X.1Au.A00(r0)
            X.0s0 r3 = r4.A0t
            X.0YZ[] r2 = X.1Av.A8a
            r1 = 513(0x201, float:7.19E-43)
            goto L_0x0468
        L_0x0458:
            java.lang.Object r0 = r2.A01
            X.8hW r0 = (X.C362208hW) r0
            com.instagram.common.session.UserSession r0 = r0.A05
            X.1Av r4 = X.1Au.A00(r0)
            X.0s0 r3 = r4.A0s
            X.0YZ[] r2 = X.1Av.A8a
            r1 = 515(0x203, float:7.22E-43)
        L_0x0468:
            r0 = r2[r1]
            java.lang.Object r0 = r3.CDM(r4, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            r1 = r2[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.Epx(r4, r0, r1)
        L_0x047f:
            X.0gF r9 = X.C60340gF.A00
            return r9
        L_0x0482:
            java.lang.Object r0 = r2.A01
            X.8hW r0 = (X.C362208hW) r0
            com.instagram.common.session.UserSession r7 = r0.A05
            X.1Av r2 = X.1Au.A00(r7)
            X.0s0 r1 = r2.A1q
            X.0YZ[] r3 = X.1Av.A8a
            r0 = 514(0x202, float:7.2E-43)
            r0 = r3[r0]
            java.lang.Object r0 = r1.CDM(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x04fa
            X.1Av r2 = X.1Au.A00(r7)
            X.0s0 r1 = r2.A0s
            r0 = 515(0x203, float:7.22E-43)
            r0 = r3[r0]
            java.lang.Object r0 = r1.CDM(r2, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r5 = (long) r0
            r3 = 2
            X.0Tu r2 = X.0Tu.A05
            r0 = 36606676279170535(0x820d94000715e7, double:3.2135477099768585E-306)
            long r0 = X.182.A01(r2, r7, r0)
            long r3 = r3 * r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x04fa
            goto L_0x04f4
        L_0x04c8:
            java.lang.Object r0 = r2.A01
            X.8hW r0 = (X.C362208hW) r0
            com.instagram.common.session.UserSession r5 = r0.A05
            X.1Av r3 = X.1Au.A00(r5)
            X.0s0 r2 = r3.A0t
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 513(0x201, float:7.19E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r3 = (long) r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36606676279170535(0x820d94000715e7, double:3.2135477099768585E-306)
            long r1 = X.182.A01(r2, r5, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x04fa
        L_0x04f4:
            r1 = 1
        L_0x04f5:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            return r9
        L_0x04fa:
            r1 = 0
            goto L_0x04f5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377269Le.invoke():java.lang.Object");
    }
}
