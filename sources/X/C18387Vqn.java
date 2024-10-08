package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.Vqn  reason: case insensitive filesystem */
public abstract class C18387Vqn {
    public static final C231672s5 A00 = WTV.A00;

    public static final void A00(C14891UDt uDt, WSR wsr) {
        int i = 0;
        0qQ.A0B(uDt, 0);
        View view = uDt.itemView;
        view.setVisibility(0);
        WB0.A00(view, 12, wsr);
        RoundedCornerFrameLayout roundedCornerFrameLayout = uDt.A04;
        C381829cQ r4 = wsr.A00;
        roundedCornerFrameLayout.setStrokeWidth((float) DbU.A05(uDt.itemView).getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height));
        Number number = (Number) r4.A03;
        if (number != null) {
            roundedCornerFrameLayout.setCornerRadius(number.intValue());
        }
        IgImageView igImageView = uDt.A02;
        ImageUrl imageUrl = (ImageUrl) r4.A01;
        if (imageUrl == null) {
            igImageView.A09();
        } else {
            igImageView.setUrl(imageUrl, wsr.A01.A00);
        }
        IgImageView igImageView2 = uDt.A03;
        ImageUrl imageUrl2 = (ImageUrl) r4.A02;
        if (imageUrl2 == null) {
            igImageView2.A09();
        } else {
            igImageView2.A0I = A00;
            igImageView2.setUrl(imageUrl2, wsr.A01.A00);
        }
        uDt.A01.setText(r4.A04);
        View view2 = uDt.A00;
        if (!r4.A05) {
            i = 8;
        }
        view2.setVisibility(i);
        WB0.A00(view2, 13, wsr);
    }
}
