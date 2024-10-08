package X;

/* renamed from: X.J6a  reason: case insensitive filesystem */
public final class C59093J6a extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59093J6a(C284945Oz r2, C284945Oz r3, 0sL r4, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A01 = i;
        this.A03 = r4;
        if (7 - i2 != 0) {
            this.A02 = r2;
            this.A04 = r3;
        } else {
            this.A04 = r2;
            this.A02 = r3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0148, code lost:
        r2.invoke(r1, r3.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01d6, code lost:
        r4 = java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01da, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01e0, code lost:
        if (r11.BBZ() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01e2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02a8, code lost:
        r11.A07(r6, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r4 = r18
            r11 = r19
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0241;
                case 1: goto L_0x01e4;
                case 2: goto L_0x01c2;
                case 3: goto L_0x01ad;
                case 4: goto L_0x0183;
                case 5: goto L_0x02e2;
                case 6: goto L_0x0151;
                case 7: goto L_0x012b;
                case 8: goto L_0x010f;
                case 9: goto L_0x02b8;
                case 10: goto L_0x00f2;
                case 11: goto L_0x00d2;
                case 12: goto L_0x00bc;
                case 13: goto L_0x00a6;
                case 14: goto L_0x005b;
                default: goto L_0x0009;
            }
        L_0x0009:
            android.view.View r11 = (android.view.View) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r6 = r4.A02
            X.Hju r6 = (X.C55574Hju) r6
            java.lang.Object r3 = r4.A04
            X.4dG r3 = (X.C268364dG) r3
            int r2 = r4.A01
            X.0qQ.A0B(r3, r0)
            java.util.Map r1 = X.C55397Hh3.A00
            java.lang.String r0 = r3.A05
            java.lang.Object r5 = r1.get(r0)
            if (r5 != 0) goto L_0x002e
            X.VZd r5 = new X.VZd
            r5.<init>(r3, r2)
            r1.put(r0, r5)
        L_0x002e:
            X.VZd r5 = (X.C17524VZd) r5
            java.lang.Object r3 = r4.A03
            com.instagram.model.shopping.productfeed.ProductFeedItem r3 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r3
            X.0qQ.A0A(r3)
            X.AnonymousClass7TG.A1Q(r5, r3)
            X.Uau r0 = r6.A00
            X.0eM r2 = r0.A0M
            java.lang.Object r1 = r2.getValue()
            X.2qn r1 = (X.C231052qn) r1
            java.lang.String r0 = ""
            r1.A02(r3, r5, r0)
            java.lang.Object r1 = r2.getValue()
            X.2qn r1 = (X.C231052qn) r1
            X.4dH r0 = r5.A02
            java.lang.String r0 = r0.Bxn()
            r1.A00(r11, r3, r0)
        L_0x0058:
            X.0gF r4 = X.C60340gF.A00
        L_0x005a:
            return r4
        L_0x005b:
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            r8 = 0
            X.0qQ.A0B(r11, r8)
            java.lang.Object r6 = r4.A02
            android.util.SparseArray r6 = (android.util.SparseArray) r6
            int r7 = r4.A01
            int r1 = r11.getWidth()
            int r0 = r11.getHeight()
            android.graphics.Bitmap r5 = X.AnonymousClass7TF.A0B(r1, r0)
            r0 = 3
            android.graphics.Paint r3 = X.AnonymousClass7TE.A0V(r0)
            int r1 = r11.getWidth()
            int r0 = r11.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r8, r8, r1, r0)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r5)
            r0 = 1
            r3.setAntiAlias(r0)
            X.C51976G9y.A0O(r11, r1, r3, r2)
            r6.put(r7, r5)
            int r1 = r6.size()
            java.lang.Object r0 = r4.A03
            X.0rk r0 = (X.0rk) r0
            int r0 = r0.A00
            if (r1 != r0) goto L_0x0058
            java.lang.Object r0 = r4.A04
            X.C51965G9l.A1W(r0, r6)
            goto L_0x0058
        L_0x00a6:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r3 = r4.A03
            X.0sJ r3 = (X.0sJ) r3
            java.lang.Object r2 = r4.A04
            int r0 = r4.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.A02
            r3.invoke(r11, r2, r1, r0)
            goto L_0x0058
        L_0x00bc:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r3 = r4.A03
            X.0sJ r3 = (X.0sJ) r3
            java.lang.Object r2 = r4.A04
            int r0 = r4.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.A02
            r3.invoke(r2, r11, r1, r0)
            goto L_0x0058
        L_0x00d2:
            X.HoV r11 = (X.C55848HoV) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r4.A04
            X.Hik r0 = (X.C55502Hik) r0
            X.JT3 r0 = r0.A00
            X.JSv r8 = r0.BQD()
            java.lang.Object r9 = r4.A02
            X.1Xj r9 = (X.1Xj) r9
            java.lang.Object r12 = r4.A03
            X.3W1 r12 = (X.AnonymousClass3W1) r12
            int r13 = r4.A01
            r10 = 0
            r8.DlA(r9, r10, r11, r12, r13)
            goto L_0x0058
        L_0x00f2:
            java.lang.Object r0 = r4.A03
            X.GlF r0 = (X.C53267GlF) r0
            X.JwM r0 = r0.A01
            java.lang.Object r3 = r0.A00
            X.0sK r3 = (X.0sK) r3
            java.lang.Object r2 = r4.A02
            int r0 = r4.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.A04
            X.HqY r0 = (X.C55967HqY) r0
            X.JPN r0 = r0.A00
            r3.invoke(r2, r1, r0)
            goto L_0x0058
        L_0x010f:
            java.lang.String r1 = X.C41847B3o.A1E(r11)
            java.lang.Object r3 = r4.A02
            X.5Oz r3 = (X.C284945Oz) r3
            int r0 = r4.A01
            java.lang.String r0 = X.00R.A03(r1, r0)
            r3.Epw(r0)
            java.lang.Object r2 = r4.A03
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r0 = r4.A04
            java.lang.Object r1 = X.C51966G9m.A17(r0)
            goto L_0x0148
        L_0x012b:
            java.lang.String r2 = X.C41847B3o.A1E(r11)
            java.lang.Object r1 = r4.A04
            X.5Oz r1 = (X.C284945Oz) r1
            int r0 = r4.A01
            java.lang.String r0 = X.00R.A03(r2, r0)
            r1.Epw(r0)
            java.lang.Object r2 = r4.A03
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r3 = r4.A02
            X.5Oz r3 = (X.C284945Oz) r3
        L_0x0148:
            java.lang.Object r0 = r3.getValue()
            r2.invoke(r1, r0)
            goto L_0x0058
        L_0x0151:
            X.6Gb r9 = X.C51968G9o.A0L(r11)
            java.lang.Object r8 = r4.A04
            java.util.List r8 = (java.util.List) r8
            X.J2R r1 = X.J2R.A00
            java.lang.Object r7 = r4.A02
            androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
            int r6 = r4.A01
            java.lang.Object r5 = r4.A03
            X.0sP r5 = (X.0sP) r5
            X.J2S r4 = X.J2S.A00
            int r3 = r8.size()
            r0 = 36
            X.J6k r2 = new X.J6k
            r2.<init>((int) r0, (java.util.List) r8, (X.0sP) r1)
            r0 = 37
            X.J6k r1 = new X.J6k
            r1.<init>((int) r0, (java.util.List) r8, (X.0sP) r4)
            X.JJZ r0 = new X.JJZ
            r0.<init>(r7, r8, r5, r6)
            X.C51967G9n.A12(r9, r0, r2, r1, r3)
            goto L_0x0058
        L_0x0183:
            X.4cl r11 = (X.C268104cl) r11
            r2 = 0
            X.0qQ.A0B(r11, r2)
            java.lang.Object r0 = r4.A02
            X.4cY r0 = (X.C267974cY) r0
            if (r0 == 0) goto L_0x01ab
            r11.A07(r0, r2, r2)
            int r1 = r0.A00
        L_0x0194:
            java.lang.Object r0 = r4.A03
            X.4cY r0 = (X.C267974cY) r0
            if (r0 == 0) goto L_0x019d
            r11.A07(r0, r2, r1)
        L_0x019d:
            int r0 = r4.A01
            int r1 = r1 + r0
            java.lang.Object r0 = r4.A04
            X.4cY r0 = (X.C267974cY) r0
            if (r0 == 0) goto L_0x0058
            r11.A07(r0, r2, r1)
            goto L_0x0058
        L_0x01ab:
            r1 = 0
            goto L_0x0194
        L_0x01ad:
            X.6Hm r11 = (X.C305336Hm) r11
            java.lang.Object r3 = r4.A04
            X.4e0 r3 = (X.C268794e0) r3
            java.lang.Object r2 = r4.A02
            X.5VN r2 = (X.AnonymousClass5VN) r2
            int r1 = r4.A01
            java.lang.Object r0 = r4.A03
            X.0sP r0 = (X.0sP) r0
            boolean r0 = X.I7B.A04(r3, r2, r0, r1)
            goto L_0x01d6
        L_0x01c2:
            X.6Hm r11 = (X.C305336Hm) r11
            java.lang.Object r3 = r4.A04
            X.4e0 r3 = (X.C268794e0) r3
            java.lang.Object r2 = r4.A02
            X.4e0 r2 = (X.C268794e0) r2
            int r1 = r4.A01
            java.lang.Object r0 = r4.A03
            X.0sP r0 = (X.0sP) r0
            boolean r0 = X.C56628I5h.A00(r3, r2, r0, r1)
        L_0x01d6:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L_0x005a
            boolean r0 = r11.BBZ()
            if (r0 == 0) goto L_0x005a
            r4 = 0
            return r4
        L_0x01e4:
            X.4cl r11 = (X.C268104cl) r11
            java.lang.Object r5 = r4.A03
            X.4cd r5 = (X.C268024cd) r5
            java.lang.Object r8 = r4.A04
            X.IGD r8 = (X.IGD) r8
            int r3 = r8.A00
            X.HsL r2 = r8.A02
            X.0sa r0 = r8.A03
            java.lang.Object r0 = r0.invoke()
            X.I1h r0 = (X.C56553I1h) r0
            if (r0 == 0) goto L_0x023f
            X.62f r1 = r0.A02
        L_0x01fe:
            java.lang.Object r6 = r4.A02
            X.4cY r6 = (X.C267974cY) r6
            r7 = 0
            if (r1 == 0) goto L_0x023c
            X.JS3 r0 = r2.A01
            int r0 = r0.E1S(r3)
            X.5VN r0 = r1.A06(r0)
        L_0x020f:
            X.5b9 r1 = X.C55294HfN.A00
            r1 = 1073741824(0x40000000, float:2.0)
            int r1 = r5.EJS(r1)
            float r3 = r0.A01
            float r1 = (float) r1
            float r2 = r3 + r1
            float r1 = r0.A03
            float r0 = r0.A00
            X.5VN r5 = new X.5VN
            r5.<init>(r3, r1, r2, r0)
            X.I4L r3 = r8.A01
            X.6Gj r2 = X.AnonymousClass6Gj.Vertical
            int r1 = r4.A01
            int r0 = r6.A00
            r3.A00(r2, r5, r1, r0)
            X.5PZ r0 = r3.A03
            float r0 = r0.B6X()
            float r0 = -r0
            int r0 = java.lang.Math.round(r0)
            goto L_0x02a8
        L_0x023c:
            X.5VN r0 = X.AnonymousClass5VN.A04
            goto L_0x020f
        L_0x023f:
            r1 = 0
            goto L_0x01fe
        L_0x0241:
            X.4cl r11 = (X.C268104cl) r11
            java.lang.Object r8 = r4.A03
            X.4cc r8 = (X.C268014cc) r8
            java.lang.Object r7 = r4.A04
            X.IGC r7 = (X.IGC) r7
            int r10 = r7.A00
            X.HsL r9 = r7.A02
            X.0sa r0 = r7.A03
            java.lang.Object r0 = r0.invoke()
            X.I1h r0 = (X.C56553I1h) r0
            if (r0 == 0) goto L_0x02b6
            X.62f r5 = r0.A02
        L_0x025b:
            X.5Q8 r1 = r8.getLayoutDirection()
            X.5Q8 r0 = X.AnonymousClass5Q8.Rtl
            boolean r3 = X.AnonymousClass7TF.A1W(r1, r0)
            java.lang.Object r6 = r4.A02
            X.4cY r6 = (X.C267974cY) r6
            int r2 = r6.A01
            if (r5 == 0) goto L_0x02b3
            X.JS3 r0 = r9.A01
            int r0 = r0.E1S(r10)
            X.5VN r0 = r5.A06(r0)
        L_0x0277:
            X.5b9 r1 = X.C55294HfN.A00
            r1 = 1073741824(0x40000000, float:2.0)
            int r5 = r8.EJS(r1)
            if (r3 == 0) goto L_0x02ad
            float r3 = (float) r2
            float r1 = r0.A01
            float r3 = r3 - r1
            float r1 = (float) r5
            float r2 = r3 - r1
        L_0x0288:
            float r1 = r0.A03
            float r0 = r0.A00
            X.5VN r5 = new X.5VN
            r5.<init>(r2, r1, r3, r0)
            X.I4L r3 = r7.A01
            X.6Gj r2 = X.AnonymousClass6Gj.Horizontal
            int r1 = r4.A01
            int r0 = r6.A01
            r3.A00(r2, r5, r1, r0)
            X.5PZ r0 = r3.A03
            float r0 = r0.B6X()
            float r0 = -r0
            int r7 = java.lang.Math.round(r0)
            r0 = 0
        L_0x02a8:
            r11.A07(r6, r7, r0)
            goto L_0x0058
        L_0x02ad:
            float r2 = r0.A01
            float r1 = (float) r5
            float r3 = r2 + r1
            goto L_0x0288
        L_0x02b3:
            X.5VN r0 = X.AnonymousClass5VN.A04
            goto L_0x0277
        L_0x02b6:
            r5 = 0
            goto L_0x025b
        L_0x02b8:
            X.3s3 r11 = (X.C254173s3) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            android.view.View r0 = r11.A01
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r0)
            java.lang.Object r0 = r4.A04
            X.HnE r0 = (X.C55779HnE) r0
            X.4GN r0 = r0.A01
            X.JSu r6 = r0.Am7()
            int r2 = r4.A01
            java.lang.Object r1 = r4.A02
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r4.A03
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.ITs r4 = new X.ITs
            r7 = r11
            r8 = r1
            r9 = r0
            r10 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x02e2:
            java.lang.String r11 = (java.lang.String) r11
            r15 = 0
            X.0qQ.A0B(r11, r15)
            java.lang.Object r5 = r4.A02
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r7 = r4.A03
            X.6MT r7 = (X.AnonymousClass6MT) r7
            int r14 = r4.A01
            java.lang.Object r6 = r4.A04
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            r9 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r15)
            X.5xX r4 = new X.5xX
            r10 = r9
            r12 = r9
            r13 = r9
            r16 = r15
            r17 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59093J6a.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59093J6a(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(1);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
        this.A04 = obj3;
    }
}
