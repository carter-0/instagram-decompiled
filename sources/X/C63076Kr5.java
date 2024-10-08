package X;

import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import com.instagram.model.fundraiser.FundraiserDisplayInfoModel;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Kr5  reason: case insensitive filesystem */
public abstract class C63076Kr5 {
    public static final Object A00(C307896Rx r16, AnonymousClass6Tm r17) {
        AnonymousClass6Tm r1 = r17;
        Object A03 = r1.A03(0);
        String A00 = C273654mx.A00(30);
        0qQ.A0C(A03, A00);
        C276544tV r3 = (C276544tV) A03;
        Object A02 = r1.A02();
        0qQ.A0C(A02, A00);
        C276544tV r12 = (C276544tV) A02;
        String A002 = AnonymousClass000.A00(475);
        int A032 = r3.A03(38, AnonymousClass972.MUTABLE_FLAG_MASK);
        if (A032 != Integer.MIN_VALUE) {
            String A003 = AnonymousClass000.A00(476);
            String A0E = r3.A0E();
            if (A0E != null) {
                String A004 = AnonymousClass000.A00(2484);
                String A0K = r3.A0K(44);
                if (A0K != null) {
                    boolean A0R = r3.A0R(41, false);
                    String A005 = AnonymousClass000.A00(2482);
                    String A0F = r3.A0F();
                    if (A0F != null) {
                        String A006 = AnonymousClass000.A00(2483);
                        String A0J = r3.A0J();
                        if (A0J != null) {
                            String A007 = AnonymousClass000.A00(2481);
                            String A0D = r3.A0D();
                            if (A0D != null) {
                                List<Object> A0N = r3.A0N(42);
                                0qQ.A07(A0N);
                                ArrayList A0r = AnonymousClass7TG.A0r(A0N);
                                for (Object A1X : A0N) {
                                    DbU.A1X(A1X, A0r);
                                }
                                NewFundraiserInfo newFundraiserInfo = new NewFundraiserInfo((String) null, A0E, A0K, A0F, A0J, A0D, FundraiserCampaignTypeEnum.IG_STANDALONE_FOR_CHARITY.toString(), (String) null, A0r, A032, A0R);
                                String str = "";
                                String str2 = str;
                                String A0F2 = r12.A0F();
                                if (A0F2 != null) {
                                    str2 = A0F2;
                                }
                                String A0D2 = r12.A0D();
                                String str3 = str;
                                String A0H = r12.A0H();
                                if (A0H != null) {
                                    str3 = A0H;
                                }
                                String A0E2 = r12.A0E();
                                String A0K2 = r12.A0K(41);
                                if (A0K2 != null) {
                                    str = A0K2;
                                }
                                AnonymousClass1Nd.A00(C308206Td.A0B(r16)).A00(new C339547jm(new FundraiserDisplayInfoModel(str2, A0D2, str3, A0E2, str), newFundraiserInfo));
                                return null;
                            }
                            throw AnonymousClass7TE.A0w(A007);
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
}
