package X;

import android.content.res.Resources;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.KMc  reason: case insensitive filesystem */
public final class C61788KMc extends C60688JpZ implements C66473MTb {
    public C61194Jyn A00;
    public final int A01;
    public final int A02;
    public final TextView A03;
    public final Resources A04;
    public final UserSession A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61788KMc(android.content.Context r20, com.instagram.common.session.UserSession r21, X.C66544MVy r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            r19 = this;
            r6 = 1
            r10 = 0
            X.Jea r8 = new X.Jea
            r9 = r20
            r0 = r23
            r12 = r24
            r11 = r10
            r13 = r12
            r14 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r7 = 0
            X.9kV r16 = X.C394679yV.A00(r9, r0, r10)
            r11 = r19
            r15 = r22
            r12 = r9
            r13 = r8
            r14 = r8
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r1 = r21
            r11.A05 = r1
            r11.A07 = r0
            r4 = r25
            r11.A08 = r4
            android.content.res.Resources r1 = r9.getResources()
            r11.A04 = r1
            X.Jea r3 = r11.A01
            android.view.LayoutInflater r2 = X.DbV.A0D(r3)
            r0 = 2131627371(0x7f0e0d6b, float:1.8882005E38)
            android.view.View r2 = r2.inflate(r0, r3, r10)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r2, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r11.A03 = r2
            r0 = 2131955830(0x7f131076, float:1.9548199E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r9, r0)
            r11.A06 = r0
            r0 = 2131165288(0x7f070068, float:1.7944789E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r11.A01 = r0
            int r0 = X.AnonymousClass7TE.A0D(r1)
            r11.A02 = r0
            android.content.res.Resources r5 = r9.getResources()
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r0 = r5.getDimensionPixelSize(r0)
            r3.A06 = r0
            X.C60688JpZ.A00(r5, r3)
            r0 = 2131165270(0x7f070056, float:1.7944752E38)
            if (r26 == 0) goto L_0x007e
            r0 = 2131165304(0x7f070078, float:1.7944821E38)
        L_0x007e:
            int r1 = r5.getDimensionPixelSize(r0)
            r0 = -2
            X.JTQ.A0w(r3, r0, r1)
            r0 = 2131100247(0x7f060257, float:1.781287E38)
            int r0 = r5.getColor(r0, r7)
            r3.setBackgroundColor(r0)
            r1 = 2
            X.MIp r0 = new X.MIp
            r0.<init>(r11, r1)
            r3.setOnDrawOverride(r0)
            r11.A01()
            r2.setSelected(r6)
            if (r26 == 0) goto L_0x00b5
            r0 = 2131165293(0x7f07006d, float:1.79448E38)
            int r0 = X.DbS.A03(r5, r0)
            r2.setPadding(r10, r0, r10, r0)
            r0 = 2131165652(0x7f0701d4, float:1.7945527E38)
            float r0 = r5.getDimension(r0)
            r2.setTextSize(r10, r0)
        L_0x00b5:
            if (r25 == 0) goto L_0x00bb
            r0 = 3
            r2.setTextDirection(r0)
        L_0x00bb:
            r3.addView(r2)
            X.LSI r2 = X.LSI.A05
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165288(0x7f070068, float:1.7944789E38)
            if (r26 == 0) goto L_0x00cc
            r0 = 2131165301(0x7f070075, float:1.7944815E38)
        L_0x00cc:
            float r10 = r1.getDimension(r0)
            float r11 = X.JTR.A02(r9)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            if (r26 == 0) goto L_0x00df
            r0 = 2131165300(0x7f070074, float:1.7944813E38)
        L_0x00df:
            float r12 = r1.getDimension(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165214(0x7f07001e, float:1.7944639E38)
            if (r26 == 0) goto L_0x00ef
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
        L_0x00ef:
            float r13 = r1.getDimension(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            if (r26 == 0) goto L_0x00ff
            r0 = 2131165299(0x7f070073, float:1.7944811E38)
        L_0x00ff:
            float r14 = r1.getDimension(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            float r15 = r1.getDimension(r0)
            float r16 = X.DbU.A00(r9, r0)
            X.LAK r9 = new X.LAK
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r2.A02(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61788KMc.<init>(android.content.Context, com.instagram.common.session.UserSession, X.MVy, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
        if (r3 == X.AnonymousClass05K.A01) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FMP(X.C61194Jyn r12) {
        /*
            r11 = this;
            r4 = 0
            r11.A00 = r12
            java.lang.Integer r3 = r12.A0A
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r3 != r0) goto L_0x00c0
            android.widget.TextView r6 = r11.A03
            java.lang.String r0 = r11.A06
            r6.setText(r0)
        L_0x0010:
            r11.A01()
            boolean r7 = r11.A07
            if (r7 == 0) goto L_0x00ad
            X.Jut r5 = r12.A08
            if (r5 == 0) goto L_0x0051
            boolean r0 = r12.Ayv()
            if (r0 == 0) goto L_0x009e
            int r1 = r5.A02
        L_0x0023:
            X.Jea r9 = r11.A01
            int r10 = r12.A05
            int r8 = r12.A02
            if (r8 != 0) goto L_0x009a
            X.KhL r2 = r12.A09
            X.KhL r0 = X.C62529KhL.MUSIC
            if (r2 != r0) goto L_0x009a
            int r8 = r5.A02
        L_0x0033:
            int r2 = r5.A02
            r0 = r2
            if (r2 <= r1) goto L_0x0039
            r2 = r1
        L_0x0039:
            r9.A0H = r10
            r9.A0G = r8
            r9.A0C = r2
            r9.A0D = r0
            r9.A08()
            int r0 = r5.A04
            int r10 = r10 - r0
            if (r10 >= r4) goto L_0x004a
            r10 = 0
        L_0x004a:
            r9.setMinStartTimeMs(r10)
            float r0 = r5.A01
            r9.A03 = r0
        L_0x0051:
            X.Jea r5 = r11.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r3 != r1) goto L_0x005c
            r0 = 1058642330(0x3f19999a, float:0.6)
        L_0x005c:
            r5.setAlpha(r0)
        L_0x005f:
            java.lang.Integer r8 = X.AnonymousClass05K.A0u
            r0 = 0
            if (r3 != r8) goto L_0x0066
            r0 = 8
        L_0x0066:
            r6.setVisibility(r0)
            boolean r0 = r12.A0D
            r2 = 1
            if (r0 == 0) goto L_0x0077
            if (r7 == 0) goto L_0x0072
            if (r3 == r8) goto L_0x0077
        L_0x0072:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 1
            if (r3 != r1) goto L_0x0078
        L_0x0077:
            r0 = 0
        L_0x0078:
            r5.setEnableTrim(r0)
            if (r3 == r8) goto L_0x007e
            r2 = 0
        L_0x007e:
            r5.A0M = r2
            int r1 = r6.getWidth()
            int r0 = r5.A07()
            if (r1 == r0) goto L_0x0091
            int r0 = r5.A07()
            r6.setWidth(r0)
        L_0x0091:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r3 != r0) goto L_0x0096
            r4 = 4
        L_0x0096:
            r5.setVisibility(r4)
            return
        L_0x009a:
            if (r8 <= r1) goto L_0x0033
            r8 = r1
            goto L_0x0033
        L_0x009e:
            int r0 = r5.A05
            float r1 = (float) r0
            float r0 = r5.A01
            float r1 = r1 / r0
            int r1 = (int) r1
            int r0 = r5.A04
            int r1 = r1 - r0
            int r0 = r12.A05
            int r1 = r1 + r0
            goto L_0x0023
        L_0x00ad:
            X.Jea r5 = r11.A01
            int r1 = r12.A02
            int r0 = r12.A05
            int r1 = r1 - r0
            r5.A0H = r4
            r5.A0G = r1
            r5.A0C = r1
            r5.A0D = r1
            r5.A08()
            goto L_0x005f
        L_0x00c0:
            java.lang.String r5 = r12.A0C
            X.Jut r0 = r12.A08
            if (r0 == 0) goto L_0x00de
            java.lang.Integer r0 = r0.A07
            if (r0 == 0) goto L_0x00de
            int r0 = r0.intValue()
            android.content.Context r2 = r11.A00
            r1 = 2131955833(0x7f131079, float:1.9548205E38)
            java.lang.CharSequence r0 = r2.getText(r0)
            java.lang.String r0 = X.DbV.A0u(r2, r5, r0, r1)
            if (r0 == 0) goto L_0x00de
            r5 = r0
        L_0x00de:
            android.widget.TextView r6 = r11.A03
            r6.setText(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: X.C61788KMc.FMP(X.Jyn):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r0 == null) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r7 = this;
            android.content.Context r6 = r7.A00
            X.Jyn r2 = r7.A00
            r5 = 0
            if (r2 == 0) goto L_0x007a
            X.KhL r1 = r2.A09
        L_0x0009:
            X.KhL r0 = X.C62529KhL.VOICEOVER
            if (r1 != r0) goto L_0x005b
            r1 = 2131238546(0x7f081e92, float:1.8093374E38)
        L_0x0010:
            android.graphics.drawable.Drawable r3 = r6.getDrawable(r1)
            r4 = 0
            r1 = 0
            if (r3 == 0) goto L_0x0034
            r0 = 12
            int r0 = X.DbS.A02(r6, r0)
            r3.setBounds(r4, r4, r0, r0)
            android.content.res.Resources r2 = r7.A04
            r0 = 2131100180(0x7f060214, float:1.7812734E38)
            int r2 = r2.getColor(r0, r5)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            X.C51969G9p.A12(r0, r3, r2)
            android.widget.TextView r0 = r7.A03
            r0.setCompoundDrawables(r3, r5, r5, r5)
        L_0x0034:
            android.widget.TextView r3 = r7.A03
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.0qQ.A0C(r2, r0)
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            X.Jyn r0 = r7.A00
            if (r0 == 0) goto L_0x0047
            java.lang.Integer r1 = r0.A0A
        L_0x0047:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x004d
            r4 = 16
        L_0x004d:
            r2.gravity = r4
            r3.setLayoutParams(r2)
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x005a
            r0 = 3
            r3.setTextDirection(r0)
        L_0x005a:
            return
        L_0x005b:
            if (r2 == 0) goto L_0x0067
            java.lang.Integer r1 = r2.A0A
        L_0x005f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x0069
            r1 = 2131238570(0x7f081eaa, float:1.8093422E38)
            goto L_0x0010
        L_0x0067:
            r1 = r5
            goto L_0x005f
        L_0x0069:
            if (r2 == 0) goto L_0x0076
            X.Jut r0 = r2.A08
            if (r0 == 0) goto L_0x0076
            java.lang.Integer r0 = r0.A07
            r1 = 2131238574(0x7f081eae, float:1.809343E38)
            if (r0 != 0) goto L_0x0010
        L_0x0076:
            r1 = 2131238578(0x7f081eb2, float:1.8093439E38)
            goto L_0x0010
        L_0x007a:
            r1 = r5
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61788KMc.A01():void");
    }

    public final void FM0(int i) {
        TextView textView = this.A03;
        DbX.A1C(textView, DbY.A01(this.A00) + i, textView.getPaddingTop());
    }
}
