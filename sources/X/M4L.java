package X;

import android.view.ViewGroup;

public final class M4L implements Runnable {
    public final /* synthetic */ ViewGroup A00;

    public M4L(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    public final void run() {
        ViewGroup viewGroup = this.A00;
        viewGroup.setBottom(viewGroup.getBottom() + AnonymousClass2uJ.A00);
        0nA.A0r(viewGroup, this);
    }
}
