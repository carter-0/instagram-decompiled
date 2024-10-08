package X;

import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: X.W1r  reason: case insensitive filesystem */
public abstract class C18789W1r {
    public static final int A00(Typeface typeface, float f, int i, int i2) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(f);
        return ((int) ((float) Math.floor((double) (((float) i) / textPaint.measureText("n"))))) * i2;
    }

    public static final int A01(C306576Mr r1, int i) {
        0qQ.A0B(r1, 0);
        if (r1 == C306576Mr.INVERTED) {
            return 0nH.A04(i);
        }
        return i;
    }

    public static final int A02(C306576Mr r3, Integer num, int i) {
        0qQ.A0B(r3, 0);
        int A04 = 0nH.A04(i);
        int ordinal = r3.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 || num == null) {
                return A04;
            }
        } else if (num == null) {
            return i;
        }
        return num.intValue();
    }

    public static final Integer A03(C306576Mr r1, int i) {
        int A02 = DbU.A02(r1, 0);
        if (A02 == 0) {
            return null;
        }
        if (A02 != 1) {
            return Integer.valueOf(i);
        }
        return Integer.valueOf(0nH.A04(i));
    }

    public static final Integer A04(C306576Mr r1, int i) {
        int A02 = DbU.A02(r1, 0);
        if (A02 == 0) {
            return Integer.valueOf(0nH.A04(i));
        }
        if (A02 != 1) {
            return null;
        }
        return Integer.valueOf(i);
    }
}
