package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.UiE  reason: case insensitive filesystem */
public final class C15769UiE extends C232222tE {
    public final AnonymousClass0iw A00;
    public final C49330Etl A01;

    public C15769UiE(AnonymousClass0iw r2, C49330Etl etl) {
        0qQ.A0B(etl, 2);
        this.A00 = r2;
        this.A01 = etl;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C14878UDg(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.direct_channels_xposting_selection_item_view, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        C19267WSa wSa = (C19267WSa) r10;
        C14878UDg uDg = (C14878UDg) r11;
        AnonymousClass7TF.A1H(wSa, uDg);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = uDg.A04;
        Context context = gradientSpinnerAvatarView.getContext();
        TextView textView = uDg.A01;
        textView.setText(wSa.A01);
        TextView textView2 = uDg.A02;
        String str = wSa.A02;
        if (str == null) {
            str = AnonymousClass7TE.A16(context, 2131958716);
        }
        textView2.setText(str);
        IgdsRadioButton igdsRadioButton = uDg.A03;
        igdsRadioButton.setChecked(wSa.A05);
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, this.A00, wSa.A00);
        gradientSpinnerAvatarView.A0B(C66582MXn.A01(context), 0);
        gradientSpinnerAvatarView.A05();
        Drawable drawable = context.getDrawable(R.drawable.facebook_user_badge_15);
        if (drawable != null) {
            gradientSpinnerAvatarView.setBottomBadgeDrawable(drawable);
        }
        gradientSpinnerAvatarView.A00 = context.getResources().getDimension(R.dimen.abc_control_corner_material);
        gradientSpinnerAvatarView.A01 = DbU.A00(context, R.dimen.abc_control_corner_material);
        if (wSa.A04 || wSa.A06) {
            WBG.A01(uDg.A00, 5, this, wSa);
            return;
        }
        igdsRadioButton.setEnabled(false);
        igdsRadioButton.setAlpha(0.3f);
        gradientSpinnerAvatarView.setAlpha(0.3f);
        int A03 = AnonymousClass7TF.A03(context, R.attr.igds_color_primary_text_disabled);
        textView.setTextColor(A03);
        textView2.setTextColor(A03);
    }

    public final Class modelClass() {
        return C19267WSa.class;
    }
}
