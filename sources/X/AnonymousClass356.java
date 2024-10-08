package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.356  reason: invalid class name */
public final class AnonymousClass356 extends C252233om {
    public final AnonymousClass357 A00;
    public final C227892kG A01;

    public AnonymousClass356(Context context, View.OnClickListener onClickListener, C227892kG r9, int i) {
        this.A01 = r9;
        this.A00 = new AnonymousClass357(context, onClickListener, context.getString(i), -1, true);
    }

    public final void A00() {
        View view;
        View AnE;
        C227892kG r0 = this.A01;
        if (r0 != null) {
            AnonymousClass357 r3 = this.A00;
            2dY r1 = 2dZ.A0t;
            C227802jw r8 = r0.A00;
            int measuredHeight = r1.A03(r8.getActivity()).A0S.getMeasuredHeight();
            if (r8.mView != null) {
                int i = measuredHeight / 2;
                int A03 = measuredHeight + C253923rd.A03(r8.getScrollingViewProxy(), measuredHeight, i);
                C238133Ar scrollingViewProxy = r8.getScrollingViewProxy();
                C254183s4 r4 = C254183s4.MEGAPHONE;
                int i2 = 0;
                if (!(C253923rd.A02(r4, scrollingViewProxy) == -1 || (AnE = scrollingViewProxy.AnE(C253923rd.A02(r4, scrollingViewProxy))) == null || A03 - AnE.getBottom() > i)) {
                    i2 = (AnE.getBottom() - A03) + i;
                }
                measuredHeight = A03 + i2;
            }
            AnonymousClass3D5 r02 = r8.A0E;
            if (!(r02 == null || (view = r02.A02) == null)) {
                int height = view.getHeight();
                if (Integer.valueOf(height) != null) {
                    measuredHeight += height;
                }
            }
            if (measuredHeight < 0) {
                measuredHeight = 0;
            }
            r3.A02((int) ((float) measuredHeight));
        }
    }

    public final void onDestroyView() {
        AnonymousClass357 r2 = this.A00;
        View view = r2.A02;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        r2.A02 = null;
    }
}
