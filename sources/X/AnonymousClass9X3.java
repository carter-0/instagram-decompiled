package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.user.model.User;

/* renamed from: X.9X3  reason: invalid class name */
public final class AnonymousClass9X3 extends Drawable implements C369948va {
    public int A00;
    public int A01;
    public float A02 = 1.0f;
    public float A03;
    public int A04;
    public final int A05;
    public final int A06;
    public final Drawable A07;
    public final C39717A6i A08;
    public final C306386Ly A09;

    public AnonymousClass9X3(Context context, Drawable drawable, C39717A6i a6i, int i, int i2) {
        int intrinsicHeight;
        User user;
        int i3;
        this.A07 = drawable;
        this.A08 = a6i;
        this.A06 = i;
        this.A05 = i2;
        drawable.setCallback(this);
        Resources resources = context.getResources();
        int i4 = this.A06;
        if (i4 == 0 || (i3 = this.A05) == 0) {
            Drawable drawable2 = this.A07;
            this.A01 = drawable2.getIntrinsicWidth();
            intrinsicHeight = drawable2.getIntrinsicHeight();
        } else {
            this.A01 = (int) (((float) i4) * 0.5f);
            intrinsicHeight = (int) (((float) i3) * 0.5f);
        }
        this.A00 = intrinsicHeight;
        C39717A6i a6i2 = this.A08;
        if (a6i2 != null) {
            user = a6i2.A02;
        } else {
            user = null;
        }
        if (user != null) {
            this.A04 = AnonymousClass7TE.A0G(resources);
            this.A03 = 0nA.A04(context, 12);
            Spannable spannable = C306386Ly.A0d;
            C306386Ly A0s = AnonymousClass7TE.A0s(context, this.A07.getIntrinsicWidth());
            AnonymousClass7TF.A1A(A0s, user.getUsername());
            A0s.A0A(this.A03);
            A0s.A0F(-1);
            A0s.setAlpha(255);
            A0s.A0N("…", 1, true);
            A0s.A0D(1.0f, 0.0f, 0.5f, -16777216);
            this.A09 = A0s;
            AnonymousClass7TE.A1X(0qm.A0z, AnonymousClass0qo.A00(context), A0s);
            A0s.setCallback(this);
            return;
        }
        this.A04 = 0;
        this.A03 = 0.0f;
        this.A09 = null;
    }

    private final void A00(Rect rect, float f) {
        C306386Ly r5;
        if (f != 0.0f && (r5 = this.A09) != null) {
            float f2 = 1.0f / f;
            int i = (int) (((float) this.A04) * f2);
            int i2 = rect.left + (i * 2);
            int i3 = rect.right - i;
            int i4 = rect.bottom - i;
            int i5 = i4 - ((int) (((float) r5.A06) * f2));
            r5.A0A(this.A03 * f2);
            r5.A0E(Math.max(0, i3 - i2));
            r5.setBounds(i2, i5, i3, i4);
        }
    }

    public final void APm() {
    }

    public final void APn() {
    }

    public final int AeE() {
        return 0;
    }

    public final void CLf(boolean z) {
    }

    public final void CLg() {
    }

    public final void EPO(int i) {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A07.draw(canvas);
        C306386Ly r1 = this.A09;
        if (r1 != null && r1.A0b.getAlpha() > 0) {
            r1.draw(canvas);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        this.A07.setBounds(rect);
        A00(rect, this.A02);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final Drawable Aco() {
        return this.A07;
    }

    public final float ArT() {
        Drawable drawable = this.A07;
        if (drawable instanceof AnonymousClass8DV) {
            return ((AnonymousClass8DV) drawable).A00;
        }
        if (drawable instanceof B2I) {
            return ((B2I) drawable).ArT();
        }
        if (!(drawable instanceof C41782B0l)) {
            return 0.0f;
        }
        C376429Hy r4 = ((AnonymousClass9X8) ((C41782B0l) drawable)).A03;
        float f = r4.A02;
        float[] fArr = {r4.A03, r4.A00, r4.A01};
        int i = 0;
        do {
            f = Math.max(f, fArr[i]);
            i++;
        } while (i < 3);
        return f;
    }

    public final Bitmap BPm() {
        Drawable drawable = this.A07;
        return AnonymousClass7TH.A03(drawable, drawable);
    }

    public final C39717A6i Bla() {
        return this.A08;
    }

    public final int CD2() {
        C306386Ly r0 = this.A09;
        if (r0 != null) {
            return r0.A0b.getAlpha();
        }
        return 0;
    }

    public final void DdD(AnonymousClass804 r2, float f) {
        this.A02 = f;
        A00(AnonymousClass7TE.A0X(this), f);
    }

    public final void ESw(float f) {
        Drawable drawable = this.A07;
        if (drawable instanceof AnonymousClass8DV) {
            ((AnonymousClass8DV) drawable).A02(f);
        } else if (drawable instanceof B2I) {
            ((B2I) drawable).ESw(f);
        } else if (drawable instanceof C41782B0l) {
            ((AnonymousClass9X8) ((C41782B0l) drawable)).A03 = new C376429Hy(f);
        }
    }

    public final void Eps(int i) {
        C306386Ly r0 = this.A09;
        if (r0 != null) {
            r0.setAlpha(i);
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
