package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.DpZ  reason: case insensitive filesystem */
public final class C47039DpZ extends C249703kE implements AnonymousClass3N3 {
    public final View A00;
    public final LinearLayout A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final GradientSpinnerAvatarView A04;
    public final Context A05;

    public final boolean EtJ() {
        return true;
    }

    public final RectF AeG() {
        return 0nA.A0F(this.A04);
    }

    public final View AeY() {
        return this.A04;
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A04);
    }

    public final GradientSpinner Bkt() {
        return this.A04.A0O;
    }

    public final void CLE() {
        this.A04.setVisibility(4);
    }

    public final void Eu3(AnonymousClass0iw r3) {
        this.A04.setVisibility(0);
    }

    public C47039DpZ(View view) {
        super(view);
        this.A05 = AnonymousClass7TE.A0S(view);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.grid_view_action_pog_avatar_container);
        this.A04 = DbX.A0j(view, R.id.grid_view_action_pog_avatar_view);
        this.A02 = DbX.A0Z(view, R.id.grid_view_action_pog_text_view);
        this.A01 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.grid_view_action_label_container);
        IgImageView requireViewById = view.requireViewById(R.id.grid_view_action_pog_chevron);
        IgImageView igImageView = requireViewById;
        igImageView.setImageDrawable(0mk.A00(igImageView.getContext(), R.drawable.instagram_chevron_right_pano_outline_12));
        0qQ.A07(requireViewById);
        this.A03 = igImageView;
    }
}
