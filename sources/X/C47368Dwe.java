package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Dwe  reason: case insensitive filesystem */
public final class C47368Dwe extends C272124k8 {
    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(1965679563);
        DwO dwO = (DwO) obj;
        int A032 = AnonymousClass0fD.A03(853862374);
        boolean A1U = AnonymousClass7TF.A1U(0, userSession, dwO);
        for (C47157DrY drY : dwO.A01) {
            List<AnonymousClass9JM> list = drY.A06;
            if (!list.isEmpty()) {
                String str = ((AnonymousClass9JM) list.get(0)).A01;
                if (AnonymousClass000.A00(1281).equals(str)) {
                    for (AnonymousClass9JM r0 : list) {
                        String str2 = r0.A03;
                        if (str2 == null) {
                            str2 = "off";
                        }
                        if (Boolean.valueOf(A1U).equals(r0.A00)) {
                            1Av A00 = 1Au.A00(userSession);
                            AnonymousClass7TF.A1J(A00, A00.A0z, 1Av.A8a, 336, str2.equals("off"));
                        }
                    }
                } else if ("direct_media_creator_share_activity".equals(str)) {
                    for (AnonymousClass9JM r02 : list) {
                        String str3 = r02.A03;
                        if (str3 == null) {
                            str3 = "off";
                        }
                        if (Boolean.valueOf(A1U).equals(r02.A00)) {
                            1Av A002 = 1Au.A00(userSession);
                            0qQ.A0B(str3, 0);
                            0xY A0p = AnonymousClass7TE.A0p(A002);
                            A0p.E5g(C66579MXk.A00(297), str3);
                            A0p.apply();
                        }
                    }
                } else if (AnonymousClass000.A00(1672).equals(str)) {
                    for (AnonymousClass9JM r03 : list) {
                        String str4 = r03.A03;
                        if (str4 == null) {
                            str4 = "off";
                        }
                        if (Boolean.valueOf(A1U).equals(r03.A00)) {
                            1Av A003 = 1Au.A00(userSession);
                            AnonymousClass7TF.A1J(A003, A003.A10, 1Av.A8a, 337, str4.equals("off"));
                        }
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(2137649978, A032);
        AnonymousClass0fD.A0A(-2016284008, A03);
    }

    public C47368Dwe(UserSession userSession) {
        super(userSession);
    }
}
