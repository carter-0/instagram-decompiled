package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Edx  reason: case insensitive filesystem */
public abstract class C48402Edx {
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        Object A0V = Dba.A0V(r12, 0);
        Object A02 = r12.A02();
        String A0p = DbS.A0p(A02);
        String str = (String) A02;
        String A0p2 = DbX.A0p(r12, A0p);
        C277014uI A0P = DbW.A0P(r12, 3);
        0tS A0h = DbT.A0h();
        0lg A0B = C308206Td.A0B(r11);
        C319606qt A01 = C319606qt.A01(A0B);
        0qQ.A07(A01);
        ArrayList A06 = A01.A06(A0B);
        if (!(A06 instanceof Collection) || !A06.isEmpty()) {
            Iterator it = A06.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (00p.A0j(((C319646qx) it.next()).A06, str, false)) {
                        A01.A0A(C308206Td.A08(r11), A0B, AnonymousClass05K.A0C, str);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        ArrayList A00 = FCR.A00();
        if (!(A00 instanceof Collection) || !A00.isEmpty()) {
            Iterator it2 = A00.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (00p.A0j(((F3D) it2.next()).A00(), str, false)) {
                    ArrayList A002 = FCR.A00();
                    Iterator it3 = A002.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        F3D f3d = (F3D) it3.next();
                        if (f3d.A00() != null && f3d.A00().equals(str)) {
                            it3.remove();
                            break;
                        }
                    }
                    FCR.A02(A002);
                }
            }
        }
        if (!A0h.A09().contains(str)) {
            A0h.A0H(094.A01(str, A0h.A09()));
        }
        if (A0p2.equals("local_auth")) {
            0s0 r8 = A0h.A04;
            AnonymousClass0YZ[] r3 = 0tS.A4G;
            if (!((Set) r8.CDM(A0h, r3[184])).contains(str)) {
                DbS.A1a(A0h, 094.A01(str, (Set) r8.CDM(A0h, r3[184])), r8, r3, 184);
            }
        }
        DbX.A1P(r11, DbS.A0P(), A0P, A0V, 0);
        return null;
    }
}
