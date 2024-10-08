package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.showreel.IgShowreelCompositionAssetInfo;
import com.instagram.model.showreel.IgShowreelCompositionAssetType;
import java.io.IOException;

/* renamed from: X.52g  reason: invalid class name and case insensitive filesystem */
public abstract class C2805452g {
    public static IgShowreelCompositionAssetInfo parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            IgShowreelCompositionAssetType igShowreelCompositionAssetType = null;
            String str2 = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    igShowreelCompositionAssetType = (IgShowreelCompositionAssetType) IgShowreelCompositionAssetType.A01.get(str);
                    if (igShowreelCompositionAssetType == null) {
                        igShowreelCompositionAssetType = IgShowreelCompositionAssetType.UNRECOGNIZED;
                    }
                } else if ("url".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new IgShowreelCompositionAssetInfo(igShowreelCompositionAssetType, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, IgShowreelCompositionAssetInfo igShowreelCompositionAssetInfo) {
        r2.A0c();
        IgShowreelCompositionAssetType igShowreelCompositionAssetType = igShowreelCompositionAssetInfo.A00;
        if (igShowreelCompositionAssetType != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, igShowreelCompositionAssetType.A00);
        }
        String str = igShowreelCompositionAssetInfo.A01;
        if (str != null) {
            r2.A0R("url", str);
        }
        r2.A0Z();
    }
}
