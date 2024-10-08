package com.instagram.ui.widget.refresh;

import X.03N;
import X.04k;
import X.2cs;
import X.AnonymousClass03M;
import X.AnonymousClass03P;
import X.AnonymousClass0fD;
import X.AnonymousClass0nB;
import X.AnonymousClass3AF;
import X.AnonymousClass3AG;
import X.C19763Wf4;
import X.C228252l5;
import X.C238813Dn;
import X.C252203oj;
import X.C586203k;
import X.C61340me;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;

public class RefreshableNestedScrollingParent extends FrameLayout implements C252203oj, AnonymousClass03M {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public C19763Wf4 A05;
    public C228252l5 A06;
    public C238813Dn A07;
    public AnonymousClass3AG A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public boolean A0E;
    public boolean A0F;
    public final 03N A0G;
    public final AnonymousClass03P A0H;
    public final 2cs A0I;

    public RefreshableNestedScrollingParent(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas);
        View view = this.A04;
        if (!this.A0F && view != null) {
            canvas.save();
            int i = this.A03 - this.A01;
            canvas.translate(0.0f, (float) this.A02);
            AnonymousClass3AG r4 = this.A08;
            if (r4 != null) {
                r4.EEy(canvas2, view, this, (float) (this.A0I.A09.A00 / ((double) i)), i, this.A0E);
            }
            canvas.restore();
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = i4;
        if (!this.A0A && !this.A0F) {
            2cs r6 = this.A0I;
            float f = (float) r6.A09.A00;
            int i6 = this.A0D;
            int i7 = -i5;
            if (i6 == 0) {
                i7 = i5;
            }
            float f2 = (float) i7;
            float f3 = f - f2;
            float f4 = (float) (this.A03 - this.A01);
            float f5 = this.A00 * f4;
            if (f3 > f5) {
                f3 = f + (f - ((float) Math.sqrt((double) Math.max(0.0f, (f2 * f5) + (f * f)))));
            }
            float max = Math.max(0.0f, f3);
            r6.A08((double) max, true);
            int i8 = (int) (max - f);
            if (i6 != 0) {
                i8 = -i8;
            }
            dispatchNestedScroll(i, i8, i3, i4 - i8, (int[]) null);
            C228252l5 r0 = this.A06;
            if (r0 != null) {
                r0.E5B(f / f4, max / f4);
            }
        }
    }

    public static void A00(RefreshableNestedScrollingParent refreshableNestedScrollingParent, boolean z, boolean z2) {
        float f;
        View view;
        if (!refreshableNestedScrollingParent.A0F) {
            if (refreshableNestedScrollingParent.A0B != z) {
                refreshableNestedScrollingParent.A0B = z;
                AnonymousClass3AG r0 = refreshableNestedScrollingParent.A08;
                if (r0 != null) {
                    r0.EaP(z);
                }
            }
            if (z2) {
                if (z) {
                    f = (float) (refreshableNestedScrollingParent.A03 - refreshableNestedScrollingParent.A01);
                } else {
                    f = 0.0f;
                }
                2cs r3 = refreshableNestedScrollingParent.A0I;
                float f2 = (float) r3.A09.A00;
                r3.A06((double) f);
                if (f2 != f && (view = refreshableNestedScrollingParent.A04) != null && (view instanceof AnonymousClass03M) && !z) {
                    refreshableNestedScrollingParent.stopNestedScroll();
                }
            }
        }
    }

    private int getkeyboardOffsetRefreshIndicatorHeight() {
        return this.A03 - this.A01;
    }

    public final boolean A01() {
        if (this.A0F || this.A0I.A09.A00 <= ((double) (this.A03 - this.A01))) {
            return false;
        }
        return true;
    }

