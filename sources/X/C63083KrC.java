package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.KrC  reason: case insensitive filesystem */
public abstract class C63083KrC {
    public static Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        String str = (String) r13.A03(0);
        List list = r13.A00;
        Object obj = list.get(1);
        C277014uI A00 = C280064zw.A00(list.get(3));
        C277014uI A002 = C280064zw.A00(list.get(4));
        C277014uI A003 = C280064zw.A00(list.get(5));
        try {
            AnonymousClass6QE r0 = AnonymousClass6QE.A02;
            Uri A03 = 0cp.A03(str);
            0qQ.A0B(A03, 0);
            Uri A01 = AnonymousClass6QJ.A01(A03, true);
            UserSession A0B = C308206Td.A0B(r12);
            if (1AW.A06(0Tu.A05, 18309565842337415L)) {
                if (!LHW.A01(A01, AnonymousClass0kN.A02(A0B))) {
                    throw new SecurityException("Invalid MimeType");
                } else if (LHW.A00(A01)) {
                    throw new SecurityException("E2EE file path detected");
                }
            }
            C308206Td.A0E(r12, A003, new Object[0]);
            C63791L6x l6x = new C63791L6x(C308206Td.A04(r12), new C63761L5t(r12, A00, A002), A0B);
            String path = A01.getPath();
            path.getClass();
            obj.getClass();
            String str2 = (String) obj;
            0qQ.A0B(str2, 1);
            C290815g0 r1 = new C290815g0(new C13159TNr(l6x, path, str2, 2), (int) System.nanoTime());
            KH1.A01(r1, l6x, 14);
            1ES.A03(r1);
            return null;
        } catch (SecurityException e) {
            C308206Td.A0E(r12, A002, e.getMessage());
            return null;
        }
    }
}
