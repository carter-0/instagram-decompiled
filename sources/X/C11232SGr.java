package X;

import android.text.SpannableString;
import android.widget.TextView;
import com.fbpay.common.LinkableText$makeSpannable$1;
import java.util.List;

/* renamed from: X.SGr  reason: case insensitive filesystem */
public class C11232SGr {
    public final CharSequence A00;
    public final List A01;

    public static void A00(TextView textView, C13612Tde tde, C11232SGr sGr) {
        0qQ.A0B(tde, 0);
        textView.setText(sGr.A01(tde, false));
    }

    public SpannableString A01(C13612Tde tde, boolean z) {
        SpannableString spannableString = new SpannableString(this.A00);
        for (SF9 sf9 : this.A01) {
            int i = sf9.A02;
            if (i >= 0) {
                spannableString.setSpan(new LinkableText$makeSpannable$1(sf9, tde, sf9.A03, z), i, i + sf9.A01, 33);
            }
        }
        return spannableString;
    }

    public C11232SGr(CharSequence charSequence, List list) {
        this.A00 = charSequence;
        this.A01 = list;
    }
}
