package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class EAZ extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final C46443Df5 A02;
    public final C46430Der A03;

    public EAZ(Context context, AnonymousClass0iw r3, C46443Df5 df5, C46430Der der) {
        0qQ.A0B(df5, 3);
        this.A00 = context;
        this.A03 = der;
        this.A02 = df5;
        this.A01 = r3;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: com.instagram.ui.widget.stackedavatar.StackedAvatarView} */
    /* JADX WARNING: type inference failed for: r0v9, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v35, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v39, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v40 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r12, android.view.View r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r11 = this;
            r0 = 1062773612(0x3f58a36c, float:0.8462436)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r10 = 1
            int r9 = X.DbW.A02(r10, r13, r14)
            java.lang.Object r6 = r13.getTag()
            if (r6 == 0) goto L_0x0139
            X.F0U r6 = (X.F0U) r6
            X.G90 r14 = (X.G90) r14
            X.Der r5 = r11.A03
            X.Df5 r4 = r11.A02
            X.0iw r1 = r11.A01
            r8 = 0
            X.0qQ.A0B(r6, r8)
            X.0qQ.A0B(r14, r10)
            X.AnonymousClass7TG.A0w(r9, r5, r4, r1)
            android.widget.TextView r2 = r6.A02
            java.lang.String r0 = r14.getTitle()
            r2.setText(r0)
            android.widget.TextView r7 = r6.A01
            java.lang.String r0 = r14.CHh()
            r7.setText(r0)
            r7.setImportantForAccessibility(r9)
            java.lang.String r7 = r14.B9u()
            java.lang.String r0 = "potential_spam"
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x008b
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r9 = r6.A04
            android.content.Context r1 = r9.getContext()
            r0 = 2131239007(0x7f08205f, float:1.8094309E38)
            android.graphics.drawable.Drawable r7 = r1.getDrawable(r0)
            if (r7 == 0) goto L_0x0073
            int r1 = X.2Yu.A01(r1)
            android.graphics.drawable.Drawable r0 = r7.mutate()
            X.AnonymousClass7TE.A1R(r0, r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r6.A03
            r0.setImageDrawable(r7)
            r0.setVisibility(r8)
            r1 = 8
            r9.setVisibility(r1)
        L_0x006e:
            com.instagram.ui.widget.stackedavatar.StackedAvatarView r0 = r6.A05
        L_0x0070:
            r0.setVisibility(r1)
        L_0x0073:
            android.view.ViewGroup r1 = r6.A00
            r0 = 68
            X.FPH.A00(r1, r5, r14, r4, r0)
            java.lang.CharSequence r0 = r2.getText()
            r1.setContentDescription(r0)
            X.2eS.A01(r1)
            r0 = -1327473714(0xffffffffb0e05bce, float:-1.6324238E-9)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x008b:
            java.util.List r0 = r14.B3c()
            int r7 = r0.size()
            java.util.List r0 = r14.B3c()
            if (r7 != r9) goto L_0x00bf
            com.instagram.user.model.User r0 = X.DbS.A0g(r0, r8)
            com.instagram.common.typedurl.ImageUrl r7 = r0.Bh3()
            java.util.List r0 = r14.B3c()
            com.instagram.user.model.User r0 = X.DbS.A0g(r0, r10)
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            com.instagram.ui.widget.stackedavatar.StackedAvatarView r9 = r6.A05
            r9.setUrls(r7, r0, r1)
        L_0x00b2:
            r9.setVisibility(r8)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r6.A04
            r1 = 8
            r0.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r6.A03
            goto L_0x0070
        L_0x00bf:
            int r0 = r0.size()
            r9 = 0
            if (r0 != r10) goto L_0x00f0
            java.lang.Boolean r0 = r14.BvU()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r10)
            if (r0 == 0) goto L_0x0119
            com.instagram.ui.widget.stackedavatar.StackedAvatarView r9 = r6.A05
            android.content.Context r7 = r9.getContext()
            r0 = 2131237324(0x7f0819cc, float:1.8090895E38)
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            r9.setFrontAvatarDrawable(r0)
            java.util.List r0 = r14.B3c()
            com.instagram.user.model.User r0 = X.DbS.A0g(r0, r8)
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            r9.setBackAvatarUrl(r0, r1)
            goto L_0x00b2
        L_0x00f0:
            java.util.List r0 = r14.B3c()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0073
            java.lang.Boolean r0 = r14.BvU()
            if (r0 == 0) goto L_0x0073
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0073
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r7 = r6.A04
            android.content.Context r1 = r7.getContext()
            r0 = 2131237324(0x7f0819cc, float:1.8090895E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r0 == 0) goto L_0x0073
            r7.A0D(r0)
            goto L_0x012a
        L_0x0119:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r7 = r6.A04
            java.util.List r0 = r14.B3c()
            com.instagram.user.model.User r0 = X.DbS.A0g(r0, r8)
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            r7.A0F(r9, r1, r0)
        L_0x012a:
            r7.setGradientSpinnerVisible(r8)
            r7.setVisibility(r8)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r6.A03
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x006e
        L_0x0139:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1479517956(0xffffffffa7d058fc, float:-5.7828074E-15)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EAZ.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 513902833);
        View A0A = DbU.A0A(DbT.A0B(this.A00), viewGroup, R.layout.user_group, false);
        A0A.setTag(new F0U(A0A));
        AnonymousClass0fD.A0A(1416862741, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
