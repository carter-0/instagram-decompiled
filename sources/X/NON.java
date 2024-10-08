package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class NON extends C232222tE {
    public final AnonymousClass0iw A00;
    public final C3260475e A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67978My3(DbT.A0D(layoutInflater, viewGroup, R.layout.mention_item_row, false));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        N5U n5u = (N5U) r7;
        C67978My3 my3 = (C67978My3) r8;
        AnonymousClass7TF.A1H(n5u, my3);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = my3.A02;
        AnonymousClass77I r4 = n5u.A00;
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, this.A00, r4.A01);
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        gradientSpinnerAvatarView.A0K.setScaleType(ImageView.ScaleType.FIT_CENTER);
        my3.A00.setText(r4.A09);
        C71408Ok7.A00(my3.itemView, 55, this, n5u);
        String str = r4.A0A;
        if (str == null || str.length() == 0) {
            TextView textView = my3.A01;
            textView.setVisibility(8);
            C244273av.A0B(textView, false);
            return;
        }
        TextView textView2 = my3.A01;
        textView2.setVisibility(0);
        textView2.setText(str);
        C244273av.A0B(textView2, r4.A0D);
    }

    public final Class modelClass() {
        return N5U.class;
    }

    public NON(AnonymousClass0iw r1, C3260475e r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
