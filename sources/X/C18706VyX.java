package X;

import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductTileBannerMetadataDecorationImpl;
import com.instagram.api.schemas.ProductTileBannerType;
import com.instagram.api.schemas.ProductTileContext;
import com.instagram.api.schemas.ProductTileFeaturedProductPermissionInfoLabelOptions;
import com.instagram.api.schemas.ProductTileLabelImpl;
import com.instagram.api.schemas.ProductTileLabelType;
import com.instagram.api.schemas.ProductTileLayoutContentImpl;
import com.instagram.api.schemas.ProductTileMetadataDecorationsImpl;
import com.instagram.api.schemas.ProductTileMetadataDestination;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.api.schemas.ProductTilePriceLabelOptionsImpl;
import com.instagram.api.schemas.ProductTileProductNameLabelOptionsImpl;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VyX  reason: case insensitive filesystem */
public abstract class C18706VyX {
    public static C19641Wd4 A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: X.VwI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C19641Wd4 A00(X.C307786Rm r16, X.C276544tV r17, com.instagram.common.session.UserSession r18, boolean r19) {
        /*
            r15 = 0
            r12 = r16
            r13 = r17
            r6 = r18
            if (r19 != 0) goto L_0x007b
            r0 = 50
            java.lang.String r9 = r13.A0K(r0)
            r0 = 45
            java.lang.String r10 = r13.A0K(r0)
            r0 = 57
            java.lang.String r0 = r13.A0K(r0)
            if (r0 != 0) goto L_0x0093
            r2 = r15
        L_0x001e:
            r3 = 68
            r0 = 0
            long r3 = r13.A04(r3, r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0035
            r15 = r4
        L_0x0035:
            androidx.fragment.app.Fragment r5 = X.C308206Td.A00(r12)
            r3 = 44
            java.lang.String r3 = r13.A0K(r3)
            X.WWj r7 = new X.WWj
            r7.<init>(r3)
            r3 = 46
            java.lang.String r11 = r13.A0K(r3)
            X.UzB r8 = X.C16675UzB.STOREFRONT
            X.VvJ r4 = new X.VvJ
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3 = 0
            r4.A0J = r3
            r3 = 1
            r4.A0H = r3
            r3 = 56
            java.lang.String r3 = r13.A0K(r3)
            r4.A0D = r3
            r4.A02 = r2
            r4.A06 = r15
            r2 = 67
            long r0 = r13.A04(r2, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A07 = r0
            r0 = 78
            java.lang.String r0 = r13.A0K(r0)
            r4.A09 = r0
            X.VwI r15 = r4.A02()
        L_0x007b:
            r0 = 72
            X.4uI r1 = r13.A0A(r0)
            r0 = 75
            X.4uI r0 = r13.A0A(r0)
            X.Vh5 r11 = new X.Vh5
            r11.<init>(r12, r13, r1, r0)
            X.Wd4 r10 = new X.Wd4
            r14 = r6
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x0093:
            X.57K r2 = X.C17025VEz.A00(r0)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18706VyX.A00(X.6Rm, X.4tV, com.instagram.common.session.UserSession, boolean):X.Wd4");
    }

    public static void A01(C19641Wd4 wd4, C276544tV r27, UserSession userSession, ImageUrl imageUrl, C17969Vj5 vj5, ProductFeedItem productFeedItem, UEM uem, Boolean bool) {
        Integer valueOf;
        C17969Vj5 vj52 = vj5;
        if (vj5 != null) {
            C276544tV r3 = r27;
            float A02 = r3.A02(81, -1.0f);
            C19368WWj wWj = new C19368WWj(r3.A0K(44));
            String A0K = r3.A0K(51);
            int A03 = r3.A03(62, 0);
            int A032 = r3.A03(55, 0);
            Uw7 uw7 = Uw7.A02;
            Integer num = AnonymousClass05K.A08;
            boolean booleanValue = bool.booleanValue();
            if (A02 < 0.0f) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf((int) A02);
            }
            C19641Wd4 wd42 = wd4;
            UEM uem2 = uem;
            C17099VHv.A00(uem2, W3C.A03((ProductCardSubtitleType) null, wd42, wWj, (0xF) null, userSession, imageUrl, vj52, productFeedItem, wd42, uw7, num, valueOf, A0K, (String) null, A03, A032, false, false, false, false, booleanValue, r3.A0R(80, true), false, false));
        }
    }

    public static void A02(C276544tV r23, ProductFeedItem productFeedItem) {
        String str;
        C276544tV r11 = r23;
        C276544tV A07 = r11.A07(38);
        String A002 = C273654mx.A00(111);
        if (A07 != null) {
            List A0N = A07.A0N(36);
            ArrayList arrayList = new ArrayList();
            Iterator it = A0N.iterator();
            while (true) {
                if (it.hasNext()) {
                    C276544tV r0 = (C276544tV) it.next();
                    String A0K = r0.A0K(35);
                    C276544tV A072 = r0.A07(36);
                    if (A072 == null) {
                        str = "getProductTileLabels found a null layoutContent";
                        break;
                    }
                    int A03 = A072.A03(35, 0);
                    boolean A0R = A072.A0R(36, false);
                    boolean A0R2 = A072.A0R(38, false);
                    if (A0K != null) {
                        ProductTileLabelType productTileLabelType = (ProductTileLabelType) ProductTileLabelType.A01.get(A0K.toLowerCase());
                        if (productTileLabelType == null) {
                            productTileLabelType = ProductTileLabelType.UNRECOGNIZED;
                        }
                        arrayList.add(new ProductTileLabelImpl(productTileLabelType, new ProductTileLayoutContentImpl((ProductTileFeaturedProductPermissionInfoLabelOptions) null, new ProductTilePriceLabelOptionsImpl(false, false, A0R2), new ProductTileProductNameLabelOptionsImpl(A03, A0R))));
                    } else {
                        return;
                    }
                } else {
                    C276544tV A073 = r11.A07(38);
                    if (A073 != null) {
                        C276544tV A074 = A073.A07(35);
                        if (A074 == null) {
                            str = "getProductTileLabels found a null decoration";
                        } else {
                            boolean A0R3 = A074.A0R(42, false);
                            boolean A0R4 = A074.A0R(38, false);
                            boolean A0R5 = A074.A0R(40, false);
                            boolean A0R6 = A074.A0R(35, false);
                            List<C276544tV> A0N2 = A074.A0N(43);
                            ArrayList arrayList2 = new ArrayList();
                            if (A0N2 != null) {
                                for (C276544tV r9 : A0N2) {
                                    ProductTileBannerType productTileBannerType = (ProductTileBannerType) ProductTileBannerType.A01.get(r9.A0K(36));
                                    if (productTileBannerType == null) {
                                        productTileBannerType = ProductTileBannerType.UNRECOGNIZED;
                                    }
                                    String A0K2 = r9.A0K(35);
                                    if (A0K2 == null) {
                                        A0K2 = "";
                                    }
                                    arrayList2.add(new ProductTileBannerMetadataDecorationImpl(productTileBannerType, A0K2));
                                }
                            }
                            ProductTileMetadataDecorationsImpl productTileMetadataDecorationsImpl = new ProductTileMetadataDecorationsImpl((ProductTileContext) null, C13988Tno.A0Q(A074, 44, false), arrayList2, A0R6, false, A0R4, false, A0R5, false, A0R3);
                            ProductTile productTile = productFeedItem.A02;
                            if (productTile != null) {
                                productTile.A01 = new ProductTileMetadataImpl(productTileMetadataDecorationsImpl, ProductTileMetadataDestination.PRODUCT_DETAILS_PAGE, arrayList);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            1Kn.A02(A002, str);
        }
        str = "getProductTileLabels found a null metadata";
        1Kn.A02(A002, str);
    }
}
