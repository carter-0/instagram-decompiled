package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8v1  reason: invalid class name and case insensitive filesystem */
public abstract class C369598v1 extends Drawable implements AnonymousClass1MK, C300645xY {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final int A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Paint A0F = new Paint(3);
    public final Path A0G;
    public final Path A0H;
    public final Path A0I;
    public final Shader.TileMode A0J = Shader.TileMode.CLAMP;
    public final Runnable A0K;
    public final boolean A0L;
    public final Paint[] A0M;
    public final int A0N;
    public final Paint A0O;
    public final Paint A0P;
    public final Paint A0Q;
    public final int A0R;
    public final int A0S;
    public final int A0T;
    public final Path A0U;
    public final Drawable A0V;
    public final C306386Ly A0W;
    public final List A0X;

    public final void CyF(C226952iF r6, AnonymousClass3LX r7) {
        Bitmap bitmap;
        Bitmap A002;
        Paint paint;
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        String str = (String) r6.C3s();
        if (str != null) {
            if (00p.A0k(str, "product_image", false)) {
                String substring = str.substring(str.length() - 1);
                0qQ.A07(substring);
                int parseInt = Integer.parseInt(substring);
                Bitmap bitmap2 = r7.A01;
                if (bitmap2 != null) {
                    int round = Math.round(this.A08);
                    A002 = 0fO.A00(bitmap2, round, round, true);
                    0qQ.A07(A002);
                    paint = this.A0M[parseInt];
                    0qQ.A0A(paint);
                } else {
                    return;
                }
            } else if (00p.A0k(str, "profile_pic", false) && (bitmap = r7.A01) != null) {
                int round2 = Math.round(this.A01);
                A002 = 0fO.A00(bitmap, round2, round2, true);
                0qQ.A07(A002);
                this.A04 = true;
                paint = this.A0F;
            } else {
                return;
            }
            Shader.TileMode tileMode = this.A0J;
            paint.setShader(new BitmapShader(A002, tileMode, tileMode));
            11Z.A02(this.A0K);
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void draw(Canvas canvas) {
        float f;
        Paint paint;
        float f2;
        float f3;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        Rect bounds = getBounds();
        0qQ.A07(bounds);
        int save = canvas2.save();
        canvas2.translate((float) bounds.left, (float) bounds.top);
        canvas2.drawPath(this.A0U, this.A0Q);
        canvas2.save();
        List list = this.A0X;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float f4 = this.A08;
            canvas2.translate(0.0f, ((float) i) * f4);
            List list2 = (List) list.get(i);
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                float f5 = 0.0f;
                if (i2 > 0) {
                    f5 = f4;
                }
                canvas2.translate(f5, 0.0f);
                Paint paint2 = this.A0M[(this.A0B * i) + i2];
                0qQ.A0A(paint2);
                canvas2.drawPath((Path) list2.get(i2), paint2);
            }
            canvas2.restore();
            canvas2.save();
        }
        int i3 = this.A0B;
        for (int i4 = 1; i4 < i3; i4++) {
            float f6 = this.A08;
            float f7 = ((float) i4) * f6;
            canvas2.drawLine(f7, 0.0f, f7, f6 * ((float) this.A0N), this.A0O);
        }
        int i5 = this.A0N;
        for (int i6 = 1; i6 < i5; i6++) {
            float f8 = this.A08;
            float f9 = ((float) i6) * f8;
            canvas2.drawLine(0.0f, f9, ((float) i3) * f8, f9, this.A0O);
        }
        canvas2.translate(0.0f, this.A05);
        canvas2.drawPath(this.A0G, this.A0C);
        float f10 = this.A07;
        float f11 = (this.A00 - ((float) this.A02)) - f10;
        if (this.A0L) {
            f = (this.A06 - ((float) this.A03)) - f10;
        } else {
            f = (float) this.A03;
        }
        canvas2.translate(f, f11);
        canvas2.save();
        canvas2.drawPath(this.A0H, this.A0D);
        canvas2.restore();
        canvas2.save();
        float f12 = this.A09;
        canvas2.translate(f12, f12);
        Path path = this.A0I;
        if (this.A04) {
            paint = this.A0F;
        } else {
            paint = this.A0E;
        }
        canvas2.drawPath(path, paint);
        canvas2.save();
        A00(canvas2);
        if (this instanceof C387249lu) {
            C387249lu r6 = (C387249lu) this;
            C306386Ly r2 = r6.A03;
            canvas2.translate(0.0f, (float) ((-r6.A01) - r2.A06));
            canvas2.save();
            boolean z = r6.A0L;
            if (z) {
                f2 = r6.A07 - ((float) r2.A0A);
            } else {
                f2 = 0.0f;
            }
            canvas2.translate(f2, 0.0f);
            r2.draw(canvas2);
            canvas2.restore();
            C306386Ly r22 = r6.A02;
            canvas2.translate(0.0f, (float) ((-r6.A00) - r22.A06));
            if (z) {
                f3 = r6.A07 - ((float) r22.A0A);
            } else {
                f3 = 0.0f;
            }
            canvas2.translate(f3, 0.0f);
            r22.draw(canvas2);
        }
        canvas2.restoreToCount(save);
    }

