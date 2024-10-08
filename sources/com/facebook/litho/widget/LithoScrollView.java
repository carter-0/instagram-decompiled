package com.facebook.litho.widget;

import X.002;
import X.03T;
import X.1Kl;
import X.2SK;
import X.2SO;
import X.2Sa;
import X.2V1;
import X.AnonymousClass0fD;
import X.C11519Sbg;
import X.C245483cy;
import X.C251303mt;
import X.C55826Ho9;
import X.C57806Igl;
import X.GIM;
import X.JLU;
import X.JLV;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import com.facebook.litho.BaseMountingView;
import com.facebook.litho.LithoView;
import java.util.List;
import java.util.Map;

public class LithoScrollView extends NestedScrollView implements C251303mt {
    public ViewTreeObserver.OnPreDrawListener A00;
    public JLU A01;
    public GIM A02;
    public C55826Ho9 A03;
    public String A04;
    public String A05;
    public final BaseMountingView A06;

    public LithoScrollView(Context context, BaseMountingView baseMountingView) {
        this(context, baseMountingView, (AttributeSet) null, 0);
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return super.dispatchNestedFling(f, f2, true);
    }

    public final void CsS(List list) {
        list.add(this.A06);
    }

    public BaseMountingView getRenderTreeView() {
        return this.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r2 <= r1) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            X.JLU r1 = r7.A01
            if (r1 == 0) goto L_0x0075
            X.GIL r1 = (X.GIL) r1
            X.8jr r0 = r1.A00
            r4 = 0
            r0.A01(r8, r7, r4)
            X.GGt r0 = r1.A01
            boolean r0 = r0.A0A
            r5 = 1
            if (r0 == 0) goto L_0x0045
            X.GIJ r6 = r1.A02
            X.0qQ.A0A(r8)
            r2 = 0
            X.0qQ.A0B(r8, r4)
            int r1 = r8.getAction()
            if (r1 == 0) goto L_0x004f
            if (r1 == r5) goto L_0x005c
            r0 = 2
            if (r1 != r0) goto L_0x0064
            float r1 = r8.getX()
            float r0 = r6.A00
            float r3 = X.AnonymousClass7TE.A00(r1, r0)
            float r1 = r8.getY()
            float r0 = r6.A01
            float r2 = X.AnonymousClass7TE.A00(r1, r0)
            float r1 = r6.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
        L_0x0045:
            if (r4 != 0) goto L_0x004e
        L_0x0047:
            boolean r0 = super.onInterceptTouchEvent(r8)
            if (r0 == 0) goto L_0x004e
            r4 = 1
        L_0x004e:
            return r4
        L_0x004f:
            float r0 = r8.getX()
            r6.A00 = r0
            float r0 = r8.getY()
            r6.A01 = r0
            goto L_0x0061
        L_0x005c:
            int r0 = r6.A02
            if (r0 != 0) goto L_0x0064
            r2 = -1
        L_0x0061:
            r6.A02 = r2
            goto L_0x0045
        L_0x0064:
            r6.A02 = r1
        L_0x0066:
            boolean r0 = r7.canScrollVertically(r5)
            if (r0 != 0) goto L_0x0073
            r0 = -1
            boolean r0 = r7.canScrollVertically(r0)
            if (r0 == 0) goto L_0x0045
        L_0x0073:
            r4 = 1
            goto L_0x0045
        L_0x0075:
            r4 = 0
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.widget.LithoScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setScrollPosition(GIM gim) {
        03T r1;
        if (gim == null) {
            setScrollY(0);
            getViewTreeObserver().removeOnPreDrawListener(this.A00);
            r1 = null;
        } else if (2Sa.useOneShotPreDrawListener) {
            r1 = 03T.A00(this, new C57806Igl(gim, this));
        } else {
            r1 = new C11519Sbg(0, this, gim);
            getViewTreeObserver().addOnPreDrawListener(r1);
        }
        this.A00 = r1;
    }

    public void setScrollStateListener(JLV jlv) {
        if (jlv != null) {
            C55826Ho9 ho9 = this.A03;
            if (ho9 == null) {
                ho9 = new C55826Ho9(this);
                this.A03 = ho9;
            }
            ho9.A00 = jlv;
            return;
        }
        C55826Ho9 ho92 = this.A03;
        if (ho92 != null) {
            ho92.A00 = null;
        }
    }

    public final void A0B(int i) {
        super.A0B(i);
        C55826Ho9 ho9 = this.A03;
        if (ho9 != null) {
            ho9.A01 = true;
        }
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0fD.A03(239423856);
        try {
            super.draw(canvas);
            C55826Ho9 ho9 = this.A03;
            if (ho9 != null && ho9.A01 && !ho9.A04) {
                if (!ho9.A02) {
                    ho9.A04 = true;
                    ho9.A01 = false;
                }
                ho9.A02 = false;
            }
            AnonymousClass0fD.A0A(2132074964, A032);
        } catch (Throwable th) {
            1Kl A002 = 2SK.A00();
            2SO r5 = 2SO.A03;
            String str = this.A05;
            if (str == null) {
                str = "null";
            }
            A002.EFY(r5, "LITHO:NPE:LITHO_SCROLL_VIEW_DRAW", 002.A0R("Root component: ", str), th, (Map) null, 0);
            C245483cy r1 = new C245483cy((2V1) null, this.A05, this.A04, th);
            AnonymousClass0fD.A0A(-616900510, A032);
            throw r1;
        }
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.A06.CsJ();
        GIM gim = this.A02;
        if (gim != null) {
            gim.A00 = getScrollY();
        }
        C55826Ho9 ho9 = this.A03;
        if (ho9 != null) {
            if (!ho9.A03 && !ho9.A04) {
                ho9.A03 = true;
            }
            ho9.A02 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r4.A04 != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r7.getAction() != 3) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 1924110773(0x72af99b5, float:6.956249E30)
            int r3 = X.AnonymousClass0fD.A05(r0)
            boolean r5 = super.onTouchEvent(r7)
            X.Ho9 r4 = r6.A03
            if (r4 == 0) goto L_0x0038
            int r0 = r7.getAction()
            r2 = 1
            if (r0 == 0) goto L_0x003f
            int r1 = r7.getAction()
            r0 = 2
            if (r1 == r0) goto L_0x003f
            int r0 = r7.getAction()
            if (r0 == r2) goto L_0x002a
            int r1 = r7.getAction()
            r0 = 3
            if (r1 != r0) goto L_0x0038
        L_0x002a:
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0038
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0038
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0038
        L_0x0036:
            r4.A04 = r2
        L_0x0038:
            r0 = -1495992153(0xffffffffa6d4f8a7, float:-1.4777852E-15)
            X.AnonymousClass0fD.A0C(r0, r3)
            return r5
        L_0x003f:
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0049
            r2 = 0
            r4.A03 = r2
            r4.A01 = r2
            goto L_0x0036
        L_0x0049:
            r0 = 0
            r4.A01 = r0
            r4.A02 = r2
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.widget.LithoScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnInterceptTouchListener(JLU jlu) {
        this.A01 = jlu;
    }

    public LithoScrollView(Context context, BaseMountingView baseMountingView, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = baseMountingView;
        addView(baseMountingView);
    }

    public LithoScrollView(Context context, AttributeSet attributeSet, int i) {
        this(context, new LithoView(context), attributeSet, i);
    }

    public LithoScrollView(Context context) {
        this(context, (BaseMountingView) new LithoView(context));
    }

    public LithoScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
