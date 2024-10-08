package X;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.5iD  reason: invalid class name and case insensitive filesystem */
public abstract class C291995iD {
    public static final BoringLayout A01(BoringLayout.Metrics metrics, Layout.Alignment alignment, TextPaint textPaint, TextUtils.TruncateAt truncateAt, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (i >= 0) {
            int i4 = i2;
            if (i2 >= 0) {
                BoringLayout.Metrics metrics2 = metrics;
                Layout.Alignment alignment2 = alignment;
                TextPaint textPaint2 = textPaint;
                TextUtils.TruncateAt truncateAt2 = truncateAt;
                CharSequence charSequence2 = charSequence;
                if (Build.VERSION.SDK_INT >= 33) {
                    return C292005iE.A01(metrics, alignment, textPaint, truncateAt, charSequence, i, i2);
                }
                return new BoringLayout(charSequence2, textPaint2, i3, alignment2, 1.0f, 0.0f, metrics2, false, truncateAt2, i4);
            }
            throw new IllegalArgumentException("negative ellipsized width");
        }
        throw new IllegalArgumentException("negative width");
    }

    public static final BoringLayout.Metrics A00(TextDirectionHeuristic textDirectionHeuristic, TextPaint textPaint, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C292005iE.A00(textDirectionHeuristic, textPaint, charSequence);
        }
        if (!textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return BoringLayout.isBoring(charSequence, textPaint, (BoringLayout.Metrics) null);
        }
        return null;
    }

    public static final boolean A02(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C292005iE.A02(boringLayout);
        }
        return false;
    }
}
