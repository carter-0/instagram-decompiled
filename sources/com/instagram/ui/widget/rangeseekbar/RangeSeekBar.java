package com.instagram.ui.widget.rangeseekbar;

import X.0mi;
import X.2Yu;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C13992Tns;
import X.C16488Uvj;
import X.C273424mY;
import X.C317396nC;
import X.X5F;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.instagram.android.R;

public class RangeSeekBar extends LinearLayout implements C273424mY {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04 = 0;
    public int A05;
    public X5F A06;
    public C16488Uvj A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public int A0C;
    public Paint A0D;
    public Paint A0E;
    public Paint A0F;
    public Paint A0G;
    public C317396nC A0H;
    public boolean A0I = false;

    public final boolean DAA(C317396nC r2, float f, float f2) {
        this.A0I = true;
        return false;
    }

    public final boolean DlG(C317396nC r2, float f, float f2) {
        return false;
    }

    public final void DvA(C317396nC r2) {
        this.A0I = false;
        invalidate();
    }

    private void A00() {
        X5F x5f = this.A06;
        if (x5f != null) {
            float f = this.A03;
            float f2 = this.A09;
            if (f > f2) {
                f = f2;
            }
            float f3 = this.A02;
            if (f3 <= f2) {
                f2 = f3;
            }
            float f4 = this.A01;
            float f5 = this.A00;
            x5f.DbS(f, f2, 0mi.A01(f, f4, f5, 0.0f, 1.0f), 0mi.A01(f2, f4, f5, 0.0f, 1.0f));
        }
    }