    public final void DmE(2cs r6) {
        View view = this.A04;
        if (view != null && !this.A0F) {
            float f = (float) r6.A09.A00;
            float f2 = -f;
            if (this.A0D == 0) {
                f2 = f;
            }
            view.setTranslationY(f2);
            invalidate(0, 0, getWidth(), (int) f);
            C238813Dn r2 = this.A07;
            if (f >= ((float) (this.A03 - this.A01)) && !this.A0B && r2 != null && this.A0E) {
                A00(this, true, false);
                r2.Dcp();
            }
        }
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A0G.A04(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.A0G.A03(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0G.A07(iArr, iArr2, i, i2, 0);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A0G.A06(i, i2, i3, i4, iArr);
    }

    public int getNestedScrollAxes() {
        AnonymousClass03P r0 = this.A0H;
        return r0.A01 | r0.A00;
    }

    public int getRefreshingDistance() {
        return this.A03;
    }

    public final boolean hasNestedScrollingParent() {
        if (this.A0G.A01 != null) {
            return true;
        }
        return false;
    }

    public final boolean isNestedScrollingEnabled() {
        return this.A0G.A02;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.A0G.A03(f, f2);
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.A0A || this.A0F) {
            iArr[0] = 0;
            iArr[1] = 0;
            C19763Wf4 wf4 = this.A05;
            if (wf4 != null) {
                wf4.ARa();
                return;
            }
            return;
        }
        2cs r5 = this.A0I;
        float f = (float) r5.A09.A00;
        int i3 = this.A0D;
        int i4 = -i2;
        if (i3 == 0) {
            i4 = i2;
        }
        if (f <= 0.0f || i4 <= 0) {
            C19763Wf4 wf42 = this.A05;
            if (wf42 != null) {
                wf42.APL();
            }
        } else {
            float max = Math.max(0.0f, f - ((float) i4));
            r5.A08((double) max, true);
            int i5 = (int) (f - max);
            if (i3 != 0) {
                i5 = -i5;
            }
            iArr[1] = i5;
            C19763Wf4 wf43 = this.A05;
            if (wf43 != null) {
                wf43.ARa();
            }
        }
        dispatchNestedPreScroll(i, i2, iArr, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        if (!this.A0F) {
            this.A0C = (int) this.A0I.A09.A00;
        }
        this.A04 = view2;
        this.A0H.A01 = i;
        startNestedScroll(2);
        this.A0E = true;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || !isEnabled()) {
            return false;
        }
        return true;
    }

    public final void onStopNestedScroll(View view) {
        boolean z = true;
        if (!this.A0F) {
            2cs r3 = this.A0I;
            if (((double) this.A0C) != r3.A09.A00 && r3.A0C()) {
                if (!A01() || !this.A0B) {
                    z = false;
                }
                setRefreshing(z);
                this.A0H.A01 = 0;
                stopNestedScroll();
                this.A0E = false;
            }
        }
        C19763Wf4 wf4 = this.A05;
        if (wf4 != null) {
            wf4.ARa();
        }
        this.A0H.A01 = 0;
        stopNestedScroll();
        this.A0E = false;
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.A0G.A02(z);
    }

    public void setPTRSpinnerListener(C19763Wf4 wf4) {
        this.A05 = wf4;
        this.A0F = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r6.A0I.A09.A00 != 0.0d) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRefreshing(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0F
            if (r0 != 0) goto L_0x0017
            if (r7 == 0) goto L_0x0013
            X.2cs r0 = r6.A0I
            X.2ct r0 = r0.A09
            double r4 = r0.A00
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            A00(r6, r7, r0)
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent.setRefreshing(boolean):void");
    }

    public void setRefreshingDistance(int i) {
        if (i != this.A03) {
            this.A03 = i;
        }
    }

    public final boolean startNestedScroll(int i) {
        int i2;
        int i3 = 0;
        if (this.A09) {
            int A002 = AnonymousClass0nB.A00(getContext());
            04k A003 = C586203k.A00(this);
            if (A003 != null && (i2 = A003.A00.A05(8).A00) > 0 && A002 > 0 && i2 < A002) {
                i3 = (this.A03 * i2) / A002;
            }
        }
        this.A01 = i3;
        return this.A0G.A05(i, 0);
    }

    public final void stopNestedScroll() {
        this.A0G.A01(0);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-607004218);
        super.onAttachedToWindow();
        if (!this.A0F) {
            this.A0I.A0A(this);
        }
        AnonymousClass0fD.A0D(-966360282, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-749896235);
        super.onDetachedFromWindow();
        if (!this.A0F) {
            this.A0I.A0B(this);
            AnonymousClass3AG r0 = this.A08;
            if (r0 != null) {
                r0.D8Z(this);
            }
        }
        AnonymousClass0fD.A0D(1851313911, A062);
    }

    public void setForceDisableNestedScrolling(boolean z) {
        this.A0A = z;
    }

    public void setListener(C238813Dn r1) {
        this.A07 = r1;
    }

    public void setPullDownProgressDelegate(C228252l5 r1) {
        this.A06 = r1;
    }

    public void setRefreshDrawableVerticalOffset(int i) {
        this.A02 = i;
    }

    public void setRenderer(AnonymousClass3AG r1) {
        this.A08 = r1;
    }

    public void setScrollFrictionCutoffMultiplier(float f) {
        this.A00 = f;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.03P] */
    public RefreshableNestedScrollingParent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = 0;
        this.A01 = 0;
        this.A09 = false;
        this.A0H = new Object();
        this.A0G = new 03N(this);
        2cs A022 = C61340me.A00().A02();
        A022.A06 = true;
        this.A0I = A022;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A1w, 0, 0);
        try {
            this.A0D = obtainStyledAttributes.getInt(2, 0);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.action_button_min_width));
            this.A00 = obtainStyledAttributes.getFloat(0, 1.4f);
            this.A08 = new AnonymousClass3AF(this, obtainStyledAttributes.getBoolean(3, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public RefreshableNestedScrollingParent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
