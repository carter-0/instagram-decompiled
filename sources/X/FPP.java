package X;

import android.view.View;
import android.widget.ScrollView;

public final class FPP implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;

    public FPP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String str;
        switch (this.A00) {
            case 0:
                int i9 = i3 - i;
                C46848DmQ dmQ = ((E23) this.A01).A00;
                if (dmQ == null) {
                    str = "interestAccountsAdapter";
                    break;
                } else {
                    dmQ.A04 = i9;
                    return;
                }
            case 1:
                int i10 = i3 - i;
                C46847DmO dmO = ((C47447E2t) this.A01).A02;
                if (dmO == null) {
                    str = "interestAdapter";
                    break;
                } else {
                    dmO.A01 = i10;
                    return;
                }
            case 2:
                return;
            default:
                ScrollView scrollView = (ScrollView) this.A01;
                scrollView.postDelayed(new C51291Frk(scrollView), 50);
                return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
