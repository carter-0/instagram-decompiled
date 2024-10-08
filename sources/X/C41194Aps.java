package X;

import java.util.Set;

/* renamed from: X.Aps  reason: case insensitive filesystem */
public final class C41194Aps implements Runnable {
    public final /* synthetic */ C39904AIm A00;
    public final /* synthetic */ A3G A01;
    public final /* synthetic */ Set A02;
    public final /* synthetic */ boolean A03;

    public C41194Aps(C39904AIm aIm, A3G a3g, Set set, boolean z) {
        this.A00 = aIm;
        this.A02 = set;
        this.A01 = a3g;
        this.A03 = z;
    }

    public final void run() {
        C39904AIm.A02(this.A00, this.A01, this.A02, this.A03);
    }
}
