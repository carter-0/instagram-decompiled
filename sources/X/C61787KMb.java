package X;

import android.graphics.Paint;
import android.widget.TextView;

/* renamed from: X.KMb  reason: case insensitive filesystem */
public final class C61787KMb extends C60688JpZ implements C66473MTb {
    public C61194Jyn A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final TextView A04;
    public final LAK A05;
    public final C59732JVq A06;
    public final String A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61787KMb(android.content.Context r22, X.C59732JVq r23, X.C66544MVy r24) {
        /*
            r21 = this;
            r1 = 1
            r2 = r23
            boolean r14 = r2.A01
            r12 = 0
            boolean r4 = r2.A00
            X.Jea r10 = new X.Jea
            r11 = r22
            r13 = r12
            r15 = r14
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.9kV r18 = X.C394679yV.A00(r11, r4, r12)
            r0 = 0
            r3 = r21
            r17 = r24
            r13 = r3
            r14 = r11
            r15 = r10
            r16 = r10
            r19 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r3.A06 = r2
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r11)
            r4 = 2131626365(0x7f0e097d, float:1.8879964E38)
            X.Jea r5 = r3.A01
            android.view.View r6 = r6.inflate(r4, r5, r12)
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r6, r4)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r3.A04 = r6
            r4 = 2131955830(0x7f131076, float:1.9548199E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r11, r4)
            r3.A07 = r4
            android.content.res.Resources r7 = r11.getResources()
            r4 = 2131165288(0x7f070068, float:1.7944789E38)
            int r4 = r7.getDimensionPixelSize(r4)
            r3.A01 = r4
            int r4 = X.DbY.A01(r11)
            r3.A02 = r4
            android.content.res.Resources r7 = r11.getResources()
            r4 = 2131165230(0x7f07002e, float:1.7944671E38)
            r8 = 2131165230(0x7f07002e, float:1.7944671E38)
            float r13 = r7.getDimension(r4)
            float r14 = X.DbU.A00(r11, r4)
            android.content.res.Resources r7 = r11.getResources()
            r4 = 2131165203(0x7f070013, float:1.7944616E38)
            float r15 = r7.getDimension(r4)
            android.content.res.Resources r7 = r11.getResources()
            r4 = 2131165205(0x7f070015, float:1.794462E38)
            float r16 = r7.getDimension(r4)
            android.content.res.Resources r7 = r11.getResources()
            r4 = 2131165200(0x7f070010, float:1.794461E38)
            float r17 = r7.getDimension(r4)
            android.content.res.Resources r9 = r11.getResources()
            r7 = 2131165200(0x7f070010, float:1.794461E38)
            float r18 = r9.getDimension(r4)
            float r19 = X.DbU.A00(r11, r8)
            X.LAK r12 = new X.LAK
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r3.A05 = r12
            android.graphics.Paint r10 = X.JTO.A0C()
            android.content.res.Resources r9 = r11.getResources()
            r8 = 2131099781(0x7f060085, float:1.7811925E38)
            int r8 = r9.getColor(r8, r0)
            r10.setColor(r8)
            X.AnonymousClass7TE.A1Q(r10)
            float r4 = X.DbU.A00(r11, r4)
            r10.setStrokeWidth(r4)
            r3.A03 = r10
            r4 = 2130971219(0x7f040a53, float:1.755117E38)
            int r4 = X.2Yu.A0G(r11, r4)
            r5.A06 = r4
            android.content.res.Resources r8 = r11.getResources()
            r4 = 2131100847(0x7f0604af, float:1.7814087E38)
            int r9 = r8.getColor(r4, r0)
            android.content.res.Resources r8 = r11.getResources()
            r4 = 2131165223(0x7f070027, float:1.7944657E38)
            int r8 = r8.getDimensionPixelSize(r4)
            r5.A09(r9, r8)
            r8 = 2130971216(0x7f040a50, float:1.7551164E38)
            int r9 = X.2Yu.A0G(r11, r8)
            r8 = -2
            X.JTQ.A0w(r5, r8, r9)
            android.content.res.Resources r9 = r11.getResources()
            r8 = 2131100238(0x7f06024e, float:1.7812852E38)
            int r0 = r9.getColor(r8, r0)
            r5.setBackgroundColor(r0)
            X.MIp r0 = new X.MIp
            r0.<init>(r3, r1)
            r5.setOnDrawOverride(r0)
            r3.A01()
            r6.setSelected(r1)
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x011a
            r0 = 3
            r6.setTextDirection(r0)
        L_0x011a:
            r0 = 2130970279(0x7f0406a7, float:1.7549264E38)
            X.JTS.A0u(r11, r6, r0)
            r5.addView(r6)
            X.LSI r2 = X.LSI.A05
            float r12 = X.DbX.A00(r11)
            float r13 = X.JTR.A02(r11)
            float r14 = X.DbX.A00(r11)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131165214(0x7f07001e, float:1.7944639E38)
            float r15 = r1.getDimension(r0)
            float r16 = X.DbU.A00(r11, r7)
            float r17 = X.DbU.A00(r11, r4)
            float r18 = X.DbU.A00(r11, r4)
            X.LAK r11 = new X.LAK
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r2.A02(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61787KMb.<init>(android.content.Context, X.JVq, X.MVy):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0077, code lost:
        if (r3 == X.AnonymousClass05K.A01) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FMP(X.C61194Jyn r12) {
        /*
            r11 = this;
            r4 = 0
            r11.A00 = r12
            java.lang.Integer r3 = r12.A0A
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r3 != r0) goto L_0x00c2
            android.widget.TextView r6 = r11.A04
            java.lang.String r0 = r11.A07
            r6.setText(r0)
        L_0x0010:
            r11.A01()
            X.JVq r0 = r11.A06
            boolean r7 = r0.A00
            if (r7 == 0) goto L_0x00af
            X.Jut r5 = r12.A08
            if (r5 == 0) goto L_0x0053
            boolean r0 = r12.Ayv()
            if (r0 == 0) goto L_0x00a0
            int r1 = r5.A02
        L_0x0025:
            X.Jea r9 = r11.A01
            int r10 = r12.A05
            int r8 = r12.A02
            if (r8 != 0) goto L_0x009c
            X.KhL r2 = r12.A09
            X.KhL r0 = X.C62529KhL.MUSIC
            if (r2 != r0) goto L_0x009c
            int r8 = r5.A02
        L_0x0035:
            int r2 = r5.A02
            r0 = r2
            if (r2 <= r1) goto L_0x003b
            r2 = r1
        L_0x003b:
            r9.A0H = r10
            r9.A0G = r8
            r9.A0C = r2
            r9.A0D = r0
            r9.A08()
            int r0 = r5.A04
            int r10 = r10 - r0
            if (r10 >= r4) goto L_0x004c
            r10 = 0
        L_0x004c:
            r9.setMinStartTimeMs(r10)
            float r0 = r5.A01
            r9.A03 = r0
        L_0x0053:
            X.Jea r5 = r11.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r3 != r1) goto L_0x005e
            r0 = 1058642330(0x3f19999a, float:0.6)
        L_0x005e:
            r5.setAlpha(r0)
        L_0x0061:
            java.lang.Integer r8 = X.AnonymousClass05K.A0u
            r0 = 0
            if (r3 != r8) goto L_0x0068
            r0 = 8
        L_0x0068:
            r6.setVisibility(r0)
            boolean r0 = r12.A0D
            r2 = 1
            if (r0 == 0) goto L_0x0079
            if (r7 == 0) goto L_0x0074
            if (r3 == r8) goto L_0x0079
        L_0x0074:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 1
            if (r3 != r1) goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            r5.setEnableTrim(r0)
            if (r3 == r8) goto L_0x0080
            r2 = 0
        L_0x0080:
            r5.A0M = r2
            int r1 = r6.getWidth()
            int r0 = r5.A07()
            if (r1 == r0) goto L_0x0093
            int r0 = r5.A07()
            r6.setWidth(r0)
        L_0x0093:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r3 != r0) goto L_0x0098
            r4 = 4
        L_0x0098:
            r5.setVisibility(r4)
            return
        L_0x009c:
            if (r8 <= r1) goto L_0x0035
            r8 = r1
            goto L_0x0035
        L_0x00a0:
            int r0 = r5.A05
            float r1 = (float) r0
            float r0 = r5.A01
            float r1 = r1 / r0
            int r1 = (int) r1
            int r0 = r5.A04
            int r1 = r1 - r0
            int r0 = r12.A05
            int r1 = r1 + r0
            goto L_0x0025
        L_0x00af:
            X.Jea r5 = r11.A01
            int r1 = r12.A02
            int r0 = r12.A05
            int r1 = r1 - r0
            r5.A0H = r4
            r5.A0G = r1
            r5.A0C = r1
            r5.A0D = r1
            r5.A08()
            goto L_0x0061
        L_0x00c2:
            java.lang.String r5 = r12.A0C
            X.Jut r0 = r12.A08
            if (r0 == 0) goto L_0x00e0
            java.lang.Integer r0 = r0.A07
            if (r0 == 0) goto L_0x00e0
            int r0 = r0.intValue()
            android.content.Context r2 = r11.A00
            r1 = 2131955833(0x7f131079, float:1.9548205E38)
            java.lang.CharSequence r0 = r2.getText(r0)
            java.lang.String r0 = X.DbV.A0u(r2, r5, r0, r1)
            if (r0 == 0) goto L_0x00e0
            r5 = r0
        L_0x00e0:
            android.widget.TextView r6 = r11.A04
            android.text.Spanned r0 = android.text.Html.fromHtml(r5, r4)
            r6.setText(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            android.content.Context r1 = r11.A00
            r0 = 2131955832(0x7f131078, float:1.9548203E38)
            java.lang.CharSequence r0 = r1.getText(r0)
            r2.append(r0)
            java.lang.String r0 = " \n "
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r5, r2)
            r6.setContentDescription(r0)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61787KMb.FMP(X.Jyn):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r0 == null) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r7 = this;
            android.content.Context r6 = r7.A00
            X.Jyn r2 = r7.A00
            r5 = 0
            if (r2 == 0) goto L_0x006f
            X.KhL r1 = r2.A09
        L_0x0009:
            X.KhL r0 = X.C62529KhL.VOICEOVER
            if (r1 != r0) goto L_0x0050
            r1 = 2131238546(0x7f081e92, float:1.8093374E38)
        L_0x0010:
            android.graphics.drawable.Drawable r3 = r6.getDrawable(r1)
            r4 = 16
            r2 = 0
            r1 = 0
            if (r3 == 0) goto L_0x0032
            int r0 = X.DbS.A02(r6, r4)
            r3.setBounds(r2, r2, r0, r0)
            r0 = 2130970279(0x7f0406a7, float:1.7549264E38)
            int r2 = X.AnonymousClass7TF.A03(r6, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            X.C51969G9p.A12(r0, r3, r2)
            android.widget.TextView r0 = r7.A04
            r0.setCompoundDrawables(r3, r5, r5, r5)
        L_0x0032:
            android.widget.TextView r3 = r7.A04
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.0qQ.A0C(r2, r0)
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            X.Jyn r0 = r7.A00
            if (r0 == 0) goto L_0x0045
            java.lang.Integer r1 = r0.A0A
        L_0x0045:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x004a
            r4 = 0
        L_0x004a:
            r2.gravity = r4
            r3.setLayoutParams(r2)
            return
        L_0x0050:
            if (r2 == 0) goto L_0x005c
            java.lang.Integer r1 = r2.A0A
        L_0x0054:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x005e
            r1 = 2131238570(0x7f081eaa, float:1.8093422E38)
            goto L_0x0010
        L_0x005c:
            r1 = r5
            goto L_0x0054
        L_0x005e:
            if (r2 == 0) goto L_0x006b
            X.Jut r0 = r2.A08
            if (r0 == 0) goto L_0x006b
            java.lang.Integer r0 = r0.A07
            r1 = 2131238574(0x7f081eae, float:1.809343E38)
            if (r0 != 0) goto L_0x0010
        L_0x006b:
            r1 = 2131238578(0x7f081eb2, float:1.8093439E38)
            goto L_0x0010
        L_0x006f:
            r1 = r5
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61787KMb.A01():void");
    }

    public final void FM0(int i) {
        TextView textView = this.A04;
        DbX.A1C(textView, DbY.A01(this.A00) + i, textView.getPaddingTop());
    }
}
