package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import java.util.regex.Pattern;

/* renamed from: X.Ern  reason: case insensitive filesystem */
public abstract class C49244Ern {
    public static final void A00(Context context, C49531ExD exD, String str) {
        String A0c = DbY.A0c(context, str, 2131974800);
        int A08 = 00l.A08(A0c, str, 0, false);
        SpannableString spannableString = new SpannableString(A0c);
        StyleSpan styleSpan = new StyleSpan(1);
        Pattern pattern = 0mp.A01;
        spannableString.setSpan(styleSpan, A08, str.length() + A08, 33);
        exD.A01.setText(spannableString);
    }
}
