package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.shopping.ProductArEffectMetadataIntf;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration;
import com.instagram.shopping.intf.productpicker.ProductPickerArguments;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.3kF  reason: invalid class name and case insensitive filesystem */
public abstract class C249713kF {
    public static C249713kF A00;

    public Bundle A02(String str) {
        return ((C249723kG) this).A00.A02(str);
    }

    public C55656HlF A03(AnonymousClass0iw r2, UserSession userSession, String str) {
        return ((C249723kG) this).A00.A03(r2, userSession, str);
    }

    public C17990VjS A04(28D r2, AnonymousClass0iw r3, UserSession userSession, String str) {
        return ((C249723kG) this).A00.A04(r2, r3, userSession, str);
    }

    public W02 A05(UserSession userSession, AnonymousClass4DU r8, String str, String str2, String str3) {
        return ((C249723kG) this).A00.A05(userSession, r8, str, str2, str3);
    }

    public C3504784u A06(AnonymousClass4DH r7, UserSession userSession, ProductItemWithAR productItemWithAR, String str, String str2) {
        return ((C249723kG) this).A00.A06(r7, userSession, productItemWithAR, str, str2);
    }

    public OVZ A07(FragmentActivity fragmentActivity, 28D r11, UserSession userSession, ProductArEffectMetadataIntf productArEffectMetadataIntf, Product product, Boolean bool, String str, String str2) {
        return ((C249723kG) this).A00.A07(fragmentActivity, r11, userSession, productArEffectMetadataIntf, product, bool, str, str2);
    }

    public OVZ A08(FragmentActivity fragmentActivity, 28D r10, UserSession userSession, ProductArEffectMetadataIntf productArEffectMetadataIntf, Product product, String str, String str2) {
        return ((C249723kG) this).A00.A08(fragmentActivity, r10, userSession, productArEffectMetadataIntf, product, str, str2);
    }

    public LP7 A09(Context context, AnonymousClass07i r8, UserSession userSession, C3499582p r10, LE2 le2) {
        return ((C249723kG) this).A00.A09(context, r8, userSession, r10, le2);
    }

    public C17940ViV A0A(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        return ((C249723kG) this).A00.A0A(fragmentActivity, userSession, str);
    }

    public C17782Vft A0B(UserSession userSession) {
        return ((C249723kG) this).A00.A0B(userSession);
    }

    @Deprecated
    public abstract C231142qw A0C(Context context, FragmentActivity fragmentActivity, RankingInfo rankingInfo, UserSession userSession, AnonymousClass4DU r5, C22538Y8j y8j, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2);

    public C17643VbZ A0D(UserSession userSession, C16581Uxb uxb, String str, String str2, int i, boolean z, boolean z2) {
        return ((C249723kG) this).A00.A0D(userSession, uxb, str, str2, i, z, z2);
    }

    public C50328FYi A0E(UserSession userSession) {
        return ((C249723kG) this).A00.A0E(userSession);
    }

    public abstract AnonymousClass35M A0F(UserSession userSession);

    public L58 A0G(FragmentActivity fragmentActivity, UserSession userSession) {
        return ((C249723kG) this).A00.A0G(fragmentActivity, userSession);
    }

    public C10802RyO A0H(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r9, AndroidLink androidLink, String str) {
        return ((C249723kG) this).A00.A0H(fragmentActivity, userSession, r9, androidLink, str);
    }

    public LPD A0I(Context context, AnonymousClass07i r3, UserSession userSession, C66464MSs mSs) {
        return ((C249723kG) this).A00.A0I(context, r3, userSession, mSs);
    }

    public C18025Vk1 A0J(FragmentActivity fragmentActivity, UserSession userSession, C16675UzB uzB, String str, String str2) {
        return ((C249723kG) this).A00.A0J(fragmentActivity, userSession, uzB, str, str2);
    }

