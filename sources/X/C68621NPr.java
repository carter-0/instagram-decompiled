package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NPr  reason: case insensitive filesystem */
public final class C68621NPr extends C232232tF {
    public final AnonymousClass0iw A00;
    public final C74400PuG A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C68024Myq(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.layout_note_user_row_item, false), this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r10, X.C249703kE r11) {
        /*
            r9 = this;
            X.N5n r10 = (X.C68198N5n) r10
            X.Myq r11 = (X.C68024Myq) r11
            r5 = 0
            boolean r8 = X.AnonymousClass7TF.A1U(r5, r10, r11)
            android.view.View r4 = r11.A00
            X.NPr r3 = r11.A05
            r0 = 7
            X.C71408Ok7.A00(r4, r0, r3, r10)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r11.A01
            r0 = 8
            X.C71408Ok7.A00(r1, r0, r3, r10)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r7 = r11.A04
            com.instagram.user.model.User r6 = r10.A00
            com.instagram.common.typedurl.ImageUrl r2 = r6.Bh3()
            X.0iw r1 = r3.A00
            r0 = 0
            r7.A0F(r0, r1, r2)
            r7.setGradientSpinnerVisible(r5)
            java.lang.Integer r3 = r10.A01
            int r2 = r3.intValue()
            if (r2 == r5) goto L_0x0046
            if (r2 == r8) goto L_0x003e
            r1 = 2
            if (r2 == r1) goto L_0x0051
            r1 = 3
            if (r2 == r1) goto L_0x0051
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x003e:
            android.content.Context r1 = r4.getContext()
            r0 = 2131239370(0x7f0821ca, float:1.8095045E38)
            goto L_0x004d
        L_0x0046:
            android.content.Context r1 = r4.getContext()
            r0 = 2131239367(0x7f0821c7, float:1.8095039E38)
        L_0x004d:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
        L_0x0051:
            r7.setBottomBadgeDrawable(r0)
            com.instagram.common.ui.base.IgTextView r1 = r11.A02
            java.lang.String r0 = r6.B8Q()
            r1.setText(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r3 != r0) goto L_0x0076
            X.3oV r0 = r11.A03
            r0.setVisibility(r5)
            android.view.View r2 = r0.getView()
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r1 = r4.getContext()
            r0 = 2131956241(0x7f131211, float:1.9549032E38)
            X.DbT.A18(r1, r2, r0)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68621NPr.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C68198N5n.class;
    }

    public C68621NPr(AnonymousClass0iw r1, C74400PuG puG) {
        this.A00 = r1;
        this.A01 = puG;
    }
}
