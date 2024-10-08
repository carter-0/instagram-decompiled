package X;

import com.instagram.reels.store.ReelStore;

public final /* synthetic */ class DI2 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1OE A01;
    public final /* synthetic */ ReelStore A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ DI2(1OE r1, ReelStore reelStore, int i, boolean z) {
        this.A02 = reelStore;
        this.A01 = r1;
        this.A03 = z;
        this.A00 = i;
    }

    public final void run() {
        ReelStore reelStore = this.A02;
        1OE r4 = this.A01;
        boolean z = this.A03;
        ReelStore.A08(reelStore.A09, r4, reelStore.A02.A00(), this.A00, z);
    }
}
