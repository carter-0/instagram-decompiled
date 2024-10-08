package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Kq7  reason: case insensitive filesystem */
public abstract /* synthetic */ class C63017Kq7 {
    public static Map A00(AnonymousClass1eb r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        r3.BEV();
        A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(r3.BEV()));
        r3.BIj();
        A1H.put("inventory_quantity", Long.valueOf(r3.BIj()));
        r3.CPS();
        A1H.put("is_bip_order", Boolean.valueOf(r3.CPS()));
        r3.BfK();
        A1H.put("price_amount", Long.valueOf(r3.BfK()));
        if (r3.BfL() != null) {
            A1H.put("price_currency", r3.BfL());
        }
        if (r3.BgZ() != null) {
            A1H.put("product_variants", r3.BgZ());
        }
        if (r3.getTitle() != null) {
            A1H.put(DialogModule.KEY_TITLE, r3.getTitle());
        }
        return 0Yt.A0B(A1H);
    }
}
