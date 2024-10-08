package X;

import com.instagram.reels.store.ReelStore;
import java.util.List;

public final /* synthetic */ class DI3 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1OE A01;
    public final /* synthetic */ ReelStore A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ DI3(1OE r1, ReelStore reelStore, List list, int i, boolean z) {
        this.A02 = reelStore;
        this.A01 = r1;
        this.A03 = list;
        this.A04 = z;
        this.A00 = i;
    }

    public final void run() {
        ReelStore reelStore = this.A02;
        1OE r4 = this.A01;
        List list = this.A03;
        boolean z = this.A04;
        ReelStore.A08(reelStore.A09, r4, list, this.A00, z);
    }
}
