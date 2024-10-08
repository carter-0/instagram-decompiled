package com.google.android.material.progressindicator;

import X.AnonymousClass0fD;
import X.AnonymousClass6Y1;
import X.AnonymousClass6Y6;
import X.C13989Tnp;
import X.C297855sT;
import X.C297865sU;
import X.C309206Xj;
import X.C309276Xq;
import X.C309306Xt;
import X.C309356Xy;
import X.UWK;
import X.UWM;
import X.UWN;
import X.V4M;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Property;
import com.instagram.android.R;

public final class LinearProgressIndicator extends C309206Xj {
    public final void A02(int i, boolean z) {
        C309276Xq r0 = this.A03;
        if (r0 == null || ((UWK) r0).A00 != 0 || !isIndeterminate()) {
            super.A02(i, z);
        }
    }

    public int getIndeterminateAnimationType() {
        return ((UWK) this.A03).A00;
    }

    public int getIndicatorDirection() {
        return ((UWK) this.A03).A01;
    }

    public void setIndeterminateAnimationType(int i) {
        C309356Xy uwn;
        UWK uwk = (UWK) this.A03;
        if (uwk.A00 == i) {
            return;
        }
        if (!A03() || !isIndeterminate()) {
            uwk.A00 = i;
            uwk.A00();
            AnonymousClass6Y1 indeterminateDrawable = getIndeterminateDrawable();
            if (i == 0) {
                uwn = new UWM(uwk);
            } else {
                Property property = UWN.A08;
                uwn = new UWN(getContext(), uwk);
            }
            indeterminateDrawable.A01 = uwn;
            uwn.A00 = indeterminateDrawable;
            invalidate();
            return;
        }
        throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
    }

    public void setIndicatorDirection(int i) {
        UWK uwk = (UWK) this.A03;
        uwk.A01 = i;
        boolean z = true;
        if (!(i == 1 || ((getLayoutDirection() == 1 && uwk.A01 == 2) || (getLayoutDirection() == 0 && i == 3)))) {
            z = false;
        }
        uwk.A02 = z;
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.6Xw, java.lang.Object, X.UWL] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.6Xt, X.6Y1, android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.6Xw, java.lang.Object, X.UWL] */
    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 2132018530);
        C309356Xy uwn;
        Context context2 = getContext();
        UWK uwk = (UWK) this.A03;
        Property property = C309306Xt.A0A;
        ? obj = new Object();
        obj.A00 = uwk;
        obj.A00 = 300.0f;
        if (uwk.A00 == 0) {
            uwn = new UWM(uwk);
        } else {
            uwn = new UWN(context2, uwk);
        }
        ? r0 = new C309306Xt(context2, uwk);
        r0.A00 = obj;
        obj.A01 = r0;
        r0.A01 = uwn;
        uwn.A00 = r0;
        setIndeterminateDrawable(r0);
        V4M v4m = AnonymousClass6Y6.A05;
        ? obj2 = new Object();
        obj2.A00 = uwk;
        obj2.A00 = 300.0f;
        setProgressDrawable(new AnonymousClass6Y6(context2, uwk, obj2));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.6Xq, X.UWK] */
    public final /* bridge */ /* synthetic */ C309276Xq A01(Context context, AttributeSet attributeSet) {
        ? r4 = new C309276Xq(context, attributeSet, R.attr.linearProgressIndicatorStyle, 2132018530);
        boolean z = false;
        TypedArray A00 = C297855sT.A00(context, attributeSet, C297865sU.A0H, new int[0], R.attr.linearProgressIndicatorStyle, 2132018530);
        r4.A00 = A00.getInt(0, 1);
        r4.A01 = A00.getInt(1, 0);
        A00.recycle();
        r4.A00();
        if (r4.A01 == 1) {
            z = true;
        }
        r4.A02 = z;
        return r4;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        UWK uwk = (UWK) this.A03;
        boolean z2 = true;
        if (!(uwk.A01 == 1 || ((getLayoutDirection() == 1 && uwk.A01 == 2) || (getLayoutDirection() == 0 && uwk.A01 == 3)))) {
            z2 = false;
        }
        uwk.A02 = z2;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(1747534472);
        int A0E = i - C13989Tnp.A0E(this);
        int A0H = i2 - C13989Tnp.A0H(this);
        AnonymousClass6Y1 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, A0E, A0H);
        }
        AnonymousClass6Y6 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, A0E, A0H);
        }
        AnonymousClass0fD.A0D(925142165, A06);
    }

    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        this.A03.A00();
    }

    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        this.A03.A00();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context) {
        this(context, (AttributeSet) null);
    }
}
