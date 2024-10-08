package X;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import java.util.regex.Pattern;

/* renamed from: X.7AV  reason: invalid class name */
public abstract class AnonymousClass7AV {
    public static final SpannableStringBuilder A00(Uri uri, String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(uri, 2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        A05(spannableStringBuilder, new C46678Dj7(uri), str);
        return spannableStringBuilder;
    }

    public static final void A01(Uri uri, TextView textView, String str, String str2) {
        0qQ.A0B(textView, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(uri, 3);
        textView.setText(A00(uri, str, str2));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    public static final void A02(SpannableStringBuilder spannableStringBuilder, CharacterStyle characterStyle, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(spannableStringBuilder, 1);
        String obj = spannableStringBuilder.toString();
        0qQ.A07(obj);
        int A08 = 00l.A08(obj, str, 0, false);
        if (A08 != -1) {
            Pattern pattern = 0mp.A00;
            spannableStringBuilder.setSpan(characterStyle, A08, str.length() + A08, 33);
        }
    }

    public static final void A03(SpannableStringBuilder spannableStringBuilder, CharacterStyle characterStyle, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(spannableStringBuilder, 1);
        String obj = spannableStringBuilder.toString();
        0qQ.A07(obj);
        int A07 = 00l.A07(obj, str, obj.length() - 1);
        if (A07 != -1) {
            Pattern pattern = 0mp.A00;
            spannableStringBuilder.setSpan(characterStyle, A07, str.length() + A07, 33);
        }
    }

    public static final void A04(SpannableStringBuilder spannableStringBuilder, ClickableSpan clickableSpan, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(spannableStringBuilder, 1);
        A02(spannableStringBuilder, clickableSpan, str);
    }

    public static final void A05(SpannableStringBuilder spannableStringBuilder, ClickableSpan clickableSpan, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(spannableStringBuilder, 1);
        A03(spannableStringBuilder, clickableSpan, str);
    }

    public static final void A07(ClickableSpan clickableSpan, TextView textView, String str, String str2) {
        0qQ.A0B(textView, 0);
        0qQ.A0B(str, 1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        A05(spannableStringBuilder, clickableSpan, str);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    public static final void A06(SpannableStringBuilder spannableStringBuilder, ClickableSpan clickableSpan, String str, int i) {
        String obj = spannableStringBuilder.toString();
        0qQ.A07(obj);
        int A07 = 00l.A07(obj, str, obj.length() - 1);
        if (A07 != -1) {
            Pattern pattern = 0mp.A00;
            int length = str.length() + A07;
            spannableStringBuilder.setSpan(clickableSpan, A07, length, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), A07, length, 33);
        }
    }
}
