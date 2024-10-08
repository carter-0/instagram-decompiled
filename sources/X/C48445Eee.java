package X;

import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Eee  reason: case insensitive filesystem */
public abstract class C48445Eee {
    public static final Object A00(C307896Rx r22, AnonymousClass6Tm r23) {
        AnonymousClass6Tm r8 = r23;
        Object A03 = r8.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r9 = (C276544tV) A03;
        String A00 = AnonymousClass000.A00(475);
        int A032 = r9.A03(38, AnonymousClass972.MUTABLE_FLAG_MASK);
        if (A032 != Integer.MIN_VALUE) {
            String A002 = AnonymousClass000.A00(476);
            String A0E = r9.A0E();
            if (A0E != null) {
                String A003 = AnonymousClass000.A00(2484);
                String A0K = r9.A0K(44);
                if (A0K != null) {
                    boolean A0R = r9.A0R(41, false);
                    String A004 = AnonymousClass000.A00(2482);
                    String A0F = r9.A0F();
                    if (A0F != null) {
                        String A005 = AnonymousClass000.A00(2483);
                        String A0J = r9.A0J();
                        if (A0J != null) {
                            String A006 = AnonymousClass000.A00(2481);
                            String A0K2 = r9.A0K(35);
                            if (A0K2 != null) {
                                List<Object> A0N = r9.A0N(42);
                                0qQ.A07(A0N);
                                ArrayList A0r = AnonymousClass7TG.A0r(A0N);
                                for (Object A1X : A0N) {
                                    DbU.A1X(A1X, A0r);
                                }
                                NewFundraiserInfo newFundraiserInfo = new NewFundraiserInfo((String) null, A0E, A0K, A0F, A0J, A0K2, (String) null, (String) null, A0r, A032, A0R);
                                Object A02 = r8.A02();
                                0qQ.A0C(A02, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
                                C276544tV r6 = (C276544tV) A02;
                                C276544tV A07 = r6.A07(40);
                                if (A07 != null) {
                                    AE3 ae3 = null;
                                    String A11 = DbV.A11(r6, "", 42);
                                    String A0F2 = r6.A0F();
                                    AE3 A007 = C49232Erb.A00(A07);
                                    String A0K3 = r6.A0K(41);
                                    int A033 = r6.A03(35, 0);
                                    C276544tV A072 = r6.A07(38);
                                    if (A072 != null) {
                                        ae3 = C49232Erb.A00(A072);
                                    }
                                    AnonymousClass1Nd.A00(C308206Td.A0B(r22)).A00(new C354818Nm(new C3499082j(newFundraiserInfo, ae3, A007, A0K3, (String) null, A0F2, (String) null, "", A11, A033)));
                                    return null;
                                }
                                throw AnonymousClass7TE.A0w("Requires valid creator model");
                            }
                            throw AnonymousClass7TE.A0w(A006);
                        }
                        throw AnonymousClass7TE.A0w(A005);
                    }
                    throw AnonymousClass7TE.A0w(A004);
                }
                throw AnonymousClass7TE.A0w(A003);
            }
            throw AnonymousClass7TE.A0w(A002);
        }
        throw AnonymousClass7TE.A0w(A00);
    }
}
