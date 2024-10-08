package X;

import java.util.List;
import java.util.Map;

public final class IY0 implements C233072uu {
    public final /* synthetic */ IY4 A00;
    public final /* synthetic */ C56006HrC A01;

    public final void CsF(int i) {
    }

    public final void D67() {
    }

    public IY0(IY4 iy4, C56006HrC hrC) {
        this.A00 = iy4;
        this.A01 = hrC;
    }

    public final /* synthetic */ C268314dB Dm0(Integer num, Integer num2, List list) {
        throw AnonymousClass7TE.A1B(C273654mx.A00(11));
    }

    public final Map Bk0() {
        return 0Yt.A0E();
    }

    public final C268314dB Dlz(Integer num, List list) {
        AnonymousClass7TG.A1N(list, num);
        C233072uu r0 = this.A00.A02;
        if (r0 == null) {
            0qQ.A0F("responseCallback");
            throw AnonymousClass00P.createAndThrow();
        }
        C268314dB Dlz = r0.Dlz(num, list);
        if (Dlz != null) {
            return Dlz;
        }
        0sn r1 = 0sn.A00;
        return new C268314dB(r1, r1);
    }
}