    public WNN A0K(FragmentActivity fragmentActivity, ProductReviewStatus productReviewStatus, UserSession userSession, AnonymousClass4DU r14, String str, String str2, String str3, String str4, String str5) {
        return ((C249723kG) this).A00.A0K(fragmentActivity, productReviewStatus, userSession, r14, str, str2, str3, str4, str5);
    }

    public WNN A0L(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r10, Product product, String str, String str2) {
        return ((C249723kG) this).A00.A0L(fragmentActivity, userSession, r10, product, str, str2);
    }

    public W2P A0M(Uri uri, FragmentActivity fragmentActivity, UserSession userSession, 1Xj r11, AnonymousClass4DU r12, boolean z) {
        return ((C249723kG) this).A00.A0M(uri, fragmentActivity, userSession, r11, r12, z);
    }

    public W2P A0N(FragmentActivity fragmentActivity, SellerShoppableFeedType sellerShoppableFeedType, UserSession userSession, AnonymousClass4DU r14, String str, String str2, String str3, String str4, String str5) {
        return ((C249723kG) this).A00.A0N(fragmentActivity, sellerShoppableFeedType, userSession, r14, str, str2, str3, str4, str5);
    }

    public W2P A0O(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r12, AnonymousClass4DU r13, AnonymousClass3W1 r14, User user, String str, String str2) {
        return ((C249723kG) this).A00.A0O(fragmentActivity, userSession, r12, r13, r14, user, str, str2);
    }

    public C56012HrK A0P(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r4) {
        return ((C249723kG) this).A00.A0P(fragmentActivity, userSession, r4);
    }

    public C323536xe A0Q(FragmentActivity fragmentActivity, UserSession userSession, C15380UbZ ubZ, C17869VhM vhM, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return ((C249723kG) this).A00.A0Q(fragmentActivity, userSession, (C15380UbZ) null, vhM, str, str2, str3, str4, str5, (String) null, str7);
    }

    public C323546xf A0R(UserSession userSession, C323536xe r3, String str, String str2) {
        return ((C249723kG) this).A00.A0R(userSession, r3, str, str2);
    }

    public S54 A0S(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        return ((C249723kG) this).A00.A0S(fragmentActivity, userSession, str);
    }

    public W3Y A0T() {
        return ((C249723kG) this).A00.A0T();
    }

    public MUF A0U(Context context, AnonymousClass07i r3, UserSession userSession) {
        return ((C249723kG) this).A00.A0U(context, r3, userSession);
    }

