package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* renamed from: X.Eef  reason: case insensitive filesystem */
public abstract class C48446Eef {
    public static final Object A00(C307896Rx r23, AnonymousClass6Tm r24) {
        C51150FpM fpM;
        C276544tV A0P = DbY.A0P(r24, 1);
        C276544tV A07 = A0P.A07(41);
        if (A07 != null) {
            C276544tV A072 = A0P.A07(40);
            UserSession A0W = DbX.A0W(r23);
            2FW r2 = 2FW.A0w;
            AnonymousClass0iw A08 = C308206Td.A08(r23);
            String A0H = A07.A0H();
            if (A0H != null) {
                C51150FpM fpM2 = new C51150FpM(A0H, A07.A0K(36), A07.A0R(35, false));
                if (A072 != null) {
                    String A0H2 = A072.A0H();
                    if (A0H2 != null) {
                        fpM = new C51150FpM(A0H2, A072.A0K(36), A072.A0R(35, false));
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    fpM = null;
                }
                String A0G = A0P.A0G();
                if (A0G != null) {
                    String A0K = A0P.A0K(46);
                    if (A0K != null) {
                        String A0H3 = A0P.A0H();
                        String A0K2 = A0P.A0K(44);
                        int A03 = A0P.A03(36, 0);
                        boolean A0R = A0P.A0R(43, true);
                        boolean A0R2 = A0P.A0R(35, false);
                        String A0K3 = A0P.A0K(45);
                        if (A0K3 != null) {
                            C51151FpN fpN = new C51151FpN(fpM2, fpM, A0G, A0K, A0H3, A0K2, A0K3, A03, A0R, A0R2);
                            C49731F3w A073 = 1as.A04.A02.A07(A08, A0W, r2);
                            A073.A07.putSerializable("DirectShareSheetConstants.fundraiser", fpN);
                            DirectShareSheetFragment A00 = A073.A00();
                            AnonymousClass37D A01 = AnonymousClass37D.A00.A01(C308206Td.A04(r23));
                            if (A01 == null) {
                                return null;
                            }
                            A01.A0J(A00);
                            return null;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
