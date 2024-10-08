package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: X.9Xc  reason: invalid class name and case insensitive filesystem */
public final class C380219Xc extends CharacterStyle implements UpdateAppearance {
    public Shader A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Shader.TileMode A05 = Shader.TileMode.CLAMP;
    public final Integer A06;
    public final float[] A07;
    public final int[] A08;

    public C380219Xc(Integer num, float[] fArr, int[] iArr, int i, int i2, int i3, int i4) {
        0qQ.A0B(iArr, 1);
        this.A08 = iArr;
        this.A07 = fArr;
        this.A02 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A01 = i4;
        this.A06 = num;
    }

    public final void updateDrawState(TextPaint textPaint) {
        float f;
        float f2;
        float f3;
        int i;
        0qQ.A0B(textPaint, 0);
        Shader shader = this.A00;
        if (shader == null) {
            int intValue = this.A06.intValue();
            if (intValue == 1) {
                f3 = (float) this.A02;
                f2 = (float) this.A04;
                f = (float) this.A03;
                i = this.A01;
                shader = new LinearGradient(f3, f2, f, (float) i, this.A08, this.A07, this.A05);
            } else if (intValue == 2) {
                f3 = (float) this.A02;
                f2 = (float) this.A01;
                f = (float) this.A03;
                i = this.A04;
                shader = new LinearGradient(f3, f2, f, (float) i, this.A08, this.A07, this.A05);
            } else if (intValue != 0) {
                shader = null;
            } else {
                shader = new LinearGradient((float) this.A02, 0.0f, (float) this.A03, 0.0f, this.A08, this.A07, this.A05);
            }
            this.A00 = shader;
        }
        textPaint.setShader(shader);
    }
}
