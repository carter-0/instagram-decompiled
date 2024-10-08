package X;

/* renamed from: X.AyK  reason: case insensitive filesystem */
public final class C41668AyK extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41668AyK(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i) {
        super(1);
        this.A00 = i;
        this.A0A = obj;
        this.A09 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A05 = obj5;
        this.A07 = obj6;
        this.A06 = obj7;
        this.A02 = obj8;
        this.A04 = obj9;
        this.A08 = obj10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: X.JGn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v105, resolved type: X.JJT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: X.JJT} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r30) {
        /*
            r29 = this;
            r2 = r29
            r7 = r30
            int r0 = r2.A00
            if (r0 == 0) goto L_0x00e2
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            r5 = 0
            X.0qQ.A0B(r7, r5)
            java.lang.Object r3 = r2.A05
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r0 = r2.A08
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r7)
            r3.setBackground(r0)
            java.lang.Object r10 = r2.A07
            X.80G r10 = (X.AnonymousClass80G) r10
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r0 = r10.A0D
            boolean r14 = X.AnonymousClass7TF.A1V(r0)
            if (r14 == 0) goto L_0x003a
            android.view.View r1 = r10.A05()
            r0 = 4
            r1.setVisibility(r0)
        L_0x003a:
            java.lang.Object r6 = r2.A0A
            X.8Lz r6 = (X.C354428Lz) r6
            r6.A05 = r5
            java.lang.Object r11 = r2.A09
            X.861 r11 = (X.AnonymousClass861) r11
            X.2Fj r0 = r11.A0A
            java.lang.Object r1 = r0.A02()
            X.8YU r0 = X.AnonymousClass8YU.PLAYING
            if (r1 != r0) goto L_0x0055
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A03 = r0
        L_0x0055:
            java.lang.Object r4 = r2.A04
            X.8Kz r4 = (X.C354188Kz) r4
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r1 = r4.A05
            float r0 = r6.A00
            X.9Hy r7 = X.AnonymousClass9T9.A00(r1, r0)
            r3 = 1077936128(0x40400000, float:3.0)
            float r8 = r7.A03
            X.9Hy r1 = r6.A01
            float r0 = r1.A03
            float r8 = r8 / r0
            float r8 = r8 * r3
            float r13 = r7.A02
            float r0 = r1.A02
            float r13 = r13 - r0
            float r3 = r7.A00
            float r0 = r1.A00
            float r3 = r3 - r0
            float r7 = r7.A01
            float r0 = r1.A01
            float r7 = r7 - r0
            r1 = 2
            r12 = 1058013184(0x3f100000, float:0.5625)
            float[] r9 = new float[r1]
            float r3 = r3 * r12
            r9[r5] = r3
            r3 = 1
            r9[r3] = r7
            android.graphics.Matrix r7 = X.AnonymousClass7TE.A0U()
            X.9Hy r0 = r6.A01
            float r0 = r0.A02
            float r0 = -r0
            float r0 = r0 - r13
            r7.setRotate(r0)
            r7.mapPoints(r9)
            float r7 = -r13
            r19 = r9[r5]
            float r19 = r19 / r12
            X.9Hy r0 = r6.A01
            float r0 = r0.A03
            float r19 = r19 / r0
            r20 = r9[r3]
            float r20 = r20 / r0
            X.9Hy r9 = new X.9Hy
            r16 = r1
            r17 = r8
            r18 = r7
            r15 = r9
            r15.<init>(r16, r17, r18, r19, r20)
            java.util.List r0 = r6.A07
            java.util.Iterator r13 = r0.iterator()
        L_0x00b6:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0237
            java.lang.Object r12 = r13.next()
            X.59G r12 = (X.AnonymousClass59G) r12
            java.lang.Object r8 = r12.A00
            r7 = r8
            android.view.View r7 = (android.view.View) r7
            java.lang.Object r0 = r12.A01
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            r7.setClipToOutline(r0)
            boolean r0 = r8 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00b6
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 == 0) goto L_0x00b6
            java.lang.Object r0 = r12.A02
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            r8.setClipChildren(r0)
            goto L_0x00b6
        L_0x00e2:
            X.6Gb r7 = (X.C305006Gb) r7
            r12 = 0
            X.0qQ.A0B(r7, r12)
            java.lang.Object r6 = r2.A0A
            X.GnE r6 = (X.C53382GnE) r6
            boolean r11 = r6.A05
            r5 = 1
            r4 = 0
            if (r11 == 0) goto L_0x0123
            X.0sK r0 = X.C55407HhD.A00
            r7.Cf4(r4, r0)
        L_0x00f7:
            java.lang.Object r1 = r6.A01
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r5)
            if (r0 == 0) goto L_0x0106
            X.0sK r0 = X.C55407HhD.A02
        L_0x0101:
            r7.Cf4(r4, r0)
            goto L_0x0289
        L_0x0106:
            if (r11 != 0) goto L_0x0289
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r12)
            if (r0 == 0) goto L_0x0289
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x0289
            r3 = 795031606(0x2f633836, float:2.06655E-10)
            java.lang.Object r2 = r2.A02
            r1 = 20
            X.JJQ r0 = new X.JJQ
            r0.<init>(r2, r1)
            X.5PJ r0 = X.AnonymousClass5PI.A04(r0, r3, r5)
            goto L_0x0101
        L_0x0123:
            java.lang.Object r3 = r2.A09
            X.0lg r3 = (X.0lg) r3
            X.0Tu r10 = X.0Tu.A05
            r0 = 36325145470775967(0x810d870033329f, double:3.03550649311456E-306)
            boolean r0 = X.182.A06(r10, r3, r0)
            if (r0 == 0) goto L_0x0221
            r8 = 269924718(0x1016b96e, float:2.9725134E-29)
            java.lang.Object r1 = r2.A03
            java.lang.Object r9 = r2.A01
            X.JGn r0 = new X.JGn
            r0.<init>(r5, r1, r6, r9)
            X.5PJ r0 = X.AnonymousClass5PI.A04(r0, r8, r5)
            r7.Ey2(r4, r4, r0)
            X.0sK r0 = X.C55407HhD.A01
            r7.Cf4(r4, r0)
        L_0x014c:
            java.lang.Object r1 = r6.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r2.A05
            r28 = r0
            java.lang.Object r14 = r2.A07
            java.lang.Object r0 = r2.A06
            r27 = r0
            java.lang.Object r0 = r2.A02
            r26 = r0
            java.lang.Object r0 = r2.A04
            r25 = r0
            java.lang.Object r0 = r2.A08
            r24 = r0
            java.util.ArrayList r13 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r16 = r1.iterator()
        L_0x016e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r8 = r16.next()
            X.JcX r8 = (X.C59964JcX) r8
            boolean r15 = r6.A06
            java.lang.Object r0 = r8.A02
            X.Gll r0 = (X.C53299Gll) r0
            X.Kiw r0 = r0.A01
            int r1 = r0.ordinal()
            r0 = 5
            if (r1 == r0) goto L_0x0206
            r0 = 7
            if (r1 == r0) goto L_0x01d3
            r0 = 4
            if (r1 == r0) goto L_0x01be
            r0 = 3
            if (r1 != r0) goto L_0x01d3
            r0 = 36325145470382748(0x810d87002d329c, double:3.035506492865887E-306)
            boolean r0 = X.182.A06(r10, r3, r0)
            if (r0 == 0) goto L_0x01b8
            r1 = -1212900206(0xffffffffb7b49c92, float:-2.153058E-5)
            r18 = 2
            X.JJT r0 = new X.JJT
            r17 = r0
            r19 = r8
            r20 = r28
            r21 = r25
            r22 = r9
            r17.<init>(r18, r19, r20, r21, r22)
        L_0x01b1:
            X.5PJ r0 = X.AnonymousClass5PI.A04(r0, r1, r5)
        L_0x01b5:
            r7.Cf4(r4, r0)
        L_0x01b8:
            X.0gF r0 = X.C60340gF.A00
            r13.add(r0)
            goto L_0x016e
        L_0x01be:
            r0 = 36325145467826818(0x810d8700063282, double:3.0355064912495066E-306)
            boolean r0 = X.182.A06(r10, r3, r0)
            if (r0 == 0) goto L_0x01b8
            r1 = 1863787473(0x6f1723d1, float:4.6775536E28)
            r15 = 3
            X.JGn r0 = new X.JGn
            r0.<init>(r15, r8, r14, r9)
            goto L_0x01b1
        L_0x01d3:
            r18 = 3
            X.JJT r1 = new X.JJT
            r17 = r1
            r19 = r25
            r20 = r8
            r21 = r27
            r22 = r9
            r17.<init>(r18, r19, r20, r21, r22)
            r0 = -1661394091(0xffffffff9cf92355, float:-1.6486571E-21)
            X.5PJ r0 = X.AnonymousClass5PI.A04(r1, r0, r5)
            r7.Cf4(r4, r0)
            r18 = 4
            X.JJT r1 = new X.JJT
            r17 = r1
            r19 = r28
            r21 = r24
            r17.<init>(r18, r19, r20, r21, r22)
            r0 = -751562996(0xffffffffd3340f0c, float:-7.7334656E11)
            X.5PJ r0 = X.AnonymousClass5PI.A04(r1, r0, r5)
            r7.Cf4(r4, r0)
            goto L_0x01b8
        L_0x0206:
            r1 = -1528704108(0xffffffffa4e1d394, float:-9.793662E-17)
            r18 = 2
            X.JH6 r0 = new X.JH6
            r21 = r26
            r22 = r9
            r23 = r15
            r17 = r0
            r19 = r8
            r20 = r28
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.5PJ r0 = X.AnonymousClass5PI.A04(r0, r1, r5)
            goto L_0x01b5
        L_0x0221:
            r13 = 781073673(0x2e8e3d09, float:6.4682544E-11)
            java.lang.Object r9 = r2.A01
            java.lang.Object r8 = r2.A03
            r1 = 2
            X.JGn r0 = new X.JGn
            r0.<init>(r1, r8, r6, r9)
            X.5PJ r0 = X.AnonymousClass5PI.A04(r0, r13, r5)
            r7.Cf4(r4, r0)
            goto L_0x014c
        L_0x0237:
            r8 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r14 == 0) goto L_0x0315
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r0 = r10.A06()
            r0.setTransform(r8)
        L_0x0243:
            int r0 = r11.A00()
            r11.A07(r0)
            r11.A04()
            java.lang.Object r10 = r2.A02
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r10 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r10
            X.2Fk r0 = r10.A0C
            r11.A09(r0)
            java.lang.Object r0 = r2.A01
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x028c
            X.6oS r1 = X.C318116oQ.A00(r10)
            r0 = 46
            X.AnonymousClass7TF.A1K(r10, r1, r0)
        L_0x0267:
            r6.A04 = r5
            X.9Hy r0 = r6.A01
            float r9 = r0.A03
            float r5 = r0.A02
            float r1 = r0.A00
            float r0 = r0.A01
            r4.A09(r9, r5, r1, r0)
            r6.A04 = r3
            r6.A00 = r7
            r4.A00 = r7
            r4.A01 = r7
            r4.A08 = r8
            java.lang.Object r0 = r2.A06
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0289
            r0.invoke()
        L_0x0289:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x028c:
            java.lang.Object r14 = r2.A03
            X.8M1 r14 = (X.AnonymousClass8M1) r14
            X.9Hy r13 = r6.A01
            X.9bu r0 = X.AnonymousClass8M1.A00(r14)
            if (r0 == 0) goto L_0x0267
            int r12 = r0.A02
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            boolean r0 = r13.A00()
            if (r0 == 0) goto L_0x0302
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r14.A04
            X.2gB r0 = r0.A0F
            java.lang.Object r10 = r0.A02()
            X.831 r10 = (X.AnonymousClass831) r10
            if (r10 == 0) goto L_0x0302
            java.util.List r0 = r10.A01
            int r0 = r0.size()
            X.2HY r0 = X.C229632nm.A0C(r5, r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x02be:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0302
            java.lang.Object r15 = r16.next()
            int r0 = X.AnonymousClass7TE.A0M(r15)
            if (r11 == 0) goto L_0x02f3
            if (r0 != r12) goto L_0x02f3
            X.9Hy r0 = X.C39899AIg.A02(r9)
        L_0x02d4:
            X.9Hy r0 = X.C39899AIg.A01(r0)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x02be
            if (r15 == 0) goto L_0x0302
            X.AnonymousClass8M1.A03(r13, r9, r14, r11, r3)
            r10 = 0
            r12 = 15
            X.9Hy r9 = new X.9Hy
            r11 = r10
            r13 = r10
            r15 = r10
            r14 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r6.A01 = r9
            goto L_0x0267
        L_0x02f3:
            X.51O r0 = r10.A04(r0)
            X.51N r0 = (X.AnonymousClass51N) r0
            if (r0 == 0) goto L_0x0300
            X.9Hy r0 = r0.A04()
            goto L_0x02d4
        L_0x0300:
            r0 = r8
            goto L_0x02d4
        L_0x0302:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r14.A04
            X.9Hy r0 = X.C39899AIg.A02(r9)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r11, r0)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r1.A0k(r0, r3)
            goto L_0x0267
        L_0x0315:
            android.view.View r0 = r10.A05()
            r0.setScaleX(r7)
            android.view.View r0 = r10.A05()
            r0.setScaleY(r7)
            goto L_0x0243
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41668AyK.invoke(java.lang.Object):java.lang.Object");
    }
}
