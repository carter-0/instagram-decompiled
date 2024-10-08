package X;

import android.graphics.Paint;
import android.os.Build;
import android.util.TypedValue;
import android.widget.TextView;

public abstract class W0V {
    public static void A00(TextView textView) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new NullPointerException("getPrecomputedText");
        }
        new C18045VkT(textView.getTextMetricsParams());
        throw new NullPointerException("getParams");
    }

    public static void A01(TextView textView, float f, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            C16760V4t.A00(textView, f, i);
        } else {
            A03(textView, Math.round(TypedValue.applyDimension(i, f, C13988Tno.A0F(textView))));
        }
    }

    public static void A02(TextView textView, int i) {
        int i2;
        02V.A00(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void A03(TextView textView, int i) {
        02V.A00(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }
}
