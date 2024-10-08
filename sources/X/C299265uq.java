package X;

import android.view.View;

/* renamed from: X.5uq  reason: invalid class name and case insensitive filesystem */
public abstract class C299265uq {
    public static final void A00(C273704n3 r6) {
        0qQ.A0B(r6, 0);
        0kx r5 = new 0kx(r6);
        while (r5.hasNext()) {
            View view = (View) r5.next();
            if (view.isLayoutRequested()) {
                view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(view.getHeight(), SN3.MAX_SIGNED_POWER_OF_TWO));
                view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            if (view instanceof C273704n3) {
                A00((C273704n3) view);
            }
        }
    }
}
