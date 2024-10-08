package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.S9v  reason: case insensitive filesystem */
public abstract class C11094S9v {
    public static void A00(TextView textView, QUQ quq, String str, int i) {
        int coercedIntField;
        int i2;
        int coercedIntField2;
        int i3 = 0;
        if (quq != null && !TextUtils.isEmpty(quq.getOptionalStringField(0, "text"))) {
            SpannableString spannableString = new SpannableString(quq.getOptionalStringField(0, "text"));
            Context context = textView.getContext();
            C249803kO A0Q = Pxi.A0Q(quq, QUO.class, "color_ranges", 2, 806081955);
            while (A0Q.hasNext()) {
                C250663lr A0V = C41845B3m.A0V(A0Q);
                XRB xrb = XRB.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                if (A0V.getOptionalEnumField(2, "usage_color_enum", xrb) != null) {
                    int ordinal = ((XRB) A0V.getOptionalEnumField(2, "usage_color_enum", xrb)).ordinal();
                    if (ordinal != 7) {
                        i2 = R.attr.fbpay_primary_text_color;
                        if (ordinal != 9) {
                            i2 = R.attr.fbpay_secondary_text_color;
                        }
                    } else {
                        i2 = R.attr.fbpay_positive_color;
                    }
                    0qQ.A0B(context, 0);
                    int i4 = Pxj.A0J(context, i2).data;
                    if (A0V.getCoercedIntField(1, "offset") + A0V.getCoercedIntField(0, "length") > spannableString.length()) {
                        coercedIntField2 = spannableString.length();
                    } else {
                        coercedIntField2 = A0V.getCoercedIntField(1, "offset") + A0V.getCoercedIntField(0, "length");
                    }
                    spannableString.setSpan(new ForegroundColorSpan(i4), A0V.getCoercedIntField(1, "offset"), coercedIntField2, 17);
                }
            }
            C249803kO A0Q2 = Pxi.A0Q(quq, QUP.class, "inline_style_ranges", 1, 101890325);
            while (A0Q2.hasNext()) {
                C250663lr A0V2 = C41845B3m.A0V(A0Q2);
                C16617UyD uyD = C16617UyD.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                if (A0V2.getOptionalEnumField(2, "inline_style", uyD) != null) {
                    A0V2.getOptionalEnumField(2, "inline_style", uyD);
                    if (A0V2.getCoercedIntField(1, "offset") + A0V2.getCoercedIntField(0, "length") > spannableString.length()) {
                        coercedIntField = spannableString.length();
                    } else {
                        coercedIntField = A0V2.getCoercedIntField(1, "offset") + A0V2.getCoercedIntField(0, "length");
                    }
                    spannableString.setSpan(new StrikethroughSpan(), A0V2.getCoercedIntField(1, "offset"), coercedIntField, 17);
                }
            }
            textView.setText(spannableString);
        } else if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else if (i != 0) {
            textView.setText(i);
            textView.setVisibility(0);
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
    }

    public static void A01(TextView textView, String str, int i) {
        int i2 = 0;
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else if (i != 0) {
            textView.setText(i);
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }
}
