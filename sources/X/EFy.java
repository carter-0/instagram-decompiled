package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class EFy extends C232222tE {
    public final AnonymousClass0iw A00;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d5, code lost:
        if (1 != 0) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r17, X.C249703kE r18) {
        /*
            r16 = this;
            r8 = r18
            r4 = r17
            X.FYK r4 = (X.FYK) r4
            X.DoU r8 = (X.C46976DoU) r8
            r3 = 0
            boolean r11 = X.AnonymousClass7TF.A1U(r3, r4, r8)
            r0 = r16
            X.0iw r2 = r0.A00
            X.0qQ.A0B(r2, r11)
            android.view.View r1 = r8.A00
            r0 = 56
            X.FP4.A01(r1, r0, r4)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r7 = r8.A02
            com.instagram.user.model.User r6 = r4.A00
            com.instagram.common.typedurl.ImageUrl r0 = r6.Bh3()
            r5 = 0
            r7.A0F(r5, r2, r0)
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x009a
            android.content.Context r4 = r7.getContext()
            r0 = 2131231736(0x7f0803f8, float:1.8079561E38)
            android.graphics.drawable.Drawable r1 = r4.getDrawable(r0)
            r0 = 2131238108(0x7f081cdc, float:1.8092485E38)
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            if (r1 == 0) goto L_0x008a
            if (r0 == 0) goto L_0x008a
            r1.mutate()
            r0.mutate()
            r9 = 2
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r1, r0}
            android.graphics.drawable.LayerDrawable r10 = new android.graphics.drawable.LayerDrawable
            r10.<init>(r0)
            r0 = 2130970208(0x7f040660, float:1.754912E38)
            int r2 = X.AnonymousClass7TF.A03(r4, r0)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r1 = r4.getColor(r0)
            android.graphics.drawable.Drawable r0 = r10.getDrawable(r3)
            r0.setTint(r2)
            android.graphics.drawable.Drawable r0 = r10.getDrawable(r11)
            r0.setTint(r1)
            int r12 = X.DbS.A02(r4, r9)
            r0 = 20
            int r1 = X.DbS.A02(r4, r0)
            int r0 = X.DbS.A02(r4, r0)
            r10.setLayerSize(r11, r1, r0)
            r13 = r12
            r14 = r12
            r15 = r12
            r10.setLayerInset(r11, r12, r13, r14, r15)
            r7.setPresenceBadgeDrawable(r5)
            r7.setBottomBadgeDrawable(r10)
        L_0x008a:
            android.widget.TextView r1 = r8.A01
            java.lang.String r0 = r6.getFullName()
            if (r0 != 0) goto L_0x0096
            java.lang.String r0 = r6.getUsername()
        L_0x0096:
            r1.setText(r0)
            return
        L_0x009a:
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x00ba
            android.content.Context r1 = r7.getContext()
            android.graphics.drawable.Drawable r2 = X.DbY.A07(r1)
            r0 = 17
            int r1 = X.DbS.A02(r1, r0)
            r7.setBottomBadgeDrawable(r2)
            android.graphics.drawable.Drawable r0 = r7.A06
            if (r0 == 0) goto L_0x00b6
            r0.setBounds(r3, r3, r1, r1)
        L_0x00b6:
            r7.setPresenceBadgeDrawable(r5)
            goto L_0x008a
        L_0x00ba:
            java.lang.Integer r0 = r4.A02
            if (r0 == 0) goto L_0x00fa
            int r11 = r0.intValue()
            android.content.Context r10 = r7.getContext()
            r0 = 61
            if (r0 > r11) goto L_0x00f6
            r0 = 1440(0x5a0, float:2.018E-42)
            r9 = 1
            if (r11 > r0) goto L_0x00f6
            r0 = 480(0x1e0, float:6.73E-43)
            r4 = 1
            if (r11 <= r0) goto L_0x00d7
            r4 = 0
            if (r9 == 0) goto L_0x00f6
        L_0x00d7:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            long r0 = (long) r11
            long r2 = r2.toHours(r0)
            int r1 = (int) r2
            if (r4 != 0) goto L_0x00e3
            if (r9 == 0) goto L_0x00f6
        L_0x00e3:
            r0 = 2131960123(0x7f13213b, float:1.9556906E38)
            if (r4 != 0) goto L_0x00ea
            if (r9 == 0) goto L_0x00eb
        L_0x00ea:
            r11 = r1
        L_0x00eb:
            X.U0t r0 = X.DbZ.A0X(r10, r11, r0)
            r7.setPresenceBadgeDrawable(r0)
            r7.setBottomBadgeDrawable(r5)
            goto L_0x008a
        L_0x00f6:
            r0 = 2131960124(0x7f13213c, float:1.9556908E38)
            goto L_0x00eb
        L_0x00fa:
            r7.setBottomBadgeDrawable(r5)
            r7.setPresenceBadgeDrawable(r5)
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EFy.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return FYK.class;
    }

    public EFy(AnonymousClass0iw r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        return new C46976DoU(layoutInflater, viewGroup);
    }
}