    public C63951LEt A0V(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C63951LEt) userSession.A01(C63951LEt.class, new C13999To1(userSession, 35));
    }

    public EEN A0W(UserSession userSession) {
        return ((C249723kG) this).A00.A0W(userSession);
    }

    public KB3 A0X(UserSession userSession) {
        return ((C249723kG) this).A00.A0X(userSession);
    }

    public Integer A0Y(UserSession userSession) {
        return ((C249723kG) this).A00.A0Y(userSession);
    }

    public void A0a(Activity activity, Fragment fragment, UserSession userSession, String str, String str2) {
        ((C249723kG) this).A00.A0a(activity, fragment, userSession, str, str2);
    }

    public void A0b(Activity activity, Fragment fragment, UserSession userSession, String str, String str2) {
        ((C249723kG) this).A00.A0b(activity, fragment, userSession, str, str2);
    }

    public void A0c(Activity activity, UserSession userSession, String str, boolean z) {
        ((C249723kG) this).A00.A0c(activity, userSession, str, z);
    }

    public void A0d(Context context, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4) {
        ((C249723kG) this).A00.A0d(context, fragmentActivity, userSession, str, str2, str3, str4);
    }

    public void A0e(Context context, 0hq r7, UserSession userSession, ProductGroup productGroup, C66465MSt mSt, String str, boolean z) {
        C65748Lz2 lz2 = new C65748Lz2(mSt);
        C331127Pr r0 = new C331127Pr(userSession);
        r0.A0d = str;
        C331157Pu A002 = r0.A00();
        C17454VWh vWh = new C17454VWh(A002, (C249723kG) this, lz2);
        Bundle bundle = new Bundle();
        bundle.putParcelable(AnonymousClass000.A00(2248), productGroup);
        bundle.putBoolean(AnonymousClass000.A00(3097), z);
        UZF uzf = new UZF();
        uzf.A05 = vWh;
        uzf.setArguments(bundle);
        A002.A03(context, uzf);
    }

    public void A0f(Context context, UserSession userSession, String str) {
        ((C249723kG) this).A00.A0f(context, userSession, str);
    }

    public void A0g(Context context, UserSession userSession, String str) {
        ((C249723kG) this).A00.A0g(context, userSession, str);
    }

    public void A0h(Context context, ProductGroup productGroup, Product product) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("product", product);
        bundle.putParcelable("product_group", (Parcelable) null);
        bundle.putString("bottom_sheet_content_fragment", AnonymousClass000.A00(1810));
        bundle.putBoolean("finish_host_activity_on_dismissed", true);
        AnonymousClass6W8.A06(context, bundle, TransparentModalActivity.class, "bottom_sheet");
    }

    public void A0i(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, C16509Uw6 uw6, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        ((C249723kG) this).A00.A0i(bundle, fragmentActivity, userSession, uw6, num, str, str2, str3, (String) null, (String) null, (String) null);
    }

    public void A0j(Fragment fragment, FragmentActivity fragmentActivity, FragmentActivity fragmentActivity2, UserSession userSession, ShoppingTaggingFeedArguments shoppingTaggingFeedArguments, String str, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        bundle.putParcelable(C273654mx.A00(406), shoppingTaggingFeedArguments);
        bundle.putString("shopping_session_id", (String) null);
        AnonymousClass6W8 r1 = new AnonymousClass6W8(fragmentActivity, bundle, userSession, TransparentModalActivity.class, C273654mx.A00(3335));
        r1.A07();
        int i = 18;
        if (z2) {
            i = 16;
        }
        if (fragmentActivity2 != null) {
            r1.A0A(fragmentActivity, i);
        } else if (fragment != null) {
            r1.A0D(fragment, i);
        } else {
            r1.A0C(fragmentActivity);
        }
    }

    public void A0k(Fragment fragment, UserSession userSession, 1Xj r4) {
        ((C249723kG) this).A00.A0k(fragment, userSession, r4);
    }

    public void A0l(Fragment fragment, UserSession userSession, ProductPickerArguments productPickerArguments) {
        ((C249723kG) this).A00.A0l(fragment, userSession, productPickerArguments);
    }

    public void A0n(FragmentActivity fragmentActivity, V1Z v1z, V1W v1w, V1Y v1y, V1X v1x, UserSession userSession, String str, String str2, String str3, int i, boolean z) {
        ((C249723kG) this).A00.A0n(fragmentActivity, v1z, v1w, v1y, v1x, userSession, str, str2, str3, i, false);
    }

    public void A0o(FragmentActivity fragmentActivity, V1Z v1z, V1W v1w, V1Y v1y, V1X v1x, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        ((C249723kG) this).A00.A0o(fragmentActivity, v1z, v1w, v1y, v1x, userSession, str, str2, str3, str4, str5, str6, (String) null, false);
    }

    public void A0p(FragmentActivity fragmentActivity, V1Z v1z, V1W v1w, V1Y v1y, V1X v1x, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        ((C249723kG) this).A00.A0p(fragmentActivity, v1z, v1w, v1y, v1x, userSession, str, str2, str3, str4, str5, str6, false);
    }

    public void A0q(FragmentActivity fragmentActivity, UserSession userSession) {
        ((C249723kG) this).A00.A0q(fragmentActivity, userSession);
    }

    public void A0r(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r9, AnonymousClass4DU r10, AnonymousClass3W1 r11) {
        ((C249723kG) this).A00.A0r(fragmentActivity, userSession, r9, r10, r11);
    }

    public void A0s(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r13, AnonymousClass4DU r14, AnonymousClass3W1 r15, C262944Gp r16, XCE xce, String str, String str2) {
        ((C249723kG) this).A00.A0s(fragmentActivity, userSession, r13, r14, r15, r16, xce, str, str2);
    }

    public void A0t(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r13, AnonymousClass4DU r14, AnonymousClass3W1 r15, C262944Gp r16, String str, String str2, String str3) {
        ((C249723kG) this).A00.A0t(fragmentActivity, userSession, r13, r14, r15, r16, str, str2, str3);
    }

    public void A0u(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r10, AnonymousClass4DU r11, C250973mM r12, C273414mX r13) {
        ((C249723kG) this).A00.A0u(fragmentActivity, userSession, r10, r11, r12, r13);
    }

    public void A0v(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r7, FeaturedProductMediaFeedGridConfiguration featuredProductMediaFeedGridConfiguration, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2) {
        C309516Yo r1 = new C309516Yo(fragmentActivity, userSession);
        ((C249723kG) this).A00.A0T();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        bundle.putString("prior_module_name", r7.getModuleName());
        bundle.putString("prior_submodule_name", str);
        bundle.putParcelable(AnonymousClass000.A00(54), productDetailsPageLoggingInfo);
        bundle.putString("shopping_session_id", str2);
        bundle.putParcelable(AnonymousClass000.A00(1348), featuredProductMediaFeedGridConfiguration);
        C15348Uaz uaz = new C15348Uaz();
        uaz.setArguments(bundle);
        r1.A0E(uaz);
        r1.A04();
    }

    public void A0w(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r7, FeaturedProductMediaFeedGridConfiguration featuredProductMediaFeedGridConfiguration, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2) {
        C309516Yo r1 = new C309516Yo(fragmentActivity, userSession);
        ((C249723kG) this).A00.A0T();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        bundle.putString("prior_module_name", r7.getModuleName());
        bundle.putString("prior_submodule_name", str);
        bundle.putParcelable(AnonymousClass000.A00(54), productDetailsPageLoggingInfo);
        bundle.putString("shopping_session_id", str2);
        bundle.putParcelable(AnonymousClass000.A00(1348), featuredProductMediaFeedGridConfiguration);
        C15349Ub0 ub0 = new C15349Ub0();
        ub0.setArguments(bundle);
        r1.A0E(ub0);
        r1.A04();
    }

    public void A0x(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r7, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        C309516Yo r1 = new C309516Yo(fragmentActivity, userSession);
        ((C249723kG) this).A00.A0T();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        bundle.putString("api_path", str2);
        bundle.putString("surface_title", str);
        bundle.putString("merchant_id", str3);
        bundle.putString("next_max_id", str4);
        bundle.putStringArrayList("media_ids", W3Y.A02(list));
        bundle.putString(AnonymousClass000.A00(772), str5);
        bundle.putString("prior_module_name", r7.getModuleName());
        bundle.putString("prior_submodule_name", str6);
        bundle.putParcelable(AnonymousClass000.A00(54), productDetailsPageLoggingInfo);
        bundle.putString("shopping_session_id", str7);
        C15351Ub2 ub2 = new C15351Ub2();
        ub2.setArguments(bundle);
        r1.A0E(ub2);
        r1.A04();
    }

    public void A0y(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r7, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        C309516Yo r1 = new C309516Yo(fragmentActivity, userSession);
        ((C249723kG) this).A00.A0T();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        bundle.putString("api_path", str2);
        bundle.putString("surface_title", str);
        bundle.putString("merchant_id", str3);
        bundle.putString("next_max_id", str4);
        bundle.putStringArrayList("media_ids", W3Y.A02(list));
        bundle.putString(AnonymousClass000.A00(772), str5);
        bundle.putString("prior_module_name", r7.getModuleName());
        bundle.putString("prior_submodule_name", str6);
        bundle.putParcelable(AnonymousClass000.A00(54), productDetailsPageLoggingInfo);
        bundle.putString("shopping_session_id", str7);
        C15350Ub1 ub1 = new C15350Ub1();
        ub1.setArguments(bundle);
        r1.A0E(ub1);
        r1.A04();
    }

    public void A0z(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r11, Product product, String str, String str2, String str3) {
        ((C249723kG) this).A00.A0z(fragmentActivity, userSession, r11, product, str, str2, str3);
    }

    public void A10(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r4, String str) {
        ((C249723kG) this).A00.A10(fragmentActivity, userSession, r4, str);
    }

    public void A11(FragmentActivity fragmentActivity, UserSession userSession, IgFundedIncentive igFundedIncentive) {
        ((C249723kG) this).A00.A11(fragmentActivity, userSession, igFundedIncentive);
    }

    public void A12(FragmentActivity fragmentActivity, UserSession userSession, ProductCollectionLinkIntf productCollectionLinkIntf, String str, String str2) {
        ((C249723kG) this).A00.A12(fragmentActivity, userSession, productCollectionLinkIntf, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (X.AnonymousClass5He.A00(r1) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A13(androidx.fragment.app.FragmentActivity r10, com.instagram.common.session.UserSession r11, com.instagram.user.model.Product r12) {
        /*
            r9 = this;
            r7 = r9
            X.3kG r7 = (X.C249723kG) r7
            r8 = r12
            com.instagram.api.schemas.UntaggableReason r2 = r12.A06
            if (r2 == 0) goto L_0x0046
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L_0x0046
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x0046
            com.instagram.api.schemas.LinkWithText r5 = r2.A02
            X.8ab r2 = new X.8ab
            r4 = r10
            r2.<init>((android.app.Activity) r10)
            r2.A05 = r1
            r2.A0q(r0)
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.String r1 = r10.getString(r0)
            r0 = 0
            r2.A0c(r0, r1)
            if (r5 == 0) goto L_0x0047
            java.lang.String r1 = r5.A00
            boolean r0 = X.AnonymousClass5He.A00(r1)
            if (r0 != 0) goto L_0x0047
        L_0x0032:
            X.FIe r3 = new X.FIe
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A0a(r3, r1)
            r0 = 1
            r2.A0r(r0)
            android.app.Dialog r0 = r2.A02()
            X.AnonymousClass0fN.A00(r0)
        L_0x0046:
            return
        L_0x0047:
            r0 = 2131969882(0x7f13475a, float:1.95767E38)
            java.lang.String r1 = r10.getString(r0)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C249713kF.A13(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, com.instagram.user.model.Product):void");
    }

    public void A14(FragmentActivity fragmentActivity, UserSession userSession, User user, String str, String str2, String str3, String str4) {
        ((C249723kG) this).A00.A14(fragmentActivity, userSession, user, str, str2, str3, str4);
    }

    public void A15(FragmentActivity fragmentActivity, UserSession userSession, User user, String str, String str2, String str3, String str4, List list, boolean z) {
        ((C249723kG) this).A00.A15(fragmentActivity, userSession, user, str, str2, str3, str4, list, z);
    }

    public void A16(FragmentActivity fragmentActivity, UserSession userSession, Boolean bool, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3) {
        LOp A002 = C17052VGa.A00(userSession);
        synchronized (A002) {
            C61047Jvl A003 = LOp.A00(A002, str4);
            if (((Set) A003.A01).contains(37370080)) {
                02m.A0p.markerEnd(37370080, 111);
            } else {
                A003.A01 = 094.A01(37370080, (Set) A003.A01);
            }
            02m.A0p.markerStart(37370080);
            if (str4 != null) {
                02m.A0p.markerAnnotate(37370080, "merchant_id", str4);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        bundle.putString("prior_module_name", str);
        bundle.putString("prior_submodule_name", str2);
        bundle.putString("shopping_session_id", str3);
        bundle.putBoolean(AnonymousClass000.A00(3422), z);
        bundle.putString("merchant_id", str4);
        bundle.putString(C66579MXk.A00(958), str5);
        bundle.putString("surface_title", str6);
        bundle.putString("media_id", str7);
        bundle.putString(AnonymousClass000.A00(5240), str8);
        if (l != null) {
            bundle.putLong(AnonymousClass000.A00(3985), l.longValue());
        }
        String str10 = str9;
        if (str9 != null) {
            bundle.putString(AnonymousClass000.A00(3984), str10);
        }
        bundle.putBoolean(AnonymousClass000.A00(3423), bool.booleanValue());
        bundle.putBoolean(AnonymousClass000.A00(3342), false);
        C309516Yo r1 = new C309516Yo(fragmentActivity, userSession);
        r1.A08();
        A00.A0T();
        C15335Uak uak = new C15335Uak();
        uak.setArguments(bundle);
        r1.A0E(uak);
        r1.A04();
    }

    public void A17(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        ((C249723kG) this).A00.A17(fragmentActivity, userSession, str);
    }

    public void A18(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        C309516Yo r3 = new C309516Yo(fragmentActivity, userSession);
        ((C249723kG) this).A00.A0T();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        bundle.putString("merchant_id", str);
        bundle.putString("prior_module_name", str2);
        C15347Uay uay = new C15347Uay();
        uay.setArguments(bundle);
        r3.A0E(uay);
        r3.A04();
    }

    public void A19(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        ((C249723kG) this).A00.A19(fragmentActivity, userSession, str, str2);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.FpL, java.lang.Object] */
    public void A1A(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        new BitSet(0);
        str.getClass();
        hashMap.put("shopping_session_id", str);
        hashMap.put("prior_module", str2);
        str3.getClass();
        hashMap.put("prior_submodule", str3);
        hashMap.put(AnonymousClass000.A00(769), new S2J(fragmentActivity).A00());
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
        igBloksScreenConfig.A02 = new Object();
        C46649DiU A06 = C46649DiU.A06(AnonymousClass000.A00(1185), C359608dC.A01(hashMap), hashMap2);
        A06.A00 = 760101916;
        A06.A05 = null;
        A06.A01 = 0;
        A06.A06 = null;
        A06.A03 = null;
        A06.A02 = null;
        A06.A04 = null;
        A06.A0H(hashMap3);
        A06.A0D(fragmentActivity, igBloksScreenConfig);
    }

    public void A1B(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3) {
        ((C249723kG) this).A00.A1B(fragmentActivity, userSession, str, str2, str3);
    }

    public void A1E(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        ((C249723kG) this).A00.A1E(fragmentActivity, userSession, str, str2, z);
    }

    public void A1F(FragmentActivity fragmentActivity, UserSession userSession, String str, boolean z) {
        ((C249723kG) this).A00.A1F(fragmentActivity, userSession, str, z);
    }

    public void A1G(AnonymousClass4DH r2, UserSession userSession, String str) {
        ((C249723kG) this).A00.A1G(r2, userSession, str);
    }

    public void A1H(UserSession userSession, Integer num, String str, String str2) {
        ((C249723kG) this).A00.A1H(userSession, num, str, str2);
    }

    public void A1I(UserSession userSession, Integer num, String str, String str2) {
        ((C249723kG) this).A00.A1I(userSession, num, str, str2);
    }

    public boolean A1K(DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, FragmentActivity fragmentActivity, ProductReviewStatus productReviewStatus, UserSession userSession, 1Xj r18, AnonymousClass4DU r19, C310206ab r20, String str, String str2, boolean z) {
        return ((C249723kG) this).A00.A1K(onDismissListener, onShowListener, fragmentActivity, productReviewStatus, userSession, r18, r19, r20, str, str2, z);
    }

    public final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        A0m(fragmentActivity, V1Z.UNKNOWN, V1W.UNKNOWN, V1Y.UNKNOWN, V1X.UNKNOWN, userSession, (Long) null, str, str2, str3, str4, (String) null, (String) null, (String) null, (String) null, str5, str6, (String) null, (String) null, (String) null, (HashMap) null, false);
    }

    public String A0Z(Uri uri, 0bY r5, String str) {
        if (uri == null) {
            return null;
        }
        try {
            return uri.getQueryParameter("app_id");
        } catch (UnsupportedOperationException e) {
            r5.EFT(str, String.format("URI getQueryParameter failed: %s", new Object[]{uri.toString()}), e);
            return null;
        }
    }

    public void A0m(FragmentActivity fragmentActivity, V1Z v1z, V1W v1w, V1Y v1y, V1X v1x, UserSession userSession, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, HashMap hashMap, boolean z) {
        String str14 = str4;
        String str15 = str3;
        String str16 = str2;
        String str17 = str;
        Long l2 = l;
        UserSession userSession2 = userSession;
        String str18 = str12;
        String str19 = str11;
        V1X v1x2 = v1x;
        String str20 = str10;
        V1Y v1y2 = v1y;
        String str21 = str9;
        V1W v1w2 = v1w;
        String str22 = str8;
        V1Z v1z2 = v1z;
        String str23 = str7;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        ((C249723kG) this).A00.A0m(fragmentActivity2, v1z2, v1w2, v1y2, v1x2, userSession2, l2, str17, str16, str15, str14, str5, str6, str23, str22, str21, str20, str19, str18, str13, hashMap, false);
    }

    public void A1C(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        ((C249723kG) this).A00.A1C(fragmentActivity, userSession, str, str2, "tags", str4, str5, (String) null);
    }

    public void A1J(C331157Pu r18, C331127Pr r19, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z) {
        ((C249723kG) this).A00.A1J(r18, r19, (Long) null, str, str2, str3, AnonymousClass000.A00(5376), str5, str6, (String) null, (String) null, str9, str10, (String) null, (String) null, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1D(androidx.fragment.app.FragmentActivity r9, com.instagram.common.session.UserSession r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, boolean r16, boolean r17) {
        /*
            r8 = this;
            r2 = 2131964214(0x7f133136, float:1.9565203E38)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r0 = "prior_module"
            r1.put(r0, r12)
            java.lang.String r3 = "true"
            java.lang.String r5 = "false"
            r4 = r5
            if (r15 == 0) goto L_0x0015
            r4 = r3
        L_0x0015:
            r0 = 783(0x30f, float:1.097E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.put(r0, r4)
            if (r16 != 0) goto L_0x0021
            r3 = r5
        L_0x0021:
            r0 = 673(0x2a1, float:9.43E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.put(r0, r3)
            if (r13 == 0) goto L_0x0031
            java.lang.String r0 = "catalog_id"
            r1.put(r0, r13)
        L_0x0031:
            if (r14 == 0) goto L_0x0112
            java.lang.String r0 = "item_id"
            r1.put(r0, r14)
            if (r16 == 0) goto L_0x00ca
            r2 = 2131964215(0x7f133137, float:1.9565205E38)
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            r0 = 2
            X.0qQ.A0B(r12, r0)
            java.lang.String r3 = "instagram_shopping_catalog_delete_product_button_click"
            java.lang.String r0 = "product_composer"
            X.0xI r3 = X.0xI.A01(r3, r0)
            java.lang.String r0 = "entry_point"
            r3.A0C(r0, r12)
            java.lang.String r0 = "waterfall_id"
            r3.A0C(r0, r11)
            X.0xN r0 = X.C60510iO.A00(r10)
            r0.EFq(r3)
            X.0wc r4 = X.AnonymousClass0kN.A02(r10)
            java.lang.String r3 = "catalog_mobile_delete_product_entrypoint_click"
            X.0kJ r0 = r4.A00
            X.0Aj r4 = r4.A00(r0, r3)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x00a1
            X.9t8 r3 = X.C391469t8.UNKNOWN
            java.lang.String r0 = "event_location"
            r4.A8M(r3, r0)
            X.B8C r7 = new X.B8C
            r7.<init>()
        L_0x0080:
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r14)
            if (r0 == 0) goto L_0x00c7
            long r5 = r0.longValue()
        L_0x008c:
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0 = 99
            java.lang.String r0 = X.Pxd.A00(r0)
            r7.A05(r0, r3)
            java.lang.String r0 = "event_data"
            r4.AAK(r7, r0)
        L_0x009e:
            r4.Cgf()
        L_0x00a1:
            java.lang.String r0 = "com.bloks.www.bloks.catalogitem.composer"
            X.DiU r3 = X.C46649DiU.A04(r0, r1)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r1.<init>((X.0lg) r10)
            java.lang.String r0 = r9.getString(r2)
            r1.A0U = r0
            X.3M3 r0 = X.C49891FBs.A02(r1, r3)
            X.6Yo r1 = new X.6Yo
            r1.<init>(r9, r10)
            r1.A0E(r0)
            if (r17 == 0) goto L_0x00c3
            r0 = 0
            r1.A0D = r0
        L_0x00c3:
            r1.A04()
            return
        L_0x00c7:
            r5 = 0
            goto L_0x008c
        L_0x00ca:
            r2 = 2131964216(0x7f133138, float:1.9565207E38)
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            r0 = 2
            X.0qQ.A0B(r12, r0)
            java.lang.String r3 = "instagram_shopping_catalog_edit_product_button_click"
            java.lang.String r0 = "product_composer"
            X.0xI r3 = X.0xI.A01(r3, r0)
            java.lang.String r0 = "entry_point"
            r3.A0C(r0, r12)
            java.lang.String r0 = "waterfall_id"
            r3.A0C(r0, r11)
            X.0xN r0 = X.C60510iO.A00(r10)
            r0.EFq(r3)
            X.0wc r4 = X.AnonymousClass0kN.A02(r10)
            java.lang.String r3 = "catalog_mobile_edit_product_button_click"
            X.0kJ r0 = r4.A00
            X.0Aj r4 = r4.A00(r0, r3)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x00a1
            X.9t8 r3 = X.C391469t8.UNKNOWN
            java.lang.String r0 = "event_location"
            r4.A8M(r3, r0)
            X.B8D r7 = new X.B8D
            r7.<init>()
            goto L_0x0080
        L_0x0112:
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            r0 = 2
            X.0qQ.A0B(r12, r0)
            X.0xG r0 = X.C49299Esi.A00
            X.0wc r5 = X.AnonymousClass0kN.A01(r0, r10)
            java.lang.String r0 = "catalog_mobile_add_product_button_click"
            X.0kJ r4 = r5.A00
            X.0Aj r6 = r5.A00(r4, r0)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x014b
            X.9t8 r3 = X.C391469t8.UNKNOWN
            java.lang.String r0 = "event_location"
            r6.A8M(r3, r0)
            X.B8B r3 = new X.B8B
            r3.<init>()
            java.lang.String r0 = "surface"
            r3.A06(r0, r12)
            java.lang.String r0 = "event_data"
            r6.AAK(r3, r0)
            r6.Cgf()
        L_0x014b:
            java.lang.String r0 = "instagram_shopping_catalog_add_product_button_click"
            X.0Aj r4 = r5.A00(r4, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = "waterfall_id"
            r4.AAJ(r0, r11)
            java.lang.String r0 = "entry_point"
            r4.AAJ(r0, r12)
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C249713kF.A1D(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):void");
    }
}
