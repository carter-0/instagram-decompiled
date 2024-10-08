package X;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.reels.question.model.QuestionResponseReshareModel;

/* renamed from: X.8vF  reason: invalid class name and case insensitive filesystem */
public abstract class C369738vF extends Drawable implements Drawable.Callback, C41796B1b {
    public final Paint A00 = new Paint(1);
    public final QuestionResponseReshareModel A01;

    public C369738vF(QuestionResponseReshareModel questionResponseReshareModel) {
        this.A01 = questionResponseReshareModel;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public void setAlpha(int i) {
        Drawable drawable;
        C306386Ly r0;
        boolean z = this instanceof C389789qC;
        if (z) {
            drawable = ((C389789qC) this).A0A;
        } else {
            drawable = ((C389779qB) this).A06;
        }
        drawable.mutate().setAlpha(i);
        this.A00.setAlpha(i);
        if (z) {
            r0 = ((C389789qC) this).A0B;
        } else {
            r0 = ((C389779qB) this).A07;
        }
        r0.mutate().setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable;
        C306386Ly r0;
        boolean z = this instanceof C389789qC;
        if (z) {
            drawable = ((C389789qC) this).A0A;
        } else {
            drawable = ((C389779qB) this).A06;
        }
        drawable.mutate().setColorFilter(colorFilter);
        this.A00.setColorFilter(colorFilter);
        if (z) {
            r0 = ((C389789qC) this).A0B;
        } else {
            r0 = ((C389779qB) this).A07;
        }
        r0.mutate().setColorFilter(colorFilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final A7J Bik() {
        return this.A01.A02;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
