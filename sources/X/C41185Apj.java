package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Apj  reason: case insensitive filesystem */
public final class C41185Apj implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C19140WMw A01;
    public final /* synthetic */ boolean A02;

    public C41185Apj(Fragment fragment, C19140WMw wMw, boolean z) {
        this.A01 = wMw;
        this.A00 = fragment;
        this.A02 = z;
    }

    public final void run() {
        this.A01.A04(this.A00, this.A02, true);
    }
}
