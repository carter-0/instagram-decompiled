package X;

import java.util.List;
import java.util.UUID;

/* renamed from: X.AqR  reason: case insensitive filesystem */
public final /* synthetic */ class C41229AqR implements Runnable {
    public final /* synthetic */ C41515AvI A00;
    public final /* synthetic */ AnonymousClass9RJ A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ UUID A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C41229AqR(C41515AvI avI, AnonymousClass9RJ r2, List list, UUID uuid, boolean z) {
        this.A01 = r2;
        this.A02 = list;
        this.A00 = avI;
        this.A04 = z;
        this.A03 = uuid;
    }

    public final void run() {
        AnonymousClass9RJ r7 = this.A01;
        List list = this.A02;
        C41515AvI avI = this.A00;
        boolean z = this.A04;
        UUID uuid = this.A03;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C341007mB) list.get(i)).DCh(avI);
        }
        if (z) {
            r7.A0Q.A05(uuid);
            r7.APU((AnonymousClass8GD) null);
        }
    }
}
