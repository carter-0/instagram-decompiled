package X;

import android.text.Layout;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.6M0  reason: invalid class name */
public abstract class AnonymousClass6M0 {
    public static final int A00(Layout layout) {
        if (layout == null || layout.getLineCount() == 0) {
            return 0;
        }
        int i = Integer.MAX_VALUE;
        int lineCount = layout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            try {
                i = Math.min(i, (int) layout.getLineLeft(i2));
            } catch (IndexOutOfBoundsException unused) {
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("IndexOutOfBoundsException index=%d,layout.getLineCount()=%d", Integer.valueOf(i2), Integer.valueOf(layout.getLineCount()));
                0qQ.A07(formatStrLocaleSafe);
                0wb.A03("LayoutMeasureUtil", formatStrLocaleSafe);
            }
        }
        return i;
    }

    public static final int A01(Layout layout) {
        if (layout.getLineCount() == 0) {
            return 0;
        }
        int lineCount = layout.getLineCount();
        int i = 0;
        for (int i2 = 0; i2 < lineCount; i2++) {
            i = Math.max(i, (int) layout.getLineRight(i2));
        }
        return i;
    }

    public static final int A02(Layout layout) {
        if (layout == null) {
            return 0;
        }
        int lineCount = layout.getLineCount();
        int i = 0;
        for (int i2 = 0; i2 < lineCount; i2++) {
            i = Math.max(i, Math.round(layout.getLineRight(i2) - layout.getLineLeft(i2)));
        }
        return i;
    }
}
