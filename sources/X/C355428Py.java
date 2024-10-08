package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.8Py  reason: invalid class name and case insensitive filesystem */
public final class C355428Py extends View {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public C355258Ph A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public float A09;
    public float A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final Paint A0E;
    public final RectF A0F = new RectF();

    public C355428Py(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.A0E = paint;
        this.A07 = true;
        this.A00 = 1.0f;
        this.A09 = -1.0f;
        setLayerType(1, (Paint) null);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A0D = dimensionPixelSize;
        this.A04 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material) + (dimensionPixelSize * 2);
        this.A03 = resources.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint.setShadowLayer((float) dimensionPixelSize, 0.0f, 0.0f, resources.getColor(R.color.black_40_transparent));
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        float seekThumbOffset = getSeekThumbOffset();
        RectF rectF = this.A0F;
        int i = this.A0D;
        float f = (float) i;
        rectF.set(f + seekThumbOffset, f, (seekThumbOffset + ((float) this.A04)) - f, (float) (getHeight() - i));
        float f2 = (float) this.A03;
        canvas.drawRoundRect(rectF, f2, f2, this.A0E);
    }

    private final void A00(float f) {
        float width;
        float f2;
        float f3;
        C355258Ph r0;
        if (!this.A08 || !this.A07) {
            width = f / ((float) (getWidth() - this.A04));
            f2 = this.A01;
            f3 = this.A00 - 0.001f;
        } else {
            width = f / ((float) (getWidth() - this.A04));
            f2 = 0.0f;
            f3 = 1.0f;
        }
        float min = Math.min(Math.max(f2, f3), Math.max(Math.min(f2, f3), width));
        this.A02 = min;
        if (!(this.A09 == min || (r0 = this.A05) == null)) {
            r0.DiQ(min);
        }
        this.A09 = this.A02;
        invalidate();
    }

    private final boolean A01(float f) {
        float width;
        if (this.A07) {
            if (0.0f > f) {
                return false;
            }
            width = (float) getWidth();
        } else if (this.A01 * ((float) getWidth()) > f) {
            return false;
        } else {
            width = this.A00 * ((float) getWidth());
        }
        if (f <= width) {
            return true;
        }
        return false;
    }

    private final float getSeekThumbOffset() {
        return this.A02 * ((float) (getWidth() - this.A04));
    }

    public final float getSeekbarValue() {
        return this.A02;
    }

    public final void setSeekbarValue(float f) {
        if (!this.A0C) {
            this.A02 = f;
            invalidate();
        }
    }

    public final void setSeekerWidth(int i) {
        this.A04 = i + (this.A0D * 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        if (r0 > 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        if (A01(r2) != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        r5.A0C = true;
        r5.A0B = true;
        r0 = r5.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0085, code lost:
        if (r0 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        r0.Dsi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
        if (r1 != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        A00(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 1830979052(0x6d2285ec, float:3.1436546E27)
            int r3 = X.AnonymousClass0fD.A05(r0)
            r2 = 0
            X.0qQ.A0B(r6, r2)
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x0016
            r0 = 690444613(0x29275945, float:3.7158878E-14)
        L_0x0012:
            X.AnonymousClass0fD.A0C(r0, r3)
            return r2
        L_0x0016:
            int r1 = r6.getAction()
            r4 = 1
            if (r1 == 0) goto L_0x005b
            if (r1 == r4) goto L_0x0098
            r0 = 2
            if (r1 == r0) goto L_0x0029
            r0 = 3
            if (r1 == r0) goto L_0x0098
            r0 = -362751512(0xffffffffea60d9e8, float:-6.7957104E25)
            goto L_0x0012
        L_0x0029:
            float r2 = r6.getX()
            float r0 = r5.A0A
            float r1 = r2 - r0
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x0047
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x004f
            float r0 = r5.getSeekThumbOffset()
            float r0 = r0 + r1
            r5.A00(r0)
            boolean r0 = r5.A01(r2)
            r5.A0B = r0
        L_0x0047:
            r5.A0A = r2
            boolean r2 = r5.A0C
            r0 = -824023035(0xffffffffcee26805, float:-1.89923392E9)
            goto L_0x0012
        L_0x004f:
            boolean r0 = r5.A01(r2)
            if (r0 == 0) goto L_0x0047
            r5.A0B = r4
            r5.A00(r2)
            goto L_0x0047
        L_0x005b:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.A09 = r0
            float r2 = r6.getX()
            float r1 = r5.getSeekThumbOffset()
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0074
            int r0 = r5.A04
            float r0 = (float) r0
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x007f
        L_0x0074:
            r1 = 0
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x008f
            boolean r0 = r5.A01(r2)
            if (r0 == 0) goto L_0x008f
        L_0x007f:
            r5.A0C = r4
            r5.A0B = r4
            X.8Ph r0 = r5.A05
            if (r0 == 0) goto L_0x008a
            r0.Dsi()
        L_0x008a:
            if (r1 != 0) goto L_0x008f
            r5.A00(r2)
        L_0x008f:
            r5.A0A = r2
            boolean r2 = r5.A0C
            r0 = 433543412(0x19d758f4, float:2.2266407E-23)
            goto L_0x0012
        L_0x0098:
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x00a3
            X.8Ph r0 = r5.A05
            if (r0 == 0) goto L_0x00a3
            r0.Dsg()
        L_0x00a3:
            r5.A0C = r2
            r5.A0B = r2
            r0 = 1193829723(0x4728655b, float:43109.355)
            X.AnonymousClass0fD.A0C(r0, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355428Py.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setListener(C355258Ph r1) {
        this.A05 = r1;
    }

    public final void setSeekerCornerRadius(int i) {
        this.A03 = i;
    }
}
