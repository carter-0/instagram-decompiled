package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import com.instagram.common.session.UserSession;

/* renamed from: X.JdA  reason: case insensitive filesystem */
public final class C60001JdA extends Drawable implements Drawable.Callback {
    public final Drawable A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Path A05 = C51965G9l.A0C();
    public final RectF A06 = AnonymousClass7TE.A0Y();
    public final Drawable A07;
    public final C306386Ly A08;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Drawable drawable = this.A07;
        int i = this.A02;
        int i2 = i * 2;
        int i3 = this.A03;
        drawable.setBounds(i, i2, i3 + i, i3 + i2);
        drawable.draw(canvas);
        int A062 = JTP.A06(this);
        Drawable drawable2 = this.A00;
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        C306386Ly r2 = this.A08;
        int i4 = r2.A0A;
        int i5 = (intrinsicWidth - i4) / 2;
        r2.setBounds(i5, A062 - r2.A06, i4 + i5, A062);
        r2.draw(canvas);
        float f = (float) this.A01;
        Path path = this.A05;
        path.reset();
        RectF rectF = this.A06;
        rectF.set(0.0f, 0.0f, f, f);
        float[] fArr = new float[8];
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        AnonymousClass7TG.A11(path, rectF, fArr, f);
        canvas.clipPath(path);
        drawable2.draw(canvas);
        invalidateSelf();
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A00.getIntrinsicHeight() + this.A04 + this.A08.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A00.getIntrinsicWidth();
    }

    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
        this.A00.setAlpha(i);
        this.A08.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
        this.A00.setColorFilter(colorFilter);
        this.A08.setColorFilter(colorFilter);
    }

    public C60001JdA(Context context, UserSession userSession, String str) {
        this.A03 = LPK.A02(context, userSession);
        int A002 = LPK.A00(context, userSession);
        this.A01 = A002;
        this.A02 = LPK.A01(context, userSession);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, AnonymousClass6LW.A07);
        gradientDrawable.setShape(1);
        this.A07 = gradientDrawable;
        this.A00 = C320996tP.A02(context, userSession, str, A002, A002, C63282KuR.A00(userSession));
        Spannable spannable = C306386Ly.A0d;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, AnonymousClass8XF.A01(context));
        A0s.A0M(context.getResources().getText(2131953495));
        this.A08 = A0s;
        this.A04 = AnonymousClass7TG.A07(context);
        JTU.A0h(context, A0s);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AnonymousClass7TH.A0L(this, runnable);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AnonymousClass7TH.A0M(this, runnable, j);
    }
}
