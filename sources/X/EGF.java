package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;

public final class EGF extends C232222tE {
    public final int A00;
    public final AnonymousClass0iw A01;
    public final E12 A02;
    public final 0sK A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.edit_channels_channel_item, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(24));
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        constraintLayout.setBackgroundColor(this.A00);
        C47013Dp5 dp5 = new C47013Dp5(constraintLayout);
        0nA.A0n(dp5.A00, dp5.A03, R.dimen.account_discovery_bottom_gap);
        return dp5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r10, X.C249703kE r11) {
        /*
            r9 = this;
            X.DtX r10 = (X.C47246DtX) r10
            X.Dp5 r11 = (X.C47013Dp5) r11
            r4 = 0
            boolean r3 = X.AnonymousClass7TF.A1U(r4, r10, r11)
            com.instagram.common.typedurl.ImageUrl r5 = r10.A01
            r6 = 0
            r8 = 1
            if (r5 == 0) goto L_0x0028
            com.instagram.common.typedurl.ImageUrl r2 = r10.A02
            if (r2 != 0) goto L_0x0021
            java.lang.Integer r0 = r10.A04
            if (r0 == 0) goto L_0x00ba
            int r0 = r0.intValue()
            boolean r0 = X.AnonymousClass48O.A01(r0)
            if (r0 != r3) goto L_0x00ba
        L_0x0021:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r11.A05
            X.0iw r0 = r9.A01
            r1.A0G(r6, r0, r5, r2)
        L_0x0028:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r5 = r11.A05
            r5.setGradientSpinnerVisible(r4)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r11.A03
            android.content.Context r1 = r2.getContext()
            boolean r0 = r10.A09
            r7 = 8
            android.content.res.Resources r1 = r1.getResources()
            if (r0 == 0) goto L_0x00a6
            int r0 = X.AnonymousClass7TE.A0F(r1)
            X.0nA.A0d(r5, r0)
            android.widget.CheckBox r5 = r11.A00
            r5.setVisibility(r4)
            boolean r1 = r10.A0B
            com.instagram.common.ui.base.IgSimpleImageView r0 = r11.A04
            if (r1 == 0) goto L_0x00a2
            r0.setVisibility(r4)
        L_0x0052:
            r5.setOnCheckedChangeListener(r6)
            r5.setChecked(r1)
            r0 = 3
            X.FQP r6 = new X.FQP
            r6.<init>((int) r0, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r9)
        L_0x005e:
            r5.setOnCheckedChangeListener(r6)
            X.47m r0 = r10.A00
            if (r0 == 0) goto L_0x0091
            int r1 = r0.AdN()
            r0 = 2
            if (r1 != r0) goto L_0x0091
        L_0x006c:
            android.widget.TextView r5 = r11.A01
            java.lang.String r0 = r10.A06
            if (r8 == 0) goto L_0x007d
            android.text.SpannableStringBuilder r0 = X.DbS.A0C(r0)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r5)
            X.F5q.A01(r1, r0, r4, r3, r4)
        L_0x007d:
            X.DbZ.A14(r5, r0)
            android.widget.TextView r1 = r11.A02
            java.lang.String r0 = r10.A07
            r1.setText(r0)
            X.E12 r0 = r9.A02
            if (r0 == 0) goto L_0x0090
            r0 = 44
            X.FPE.A01(r2, r0, r10, r9)
        L_0x0090:
            return
        L_0x0091:
            java.lang.Integer r0 = r10.A04
            if (r0 == 0) goto L_0x00a0
            int r0 = r0.intValue()
            boolean r0 = X.AnonymousClass48O.A02(r0)
            if (r0 != r3) goto L_0x00a0
            goto L_0x006c
        L_0x00a0:
            r8 = 0
            goto L_0x006c
        L_0x00a2:
            r0.setVisibility(r7)
            goto L_0x0052
        L_0x00a6:
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.0nA.A0d(r5, r0)
            android.widget.CheckBox r5 = r11.A00
            r5.setVisibility(r7)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r11.A04
            r0.setVisibility(r7)
            goto L_0x005e
        L_0x00ba:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r11.A05
            X.0iw r0 = r9.A01
            r1.A0F(r6, r0, r5)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EGF.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C47246DtX.class;
    }

    public EGF(AnonymousClass0iw r1, E12 e12, 0sK r3, int i) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = e12;
        this.A00 = i;
    }
}
