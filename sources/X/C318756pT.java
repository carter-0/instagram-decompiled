package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* renamed from: X.6pT  reason: invalid class name and case insensitive filesystem */
public final class C318756pT implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C3253572b A01;

    public C318756pT(View view, C3253572b r2) {
        this.A00 = view;
        this.A01 = r2;
    }

    public final boolean onPreDraw() {
        int height;
        View view = this.A00;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        if (view.getParent() instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            0qQ.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            View view2 = (View) parent;
            view.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), AnonymousClass972.MUTABLE_FLAG_MASK), 0);
            int measuredHeight = (view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop();
            C3253572b r1 = this.A01;
            int i = r1.A04;
            if (i >= measuredHeight) {
                0nA.A0c(view, (i - measuredHeight) / 2);
            }
            if (r1.A0P) {
                height = Math.max(r1.A04, view.getMeasuredHeight());
            } else {
                if (r1.A0G) {
                    0nA.A0X(view, Math.max(0, (view2.getHeight() - measuredHeight) - view.getPaddingTop()));
                }
                height = view2.getHeight();
            }
            0nA.A0V(view, height);
        }
        return false;
    }
}
