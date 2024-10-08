package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.GSs  reason: case insensitive filesystem */
public abstract class C52440GSs {
    public static int A00 = -1;
    public static final int[] A01 = {2131956508, 2131972797};

    public static final ArrayList A00(2ZX r5, UserSession userSession, C267614bu r7) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        0Tu r2 = 0Tu.A05;
        boolean A06 = 182.A06(r2, userSession, 36315589165190557L);
        A1C.add(new C52441GSt(r7, A06));
        A1C.add(new C52442GSu(r7, A06));
        A1C.add(new C52446GSy(r7, A06));
        A1C.add(new C52445GSx(r7, 182.A01(r2, userSession, 36597064141966045L), A06));
        A1C.add(new C52443GSv(r5, r7));
        A1C.add(new C52444GSw(r7));
        return A1C;
    }
}
