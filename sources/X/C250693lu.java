package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.IGCTAStickerPositioningStrategyEnum;
import java.io.IOException;

/* renamed from: X.3lu  reason: invalid class name and case insensitive filesystem */
public abstract class C250693lu {
    public static C250713lw parseFromJson(16F r7) {
        String str;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            C267774cB r4 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("customPositionInfo".equals(A0q)) {
                    r4 = C267764cA.parseFromJson(r7);
                } else if ("overlapsBottom10Percent".equals(A0q)) {
                    bool = Boolean.valueOf(r7.A0d());
                } else if ("overlapsBottom20Percent".equals(A0q)) {
                    bool2 = Boolean.valueOf(r7.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    iGCTAStickerPositioningStrategyEnum = (IGCTAStickerPositioningStrategyEnum) IGCTAStickerPositioningStrategyEnum.A01.get(str);
                    if (iGCTAStickerPositioningStrategyEnum == null) {
                        iGCTAStickerPositioningStrategyEnum = IGCTAStickerPositioningStrategyEnum.UNRECOGNIZED;
                    }
                }
                r7.A0z();
            }
            return new C250713lw(r4, iGCTAStickerPositioningStrategyEnum, bool, bool2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
