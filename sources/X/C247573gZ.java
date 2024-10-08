package X;

import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3gZ  reason: invalid class name and case insensitive filesystem */
public abstract class C247573gZ {
    public static final String A00(IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement, C257783xx r5) {
        List Axq;
        Object obj;
        if (r5 == null || (Axq = r5.Axq()) == null) {
            return null;
        }
        Iterator it = Axq.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AnonymousClass5CX) obj).Bcs() == iGAdTransparencyDisclaimerPlacement) {
                break;
            }
        }
        AnonymousClass5CX r1 = (AnonymousClass5CX) obj;
        if (r1 != null) {
            return r1.BKL();
        }
        return null;
    }
}
