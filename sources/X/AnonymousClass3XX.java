package X;

import android.view.View;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.3XX  reason: invalid class name */
public abstract class AnonymousClass3XX {
    public static final int A00 = View.MeasureSpec.makeMeasureSpec(0, 0);

    public static final String A00(int i) {
        String str;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            str = "AT_MOST";
        } else if (mode == 1073741824) {
            str = "EXACTLY";
        } else if (mode == A00) {
            str = "UNSPECIFIED";
        } else {
            str = "INVALID";
        }
        String format = String.format(Locale.US, "[%d, %s]", Arrays.copyOf(new Object[]{Integer.valueOf(size), str}, 2));
        0qQ.A07(format);
        return format;
    }
}
