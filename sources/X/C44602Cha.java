package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Cha  reason: case insensitive filesystem */
public abstract class C44602Cha {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        String str;
        Object obj = r8.A00.get(0);
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            return null;
        }
        boolean A01 = Q0A.A01(r8.A02());
        C307786Rm A00 = C276734to.A00(r7, r8, 2);
        C308206Td.A04(r7);
        FH9.A0E(A00, (Runnable) null);
        UserSession A0B = C308206Td.A0B(r7);
        0qQ.A0C(A0B, AnonymousClass000.A00(2));
        1Xj A02 = 1E7.A00(A0B).A02(str);
        if (A02 == null) {
            return null;
        }
        C46280DTj BFl = A02.A0C.BFl();
        if (BFl != null) {
            C45332Cua AKE = BFl.AKE();
            A02.A0C.EZa(new BFE(Boolean.valueOf(A01), AKE.A00, AKE.A01));
        }
        C46283DTm BoM = A02.A0C.BoM();
        if (BoM != null) {
            C45333Cub AKO = BoM.AKO();
            A02.A0C.Eix(new BGG(Boolean.valueOf(A01), AKO.A00, AKO.A01));
        }
        return null;
    }
}
