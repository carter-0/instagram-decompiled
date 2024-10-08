package X;

import android.os.Build;
import android.text.TextPaint;

/* renamed from: X.V4o  reason: case insensitive filesystem */
public abstract class C16755V4o {
    public static final C18930WDi A00(TextPaint textPaint, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new U6i(charSequence, textPaint);
        }
        return new U6h(charSequence);
    }
}
