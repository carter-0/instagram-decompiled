package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.LkT  reason: case insensitive filesystem */
public final class C64928LkT implements X96 {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;

    public final void DlH(float f, float f2, float f3, float f4) {
    }

    public final void DsP(boolean z) {
    }

    public C64928LkT(View.OnClickListener onClickListener, View view, View view2) {
        this.A01 = view;
        this.A00 = onClickListener;
        this.A02 = view2;
    }

    public final void DHm(float f, float f2) {
        JTR.A1B(this.A01);
    }

    public final void DHq() {
        ViewParent parent = this.A01.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DSf(float f, float f2, float f3, float f4, float f5, float f6) {
        if (f5 > 1.0f) {
            View view = this.A01;
            view.setPivotX(f);
            view.setPivotY(f2);
            view.setScaleX(view.getScaleX() * f5);
            view.setScaleY(view.getScaleY() * f5);
        }
    }

    public final void Dl2(float f, float f2) {
        View view;
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener != null && (view = this.A02) != null) {
            onClickListener.onClick(view);
        }
    }
}
