package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.model.shopping.ProductSource;

/* renamed from: X.VhN  reason: case insensitive filesystem */
public final class C17870VhN {
    public final View A00;
    public final X51 A01;
    public final TextView A02;
    public final TextView A03;

    public final void A00(ProductSource productSource) {
        TextView textView = this.A03;
        if (productSource == null) {
            textView.setText(2131968414);
            return;
        }
        textView.setText(productSource.A04);
        this.A02.setText(productSource.A03);
    }

    public C17870VhN(View view, X51 x51) {
        this.A01 = x51;
        View requireViewById = view.requireViewById(R.id.product_source);
        this.A00 = requireViewById;
        this.A03 = AnonymousClass7TE.A0d(view, R.id.product_source_title);
        this.A02 = AnonymousClass7TE.A0d(view, R.id.product_source_subtitle);
        WB0.A00(requireViewById, 7, this);
    }
}
