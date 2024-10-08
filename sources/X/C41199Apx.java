package X;

import java.util.List;
import java.util.UUID;

/* renamed from: X.Apx  reason: case insensitive filesystem */
public final /* synthetic */ class C41199Apx implements Runnable {
    public final /* synthetic */ C41515AvI A00;
    public final /* synthetic */ C340597lW A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ UUID A03;

    public /* synthetic */ C41199Apx(C41515AvI avI, C340597lW r2, List list, UUID uuid) {
        this.A01 = r2;
        this.A02 = list;
        this.A00 = avI;
        this.A03 = uuid;
    }

    public final void run() {
        C340597lW r6 = this.A01;
        List list = this.A02;
        C41515AvI avI = this.A00;
        UUID uuid = this.A03;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C341007mB) list.get(i)).DCh(avI);
        }
        r6.A0Y.A05(uuid);
        r6.APU((AnonymousClass8GD) null);
    }
}
