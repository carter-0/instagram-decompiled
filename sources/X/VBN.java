package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

public abstract class VBN {
    public static final 0xI A00(AnonymousClass0iw r2, 0xF r3, AnonymousClass1Xq r4, String str, int i, int i2) {
        0xI A00 = 0xI.A00(r2, C273654mx.A00(80));
        A00.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r4.getId());
        A00.A0C("m_pk", r4.getId());
        A00.A0C("position", C320166rs.A01(i, i2));
        A00.A08(Integer.valueOf(r4.BR7().A00), "media_type");
        A00.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C51971G9r.A0m());
        List BgD = r4.BgD();
        if (BgD != null) {
            A00.A0D("product_ids", BgD);
        }
        List BRs = r4.BRs();
        String A002 = C273654mx.A00(167);
        if (BRs != null) {
            A00.A0D(A002, BRs);
        }
        if (!(str == null || str.length() == 0)) {
            A00.A07(C271774jZ.A7x, str);
        }
        A00.A04(r3);
        return A00;
    }
}
