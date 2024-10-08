package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.NEq  reason: case insensitive filesystem */
public final class C68386NEq extends C67649Mrc {
    public float A00;
    public AnonymousClass61R A01;
    public boolean A02 = true;
    public final float A03;
    public final Path A04 = C51965G9l.A0C();
    public final RectF A05 = AnonymousClass7TE.A0Y();

    public C68386NEq(AnonymousClass7NF r4, float f) {
        this.A03 = f;
        r4.A02(new C74179PqL(this, 32), new C69357Njw[]{C69357Njw.ANGRY_THREAD});
    }

    public final void draw(Canvas canvas) {
        AnonymousClass61R r4;
        0qQ.A0B(canvas, 0);
        if (this.A02 && (r4 = this.A01) != null) {
            int A06 = AnonymousClass7TF.A06(this);
            int i = 600;
            if (600 < A06) {
                i = A06;
            }
            int intrinsicHeight = (r4.getIntrinsicHeight() * i) / r4.getIntrinsicWidth();
            this.A00 = (float) (AnonymousClass7TF.A04(this) - (i / 2));
            r4.setBounds(0, 0, i, intrinsicHeight);
        }
        this.A02 = false;
        AnonymousClass61R r1 = this.A01;
        if (r1 != null && !r1.isPlaying()) {
            r1.E2p();
        }
        Path path = this.A04;
        path.rewind();
        RectF rectF = this.A05;
        float f = this.A03;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            int save2 = canvas.save();
            canvas.scale(1.5f, 1.5f, (float) AnonymousClass7TF.A04(this), 0.0f);
            try {
                float f2 = this.A00;
                save = canvas.save();
                canvas.translate(f2, 0.0f);
                AnonymousClass61R r0 = this.A01;
                if (r0 != null) {
                    r0.draw(canvas);
                }
                canvas.restoreToCount(save2);
                canvas.restoreToCount(save);
            } catch (Throwable th) {
                canvas.restoreToCount(save2);
                throw th;
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A02 = true;
        C67649Mrc.A01(rect, this.A05);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (!z) {
            AnonymousClass61R r0 = this.A01;
            if (r0 != null) {
                r0.stop();
            }
            AnonymousClass61R r1 = this.A01;
            if (r1 != null) {
                r1.EL2(0.0f);
            }
        }
        return super.setVisible(z, z2);
    }
}
