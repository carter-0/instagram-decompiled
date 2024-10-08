package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.SvP  reason: case insensitive filesystem */
public final class C12493SvP implements C13619Tdl {
    public final /* synthetic */ C10813RyZ A00;

    public C12493SvP(C10813RyZ ryZ) {
        this.A00 = ryZ;
    }

    public final void EvZ(S2R s2r, Map map) {
        LinkedHashMap A0t = C51972G9s.A0t(map);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String A13 = DbT.A13(A1J);
            byte[] bArr = (byte[]) A1J.getValue();
            C10813RyZ ryZ = this.A00;
            Map map2 = ryZ.A05;
            0qQ.A0A(A13);
            Object obj = map2.get(C66580MXl.A0z(A13, 5));
            if (obj != null) {
                A1H2.put(obj, A13);
                if (obj.equals(ryZ.A00.getApplicationInfo().packageName)) {
                    2Mg r0 = ryZ.A02;
                    0qQ.A0A(bArr);
                    A0t.put(A13, r0.A02(bArr));
                } else {
                    0qQ.A0A(bArr);
                    A1H.put(obj, bArr);
                }
            }
        }
        C10813RyZ ryZ2 = this.A00;
        AnonymousClass5A3 A06 = AnonymousClass2E0.A06();
        0qQ.A07(A06);
        A06.A00.A03.execute(new TKT(s2r, ryZ2, A1H, A0t, A1H2));
    }
}
