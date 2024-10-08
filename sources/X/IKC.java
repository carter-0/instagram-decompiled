package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class IKC implements AnonymousClass2WK {
    public final CharSequence A00;
    public final CharSequence A01;

    public final 2WL Cfk(2WI r10, long j) {
        0qQ.A0B(r10, 0);
        View inflate = LayoutInflater.from(r10.A00.A04).inflate(R.layout.feedback_from_facebook_comments_list_row, (ViewGroup) null);
        View requireViewById = inflate.requireViewById(R.id.image_view);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) requireViewById;
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        0qQ.A07(requireViewById);
        TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.primary_text);
        View A0F = AnonymousClass7TF.A0F(inflate, R.id.image_view_end_space);
        TextView A0R2 = AnonymousClass7TG.A0R(inflate, R.id.secondary_text);
        View A0G = AnonymousClass7TF.A0G(inflate, R.id.disclosure_text);
        gradientSpinnerAvatarView.setVisibility(0);
        A0F.setVisibility(0);
        A0R.setText(this.A00);
        A0R2.setText(this.A01);
        A0G.setVisibility(8);
        return G9w.A0T(inflate, j);
    }

    public IKC(CharSequence charSequence, CharSequence charSequence2) {
        this.A00 = charSequence;
        this.A01 = charSequence2;
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return C51975G9x.A1Y(obj, this);
    }
}
