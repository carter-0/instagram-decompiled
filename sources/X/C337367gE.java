package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: X.7gE  reason: invalid class name and case insensitive filesystem */
public final class C337367gE {
    public static final C337377gF A00;
    public static final C337377gF A01;
    public static final C337367gE A02 = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.7gE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.7gF] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.7gF] */
    static {
        ? obj = new Object();
        obj.A03 = null;
        obj.A05 = null;
        obj.A00 = 0;
        obj.A04 = null;
        obj.A01 = null;
        obj.A02 = null;
        A01 = obj;
        ? obj2 = new Object();
        obj2.A03 = null;
        obj2.A05 = null;
        obj2.A00 = 0;
        obj2.A04 = null;
        obj2.A01 = null;
        obj2.A02 = null;
        A00 = obj2;
    }

    public static final void A00(Typeface typeface, C337377gF r5, int i, int i2) {
        Float f;
        TextPaint textPaint = r5.A05;
        Typeface typeface2 = null;
        if (textPaint != null) {
            f = Float.valueOf(textPaint.density);
        } else {
            f = null;
        }
        float f2 = (float) i2;
        if (0qQ.A0I(f, f2)) {
            if (textPaint != null) {
                typeface2 = textPaint.getTypeface();
            }
            if (0qQ.A0K(typeface2, typeface)) {
                return;
            }
        }
        r5.A03 = new Rect();
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.density = f2;
        textPaint2.setTextAlign(Paint.Align.CENTER);
        textPaint2.setTextSize((float) i);
        textPaint2.setTypeface(typeface);
        r5.A05 = textPaint2;
    }
}
