package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class UES extends C249703kE {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ViewGroup A04;
    public final ImageView A05;
    public final ImageView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final IgSimpleImageView A0E;
    public final IgImageView A0F;
    public final C252063oV A0G;
    public final Runnable A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UES(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A0F = DbX.A0b(view, R.id.product_thumbnail_image);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.product_thumbnail_sold_out_slash);
        this.A03 = A0G2;
        this.A08 = AnonymousClass7TG.A0R(view, R.id.product_name);
        this.A0C = AnonymousClass7TG.A0R(view, R.id.product_subtitle_multiline);
        this.A0D = AnonymousClass7TG.A0R(view, R.id.product_subtitle_single_line);
        this.A05 = DbX.A0J(view, R.id.remove_button);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.bottom_buttons);
        this.A04 = DbX.A0I(view, R.id.item_quantity_button);
        this.A09 = AnonymousClass7TG.A0R(view, R.id.item_quantity_text);
        this.A0E = DbX.A0Y(view, R.id.item_quantity_chevron);
        this.A07 = AnonymousClass7TG.A0R(view, R.id.edit_button);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.edit_button_divider);
        this.A0A = AnonymousClass7TG.A0R(view, R.id.save_text_button);
        this.A06 = DbX.A0J(view, R.id.shipping_icon);
        this.A0B = AnonymousClass7TG.A0R(view, R.id.shipping_estimate_label);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.divider);
        this.A0G = C66581MXm.A0T(view, R.id.left_in_stock_label);
        C14682U1d u1d = new C14682U1d(AnonymousClass7TE.A0S(A0G2));
        u1d.A00 = R.dimen.abc_action_bar_elevation_material;
        A0G2.setBackground(u1d);
        this.A0H = new C20247Wnm(this, C51972G9s.A08(view.getContext()));
    }
}
