package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.XFBYPRequestStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.5uF  reason: invalid class name and case insensitive filesystem */
public abstract class C298915uF {
    public static C47220Dt7 parseFromJson(16F r7) {
        String str;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str2 = null;
            Integer num = null;
            String str3 = null;
            XFBYPRequestStatus xFBYPRequestStatus = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if (AnonymousClass000.A00(584).equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if (AnonymousClass000.A00(620).equals(A0q)) {
                    num = Integer.valueOf(r7.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    xFBYPRequestStatus = (XFBYPRequestStatus) XFBYPRequestStatus.A01.get(str);
                    if (xFBYPRequestStatus == null) {
                        xFBYPRequestStatus = XFBYPRequestStatus.UNRECOGNIZED;
                    }
                }
                r7.A0z();
            }
            return new C47220Dt7(xFBYPRequestStatus, num, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
