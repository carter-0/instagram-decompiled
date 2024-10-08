package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton;

public final class UEF extends C249703kE {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final IgSimpleImageView A04;
    public final RoundedCornerImageView A05;
    public final C252063oV A06;
    public final C252063oV A07;
    public final AutoWidthToggleButton A08;

    public UEF(View view) {
        super(view);
        this.A00 = view;
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.product_image);
        this.A05 = roundedCornerImageView;
        roundedCornerImageView.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
        TextView A0G = DbU.A0G(view, R.id.product_name);
        this.A03 = A0G;
        C13988Tno.A16(A0G, true);
        this.A02 = DbU.A0G(view, R.id.product_details);
        this.A07 = C66581MXm.A0T(view, R.id.product_sku_info);
        this.A06 = C66581MXm.A0T(view, R.id.product_picker_checkbox);
        this.A01 = view.requireViewById(R.id.info_image);
        this.A08 = (AutoWidthToggleButton) view.requireViewById(R.id.product_action_button);
        this.A04 = (IgSimpleImageView) view.requireViewById(R.id.more_button);
    }
}
