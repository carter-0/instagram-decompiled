package X;

import com.instagram.api.schemas.IGLeadGenSubheaderTrustSignalDataDict;
import com.instagram.api.schemas.IGLeadGenSubheaderTrustSignalDataDictImpl;
import java.io.IOException;
import java.util.List;

/* renamed from: X.4zH  reason: invalid class name and case insensitive filesystem */
public abstract class C279764zH {
    public static C279784zJ parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            AnonymousClass54h r4 = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            B47 b47 = null;
            IGLeadGenSubheaderTrustSignalDataDictImpl iGLeadGenSubheaderTrustSignalDataDictImpl = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("first_question_data".equals(A0q)) {
                    r4 = AnonymousClass54g.parseFromJson(r5);
                } else if ("lead_gen_incentive_data".equals(A0q)) {
                    b47 = B46.parseFromJson(r5);
                } else if ("trust_signal_data".equals(A0q)) {
                    iGLeadGenSubheaderTrustSignalDataDictImpl = CZ1.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new C279784zJ(b47, r4, iGLeadGenSubheaderTrustSignalDataDictImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, C279784zJ r4) {
        r3.A0c();
        C279794zK r1 = r4.A01;
        if (r1 != null) {
            r3.A0q("first_question_data");
            AnonymousClass54h F4L = r1.F4L();
            r3.A0c();
            String str = F4L.A01;
            if (str != null) {
                r3.A0R("label", str);
            }
            List<String> list = F4L.A02;
            if (list != null) {
                16P.A03(r3, "options");
                for (String str2 : list) {
                    if (str2 != null) {
                        r3.A0t(str2);
                    }
                }
                r3.A0Y();
            }
            Integer num = F4L.A00;
            if (num != null) {
                r3.A0P("question_type", num.intValue());
            }
            r3.A0Z();
        }
        C279774zI r12 = r4.A00;
        if (r12 != null) {
            r3.A0q("lead_gen_incentive_data");
            B47 F4I = r12.F4I();
            r3.A0c();
            String str3 = F4I.A00;
            if (str3 != null) {
                r3.A0R("headline", str3);
            }
            r3.A0Z();
        }
        IGLeadGenSubheaderTrustSignalDataDict iGLeadGenSubheaderTrustSignalDataDict = r4.A02;
        if (iGLeadGenSubheaderTrustSignalDataDict != null) {
            r3.A0q("trust_signal_data");
            IGLeadGenSubheaderTrustSignalDataDictImpl F4M = iGLeadGenSubheaderTrustSignalDataDict.F4M();
            r3.A0c();
            String str4 = F4M.A00;
            if (str4 != null) {
                r3.A0R("trust_signal_text", str4);
            }
            r3.A0Z();
        }
        r3.A0Z();
    }
}
