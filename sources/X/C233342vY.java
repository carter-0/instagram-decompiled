package X;

import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2vY  reason: invalid class name and case insensitive filesystem */
public abstract class C233342vY {
    public static final C233342vY A01 = new AnonymousClass2vZ();
    public final boolean A00;

    public static final boolean A00(C233342vY r2, Object obj, List list) {
        if (obj == null) {
            return true;
        }
        char[] A02 = r2.A02(obj);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (intValue < A02.length && A02[intValue] == '1') {
                return false;
            }
        }
        return true;
    }

    public List A01(Object obj) {
        List A3S;
        if (this instanceof C233352va) {
            1Xg r2 = (1Xg) obj;
            0qQ.A0B(r2, 0);
            1Xj A02 = 1Xi.A02(r2.A05);
            if (!(A02 == null || (A3S = A02.A3S()) == null)) {
                return A3S;
            }
        }
        return 0sn.A00;
    }

    public char[] A02(Object obj) {
        List list;
        BrandSafetyContentBlocklistBitmapQLObj AiG;
        if (!(this instanceof C233352va)) {
            return new char[0];
        }
        1Xg r2 = (1Xg) obj;
        0qQ.A0B(r2, 0);
        1Xj A02 = 1Xi.A02(r2.A05);
        if (A02 == null || (AiG = A02.A0C.AiG()) == null || (list = AiG.Afw()) == null) {
            list = 0sn.A00;
        }
        return C271914jn.A00(list);
    }

    public C233342vY(boolean z) {
        this.A00 = z;
    }
}
