package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.9X2  reason: invalid class name */
public final class AnonymousClass9X2 extends Drawable implements C369948va {
    public int A00;
    public int A01;
    public boolean A02;
    public final Drawable A03;
    public final C39717A6i A04;
    public final AnonymousClass9XL A05;

    public AnonymousClass9X2(Context context, Drawable drawable, TargetViewSizeProvider targetViewSizeProvider, C39717A6i a6i) {
        int intrinsicHeight;
        0qQ.A0B(targetViewSizeProvider, 4);
        this.A03 = drawable;
        this.A04 = a6i;
        this.A05 = new AnonymousClass9XL(context);
        AnonymousClass81W r2 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        if (r2.getWidth() == 0 || r2.getHeight() == 0) {
            this.A01 = this.A03.getIntrinsicWidth();
            intrinsicHeight = this.A03.getIntrinsicHeight();
        } else {
            this.A01 = (int) (((float) r2.getWidth()) * 0.5f);
            intrinsicHeight = (int) (((float) r2.getHeight()) * 0.5f);
        }
        this.A00 = intrinsicHeight;
        ESw(((float) Math.min(this.A01, intrinsicHeight)) / 10.0f);
    }

    public final /* synthetic */ void APm() {
    }

    public final void APn() {
        this.A02 = true;
        invalidateSelf();
    }

    public final /* synthetic */ void CLf(boolean z) {
    }

    public final void CLg() {
        this.A02 = false;
        invalidateSelf();
    }

    public final /* synthetic */ void DdD(AnonymousClass804 r1, float f) {
    }

    public final /* synthetic */ void EPO(int i) {
    }

    public final /* synthetic */ void Eps(int i) {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A03.draw(canvas);
        if (this.A02) {
            this.A05.draw(canvas);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        this.A03.setBounds(rect);
        this.A05.setBounds(rect);
        ESw(((float) Math.min(rect.width(), rect.height())) / 10.0f);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final Drawable Aco() {
        return this.A03;
    }

    public final /* synthetic */ int AeE() {
        return 0;
    }

    public final float ArT() {
        Drawable drawable = this.A03;
        if (drawable instanceof AnonymousClass8DV) {
            return ((AnonymousClass8DV) drawable).A00;
        }
        if (drawable instanceof B2I) {
            return ((B2I) drawable).ArT();
        }
        return 0.0f;
    }

    public final Bitmap BPm() {
        Drawable drawable = this.A03;
        return AnonymousClass7TH.A03(drawable, drawable);
    }

    public final C39717A6i Bla() {
        return this.A04;
    }

    public final /* synthetic */ int CD2() {
        return 0;
    }

    public final void ESw(float f) {
        Drawable drawable = this.A03;
        if (drawable instanceof AnonymousClass8DV) {
            ((AnonymousClass8DV) drawable).A02(f);
        } else if (drawable instanceof B2I) {
            ((B2I) drawable).ESw(f);
        }
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
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
