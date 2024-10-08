package X;

import androidx.fragment.app.Fragment;

public final class M6V implements Runnable {
    public final /* synthetic */ C65751Lz5 A00;
    public final /* synthetic */ C332277Ui A01;

    public M6V(C65751Lz5 lz5, C332277Ui r2) {
        this.A00 = lz5;
        this.A01 = r2;
    }

    public final void run() {
        C65751Lz5 lz5 = this.A00;
        AnonymousClass37D r1 = (AnonymousClass37D) lz5.A03;
        r1.A0I((Fragment) lz5.A02);
        r1.A0P(this.A01);
    }
}
