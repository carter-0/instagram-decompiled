package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Iii  reason: case insensitive filesystem */
public final class C57927Iii implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C331127Pr A01;
    public final /* synthetic */ C52029GCb A02;

    public C57927Iii(Fragment fragment, C331127Pr r2, C52029GCb gCb) {
        this.A01 = r2;
        this.A02 = gCb;
        this.A00 = fragment;
    }

    public final void run() {
        this.A01.A00().A02(this.A02.A07, this.A00);
    }
}
