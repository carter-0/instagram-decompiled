package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.8ng  reason: invalid class name and case insensitive filesystem */
public abstract class C365788ng {
    public static final List A00(Object obj) {
        C365798nh r1;
        C349307zv r0;
        C352218Cl r02;
        if (obj instanceof AnonymousClass8SN) {
            r02 = ((AnonymousClass8SN) obj).A01;
        } else {
            if (obj instanceof AnonymousClass8SO) {
                r0 = ((AnonymousClass8SO) obj).A01;
            } else if (obj instanceof AnonymousClass8SP) {
                return ((AnonymousClass8SP) obj).A00;
            } else {
                if (obj instanceof C356318Tk) {
                    r02 = ((C356318Tk) obj).A00;
                } else if (obj instanceof AnonymousClass8SQ) {
                    r0 = ((AnonymousClass8SQ) obj).A01;
                } else if (!(obj instanceof C356718Uy)) {
                    return 0sn.A00;
                } else {
                    r1 = ((C356718Uy) obj).A00;
                    List singletonList = Collections.singletonList(r1);
                    0qQ.A07(singletonList);
                    return singletonList;
                }
            }
            r1 = new C365798nh(r0);
            List singletonList2 = Collections.singletonList(r1);
            0qQ.A07(singletonList2);
            return singletonList2;
        }
        r1 = new C365798nh(r02);
        List singletonList22 = Collections.singletonList(r1);
        0qQ.A07(singletonList22);
        return singletonList22;
    }
}
