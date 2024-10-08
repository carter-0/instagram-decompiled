package X;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.5iE  reason: invalid class name and case insensitive filesystem */
public abstract class C292005iE {
    public static final BoringLayout.Metrics A00(TextDirectionHeuristic textDirectionHeuristic, TextPaint textPaint, CharSequence charSequence) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, (BoringLayout.Metrics) null);
    }

    public static final BoringLayout A01(BoringLayout.Metrics metrics, Layout.Alignment alignment, TextPaint textPaint, TextUtils.TruncateAt truncateAt, CharSequence charSequence, int i, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, false, truncateAt, i2, true);
    }

    public static final boolean A02(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
