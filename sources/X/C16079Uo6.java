package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Uo6  reason: case insensitive filesystem */
public final class C16079Uo6 extends U0Z implements AnonymousClass1MK, C20858X1k {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04 = 255;
    public long A05 = 0;
    public long A06 = -1;
    public long A07 = -1;
    public Bitmap A08;
    public Bitmap A09;
    public BitmapShader A0A;
    public ImageUrl A0B;
    public U0Z A0C;
    public Integer A0D = AnonymousClass05K.A01;
    public boolean A0E = true;
    public boolean A0F = true;
    public int A0G;
    public final float A0H;
    public final int A0I;
    public final int A0J;
    public final Context A0K;
    public final Paint A0L;
    public final Paint A0M;
    public final Path A0N;
    public final Rect A0O;
    public final RectF A0P;
    public final AccelerateDecelerateInterpolator A0Q = new AccelerateDecelerateInterpolator();
    public final GradientSpinner A0R;
    public final boolean A0S;
    public final float A0T;
    public final float A0U;
    public final Matrix A0V;
    public final Paint A0W;
    public final Paint A0X;
    public final RectF A0Y;
    public final RectF A0Z = new RectF();
    public final List A0a = new ArrayList();
    public final boolean A0b;
    public final boolean A0c;

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public static float A00(Context context, float f) {
        return (f / 1.0f) + ((float) Math.round(0nA.A00(context, C14504TxQ.A00.height()))) + (0nA.A00(context, 1.5f) * 2.0f) + (0nA.A04(context, 8) * 2.0f);
    }

