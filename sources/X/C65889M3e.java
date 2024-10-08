package X;

import android.view.ViewGroup;

/* renamed from: X.M3e  reason: case insensitive filesystem */
public final class C65889M3e implements Runnable {
    public final /* synthetic */ ViewGroup A00;

    public C65889M3e(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    public final void run() {
        this.A00.requestLayout();
    }
}
