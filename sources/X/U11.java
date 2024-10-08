package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;

public final class U11 extends Drawable {
    public static final PorterDuffXfermode A0D = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
    public static final PorterDuffXfermode A0E = new PorterDuffXfermode(PorterDuff.Mode.DST_OVER);
    public static final PorterDuffXfermode A0F = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
    public static final PorterDuffXfermode A0G = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    public static final int A0H = Color.argb(255, 180, 180, 180);
    public static final int A0I = Color.argb(255, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION);
    public static final int[] A0J;
    public static final int[] A0K;
    public float A00;
    public LinearGradient A01;
    public LinearGradient A02;
    public RadialGradient A03;
    public final Context A04;
    public final Paint A05 = new Paint(3);
    public final Path A06 = new Path();
    public final Drawable A07;
    public final float A08;
    public final float A09;
    public final Path A0A = new Path();
    public final RectF A0B = new RectF();
    public final boolean A0C;

    public final void draw(Canvas canvas) {
        float A022;
        float f;
        float A023;
        float A024;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        int A062 = AnonymousClass7TF.A06(this);
        int A063 = JTP.A06(this);
        Drawable drawable = this.A07;
        float intrinsicWidth = ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
        int A042 = (int) 0nA.A04(this.A04, 12);
        float f2 = (float) A042;
        int i = (int) (f2 / intrinsicWidth);
        float f3 = (float) i;
        float f4 = 0.33333334f * f3;
        float f5 = f3 / -2.0f;
        canvas2.save();
        int i2 = 0;
        while (f5 < ((float) A063)) {
            canvas2.save();
            canvas2.translate(0.0f, f5);
            float f6 = f2 / -2.0f;
            int i3 = 0;
            while (f6 < ((float) A062)) {
                canvas2.save();
                canvas2.translate(f6, 0.0f);
                float f7 = -1.0f;
                if (i3 % 2 == 1) {
                    f7 = 1.0f;
                }
                float f8 = -1.0f;
                if (i2 % 2 == 1) {
                    f8 = 1.0f;
                }
                canvas2.scale(f7, f8, f2 / 2.0f, f3 / 2.0f);
                drawable.setBounds(0, 0, A042, i);
                drawable.draw(canvas2);
                canvas2.restore();
                f6 += f2 + f4;
                i3++;
            }
            i2++;
            f5 += f3 + f4;
            canvas2.restore();
        }
        canvas2.restore();
        float A064 = (float) AnonymousClass7TF.A06(this);
        float A065 = (float) JTP.A06(this);
        Paint paint = this.A05;
        paint.reset();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setXfermode(A0G);
        canvas2.drawRect(getBounds(), paint);
        LinearGradient linearGradient = this.A01;
        if (linearGradient != null) {
            Matrix matrix = new Matrix();
            linearGradient.getLocalMatrix(matrix);
            matrix.reset();
            float f9 = this.A00;
            float f10 = 1.0f - 0.0f;
            float f11 = (4.0f * A064) - 0.0f;
            float f12 = 0.0f;
            if (f10 != 0.0f) {
                f12 = (f9 - 0.0f) / f10;
            }
            matrix.setTranslate((f12 * f11) + 0.0f, 0.0f);
            linearGradient.setLocalMatrix(matrix);
        }
        paint.setShader(this.A01);
        float f13 = this.A00;
        if (f13 <= 0.5f) {
            A022 = 0mi.A02(f13, 0.1f, 0.5f, 190.0f, 0.0f);
        } else {
            A022 = 0mi.A02(f13, 0.5f, 0.9f, 0.0f, 190.0f);
        }
        paint.setAlpha((int) A022);
        paint.setXfermode(A0F);
        canvas2.drawRect(getBounds(), paint);
        paint.setXfermode((Xfermode) null);
        RadialGradient radialGradient = this.A03;
        if (radialGradient != null) {
            Matrix matrix2 = new Matrix();
            radialGradient.getLocalMatrix(matrix2);
            matrix2.reset();
            float f14 = this.A00;
            if (f14 < 0.5f) {
                A023 = 0mi.A02(f14, 0.0f, 0.5f, 2.0f, 1.0f);
            } else {
                A023 = 0mi.A02(f14, 0.5f, 1.0f, 1.0f, 2.0f);
            }
            float f15 = A064 / 2.0f;
            matrix2.postScale(A023, A023, f15, A065 / 2.0f);
            float f16 = this.A00;
            if (f16 < 0.5f) {
                A024 = 0mi.A02(f16, 0.0f, 0.5f, A064 / -2.0f, 0.0f);
            } else {
                A024 = 0mi.A02(f16, 0.5f, 1.0f, 0.0f, f15);
            }
            matrix2.postTranslate(A024, 0.0f);
            radialGradient.setLocalMatrix(matrix2);
        }
        paint.setShader(this.A03);
        paint.setAlpha(255);
        canvas2.drawRect(getBounds(), paint);
        float A066 = (float) AnonymousClass7TF.A06(this);
        float A067 = (float) JTP.A06(this);
        paint.reset();
        paint.setAlpha(255);
        paint.setStyle(style);
        Path path = this.A06;
        path.toggleInverseFillType();
        paint.setColor(-16777216);
        paint.setXfermode(A0D);
        canvas2.drawPath(path, paint);
        path.toggleInverseFillType();
        LinearGradient linearGradient2 = this.A02;
        if (linearGradient2 != null) {
            Matrix matrix3 = new Matrix();
            linearGradient2.getLocalMatrix(matrix3);
            matrix3.reset();
            float f17 = this.A00;
            if (f17 <= 0.5f) {
                float f18 = 0.0f - 0.5f;
                float f19 = (-A066) - A066;
                float f20 = 0.0f;
                if (f18 != 0.0f) {
                    f20 = (f17 - 0.5f) / f18;
                }
                f = (f20 * f19) + A066;
            } else {
                matrix3.setScale(-1.0f, 1.0f, A066 / 2.0f, A067 / 2.0f);
                float f21 = this.A00;
                float f22 = -A066;
                float f23 = 1.0f - 0.5f;
                float f24 = A066 - f22;
                float f25 = 0.0f;
                if (f23 != 0.0f) {
                    f25 = (f21 - 0.5f) / f23;
                }
                f = (f25 * f24) + f22;
            }
            matrix3.postTranslate(f, 0.0f);
            linearGradient2.setLocalMatrix(matrix3);
        }
        paint.setShader(this.A02);
        paint.setXfermode(A0E);
        canvas2.drawPath(path, paint);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        int[] iArr;
        Rect rect2 = rect;
        0qQ.A0B(rect2, 0);
        float f = (float) rect2.left;
        float f2 = (float) rect2.top;
        float f3 = (float) rect2.right;
        float f4 = (float) rect2.bottom;
        float width = (float) rect2.width();
        float height = (float) rect2.height();
        float f5 = height / 2.0f;
        int[] A0x = 00k.A0x(0sr.A1P(new Integer[]{Integer.valueOf(A0I), Integer.valueOf(A0H)}));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A02 = new LinearGradient(0.0f, f5, width, f5, A0x, (float[]) null, tileMode);
        float f6 = width * 2.0f;
        if (this.A0C) {
            iArr = A0J;
        } else {
            iArr = A0K;
        }
        this.A01 = new LinearGradient(0.0f, 0.0f, f6, height, iArr, (float[]) null, Shader.TileMode.REPEAT);
        float f7 = width / 2.0f;
        this.A03 = new RadialGradient(f7, f5, f7, 00k.A0x(0sr.A1P(new Integer[]{C51967G9n.A0j(), 0})), (float[]) null, tileMode);
        RectF rectF = this.A0B;
        rectF.set(f, f2, f3, f4);
        Path path = this.A06;
        float f8 = this.A08;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f8, f8, direction);
        Path path2 = this.A0A;
        float f9 = f + f7;
        float f10 = this.A09;
        path2.addCircle(f9, f2, f10, direction);
        path2.addCircle(f9, f4, f10, direction);
        path.op(path2, Path.Op.DIFFERENCE);
        path.close();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    static {
        int argb = Color.argb(255, 255, 223, 53);
        int argb2 = Color.argb(255, 255, 160, 73);
        int argb3 = Color.argb(255, 255, 122, 177);
        int argb4 = Color.argb(255, 245, 133, 255);
        int argb5 = Color.argb(255, 184, 151, 255);
        Integer valueOf = Integer.valueOf(argb);
        Integer valueOf2 = Integer.valueOf(argb2);
        Integer valueOf3 = Integer.valueOf(argb3);
        Integer valueOf4 = Integer.valueOf(argb4);
        Integer valueOf5 = Integer.valueOf(argb5);
        A0K = 00k.A0x(0sr.A1P(new Integer[]{valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf4, valueOf3, valueOf2, valueOf, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf4, valueOf3, valueOf2, valueOf}));
        int argb6 = Color.argb(255, 116, 159, 255);
        int argb7 = Color.argb(255, 75, 236, 255);
        int argb8 = Color.argb(255, 255, 156, 61);
        int argb9 = Color.argb(255, 246, 255, 110);
        Integer valueOf6 = Integer.valueOf(argb6);
        Integer valueOf7 = Integer.valueOf(argb8);
        Integer valueOf8 = Integer.valueOf(argb9);
        Integer valueOf9 = Integer.valueOf(argb7);
        A0J = 00k.A0x(0sr.A1P(new Integer[]{valueOf6, valueOf7, valueOf8, valueOf7, valueOf6, valueOf9, valueOf6, valueOf7, valueOf8, valueOf7, valueOf6, valueOf9, valueOf6, valueOf7, valueOf8, valueOf7, valueOf6, valueOf9, valueOf6}));
    }

    public U11(Context context, Drawable drawable, boolean z) {
        this.A04 = context;
        this.A07 = drawable;
        this.A0C = z;
        this.A08 = 0nA.A04(context, 12);
        this.A09 = 0nA.A04(context, 25);
    }
}
