package X;

import android.content.res.Resources;
import android.widget.TextView;

/* renamed from: X.KMa  reason: case insensitive filesystem */
public final class C61786KMa extends C60688JpZ {
    public final TextView A00;
    public final C62595KiS A01;
    public final boolean A02;
    public final Resources A03;
    public final boolean A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61786KMa(android.content.Context r18, X.C66544MVy r19, X.C62595KiS r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            r17 = this;
            r9 = 1
            r6 = 0
            X.Jea r4 = new X.Jea
            r5 = r18
            r8 = r21
            r12 = r22
            r7 = r23
            r10 = r6
            r11 = r6
            r13 = r6
            r14 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.9kV r15 = X.C394679yV.A00(r5, r8, r8)
            r10 = r17
            r14 = r19
            r11 = r5
            r12 = r4
            r13 = r4
            r16 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0 = r24
            r10.A02 = r0
            r0 = r25
            r10.A04 = r0
            r0 = r20
            r10.A01 = r0
            android.content.res.Resources r4 = r5.getResources()
            r10.A03 = r4
            X.Jea r3 = r10.A01
            android.view.LayoutInflater r1 = X.DbV.A0D(r3)
            int r0 = r0.A04
            android.view.View r2 = r1.inflate(r0, r3, r6)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r2, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r10.A00 = r2
            r0 = 2130971219(0x7f040a53, float:1.755117E38)
            java.lang.Integer r0 = X.2Yu.A0J(r5, r0)
            if (r0 == 0) goto L_0x0088
            int r0 = r0.intValue()
        L_0x0057:
            r3.A06 = r0
            X.C60688JpZ.A00(r4, r3)
            if (r26 == 0) goto L_0x0083
            r0 = 2131165304(0x7f070078, float:1.7944821E38)
            int r1 = X.DbS.A03(r4, r0)
        L_0x0065:
            r0 = -2
            X.JTQ.A0w(r3, r0, r1)
            r0 = 16
            X.0nA.A0W(r2, r0)
            r2.setHorizontalFadingEdgeEnabled(r6)
            r2.setVerticalFadingEdgeEnabled(r6)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r0)
            r2.setSingleLine(r9)
            r2.setSelected(r9)
            r3.addView(r2)
            return
        L_0x0083:
            int r1 = X.JTT.A02(r5)
            goto L_0x0065
        L_0x0088:
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r0 = r4.getDimensionPixelSize(r0)
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61786KMa.<init>(android.content.Context, X.MVy, X.KiS, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x018f, code lost:
        if (r0 == 0) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01a9, code lost:
        if (r0 != false) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01b1, code lost:
        if (r12 != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x020e, code lost:
        if (r0 == null) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0210, code lost:
        r14 = X.JTQ.A08(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0220, code lost:
        if (X.JTO.A01(r14.getBitmap()) <= r12) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0222, code lost:
        r12 = r12 / X.JTO.A01(r14.getBitmap());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x022e, code lost:
        if (r12 == 1.0f) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0230, code lost:
        r0 = X.0fO.A00(r14.getBitmap(), (int) (X.JTO.A02(r14.getBitmap()) * r12), (int) (X.JTO.A01(r14.getBitmap()) * r12), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x024c, code lost:
        if (r0 == null) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x024e, code lost:
        r1 = X.JTQ.A08(r10, r0);
        r11 = r9.A00;
        r13 = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{r5, r1});
        r13.setLayerInset(0, 0, 0, X.DbS.A02(r10, 12), 0);
        r13.setLayerGravity(0, 19);
        r13.setLayerGravity(1, 21);
        r13.setBounds(0, 0, (int) ((((float) r3) + X.0nA.A04(r10, 8)) + ((float) r1.getIntrinsicWidth())), java.lang.Math.max(r3, r1.getIntrinsicHeight()));
        r4 = r13.getDrawable(0);
        r1 = X.DbS.A02(r10, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x029a, code lost:
        if (r4 == null) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x029c, code lost:
        r4.setBounds(0, r1, r3, r3 + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02a1, code lost:
        r11.setCompoundDrawables(r13, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        X.DbS.A1C(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02b9, code lost:
        r0 = r14.getBitmap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r10 != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r11.Ayv() != false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0108, code lost:
        if (r0 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x010a, code lost:
        if (r0 != null) goto L_0x0210;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0179 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.MVO r20, int r21) {
        /*
            r19 = this;
            r8 = 0
            r9 = r19
            X.Jea r7 = r9.A01
            r11 = r20
            boolean r0 = r11.BrY()
            if (r0 == 0) goto L_0x0014
            boolean r1 = r11.Ayv()
            r0 = 1
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r7.setEnableTrim(r0)
            boolean r10 = r11.Ayv()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L_0x0023
            r0 = 1060320051(0x3f333333, float:0.7)
        L_0x0023:
            r7.setAlpha(r0)
            java.lang.Integer r14 = r11.CFq()
            java.lang.Integer r13 = X.AnonymousClass05K.A15
            r6 = 0
            if (r14 != r13) goto L_0x0038
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x0038
            android.content.res.Resources r0 = r9.A03
            X.C60688JpZ.A00(r0, r7)
        L_0x0038:
            boolean r12 = r11 instanceof X.C61194Jyn
            r2 = r21
            if (r12 == 0) goto L_0x01b0
            r0 = r11
            X.Jyn r0 = (X.C61194Jyn) r0
            if (r0 == 0) goto L_0x01b0
            int r1 = r0.A05
        L_0x0045:
            r0 = r11
            X.Jyn r0 = (X.C61194Jyn) r0
            if (r0 == 0) goto L_0x01b5
            int r0 = r0.A02
        L_0x004c:
            r7.A0H = r1
            r7.A0G = r0
            r7.A0C = r2
            r7.A0D = r2
            r7.A08()
            android.content.res.Resources r2 = r9.A03
            X.KhL r1 = r11.CAX()
            int r5 = r1.ordinal()
            r4 = 8
            if (r5 == r8) goto L_0x019c
            r0 = 2
            if (r5 == r0) goto L_0x0196
            if (r5 == r4) goto L_0x01ab
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r14 == r0) goto L_0x0073
            r3 = 2131100512(0x7f060360, float:1.7813408E38)
            if (r10 == 0) goto L_0x0076
        L_0x0073:
            r3 = 2131100513(0x7f060361, float:1.781341E38)
        L_0x0076:
            int r0 = r2.getColor(r3, r6)
            r7.setBackgroundColor(r0)
            android.content.Context r10 = r9.A00
            if (r5 == r8) goto L_0x0179
            if (r5 == r4) goto L_0x0174
            r0 = 3
            if (r5 == r0) goto L_0x016f
            r0 = 4
            if (r5 == r0) goto L_0x016a
            r0 = 7
            r3 = 2131237898(0x7f081c0a, float:1.809206E38)
            if (r5 == r0) goto L_0x0092
            r3 = 2131238849(0x7f081fc1, float:1.8093988E38)
        L_0x0092:
            android.graphics.drawable.Drawable r5 = r10.getDrawable(r3)
            X.KiS r4 = r9.A01
            int r0 = r4.A01
            int r3 = X.DbS.A02(r10, r0)
            if (r5 == 0) goto L_0x00a3
            r5.setBounds(r8, r8, r3, r3)
        L_0x00a3:
            if (r14 != r13) goto L_0x0152
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x0152
            int r0 = r4.A00
            int r2 = r2.getColor(r0, r6)
        L_0x00af:
            if (r5 == 0) goto L_0x00b6
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            X.C51969G9p.A12(r0, r5, r2)
        L_0x00b6:
            if (r12 == 0) goto L_0x014f
            r0 = r11
            X.Jyn r0 = (X.C61194Jyn) r0
            if (r0 == 0) goto L_0x014f
            X.JwI r0 = r0.A06
            if (r0 == 0) goto L_0x014f
            java.lang.Object r12 = r0.A00
            X.5MI r12 = (X.AnonymousClass5MI) r12
        L_0x00c5:
            boolean r0 = r12 instanceof X.AnonymousClass5MH
            if (r0 == 0) goto L_0x014d
            X.5MH r12 = (X.AnonymousClass5MH) r12
            if (r12 == 0) goto L_0x014d
            android.graphics.drawable.Drawable r13 = r12.A0A
        L_0x00cf:
            X.KhL r0 = X.C62529KhL.STICKER
            if (r1 != r0) goto L_0x01bc
            if (r13 == 0) goto L_0x01bc
            r0 = 1098907648(0x41800000, float:16.0)
            float r12 = X.0nA.A00(r10, r0)
            int r0 = (int) r12
            r18 = r0
            boolean r0 = r13 instanceof X.AnonymousClass5MI
            if (r0 == 0) goto L_0x00e8
            X.5MI r13 = (X.AnonymousClass5MI) r13
            android.graphics.drawable.Drawable r13 = r13.AfT()
        L_0x00e8:
            boolean r0 = r13 instanceof X.C347017w8
            if (r0 == 0) goto L_0x00f5
            X.7w8 r13 = (X.C347017w8) r13
            android.graphics.drawable.Drawable r13 = r13.A04()
            X.0qQ.A0A(r13)
        L_0x00f5:
            boolean r0 = r13 instanceof X.C321056tV
            r17 = 0
            if (r0 == 0) goto L_0x013d
            boolean r0 = r13 instanceof X.AnonymousClass8N6
            if (r0 == 0) goto L_0x010c
            r1 = r13
            X.6tR r1 = (X.C321016tR) r1
            boolean r0 = r1.A0t
            if (r0 == 0) goto L_0x010c
            android.graphics.Bitmap r0 = r1.A08
            if (r0 == 0) goto L_0x010c
        L_0x010a:
            if (r0 != 0) goto L_0x0210
        L_0x010c:
            int r0 = r13.getIntrinsicWidth()
            if (r0 <= 0) goto L_0x01bc
            int r0 = r13.getIntrinsicHeight()
            if (r0 <= 0) goto L_0x01bc
            int r14 = r13.getIntrinsicWidth()
            int r1 = r13.getIntrinsicHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r16 = android.graphics.Bitmap.createBitmap(r14, r1, r0)
            android.graphics.Canvas r15 = X.JTO.A0B(r16)
            android.graphics.Rect r14 = r13.copyBounds()
            X.0qQ.A07(r14)
            int r1 = r15.getWidth()
            int r0 = r15.getHeight()
            r13.setBounds(r8, r8, r1, r0)
            goto L_0x01b8
        L_0x013d:
            boolean r0 = r13 instanceof X.AnonymousClass5MM
            if (r0 == 0) goto L_0x010c
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131238046(0x7f081c9e, float:1.809236E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r1, r0)
            goto L_0x010a
        L_0x014d:
            r13 = r6
            goto L_0x00cf
        L_0x014f:
            r12 = r6
            goto L_0x00c5
        L_0x0152:
            java.util.Map r0 = r4.A06
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x0160
            int r0 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0160:
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r2 = r2.getColor(r0, r6)
            goto L_0x00af
        L_0x016a:
            r3 = 2131238504(0x7f081e68, float:1.8093289E38)
            goto L_0x0092
        L_0x016f:
            r3 = 2131238136(0x7f081cf8, float:1.8092542E38)
            goto L_0x0092
        L_0x0174:
            r3 = 2131238643(0x7f081ef3, float:1.809357E38)
            goto L_0x0092
        L_0x0179:
            if (r12 == 0) goto L_0x0191
            r0 = r11
            X.Jyn r0 = (X.C61194Jyn) r0
            if (r0 == 0) goto L_0x0191
            X.N49 r0 = r0.A07
            if (r0 == 0) goto L_0x0191
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0191
            int r0 = r0.length()
            r3 = 2131238903(0x7f081ff7, float:1.8094098E38)
            if (r0 != 0) goto L_0x0092
        L_0x0191:
            r3 = 2131238898(0x7f081ff2, float:1.8094088E38)
            goto L_0x0092
        L_0x0196:
            X.KiS r0 = r9.A01
            int r3 = r0.A02
            goto L_0x0076
        L_0x019c:
            if (r14 == r13) goto L_0x01a4
            X.KiS r0 = r9.A01
            int r3 = r0.A03
            goto L_0x0076
        L_0x01a4:
            boolean r0 = r9.A04
            r3 = 2131100694(0x7f060416, float:1.7813777E38)
            if (r0 == 0) goto L_0x0076
        L_0x01ab:
            r3 = 2131100247(0x7f060257, float:1.781287E38)
            goto L_0x0076
        L_0x01b0:
            r1 = 0
            if (r12 == 0) goto L_0x01b5
            goto L_0x0045
        L_0x01b5:
            r0 = r2
            goto L_0x004c
        L_0x01b8:
            r13.draw(r15)     // Catch:{ IndexOutOfBoundsException -> 0x01ea }
            goto L_0x01f8
        L_0x01bc:
            if (r5 == 0) goto L_0x02a7
            android.widget.TextView r3 = r9.A00
            r0 = 0
            r3.setCompoundDrawables(r5, r0, r0, r0)
            java.lang.Integer r0 = r4.A05
            if (r0 == 0) goto L_0x01e5
            int r1 = r0.intValue()
            java.lang.String r0 = r11.getTitle()
            java.lang.String r0 = X.DbW.A0h(r10, r0, r1)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0, r8)
        L_0x01d8:
            r3.setText(r0)
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x02a7
            r0 = 3
            r3.setTextDirection(r0)
            goto L_0x02a7
        L_0x01e5:
            java.lang.String r0 = r11.getTitle()
            goto L_0x01d8
        L_0x01ea:
            r1 = move-exception
            java.lang.String r0 = "getBitmap() onDraw "
            java.lang.String r15 = X.AnonymousClass7TF.A0m(r0, r1)
            java.lang.String r1 = "MarqueeDrawableUtil"
            r0 = r17
            X.0kD.A0C(r1, r15, r0)
        L_0x01f8:
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0201
            r13.setBounds(r14)
        L_0x0201:
            int r14 = r16.getWidth()
            r13 = 1
            r1 = r16
            r0 = r18
            android.graphics.Bitmap r0 = X.1MF.A0B(r1, r14, r0, r13)
            if (r0 == 0) goto L_0x01bc
        L_0x0210:
            android.graphics.drawable.BitmapDrawable r14 = X.JTQ.A08(r10, r0)
            android.graphics.Bitmap r0 = r14.getBitmap()
            float r0 = X.JTO.A01(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b9
            android.graphics.Bitmap r0 = r14.getBitmap()
            float r0 = X.JTO.A01(r0)
            float r12 = r12 / r0
            r13 = 1
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x02b9
            android.graphics.Bitmap r0 = r14.getBitmap()
            float r1 = X.JTO.A02(r0)
            float r1 = r1 * r12
            android.graphics.Bitmap r0 = r14.getBitmap()
            float r0 = X.JTO.A01(r0)
            float r0 = r0 * r12
            android.graphics.Bitmap r12 = r14.getBitmap()
            int r1 = (int) r1
            int r0 = (int) r0
            android.graphics.Bitmap r0 = X.0fO.A00(r12, r1, r0, r13)
        L_0x024c:
            if (r0 == 0) goto L_0x01bc
            android.graphics.drawable.BitmapDrawable r1 = X.JTQ.A08(r10, r0)
            android.widget.TextView r11 = r9.A00
            r12 = 2
            r4 = 1
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r5, r1}
            android.graphics.drawable.LayerDrawable r13 = new android.graphics.drawable.LayerDrawable
            r13.<init>(r0)
            r0 = 12
            int r17 = X.DbS.A02(r10, r0)
            r14 = r8
            r15 = r8
            r16 = r8
            r18 = r8
            r13.setLayerInset(r14, r15, r16, r17, r18)
            r0 = 19
            r13.setLayerGravity(r8, r0)
            r0 = 21
            r13.setLayerGravity(r4, r0)
            int r5 = r1.getIntrinsicWidth()
            int r4 = r1.getIntrinsicHeight()
            float r1 = (float) r3
            r0 = 8
            float r0 = X.0nA.A04(r10, r0)
            float r1 = r1 + r0
            float r0 = (float) r5
            float r1 = r1 + r0
            int r1 = (int) r1
            int r0 = java.lang.Math.max(r3, r4)
            r13.setBounds(r8, r8, r1, r0)
            android.graphics.drawable.Drawable r4 = r13.getDrawable(r8)
            int r1 = X.DbS.A02(r10, r12)
            if (r4 == 0) goto L_0x02a1
            int r0 = r3 + r1
            r4.setBounds(r8, r1, r3, r0)
        L_0x02a1:
            r11.setCompoundDrawables(r13, r6, r6, r6)
            X.DbS.A1C(r11)
        L_0x02a7:
            android.widget.TextView r3 = r9.A00
            int r1 = r7.A0G
            int r0 = r7.A0H
            int r1 = r1 - r0
            int r0 = X.C63117Krl.A00(r10, r1)
            r3.setWidth(r0)
            r3.setTextColor(r2)
            return
        L_0x02b9:
            android.graphics.Bitmap r0 = r14.getBitmap()
            goto L_0x024c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61786KMa.A00(X.MVO, int):void");
    }
}
