package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.mediasize.ImageInfo;
import java.io.IOException;

/* renamed from: X.Cz4  reason: case insensitive filesystem */
public abstract class C45592Cz4 {
    public static AnonymousClass3I3 parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            ImageInfo imageInfo = null;
            String str2 = null;
            String str3 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("expiring_at".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r14);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("image_versions2".equals(A17)) {
                    imageInfo = 1dH.parseFromJson(r14);
                } else if ("media_type".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("preview".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                }
                r14.A0z();
            }
            if (l == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("expiring_at", r14, "MediaPreviewClientDictImpl");
            } else if (str == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r14, "MediaPreviewClientDictImpl");
            } else if (imageInfo == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("image_versions2", r14, "MediaPreviewClientDictImpl");
            } else if (str2 != null || !(r14 instanceof 0c9)) {
                return new AnonymousClass3I3(imageInfo, str, str2, str3, l.longValue());
            } else {
                AnonymousClass7TF.A1L("media_type", r14, "MediaPreviewClientDictImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, AnonymousClass3I3 r4) {
        r3.A0c();
        r3.A0Q("expiring_at", r4.A00);
        C41846B3n.A0y(r3, r4.A02);
        C41847B3o.A1J(r3, r4.A01);
        C41846B3n.A12(r3, r4.A03);
        String str = r4.A04;
        if (str != null) {
            r3.A0R("preview", str);
        }
        r3.A0Z();
    }
}
