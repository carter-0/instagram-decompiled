package X;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.user.model.Product;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WcJ  reason: case insensitive filesystem */
public final class C19594WcJ implements X6x {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C19594WcJ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void DED() {
        switch (this.A00) {
            case 0:
                C15402UcC ucC = (C15402UcC) this.A02;
                LDY ldy = ucC.A00;
                if (ldy != null) {
                    LB8 lb8 = ldy.A01;
                    ShimmerFrameLayout shimmerFrameLayout = lb8.A03;
                    shimmerFrameLayout.A03();
                    lb8.A01.setVisibility(0);
                    shimmerFrameLayout.A04((AnonymousClass3O5) null);
                    shimmerFrameLayout.setVisibility(8);
                }
                ucC.A01 = null;
                return;
            case 1:
                05G r0 = ((C17936ViR) this.A02).A04;
                Boolean A0u = AnonymousClass7TE.A0u();
                r0.Epw(A0u);
                ((AnonymousClass4D7) this.A01).resumeWith(A0u);
                return;
            default:
                C18644Vvm.A00((C18644Vvm) this.A01, (Product) this.A02, AnonymousClass05K.A0N);
                return;
        }
    }

    public final void DoS(ProductGroup productGroup) {
        String str;
        ExtendedImageUrl extendedImageUrl;
        ProductGroup productGroup2 = productGroup;
        switch (this.A00) {
            case 0:
                C15402UcC ucC = (C15402UcC) this.A02;
                LDY ldy = ucC.A00;
                if (ldy != null) {
                    LB8 lb8 = ldy.A01;
                    ShimmerFrameLayout shimmerFrameLayout = lb8.A03;
                    shimmerFrameLayout.A03();
                    lb8.A01.setVisibility(0);
                    shimmerFrameLayout.A04((AnonymousClass3O5) null);
                    shimmerFrameLayout.setVisibility(8);
                }
                if (productGroup == null || !AnonymousClass7TE.A1b(C51966G9m.A1J(productGroup2.A02))) {
                    ucC.A01 = null;
                    return;
                }
                UA3 ua3 = ucC.A01;
                if (ua3 != null) {
                    Product product = (Product) this.A01;
                    List<Product> A002 = productGroup2.A00();
                    0qQ.A07(A002);
                    List list = ua3.A04;
                    list.clear();
                    List list2 = ua3.A06;
                    list2.clear();
                    List list3 = ua3.A05;
                    list3.clear();
                    Iterator A0h = JTQ.A0h(productGroup2.A02);
                    while (true) {
                        if (A0h.hasNext()) {
                            ProductVariantDimension productVariantDimension = (ProductVariantDimension) A0h.next();
                            if (productVariantDimension.A00 == ProductVariantVisualStyle.THUMBNAIL) {
                                ua3.A01 = productVariantDimension;
                            }
                        }
                    }
                    ProductVariantDimension productVariantDimension2 = ua3.A01;
                    if (productVariantDimension2 != null) {
                        for (Product product2 : A002) {
                            ImageInfo imageInfo = product2.A08;
                            List<ProductVariantPossibleValueDictIntf> list4 = product2.A0O;
                            if (list4 != null) {
                                for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list4) {
                                    ExtendedImageUrl extendedImageUrl2 = null;
                                    if (0qQ.A0K(productVariantPossibleValueDictIntf.getId(), productVariantDimension2.A02) && !list2.contains(productVariantPossibleValueDictIntf.getValue())) {
                                        list2.add(productVariantPossibleValueDictIntf.getValue());
                                        list3.add(product2);
                                        if (imageInfo != null) {
                                            extendedImageUrl = 1iI.A03(imageInfo);
                                        } else {
                                            extendedImageUrl = null;
                                        }
                                        list.add(extendedImageUrl);
                                    }
                                    if (0qQ.A0K(productVariantPossibleValueDictIntf.getId(), productVariantDimension2.A02)) {
                                        if (product != null) {
                                            str = product.A0H;
                                        } else {
                                            str = null;
                                        }
                                        if (0qQ.A0K(str, product2.A0H)) {
                                            int indexOf = list2.indexOf(productVariantPossibleValueDictIntf.getValue());
                                            list3.set(indexOf, product);
                                            ua3.A00 = indexOf;
                                            if (imageInfo != null) {
                                                extendedImageUrl2 = 1iI.A03(imageInfo);
                                            }
                                            list.set(indexOf, extendedImageUrl2);
                                        }
                                    }
                                }
                            }
                        }
                        if (ua3.A00 == -1) {
                            ua3.A00 = 0;
                        }
                        ua3.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                JTR.A1V(((C17936ViR) this.A02).A04);
                ((AnonymousClass4D7) this.A01).resumeWith(AnonymousClass7TE.A0v());
                return;
            default:
                C18644Vvm vvm = (C18644Vvm) this.A01;
                C18644Vvm.A00(vvm, (Product) this.A02, AnonymousClass05K.A0C);
                if (productGroup != null) {
                    for (Product product3 : productGroup2.A00()) {
                        vvm.A03.put(C18386Vqm.A00(product3), product3);
                    }
                    return;
                }
                return;
        }
    }
}
