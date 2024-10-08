package X;

import android.view.ViewGroup;

/* renamed from: X.M3c  reason: case insensitive filesystem */
public final /* synthetic */ class C65887M3c implements Runnable {
    public final /* synthetic */ ViewGroup A00;

    public /* synthetic */ C65887M3c(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    public final void run() {
        this.A00.requestLayout();
    }
}
