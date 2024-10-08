package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;

public final class NEp extends C67649Mrc {
    public float A00;
    public int A01;
    public AnonymousClass61R A02;
    public AnonymousClass61R A03;
    public AnonymousClass61R A04;
    public boolean A05 = true;
    public final int A06;
    public final float A07;

    public NEp(Context context, AnonymousClass7NF r5, float f) {
        this.A07 = f;
        this.A06 = C18092VlM.A00(context, 125.0f);
        r5.A02(new C74179PqL(this, 33), new C69357Njw[]{C69357Njw.CRY_WAVE_TOP_SM, C69357Njw.CRY_WAVE_TOP_LG});
    }

    public final void draw(Canvas canvas) {
        AnonymousClass61R r3;
        AnonymousClass61R r2;
        0qQ.A0B(canvas, 0);
        if (!(!this.A05 || (r3 = this.A04) == null || (r2 = this.A03) == null)) {
            if (AnonymousClass7TF.A06(this) >= this.A06) {
                r3 = r2;
            }
            if (!r3.equals(this.A02)) {
                AnonymousClass61R r0 = this.A02;
                if (r0 != null) {
                    r0.stop();
                }
                this.A02 = r3;
            }
            int A062 = AnonymousClass7TF.A06(this);
            this.A01 = (r3.getIntrinsicHeight() * A062) / r3.getIntrinsicWidth();
            this.A00 = (float) (AnonymousClass7TF.A04(this) - (A062 / 2));
            r3.setBounds(0, 0, A062, this.A01);
            r3.E2p();
        }
        this.A05 = false;
        float f = this.A07;
        float f2 = (-f) * 0.88f;
        float f3 = (f * 2.0f) / ((float) this.A01);
        float f4 = 1.0f / f3;
        int A002 = C67649Mrc.A00(canvas, this, f3);
        try {
            float f5 = this.A00;
            float f6 = f2 * f4;
            A002 = canvas.save();
            canvas.translate(f5, f6);
            AnonymousClass61R r02 = this.A02;
            if (r02 != null) {
                r02.draw(canvas);
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            canvas.restoreToCount(A002);
        }
    }

    public final int getOpacity() {
        return -3;
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
}
