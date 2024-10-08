package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette;
import java.util.List;

public final class A9X {
    public float A00;
    public final float A01;
    public final Paint A02;
    public final Paint A03;
    public final RectF A04;
    public final RectF A05;
    public final RectF A06;
    public final AnonymousClass8BU A07;
    public final boolean A08;
    public final int A09;
    public final int A0A;
    public final /* synthetic */ ColorPalette A0B;

    public A9X(AnonymousClass8BU r25, ColorPalette colorPalette, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, boolean z, boolean z2) {
        float width;
        RectF rectF;
        ColorPalette colorPalette2 = colorPalette;
        this.A0B = colorPalette2;
        this.A08 = z;
        RectF rectF2 = new RectF(f, 0.0f, f2, f3);
        this.A04 = rectF2;
        float f8 = f4;
        float f9 = f5;
        float f10 = f6;
        float f11 = f7;
        RectF rectF3 = new RectF(f8, f9, f10, f11);
        this.A06 = rectF3;
        if (z2) {
            width = (float) colorPalette2.getContext().getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
        } else {
            width = rectF3.width() / 2.0f;
        }
        this.A01 = width;
        float f12 = colorPalette2.A02 / 2.0f;
        rectF3.inset(f12, f12);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A02 = A0V;
        AnonymousClass7TE.A1Q(A0V);
        AnonymousClass8BU r10 = r25;
        List list = r10.A02;
        if (list.isEmpty()) {
            A0V.setColor(r10.A00);
        } else {
            float f13 = (f5 + f7) / 2.0f;
            float f14 = (f4 + f6) / 2.0f;
            switch (C17140VJp.A00[r10.A01.ordinal()]) {
                case 1:
                    rectF = new RectF(f14, f9, f14, f11);
                    break;
                case 2:
                    rectF = new RectF(f10, f9, f8, f11);
                    break;
                case 3:
                    rectF = new RectF(f10, f13, f8, f13);
                    break;
                case 4:
                    rectF = new RectF(f10, f11, f8, f9);
                    break;
                case 5:
                    rectF = new RectF(f14, f11, f14, f9);
                    break;
                case 6:
                    rectF = new RectF(f8, f11, f8, f11);
                    break;
                case 7:
                    rectF = new RectF(f8, f13, f10, f13);
                    break;
                case 8:
                    rectF = new RectF(f8, f9, f10, f11);
                    break;
                default:
                    throw AnonymousClass7TE.A1K();
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            float f17 = rectF.right;
            A0V.setShader(new LinearGradient(f15, f16, f17, rectF.bottom, 00k.A0x(list), (float[]) null, Shader.TileMode.REPEAT));
        }
        this.A07 = r10;
        int i3 = i;
        this.A09 = i3;
        int i4 = i2;
        this.A0A = i4;
        this.A05 = new RectF(rectF3);
        this.A00 = width;
        int i5 = r10.A00;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, 0.0f, 0.0f, rectF2.height(), new int[]{ColorPalette.A0L, ColorPalette.A0M}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, rectF2.width(), 0.0f, new int[]{i3, i5, i4}, (float[]) null, tileMode), PorterDuff.Mode.OVERLAY);
        Paint paint = new Paint();
        paint.setShader(composeShader);
        Bitmap A0B2 = AnonymousClass7TF.A0B((int) rectF2.width(), (int) rectF2.height());
        new Canvas(A0B2).drawRect(0.0f, 0.0f, rectF2.width(), rectF2.height(), paint);
        BitmapShader bitmapShader = new BitmapShader(A0B2, tileMode, Shader.TileMode.REPEAT);
        Matrix A0U = AnonymousClass7TE.A0U();
        bitmapShader.getLocalMatrix(A0U);
        A0U.setTranslate(rectF2.left, 0.0f);
        bitmapShader.setLocalMatrix(A0U);
        Paint paint2 = new Paint();
        this.A03 = paint2;
        paint2.setShader(bitmapShader);
    }

    public final int A00(float f, float f2) {
        float width;
        int i;
        if (this.A0B.A06 == AnonymousClass8BW.SINGLE_COLOR) {
            return this.A07.A00;
        }
        RectF rectF = this.A04;
        if (f < rectF.centerX()) {
            width = (f - rectF.left) / (rectF.width() / 2.0f);
            i = this.A09;
        } else {
            width = (rectF.right - f) / (rectF.width() / 2.0f);
            i = this.A0A;
        }
        int A002 = A1X.A00(width, i, this.A07.A00);
        int A003 = A1X.A00((f2 - rectF.top) / rectF.height(), ColorPalette.A0L, ColorPalette.A0M);
        int red = Color.red(A002);
        int green = Color.green(A002);
        int blue = Color.blue(A002);
        return Color.rgb(0nH.A09(Color.red(A003), red), 0nH.A09(Color.green(A003), green), 0nH.A09(Color.blue(A003), blue));
    }

    public final boolean A01(float f, float f2) {
        RectF rectF = this.A05;
        if (f < rectF.left || f > rectF.right || f2 < rectF.top || f2 > rectF.bottom) {
            return false;
        }
        return true;
    }
}
