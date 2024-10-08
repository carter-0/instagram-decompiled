package com.google.android.material.progressindicator;

import X.AnonymousClass6Y6;
import X.C309206Xj;
import X.C309266Xp;
import X.C309276Xq;
import X.C309306Xt;
import X.C309346Xx;
import X.V4M;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import com.instagram.android.R;

public final class CircularProgressIndicator extends C309206Xj {
    public CircularProgressIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getIndicatorDirection() {
        return ((C309266Xp) this.A03).A00;
    }

    public int getIndicatorInset() {
        return ((C309266Xp) this.A03).A01;
    }

    public int getIndicatorSize() {
        return ((C309266Xp) this.A03).A02;
    }

    public void setIndicatorDirection(int i) {
        ((C309266Xp) this.A03).A00 = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        C309266Xp r1 = (C309266Xp) this.A03;
        if (r1.A01 != i) {
            r1.A01 = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        C309276Xq r2 = this.A03;
        int max = Math.max(i, r2.A04 * 2);
        C309266Xp r22 = (C309266Xp) r2;
        if (r22.A02 != max) {
            r22.A02 = max;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.6Xw, X.6Xv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.6Xt, X.6Y1, android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.6Xw, X.6Xv, java.lang.Object] */
    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 2132018523);
        Context context2 = getContext();
        C309266Xp r4 = (C309266Xp) this.A03;
        Property property = C309306Xt.A0A;
        ? obj = new Object();
        obj.A00 = r4;
        obj.A03 = 1;
        C309346Xx r1 = new C309346Xx(r4);
        ? r0 = new C309306Xt(context2, r4);
        r0.A00 = obj;
        obj.A01 = r0;
        r0.A01 = r1;
        r1.A00 = r0;
        setIndeterminateDrawable(r0);
        V4M v4m = AnonymousClass6Y6.A05;
        ? obj2 = new Object();
        obj2.A00 = r4;
        obj2.A03 = 1;
        setProgressDrawable(new AnonymousClass6Y6(context2, r4, obj2));
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }
}
