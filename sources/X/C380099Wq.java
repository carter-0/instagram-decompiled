package X;

import android.content.Context;
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

/* renamed from: X.9Wq  reason: invalid class name and case insensitive filesystem */
public final class C380099Wq extends Drawable implements Drawable.Callback, C300645xY {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Paint A09;
    public final Paint A0A;
    public final Path A0B;
    public final Drawable A0C;
    public final Drawable A0D;
    public final C306386Ly A0E;
    public final C306386Ly A0F;
    public final String A0G = "voting_info_center_preview_sticker";

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public C380099Wq(Context context, TargetViewSizeProvider targetViewSizeProvider) {
        Path path = new Path();
        this.A0B = path;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A09 = A0V;
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        this.A0A = A0V2;
        AnonymousClass81W r0 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        int width = r0.getWidth();
        Context context2 = context;
        int height = r0.getHeight() - ((int) 0nA.A04(context2, 56));
        int i = (int) (((float) width) * 0.75f);
        this.A08 = i;
        float f = (float) i;
        int i2 = (int) (f / 0.75f);
        this.A00 = i2;
        this.A03 = (width - i) / 2;
        this.A04 = (height - i2) / 2;
        int A042 = (int) 0nA.A04(context2, 16);
        this.A05 = A042;
        this.A07 = (int) 0nA.A04(context2, 8);
        int A043 = (int) 0nA.A04(context2, 12);
        this.A01 = A043;
        this.A02 = (int) 0nA.A04(context2, 4);
        this.A06 = (int) 0nA.A04(context2, 2);
        float A044 = 0nA.A04(context2, 12);
        int argb = Color.argb(Math.round(38.25f), 0, 0, 0);
        float f2 = (float) i2;
        float f3 = f2;
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        float[] fArr = new float[8];
        fArr[0] = A044;
        fArr[1] = A044;
        fArr[2] = A044;
        fArr[3] = A044;
        AnonymousClass7TG.A11(path, rectF, fArr, A044);
        float f4 = f;
        Paint paint = A0V;
        paint.setShader(new LinearGradient(0.0f, f3, f4, 0.0f, new int[]{context2.getColor(R.color.voting_info_center_background_start), context2.getColor(R.color.voting_info_center_background_center), context2.getColor(R.color.voting_info_sticker_gradient_end)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        float A045 = 0nA.A04(context2, 16);
        int color = context2.getColor(R.color.black_30_transparent);
        A0V2.setColor(color);
        A0V2.setShadowLayer(A045, 0.0f, 0.0f, color);
        Drawable drawable = context2.getDrawable(R.drawable.instagram_election_pin_filled_24);
        this.A0D = drawable;
        0qQ.A0A(drawable);
        drawable.setCallback(this);
        AnonymousClass7TG.A13(drawable);
        AnonymousClass7TE.A1R(drawable, context2.getColor(R.color.design_dark_default_color_on_background));
        int i3 = i - (A042 * 2);
        C306386Ly A0s = AnonymousClass7TE.A0s(context2, i3);
        this.A0F = A0s;
        AnonymousClass7TG.A0x(context2, A0s, 26);
        A0s.A0B(0nA.A03(context2, 2.0f), 1.0f);
        A0s.A0J(Typeface.SANS_SERIF, 1);
        A0s.A0F(-1);
        A0s.A0D(10.0f, 0.0f, 0.0f, argb);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        A0s.A0K(alignment);
        A0s.A0G(3, "…");
        AnonymousClass7TE.A1P(context2.getResources(), A0s, 2131976734);
        Drawable drawable2 = context2.getDrawable(R.drawable.ig_logo);
        this.A0C = drawable2;
        0qQ.A0A(drawable2);
        drawable2.setCallback(this);
        AnonymousClass7TE.A1R(drawable2, context2.getColor(R.color.design_dark_default_color_on_background));
        drawable2.setBounds(0, 0, A043, A043);
        Typeface A0N = AnonymousClass7TG.A0N(context2);
        C306386Ly A0s2 = AnonymousClass7TE.A0s(context2, i3);
        this.A0E = A0s2;
        AnonymousClass7TG.A0x(context2, A0s2, 14);
        A0s2.A0I(A0N);
        A0s2.A0F(-1);
        A0s2.A0D(10.0f, 0.0f, 0.0f, argb);
        A0s2.A0K(alignment);
        AnonymousClass7TE.A1P(context2.getResources(), A0s2, 2131976733);
    }

    public final String C4F() {
        return this.A0G;
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A08;
    }

    public final void setAlpha(int i) {
        this.A09.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        int i = this.A03;
        int i2 = this.A04;
        canvas.translate((float) i, (float) i2);
        Path path = this.A0B;
        canvas.drawPath(path, this.A0A);
        canvas.drawPath(path, this.A09);
        int i3 = this.A05;
        float f = (float) i3;
        canvas.translate(f, f);
        Drawable drawable = this.A0D;
        0qQ.A0A(drawable);
        AnonymousClass7TF.A14(canvas, drawable);
        float f2 = (float) (i + i3);
        int i4 = (i2 + this.A00) - i3;
        int i5 = this.A01;
        canvas.translate(f2, (float) (i4 - i5));
        Drawable drawable2 = this.A0C;
        0qQ.A0A(drawable2);
        drawable2.draw(canvas);
        canvas.translate((float) (i5 + this.A02), -((float) this.A06));
        C306386Ly r0 = this.A0E;
        AnonymousClass7TF.A14(canvas, r0);
        C306386Ly r1 = this.A0F;
        AnonymousClass7TF.A15(canvas, r1, f2, (float) (((i4 - r0.A06) - this.A07) - r1.A06));
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
