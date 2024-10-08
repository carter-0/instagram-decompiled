package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Aq3  reason: case insensitive filesystem */
public final class C41205Aq3 implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C53335GmL A01;
    public final /* synthetic */ C334347b7 A02;
    public final /* synthetic */ C62320sa A03;

    public C41205Aq3(FragmentActivity fragmentActivity, C53335GmL gmL, C334347b7 r3, C62320sa r4) {
        this.A00 = fragmentActivity;
        this.A02 = r3;
        this.A01 = gmL;
        this.A03 = r4;
    }

    public final void run() {
        FragmentActivity fragmentActivity = this.A00;
        C334347b7 r3 = this.A02;
        C53335GmL gmL = this.A01;
        C62320sa r2 = this.A03;
        if (gmL.A0d) {
            r3.A01.post(new C41123Aoj(fragmentActivity, r3, r2));
        }
    }
}
