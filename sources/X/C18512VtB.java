package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.ShopManagementAccessState;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.VtB  reason: case insensitive filesystem */
public final class C18512VtB {
    public final RankingInfo A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final Product A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final VP6 A09;

    public C18512VtB(RankingInfo rankingInfo, AnonymousClass4DH r9, UserSession userSession, VP6 vp6, Product product, String str, String str2, String str3, String str4) {
        List A0T;
        User user;
        this.A01 = r9;
        this.A02 = userSession;
        this.A03 = product;
        this.A04 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A09 = vp6;
        this.A00 = rankingInfo;
        this.A06 = str4;
        ArrayList arrayList = new ArrayList();
        this.A08 = arrayList;
        String str5 = null;
        if (!(product == null || (user = product.A0B) == null)) {
            str5 = AnonymousClass3ZA.A00(user);
        }
        0eE r5 = AnonymousClass0t1.A01;
        User A012 = r5.A01(userSession);
        Boolean AkH = A012.A03.AkH();
        if (AkH != null && AkH.booleanValue() && 0qQ.A0K(userSession.A06, str5)) {
            ShopManagementAccessState Bti = A012.A03.Bti();
            if (!((Bti == null ? ShopManagementAccessState.A07 : Bti) == ShopManagementAccessState.ADD_HIDE_UNIFIED_INVENTORY || product == null || !product.A03())) {
                arrayList.add(C16577UxW.CHANGE_DEFAULT_PHOTO);
            }
            ShopManagementAccessState Bti2 = A012.A03.Bti();
            if (!((Bti2 == null ? ShopManagementAccessState.A07 : Bti2) == ShopManagementAccessState.A07 || (A0T = r5.A01(this.A02).A0T()) == null || !A0T.contains(EWE.PRODUCT_DETAILS_PAGE) || product == null || !AnonymousClass7TF.A1Y(product.A01.A0M, true))) {
                arrayList.add(C16577UxW.DELETE_PRODUCT);
                arrayList.add(C16577UxW.EDIT_PRODUCT);
            }
        }
        if (!0qQ.A0K(userSession.A06, str5)) {
            arrayList.add(C16577UxW.REPORT_ITEM);
            if (product == null) {
                return;
            }
            if ("instagram_shopping_home".equals(str3)) {
                arrayList.add(C16577UxW.NOT_INTERESTED);
            }
        } else if (product == null) {
            return;
        }
        if (2R8.A00(userSession)) {
            arrayList.add(C16577UxW.DEBUG_INFO);
            arrayList.add(C16577UxW.SHOW_CHECKOUT_AWARENESS_INTERSTITIAL);
            arrayList.add(C16577UxW.LEAVE_REVIEW);
        }
    }

    public static final void A00(C16577UxW uxW, C18512VtB vtB) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        UserSession userSession;
        FragmentActivity fragmentActivity;
        C249713kF r2;
        String str5;
        switch (uxW.ordinal()) {
            case 0:
            case 1:
                Product product = vtB.A03;
                if (product != null) {
                    AnonymousClass4DH r22 = vtB.A01;
                    r22.requireActivity();
                    C59689JTv.A07(r22.getActivity(), 2131969822);
                    UserSession userSession2 = vtB.A02;
                    product.A00(userSession2);
                    ProductTile productTile = new ProductTile(product);
                    productTile.A04 = vtB.A00;
                    C17055VGd.A00(AnonymousClass0kN.A01(r22, userSession2), productTile, vtB.A07, vtB.A05);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            case 2:
                Product product2 = vtB.A03;
                if (product2 != null) {
                    C309516Yo r23 = new C309516Yo(vtB.A01.requireActivity(), vtB.A02);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("product", product2);
                    DbW.A0x(bundle, new UZI(), r23);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            case 3:
                Product product3 = vtB.A03;
                if (product3 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("product_id", product3.A0H);
                    hashMap.put("merchant_id", C13989Tnp.A0q(product3));
                    hashMap.put(AnonymousClass000.A00(359), "product");
                    AnonymousClass4DH r1 = vtB.A01;
                    String A0m = DbU.A0m(r1, 2131952347);
                    C46649DiU A042 = C46649DiU.A04(AnonymousClass000.A00(2822), hashMap);
                    FragmentActivity requireActivity = r1.requireActivity();
                    IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) vtB.A02);
                    igBloksScreenConfig.A0U = A0m;
                    A042.A0D(requireActivity, igBloksScreenConfig);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            case 4:
                return;
            case 5:
                VP6 vp6 = vtB.A09;
                r2 = C249713kF.A00;
                AdsProductPageFragment adsProductPageFragment = vp6.A00;
                fragmentActivity = adsProductPageFragment.requireActivity();
                userSession = adsProductPageFragment.A01;
                str4 = AnonymousClass7TF.A0b();
                str3 = EWE.PRODUCT_DETAILS_PAGE.toString();
                str = adsProductPageFragment.A0W;
                str2 = null;
                z2 = false;
                z = false;
                break;
            case 6:
                VP6 vp62 = vtB.A09;
                r2 = C249713kF.A00;
                AdsProductPageFragment adsProductPageFragment2 = vp62.A00;
                fragmentActivity = adsProductPageFragment2.requireActivity();
                userSession = adsProductPageFragment2.A01;
                str4 = AnonymousClass7TF.A0b();
                str3 = EWE.PRODUCT_DETAILS_PAGE.toString();
                str = adsProductPageFragment2.A0W;
                str2 = null;
                z2 = false;
                z = true;
                break;
            case 7:
                Product product4 = vtB.A03;
                if (product4 != null) {
                    AnonymousClass4DH r4 = vtB.A01;
                    FragmentActivity activity = r4.getActivity();
                    if (activity != null) {
                        UserSession userSession3 = vtB.A02;
                        String str6 = vtB.A07;
                        User user = product4.A0B;
                        if (user == null || (str5 = C13988Tno.A0b(user)) == null) {
                            str5 = "";
                        }
                        C17074VGw.A00(activity, r4, userSession3, str6, str5);
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0y();
            default:
                throw new RuntimeException();
        }
        r2.A1D(fragmentActivity, userSession, str4, str3, str2, str, z2, z, z2);
    }
}