    public static void A01(C16079Uo6 uo6) {
        int i;
        float f = uo6.A03;
        float f2 = uo6.A0H * 2.0f;
        float f3 = f - f2;
        if (uo6.A0F) {
            i = Math.round(0nA.A00(uo6.A0K, C14504TxQ.A00.height()));
        } else {
            i = 0;
        }
        uo6.A0G = i;
        float f4 = uo6.A0U * 2.0f;
        float f5 = ((f3 - f4) / uo6.A0T) + ((float) i) + f4 + f2;
        uo6.A00 = f5;
        uo6.setBounds(0, 0, Math.round(uo6.A03), Math.round(f5));
        uo6.invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        float A002;
        float f;
        int i;
        float A012;
        int i2;
        if (this.A08 != null) {
            Paint paint = this.A0X;
            paint.setColor(-1);
            Paint paint2 = this.A0W;
            paint2.setColor(-1);
            Paint paint3 = this.A0L;
            paint3.setColor(-1);
            long j = this.A05;
            if (j == 0) {
                A002 = 0.0f;
            } else {
                long min = Math.min(System.currentTimeMillis() - this.A07, j);
                if (min >= j) {
                    this.A07 = -1;
                }
                A002 = 0mi.A00(this.A0Q.getInterpolation(((float) min) / ((float) j)), 0.0f, 1.0f);
            }
            Rect bounds = getBounds();
            int A022 = A02();
            paint.setAlpha(A022);
            paint2.setAlpha(A022);
            paint3.setAlpha(A022);
            GradientSpinner gradientSpinner = this.A0R;
            if (A022 < 255) {
                gradientSpinner.A05 = A022;
            } else {
                gradientSpinner.A05 = -1;
            }
            RectF rectF = this.A0P;
            float width = rectF.width();
            float height = rectF.height();
            float max = Math.max(width / ((float) this.A08.getWidth()), height / ((float) this.A08.getHeight()));
            Matrix matrix = this.A0V;
            matrix.setScale(max, max);
            matrix.postTranslate((width - (((float) this.A08.getWidth()) * max)) / 2.0f, (height - (((float) this.A08.getHeight()) * max)) / 2.0f);
            BitmapShader bitmapShader = this.A0A;
            bitmapShader.getClass();
            bitmapShader.setLocalMatrix(matrix);
            Rect bounds2 = getBounds();
            if (this.A09 == null) {
                Bitmap createBitmap = Bitmap.createBitmap(bounds2.width(), bounds2.height(), Bitmap.Config.ARGB_8888);
                this.A09 = createBitmap;
                new Canvas(createBitmap).drawPath(this.A0N, this.A0M);
            }
            float f2 = this.A0H * 2.0f;
            Bitmap bitmap = this.A09;
            bitmap.getClass();
            float width2 = (((float) bounds.width()) - f2) / (((float) bitmap.getWidth()) - f2);
            Canvas canvas2 = canvas;
            canvas2.save();
            canvas2.scale(width2, width2, rectF.left, rectF.top);
            Bitmap bitmap2 = this.A09;
            bitmap2.getClass();
            canvas2.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
            canvas2.restore();
            canvas2.drawPath(this.A0N, paint);
            canvas2.save();
            float f3 = rectF.left;
            float f4 = rectF.top;
            rectF.offsetTo(0.0f, 0.0f);
            canvas2.translate(f3, f4);
            canvas2.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint2);
            if (this.A0F) {
                C14504TxQ.A00(canvas2, this.A0Z, -1);
            }
            float f5 = this.A0U;
            float width3 = (rectF.width() / 2.0f) - (f5 * 1.0f);
            if (!this.A0b || this.A0S) {
                canvas2.drawCircle(rectF.centerX(), rectF.centerY(), width3, paint3);
            } else {
                canvas2.save();
                canvas2.translate(f5, f5);
                gradientSpinner.draw(canvas2);
                canvas2.restore();
                canvas2.drawCircle(rectF.centerX(), rectF.centerY(), ((rectF.width() / 2.0f) - (f5 * 2.5f)) - gradientSpinner.A00, paint3);
            }
            if (this.A0c) {
                U0Z u0z = this.A0C;
                if (u0z == null) {
                    u0z = new C16077Uo4(this.A0K);
                    this.A0C = u0z;
                }
                u0z.getClass();
                float centerX = rectF.centerX();
                double radians = Math.toRadians(45.0d);
                float round = centerX + ((float) Math.round((Math.cos(radians) * ((double) rectF.width())) / 2.0d));
                float centerY = rectF.centerY() - ((float) Math.round((Math.sin(radians) * ((double) rectF.width())) / 2.0d));
                int i3 = (A002 > 0.0f ? 1 : (A002 == 0.0f ? 0 : -1));
                Integer num = this.A0D;
                Integer num2 = AnonymousClass05K.A00;
                if (i3 == 0) {
                    if (num == num2) {
                        i2 = this.A0I;
                    } else {
                        i2 = this.A0J;
                    }
                    A012 = (float) i2;
                } else {
                    if (num == num2) {
                        f = (float) this.A0J;
                        i = this.A0I;
                    } else {
                        f = (float) this.A0I;
                        i = this.A0J;
                    }
                    A012 = 0mi.A01(A002, 0.0f, 1.0f, f, (float) i);
                }
                Rect rect = this.A0O;
                float f6 = A012 / 2.0f;
                rect.set(Math.round(round - f6), Math.round(centerY - f6), Math.round(round + f6), Math.round(centerY + f6));
                u0z.setBounds(rect);
                u0z.draw(canvas2);
            }
            rectF.offsetTo(f3, f4);
            canvas2.restore();
            if (A02() < 255) {
                invalidateSelf();
            }
            if (this.A05 != 0 && this.A07 != -1) {
                this.A03 = 0mi.A01(A002, 0.0f, 1.0f, this.A01, this.A02);
                A01(this);
            }
        }
    }

    public final int getIntrinsicHeight() {
        return Math.round(this.A00);
    }

    public final int getIntrinsicWidth() {
        return Math.round(this.A03);
    }

    public final void onBoundsChange(Rect rect) {
        RectF rectF = this.A0Y;
        rectF.set(rect);
        float f = this.A0H;
        rectF.inset(f, f);
        RectF rectF2 = this.A0P;
        rectF2.set(rectF);
        rectF2.bottom -= (float) this.A0G;
        rectF2.set(rectF2);
        RectF rectF3 = C14504TxQ.A00;
        float width = rectF3.width() * 3.0f;
        float width2 = (rectF2.width() / 2.0f) - (width / 2.0f);
        float height = rectF2.height();
        this.A0Z.set(width2, height, width + width2, (rectF3.height() * 3.0f) + height);
        Path path = this.A0N;
        path.reset();
        path.addCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, Path.Direction.CW);
        GradientSpinner gradientSpinner = this.A0R;
        float width3 = rectF2.width();
        float f2 = this.A0U;
        float f3 = f2 * 2.0f;
        C13988Tno.A11(gradientSpinner, Math.round(rectF2.height() - f3), SN3.MAX_SIGNED_POWER_OF_TWO, View.MeasureSpec.makeMeasureSpec(Math.round(width3 - f3), SN3.MAX_SIGNED_POWER_OF_TWO));
        int round = Math.round(f2);
        gradientSpinner.layout(round, round, Math.round(rectF2.width() - f2), Math.round(rectF2.height() - f2));
    }

    public final void setAlpha(int i) {
        this.A04 = i;
        this.A0L.setAlpha(i);
        this.A0X.setAlpha(i);
        this.A0W.setAlpha(i);
        this.A0R.A05 = i;
        U0Z u0z = this.A0C;
        if (u0z != null) {
            u0z.setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0L.setColorFilter(colorFilter);
        this.A0X.setColorFilter(colorFilter);
    }

    public C16079Uo6(Context context, Drawable drawable, ImageUrl imageUrl, String str, float f, int i, boolean z, boolean z2, boolean z3) {
        super(context);
        this.A0K = context;
        this.A0Y = new RectF();
        this.A0P = new RectF();
        this.A0O = new Rect();
        this.A0T = f;
        this.A0J = C13988Tno.A09(context, 20);
        this.A0I = C13988Tno.A09(context, 28);
        this.A0b = z;
        this.A0S = z2;
        this.A0c = z3;
        this.A0G = Math.round(0nA.A00(context, C14504TxQ.A00.height()));
        float A002 = 0nA.A00(context, 1.5f);
        this.A0U = A002;
        float A042 = 0nA.A04(context, 8);
        this.A0H = A042;
        this.A0V = new Matrix();
        float f2 = (float) i;
        float f3 = A042 * 2.0f;
        float f4 = f3 + f2;
        this.A03 = f4;
        this.A02 = f4;
        float f5 = 2.0f * A002;
        this.A00 = ((f2 - f5) / f) + ((float) this.A0G) + f5 + f3;
        Path path = new Path();
        this.A0N = path;
        path.setFillType(Path.FillType.WINDING);
        Paint paint = new Paint(3);
        this.A0L = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        AnonymousClass7TE.A1N(context, paint, R.color.grey_1);
        Paint paint2 = new Paint(1);
        this.A0X = paint2;
        paint2.setStyle(style);
        AnonymousClass7TE.A1N(context, paint2, 2Yu.A0H(context, R.attr.igds_color_separator_or_stroke_on_media));
        Paint paint3 = new Paint(3);
        this.A0W = paint3;
        paint3.setStrokeWidth(A002);
        AnonymousClass7TE.A1N(context, paint3, 2Yu.A0H(context, R.attr.igds_color_separator_or_stroke_on_media));
        JTO.A1N(paint3);
        int color = context.getColor(R.color.black_20_transparent);
        Paint paint4 = new Paint(1);
        this.A0M = paint4;
        C13988Tno.A0p(color, paint4);
        paint4.setShadowLayer(A042, 0.0f, 0.0f, color);
        GradientSpinner gradientSpinner = new GradientSpinner(context);
        this.A0R = gradientSpinner;
        gradientSpinner.setInactiveStrokeWidth(gradientSpinner.A00);
        gradientSpinner.setInvalidateListener(this);
        if (drawable != null) {
            this.A06 = System.currentTimeMillis();
            if (drawable instanceof BitmapDrawable) {
                this.A08 = ((BitmapDrawable) drawable).getBitmap();
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                this.A08 = createBitmap;
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
            }
            Bitmap bitmap = this.A08;
            bitmap.getClass();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.A0A = bitmapShader;
            this.A0L.setShader(bitmapShader);
            invalidateSelf();
        } else if (!2PP.A00(this.A0B, imageUrl)) {
            this.A0B = imageUrl;
            if (imageUrl != null) {
                C13989Tnp.A1P(this, 1NK.A00(), imageUrl, str);
            }
        }
    }

    public final void CyF(C226952iF r4, AnonymousClass3LX r5) {
        this.A06 = System.currentTimeMillis();
        Bitmap bitmap = r5.A01;
        bitmap.getClass();
        this.A08 = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.A0A = bitmapShader;
        this.A0L.setShader(bitmapShader);
        invalidateSelf();
        Iterator it = this.A0a.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("onImageLoad");
        }
    }
}
