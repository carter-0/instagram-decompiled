package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Gj5  reason: case insensitive filesystem */
public final class C53133Gj5 extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final RoundedCornerImageView A03;

    public C53133Gj5(View view) {
        super(view);
        this.A00 = view;
        this.A03 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.product_image);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.product_name);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.product_price);
    }
}
