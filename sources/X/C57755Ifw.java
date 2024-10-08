package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Ifw  reason: case insensitive filesystem */
public final /* synthetic */ class C57755Ifw implements Runnable {
    public final /* synthetic */ H51 A00;

    public /* synthetic */ C57755Ifw(H51 h51) {
        this.A00 = h51;
    }

    public final void run() {
        Fragment fragment = (Fragment) this.A00.A01;
        if (fragment.isResumed()) {
            DbX.A1J(fragment);
        } else {
            DbT.A1K(fragment);
        }
    }
}
