package X;

import android.view.ViewGroup;

public final class PX9 implements Runnable {
    public final /* synthetic */ ViewGroup A00;

    public PX9(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    public final void run() {
        this.A00.requestApplyInsets();
    }
}
