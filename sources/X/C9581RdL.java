package X;

import android.content.Context;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.RdL  reason: case insensitive filesystem */
public abstract class C9581RdL {
    public static final void A00(TextView textView, TextView textView2) {
        AnonymousClass7TG.A1N(textView, textView2);
        Context A0S = AnonymousClass7TE.A0S(textView);
        C11408SSf.A04(A0S, textView, R.attr.sc_primary_text);
        textView.setTextSize(0, C11408SSf.A00(A0S, R.attr.selfie_title_size));
        Context A0S2 = AnonymousClass7TE.A0S(textView2);
        C11408SSf.A04(A0S2, textView2, R.attr.sc_secondary_text);
        textView2.setTextSize(0, C11408SSf.A00(A0S2, R.attr.selfie_subtitle_size));
    }
}
