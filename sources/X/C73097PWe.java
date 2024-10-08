package X;

import android.view.ViewGroup;

/* renamed from: X.PWe  reason: case insensitive filesystem */
public final class C73097PWe implements Runnable {
    public final /* synthetic */ ViewGroup A00;

    public C73097PWe(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    public final void run() {
        ViewGroup viewGroup = this.A00;
        viewGroup.setBottom(viewGroup.getBottom() + AnonymousClass2uJ.A00);
        0nA.A0r(viewGroup, this);
    }
}
