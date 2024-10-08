package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.RtE  reason: case insensitive filesystem */
public final class C10499RtE {
    public final Map A00;
    public final Set A01;

    public C10499RtE(Set set) {
        0qQ.A0B(set, 1);
        this.A01 = set;
        LinkedHashMap A0x = DbS.A0x(JTT.A08(set));
        for (Object put : set) {
            A0x.put(put, C8884REb.UNKNOWN);
        }
        this.A00 = 0Yt.A03(A0x);
    }
}
