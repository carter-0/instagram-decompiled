package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

public class GTF {
    public static final GTC A04 = new Object();
    public 1wn A00;
    public final Context A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C61071Jw9 r23, X.GTD r24) {
        /*
            r22 = this;
            r7 = 0
            r15 = r24
            X.0qQ.A0B(r15, r7)
            r6 = 1
            r8 = r22
            com.instagram.common.session.UserSession r5 = r8.A02
            android.content.Context r4 = r8.A01
            r13 = r23
            java.lang.Object r0 = r13.A00
            X.GTI r0 = (X.GTI) r0
            java.lang.Object r0 = r0.A05
            java.lang.Object r1 = X.DbT.A0r(r0)
            X.1Xj r1 = (X.1Xj) r1
            java.util.EnumSet r0 = X.1sx.A01
            X.0qQ.A0B(r1, r6)
            boolean r0 = X.C243213Xw.A03(r5, r1)
            r3 = 8
            if (r0 == 0) goto L_0x002e
            android.view.View r0 = r15.A02
            r0.setVisibility(r3)
            return
        L_0x002e:
            X.0r1 r12 = new X.0r1
            r12.<init>()
            X.0r1 r14 = new X.0r1
            r14.<init>()
            X.3Dp r9 = X.C238833Dp.A00(r5)
            android.view.View r1 = r15.A01
            java.lang.Object r2 = r13.A00
            X.GTI r2 = (X.GTI) r2
            java.lang.Object r10 = r2.A06
            X.0sL r10 = (X.0sL) r10
            java.lang.Object r0 = r2.A0A
            java.lang.Object r0 = X.DbT.A0r(r0)
            java.lang.Object r0 = r10.invoke(r4, r0)
            X.3b1 r0 = (X.C244333b1) r0
            r9.A0A(r1, r0)
            X.IDT r0 = new X.IDT
            r0.<init>(r6, r14, r12)
            r1.setOnTouchListener(r0)
            r18 = 0
            r9 = 31
            X.Ini r0 = new X.Ini
            r0.<init>(r13, r9)
            r11 = 2
            X.IxF r10 = new X.IxF
            r10.<init>(r11, r12, r13, r14, r15)
            X.3aW r9 = new X.3aW
            r19 = r0
            r20 = r10
            r21 = r6
            r17 = r5
            r16 = r9
            r16.<init>(r17, r18, r19, r20, r21)
            X.AnonymousClass0fU.A00(r9, r1)
            java.lang.Object r1 = r13.A04
            X.1Xl r1 = (X.1Xl) r1
            boolean r0 = r1.CcK()
            if (r0 == 0) goto L_0x00cd
            X.1Xj r0 = r1.BPf()
            boolean r0 = r0.A5n()
            if (r0 != 0) goto L_0x00cd
            X.0Tu r9 = X.0Tu.A05
            r0 = 36606590379365829(0x820d80000015c5, double:3.2134933865944716E-306)
            int r0 = X.DbS.A04(r9, r5, r0)
            if (r0 == r6) goto L_0x01cf
            if (r0 != r11) goto L_0x00cd
            r8.A01(r15)
            r0 = 1095761920(0x41500000, float:13.0)
        L_0x00a6:
            android.view.View r10 = r15.A02
            android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
            if (r9 == 0) goto L_0x01d5
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            int r0 = X.C18092VlM.A00(r4, r0)
            r9.topMargin = r0
            r1 = 1095761920(0x41500000, float:13.0)
            int r0 = X.C18092VlM.A00(r4, r1)
            r9.bottomMargin = r0
            int r0 = X.C18092VlM.A00(r4, r1)
            r9.leftMargin = r0
            int r0 = X.C18092VlM.A00(r4, r1)
            r9.rightMargin = r0
            r10.setLayoutParams(r9)
        L_0x00cd:
            android.widget.TextView r9 = r15.A05
            java.lang.Object r0 = r2.A08
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r0 = r0.invoke(r4)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.setText(r0)
            android.text.TextPaint r0 = r9.getPaint()
            r0.setFakeBoldText(r6)
            java.lang.Object r0 = r2.A05
            java.lang.Object r6 = X.DbT.A0r(r0)
            X.1Xj r6 = (X.1Xj) r6
            X.4DU r0 = r8.A03
            X.GTC.A00(r4, r6, r0, r15)
            java.lang.Object r0 = r2.A07
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r10 = r0.invoke(r4)
            com.instagram.model.androidlink.AndroidLink r10 = (com.instagram.model.androidlink.AndroidLink) r10
            java.lang.Object r0 = r2.A01
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r1 = r0.invoke(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r10 == 0) goto L_0x01c8
            boolean r0 = X.1sx.A0S(r10)
            if (r0 != 0) goto L_0x01c8
            if (r1 == 0) goto L_0x01c8
            int r0 = r1.length()
            if (r0 == 0) goto L_0x01c8
            android.widget.TextView r10 = r15.A07
            r10.setVisibility(r7)
            r10.setText(r1)
            boolean r0 = X.C247643gg.A0C(r6)
            if (r0 == 0) goto L_0x012c
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131957203(0x7f1315d3, float:1.9550983E38)
            X.DbU.A1A(r1, r10, r0)
        L_0x012c:
            boolean r0 = X.C282845Ez.A02(r5, r6)
            if (r0 == 0) goto L_0x0180
            java.lang.String r0 = X.C282845Ez.A01(r5, r6)
        L_0x0136:
            r9.setText(r0)
        L_0x0139:
            java.lang.Object r0 = r2.A03
            X.0sL r0 = (X.0sL) r0
            r0.invoke(r4, r15)
            android.widget.ImageView r0 = r15.A04
            r0.setVisibility(r7)
            android.view.View r0 = r15.A03
            android.view.ViewGroup$LayoutParams r6 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.0qQ.A0C(r6, r0)
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            android.content.res.Resources r3 = r4.getResources()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330020255318434(0x8111f6000041a2, double:3.038589326488398E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x016e
            r1 = 2131165236(0x7f070034, float:1.7944683E38)
        L_0x0166:
            int r0 = r3.getDimensionPixelSize(r1)
            r6.setMarginStart(r0)
            return
        L_0x016e:
            r0 = 36329749672378686(0x8111b70000413e, double:3.0384182087477515E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r1 = 2131165405(0x7f0700dd, float:1.7945026E38)
            if (r0 == 0) goto L_0x0166
            r1 = 2131165270(0x7f070056, float:1.7944752E38)
            goto L_0x0166
        L_0x0180:
            boolean r0 = X.1sx.A0J(r6)
            if (r0 == 0) goto L_0x01bc
            X.3lZ r0 = X.C51966G9m.A0w(r6)
            if (r0 == 0) goto L_0x01ba
            X.3l8 r0 = r0.Ata()
            if (r0 == 0) goto L_0x01ba
            java.lang.String r0 = r0.BEx()
        L_0x0196:
            r15.A00 = r0
            boolean r0 = X.C55000HaX.A00(r5, r6)
            java.lang.String r0 = X.1sx.A05(r4, r5, r6, r0)
            r9.setText(r0)
            X.IO3 r3 = new X.IO3
            r3.<init>(r11, r15, r8, r6)
            r8.A00 = r3
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r5)
            java.lang.Class<X.INk> r0 = X.C57070INk.class
            r1.A01(r3, r0)
            r9 = r10
            java.lang.String r0 = X.1sx.A08(r4, r6)
            goto L_0x0136
        L_0x01ba:
            r0 = 0
            goto L_0x0196
        L_0x01bc:
            boolean r0 = X.C247643gg.A06(r5, r6)
            if (r0 == 0) goto L_0x0139
            java.lang.String r0 = X.C247643gg.A01(r4, r5, r6, r7)
            goto L_0x0136
        L_0x01c8:
            android.widget.TextView r10 = r15.A07
            r10.setVisibility(r3)
            goto L_0x012c
        L_0x01cf:
            r8.A01(r15)
            r0 = 0
            goto L_0x00a6
        L_0x01d5:
            r0 = 18
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GTF.A00(X.Jw9, X.GTD):void");
    }

    public final void A01(GTD gtd) {
        View view = gtd.A01;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context context = this.A01;
            marginLayoutParams.bottomMargin = C18092VlM.A00(context, 0.0f);
            marginLayoutParams.leftMargin = C18092VlM.A00(context, 0.0f);
            marginLayoutParams.rightMargin = C18092VlM.A00(context, 0.0f);
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw AnonymousClass7TE.A11(AnonymousClass000.A00(18));
    }

    public GTF(Context context, UserSession userSession, AnonymousClass4DU r3) {
        AnonymousClass7TG.A1Q(userSession, r3);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = r3;
    }
}
