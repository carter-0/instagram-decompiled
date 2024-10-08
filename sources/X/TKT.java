package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class TKT implements Runnable {
    public final /* synthetic */ S2R A00;
    public final /* synthetic */ C10813RyZ A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ Map A04;

    public TKT(S2R s2r, C10813RyZ ryZ, Map map, Map map2, Map map3) {
        this.A01 = ryZ;
        this.A03 = map;
        this.A00 = s2r;
        this.A04 = map2;
        this.A02 = map3;
    }

    public final void run() {
        C10813RyZ ryZ = this.A01;
        C10501RtG rtG = ryZ.A03;
        Map map = this.A03;
        0qQ.A0B(map, 0);
        AnonymousClass2gB A0M = Pxh.A0M();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Map map2 = rtG.A01;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Iterator A0u = AnonymousClass7TF.A0u(map2);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (map.containsKey(A1J.getKey())) {
                JTR.A1U(A1H, A1J);
            }
        }
        SQB.A03(C9869Rii.A00(A1H), new C11650Sds(18, (Object) A1C, (Object) A0M, (Object) map));
        SUj.A0H(A0M, new C11643Sdl(this.A00, ryZ, map, this.A04, this.A02, C51965G9l.A11()));
    }
}
