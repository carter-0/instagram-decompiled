package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.Vqh  reason: case insensitive filesystem */
public abstract class C18381Vqh {
    public static final Layout.Alignment A00 = Layout.Alignment.ALIGN_NORMAL;

    public static StaticLayout A00(Layout.Alignment alignment, TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        CharSequence charSequence2 = charSequence;
        Layout.Alignment alignment2 = alignment;
        TextPaint textPaint2 = textPaint;
        int i3 = i;
        int i4 = i2;
        if (i != -1) {
            CharSequence A01 = C252993q2.A01(new 0rN(alignment2, textPaint2, (String) null, 0.0f, 1.0f, i4, false), "", charSequence2, "…", i3, false);
            0qQ.A07(A01);
            if (!A01.equals(charSequence2)) {
                charSequence2 = TextUtils.concat(new CharSequence[]{A01, "…"});
            }
        }
        return new StaticLayout(charSequence2, textPaint2, i4, alignment2, 1.0f, 0.0f, false);
    }
}
