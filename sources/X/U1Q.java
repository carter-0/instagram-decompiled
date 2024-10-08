package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.infocenter.model.ShareInfo;
import com.instagram.model.mediasize.ExtendedImageUrl;

public final class U1Q extends Drawable implements Drawable.Callback, AnonymousClass1MK, C300645xY {
    public Bitmap A00;
    public Bitmap A01;
    public Bitmap A02;
    public final Runnable A03;
    public final String A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Paint A0E;
    public final Paint A0F = new Paint(3);
    public final Paint A0G;
    public final Path A0H;
    public final RectF A0I;
    public final RectF A0J;
    public final RectF A0K;
    public final Drawable A0L;
    public final C306386Ly A0M;
    public final C306386Ly A0N;
    public final String A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void draw(Canvas canvas) {
        int i;
        0qQ.A0B(canvas, 0);
        if (this.A0Q && this.A01 == null) {
            return;
        }
        if (!this.A0P || this.A00 != null) {
            boolean z = this.A0R;
            if (!z || this.A02 != null) {
                canvas.save();
                int i2 = this.A08;
                int i3 = this.A09;
                canvas.translate((float) i2, (float) i3);
                Path path = this.A0H;
                canvas.drawPath(path, this.A0G);
                canvas.clipPath(path);
                Bitmap bitmap = this.A00;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, this.A0I, this.A0F);
                } else {
                    canvas.drawPath(path, this.A0E);
                }
                int i4 = this.A0A;
                float f = (float) i4;
                canvas.translate(f, f);
                Bitmap bitmap2 = this.A01;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, (Rect) null, this.A0J, this.A0F);
                }
                canvas.restore();
                canvas.save();
                Bitmap bitmap3 = this.A02;
                float f2 = (float) (i2 + i4);
                int i5 = (i3 + this.A05) - i4;
                if (bitmap3 != null) {
                    RectF rectF = this.A0K;
                    canvas.translate(f2, ((float) ((i5 - this.A0N.A06) - this.A0C)) - rectF.height());
                    Bitmap bitmap4 = this.A02;
                    0qQ.A0A(bitmap4);
                    canvas.drawBitmap(bitmap4, (Rect) null, rectF, this.A0F);
                } else {
                    C306386Ly r2 = this.A0M;
                    canvas.translate(f2, (float) (i5 - r2.A06));
                    Drawable drawable = this.A0L;
                    0qQ.A0A(drawable);
                    drawable.draw(canvas);
                    canvas.translate((float) (this.A06 + this.A07), -((float) this.A0B));
                    r2.draw(canvas);
                }
                canvas.restore();
                canvas.save();
                int i6 = 0;
                if (z) {
                    i = 0;
                } else {
                    i = this.A0M.A06;
                }
                int i7 = i5 - i;
                if (!z) {
                    i6 = this.A0C;
                }
                int i8 = i7 - i6;
                C306386Ly r1 = this.A0N;
                canvas.translate(f2, (float) (i8 - r1.A06));
                r1.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public U1Q(Context context, TargetViewSizeProvider targetViewSizeProvider, InfoCenterShareInfoIntf infoCenterShareInfoIntf) {
        Path path = new Path();
        this.A0H = path;
        Paint paint = new Paint(1);
        this.A0E = paint;
        Paint paint2 = new Paint(1);
        this.A0G = paint2;
        ShareInfo shareInfo = (ShareInfo) infoCenterShareInfoIntf;
        boolean A1V = AnonymousClass7TF.A1V(shareInfo.A00);
        this.A0Q = A1V;
        RectF rectF = new RectF();
        this.A0J = rectF;
        boolean A1V2 = AnonymousClass7TF.A1V(shareInfo.A01);
        this.A0P = A1V2;
        RectF rectF2 = new RectF();
        this.A0I = rectF2;
        boolean A1V3 = AnonymousClass7TF.A1V(shareInfo.A02);
        this.A0R = A1V3;
        RectF rectF3 = new RectF();
        this.A0K = rectF3;
        this.A04 = shareInfo.A06;
        this.A03 = new C19997WjI(this);
        AnonymousClass81W r0 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        int width = r0.getWidth();
        Context context2 = context;
        int height = r0.getHeight() - ((int) 0nA.A04(context2, 56));
        float f = 0.75f;
        int i = (int) (((float) width) * 0.75f);
        this.A0D = i;
        ExtendedImageUrl extendedImageUrl = shareInfo.A01;
        f = extendedImageUrl != null ? ((float) extendedImageUrl.getWidth()) / ((float) extendedImageUrl.getHeight()) : f;
        float f2 = (float) i;
        int i2 = (int) (f2 / f);
        this.A05 = i2;
        this.A08 = (width - i) / 2;
        this.A09 = (height - i2) / 2;
        int A042 = (int) 0nA.A04(context2, 16);
        int i3 = A042;
        this.A0A = A042;
        this.A0C = (int) 0nA.A04(context2, 8);
        int A043 = (int) 0nA.A04(context2, 12);
        int i4 = A043;
        this.A06 = A043;
        this.A07 = (int) 0nA.A04(context2, 4);
        this.A0B = (int) 0nA.A04(context2, 2);
        float f3 = (float) i2;
        rectF2.set(0.0f, 0.0f, f2, f3);
        if (A1V2) {
            1OO A0J2 = 1NK.A00().A0J(shareInfo.A01, (String) null);
            A0J2.A08 = "background_image";
            A0J2.A02(this);
            A0J2.A01();
        }
        float A044 = 0nA.A04(context2, 12);
        RectF rectF4 = new RectF(0.0f, 0.0f, f2, f3);
        float[] fArr = new float[8];
        fArr[0] = A044;
        fArr[1] = A044;
        fArr[2] = A044;
        fArr[3] = A044;
        AnonymousClass7TG.A11(path, rectF4, fArr, A044);
        int intValue = shareInfo.A04.intValue();
        int[] iArr = {0, 0, 0, 1};
        if (intValue != 0) {
            if (intValue == 1) {
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 0;
            } else if (intValue != 2) {
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 0;
            } else {
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
            }
        }
        if (shareInfo.A01 == null && infoCenterShareInfoIntf.Alf() == null) {
            0kD.A07("InfoCenterPreviewDrawable", "No card background provided! Need image url or gardient colors.", (Throwable) null);
        }
        if (infoCenterShareInfoIntf.Alf() != null) {
            float f4 = (float) (iArr[0] * i);
            float f5 = (float) (iArr[1] * i2);
            int[] Alf = infoCenterShareInfoIntf.Alf();
            0qQ.A0A(Alf);
            paint.setShader(new LinearGradient(f4, f5, (float) (iArr[2] * i), (float) (iArr[3] * i2), Alf, (float[]) null, Shader.TileMode.CLAMP));
        }
        float A045 = 0nA.A04(context2, 24);
        int color = context2.getColor(R.color.black_20_transparent);
        paint2.setColor(color);
        paint2.setShadowLayer(A045, 0.0f, 0.0f, color);
        int argb = Color.argb(Math.round(38.25f), 0, 0, 0);
        int i5 = i - (i3 * 2);
        C306386Ly r1 = new C306386Ly(context2, i5);
        this.A0N = r1;
        AnonymousClass7TG.A0x(context2, r1, 26);
        r1.A0B(0nA.A03(context2, 2.0f), 1.0f);
        r1.A0J(Typeface.SANS_SERIF, 1);
        r1.A0F(Color.parseColor(shareInfo.A09));
        r1.A0D(10.0f, 0.0f, 0.0f, argb);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        r1.A0K(alignment);
        r1.A0G(3, "…");
        r1.A0M(shareInfo.A0A);
        if (A1V3) {
            rectF3.set(0.0f, 0.0f, (float) C13988Tno.A09(context2, shareInfo.A02.getWidth()), (float) C13988Tno.A09(context2, shareInfo.A02.getHeight()));
            1OO A0J3 = 1NK.A00().A0J(shareInfo.A02, (String) null);
            A0J3.A08 = "logo_image";
            A0J3.A02(this);
            A0J3.A01();
        }
        Drawable drawable = context2.getDrawable(R.drawable.ig_logo);
        this.A0L = drawable;
        0qQ.A0A(drawable);
        drawable.setCallback(this);
        AnonymousClass7TE.A1R(drawable, Color.parseColor(shareInfo.A09));
        int i6 = i4;
        drawable.setBounds(0, 0, i6, i6);
        Typeface A0N2 = AnonymousClass7TG.A0N(context2);
        C306386Ly r12 = new C306386Ly(context2, i5);
        this.A0M = r12;
        AnonymousClass7TG.A0x(context2, r12, 14);
        r12.A0I(A0N2);
        r12.A0F(Color.parseColor(shareInfo.A09));
        r12.A0D(10.0f, 0.0f, 0.0f, argb);
        r12.A0K(alignment);
        r12.A0M(shareInfo.A08);
        float A092 = (float) C13988Tno.A09(context2, 24);
        rectF.set(0.0f, 0.0f, A092, A092);
        if (A1V) {
            1OO A0J4 = 1NK.A00().A0J(shareInfo.A00, (String) null);
            A0J4.A08 = "icon_image";
            A0J4.A02(this);
            A0J4.A01();
        }
        this.A0O = AnonymousClass000.A00(3346);
    }

    public final String C4F() {
        return this.A0O;
    }

    public final int getIntrinsicHeight() {
        return this.A05;
    }

    public final int getIntrinsicWidth() {
        return this.A0D;
    }

    public final void setAlpha(int i) {
        this.A0E.setAlpha(i);
        this.A0G.setAlpha(i);
        this.A0F.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0E.setColorFilter(colorFilter);
        this.A0G.setColorFilter(colorFilter);
        this.A0F.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void CyF(C226952iF r3, AnonymousClass3LX r4) {
        AnonymousClass7TG.A1N(r3, r4);
        Object C3s = r3.C3s();
        if ("icon_image".equals(C3s)) {
            this.A01 = r4.A01;
        } else if ("background_image".equals(C3s)) {
            this.A00 = r4.A01;
        } else if ("logo_image".equals(C3s)) {
            this.A02 = r4.A01;
        } else {
            return;
        }
        11Z.A02(this.A03);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
