package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NQD extends C232232tF {
    public final Fragment A00;
    public final UserSession A01;
    public final C329967Kx A02;
    public final OE1 A03;
    public final C67743Mtw A04;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C68047MzE(DbU.A09(layoutInflater, viewGroup, R.layout.daily_prompts_response_card, false), this.A01, this.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004b, code lost:
        if (X.182.A06(X.0Tu.A05, r7.A03, 36328164829707303L) == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r19, X.C249703kE r20) {
        /*
            r18 = this;
            r7 = r20
            r8 = r19
            X.OuB r8 = (X.C71979OuB) r8
            X.MzE r7 = (X.C68047MzE) r7
            boolean r0 = X.AnonymousClass7TG.A1Z(r8, r7)
            r1 = r18
            androidx.fragment.app.Fragment r3 = r1.A00
            X.7Kx r6 = r1.A02
            X.Mtw r5 = r1.A04
            boolean r4 = X.DbW.A1S(r0, r3, r6)
            com.instagram.user.model.User r2 = r8.A03
            if (r2 == 0) goto L_0x002a
            X.3oV r0 = r7.A09
            android.view.View r1 = r0.getView()
            r1.setVisibility(r4)
            r0 = 25
            X.C71399Ojy.A00(r1, r5, r8, r2, r0)
        L_0x002a:
            r7.A00(r3, r8, r5)
            java.lang.String r1 = r7.A01
            java.lang.String r0 = r8.A06
            r17 = r0
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x004d
            boolean r0 = r8.A0C
            if (r0 == 0) goto L_0x004d
            com.instagram.common.session.UserSession r3 = r7.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328164829707303(0x81104600043c27, double:3.03741594786072E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r14 = 1
            if (r0 != 0) goto L_0x004e
        L_0x004d:
            r14 = 0
        L_0x004e:
            X.3oV r0 = r7.A0C
            android.view.View r13 = r0.getView()
            r0 = 2131434067(0x7f0b1a53, float:1.8489937E38)
            android.view.View r16 = r13.findViewById(r0)
            r1 = 48
            X.Ok7 r0 = new X.Ok7
            r0.<init>((X.C71979OuB) r8, (X.C67743Mtw) r5, (int) r1)
            X.AnonymousClass0fU.A00(r0, r13)
            r0 = 2131435434(0x7f0b1faa, float:1.849271E38)
            android.widget.ImageView r0 = X.DbX.A0J(r13, r0)
            r1 = 2131434065(0x7f0b1a51, float:1.8489933E38)
            android.view.View r15 = X.AnonymousClass7TF.A0G(r13, r1)
            r1 = 2131434047(0x7f0b1a3f, float:1.8489897E38)
            android.widget.ImageView r1 = X.DbX.A0J(r13, r1)
            com.instagram.common.session.UserSession r12 = r7.A03
            X.0Tu r11 = X.0Tu.A05
            r2 = 36328164830034988(0x81104600093c2c, double:3.037415948067949E-306)
            boolean r10 = X.182.A06(r11, r12, r2)
            r9 = 8
            if (r10 == 0) goto L_0x01a7
            r0.setVisibility(r4)
            r15.setVisibility(r9)
            r1.setVisibility(r9)
            android.view.View r1 = r7.A02
            android.content.Context r10 = r1.getContext()
            boolean r9 = r8.A0D
            r1 = 2131238362(0x7f081dda, float:1.8093E38)
            if (r9 == 0) goto L_0x00a4
            r1 = 2131238360(0x7f081dd8, float:1.8092997E38)
        L_0x00a4:
            X.DbU.A13(r10, r0, r1)
            r1 = 2130970273(0x7f0406a1, float:1.7549251E38)
            if (r9 == 0) goto L_0x00af
            r1 = 2130970231(0x7f040677, float:1.7549166E38)
        L_0x00af:
            int r1 = X.AnonymousClass7TF.A03(r10, r1)
            X.C66581MXm.A1C(r0, r1)
        L_0x00b6:
            r0 = 2131430832(0x7f0b0db0, float:1.8483376E38)
            android.view.View r15 = X.AnonymousClass7TF.A0F(r13, r0)
            com.instagram.direct.ui.countertextview.CounterTextView r15 = (com.instagram.direct.ui.countertextview.CounterTextView) r15
            r0 = 400(0x190, double:1.976E-321)
            r15.setAnimationDuration(r0)
            int r1 = r8.A00
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r15.A06(r1, r0, r14)
            boolean r0 = X.182.A06(r11, r12, r2)
            if (r0 != 0) goto L_0x00e2
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            if (r9 == 0) goto L_0x00db
            r0 = 2130970334(0x7f0406de, float:1.7549375E38)
        L_0x00db:
            int r0 = X.AnonymousClass7TF.A03(r10, r0)
            r15.setTextColor(r0)
        L_0x00e2:
            android.graphics.drawable.Drawable r1 = r13.getBackground()
            java.lang.String r15 = "Required value was null."
            if (r1 == 0) goto L_0x01f5
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1
            r0 = 2131436225(0x7f0b22c1, float:1.8494314E38)
            android.graphics.drawable.Drawable r13 = r1.findDrawableByLayerId(r0)
            if (r13 == 0) goto L_0x01f0
            boolean r0 = X.182.A06(r11, r12, r2)
            if (r0 != 0) goto L_0x01a3
            if (r9 == 0) goto L_0x01a3
            r0 = 2130970270(0x7f04069e, float:1.7549245E38)
            int r0 = X.AnonymousClass7TF.A03(r10, r0)
        L_0x0104:
            X.AnonymousClass7TE.A1R(r13, r0)
            r13 = 2131436229(0x7f0b22c5, float:1.8494323E38)
            android.graphics.drawable.Drawable r1 = r1.findDrawableByLayerId(r13)
            if (r1 == 0) goto L_0x01eb
            if (r9 == 0) goto L_0x019f
            r0 = 2130970211(0x7f040663, float:1.7549126E38)
            int r0 = X.AnonymousClass7TF.A03(r10, r0)
        L_0x0119:
            X.AnonymousClass7TE.A1R(r1, r0)
            if (r14 == 0) goto L_0x0162
            android.content.res.Resources r1 = r16.getResources()
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            int r10 = r1.getDimensionPixelSize(r0)
            r16.clearAnimation()
            android.view.ViewPropertyAnimator r9 = r16.animate()
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r9 = r9.setDuration(r0)
            boolean r1 = X.182.A06(r11, r12, r2)
            r0 = 0
            if (r1 != 0) goto L_0x013f
            float r0 = (float) r10
            float r0 = -r0
        L_0x013f:
            android.view.ViewPropertyAnimator r1 = r9.translationY(r0)
            r0 = 1067869798(0x3fa66666, float:1.3)
            android.view.ViewPropertyAnimator r1 = X.C66581MXm.A0E(r1, r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            android.view.ViewPropertyAnimator r3 = r1.setInterpolator(r0)
            r2 = 3
            X.Mqz r1 = new X.Mqz
            r0 = r16
            r1.<init>(r0, r2)
            android.view.ViewPropertyAnimator r0 = r3.setListener(r1)
            r0.start()
        L_0x0162:
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x019a
            X.3oV r0 = r7.A0A
            android.view.View r2 = r0.getView()
            r2.setVisibility(r4)
            r1 = 47
            X.Ok7 r0 = new X.Ok7
            r0.<init>((X.C71979OuB) r8, (X.C67743Mtw) r5, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            if (r2 == 0) goto L_0x01e6
            android.graphics.drawable.LayerDrawable r2 = (android.graphics.drawable.LayerDrawable) r2
            r0 = 2131436225(0x7f0b22c1, float:1.8494314E38)
            android.graphics.drawable.Drawable r1 = r2.findDrawableByLayerId(r0)
            if (r1 == 0) goto L_0x01e1
            int r0 = r6.A07
            X.AnonymousClass7TE.A1R(r1, r0)
            android.graphics.drawable.Drawable r1 = r2.findDrawableByLayerId(r13)
            if (r1 == 0) goto L_0x01dc
            int r0 = r6.A0K
            X.AnonymousClass7TE.A1R(r1, r0)
        L_0x019a:
            r0 = r17
            r7.A01 = r0
            return
        L_0x019f:
            int r0 = r6.A0K
            goto L_0x0119
        L_0x01a3:
            int r0 = r6.A07
            goto L_0x0104
        L_0x01a7:
            r0.setVisibility(r9)
            r15.setVisibility(r4)
            r1.setVisibility(r4)
            android.view.View r0 = r7.A02
            android.content.Context r10 = r0.getContext()
            boolean r9 = r8.A0D
            r0 = 2130970334(0x7f0406de, float:1.7549375E38)
            if (r9 == 0) goto L_0x01c0
            r0 = 2130970270(0x7f04069e, float:1.7549245E38)
        L_0x01c0:
            int r0 = X.AnonymousClass7TF.A03(r10, r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r15.setBackgroundTintList(r0)
            r0 = 2130970213(0x7f040665, float:1.754913E38)
            if (r9 == 0) goto L_0x01d3
            r0 = 2130970240(0x7f040680, float:1.7549185E38)
        L_0x01d3:
            int r0 = X.AnonymousClass7TF.A03(r10, r0)
            X.C66581MXm.A1C(r1, r0)
            goto L_0x00b6
        L_0x01dc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x01e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x01e6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x01eb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x01f0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x01f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NQD.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C71979OuB.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r4) {
        C68047MzE mzE = (C68047MzE) r4;
        0qQ.A0B(mzE, 0);
        C252063oV r2 = mzE.A0A;
        if (r2.CVM()) {
            C66580MXl.A1Q(r2, 8);
        }
        DbZ.A1X(mzE.A0B);
        DbZ.A1X(mzE.A08);
        DbZ.A1X(mzE.A06);
        DbZ.A1X(mzE.A07);
        C252063oV r1 = mzE.A0C;
        if (r1.CVM()) {
            r1.getView().setOnClickListener((View.OnClickListener) null);
        }
    }

    public NQD(Fragment fragment, UserSession userSession, C329967Kx r3, OE1 oe1, C67743Mtw mtw) {
        C51972G9s.A1B(userSession, mtw);
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = r3;
        this.A04 = mtw;
        this.A03 = oe1;
    }
}
