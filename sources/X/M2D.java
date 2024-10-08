package X;

import android.view.ViewParent;

public final /* synthetic */ class M2D implements Runnable {
    public final /* synthetic */ C64932LkX A00;

    public /* synthetic */ M2D(C64932LkX lkX) {
        this.A00 = lkX;
    }

    public final void run() {
        ViewParent parent = this.A00.A01.getParent();
        parent.getClass();
        parent.requestLayout();
    }
}
