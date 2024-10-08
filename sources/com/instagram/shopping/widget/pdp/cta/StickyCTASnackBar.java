package com.instagram.shopping.widget.pdp.cta;

import X.0qQ;
import X.AnonymousClass7TE;
import X.JTO;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class StickyCTASnackBar extends ConstraintLayout {
    public View A00;
    public View A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public IgImageView A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickyCTASnackBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        View inflate = View.inflate(context, R.layout.sticky_cta_layout, this);
        this.A00 = inflate.findViewById(R.id.sticky_cta_container);
        this.A01 = inflate.findViewById(R.id.top_divider);
        this.A06 = JTO.A0Y(inflate, R.id.square_image);
        this.A02 = (LinearLayout) inflate.findViewById(R.id.product_info_container);
        this.A04 = AnonymousClass7TE.A0d(inflate, R.id.product_name);
        this.A05 = AnonymousClass7TE.A0d(inflate, R.id.product_price);
        this.A03 = AnonymousClass7TE.A0d(inflate, R.id.snackbar_button);
    }

    public final void setButton(TextView textView) {
        0qQ.A0B(textView, 0);
        this.A03 = textView;
    }

    public final void setContainer(View view) {
        0qQ.A0B(view, 0);
        this.A00 = view;
    }

    public final void setImage(IgImageView igImageView) {
        0qQ.A0B(igImageView, 0);
        this.A06 = igImageView;
    }

    public final void setProductInfoContainer(LinearLayout linearLayout) {
        0qQ.A0B(linearLayout, 0);
        this.A02 = linearLayout;
    }

    public final void setProductName(TextView textView) {
        0qQ.A0B(textView, 0);
        this.A04 = textView;
    }

    public final void setProductPrice(TextView textView) {
        0qQ.A0B(textView, 0);
        this.A05 = textView;
    }

    public final void setTopDivider(View view) {
        0qQ.A0B(view, 0);
        this.A01 = view;
    }

    public final TextView getButton() {
        return this.A03;
    }

    public final View getContainer() {
        return this.A00;
    }

    public final IgImageView getImage() {
        return this.A06;
    }

    public final LinearLayout getProductInfoContainer() {
        return this.A02;
    }

    public final TextView getProductName() {
        return this.A04;
    }

    public final TextView getProductPrice() {
        return this.A05;
    }

    public final View getTopDivider() {
        return this.A01;
    }
}
