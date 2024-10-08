package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.InterestPivotRedirect;
import com.instagram.api.schemas.InterestPivotStyle;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ecu  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48337Ecu {
    public static Map A00(C51956G8z g8z) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (g8z.BE9() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, g8z.BE9());
        }
        String str2 = null;
        if (g8z.BkS() != null) {
            InterestPivotRedirect BkS = g8z.BkS();
            if (BkS != null) {
                str = BkS.A00;
            } else {
                str = null;
            }
            A1H.put("redirect", str);
        }
        if (g8z.Bpv() != null) {
            A1H.put(AnonymousClass000.A00(1782), g8z.Bpv());
        }
        if (g8z.C22() != null) {
            InterestPivotStyle C22 = g8z.C22();
            if (C22 != null) {
                str2 = C22.A00;
            }
            A1H.put("style", str2);
        }
        if (g8z.getText() != null) {
            A1H.put("text", g8z.getText());
        }
        return 0Yt.A0B(A1H);
    }
}
