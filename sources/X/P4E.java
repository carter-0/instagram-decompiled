package X;

import java.util.Iterator;
import java.util.Map;

public final class P4E implements C51869G5g {
    public final /* synthetic */ C67058MhZ A00;
    public final /* synthetic */ C67106MiQ A01;
    public final /* synthetic */ C66711MbI A02;

    public P4E(C67058MhZ mhZ, C67106MiQ miQ, C66711MbI mbI) {
        this.A01 = miQ;
        this.A02 = mbI;
        this.A00 = mhZ;
    }

    public final void DrE() {
        String str;
        C67095MiF miF = this.A01.A02;
        miF.A01 = null;
        miF.A00 = null;
        C66711MbI mbI = this.A02;
        String str2 = this.A00.A02;
        if (mbI.A0C) {
            Map map = mbI.A01;
            Iterator A16 = DbV.A16(map);
            while (A16.hasNext()) {
                Object next = A16.next();
                N4R n4r = (N4R) map.get(next);
                if (n4r != null) {
                    C74514Pw9 pw9 = (C74514Pw9) n4r.A00;
                    if (pw9 != null) {
                        str = pw9.getId();
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (0qQ.A0K(str, str2)) {
                    map.put(next, (Object) null);
                }
            }
        }
    }
}
