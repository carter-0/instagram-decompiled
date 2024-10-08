package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.DoR  reason: case insensitive filesystem */
public final class C46973DoR extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final RoundedCornerImageView A02;

    public C46973DoR(View view) {
        super(view);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.product_image);
        this.A02 = roundedCornerImageView;
        roundedCornerImageView.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
        TextView A0G = DbU.A0G(view, R.id.product_name);
        this.A01 = A0G;
        A0G.getPaint().setFakeBoldText(true);
        this.A00 = DbU.A0G(view, R.id.merchant_name);
    }
}