    private void A01(Context context) {
        this.A03 = Float.NaN;
        this.A02 = Float.NaN;
        this.A0H = new C317396nC(context, this);
        Resources resources = context.getResources();
        Paint paint = new Paint();
        this.A0D = paint;
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0D(context));
        this.A0D.setAntiAlias(true);
        this.A0D.setStrokeWidth(resources.getDimension(R.dimen.abc_control_corner_material));
        Paint paint2 = new Paint();
        this.A0E = paint2;
        AnonymousClass7TE.A1N(context, paint2, 2Yu.A08(context));
        this.A0E.setAntiAlias(true);
        this.A0E.setStrokeWidth(resources.getDimension(R.dimen.abc_control_corner_material));
        Paint paint3 = new Paint();
        this.A0G = paint3;
        AnonymousClass7TE.A1N(context, paint3, 2Yu.A0D(context));
        this.A0G.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.A0F = paint4;
        AnonymousClass7TE.A1N(context, paint4, 2Yu.A09(context));
        this.A0F.setAntiAlias(true);
        this.A0F.setAlpha(127);
        this.A0C = (int) resources.getDimension(R.dimen.accent_edge_thickness);
        this.A05 = (int) resources.getDimension(R.dimen.account_discovery_bottom_gap);
    }

    private int getLeftBound() {
        return this.A05;
    }

    private void setCurrentPosition(float f) {
        if (this.A07 != null) {
            float f2 = this.A01;
            float f3 = this.A00;
            float A012 = 0mi.A01(f, (float) this.A05, (float) (getWidth() - this.A05), f2, f3);
            if (this.A07 == C16488Uvj.START) {
                this.A03 = 0mi.A00(A012, f2, this.A02);
            } else {
                this.A02 = 0mi.A00(A012, this.A03, f3);
            }
            invalidate();
            A00();
        }
    }

    public final void A02(float f, float f2) {
        if (f < f2) {
            this.A01 = f;
            this.A09 = f2;
            this.A00 = ((float) this.A04) + f2;
            float f3 = this.A03;
            if (Float.isNaN(f3) && Float.isNaN(this.A02)) {
                this.A03 = f;
                f3 = f;
                this.A02 = f2;
            }
            boolean z = false;
            if (f3 < f) {
                this.A03 = f;
                z = true;
            }
            if (this.A02 > f2) {
                this.A02 = f2;
            } else if (!z) {
                return;
            }
            invalidate();
            A00();
            return;
        }
        throw new IllegalArgumentException("Minimum seekbar value equal or greater than maximum value");
    }

    public final void DAZ(C317396nC r2, float f, float f2, float f3, float f4, float f5) {
        this.A0B = C13992Tns.A00(this, this.A03);
        this.A0A = C13992Tns.A00(this, this.A02);
    }

    public C16488Uvj getCurrentThumb() {
        return this.A07;
    }

    public float getEndThumbX() {
        return C13992Tns.A00(this, this.A02);
    }

    public float getEndThumbXWithBuffer() {
        return C13992Tns.A00(this, this.A02 + ((float) this.A04));
    }

    public float getStartThumbX() {
        return C13992Tns.A00(this, this.A03);
    }

    public void setBufferSize(int i) {
        this.A04 = i;
    }

    public void setEndingRangeValue(float f) {
        if (f <= this.A09 && this.A03 <= f) {
            this.A02 = f;
            invalidate();
            A00();
        }
    }

    public void setRangeSeekBarChangeListener(X5F x5f) {
        this.A06 = x5f;
    }

    public void setStartingRangeValue(float f) {
        if (f >= this.A01 && f <= this.A02) {
            this.A03 = f;
            invalidate();
            A00();
        }
    }

    public RangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context);
    }

    private int getCenterY() {
        return getMeasuredHeight() / 2;
    }

    private int getRightBound() {
        return getWidth() - this.A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r2 < r1) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setCurrentThumb(float r4) {
        /*
            r3 = this;
            float r0 = r3.getEndThumbXWithBuffer()
            float r2 = X.AnonymousClass7TE.A00(r0, r4)
            float r0 = r3.A03
            float r0 = X.C13992Tns.A00(r3, r0)
            float r1 = X.AnonymousClass7TE.A00(r0, r4)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002f
            float r0 = r3.A03
            float r0 = X.C13992Tns.A00(r3, r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0033
            float r0 = r3.A03
            float r0 = X.C13992Tns.A00(r3, r0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
        L_0x002a:
            X.Uvj r0 = X.C16488Uvj.START
        L_0x002c:
            r3.A07 = r0
        L_0x002e:
            return
        L_0x002f:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x002a
        L_0x0033:
            X.Uvj r0 = X.C16488Uvj.END
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.rangeseekbar.RangeSeekBar.setCurrentThumb(float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        r3 = (int) X.DbU.A05(r9).getDimension(com.instagram.android.R.dimen.abc_dialog_padding_top_material);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C21001X8y r10) {
        /*
            r9 = this;
            com.instagram.common.ui.base.IgTextView r5 = r10.BTF()
            com.instagram.common.ui.base.IgTextView r6 = r10.BPP()
            float r0 = r10.BjB()
            int r2 = (int) r0
            float r0 = r10.Bj8()
            int r3 = (int) r0
            com.instagram.ui.widget.rangeseekbar.RangeSeekBar r8 = r10.BjA()
            float r4 = (float) r2
            float r1 = r9.A09
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x001e
            int r2 = (int) r1
        L_0x001e:
            X.C13988Tno.A15(r5, r2)
            float r2 = (float) r3
            float r1 = r9.A09
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0029
            int r3 = (int) r1
        L_0x0029:
            X.C13988Tno.A15(r6, r3)
            float r0 = r9.A09
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00ab
            float r7 = r9.A00
            float r3 = r9.A01
            int r0 = r9.A05
            float r2 = (float) r0
            int r1 = r9.getWidth()
            int r0 = r9.A05
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = X.0mi.A01(r7, r3, r7, r2, r0)
        L_0x0045:
            int r7 = (int) r0
            android.content.res.Resources r3 = r9.getResources()
            r2 = 2131165218(0x7f070022, float:1.7944647E38)
            float r0 = r3.getDimension(r2)
            int r0 = (int) r0
            int r7 = r7 - r0
            float r1 = r9.A09
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00a4
            float r0 = X.C13992Tns.A00(r9, r1)
        L_0x005d:
            int r4 = (int) r0
            float r0 = r3.getDimension(r2)
            int r0 = (int) r0
            int r4 = r4 - r0
            int r0 = r8.getWidth()
            if (r0 == 0) goto L_0x0081
            android.content.res.Resources r1 = X.DbU.A05(r9)
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            float r0 = r1.getDimension(r0)
            int r3 = (int) r0
            int r2 = r7 - r3
            if (r4 < r2) goto L_0x0081
            X.Uvj r1 = r8.A07
            X.Uvj r0 = X.C16488Uvj.START
            if (r1 != r0) goto L_0x00a1
            r4 = r2
        L_0x0081:
            int r1 = r8.getWidth()
            int r0 = r6.getWidth()
            int r1 = r1 - r0
            if (r7 < r1) goto L_0x0095
            int r7 = r8.getWidth()
            int r0 = r6.getWidth()
            int r7 = r7 - r0
        L_0x0095:
            float r0 = (float) r7
            r6.setX(r0)
            r0 = 0
            if (r4 <= 0) goto L_0x009d
            float r0 = (float) r4
        L_0x009d:
            r5.setX(r0)
            return
        L_0x00a1:
            int r7 = r4 + r3
            goto L_0x0081
        L_0x00a4:
            float r0 = r8.A03
            float r0 = X.C13992Tns.A00(r8, r0)
            goto L_0x005d
        L_0x00ab:
            float r0 = r8.getEndThumbXWithBuffer()
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.rangeseekbar.RangeSeekBar.A03(X.X8y):void");
    }

    public final boolean DAg(C317396nC r3, float f, float f2, float f3, float f4, boolean z) {
        ViewParent parent = getParent();
        parent.getClass();
        parent.requestDisallowInterceptTouchEvent(true);
        setCurrentThumb(this.A08);
        return true;
    }

    public final void dispatchDraw(Canvas canvas) {
        float A002;
        float endThumbXWithBuffer;
        float measuredHeight = (float) (getMeasuredHeight() / 2);
        float f = this.A03;
        float f2 = this.A09;
        if (f > f2) {
            A002 = C13992Tns.A00(this, f2);
        } else {
            A002 = C13992Tns.A00(this, f);
        }
        if (this.A02 > this.A09) {
            float f3 = this.A00;
            endThumbXWithBuffer = 0mi.A01(f3, this.A01, f3, (float) this.A05, (float) (getWidth() - this.A05));
        } else {
            endThumbXWithBuffer = getEndThumbXWithBuffer();
        }
        Canvas canvas2 = canvas;
        if (this.A0I) {
            float f4 = endThumbXWithBuffer;
            if (this.A07 == C16488Uvj.START) {
                f4 = A002;
            }
            canvas.drawCircle(f4, measuredHeight, (float) this.A05, this.A0F);
        } else {
            this.A07 = null;
        }
        canvas2.drawLine((float) this.A05, measuredHeight, (float) (getWidth() - this.A05), measuredHeight, this.A0E);
        canvas.drawLine(A002, measuredHeight, endThumbXWithBuffer, measuredHeight, this.A0D);
        canvas.drawCircle(A002, measuredHeight, (float) this.A0C, this.A0G);
        canvas.drawCircle(endThumbXWithBuffer, measuredHeight, (float) this.A0C, this.A0G);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        this.A08 = x;
        setCurrentThumb(x);
        if (this.A0B <= 0.0f) {
            this.A0B = C13992Tns.A00(this, this.A03);
        }
        float f = this.A0A;
        if (f <= 0.0f) {
            f = C13992Tns.A00(this, this.A02);
            this.A0A = f;
        }
        C16488Uvj uvj = this.A07;
        if (uvj == C16488Uvj.START) {
            this.A0H.A01(this.A0B, getY());
        } else if (uvj == C16488Uvj.END) {
            this.A0H.A01(f, getY());
        }
        return this.A0H.DL9(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(764571131);
        boolean DsV = this.A0H.DsV(motionEvent);
        AnonymousClass0fD.A0C(-2030258390, A052);
        return DsV;
    }

    public final void DAS(C317396nC r1, float f, float f2, float f3, boolean z) {
        setCurrentPosition(f);
    }

    public RangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context);
    }

    public RangeSeekBar(Context context) {
        super(context);
        A01(context);
    }
}
