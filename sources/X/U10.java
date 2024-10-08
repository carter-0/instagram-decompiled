package X;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;

public final class U10 extends Drawable {
    public static final Handler A09 = AnonymousClass7TF.A0D();
    public float A00;
    public int A01;
    public int A02 = 128;
    public long A03 = -1;
    public boolean A04;
    public RectF A05;
    public final Paint A06;
    public final Runnable A07 = new Wj9(this);
    public final Runnable A08 = new Wj8(this);

    public final int getOpacity() {
        return -3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            long r6 = r8.A03
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0046
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r6
            r1 = 400(0x190, double:1.976E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0046
            float r3 = (float) r4
            r2 = 1128792064(0x43480000, float:200.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            float r0 = X.0mi.A01(r3, r1, r2, r0, r1)
            r8.A00 = r0
            float r0 = java.lang.Math.max(r0, r1)
            r8.A00 = r0
            r3 = 1
        L_0x0026:
            android.graphics.Paint r2 = r8.A06
            int r0 = r8.A02
            float r1 = (float) r0
            float r0 = r8.A00
            float r1 = r1 * r0
            int r1 = (int) r1
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            int r1 = r1 * r0
            r2.setColor(r1)
            android.graphics.RectF r1 = r8.A05
            X.C13988Tno.A0v(r1, r8)
            int r0 = r8.A01
            float r0 = (float) r0
            r9.drawRoundRect(r1, r0, r0, r2)
            if (r3 == 0) goto L_0x0045
            r8.invalidateSelf()
        L_0x0045:
            return
        L_0x0046:
            r3 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U10.draw(android.graphics.Canvas):void");
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
    }

    public U10() {
        Paint paint = new Paint();
        this.A06 = paint;
        AnonymousClass7TE.A1Q(paint);
        paint.setColor(-65536);
        this.A05 = new RectF();
    }

    public final void A00(MotionEvent motionEvent) {
        Handler handler;
        Runnable runnable;
        long j;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 3) {
                    return;
                }
                if (this.A04) {
                    this.A04 = false;
                    A09.removeCallbacks(this.A08);
                    return;
                }
            } else if (this.A04) {
                handler = A09;
                runnable = this.A07;
                j = 200;
            }
            this.A03 = System.currentTimeMillis();
            this.A04 = false;
            invalidateSelf();
            return;
        }
        handler = A09;
        handler.removeCallbacks(this.A07);
        this.A04 = true;
        runnable = this.A08;
        j = 75;
        handler.postDelayed(runnable, j);
    }
}
