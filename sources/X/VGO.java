package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.shopping.widget.pdp.cta.CustomCTAButton;
import com.instagram.user.model.Product;

public abstract class VGO {
    public static final void A00(AnonymousClass0iw r9, UserSession userSession, X7v x7v, C17534VZn vZn, C17506VYk vYk) {
        int i;
        int i2;
        String str;
        CharSequence A09;
        CharSequence text;
        C51974G9v.A1O(userSession, vZn, vYk, r9);
        View view = vZn.A00;
        view.setVisibility(DbW.A01(vYk.A03 ? 1 : 0));
        CustomCTAButton customCTAButton = vZn.A04;
        C17505VYj vYj = vYk.A00;
        customCTAButton.setStyle(vYj.A01);
        Resources resources = customCTAButton.getResources();
        0qQ.A07(resources);
        customCTAButton.setText(C56259HvT.A00(resources, vYj.A00));
        int intValue = vYj.A02.intValue();
        if (intValue != 0) {
            i = 42;
            if (intValue != 1) {
                i = 43;
            }
        } else {
            i = 41;
        }
        WBC.A00(customCTAButton, i, x7v);
        int intValue2 = vYj.A03.intValue();
        if (intValue2 == 0) {
            customCTAButton.setEnabled(false);
        } else if (intValue2 == 1) {
            customCTAButton.setEnabled(true);
        } else if (intValue2 != 2) {
            customCTAButton.setLoading(false);
        } else {
            customCTAButton.setLoading(true);
        }
        IgImageView igImageView = vZn.A03;
        C17386VTn vTn = vYk.A01;
        ImageUrl imageUrl = vTn.A01;
        if (imageUrl != null) {
            igImageView.setUrl(imageUrl, r9);
            i2 = 0;
        } else {
            i2 = 8;
        }
        igImageView.setVisibility(i2);
        C56078HsR hsR = vTn.A00;
        if (hsR != null) {
            str = C56259HvT.A00(C66580MXl.A0B(igImageView), hsR);
        } else {
            str = null;
        }
        igImageView.setContentDescription(str);
        TextView textView = vZn.A01;
        TextView textView2 = vZn.A02;
        C17466VWt vWt = vYk.A02;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        String A00 = AnonymousClass000.A00(18);
        0qQ.A0C(layoutParams, A00);
        int A04 = (C66582MXn.A04(view, 0nA.A06(AnonymousClass7TE.A0S(view))) - igImageView.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding)) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        0qQ.A0C(layoutParams2, A00);
        int i3 = A04 - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
        ViewGroup.LayoutParams layoutParams3 = customCTAButton.getLayoutParams();
        0qQ.A0C(layoutParams3, A00);
        textView.setText(W2t.A06(textView, vWt.A02, R.dimen.call_peek_promo_bottom_sheet_label_bottom_padding, ((i3 - ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin) - (AnonymousClass7TE.A0E(resources) * 2)) - customCTAButton.getCalculatedTextWidth()));
        Context A0S = AnonymousClass7TE.A0S(textView2);
        Product product = vWt.A01;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean A05 = product.A05();
        String str2 = product.A0L;
        if (A05) {
            A09 = C324476zN.A04(A0S, str2, product.A0G);
        } else {
            A09 = C324476zN.A09(A0S, str2, Integer.valueOf(R.style.PriceIncentiveExperimentStyle));
        }
        spannableStringBuilder.append(A09);
        String str3 = product.A0K;
        if (str3 != null) {
            spannableStringBuilder.append(" ").append(C324476zN.A02(A0S, userSession, str3, product.A05()));
        }
        textView2.setText(spannableStringBuilder);
        C56078HsR hsR2 = vWt.A00;
        if (hsR2 == null || (text = C56259HvT.A00(C66580MXl.A0B(textView2), hsR2)) == null) {
            text = textView2.getText();
        }
        textView2.setContentDescription(text);
    }
}
