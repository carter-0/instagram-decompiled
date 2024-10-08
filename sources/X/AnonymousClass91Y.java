package X;

import android.text.Spannable;
import android.widget.TextView;

/* renamed from: X.91Y  reason: invalid class name */
public abstract class AnonymousClass91Y {
    public static final void A00(TextView textView, C358868bb r7, C306386Ly r8) {
        float f;
        float f2;
        boolean z;
        int i;
        C360708f1 r3 = r7.A04;
        if (r3 == null) {
            return;
        }
        if (textView != null) {
            C358928bh r4 = r7.A05;
            CharSequence text = textView.getText();
            0qQ.A0C(text, "null cannot be cast to non-null type android.text.Spannable");
            Spannable spannable = (Spannable) text;
            boolean A06 = C358948bj.A06(spannable);
            if (r3 instanceof C360788f9) {
                f2 = 1.0f;
            } else if (r3 instanceof C360828fD) {
                f2 = 0.9f;
            } else if (r3 instanceof C360848fF) {
                f2 = 1.4f;
            } else {
                f2 = -1.0f;
            }
            if (A06 || !C358948bj.A05(spannable)) {
                z = false;
                if (A06) {
                    i = (textView.getLineSpacingMultiplier() > -1.0f ? 1 : (textView.getLineSpacingMultiplier() == -1.0f ? 0 : -1));
                }
                if (!z || f2 < 0.0f) {
                    f2 = r4.A01;
                }
                textView.setLineSpacing(0.0f, f2);
            }
            z = true;
            if (textView.getLineSpacingMultiplier() == f2) {
                i = (textView.getLineSpacingMultiplier() > r4.A01 ? 1 : (textView.getLineSpacingMultiplier() == r4.A01 ? 0 : -1));
            }
            f2 = r4.A01;
            textView.setLineSpacing(0.0f, f2);
            if (i == 0) {
                return;
            }
            f2 = r4.A01;
            textView.setLineSpacing(0.0f, f2);
        } else if (r8 != null) {
            C358928bh r42 = r7.A05;
            Spannable spannable2 = r8.A0F;
            0qQ.A07(spannable2);
            if (r3 instanceof C360788f9) {
                f = 1.0f;
            } else if (r3 instanceof C360828fD) {
                f = 0.9f;
            } else if (r3 instanceof C360848fF) {
                f = 1.4f;
            } else {
                f = -1.0f;
            }
            boolean A05 = C358948bj.A05(spannable2);
            if (!A05 || r8.A08().A02 != f || r8.A08().A02 != r42.A01) {
                if (!A05 || f < 0.0f) {
                    f = r42.A01;
                }
                r8.A0B(0.0f, f);
            }
        }
    }
}
