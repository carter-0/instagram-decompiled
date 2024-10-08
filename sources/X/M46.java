package X;

import android.view.ViewGroup;

public final class M46 implements Runnable {
    public final /* synthetic */ K6K A00;

    public M46(K6K k6k) {
        this.A00 = k6k;
    }

    public final void run() {
        ViewGroup viewGroup = this.A00.A08;
        if (viewGroup != null) {
            viewGroup.setBottom(viewGroup.getBottom() + AnonymousClass2uJ.A00);
            0nA.A0r(viewGroup, this);
        }
    }
}
