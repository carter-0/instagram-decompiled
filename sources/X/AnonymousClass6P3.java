package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.6P3  reason: invalid class name */
public final class AnonymousClass6P3 implements C2365734g {
    public final /* synthetic */ AnonymousClass6P2 A00;

    public AnonymousClass6P3(AnonymousClass6P2 r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass6P2 r1 = this.A00;
        r1.A00 = view;
        View requireViewById = view.requireViewById(R.id.product_thumbnail_tappable_area);
        0qQ.A0B(requireViewById, 0);
        r1.A01 = requireViewById;
        TextView textView = (TextView) view.requireViewById(R.id.product_thumbnail_header);
        0qQ.A0B(textView, 0);
        r1.A04 = textView;
        TextView textView2 = (TextView) view.requireViewById(R.id.product_thumbnail_header_more_products);
        0qQ.A0B(textView2, 0);
        r1.A03 = textView2;
        TextView textView3 = (TextView) view.requireViewById(R.id.product_thumbnail_subheader);
        0qQ.A0B(textView3, 0);
        r1.A02 = textView3;
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) view.requireViewById(R.id.product_thumbnail_image);
        0qQ.A0B(roundedCornerImageView, 0);
        r1.A05 = roundedCornerImageView;
        RoundedCornerImageView roundedCornerImageView2 = (RoundedCornerImageView) view.requireViewById(R.id.product_thumbnail_image_stacked_top);
        0qQ.A0B(roundedCornerImageView2, 0);
        r1.A07 = roundedCornerImageView2;
        RoundedCornerImageView roundedCornerImageView3 = (RoundedCornerImageView) view.requireViewById(R.id.product_thumbnail_image_stacked_bottom);
        0qQ.A0B(roundedCornerImageView3, 0);
        r1.A06 = roundedCornerImageView3;
    }
}
