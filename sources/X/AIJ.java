package X;

import android.content.Context;
import android.text.TextPaint;
import com.instagram.android.R;

public final class AIJ {
    public static final AIJ A00 = new Object();

    public static final float A00(TextPaint textPaint, AIJ aij, String str, float f, float f2, float f3, int i) {
        float f4;
        TextPaint textPaint2 = textPaint;
        float f5 = f3;
        float textSize = textPaint.getTextSize();
        String str2 = str;
        float measureText = textPaint.measureText(str);
        textPaint.setTextSize(f);
        float measureText2 = textPaint.measureText(str);
        int i2 = i;
        float f6 = (float) i;
        float f7 = f2;
        if (measureText2 > f6) {
            if (measureText <= f6) {
                return textSize;
            }
            f4 = textSize - f2;
        } else if (f >= f3) {
            return f5;
        } else {
            f4 = textSize + f2;
        }
        return A00(textPaint2, aij, str2, f4, f7, f5, i2);
    }

    public static final int A01(Context context, String str) {
        Object valueOf;
        0qQ.A0B(str, 1);
        boolean equals = str.equals("@");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.group_mention_sticker_title_text_size);
        if (equals) {
            valueOf = Float.valueOf(((float) dimensionPixelSize) / 2.3f);
        } else {
            valueOf = Integer.valueOf(dimensionPixelSize / 3);
        }
        return AnonymousClass7TE.A0M(valueOf);
    }
}
