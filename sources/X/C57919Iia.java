package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Iia  reason: case insensitive filesystem */
public final class C57919Iia implements Runnable {
    public final /* synthetic */ C270284gU A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C54155H0z A02;

    public C57919Iia(C270284gU r1, FragmentActivity fragmentActivity, C54155H0z h0z) {
        this.A02 = h0z;
        this.A01 = fragmentActivity;
        this.A00 = r1;
    }

    public final void run() {
        C54155H0z h0z = this.A02;
        C331157Pu A002 = DbX.A0f(h0z.A0B).A00();
        FragmentActivity fragmentActivity = this.A01;
        C54110Gzf gzf = new C54110Gzf();
        gzf.A00 = new C58691Iw0(37, this.A00, h0z);
        A002.A02(fragmentActivity, gzf);
    }
}
