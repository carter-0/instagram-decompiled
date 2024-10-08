package X;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Uiy  reason: case insensitive filesystem */
public final class C15815Uiy extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C14869UCx(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.layout_ads_consent_growth_bottomsheet_body_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C15074UNr uNr = (C15074UNr) r8;
        C14869UCx uCx = (C14869UCx) r9;
        AnonymousClass7TF.A1H(uNr, uCx);
        TextView textView = uCx.A02;
        Context A0S = AnonymousClass7TE.A0S(textView);
        C59721JVf jVf = uNr.A00;
        CharSequence A00 = C66909Mes.A00(A0S, (C266444Yx) jVf.A01);
        if (A00.length() == 0) {
            textView.setVisibility(8);
        } else {
            Html.escapeHtml(new String[]{""}[0]);
            String obj = A00.toString();
            if (obj == null) {
                obj = "";
            }
            textView.setText(Html.fromHtml(obj));
        }
        Number number = (Number) jVf.A00;
        ImageView imageView = uCx.A00;
        if (number == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(number.intValue());
        }
        if (textView.getVisibility() == 8 && imageView.getVisibility() == 8) {
            LinearLayout linearLayout = uCx.A01;
            linearLayout.setVisibility(8);
            linearLayout.setPaddingRelative(0, 0, 0, 0);
            return;
        }
        LinearLayout linearLayout2 = uCx.A01;
        linearLayout2.setVisibility(0);
        Context context = linearLayout2.getContext();
        linearLayout2.setPaddingRelative(context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width), context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), AnonymousClass7TF.A02(context, R.dimen.abc_dropdownitem_icon_width), AnonymousClass7TF.A02(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
    }

    public final Class modelClass() {
        return C15074UNr.class;
    }
}
