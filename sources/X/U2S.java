package X;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class U2S extends MetricAffectingSpan implements C20838X0n {
    public final int A00;
    public final int A01;
    public final AssetManager A02;
    public final String A03;
    public final String A04;

    public U2S(AssetManager assetManager, String str, String str2, int i, int i2) {
        0qQ.A0B(assetManager, 5);
        this.A00 = i;
        this.A01 = i2;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = assetManager;
    }

    public static void A00(Paint paint, U2S u2s) {
        0qQ.A0B(paint, 0);
        int i = u2s.A00;
        int i2 = u2s.A01;
        String str = u2s.A04;
        Typeface A022 = C18788W1q.A02(u2s.A02, paint.getTypeface(), u2s.A03, i, i2);
        0qQ.A07(A022);
        paint.setFontFeatureSettings(str);
        paint.setTypeface(A022);
        paint.setSubpixelText(true);
    }

    public final void updateDrawState(TextPaint textPaint) {
        A00(textPaint, this);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        A00(textPaint, this);
    }
}
