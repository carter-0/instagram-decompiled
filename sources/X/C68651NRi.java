package X;

import com.instagram.banyan.BanyanCoordinator;
import java.util.ArrayList;

/* renamed from: X.NRi  reason: case insensitive filesystem */
public final class C68651NRi extends 0ng {
    public final /* synthetic */ BanyanCoordinator A00;
    public final /* synthetic */ ArrayList A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68651NRi(BanyanCoordinator banyanCoordinator, ArrayList arrayList) {
        super(623, 3, true, true);
        this.A00 = banyanCoordinator;
        this.A01 = arrayList;
    }

    public final void run() {
        BanyanCoordinator banyanCoordinator = this.A00;
        ArrayList arrayList = this.A01;
        if (arrayList == null) {
            arrayList = banyanCoordinator.A07.A06;
        }
        banyanCoordinator.A02 = arrayList;
        banyanCoordinator.A00 = 0;
        BanyanCoordinator.A04(banyanCoordinator);
    }
}
