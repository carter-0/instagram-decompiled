package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class NEs extends C67649Mrc {
    public float A00;
    public int A01;
    public int A02;
    public AnonymousClass61R A03;
    public AnonymousClass61R A04;
    public AnonymousClass61R A05;
    public AnonymousClass61R A06;
    public AnonymousClass61R A07;
    public AnonymousClass61R A08;
    public AnonymousClass61R A09;
    public AnonymousClass61R A0A;
    public boolean A0B = true;
    public float A0C;
    public final int A0D;
    public final float A0E;

    public NEs(Context context, AnonymousClass7NF r8, float f) {
        this.A0E = f;
        this.A0D = C18092VlM.A00(context, 125.0f);
        r8.A02(new C74179PqL(this, 35), new C69357Njw[]{C69357Njw.LAUGH_IDLE_WAVE_TOP_SM, C69357Njw.LAUGH_IDLE_WAVE_BOTTOM_SM, C69357Njw.LAUGH_IDLE_WAVE_TOP_LG, C69357Njw.LAUGH_IDLE_WAVE_BOTTOM_LG, C69357Njw.LAUGH_IDLE_ECHO_LEFT, C69357Njw.LAUGH_IDLE_ECHO_RIGHT});
    }

    /* JADX INFO: finally extract failed */
    public final void draw(Canvas canvas) {
        AnonymousClass61R r3;
        AnonymousClass61R r5;
        AnonymousClass61R r2;
        0qQ.A0B(canvas, 0);
        if (this.A0B) {
            AnonymousClass61R r6 = this.A08;
            if (!(r6 == null || (r3 = this.A06) == null || (r5 = this.A07) == null || (r2 = this.A05) == null)) {
                if (AnonymousClass7TF.A06(this) >= this.A0D) {
                    r6 = r3;
                    r5 = r2;
                }
                if (!r6.equals(this.A0A) || !r5.equals(this.A09)) {
                    AnonymousClass61R r0 = this.A0A;
                    if (r0 != null) {
                        r0.stop();
                    }
                    AnonymousClass61R r02 = this.A09;
                    if (r02 != null) {
                        r02.stop();
                    }
                    this.A0A = r6;
                    this.A09 = r5;
                }
                for (Drawable drawable : 0sr.A1P(new AnonymousClass61R[]{r6, r5})) {
                    int A062 = AnonymousClass7TF.A06(this);
                    this.A02 = A062;
                    this.A01 = (A062 * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth();
                    int A042 = AnonymousClass7TF.A04(this);
                    int i = this.A02;
                    this.A00 = (float) (A042 - (i / 2));
                    drawable.setBounds(0, 0, i, this.A01);
                }
                r6.E2p();
                r5.E2p();
            }
            A02(this.A03);
            A02(this.A04);
        }
        this.A0B = false;
        float f = this.A0C / 2.0f;
        float f2 = 0.0f - f;
        int save = canvas.save();
        canvas.translate(f2, f2);
        try {
            AnonymousClass61R r03 = this.A03;
            if (r03 != null) {
                r03.draw(canvas);
            }
            canvas.restoreToCount(save);
            float f3 = this.A0E;
            float f4 = (-f3) * 0.88f;
            float f5 = (f3 * 2.0f) / ((float) this.A01);
            float f6 = 1.0f / f5;
            int A002 = C67649Mrc.A00(canvas, this, f5);
            A002 = canvas.save();
            canvas.translate(this.A00, f4 * f6);
            try {
                AnonymousClass61R r04 = this.A0A;
                if (r04 != null) {
                    r04.draw(canvas);
                }
                canvas.restoreToCount(A002);
                A002 = C67649Mrc.A00(canvas, this, f5 * -1.0f);
                A002 = canvas.save();
                canvas.translate(this.A00, (f4 - ((float) JTP.A06(this))) * f6);
                AnonymousClass61R r05 = this.A09;
                if (r05 != null) {
                    r05.draw(canvas);
                }
                canvas.restoreToCount(A002);
                int save2 = canvas.save();
                canvas.scale(-1.0f, -1.0f, 0.0f, 0.0f);
                try {
                    save2 = canvas.save();
                    canvas.translate((0.0f - ((float) AnonymousClass7TF.A06(this))) - f, (0.0f - ((float) JTP.A06(this))) - f);
                    AnonymousClass61R r06 = this.A04;
                    if (r06 != null) {
                        r06.draw(canvas);
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                    canvas.restoreToCount(save2);
                }
            } catch (Throwable th2) {
                throw th2;
            } finally {
                canvas.restoreToCount(A002);
            }
        } catch (Throwable th3) {
            canvas.restoreToCount(save);
            throw th3;
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A0B = true;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private final void A02(AnonymousClass61R r4) {
        if (r4 != null) {
            this.A0C = 150.0f;
            r4.setBounds(0, 0, 150, (int) ((150.0f * ((float) r4.getIntrinsicHeight())) / ((float) r4.getIntrinsicWidth())));
            r4.E2p();
        }
    }
}
