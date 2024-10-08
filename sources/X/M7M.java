package X;

import android.view.View;

public final class M7M implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ L97 A01;

    public M7M(L97 l97, int i) {
        this.A01 = l97;
        this.A00 = i;
    }

    public final void run() {
        View view = this.A01.A00;
        int height = view.getHeight();
        int i = this.A00;
        if (height < i) {
            view.setMinimumHeight(i);
        }
    }
}
