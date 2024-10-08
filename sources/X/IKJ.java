package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class IKJ implements AnonymousClass2WK {
    public final CharSequence A00;
    public final CharSequence A01;
    public final CharSequence A02;
    public final boolean A03;

    public final 2WL Cfk(2WI r11, long j) {
        0qQ.A0B(r11, 0);
        View inflate = LayoutInflater.from(r11.A00.A04).inflate(R.layout.feedback_from_facebook_comments_list_row, (ViewGroup) null);
        View requireViewById = inflate.requireViewById(R.id.image_view);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) requireViewById;
        int i = 0;
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        0qQ.A07(requireViewById);
        TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.primary_text);
        View A0F = AnonymousClass7TF.A0F(inflate, R.id.image_view_end_space);
        TextView A0R2 = AnonymousClass7TG.A0R(inflate, R.id.secondary_text);
        TextView A0R3 = AnonymousClass7TG.A0R(inflate, R.id.disclosure_text);
        boolean z = this.A03;
        gradientSpinnerAvatarView.setVisibility(DbW.A01(z ? 1 : 0));
        if (!z) {
            i = 8;
        }
        A0F.setVisibility(i);
        A0R.setText(this.A01);
        CharSequence charSequence = this.A02;
        if (charSequence != null) {
            A0R2.setText(charSequence);
        } else {
            A0R2.setVisibility(8);
        }
        CharSequence charSequence2 = this.A00;
        if (charSequence2 != null) {
            A0R3.setText(charSequence2);
        } else {
            A0R3.setVisibility(8);
        }
        return G9w.A0T(inflate, j);
    }

    public IKJ(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z) {
        this.A01 = charSequence;
        this.A02 = charSequence2;
        this.A00 = charSequence3;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return C51975G9x.A1Y(obj, this);
    }
}
