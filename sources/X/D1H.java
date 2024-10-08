package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.GuideMediaType;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

public abstract class D1H {
    public static BIR parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            BIQ biq = null;
            GuideMediaType guideMediaType = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("content".equals(A17)) {
                    biq = C44741CkA.parseFromJson(r8);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    guideMediaType = (GuideMediaType) GuideMediaType.A01.get(str);
                    if (guideMediaType == null) {
                        guideMediaType = GuideMediaType.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            if (biq == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("content", r8, "GuideMedia");
            } else if (guideMediaType != null || !(r8 instanceof 0c9)) {
                return new BIR(guideMediaType, biq);
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r8, "GuideMedia");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, BIR bir) {
        r3.A0c();
        BIQ biq = bir.A01;
        if (biq != null) {
            r3.A0q("content");
            r3.A0c();
            1Xj r1 = biq.A01;
            if (r1 != null) {
                r3.A0q("ig_media_content");
                1Xv r0 = 1Xj.A0h;
                1Xv.A07(r3, r1);
            }
            C42046BEz bEz = biq.A00;
            if (bEz != null) {
                r3.A0q("product_image_content");
                r3.A0c();
                C41846B3n.A14(r3, bEz.A02);
                ProductImageContainer productImageContainer = bEz.A00;
                if (productImageContainer != null) {
                    r3.A0q("photo");
                    C275414q7.A00(r3, productImageContainer.FFc());
                }
                ProductDetailsProductItemDict productDetailsProductItemDict = bEz.A01;
                if (productDetailsProductItemDict != null) {
                    r3.A0q("product");
                    C275404q6.A00(r3, productDetailsProductItemDict);
                }
                String str = bEz.A03;
                if (str != null) {
                    r3.A0R("product_id", str);
                }
                String str2 = bEz.A04;
                if (str2 != null) {
                    r3.A0R("product_image_id", str2);
                }
                r3.A0Z();
            }
            r3.A0Z();
        }
        GuideMediaType guideMediaType = bir.A00;
        if (guideMediaType != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, guideMediaType.A00);
        }
        r3.A0Z();
    }
}
