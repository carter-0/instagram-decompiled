package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.ProductVariantPossibleValueDict;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import java.io.IOException;

/* renamed from: X.CcK  reason: case insensitive filesystem */
public abstract class C44276CcK {
    public static ProductVariantPossibleValueDict parseFromJson(16F r15) {
        String str;
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ProductVariantVisualStyle productVariantVisualStyle = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("is_preselected".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r15);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if ("normalized_value".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r15.A1P();
                    }
                } else if ("visual_style".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                    productVariantVisualStyle = (ProductVariantVisualStyle) ProductVariantVisualStyle.A01.get(str);
                    if (productVariantVisualStyle == null) {
                        productVariantVisualStyle = ProductVariantVisualStyle.UNRECOGNIZED;
                    }
                }
                r15.A0z();
            }
            if (str2 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r15, "ProductVariantPossibleValueDict");
            } else if (bool == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_preselected", r15, "ProductVariantPossibleValueDict");
            } else if (str3 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r15, "ProductVariantPossibleValueDict");
            } else if (str5 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, r15, "ProductVariantPossibleValueDict");
            } else if (productVariantVisualStyle != null || !(r15 instanceof 0c9)) {
                return new ProductVariantPossibleValueDict(productVariantVisualStyle, str2, str3, str4, str5, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("visual_style", r15, "ProductVariantPossibleValueDict");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
