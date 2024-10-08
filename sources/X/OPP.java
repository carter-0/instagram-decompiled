package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;
import java.util.Map;

public abstract class OPP {
    public static final boolean A01(Map map) {
        if (map == null || map.size() < 2) {
            return false;
        }
        List A0a = 00k.A0a(map.values());
        return C51966G9m.A1a(00R.A03(AnonymousClass7TE.A19(A0a, 0), 2), 00R.A03(AnonymousClass7TE.A19(A0a, 1), 2));
    }

    public static final boolean A00(AnonymousClass7SD r2) {
        C254743sy r0;
        C254793t3 r02 = r2.A0P;
        if (r02 != null) {
            r0 = C300965yF.A05(r02);
        } else {
            r0 = null;
        }
        if ((r0 instanceof MsysThreadId) || r2.A0r || r2.A0x || r2.A0y || r2.A0j || r2.A0O == 2EN.A07) {
            return false;
        }
        return true;
    }
}
