package X;

import java.util.Map;

public final class UHT extends C297775sJ {
    public Map A00;
    public final C262224Cq A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UHT(C12042Sl3 sl3) {
        super(sl3);
        AnonymousClass19S A02 = 19E.A02(AnonymousClass12T.A00.AOJ(1573891647, 3));
        0qQ.A0B(A02, 2);
        this.A01 = A02;
    }

    public final C15032UKl A00(String str) {
        Map map = this.A00;
        if (map != null) {
            return (C15032UKl) map.get(str);
        }
        0qQ.A0F("productMap");
        throw AnonymousClass00P.createAndThrow();
    }
}
