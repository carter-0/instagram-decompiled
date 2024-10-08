package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.9wm  reason: invalid class name and case insensitive filesystem */
public abstract class C393649wm {
    public static C381859ch parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            DirectMediaFallbackUrl directMediaFallbackUrl = null;
            Integer num = null;
            String str = null;
            Integer num2 = null;
            String str2 = null;
            Long l = null;
            Integer num3 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("fallback".equals(A17)) {
                    directMediaFallbackUrl = C271934jp.parseFromJson(r10);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r10);
                } else if ("url".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("url_expiration_timestamp_us".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r10);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r10);
                }
                r10.A0z();
            }
            return new C381859ch(directMediaFallbackUrl, num, num2, num3, l, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
