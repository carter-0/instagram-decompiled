package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.Kq0  reason: case insensitive filesystem */
public abstract class C63010Kq0 {
    public static C61094Jx5 parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            SimpleImageUrl simpleImageUrl = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("artist_name".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("artist_subtitle".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if ("cover_artwork_uri".equals(A17)) {
                    simpleImageUrl = 16h.A00(r10);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (simpleImageUrl == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("cover_artwork_uri", r10, "ArtistDataImpl");
            } else if (str != null || !(r10 instanceof 0c9)) {
                return new C61094Jx5(simpleImageUrl, str2, str3, str);
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r10, "ArtistDataImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
