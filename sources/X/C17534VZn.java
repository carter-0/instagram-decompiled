package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.shopping.widget.pdp.cta.CustomCTAButton;

/* renamed from: X.VZn  reason: case insensitive filesystem */
public final class C17534VZn {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgImageView A03;
    public final CustomCTAButton A04;

    public C17534VZn(View view) {
        this.A00 = view;
        this.A04 = (CustomCTAButton) AnonymousClass7TF.A0F(view, R.id.cta_button);
        this.A03 = DbX.A0b(view, R.id.cta_product_image);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.cta_product_name);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.cta_product_price);
    }
}
