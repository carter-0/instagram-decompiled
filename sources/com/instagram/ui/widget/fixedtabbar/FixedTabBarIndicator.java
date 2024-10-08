package com.instagram.ui.widget.fixedtabbar;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C61380mr;
import X.C61670oa;
import X.C66582MXn;
import X.JTO;
import X.JTR;
import X.SN3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public final class FixedTabBarIndicator extends View {
    public int A00;
    public int A01 = -1;
    public List A02;
    public boolean A03;
    public int A04;
    public boolean A05;
    public final Paint A06 = JTO.A0C();
    public final Rect A07 = AnonymousClass7TE.A0W();

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        List list = this.A02;
        if (list != null && !list.isEmpty() && this.A01 >= 0) {
            canvas.drawRect(this.A07, this.A06);
        }
    }

    public final void setTabs(List list) {
        0qQ.A0B(list, 0);
        List list2 = this.A02;
        if (list2 == null || list2.size() != list.size()) {
            this.A05 = true;
        }
        this.A02 = list;
    }

    public final void A00(int i, float f) {
        this.A01 = i;
        Rect rect = this.A07;
        rect.offsetTo((int) (((float) this.A04) * (((float) i) + f)), 0);
        if (C61670oa.A0E()) {
            rect.offset((this.A04 - rect.width()) / 2, 0);
        }
        postInvalidateOnAnimation();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        List list = this.A02;
        if ((this.A05 || z) && list != null && !list.isEmpty()) {
            this.A05 = false;
            this.A03 = true;
            View A0U = JTR.A0U(this);
            this.A04 = C66582MXn.A04(A0U, A0U.getWidth()) / list.size();
            if (C61670oa.A0E()) {
                int i5 = this.A00;
                Context A0S = AnonymousClass7TE.A0S(this);
                this.A07.set(0, 0, i5 + C61380mr.A01(A0S, 20) + C61380mr.A01(A0S, 20), getHeight());
            } else {
                this.A07.set(0, 0, this.A04, getHeight());
            }
            int i6 = this.A01;
            if (i6 >= 0) {
                A00(i6, 0.0f);
            }
        }
    }

    public FixedTabBarIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int i, int i2) {
        if (C61670oa.A0E()) {
            i2 = View.MeasureSpec.makeMeasureSpec(AnonymousClass7TG.A04(AnonymousClass7TE.A0S(this)), SN3.MAX_SIGNED_POWER_OF_TWO);
        }
        super.onMeasure(i, i2);
    }

    public final void setLongestContentWidth(int i) {
        this.A00 = i;
    }

    public FixedTabBarIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FixedTabBarIndicator(Context context) {
        super(context);
    }
}