    public final int getOpacity() {
        return -3;
    }

    public C369598v1(Context context, ImageUrl imageUrl, String str, List list, float f, int i, int i2) {
        int i3;
        int i4;
        float f2 = f;
        this.A0N = i;
        this.A0B = i2;
        Paint paint = new Paint(3);
        this.A0C = paint;
        Paint paint2 = new Paint(3);
        this.A0Q = paint2;
        Paint paint3 = new Paint(3);
        this.A0P = paint3;
        Paint paint4 = new Paint(3);
        this.A0E = paint4;
        Paint paint5 = new Paint(3);
        this.A0D = paint5;
        Paint paint6 = new Paint(3);
        this.A0O = paint6;
        this.A0X = new ArrayList();
        this.A0I = new Path();
        this.A0H = new Path();
        this.A0G = new Path();
        this.A0U = new Path();
        this.A0K = new C40766Aiw(this);
        int i5 = i * i2;
        Context context2 = context;
        0nA.A04(context2, 2);
        this.A0M = new Paint[i5];
        int color = context2.getColor(2Yu.A0A(context2));
        this.A0T = color;
        int color2 = context2.getColor(2Yu.A0H(context2, R.attr.igds_color_text_on_white));
        this.A0R = color2;
        this.A0S = context2.getColor(2Yu.A0H(context2, R.attr.igds_color_creation_tools_grey_05));
        int color3 = context2.getColor(2Yu.A0H(context2, R.attr.igds_color_shadow_on_media));
        int color4 = context2.getColor(2Yu.A0H(context2, R.attr.igds_color_creation_tools_grey_02));
        int color5 = context2.getColor(2Yu.A0H(context2, R.attr.igds_color_list_badge));
        this.A0L = 0mk.A02(context2);
        paint.setColor(color);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setColor(color);
        paint2.setShadowLayer(14.0f, 0.0f, 0.0f, color3);
        paint3.setColor(color2);
        paint4.setColor(context2.getColor(2Yu.A04(context2)));
        paint4.setStyle(style);
        paint5.setColor(color4);
        paint5.setStyle(style);
        paint6.setColor(color);
        paint6.setStyle(style);
        paint6.setStrokeWidth(0nA.A04(context2, 1));
        for (int i6 = 0; i6 < i5; i6++) {
            this.A0M[i6] = new Paint(3);
            Paint paint7 = this.A0M[i6];
            0qQ.A0A(paint7);
            paint7.setColor(this.A0T);
        }
        this.A06 = f2;
        float f3 = f / ((float) this.A0B);
        this.A08 = f3;
        this.A05 = f3 * ((float) this.A0N);
        boolean z = this instanceof C369588v0;
        if (z) {
            this.A00 = f / 6.0f;
            i3 = 10;
        } else {
            this.A00 = f / 3.0f;
            i3 = 16;
        }
        this.A03 = Math.round(0nA.A04(context2, i3));
        this.A02 = Math.round(0nA.A04(context2, 14));
        if (z) {
            i4 = 28;
        } else {
            i4 = 24;
        }
        this.A01 = 0nA.A04(context2, i4);
        float A042 = 0nA.A04(context2, 12);
        int i7 = this.A0N;
        int i8 = 0;
        while (i8 < i7) {
            List list2 = this.A0X;
            float f4 = i8 == 0 ? A042 : 0.0f;
            ArrayList arrayList = new ArrayList();
            int i9 = this.A0B;
            int i10 = 0;
            while (i10 < i9) {
                float[] fArr = new float[8];
                fArr[0] = i10 == 0 ? f4 : 0.0f;
                fArr[1] = i10 == 0 ? f4 : 0.0f;
                int i11 = i9 - 1;
                fArr[2] = i10 == i11 ? f4 : 0.0f;
                float f5 = 0.0f;
                if (i10 == i11) {
                    f5 = f4;
                }
                fArr[3] = f5;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = 0.0f;
                fArr[7] = 0.0f;
                Path path = new Path();
                float f6 = this.A08;
                path.addRoundRect(new RectF(0.0f, 0.0f, f6, f6), fArr, Path.Direction.CW);
                arrayList.add(path);
                i10++;
            }
            list2.add(arrayList);
            i8++;
        }
        float A002 = 0nA.A00(context2, 0.5f);
        this.A09 = A002;
        float f7 = this.A01 / 2.0f;
        Path path2 = this.A0I;
        Path.Direction direction = Path.Direction.CW;
        path2.addCircle(f7, f7, f7, direction);
        float f8 = this.A01 + (A002 * 2.0f);
        this.A07 = f8;
        float f9 = f8 / 2.0f;
        this.A0H.addCircle(f9, f9, f9, direction);
        this.A0G.addRoundRect(new RectF(0.0f, 0.0f, this.A06, this.A00), new float[]{0.0f, 0.0f, 0.0f, 0.0f, A042, A042, A042, A042}, direction);
        this.A0U.addRoundRect(new RectF(0.0f, 0.0f, this.A06, this.A05 + this.A00), A042, A042, direction);
        int i12 = this.A03;
        int i13 = (int) (((float) i12) / 2.0f);
        this.A0A = i13;
        C306386Ly r1 = new C306386Ly(context2, (int) (((this.A06 - ((float) (i12 * 2))) - this.A01) - ((float) i13)));
        this.A0W = r1;
        r1.A0A(0nA.A04(context2, 14));
        r1.A0J(Typeface.SANS_SERIF, 1);
        r1.A0F(this.A0R);
        r1.A0K(Layout.Alignment.ALIGN_NORMAL);
        r1.A0O = true;
        r1.A0M(str);
        Drawable drawable = context2.getDrawable(R.drawable.verified_profile);
        if (drawable != null) {
            this.A0V = drawable;
            drawable.setColorFilter(AnonymousClass37O.A00(color5));
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            for (int i14 = 0; i14 < i5; i14++) {
                1NK A003 = 1NK.A00();
                Object obj = list.get(i14);
                0qQ.A0A(obj);
                1OO A0J2 = A003.A0J((ImageUrl) obj, (String) null);
                A0J2.A08 = 002.A0O("product_image", i14);
                A0J2.A02(this);
                A0J2.A01();
            }
            ImageUrl imageUrl2 = imageUrl;
            if (imageUrl != null) {
                1OO A0J3 = 1NK.A00().A0J(imageUrl2, (String) null);
                A0J3.A08 = "profile_pic";
                A0J3.A02(this);
                A0J3.A01();
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public void A00(Canvas canvas) {
        float f;
        float f2 = this.A07;
        C306386Ly r2 = this.A0W;
        float f3 = (f2 / 2.0f) - (((float) r2.A06) / 2.0f);
        if (this.A0L) {
            f = (float) ((-this.A0A) - r2.A0A);
        } else {
            f = f2 + ((float) this.A0A);
        }
        canvas.translate(f, f3);
        r2.draw(canvas);
        canvas.restore();
        canvas.save();
    }

    public final int getIntrinsicHeight() {
        return Math.round(this.A05 + this.A00);
    }

    public final int getIntrinsicWidth() {
        return Math.round(this.A06);
    }

    public void setAlpha(int i) {
        this.A0F.setAlpha(i);
        for (Paint paint : this.A0M) {
            0qQ.A0A(paint);
            paint.setAlpha(i);
        }
        this.A0C.setAlpha(i);
        this.A0P.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A0F.setColorFilter(colorFilter);
        for (Paint paint : this.A0M) {
            0qQ.A0A(paint);
            paint.setColorFilter(colorFilter);
        }
        this.A0C.setColorFilter(colorFilter);
        this.A0P.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
