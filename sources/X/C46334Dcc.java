package X;

import android.text.SpannableStringBuilder;
import android.widget.TextView;

/* renamed from: X.Dcc  reason: case insensitive filesystem */
public abstract class C46334Dcc {
    public static final void A00(TextView textView, C61066Jw4 jw4, String str, boolean z) {
        boolean A1Z = AnonymousClass7TG.A1Z(textView, str);
        SpannableStringBuilder A0C = DbS.A0C(str);
        if (z) {
            C244273av.A08(AnonymousClass7TE.A0S(textView), A0C, A1Z);
        }
        if (jw4 != null) {
            F5q.A01(AnonymousClass7TE.A0S(textView), A0C, A1Z, !z, jw4.A02);
            textView.getViewTreeObserver().addOnPreDrawListener(new C50122FPm(textView, jw4, str));
        }
        textView.setText(A0C);
    }
}
