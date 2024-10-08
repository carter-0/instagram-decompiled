package com.instagram.creation.capture;

import X.0qQ;
import X.0uj;
import X.AnonymousClass00P;
import X.AnonymousClass7TF;
import X.DbX;
import X.JTP;
import X.JTT;
import X.WUG;
import X.X1O;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.base.IgFrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DragToDismissView extends IgFrameLayout implements 0uj {
    public View A00;
    public X1O A01;
    public float A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final long A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragToDismissView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A06 = 250;
        this.A04 = ((float) AnonymousClass7TF.A0E(context).heightPixels) * 0.15f;
        this.A05 = 2500;
    }

    public final void DTk(View view, int[] iArr, int i, int i2, int i3) {
        AnonymousClass7TF.A1C(view, 0, iArr);
        if ((view instanceof RecyclerView) && !JTP.A1Y(view) && i2 < 0) {
            this.A03 = true;
            this.A02 = getDragFrameView().getTranslationY() - ((float) i2);
            getDragFrameView().setTranslationY(this.A02);
        }
        if (this.A03 && i2 > 0) {
            float f = (float) i2;
            if (getDragFrameView().getTranslationY() - f > 0.0f) {
                this.A02 = getDragFrameView().getTranslationY() - f;
                getDragFrameView().setTranslationY(this.A02);
            }
        }
        if (this.A03) {
            iArr[1] = i2;
        }
    }

    public final void DTl(View view, int i, int i2, int i3, int i4, int i5) {
    }

    public final void DTn(View view, View view2, int i, int i2) {
    }

    public final boolean DmW(View view, View view2, int i, int i2) {
        return i2 == 0 && (i & 2) != 0;
    }

    public int getNestedScrollAxes() {
        return 0;
    }

    public final void setDismissListener(X1O x1o) {
        0qQ.A0B(x1o, 0);
        this.A01 = x1o;
    }

    public final void setDragFrameView(View view) {
        0qQ.A0B(view, 0);
        this.A00 = view;
    }

    public final void DnO(View view, int i) {
        if (this.A03) {
            float f = this.A02;
            float f2 = this.A04;
            if (f >= f2) {
                A00();
                DbX.A1I(((WUG) getDismissListener()).A00);
            } else if (getDragFrameView().getTranslationY() < f2) {
                getDragFrameView().animate().setDuration(this.A06).translationY(0.0f).start();
            }
            this.A03 = false;
        }
    }

    public final X1O getDismissListener() {
        X1O x1o = this.A01;
        if (x1o != null) {
            return x1o;
        }
        0qQ.A0F("dismissListener");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View getDragFrameView() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        0qQ.A0F("dragFrameView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.A03 || Math.abs(f2) <= ((float) this.A05)) {
            return false;
        }
        A00();
        DbX.A1I(((WUG) getDismissListener()).A00);
        return true;
    }

    private final void A00() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getDragFrameView(), "translationY", new float[]{(float) getDragFrameView().getHeight()});
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setDuration(this.A06);
        ofFloat.start();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DragToDismissView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DragToDismissView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ DragToDismissView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
