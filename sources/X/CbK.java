package X;

import com.instagram.api.schemas.PaymentCredentialTypeEnum;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class CbK {
    public static ULZ parseFromJson(16F r13) {
        String str;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            GSY gsy = null;
            ArrayList arrayList = null;
            PaymentCredentialTypeEnum paymentCredentialTypeEnum = null;
            GSY gsy2 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("accessibility_description".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("accessibility_label".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if (AnonymousClass000.A00(3024).equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if ("display_label".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                } else if ("inline_action".equals(A17)) {
                    gsy = C44073CUq.parseFromJson(r13);
                } else if ("logos_uri".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r13, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("payment_credential_type".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    paymentCredentialTypeEnum = (PaymentCredentialTypeEnum) PaymentCredentialTypeEnum.A01.get(str);
                    if (paymentCredentialTypeEnum == null) {
                        paymentCredentialTypeEnum = PaymentCredentialTypeEnum.UNRECOGNIZED;
                    }
                } else if ("primary_action".equals(A17)) {
                    gsy2 = C44073CUq.parseFromJson(r13);
                }
                r13.A0z();
            }
            if (arrayList != null || !(r13 instanceof 0c9)) {
                return new ULZ(gsy, gsy2, paymentCredentialTypeEnum, str2, str3, str4, str5, (List) arrayList);
            }
            AnonymousClass7TF.A1L("logos_uri", r13, "PaymentDetails");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
