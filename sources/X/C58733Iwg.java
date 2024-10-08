package X;

/* renamed from: X.Iwg  reason: case insensitive filesystem */
public final class C58733Iwg extends 0Yg implements 0sP {
    public final float A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58733Iwg(Object obj, float f, int i) {
        super(1);
        this.A01 = i;
        this.A00 = f;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x016c, code lost:
        r2.A0n(r1, r10.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        r3.A0o(r2, (r1 * ((float) r0)) / ((float) r2.getIntrinsicHeight()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x0032;
                case 1: goto L_0x0082;
                case 2: goto L_0x00a5;
                case 3: goto L_0x00bb;
                case 4: goto L_0x0173;
                case 5: goto L_0x00d5;
                case 6: goto L_0x0139;
                case 7: goto L_0x0148;
                case 8: goto L_0x015c;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.9IZ r11 = (X.AnonymousClass9IZ) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r2 = r10.A02
            X.8bk r2 = (X.C358958bk) r2
            android.content.Context r0 = r2.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165266(0x7f070052, float:1.7944744E38)
            int r0 = r1.getDimensionPixelSize(r0)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r2.A02
            java.lang.Object r2 = r11.A03
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            float r1 = r10.A00
        L_0x0024:
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = r2.getIntrinsicHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            r3.A0o(r2, r1)
        L_0x002f:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0032:
            long r4 = X.AnonymousClass7TE.A0R(r11)
            java.lang.Object r8 = r10.A02
            X.I4f r8 = (X.C56606I4f) r8
            X.5Oz r0 = r8.A05
            boolean r0 = X.C51971G9r.A1W(r0)
            if (r0 != 0) goto L_0x002f
            r0 = 1
            long r4 = r4 / r0
            float r9 = r10.A00
            X.6G2 r3 = r8.A04
            long r6 = r3.BOX()
            r1 = -9223372036854775808
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            r3.Ecf(r4)
            X.HhV r0 = r8.A02
            r1 = 1
            X.5Oz r0 = r0.A00
            X.C51967G9n.A16(r0, r1)
        L_0x005e:
            long r0 = r3.BOX()
            long r4 = r4 - r0
            r7 = 1
            r6 = 0
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0070
            double r2 = (double) r4
            double r0 = (double) r9
            double r2 = r2 / r0
            long r4 = X.AnonymousClass1GB.A02(r2)
        L_0x0070:
            X.I4f r0 = r8.A01
            if (r0 != 0) goto L_0x0079
            X.6G2 r0 = r8.A03
            r0.Ecf(r4)
        L_0x0079:
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x007e
            r7 = 0
        L_0x007e:
            r8.A06(r4, r7)
            goto L_0x002f
        L_0x0082:
            X.SOO r11 = (X.SOO) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.5Q8 r1 = r11.A01
            if (r1 == 0) goto L_0x017a
            X.5Q8 r0 = X.AnonymousClass5Q8.Rtl
            if (r1 != r0) goto L_0x00a2
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r10.A00
            float r1 = r1 - r0
        L_0x0095:
            java.lang.Object r0 = r10.A02
            X.Htj r0 = (X.C56156Htj) r0
            java.lang.Object r0 = r0.A08
            X.Sd4 r0 = r11.A00(r0)
            r0.A00 = r1
            goto L_0x002f
        L_0x00a2:
            float r1 = r10.A00
            goto L_0x0095
        L_0x00a5:
            X.SOO r11 = (X.SOO) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r10.A02
            X.Htj r0 = (X.C56156Htj) r0
            java.lang.Object r0 = r0.A08
            X.Sd4 r1 = r11.A00(r0)
            float r0 = r10.A00
            r1.A01 = r0
            goto L_0x002f
        L_0x00bb:
            X.5RU r3 = X.C51968G9o.A0S(r11)
            java.lang.Object r0 = r10.A02
            X.GQw r0 = (X.C52397GQw) r0
            X.5Oz r0 = r0.A03
            float r2 = X.C51971G9r.A02(r0)
            float r1 = r10.A00
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d0
            r2 = r1
        L_0x00d0:
            r3.EpH(r2)
            goto L_0x002f
        L_0x00d5:
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            r7 = 0
            X.0qQ.A0B(r11, r7)
            int r1 = r11.getWidth()
            int r0 = r11.getHeight()
            android.graphics.Bitmap r5 = X.AnonymousClass7TF.A0B(r1, r0)
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r5)
            int r0 = r11.getWidth()
            float r0 = (float) r0
            float r1 = r10.A00
            float r0 = r0 / r1
            int r2 = (int) r0
            int r0 = r11.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r1
            int r1 = (int) r0
            int r0 = r11.getWidth()
            int r8 = r0 / 2
            int r3 = r2 / 2
            int r8 = r8 - r3
            int r0 = r11.getHeight()
            int r4 = r0 / 2
            int r2 = r1 / 2
            int r4 = r4 - r2
            int r0 = r11.getWidth()
            int r1 = r0 / 2
            int r1 = r1 + r3
            int r0 = r11.getHeight()
            int r0 = r0 / 2
            int r0 = r0 + r2
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r8, r4, r1, r0)
            int r2 = r11.getWidth()
            int r0 = r11.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r7, r7, r2, r0)
            r0 = 0
            r6.drawBitmap(r11, r3, r1, r0)
            java.lang.Object r0 = r10.A02
            X.C51965G9l.A1W(r0, r5)
            goto L_0x002f
        L_0x0139:
            X.9br r11 = (X.C381499br) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r10.A02
            X.ADh r0 = (X.C39885ADh) r0
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r0.A01
            android.graphics.drawable.Drawable r1 = r11.A03
            goto L_0x016c
        L_0x0148:
            X.9br r11 = (X.C381499br) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r10.A02
            X.ADh r0 = (X.C39885ADh) r0
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r0.A01
            android.graphics.drawable.Drawable r2 = r11.A03
            float r1 = r10.A00
            int r0 = r11.A02
            goto L_0x0024
        L_0x015c:
            X.9IZ r11 = (X.AnonymousClass9IZ) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r10.A02
            X.8bk r0 = (X.C358958bk) r0
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r0.A02
            java.lang.Object r1 = r11.A03
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
        L_0x016c:
            float r0 = r10.A00
            r2.A0n(r1, r0)
            goto L_0x002f
        L_0x0173:
            java.lang.String r0 = "setName"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x017a:
            java.lang.String r0 = "layoutDirection"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58733Iwg.invoke(java.lang.Object):java.lang.Object");
    }
}
