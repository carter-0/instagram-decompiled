package X;

import android.view.View;

public final class Wi2 implements Runnable {
    public final /* synthetic */ U6E A00;

    public Wi2(U6E u6e) {
        this.A00 = u6e;
    }

    public final void run() {
        U6E u6e = this.A00;
        C13988Tno.A11(u6e, u6e.getHeight(), SN3.MAX_SIGNED_POWER_OF_TWO, View.MeasureSpec.makeMeasureSpec(u6e.getWidth(), SN3.MAX_SIGNED_POWER_OF_TWO));
        u6e.layout(u6e.getLeft(), u6e.getTop(), u6e.getRight(), u6e.getBottom());
    }
}
