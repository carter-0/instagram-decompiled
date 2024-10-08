package X;

/* renamed from: X.Iw1  reason: case insensitive filesystem */
public final class C58692Iw1 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58692Iw1(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C58692Iw1 A00(Object obj, Object obj2, int i) {
        return new C58692Iw1(i, obj, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Integer} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0224, code lost:
        if (r0 != null) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0226, code lost:
        r7 = r0.A1Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x022a, code lost:
        r5.A01(r6, r7, r2.A02, r9, r10, r11, r12, r13, r14, r15, r16, r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0260, code lost:
        return r2.A00(com.instagram.api.schemas.MediaNoteMimicryTrigger.LIKE_TRIGGER, r0.A03.A02, X.AnonymousClass05K.A00, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03c4, code lost:
        if (r1 != false) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x040e, code lost:
        if (r10 > (r1 - 1000)) goto L_0x07bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04d7, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04d8, code lost:
        if (r1 != false) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04da, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04df, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05c8, code lost:
        X.AnonymousClass7TE.A1Z(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x066f, code lost:
        r4.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x07c1, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bd, code lost:
        if (r0 != null) goto L_0x0226;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r19 = this;
            r5 = r19
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0054;
                case 1: goto L_0x00d1;
                case 2: goto L_0x00ee;
                case 3: goto L_0x0105;
                case 4: goto L_0x0134;
                case 5: goto L_0x0156;
                case 6: goto L_0x0179;
                case 7: goto L_0x01c7;
                case 8: goto L_0x01e0;
                case 9: goto L_0x023c;
                case 10: goto L_0x0261;
                case 11: goto L_0x027b;
                case 12: goto L_0x028c;
                case 13: goto L_0x029d;
                case 14: goto L_0x02b1;
                case 15: goto L_0x02c0;
                case 16: goto L_0x02d8;
                case 17: goto L_0x02e9;
                case 18: goto L_0x0303;
                case 19: goto L_0x0360;
                case 20: goto L_0x039e;
                case 21: goto L_0x03ae;
                case 22: goto L_0x03d7;
                case 23: goto L_0x0445;
                case 24: goto L_0x0470;
                case 25: goto L_0x0455;
                case 26: goto L_0x04e5;
                case 27: goto L_0x0026;
                case 28: goto L_0x04f0;
                case 29: goto L_0x0503;
                case 30: goto L_0x028c;
                case 31: goto L_0x0522;
                case 32: goto L_0x052d;
                case 33: goto L_0x052d;
                case 34: goto L_0x0542;
                case 35: goto L_0x0567;
                case 36: goto L_0x0580;
                case 37: goto L_0x05f7;
                case 38: goto L_0x061b;
                case 39: goto L_0x068d;
                case 40: goto L_0x06c7;
                case 41: goto L_0x0709;
                case 42: goto L_0x0007;
                case 43: goto L_0x0752;
                case 44: goto L_0x0752;
                case 45: goto L_0x0007;
                case 46: goto L_0x077c;
                case 47: goto L_0x0793;
                case 48: goto L_0x07b2;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r6 = r0.invoke()
            if (r6 != 0) goto L_0x0025
        L_0x0013:
            java.lang.Object r0 = r5.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0051
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0051
            X.2YQ r6 = r1.getDefaultViewModelCreationExtras()
        L_0x0025:
            return r6
        L_0x0026:
            java.lang.Object r0 = r5.A02
            X.GFJ r0 = (X.GFJ) r0
            X.4bN r1 = r0.A06
            boolean r0 = X.C52076GDw.A03(r1)
            r6 = 0
            if (r0 == 0) goto L_0x004e
            java.util.List r1 = r1.A0R
            if (r1 == 0) goto L_0x0025
            java.lang.Object r0 = r5.A01
            X.2V5 r0 = (X.2V5) r0
            int r0 = X.C51970G9q.A09(r0)
            X.1Xj r0 = X.DbZ.A0T(r1, r0)
        L_0x0043:
            if (r0 == 0) goto L_0x0025
            long r0 = r0.A1B()
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            return r6
        L_0x004e:
            X.1Xj r0 = r1.A02
            goto L_0x0043
        L_0x0051:
            X.2YP r6 = X.AnonymousClass2YP.A00
            return r6
        L_0x0054:
            java.lang.Object r4 = r5.A01
            X.3Zt r4 = (X.C243673Zt) r4
            float r0 = X.C55404HhA.A00
            r1 = 1109393408(0x42200000, float:40.0)
            float r0 = r0 / r1
            int r11 = (int) r0
            float[] r10 = new float[r11]
            r0 = 1133248512(0x438c0000, float:280.0)
            float r0 = r0 / r1
            int r9 = (int) r0
            r0 = 1167867904(0x459c4000, float:5000.0)
            float r0 = r0 / r1
            int r8 = (int) r0
            r0 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r1
            int r7 = (int) r0
            r6 = 0
            r0 = 0
            r10[r6] = r0
            r12 = 1065353216(0x3f800000, float:1.0)
            r0 = 1
            if (r0 > r9) goto L_0x0082
            r2 = 1
        L_0x0077:
            float r1 = (float) r2
            float r1 = r1 + r12
            float r0 = (float) r9
            float r1 = r1 / r0
            r10[r2] = r1
            if (r2 == r9) goto L_0x0082
            int r2 = r2 + 1
            goto L_0x0077
        L_0x0082:
            int r3 = r9 + r8
            int r2 = r3 + -1
            r1 = r9
            if (r9 <= r2) goto L_0x009d
        L_0x0089:
            int r2 = r11 + -1
            if (r3 > r2) goto L_0x00a5
        L_0x008d:
            int r0 = r3 - r9
            int r0 = r0 - r8
            float r1 = (float) r0
            float r1 = r1 + r12
            float r0 = (float) r7
            float r1 = r1 / r0
            float r0 = r12 - r1
            r10[r3] = r0
            if (r3 == r2) goto L_0x00a5
            int r3 = r3 + 1
            goto L_0x008d
        L_0x009d:
            r10[r1] = r12
            r0 = r1
            int r1 = r1 + 1
            if (r0 != r2) goto L_0x009d
            goto L_0x0089
        L_0x00a5:
            float[] r0 = java.util.Arrays.copyOf(r10, r11)
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r0)
            X.0qQ.A07(r3)
            java.lang.Object r2 = r5.A02
            X.2Wa r2 = (X.2Wa) r2
            r3.setRepeatCount(r6)
            r0 = 5480(0x1568, double:2.7075E-320)
            r3.setDuration(r0)
            r1 = 17
            X.I83 r0 = new X.I83
            r0.<init>((android.animation.ValueAnimator) r3, (X.2Wa) r2, (int) r1)
            X.C51970G9q.A11(r0, r3, r4)
            r0 = 15
            X.IwO r0 = X.C58715IwO.A01(r4, r0)
            X.3dj r6 = X.C51965G9l.A0V(r0)
            return r6
        L_0x00d1:
            java.lang.Object r3 = r5.A02
            X.GwV r3 = (X.C53925GwV) r3
            java.lang.Object r2 = r5.A01
            X.3Y5 r2 = (X.AnonymousClass3Y5) r2
            long r0 = X.C51967G9n.A07(r2)
            float r1 = X.C51969G9p.A02(r2, r0)
            float r0 = X.C53925GwV.A04(r2, r3)
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            java.lang.Float r6 = java.lang.Float.valueOf(r1)
            return r6
        L_0x00ee:
            java.lang.Object r0 = r5.A02
            X.8ZA r0 = (X.AnonymousClass8ZA) r0
            java.lang.Object r3 = r5.A01
            X.8Z1 r2 = X.C51966G9m.A0y(r0)
            java.lang.Class<X.HDc> r1 = X.C54430HDc.class
            r0 = 16
            X.IwO r0 = X.C58715IwO.A01(r3, r0)
            X.3pa r6 = r2.A00(r1, r0)
            return r6
        L_0x0105:
            java.lang.Object r0 = r5.A01
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r0
            r0.A0E()
            java.lang.Object r0 = r5.A02
            X.Gx0 r0 = (X.C53956Gx0) r0
            X.HJx r3 = r0.A03
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r3.A01
            if (r0 == 0) goto L_0x0119
            r0.A0Q(r3)
        L_0x0119:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r3.A01
            if (r1 == 0) goto L_0x0120
            r0 = -1
            r1.A0C = r0
        L_0x0120:
            r0 = 0
            r3.A01 = r0
            X.1wn r2 = r3.A00
            if (r2 == 0) goto L_0x07bf
            com.instagram.common.session.UserSession r0 = r3.A07
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.1qJ> r0 = X.1qJ.class
            r1.A02(r2, r0)
            goto L_0x07bf
        L_0x0134:
            java.lang.Object r0 = r5.A02
            X.GMp r0 = (X.C52299GMp) r0
            X.3W1 r2 = r0.A00
            java.lang.Object r1 = r5.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.ref.WeakReference r0 = r2.A1d
            if (r0 == 0) goto L_0x07bf
            java.lang.Object r0 = r0.get()
            if (r0 != r1) goto L_0x07bf
            r1 = 0
            r2.A1d = r1
            X.30k r0 = r2.A0u
            if (r0 == 0) goto L_0x07bf
            r0.A04(r1)
            goto L_0x07bf
        L_0x0156:
            java.lang.Object r3 = r5.A02
            X.GMp r3 = (X.C52299GMp) r3
            X.3W1 r0 = r3.A00
            java.lang.Object r2 = r5.A01
            if (r2 == 0) goto L_0x0177
            java.lang.ref.WeakReference r1 = X.C51965G9l.A0v(r2)
        L_0x0164:
            r0.A1d = r1
            X.30k r0 = r0.A0u
            if (r0 == 0) goto L_0x016d
            r0.A04(r1)
        L_0x016d:
            r0 = 4
            X.Iw1 r0 = A00(r2, r3, r0)
            X.3dj r6 = X.C51965G9l.A0V(r0)
            return r6
        L_0x0177:
            r1 = 0
            goto L_0x0164
        L_0x0179:
            java.lang.Object r4 = r5.A02
            X.GKr r4 = (X.C52250GKr) r4
            X.GEl r3 = r4.A05
            X.4bN r2 = r3.A03
            X.1Xj r0 = r2.A02
            if (r0 == 0) goto L_0x07bf
            java.lang.String r12 = r0.getId()
            if (r12 == 0) goto L_0x07bf
            java.lang.Object r9 = r5.A01
            java.lang.Integer r9 = (java.lang.Integer) r9
            X.I4E r5 = X.I4E.A00
            com.instagram.common.session.UserSession r6 = r4.A00
            java.lang.ref.WeakReference r1 = r4.A06
            X.1Xj r0 = r2.A02
            r7 = 0
            if (r0 == 0) goto L_0x01c5
            java.lang.String r13 = r0.A2Z()
        L_0x019e:
            X.4DU r0 = r4.A01
            java.lang.String r14 = r0.getModuleName()
            X.1Xj r0 = r2.A02
            if (r0 == 0) goto L_0x01c3
            java.lang.String r15 = X.C51965G9l.A0t(r0)
        L_0x01ac:
            X.1Xj r0 = r2.A02
            if (r0 == 0) goto L_0x01c0
            java.lang.String r16 = X.DbT.A0x(r0)
        L_0x01b4:
            X.GDe r0 = r3.A04
            java.lang.Integer r10 = X.C52058GDe.A05(r0)
            r11 = 0
            X.1Xj r0 = r2.A02
            if (r0 == 0) goto L_0x022a
            goto L_0x0226
        L_0x01c0:
            r16 = r7
            goto L_0x01b4
        L_0x01c3:
            r15 = r7
            goto L_0x01ac
        L_0x01c5:
            r13 = r7
            goto L_0x019e
        L_0x01c7:
            java.lang.Object r1 = r5.A02
            X.GKr r1 = (X.C52250GKr) r1
            com.instagram.common.session.UserSession r0 = r1.A00
            X.3gF r2 = X.C247323g9.A00(r0)
            X.4DU r0 = r1.A01
            java.lang.String r6 = r0.getModuleName()
            java.lang.Object r0 = r5.A01
            boolean r7 = X.C51972G9s.A1a(r0)
            X.GEl r0 = r1.A05
            goto L_0x0254
        L_0x01e0:
            java.lang.Object r4 = r5.A02
            X.GKl r4 = (X.C52244GKl) r4
            X.GEl r3 = r4.A08
            X.4bN r2 = r3.A03
            X.1Xj r0 = r2.A02
            if (r0 == 0) goto L_0x07bf
            java.lang.String r12 = r0.getId()
            if (r12 == 0) goto L_0x07bf
            java.lang.Object r9 = r5.A01
            java.lang.Integer r9 = (java.lang.Integer) r9
            X.I4E r5 = X.I4E.A00
            com.instagram.common.session.UserSession r6 = r4.A03
            java.lang.ref.WeakReference r1 = r4.A09
            X.1Xj r0 = r2.A02
            r7 = 0
            if (r0 == 0) goto L_0x023a
            java.lang.String r13 = r0.A2Z()
        L_0x0205:
            X.4DU r0 = r4.A04
            java.lang.String r14 = r0.getModuleName()
            X.1Xj r0 = r2.A02
            if (r0 == 0) goto L_0x0238
            java.lang.String r15 = X.C51965G9l.A0t(r0)
        L_0x0213:
            X.1Xj r0 = r2.A02
            if (r0 == 0) goto L_0x0235
            java.lang.String r16 = X.DbT.A0x(r0)
        L_0x021b:
            X.GDe r0 = r3.A04
            java.lang.Integer r10 = X.C52058GDe.A05(r0)
            r11 = 0
            X.1Xj r0 = r2.A02
            if (r0 == 0) goto L_0x022a
        L_0x0226:
            com.instagram.common.typedurl.ImageUrl r7 = r0.A1Q()
        L_0x022a:
            X.1Xj r8 = r2.A02
            r17 = r11
            r18 = r1
            r5.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x07bf
        L_0x0235:
            r16 = r7
            goto L_0x021b
        L_0x0238:
            r15 = r7
            goto L_0x0213
        L_0x023a:
            r13 = r7
            goto L_0x0205
        L_0x023c:
            java.lang.Object r1 = r5.A02
            X.GKl r1 = (X.C52244GKl) r1
            com.instagram.common.session.UserSession r0 = r1.A03
            X.3gF r2 = X.C247323g9.A00(r0)
            X.4DU r0 = r1.A04
            java.lang.String r6 = r0.getModuleName()
            java.lang.Object r0 = r5.A01
            boolean r7 = X.C51972G9s.A1a(r0)
            X.GEl r0 = r1.A08
        L_0x0254:
            X.4bN r0 = r0.A03
            X.1Xj r4 = r0.A02
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            com.instagram.api.schemas.MediaNoteMimicryTrigger r3 = com.instagram.api.schemas.MediaNoteMimicryTrigger.LIKE_TRIGGER
            X.3fc r6 = r2.A00(r3, r4, r5, r6, r7)
            return r6
        L_0x0261:
            java.lang.Object r2 = r5.A01
            android.widget.SeekBar r2 = (android.widget.SeekBar) r2
            r1 = 0
            r2.setTag(r1)
            java.lang.Object r0 = r5.A02
            X.GJn r0 = (X.C52222GJn) r0
            boolean r0 = r0.A09
            if (r0 != 0) goto L_0x0276
            r2.setOnSeekBarChangeListener(r1)
            goto L_0x07bf
        L_0x0276:
            r2.setOnTouchListener(r1)
            goto L_0x07bf
        L_0x027b:
            java.lang.Object r1 = r5.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131443102(0x7f0b3d9e, float:1.8508263E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r1, r0)
            r0 = 0
            r1.setText(r0)
            goto L_0x07bf
        L_0x028c:
            java.lang.Object r0 = r5.A02
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r0.A09()
            java.lang.Object r1 = r5.A01
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r1 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout) r1
            r0 = 0
            r1.setCornerRadius(r0)
            goto L_0x07bf
        L_0x029d:
            java.lang.Object r2 = r5.A01
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            r1 = 4
            r2.setVisibility(r1)
            java.lang.Object r0 = r5.A02
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            r2.A09()
            goto L_0x07bf
        L_0x02b1:
            java.lang.Object r0 = r5.A02
            X.GuZ r0 = (X.C53806GuZ) r0
            X.JQX r1 = r0.A03
            java.lang.Object r0 = r5.A01
            X.Iep r0 = (X.C57686Iep) r0
            r1.EDu(r0)
            goto L_0x07bf
        L_0x02c0:
            java.lang.Object r2 = r5.A02
            X.GuZ r2 = (X.C53806GuZ) r2
            X.JQX r0 = r2.A03
            java.lang.Object r1 = r5.A01
            X.Iep r1 = (X.C57686Iep) r1
            r0.A94(r1)
            r0 = 14
            X.Iw1 r0 = A00(r1, r2, r0)
            X.3dj r6 = X.C51965G9l.A0V(r0)
            return r6
        L_0x02d8:
            java.lang.Object r0 = r5.A02
            X.GtE r0 = (X.C53723GtE) r0
            X.3W1 r3 = r0.A01
            java.lang.Object r2 = r5.A01
            X.2xU r2 = (X.AnonymousClass2xU) r2
            r1 = 0
            r0 = 0
            r3.A0M(r2, r1, r0)
            goto L_0x07bf
        L_0x02e9:
            java.lang.Object r4 = r5.A02
            X.GtE r4 = (X.C53723GtE) r4
            X.3W1 r3 = r4.A01
            java.lang.Object r2 = r5.A01
            X.2xU r2 = (X.AnonymousClass2xU) r2
            r1 = 0
            r0 = 0
            r3.A0L(r2, r1, r0)
            r0 = 16
            X.Iw1 r0 = A00(r2, r4, r0)
            X.3dj r6 = X.C51965G9l.A0V(r0)
            return r6
        L_0x0303:
            java.lang.Object r6 = r5.A02
            X.GGu r6 = (X.C52152GGu) r6
            java.lang.Object r4 = r5.A01
            X.GIC r4 = (X.GIC) r4
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A01
            r0.A09()
            boolean r1 = r6.A07
            r0 = 0
            if (r1 == 0) goto L_0x0331
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r3 = r4.A00
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r1 = r2 instanceof android.widget.FrameLayout.LayoutParams
            if (r1 == 0) goto L_0x032a
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            if (r2 == 0) goto L_0x032a
            r1 = 17
            r2.gravity = r1
            r3.setLayoutParams(r2)
        L_0x032a:
            boolean r1 = r6.A0A
            if (r1 == 0) goto L_0x0331
            r4.setBackground(r0)
        L_0x0331:
            java.lang.Integer r1 = r6.A04
            if (r1 == 0) goto L_0x0343
            int r2 = r1.intValue()
            X.4bN r1 = r6.A00
            java.util.List r1 = r1.A0R
            if (r1 == 0) goto L_0x0343
            X.1Xj r0 = X.DbZ.A0T(r1, r2)
        L_0x0343:
            X.GDy r3 = X.C52152GGu.A00(r0, r6)
            if (r3 == 0) goto L_0x07bf
            r2 = 0
            r3.A07 = r2
            r1 = 0
            r3.A05 = r1
            r3.A01 = r1
            com.instagram.common.session.UserSession r0 = r3.A0B
            boolean r0 = X.1KU.A07(r0)
            if (r0 == 0) goto L_0x07bf
            X.C52078GDy.A01(r3, r2, r2)
            r3.A02 = r1
            goto L_0x07bf
        L_0x0360:
            java.lang.Object r2 = r5.A02
            X.GKz r2 = (X.C52258GKz) r2
            X.GBj r0 = r2.A08
            androidx.viewpager2.widget.ViewPager2 r0 = r0.A00
            if (r0 == 0) goto L_0x0394
            X.GN4.A00(r0)
            X.GC3 r0 = r2.A06
            X.2cs r0 = r0.A05
            r0.A03()
            X.GCC r0 = r2.A00
            if (r0 == 0) goto L_0x037b
            r0.A0C()
        L_0x037b:
            X.GDz r0 = X.C52258GKz.A02(r2)
            r1 = 0
            if (r0 == 0) goto L_0x038d
            X.GDy r0 = r0.A07
            if (r0 == 0) goto L_0x038d
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r0.A02()
            r0.setVisibility(r1)
        L_0x038d:
            r0 = 0
            X.C52258GKz.A04(r2, r0)
            X.C52258GKz.A05(r2, r1)
        L_0x0394:
            java.lang.Object r1 = r5.A01
            X.6nC r1 = (X.C317396nC) r1
            r0 = 0
            r1.EHq(r0, r0)
            goto L_0x07bf
        L_0x039e:
            java.lang.Object r0 = r5.A02
            X.3Zt r0 = (X.C243673Zt) r0
            X.C51973G9u.A18(r0)
            java.lang.Object r0 = r5.A01
            X.3Zt r0 = (X.C243673Zt) r0
            X.C51973G9u.A18(r0)
            goto L_0x07bf
        L_0x03ae:
            java.lang.Object r0 = r5.A02
            X.GH8 r0 = (X.GH8) r0
            X.GEG r6 = r0.A01
            java.lang.Object r4 = r5.A01
            boolean r3 = r0.A04
            X.GJ5 r2 = r0.A00
            boolean r1 = r0.A05
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 1
            if (r2 == 0) goto L_0x03c6
            r2 = 1
            if (r1 == 0) goto L_0x03c7
        L_0x03c6:
            r2 = 0
        L_0x03c7:
            if (r3 == 0) goto L_0x03d4
            if (r4 != 0) goto L_0x03cc
            r0 = 0
        L_0x03cc:
            boolean r1 = r6.A0B
            X.GHk r6 = new X.GHk
            r6.<init>(r2, r0, r1)
            return r6
        L_0x03d4:
            boolean r0 = r6.A0G
            goto L_0x03cc
        L_0x03d7:
            java.lang.Object r0 = r5.A02
            X.GFJ r0 = (X.GFJ) r0
            X.4DU r12 = r0.A0C
            com.instagram.common.session.UserSession r7 = r0.A0A
            X.4bN r6 = r0.A06
            java.lang.Object r3 = r5.A01
            X.0jB r3 = (X.0jB) r3
            X.AnonymousClass7TG.A1T(r12, r7, r6)
            if (r3 == 0) goto L_0x07bf
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r4 = r6.getId()
            X.0eP r0 = X.HQN.A00
            if (r0 == 0) goto L_0x0415
            java.lang.Object r0 = r0.A00
        L_0x03f8:
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x0417
            X.0eP r0 = X.HQN.A00
            if (r0 == 0) goto L_0x0412
            java.lang.Object r0 = r0.A01
            long r10 = X.AnonymousClass7TE.A0R(r0)
        L_0x0408:
            r8 = 1000(0x3e8, double:4.94E-321)
            long r4 = r1 - r8
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0417
            goto L_0x07bf
        L_0x0412:
            r10 = 0
            goto L_0x0408
        L_0x0415:
            r0 = 0
            goto L_0x03f8
        L_0x0417:
            java.lang.String r0 = r6.getId()
            X.0eP r0 = X.AnonymousClass7TF.A0y(r0, r1)
            X.HQN.A00 = r0
            X.0wc r1 = X.AnonymousClass0kN.A01(r12, r7)
            java.lang.String r0 = "instagram_ad_reels_midscene_impression"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x07bf
            java.lang.String r1 = X.C51966G9m.A1B(r6)
            r0 = 0
            java.lang.Long r0 = X.C51971G9r.A0n(r0, r1)
            X.C51965G9l.A1D(r4, r0)
            X.C51976G9y.A0W(r4, r6, r3, r7)
            X.C51976G9y.A0X(r4, r3)
            goto L_0x066f
        L_0x0445:
            java.lang.Object r0 = r5.A01
            X.DbS.A1U(r0)
            java.lang.Object r0 = r5.A02
            X.GFJ r0 = (X.GFJ) r0
            X.JTB r0 = r0.A0H
            r0.DNn()
            goto L_0x07bf
        L_0x0455:
            java.lang.Object r1 = r5.A02
            X.GFJ r1 = (X.GFJ) r1
            X.4bN r2 = r1.A06
            boolean r0 = X.C52076GDw.A03(r2)
            if (r0 == 0) goto L_0x04da
            com.instagram.common.session.UserSession r1 = r1.A0A
            java.lang.Object r0 = r5.A01
            X.2V5 r0 = (X.2V5) r0
            java.lang.Object r0 = r0.A00
            java.lang.Integer r0 = (java.lang.Integer) r0
            boolean r1 = X.C52119GFn.A00(r2, r1, r0)
            goto L_0x04d7
        L_0x0470:
            X.0eM r0 = X.GFU.A00
            java.lang.Object r0 = r5.A01
            android.content.Context r7 = X.C51969G9p.A0L(r0)
            boolean r0 = X.GFU.A01(r7)
            if (r0 == 0) goto L_0x04da
            java.lang.Object r0 = r5.A02
            X.GFJ r0 = (X.GFJ) r0
            com.instagram.common.session.UserSession r5 = r0.A0A
            X.4bN r1 = r0.A06
            X.4DU r0 = r0.A0C
            java.lang.String r6 = r0.getModuleName()
            X.AnonymousClass7TG.A1O(r5, r1)
            boolean r0 = r1.CcK()
            if (r0 != 0) goto L_0x04da
            r0 = 0
            X.3WR r4 = r1.A09(r5, r0)
            if (r4 == 0) goto L_0x04b3
            X.0Tu r3 = X.0Tu.A05
            r1 = 36321988666468225(0x810aa800002781, double:3.0335101173589136E-306)
            boolean r1 = X.182.A06(r3, r5, r1)
            if (r1 != 0) goto L_0x04e0
            java.lang.String r1 = r4.A04()
            if (r1 == 0) goto L_0x04b3
            java.util.List r0 = X.AnonymousClass7TE.A1I(r1)
        L_0x04b3:
            X.GI8 r1 = new X.GI8
            r1.<init>(r5, r6, r0)
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x04da
            java.util.List r1 = r1.A02
            boolean r0 = X.GI8.A02(r1)
            if (r0 != 0) goto L_0x04cc
            boolean r0 = X.GI8.A03(r1)
            if (r0 == 0) goto L_0x04da
        L_0x04cc:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323801142668817(0x810c4e00002e11, double:3.034656334606424E-306)
            boolean r1 = X.182.A06(r2, r5, r0)
        L_0x04d7:
            r0 = 1
            if (r1 != 0) goto L_0x04db
        L_0x04da:
            r0 = 0
        L_0x04db:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x04e0:
            com.google.common.collect.ImmutableList r0 = r4.A01(r7)
            goto L_0x04b3
        L_0x04e5:
            java.lang.Object r2 = r5.A02
            java.lang.Object r1 = r5.A01
            r0 = 3
            X.INz r6 = new X.INz
            r6.<init>(r0, r1, r2)
            return r6
        L_0x04f0:
            java.lang.Object r0 = r5.A02
            X.GJk r0 = (X.C52219GJk) r0
            X.2V5 r2 = r0.A00
            java.lang.Object r1 = r5.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.Set r0 = r2.A01
            r0.remove(r1)
            goto L_0x07bf
        L_0x0503:
            java.lang.Object r2 = r5.A02
            X.GJk r2 = (X.C52219GJk) r2
            java.lang.Object r0 = r5.A01
            X.2V5 r0 = (X.2V5) r0
            X.GJq r1 = new X.GJq
            r1.<init>(r0, r2)
            X.2V5 r0 = r2.A00
            java.util.Set r0 = r0.A01
            r0.add(r1)
            r0 = 28
            X.Iw1 r0 = A00(r1, r2, r0)
            X.3dj r6 = X.C51965G9l.A0V(r0)
            return r6
        L_0x0522:
            java.lang.Object r0 = r5.A01
            X.Gam r0 = (X.C52674Gam) r0
            X.GoT r0 = r0.A01
            java.util.List r6 = X.C52072GDs.A00(r0)
            return r6
        L_0x052d:
            java.lang.Object r0 = r5.A01
            X.Gok r0 = (X.C53452Gok) r0
            X.Goh r0 = r0.A06
            java.util.List r0 = r0.A08
            java.lang.Object r0 = X.00k.A0J(r0)
            X.4sL r0 = (X.C276014sL) r0
            if (r0 == 0) goto L_0x0540
            X.1Xj r6 = r0.A00
            return r6
        L_0x0540:
            r6 = 0
            return r6
        L_0x0542:
            java.lang.Object r4 = r5.A02
            X.Gvd r4 = (X.C53872Gvd) r4
            X.Hla r3 = r4.A01
            X.GrI r0 = r4.A00
            int r1 = r0.A00
            java.lang.Object r2 = r5.A01
            r0 = 1
            X.0qQ.A0B(r2, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.Map r0 = r3.A01
            r0.put(r1, r2)
            r1 = 47
            X.IwC r0 = new X.IwC
            r0.<init>(r4, r1)
            X.3dj r6 = X.C51965G9l.A0V(r0)
            return r6
        L_0x0567:
            java.lang.Object r1 = r5.A01
            X.GaS r1 = (X.C52654GaS) r1
            java.lang.Object r4 = r5.A02
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.GDI r3 = r1.A07
            X.4Cq r2 = r3.A03()
            r1 = 0
            r0 = 41
            X.ImR r6 = new X.ImR
            r6.<init>((java.lang.Object) r3, (java.lang.Object) r4, (X.AnonymousClass4D7) r1, (int) r0)
            goto L_0x05c8
        L_0x0580:
            java.lang.Object r1 = r5.A01
            X.GaS r1 = (X.C52654GaS) r1
            java.lang.Object r0 = r5.A02
            X.JSC r0 = (X.JSC) r0
            X.JSJ r3 = r0.BQl()
            X.JS5 r4 = r0.BDa()
            r12 = 0
            boolean r8 = X.AnonymousClass7TF.A1U(r12, r3, r4)
            X.GDI r5 = r1.A07
            com.instagram.api.schemas.MediaDestinationEnum r0 = r3.BPx()
            int r1 = r0.ordinal()
            if (r1 == r8) goto L_0x05e3
            if (r1 == r12) goto L_0x05d2
            r0 = 3
            if (r1 == r0) goto L_0x05d2
            r0 = 2
            if (r1 != r0) goto L_0x05cd
            X.0eM r0 = r5.A04
            java.lang.Object r0 = r0.getValue()
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r0 = (com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository) r0
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x05d2
            X.4Cq r2 = r5.A03()
            r10 = 0
            r11 = 12
            X.ImT r6 = new X.ImT
            r7 = r4
            r8 = r3
            r9 = r5
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (X.AnonymousClass4D7) r10, (int) r11)
        L_0x05c8:
            X.AnonymousClass7TE.A1Z(r6, r2)
            goto L_0x07bf
        L_0x05cd:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x05d2:
            X.4Cq r0 = r5.A03()
            r6 = 0
            r7 = 24
            X.JTf r2 = new X.JTf
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.AnonymousClass7TE.A1Z(r2, r0)
            goto L_0x07bf
        L_0x05e3:
            X.4Cq r0 = r5.A03()
            r10 = 0
            r11 = 24
            X.JTf r6 = new X.JTf
            r7 = r3
            r8 = r4
            r9 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.AnonymousClass7TE.A1Z(r6, r0)
            goto L_0x07bf
        L_0x05f7:
            java.lang.Object r2 = r5.A02
            X.Iec r2 = (X.C57673Iec) r2
            java.lang.Object r1 = r5.A01
            r0 = 38
            X.Iw1 r4 = A00(r1, r2, r0)
            X.Gr0 r0 = r2.A06
            X.GmI r0 = r0.A01
            com.instagram.api.schemas.InstagramMidcardType r5 = r0.A05
            com.instagram.api.schemas.ClipsMidCardSubtype r3 = r0.A04
            r6 = 1
            X.Dba.A0j(r6, r5, r3)
            r1 = 11
            X.GVB r0 = new X.GVB
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.invoke()
            goto L_0x07bf
        L_0x061b:
            java.lang.Object r4 = r5.A02
            X.Iec r4 = (X.C57673Iec) r4
            X.Gr0 r1 = r4.A06
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0677
            java.lang.Object r3 = r5.A01
            X.1Xj r3 = (X.1Xj) r3
            X.28D r1 = r1.A00
            X.AnonymousClass7TG.A1N(r3, r1)
            X.0sL r0 = r4.A00
            if (r0 == 0) goto L_0x0635
            r0.invoke(r3, r1)
        L_0x0635:
            com.instagram.common.session.UserSession r0 = r4.A03
            X.GAc r1 = r4.A07
            X.0Aj r4 = X.C51972G9s.A0M(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x07bf
            java.lang.String r0 = "use_template_tap"
            X.93T r2 = X.C51979GAc.A00(r4, r1, r0)
            java.lang.String r0 = r3.A2n()
            if (r0 == 0) goto L_0x0674
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0674
            long r0 = r0.longValue()
        L_0x0659:
            X.C51970G9q.A18(r4, r0)
            java.lang.Long r0 = X.C51974G9v.A0U(r3)
            X.C51965G9l.A1H(r4, r0)
            X.XSE r1 = X.XSE.TEMPLATE
            java.lang.String r0 = "midcard_type"
            r4.A8M(r1, r0)
            java.lang.String r0 = r2.A00
            X.C51965G9l.A1R(r4, r0)
        L_0x066f:
            r4.Cgf()
            goto L_0x07bf
        L_0x0674:
            r0 = 0
            goto L_0x0659
        L_0x0677:
            X.GmI r0 = r1.A01
            X.46i r3 = r0.A09
            if (r3 == 0) goto L_0x07bf
            X.28D r2 = r1.A00
            r1 = 0
            r0 = 1
            X.0qQ.A0B(r2, r0)
            X.0sK r0 = r4.A01
            if (r0 == 0) goto L_0x07bf
            r0.invoke(r3, r2, r1)
            goto L_0x07bf
        L_0x068d:
            java.lang.Object r2 = r5.A02
            X.GE0 r2 = (X.GE0) r2
            java.lang.Object r0 = r5.A01
            X.H3D r0 = (X.H3D) r0
            X.4dm r0 = r0.A01
            java.lang.Throwable r0 = r0.A01()
            if (r0 == 0) goto L_0x06a3
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L_0x06a5
        L_0x06a3:
            java.lang.String r1 = "Missing data component failure reason"
        L_0x06a5:
            X.GIQ r4 = r2.A05
            java.lang.String r0 = "failure_reason"
            r4.A0J(r0, r1)
            X.GLu r3 = r2.A00
            if (r3 == 0) goto L_0x06c0
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x06c0
            X.02m r2 = r3.A01
            r1 = 749808675(0x2cb12c23, float:5.0355427E-12)
            r0 = 3
            r2.markerEnd(r1, r0)
            r0 = 0
            r3.A00 = r0
        L_0x06c0:
            X.34p r0 = r4.A00
            r0.A01()
            goto L_0x07bf
        L_0x06c7:
            java.lang.Object r0 = r5.A02
            X.GE0 r0 = (X.GE0) r0
            X.GIQ r3 = r0.A05
            X.34p r0 = r3.A00
            r0.A04()
            java.lang.Object r0 = r5.A01
            X.GJt r0 = (X.C52228GJt) r0
            java.lang.Integer r2 = r0.A00
            int r1 = r2.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0706
            r0 = 1
            if (r1 == r0) goto L_0x0703
            r0 = 2
            if (r1 == r0) goto L_0x0700
            java.lang.String r1 = "unknown"
        L_0x06e7:
            java.lang.String r0 = "prefetch_connection_type"
            r3.A0J(r0, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x06fd
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x06f2:
            java.lang.String r1 = X.GEB.A00(r0)
            java.lang.String r0 = "early_fetch_type"
            r3.A0J(r0, r1)
            goto L_0x07bf
        L_0x06fd:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            goto L_0x06f2
        L_0x0700:
            java.lang.String r1 = "na"
            goto L_0x06e7
        L_0x0703:
            java.lang.String r1 = "cache"
            goto L_0x06e7
        L_0x0706:
            java.lang.String r1 = "network"
            goto L_0x06e7
        L_0x0709:
            java.lang.Object r1 = r5.A02
            X.GE0 r1 = (X.GE0) r1
            X.GLu r0 = r1.A00
            if (r0 == 0) goto L_0x0714
            r0.A01()
        L_0x0714:
            X.GIQ r3 = r1.A05
            java.lang.Object r2 = r5.A01
            X.GLe r2 = (X.C52263GLe) r2
            boolean r1 = r2.A0I
            java.lang.String r0 = "is_streaming"
            r3.A0K(r0, r1)
            java.util.List r0 = r2.A09
            int r1 = r0.size()
            java.lang.String r0 = "response_size"
            r3.A0G(r0, r1)
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x0741
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            java.lang.String r1 = X.GEB.A00(r0)
            java.lang.String r0 = "fetch_type"
            r3.A0J(r0, r1)
            X.34p r0 = r3.A00
            r0.A02()
            goto L_0x07bf
        L_0x0741:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            java.lang.String r1 = X.GEB.A00(r0)
            java.lang.String r0 = "fetch_type"
            r3.A0J(r0, r1)
            X.34p r0 = r3.A00
            r0.A05()
            goto L_0x07bf
        L_0x0752:
            java.lang.Object r1 = r5.A02
            X.HKc r1 = (X.C54593HKc) r1
            java.lang.Object r2 = r5.A01
            X.H3S r2 = (X.H3S) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.ui.base.IgCheckBox r1 = r1.A08
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L_0x07bf
            X.5DY r0 = r2.A00
            if (r0 == 0) goto L_0x077a
            java.lang.Boolean r0 = r0.CbB()
            if (r0 == 0) goto L_0x077a
            boolean r0 = r0.booleanValue()
        L_0x0772:
            r1.setChecked(r0)
            r0 = 1
            r1.setEnabled(r0)
            goto L_0x07bf
        L_0x077a:
            r0 = 0
            goto L_0x0772
        L_0x077c:
            java.lang.Object r0 = r5.A02
            X.8ZA r0 = (X.AnonymousClass8ZA) r0
            java.lang.Object r3 = r5.A01
            X.8Z1 r2 = X.C51966G9m.A0y(r0)
            java.lang.Class<X.Dd7> r1 = X.Dd7.class
            r0 = 45
            X.IwK r0 = X.C58711IwK.A00(r3, r0)
            X.3pa r6 = r2.A00(r1, r0)
            return r6
        L_0x0793:
            java.lang.Object r4 = r5.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r5.A01
            X.1L5 r3 = (X.1L5) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315829686242900(0x81050e002c0e54, double:3.029615153464195E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x07af
            r0 = 6
            X.IXy r6 = new X.IXy
            r6.<init>(r4, r3, r0)
            return r6
        L_0x07af:
            X.4LQ r6 = X.AnonymousClass4LQ.A00
            return r6
        L_0x07b2:
            java.lang.Object r0 = r5.A02
            X.2qK r0 = (X.C230822qK) r0
            java.lang.Object r1 = r5.A01
            X.4UE r1 = (X.AnonymousClass4UE) r1
            X.2qi r0 = r0.A05
            r0.DbJ(r1)
        L_0x07bf:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58692Iw1.invoke():java.lang.Object");
    }
}
