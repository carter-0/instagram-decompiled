package X;

import android.view.ViewGroup;

/* renamed from: X.M5j  reason: case insensitive filesystem */
public final class C65946M5j implements Runnable {
    public final /* synthetic */ K7H A00;

    public C65946M5j(K7H k7h) {
        this.A00 = k7h;
    }

    public final void run() {
        ViewGroup viewGroup = this.A00.A00;
        if (viewGroup != null) {
            viewGroup.setBottom(viewGroup.getBottom() + AnonymousClass2uJ.A00);
            0nA.A0r(viewGroup, this);
        }
    }
}
