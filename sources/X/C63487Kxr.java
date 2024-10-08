package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

/* renamed from: X.Kxr  reason: case insensitive filesystem */
public abstract class C63487Kxr {
    public static final void A00(Context context, Resources resources, TextView textView, MVX mvx, CharSequence charSequence, String str, boolean z) {
        SpannableStringBuilder A0E = C51965G9l.A0E();
        String str2 = str;
        String str3 = str2;
        CharSequence charSequence2 = charSequence;
        boolean z2 = z;
        if (z) {
            str3 = charSequence2;
        }
        A0E.append(str3);
        int length = A0E.length();
        int i = 2131956362;
        if (z) {
            i = 2131954762;
        }
        A0E.append(resources.getString(i));
        A0E.setSpan(new C61919KRo(context, resources, textView, mvx, charSequence2, str2, DbV.A01(context), z2), length, A0E.length(), 33);
        textView.setText(A0E);
    }
}
