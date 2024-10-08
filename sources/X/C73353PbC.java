package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.PbC  reason: case insensitive filesystem */
public final class C73353PbC implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C74223PrB A01;
    public final /* synthetic */ 0sP A02;
    public final /* synthetic */ boolean A03;

    public C73353PbC(Fragment fragment, C74223PrB prB, 0sP r3, boolean z) {
        this.A03 = z;
        this.A00 = fragment;
        this.A02 = r3;
        this.A01 = prB;
    }

    public final void run() {
        boolean z = this.A03;
        AnonymousClass0eM r1 = O5J.A01;
        r1.getValue();
        int i = 2131961114;
        if (z) {
            i = 2131961135;
        }
        r1.getValue();
        int i2 = 2131961113;
        if (z) {
            i2 = 2131961134;
        }
        C71145Oe2.A07(this.A00, Integer.valueOf(i), C73721Pii.A00, i2);
        this.A02.invoke(this.A01);
    }
}
