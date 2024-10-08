package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.PAk  reason: case insensitive filesystem */
public final class C72553PAk implements AnonymousClass7D2 {
    public final Activity A00;
    public final UserSession A01;
    public final C70560OBi A02;
    public final AnonymousClass7DZ A03;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        UserSession userSession = this.A01;
        boolean A012 = C70867OPg.A01(userSession);
        int i = R.layout.direct_prompt_xma_legacy;
        if (A012) {
            i = R.layout.direct_prompt_xma_message;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        inflate.getLayoutParams().width = -2;
        C68069Mza mza = new C68069Mza(this.A00, inflate, userSession);
        this.A03.A00(mza);
        return mza;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [int, boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x009f, code lost:
        if (r3.length() == 0) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r36, X.AnonymousClass7FW r37) {
        /*
            r35 = this;
            r12 = r37
            r13 = r36
            X.Mza r13 = (X.C68069Mza) r13
            X.7Fw r12 = (X.C328717Fw) r12
            r11 = 0
            boolean r10 = X.AnonymousClass7TF.A1U(r11, r13, r12)
            r34 = r35
            r0 = r34
            X.OBi r0 = r0.A02
            r33 = r0
            r0 = r34
            android.app.Activity r2 = r0.A00
            android.view.View r0 = r13.itemView
            android.content.res.Resources r1 = r0.getResources()
            int r0 = X.AnonymousClass7TE.A0B(r1)
            float r0 = (float) r0
            X.Gdm r6 = new X.Gdm
            r6.<init>(r0)
            int r0 = X.AnonymousClass7TE.A0H(r1)
            float r5 = (float) r0
            java.util.List r0 = r13.A03
            r32 = r0
            int r7 = r32.size()
            r4 = 0
        L_0x0037:
            if (r4 >= r7) goto L_0x005a
            r0 = r32
            java.lang.Object r0 = r0.get(r4)
            X.OFB r0 = (X.OFB) r0
            android.view.View r3 = r0.A01
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r0 = r32
            int r0 = X.DbT.A02(r0, r4)
            int r0 = r0 + -1
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r5
            r3.setElevation(r0)
            r3.setOutlineProvider(r6)
            int r4 = r4 + 1
            goto L_0x0037
        L_0x005a:
            android.view.View r0 = r13.itemView
            android.content.res.Resources r0 = r0.getResources()
            int r1 = X.AnonymousClass7TE.A0C(r0)
            android.view.View r0 = X.JTO.A0F(r13)
            X.0nA.A0e(r0, r1)
            android.view.View r0 = X.JTO.A0F(r13)
            X.0nA.A0T(r0, r1)
            X.3oV r0 = r13.A02
            android.view.View r1 = r0.getView()
            r21 = 8
            r0 = r21
            r1.setVisibility(r0)
            r0 = r33
            com.instagram.common.session.UserSession r0 = r0.A01
            r31 = r0
            java.lang.String r0 = r0.A06
            r30 = r0
            java.lang.String r1 = r12.A01
            boolean r7 = X.0qQ.A0K(r0, r1)
            if (r7 == 0) goto L_0x0095
            java.lang.String r0 = r12.A03
            r30 = r0
        L_0x0095:
            java.lang.String r3 = r12.A04
            r9 = 0
            if (r3 == 0) goto L_0x00a1
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x00a2
        L_0x00a1:
            r0 = 1
        L_0x00a2:
            r20 = 0
            if (r0 != 0) goto L_0x00cf
            android.net.Uri r1 = X.0cp.A03(r3)
            if (r1 == 0) goto L_0x00cf
            java.lang.String r0 = "user_ids"
            java.lang.String r6 = r1.getQueryParameter(r0)
            if (r6 == 0) goto L_0x00cf
            int r5 = r6.length()
            if (r5 == 0) goto L_0x00cf
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()
            r3 = 0
        L_0x00bf:
            if (r3 >= r5) goto L_0x00d1
            char r1 = r6.charAt(r3)
            r0 = 44
            if (r1 != r0) goto L_0x00cc
            r4.append(r1)
        L_0x00cc:
            int r3 = r3 + 1
            goto L_0x00bf
        L_0x00cf:
            r4 = 0
            goto L_0x00db
        L_0x00d1:
            java.lang.String r0 = X.DbT.A10(r4)
            int r0 = r0.length()
            int r4 = r0 + 1
        L_0x00db:
            X.3oV r0 = r13.A01
            if (r7 == 0) goto L_0x02db
            X.C66580MXl.A1Q(r0, r11)
            X.0eM r0 = r13.A04
            android.widget.TextView r3 = X.JTO.A0I(r0)
            android.view.View r0 = r13.itemView
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131820927(0x7f11017f, float:1.9274583E38)
            java.lang.String r0 = X.DbY.A0d(r1, r4, r0)
            r3.setText(r0)
            X.0eM r4 = r13.A05
            android.widget.TextView r3 = X.JTO.A0I(r4)
            android.view.View r0 = r13.itemView
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131972399(0x7f13512f, float:1.9581804E38)
            X.DbU.A1A(r1, r3, r0)
            android.view.View r5 = X.AnonymousClass7TE.A0c(r4)
            r4 = 3
            X.Oiu r3 = new X.Oiu
            r1 = r30
            r0 = r33
            r3.<init>(r2, r0, r1, r4)
            X.AnonymousClass0fU.A00(r3, r5)
        L_0x011b:
            r0 = r32
            java.lang.Object r8 = r0.get(r9)
            X.OFB r8 = (X.OFB) r8
            java.util.List r3 = r12.A05
            int r1 = r3.size()
            if (r9 >= r1) goto L_0x02d6
            java.lang.Object r15 = r3.get(r9)
            X.N8G r15 = (X.N8G) r15
            X.Oci r0 = X.C71104Oci.A00
            android.view.View r7 = r8.A01
            r19 = 0
            r29 = 1
            r0.A03(r7, r11, r10, r11)
            X.OWC r14 = r8.A03
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r6 = r14.A0N
            r0.A03(r6, r11, r10, r11)
            int r0 = r3.size()
            X.C71104Oci.A01(r7, r9, r0, r11)
            X.C71104Oci.A02(r7, r9, r11)
            if (r1 <= r10) goto L_0x02d0
            int r2 = r9 % 2
            r0 = -1065353216(0xffffffffc0800000, float:-4.0)
            if (r2 != 0) goto L_0x0157
            r0 = 1082130432(0x40800000, float:4.0)
        L_0x0157:
            r7.setRotation(r0)
        L_0x015a:
            java.lang.Object r0 = r3.get(r11)
            X.N8G r0 = (X.N8G) r0
            X.7Fr r0 = r0.A00
            X.7FE r0 = r0.A0C
            X.7L2 r2 = r0.A03
            android.graphics.drawable.Drawable r0 = X.C328037De.A00()
            X.AnonymousClass7FB.A07(r0, r2, r11)
            r6.setBackground(r0)
            r0 = r33
            X.0iw r0 = r0.A00
            r24 = r0
            if (r1 == r10) goto L_0x017a
            r29 = 0
        L_0x017a:
            X.0qQ.A0B(r15, r11)
            r0 = r20
            r6.setOutlineProvider(r0)
            r6.setCornerRadius(r11)
            X.7Fr r0 = r15.A00
            r22 = r0
            X.774 r5 = r0.A0E
            if (r5 == 0) goto L_0x0240
            X.3oV r0 = r14.A0F
            android.view.View r1 = r0.getView()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r0 = r5.A03
            r1.setText(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            X.0qQ.A0C(r2, r0)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.res.Resources r18 = r7.getResources()
            int r0 = X.AnonymousClass7TE.A0D(r18)
            r2.topMargin = r0
            r3 = 2131165200(0x7f070010, float:1.794461E38)
            r0 = r18
            int r0 = r0.getDimensionPixelSize(r3)
            r2.bottomMargin = r0
            r1.setMaxLines(r10)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r0)
            r17 = 17
            r0 = r17
            r1.setGravity(r0)
            X.4gb r16 = new X.4gb
            r16.<init>()
            r0 = r16
            r0.A0I(r6)
            r3 = 2131439016(0x7f0b2da8, float:1.8499975E38)
            r2 = 2131442063(0x7f0b398f, float:1.8506155E38)
            r1 = 4
            r0 = 3
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r16
            r0.A0D(r4, r3, r2, r1)
            r0.A0G(r6)
            X.3oV r0 = r14.A0H
            android.view.View r2 = r0.getView()
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.CharSequence r1 = r5.A02
            if (r1 == 0) goto L_0x02c9
            int r0 = r1.length()
            if (r0 == 0) goto L_0x02c9
            r2.setText(r1)
            r2.setVisibility(r11)
        L_0x01fe:
            java.util.List r0 = r5.A0A
            java.lang.Object r2 = r0.get(r11)
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            X.0eM r3 = r14.A0Q
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r3)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            r0 = r24
            r1.setUrl(r2, r0)
            r1 = 2131165208(0x7f070018, float:1.7944627E38)
            r0 = r18
            int r2 = r0.getDimensionPixelSize(r1)
            android.view.View r0 = X.AnonymousClass7TH.A06(r3)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = 6
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            r1.width = r2
            r1.height = r2
            X.3oV r2 = r14.A0D
            android.view.View r1 = r2.getView()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0 = r17
            r1.setGravity(r0)
            X.C66580MXl.A1Q(r2, r11)
        L_0x0240:
            X.3oV r1 = r14.A05
            X.C66580MXl.A1Q(r1, r11)
            r0 = r22
            java.util.List r4 = r0.A0b
            r2 = 0
            if (r4 == 0) goto L_0x02c6
            java.lang.Object r0 = X.00k.A0O(r4, r11)
            X.9JN r0 = (X.AnonymousClass9JN) r0
            if (r0 == 0) goto L_0x02c6
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x02c6
            android.net.Uri r23 = X.0cp.A03(r0)
        L_0x025c:
            android.view.View r3 = r1.getView()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r29 == 0) goto L_0x02b6
            android.content.res.Resources r2 = X.DbU.A05(r7)
            r0 = 2131976660(0x7f1361d4, float:1.9590447E38)
            X.DbU.A1A(r2, r3, r0)
        L_0x026e:
            r0 = r22
            X.9J6 r0 = r0.A08
            java.lang.String r2 = r0.A00
            if (r23 == 0) goto L_0x028c
            android.view.View r1 = r1.getView()
            X.OjN r0 = new X.OjN
            r22 = r0
            r25 = r8
            r26 = r15
            r27 = r2
            r28 = r10
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x028c:
            r0 = r19
            r7.setVisibility(r0)
            int r9 = r9 + 1
            r0 = 4
            if (r9 < r0) goto L_0x011b
            r0 = r33
            X.0iw r1 = r0.A00
            X.ONF r3 = new X.ONF
            r0 = r31
            r3.<init>(r1, r0)
            java.lang.Long r2 = X.C51972G9s.A0i(r30)
            java.lang.String r1 = r1.getModuleName()
            java.lang.String r0 = "xma_pile"
            r3.A01(r2, r0, r1)
            r0 = r34
            X.7DZ r0 = r0.A03
            r0.A02(r13, r12)
            return
        L_0x02b6:
            if (r4 == 0) goto L_0x02c2
            java.lang.Object r0 = X.00k.A0O(r4, r11)
            X.9JN r0 = (X.AnonymousClass9JN) r0
            if (r0 == 0) goto L_0x02c2
            java.lang.String r2 = r0.A04
        L_0x02c2:
            r3.setText(r2)
            goto L_0x026e
        L_0x02c6:
            r23 = r2
            goto L_0x025c
        L_0x02c9:
            r0 = r21
            r2.setVisibility(r0)
            goto L_0x01fe
        L_0x02d0:
            r0 = 0
            r7.setRotation(r0)
            goto L_0x015a
        L_0x02d6:
            android.view.View r7 = r8.A01
            r19 = 8
            goto L_0x028c
        L_0x02db:
            android.view.View r1 = r0.E2D()
            if (r1 == 0) goto L_0x011b
            r0 = r21
            r1.setVisibility(r0)
            goto L_0x011b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72553PAk.ADp(X.7Db, X.7FW):void");
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        C68069Mza mza = (C68069Mza) r3;
        0qQ.A0B(mza, 0);
        for (OFB ofb : mza.A03) {
            ((IgImageView) AnonymousClass7TE.A14(ofb.A03.A0Q)).A09();
        }
        this.A03.A01(mza);
    }

    public C72553PAk(Activity activity, UserSession userSession, C70560OBi oBi, AnonymousClass7DZ r4) {
        this.A02 = oBi;
        this.A03 = r4;
        this.A00 = activity;
        this.A01 = userSession;
    }
}
