package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class U1L extends Drawable implements Drawable.Callback {
    public int A00;
    public Drawable A01;
    public C16491Uvm A02 = C16491Uvm.SMALL;
    public AnonymousClass7NA A03;
    public String A04 = "";
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public float A08;
    public float A09;
    public final Context A0A;
    public final C14688U1n A0B = new C14688U1n(this);
    public final C17765Vfc A0C = new C17765Vfc(this);

    public static final void A00(U1L u1l) {
        C226492gu r1;
        u1l.A06 = false;
        Drawable drawable = u1l.A01;
        if (!(drawable == null || !(drawable instanceof C226492gu) || (r1 = (C226492gu) drawable) == null)) {
            r1.stop();
        }
        AnonymousClass7NA r4 = u1l.A03;
        if (r4 != null) {
            C16491Uvm uvm = u1l.A02;
            C17765Vfc vfc = u1l.A0C;
            AnonymousClass7N9 r42 = (AnonymousClass7N9) r4;
            synchronized (r42) {
                AnonymousClass7TF.A1H(uvm, vfc);
                C17417VUw vUw = (C17417VUw) r42.A03.get(uvm);
                if (vUw != null) {
                    018.A17(vUw.A01, new C377189Kw(vfc, 29));
                }
            }
        }
    }

    public final void draw(Canvas canvas) {
        C226492gu r0;
        0qQ.A0B(canvas, 0);
        Drawable drawable = this.A01;
        if (drawable == null) {
            return;
        }
        if (!(drawable instanceof C226492gu) || (r0 = (C226492gu) drawable) == null || !r0.isFinished()) {
            if (this.A05) {
                A01(this);
            }
            float f = this.A08;
            float f2 = this.A09;
            int save = canvas.save();
            canvas.translate(f, f2);
            try {
                drawable.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void invalidateDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        if (drawable.equals(this.A01)) {
            invalidateSelf();
        }
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A05 = true;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public static final void A01(U1L u1l) {
        C226492gu r0;
        Drawable drawable = u1l.A01;
        if (drawable != null) {
            int A042 = AnonymousClass7TF.A04(u1l);
            if (drawable.getBounds().isEmpty()) {
                drawable.setBounds(0, 0, 1, 1);
            }
            if ((drawable instanceof C226492gu) && (r0 = (C226492gu) drawable) != null && r0.isPlaying() && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
                u1l.A05 = false;
                C16491Uvm uvm = u1l.A02;
                C16491Uvm uvm2 = C16491Uvm.SMALL;
                int A062 = AnonymousClass7TF.A06(u1l);
                int i = u1l.A00;
                if (uvm == uvm2) {
                    i /= 2;
                }
                Context context = u1l.A0A;
                int min = Math.min(A062 - i, C18092VlM.A00(context, 200.0f));
                int intrinsicHeight = (drawable.getIntrinsicHeight() * min) / drawable.getIntrinsicWidth();
                u1l.A08 = (float) (A042 - (min / 2));
                u1l.A09 = (float) ((u1l.getBounds().top - intrinsicHeight) + C18092VlM.A00(context, 2.0f));
                drawable.setBounds(0, 0, min, intrinsicHeight);
            }
        }
    }

    public U1L(Context context) {
        this.A0A = context;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AnonymousClass7TG.A1N(drawable, runnable);
        if (drawable.equals(this.A01)) {
            scheduleSelf(runnable, j);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AnonymousClass7TG.A1N(drawable, runnable);
        if (drawable.equals(this.A01)) {
            unscheduleSelf(runnable);
        }
    }
}
