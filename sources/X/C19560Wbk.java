package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.api.schemas.ProductDiscountInformationDictImpl;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Wbk  reason: case insensitive filesystem */
public final class C19560Wbk implements C59613JQh, XCA {
    public final /* synthetic */ MerchantShoppingCartFragment A00;

    public final void DRQ(User user) {
    }

    public final void DuQ(ProductFeedItem productFeedItem) {
    }

    public C19560Wbk(MerchantShoppingCartFragment merchantShoppingCartFragment) {
        this.A00 = merchantShoppingCartFragment;
    }

    public static void A00(C19560Wbk wbk, Product product) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = wbk.A00;
        C13990Tnq.A0V(merchantShoppingCartFragment).A0G(product, merchantShoppingCartFragment.A0U);
        MultiProductComponent multiProductComponent = merchantShoppingCartFragment.A06;
        if (multiProductComponent != null && multiProductComponent.A04 == C16675UzB.SAVED) {
            multiProductComponent.A02(new ProductFeedItem(product));
            W1F w1f = merchantShoppingCartFragment.A07;
            C16508Uw5 uw5 = merchantShoppingCartFragment.A0A;
            C18622VvF vvF = merchantShoppingCartFragment.A0E;
            C17456VWj vWj = merchantShoppingCartFragment.A0D;
            MultiProductComponent multiProductComponent2 = merchantShoppingCartFragment.A06;
            String str = merchantShoppingCartFragment.A0W;
            IgFundedIncentive igFundedIncentive = merchantShoppingCartFragment.A05;
            Set set = merchantShoppingCartFragment.A0a;
            0qQ.A0B(uw5, 0);
            w1f.A05 = vvF;
            w1f.A04 = vWj;
            w1f.A03 = multiProductComponent2;
            w1f.A06 = str;
            w1f.A02 = igFundedIncentive;
            w1f.A01 = null;
            w1f.A07 = set;
            W1F.A02(w1f);
        }
        if (!product.CbC()) {
            C18591Vui A02 = merchantShoppingCartFragment.A0C.A02((1Xj) null, product, merchantShoppingCartFragment.A0U);
            A02.A04 = merchantShoppingCartFragment.A01;
            A02.A00();
        }
    }

    public static void A01(C19560Wbk wbk, Product product, String str) {
        String str2;
        MerchantShoppingCartFragment merchantShoppingCartFragment = wbk.A00;
        C20999X8w x8w = merchantShoppingCartFragment.A0B;
        String str3 = merchantShoppingCartFragment.A0X;
        String str4 = merchantShoppingCartFragment.A0V;
        Map map = merchantShoppingCartFragment.A0Z;
        Product product2 = product;
        if (map != null) {
            str2 = DbT.A11(product.A0H, map);
        } else {
            str2 = null;
        }
        x8w.CqJ(product2, str3, str4, str, str2);
    }

    public static void A02(C19560Wbk wbk, Runnable runnable, int i) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = wbk.A00;
        merchantShoppingCartFragment.A0b = true;
        RecyclerView recyclerView = merchantShoppingCartFragment.mRecyclerView;
        C252553pI r0 = recyclerView.A0D;
        r0.getClass();
        if (C240113Jq.A06(r0, recyclerView, i)) {
            runnable.run();
            return;
        }
        merchantShoppingCartFragment.mRecyclerView.A15(new UAx(2, runnable, wbk));
        merchantShoppingCartFragment.mRecyclerView.A0p(i);
    }

    public static void A03(C19560Wbk wbk, List list) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = wbk.A00;
        C18622VvF vvF = merchantShoppingCartFragment.A0E;
        if (vvF != null) {
            User user = vvF.A05;
            user.getClass();
            C249713kF.A00.A15(merchantShoppingCartFragment.requireActivity(), merchantShoppingCartFragment.A02, user, "instagram_shopping_merchant_bag", merchantShoppingCartFragment.A0V, merchantShoppingCartFragment.A0O, merchantShoppingCartFragment.A0X, list, false);
        }
    }

    public final void A04() {
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        Set set = merchantShoppingCartFragment.A0a;
        set.getClass();
        ArrayList arrayList = new ArrayList(set);
        IgFundedIncentive igFundedIncentive = merchantShoppingCartFragment.A05;
        if (igFundedIncentive != null) {
            List list = igFundedIncentive.A0B;
            list.getClass();
            arrayList.add(0, new ProductDiscountInformationDictImpl((String) null, ((IgFundedIncentiveDetail) list.get(0)).getDescription(), igFundedIncentive.A07, igFundedIncentive.A0A, (String) null));
        }
        merchantShoppingCartFragment.A09.A07(merchantShoppingCartFragment.A0U, merchantShoppingCartFragment.A0N, merchantShoppingCartFragment.A0a, true);
        A03(this, arrayList);
    }

    public final void A05(W0O w0o) {
        ExtendedImageUrl extendedImageUrl;
        ImageInfo imageInfo;
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        C323426xT A002 = C323426xT.A00(merchantShoppingCartFragment.A02);
        A002.A07.A0F(w0o, merchantShoppingCartFragment.A0U);
        C18622VvF A05 = A002.A05(merchantShoppingCartFragment.A0U);
        if (A05 != null) {
            C18785W1l w1l = merchantShoppingCartFragment.A09;
            String str = merchantShoppingCartFragment.A0U;
            String str2 = merchantShoppingCartFragment.A0N;
            String str3 = merchantShoppingCartFragment.A0Q;
            String str4 = merchantShoppingCartFragment.A0T;
            boolean A1Z = AnonymousClass7TG.A1Z(str, str2);
            0Aj A0e = AnonymousClass7TE.A0e(w1l.A02, "instagram_shopping_bag_remove_item");
            String A04 = w0o.A04();
            0qQ.A07(A04);
            C13991Tnr.A17(A0e, A04);
            W0O.A01(A0e, w0o);
            Product A03 = w0o.A03();
            boolean z = true;
            if (A03 == null || A03.A0P != A1Z) {
                z = false;
            }
            C13991Tnr.A18(A0e, str, z);
            String str5 = w1l.A05;
            if (str5 != null) {
                A0e.AAJ("merchant_bag_entry_point", str5);
                String str6 = w1l.A06;
                if (str6 != null) {
                    C18785W1l.A02(A0e, w1l, C18785W1l.A01(A0e, w1l, "merchant_bag_prior_module", str6, str2), str3);
                    C13991Tnr.A16(A0e, str4);
                    A0e.Cgf();
                    int i = 0;
                    boolean A1Q = AnonymousClass7TF.A1Q(Collections.unmodifiableList(A05.A06).size());
                    Dc2 dc2 = merchantShoppingCartFragment.A03;
                    if (dc2 != null) {
                        DbX.A1R(dc2);
                        merchantShoppingCartFragment.A03 = null;
                    }
                    FragmentActivity requireActivity = merchantShoppingCartFragment.requireActivity();
                    if (!A1Q) {
                        i = merchantShoppingCartFragment.A00;
                    }
                    WYF wyf = new WYF(3, this, w0o);
                    C310336ap r4 = new C310336ap();
                    DbS.A19(requireActivity, r4, 2131964517);
                    r4.A0L = true;
                    r4.A01 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
                    r4.A0G = AnonymousClass7TF.A0d(requireActivity.getResources(), 2131952147);
                    r4.A02 = i;
                    r4.A0A(wyf);
                    r4.A0O = A1Z;
                    Product A032 = w0o.A03();
                    if (A032 == null || (imageInfo = A032.A08) == null) {
                        extendedImageUrl = null;
                    } else {
                        extendedImageUrl = 1iI.A03(imageInfo);
                    }
                    if (!C253833rU.A02(extendedImageUrl)) {
                        r4.A09 = extendedImageUrl;
                        r4.A03();
                    }
                    Dc2 A003 = r4.A00();
                    1xC.A01.A00(new AnonymousClass3GP(A003));
                    merchantShoppingCartFragment.A03 = A003;
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A06(User user, String str) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        merchantShoppingCartFragment.A0B.CqR(user, merchantShoppingCartFragment.A0X, merchantShoppingCartFragment.A0N, merchantShoppingCartFragment.A0V, merchantShoppingCartFragment.A0P, merchantShoppingCartFragment.A0R, merchantShoppingCartFragment.A0O, str);
    }

    public final void AAj(ProductFeedItem productFeedItem, C17372VSz vSz) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        MultiProductComponent multiProductComponent = merchantShoppingCartFragment.A06;
        if (multiProductComponent != null) {
            merchantShoppingCartFragment.A0I.A02(vSz, new UO3(productFeedItem, multiProductComponent.A06), merchantShoppingCartFragment.A0U);
        }
    }

    public final void CuL(Product product) {
        String BRw;
        int i;
        int i2;
        String str;
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        C323486xZ A0V = C13990Tnq.A0V(merchantShoppingCartFragment);
        if (A0V.A00 == A0V.A02) {
            BRw = new C19590WcF(merchantShoppingCartFragment.A02).BRw(merchantShoppingCartFragment.requireContext(), merchantShoppingCartFragment.A02);
            if (merchantShoppingCartFragment.A08.A00.getVisibility() == 0) {
                i2 = merchantShoppingCartFragment.A00;
            } else {
                i2 = 0;
            }
            str = "cart_item_limit_reached_user_error";
        } else {
            List<ProductVariantPossibleValueDictIntf> list = product.A0O;
            if (list != null && !list.isEmpty()) {
                HashMap hashMap = new HashMap();
                if (list.isEmpty()) {
                    throw DbT.A0m();
                } else if (list.isEmpty()) {
                    throw DbT.A0m();
                } else {
                    for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list) {
                        if (productVariantPossibleValueDictIntf.CFr() == ProductVariantVisualStyle.THUMBNAIL) {
                            hashMap.put(productVariantPossibleValueDictIntf.getId(), productVariantPossibleValueDictIntf.getValue());
                        }
                    }
                    if (list.isEmpty()) {
                        throw DbT.A0m();
                    }
                    list.size();
                    hashMap.size();
                }
            }
            C20927X4s A07 = C13990Tnq.A0V(merchantShoppingCartFragment).A07(product, merchantShoppingCartFragment.A0U);
            if (A07 != null) {
                BRw = A07.BRw(merchantShoppingCartFragment.requireContext(), merchantShoppingCartFragment.A02);
                if (merchantShoppingCartFragment.A08.A00.getVisibility() == 0) {
                    i = merchantShoppingCartFragment.A00;
                } else {
                    i = 0;
                }
                str = "shopping_cart_add_item_optimistic_user_error";
            } else {
                int A02 = merchantShoppingCartFragment.A07.A08.A02(product.A0H);
                if (A02 == -1) {
                    A02 = 0;
                }
                A02(this, new C20310Woz(this, product, product), A02);
                return;
            }
        }
        C18695Vwt.A02(BRw, i2, str);
    }

    public final void DRN(User user) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        merchantShoppingCartFragment.A0B.CqN(user, merchantShoppingCartFragment.A0X, AnonymousClass000.A00(171));
    }

    public final void DRP(User user) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        merchantShoppingCartFragment.A0B.CqN(user, merchantShoppingCartFragment.A0X, AnonymousClass000.A00(171));
    }

    public final void DRR(User user) {
        A06(user, AnonymousClass000.A00(171));
    }

    public final void DZc(Product product) {
        A01(this, product, "shopping_bag_product_collection");
    }

    public final void DuP(UnavailableProduct unavailableProduct, int i, int i2) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        merchantShoppingCartFragment.A0B.CqR(unavailableProduct.BRo(), merchantShoppingCartFragment.A0X, merchantShoppingCartFragment.A0N, merchantShoppingCartFragment.A0V, merchantShoppingCartFragment.A0P, merchantShoppingCartFragment.A0R, merchantShoppingCartFragment.A0O, "unavailable_product_card");
    }

    public final void ECE(View view, ProductFeedItem productFeedItem) {
        MerchantShoppingCartFragment merchantShoppingCartFragment = this.A00;
        MultiProductComponent multiProductComponent = merchantShoppingCartFragment.A06;
        if (multiProductComponent != null) {
            merchantShoppingCartFragment.A0I.A01(view, new UO3(productFeedItem, multiProductComponent.A06));
        }
    }
}
