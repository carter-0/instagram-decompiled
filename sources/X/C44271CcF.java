package X;

import com.instagram.api.schemas.ProductTileLabelImpl;
import com.instagram.api.schemas.ProductTileMetadataDecorationsImpl;
import com.instagram.api.schemas.ProductTileMetadataDestination;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CcF  reason: case insensitive filesystem */
public abstract class C44271CcF {
    public static ProductTileMetadataImpl parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ProductTileMetadataDecorationsImpl productTileMetadataDecorationsImpl = null;
            ProductTileMetadataDestination productTileMetadataDestination = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("decorations".equals(A17)) {
                    productTileMetadataDecorationsImpl = C44270CcE.parseFromJson(r8);
                } else if ("destination".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    productTileMetadataDestination = (ProductTileMetadataDestination) ProductTileMetadataDestination.A01.get(str);
                    if (productTileMetadataDestination == null) {
                        productTileMetadataDestination = ProductTileMetadataDestination.UNRECOGNIZED;
                    }
                } else if ("labels".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            ProductTileLabelImpl parseFromJson = C44268CcC.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r8.A0z();
            }
            if (arrayList != null || !(r8 instanceof 0c9)) {
                return new ProductTileMetadataImpl(productTileMetadataDecorationsImpl, productTileMetadataDestination, arrayList);
            }
            AnonymousClass7TF.A1L("labels", r8, "ProductTileMetadataImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
