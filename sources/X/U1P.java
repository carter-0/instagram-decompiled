package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.infocenter.model.InfoCenterFactShareInfo;

public final class U1P extends Drawable implements Drawable.Callback, AnonymousClass1MK, C300645xY {
    public Bitmap A00;
    public Bitmap A01;
    public C306386Ly A02;
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
    public final int A0E;
    public final Paint A0F;
    public final Paint A0G = new Paint(3);
    public final Paint A0H;
    public final Path A0I;
    public final RectF A0J;
    public final RectF A0K;
    public final C306386Ly A0L;
    public final C306386Ly A0M;
    public final C306386Ly A0N;
    public final String A0O;

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A01 != null && this.A00 != null) {
            canvas.save();
            canvas.translate((float) this.A0A, (float) this.A0B);
            Path path = this.A0I;
            canvas.drawPath(path, this.A0H);
            canvas.drawPath(path, this.A0F);
            canvas.clipPath(path);
            canvas.save();
            float f = (float) this.A0C;
            float f2 = (float) this.A06;
            RectF rectF = this.A0J;
            canvas.translate(f, C51967G9n.A00(f2, rectF.height()));
            Bitmap bitmap = this.A00;
            0qQ.A0A(bitmap);
            Paint paint = this.A0G;
            canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(f + rectF.width() + ((float) this.A08), f);
            C306386Ly r0 = this.A0N;
            r0.draw(canvas);
            canvas.translate(0.0f, (float) (r0.A06 + this.A07));
            this.A0M.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(0.0f, f2);
            Bitmap bitmap2 = this.A01;
            0qQ.A0A(bitmap2);
            RectF rectF2 = this.A0K;
            canvas.drawBitmap(bitmap2, (Rect) null, rectF2, paint);
            canvas.translate(f, rectF2.height() + ((float) this.A0D));
            C306386Ly r02 = this.A02;
            if (r02 != null) {
                r02.draw(canvas);
                canvas.translate(0.0f, (float) (r02.A06 + this.A05));
            }
            this.A0L.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public U1P(Context context, TargetViewSizeProvider targetViewSizeProvider, InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf) {
        Path path = new Path();
        this.A0I = path;
        Paint paint = new Paint(1);
        this.A0F = paint;
        Paint paint2 = new Paint(1);
        this.A0H = paint2;
        RectF rectF = new RectF();
        this.A0K = rectF;
        RectF rectF2 = new RectF();
        this.A0J = rectF2;
        InfoCenterFactShareInfo infoCenterFactShareInfo = (InfoCenterFactShareInfo) infoCenterFactShareInfoIntf;
        this.A04 = infoCenterFactShareInfo.A02;
        this.A0O = infoCenterFactShareInfo.A0A;
        this.A03 = new C19996WjH(this);
        AnonymousClass81W r0 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        int width = r0.getWidth();
        Context context2 = context;
        int height = r0.getHeight() - ((int) 0nA.A04(context2, 56));
        int i = (int) (((float) width) * 0.72f);
        this.A0E = i;
        this.A0A = (width - i) / 2;
        int A042 = (int) 0nA.A04(context2, 16);
        this.A0C = A042;
        int A043 = (int) 0nA.A04(context2, 16);
        this.A08 = A043;
        int A044 = (int) 0nA.A04(context2, 16);
        int i2 = A044;
        this.A0D = A044;
        int A045 = (int) 0nA.A04(context2, 4);
        int i3 = A045;
        this.A07 = A045;
        int A046 = (int) 0nA.A04(context2, 4);
        int i4 = A046;
        this.A05 = A046;
        float A092 = (float) C13988Tno.A09(context2, infoCenterFactShareInfoIntf.BCg().getWidth());
        rectF2.set(0.0f, 0.0f, A092, (float) C13988Tno.A09(context2, infoCenterFactShareInfoIntf.BCg().getHeight()));
        1OO A0J2 = 1NK.A00().A0J(infoCenterFactShareInfoIntf.BCg(), (String) null);
        A0J2.A08 = "logo_image";
        A0J2.A02(this);
        A0J2.A01();
        Typeface A0N2 = AnonymousClass7TG.A0N(context2);
        int i5 = i - (A042 * 2);
        int i6 = (i5 - ((int) A092)) - A043;
        C306386Ly r5 = new C306386Ly(context2, i6);
        this.A0N = r5;
        AnonymousClass7TG.A0x(context2, r5, 14);
        r5.A0I(A0N2);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        r5.A0K(alignment);
        r5.A0G(1, "…");
        r5.A0M(infoCenterFactShareInfo.A0G);
        AnonymousClass7TG.A0y(context2, r5, R.attr.igds_color_text_on_white);
        C306386Ly r2 = new C306386Ly(context2, i6);
        this.A0M = r2;
        AnonymousClass7TG.A0x(context2, r2, 14);
        Typeface typeface = Typeface.SANS_SERIF;
        r2.A0J(typeface, 0);
        r2.A0K(alignment);
        r5.A0G(1, "…");
        r2.A0M(infoCenterFactShareInfo.A0F);
        r2.A0F(DbV.A01(context2));
        float f = (float) i;
        float height2 = (f * ((float) infoCenterFactShareInfoIntf.Ale().getHeight())) / ((float) infoCenterFactShareInfoIntf.Ale().getWidth());
        rectF.set(0.0f, 0.0f, f, height2);
        1OO A0J3 = 1NK.A00().A0J(infoCenterFactShareInfoIntf.Ale(), (String) null);
        A0J3.A08 = "preview_image";
        A0J3.A02(this);
        A0J3.A01();
        String str = infoCenterFactShareInfo.A0B;
        String str2 = str;
        if (!(str == null || str2.length() == 0)) {
            C306386Ly r14 = new C306386Ly(context2, i5);
            this.A02 = r14;
            AnonymousClass7TG.A0x(context2, r14, 12);
            r14.A0B(0nA.A03(context2, 2.0f), 1.0f);
            r14.A0I(A0N2);
            r14.A0K(alignment);
            r14.A0G(2, "…");
            r14.A0M(str2);
            AnonymousClass7TG.A0y(context2, r14, R.attr.igds_color_text_on_white);
        }
        C306386Ly r142 = new C306386Ly(context2, i5);
        this.A0L = r142;
        AnonymousClass7TG.A0x(context2, r142, 12);
        r142.A0B(0nA.A03(context2, 2.0f), 1.0f);
        r142.A0K(alignment);
        int i7 = 0;
        r142.A0J(typeface, 0);
        r142.A0G(this.A02 == null ? 3 : 1, "…");
        r142.A0M(infoCenterFactShareInfo.A07);
        AnonymousClass7TG.A0y(context2, r142, R.attr.igds_color_text_on_white);
        int i8 = r5.A06 + A042 + i3 + r2.A06 + i2;
        this.A06 = i8;
        C306386Ly r02 = this.A02;
        int i9 = i8 + ((int) height2) + A042 + (r02 != null ? r02.A06 + i4 : i7) + r142.A06 + i2;
        this.A09 = i9;
        this.A0B = (height - i9) / 2;
        float A047 = 0nA.A04(context2, 12);
        RectF rectF3 = new RectF(0.0f, 0.0f, f, (float) i9);
        float[] fArr = new float[8];
        fArr[0] = A047;
        fArr[1] = A047;
        fArr[2] = A047;
        fArr[3] = A047;
        AnonymousClass7TG.A11(path, rectF3, fArr, A047);
        AnonymousClass7TE.A1N(context2, paint, 2Yu.A0H(context2, R.attr.igds_color_sticker_background));
        AnonymousClass7TE.A1Q(paint);
        float A048 = 0nA.A04(context2, 24);
        int A032 = AnonymousClass7TF.A03(context2, R.attr.igds_color_shadow_on_media);
        paint2.setColor(A032);
        paint2.setShadowLayer(A048, 0.0f, 0.0f, A032);
    }

    public final String C4F() {
        return this.A0O;
    }

    public final int getIntrinsicHeight() {
        return this.A09;
    }

    public final int getIntrinsicWidth() {
        return this.A0E;
    }

    public final void setAlpha(int i) {
        this.A0H.setAlpha(i);
        this.A0G.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0H.setColorFilter(colorFilter);
        this.A0G.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void CyF(C226952iF r3, AnonymousClass3LX r4) {
        AnonymousClass7TG.A1N(r3, r4);
        Object C3s = r3.C3s();
        if ("preview_image".equals(C3s)) {
            this.A01 = r4.A01;
        } else if ("logo_image".equals(C3s)) {
            this.A00 = r4.A01;
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
