package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.EjT  reason: case insensitive filesystem */
public abstract class C48744EjT {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.F3Q, java.lang.Object] */
    public static F3Q parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r3);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("subtitle".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("extra_info".equals(A17)) {
                    obj.A00 = C48743EjS.parseFromJson(r3);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
