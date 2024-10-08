package X;

import com.instagram.api.schemas.ProductTileBannerMetadataDecorationImpl;
import com.instagram.api.schemas.ProductTileContextImpl;
import com.instagram.api.schemas.ProductTileMetadataDecorationsImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CcE  reason: case insensitive filesystem */
public abstract class C44270CcE {
    public static ProductTileMetadataDecorationsImpl parseFromJson(16F r29) {
        16F r12 = r29;
        0qQ.A0B(r12, 0);
        try {
            Boolean bool = null;
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            ArrayList arrayList = null;
            ProductTileContextImpl productTileContextImpl = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("banners".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            ProductTileBannerMetadataDecorationImpl parseFromJson = Cc8.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("context".equals(A17)) {
                    productTileContextImpl = C44265Cc9.parseFromJson(r12);
                } else if ("has_reduced_padding".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r12);
                } else if ("has_side_padding".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r12);
                } else if ("is_three_dot_menu_visible".equals(A17)) {
                    bool6 = AnonymousClass7TF.A0S(r12);
                } else if ("show_dismiss_button".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r12);
                } else if ("show_minimal_profile_overlay".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r12);
                } else if ("show_profile_overlay".equals(A17)) {
                    bool5 = AnonymousClass7TF.A0S(r12);
                } else if ("show_profile_pic_only".equals(A17)) {
                    bool7 = AnonymousClass7TF.A0S(r12);
                } else {
                    bool8 = C41847B3o.A0z(r12, bool8, A17, "show_save_button");
                }
                r12.A0z();
            }
            if (arrayList == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("banners", r12, "ProductTileMetadataDecorationsImpl");
            } else if (bool == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_reduced_padding", r12, "ProductTileMetadataDecorationsImpl");
            } else if (bool2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_side_padding", r12, "ProductTileMetadataDecorationsImpl");
            } else if (bool3 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("show_dismiss_button", r12, "ProductTileMetadataDecorationsImpl");
            } else if (bool4 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("show_minimal_profile_overlay", r12, "ProductTileMetadataDecorationsImpl");
            } else if (bool5 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("show_profile_overlay", r12, "ProductTileMetadataDecorationsImpl");
            } else if (bool7 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("show_profile_pic_only", r12, "ProductTileMetadataDecorationsImpl");
            } else if (bool8 != null || !(r12 instanceof 0c9)) {
                return new ProductTileMetadataDecorationsImpl(productTileContextImpl, bool6, arrayList, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool7.booleanValue(), bool8.booleanValue());
            } else {
                AnonymousClass7TF.A1L("show_save_button", r12, "ProductTileMetadataDecorationsImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
