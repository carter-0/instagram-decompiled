package X;

import java.lang.ref.WeakReference;

public final class M7N implements Runnable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ WeakReference A01;

    public M7N(String str, WeakReference weakReference) {
        this.A01 = weakReference;
        this.A00 = str;
    }

    public final void run() {
        C61445K7x k7x = (C61445K7x) this.A01.get();
        if (k7x != null) {
            k7x.A03(this.A00);
        }
    }
}
