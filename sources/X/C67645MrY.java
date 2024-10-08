package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.android.R;

/* renamed from: X.MrY  reason: case insensitive filesystem */
public final class C67645MrY extends Drawable {
    public float A00;
    public boolean A01;
    public boolean A02;
    public float A03;
    public final Paint A04;
    public final RectF A05 = AnonymousClass7TE.A0Y();
    public final float[] A06;
    public final int[] A07;

    public C67645MrY(Context context) {
        Paint A0C = JTO.A0C();
        AnonymousClass7TE.A1N(context, A0C, R.color.grey_2);
        this.A04 = A0C;
        int[] iArr = new int[5];
        C267014am.A03(context, (AttributeSet) null, iArr, R.style.GradientPatternStyle);
        this.A07 = iArr;
        this.A06 = new float[]{0.0f, 0.27f, 0.51f, 0.75f, 1.0f};
        this.A00 = 1.0f;
        this.A01 = true;
        this.A02 = true;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = this.A05;
        float f = this.A03;
        canvas.drawRoundRect(rectF, f, f, this.A04);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0063, code lost:
        if (r11.A02 != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C67645MrY r11) {
        /*
            int r0 = X.JTP.A06(r11)
            float r4 = (float) r0
            float r0 = r11.A00
            float r4 = r4 * r0
            boolean r1 = r11.A01
            r0 = 1059816735(0x3f2b851f, float:0.67)
            if (r1 == 0) goto L_0x0011
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0011:
            float r4 = r4 * r0
            android.graphics.Rect r0 = r11.getBounds()
            int r0 = r0.left
            float r3 = (float) r0
            android.graphics.Rect r0 = r11.getBounds()
            int r0 = r0.right
            float r2 = (float) r0
            android.graphics.Rect r0 = r11.getBounds()
            float r7 = r0.exactCenterY()
            r1 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r1
            float r7 = r7 - r4
            android.graphics.Rect r0 = r11.getBounds()
            float r5 = r0.exactCenterY()
            float r5 = r5 + r4
            float r0 = r2 - r3
            float r0 = r0 / r1
            r11.A03 = r0
            android.graphics.RectF r0 = r11.A05
            r0.set(r3, r7, r2, r5)
            android.graphics.Paint r2 = r11.A04
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x006e
            float r4 = X.C66581MXm.A01(r11)
            float r6 = X.C66581MXm.A01(r11)
            int[] r8 = r11.A07
            float[] r9 = r11.A06
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x0058:
            r2.setShader(r3)
            boolean r0 = r11.A01
            if (r0 != 0) goto L_0x0065
            boolean r1 = r11.A02
            r0 = 76
            if (r1 == 0) goto L_0x0067
        L_0x0065:
            r0 = 255(0xff, float:3.57E-43)
        L_0x0067:
            r2.setAlpha(r0)
            r11.invalidateSelf()
            return
        L_0x006e:
            r3 = 0
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67645MrY.A00(X.MrY):void");
    }

    public final void onBoundsChange(Rect rect) {
        A00(this);
    }
}
