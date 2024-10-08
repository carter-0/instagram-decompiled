package X;

import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.D1g  reason: case insensitive filesystem */
public abstract class C45681D1g {
    public static ProductItemWithAR parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            ProductArEffectMetadata productArEffectMetadata = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("ar_effect_metadata".equals(A17)) {
                    productArEffectMetadata = C44911Cn1.parseFromJson(r7);
                } else if ("product_item".equals(A17)) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r7);
                }
                r7.A0z();
            }
            if (productArEffectMetadata == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("ar_effect_metadata", r7, "ProductItemWithAR");
            } else if (productDetailsProductItemDict != null || !(r7 instanceof 0c9)) {
                return new ProductItemWithAR(productArEffectMetadata, productDetailsProductItemDict);
            } else {
                AnonymousClass7TF.A1L("product_item", r7, "ProductItemWithAR");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, ProductItemWithAR productItemWithAR) {
        r3.A0c();
        ProductArEffectMetadata productArEffectMetadata = productItemWithAR.A00;
        if (productArEffectMetadata != null) {
            r3.A0q("ar_effect_metadata");
            r3.A0c();
            ContainerEffectEnum containerEffectEnum = productArEffectMetadata.A00;
            if (containerEffectEnum != null) {
                r3.A0R("container_effect_type", containerEffectEnum.A00);
            }
            DynamicEffectState dynamicEffectState = productArEffectMetadata.A01;
            if (dynamicEffectState != null) {
                r3.A0R("dynamic_effect_state", dynamicEffectState.A00);
            }
            String str = productArEffectMetadata.A03;
            if (str != null) {
                r3.A0R("effect_id", str);
            }
            HashMap hashMap = productArEffectMetadata.A05;
            if (hashMap != null) {
                r3.A0q("effect_parameters");
                r3.A0c();
                Iterator A0s = AnonymousClass7TF.A0s(hashMap);
                while (A0s.hasNext()) {
                    C41847B3o.A1K(r3, A0s);
                }
                r3.A0Z();
            }
            String str2 = productArEffectMetadata.A04;
            if (str2 != null) {
                r3.A0R("effect_parameters_data", str2);
            }
            EffectThumbnailImageDict effectThumbnailImageDict = productArEffectMetadata.A02;
            if (effectThumbnailImageDict != null) {
                r3.A0q("effect_thumbnail_image");
                r3.A0c();
                ImageUrl imageUrl = effectThumbnailImageDict.A00;
                if (imageUrl != null) {
                    r3.A0q("uri");
                    16h.A01(r3, imageUrl);
                }
                r3.A0Z();
            }
            r3.A0Z();
        }
        ProductDetailsProductItemDict productDetailsProductItemDict = productItemWithAR.A01;
        if (productDetailsProductItemDict != null) {
            r3.A0q("product_item");
            C275404q6.A00(r3, productDetailsProductItemDict);
        }
        r3.A0Z();
    }
}
