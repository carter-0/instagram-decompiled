package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.location.platform.api.Location;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.promote.model.AudienceInterest;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalInjectionUnit;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.model.LeadGenTrustSignal;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.encoding.Decoder;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Tnr  reason: case insensitive filesystem */
public abstract class C13991Tnr {
    public static Bundle A05() {
        Bundle bundle = new Bundle();
        bundle.putString("error_title", (String) null);
        bundle.putString(TraceFieldType.Error, (String) null);
        return bundle;
    }

    public static C15275UZd A0N(BaseBundle baseBundle, String str) {
        baseBundle.putString("error_type", str);
        baseBundle.putString("ad_account_id", (String) null);
        return new C15275UZd();
    }

    public static Integer A0W(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return Integer.valueOf(parcel.readInt());
        }
        return null;
    }

    public static String A0a(int i, String str) {
        String substring = str.substring(0, i);
        0qQ.A07(substring);
        return 002.A0R("/api/v1/", substring);
    }

    public static String A0l(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        return decoder.AO9();
    }

    public static ArrayList A0o(UserSession userSession, List list) {
        0qQ.A0B(userSession, 0);
        return C296885qo.A06(userSession, (C295795ov) null, list);
    }

    public static C255543uJ A0q(String str, C255533uI r3) {
        C255543uJ r1 = new C255543uJ(str, r3, 1);
        r1.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        return r1;
    }

    public static void A0u(Parcel parcel, LeadGenTrustSignal leadGenTrustSignal, int i) {
        if (leadGenTrustSignal == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        leadGenTrustSignal.writeToParcel(parcel, i);
    }

    public static void A0x(Fragment fragment) {
        C59689JTv.A01(fragment.getActivity(), "shopping_feed_failed", 2131956760, 0);
    }

    public static void A11(0Aj r2, int i) {
        r2.A9F("item_count", Long.valueOf((long) i));
    }

    public static void A1K(Object obj, C262224Cq r3, int i) {
        1Eo.A05(19B.A00, new MG5(obj, (AnonymousClass4D7) null, i), r3);
    }

    public static void A1L(Object obj, C262224Cq r3, int i) {
        1Eo.A05(19B.A00, new MFT(obj, (AnonymousClass4D7) null, i), r3);
    }

    public static int A00(int i, Object obj, Object obj2) {
        if (obj instanceof Double) {
            return ((Number) obj2).intValue();
        }
        return i;
    }

    public static ColorStateList A02(C242403Tx r0) {
        if (r0 != null) {
            return r0.A00();
        }
        return null;
    }

    public static PorterDuff.Mode A03(C242403Tx r0) {
        if (r0 != null) {
            return r0.A01();
        }
        return null;
    }

    public static BaseBundle A04(Object obj) {
        return (BaseBundle) ((C15335Uak) obj).A05.getValue();
    }

    public static InputMethodManager A07(Context context) {
        Object systemService = context.getSystemService("input_method");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    public static AnonymousClass4L7 A0C() {
        return new AnonymousClass4L7(AnonymousClass4L8.A00, "iconic_current_presence");
    }

    public static C297895sX A0K(C297895sX r2, float f) {
        C324126yg r1 = new C324126yg(r2);
        r1.A00(f);
        return new C297895sX(r1);
    }

    public static XFBTargetingAutomationAdvantageAudienceStatus A0L(AdvantageAudienceData advantageAudienceData) {
        if (advantageAudienceData != null) {
            return advantageAudienceData.Aa9();
        }
        return null;
    }

    public static C254523sc A0O(AnonymousClass4DU r2, String str) {
        return new C254523sc(r2, 002.A0R("instagram_survey_", str));
    }

    public static C17523VZc A0R(MediaMapFragment mediaMapFragment) {
        C18663VwL vwL = mediaMapFragment.mMapViewController;
        if (vwL != null) {
            return vwL.A03();
        }
        return null;
    }

    public static Integer A0X(String str) {
        if (str == null) {
            return null;
        }
        return C18104VlY.A00(str);
    }

    public static String A0b(Context context, String str, int i) {
        String A0g = 002.A0g(str, "\n\n", context.getString(i));
        0qQ.A07(A0g);
        return A0g;
    }

    public static String A0f(C319836rJ r1) {
        String str = (String) r1.A00(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (str == null) {
            return 2EG.A46.toString();
        }
        return str;
    }

    public static String A0g(PromoteData promoteData, int i) {
        int i2 = promoteData.A06;
        Currency currency = promoteData.A1j;
        0qQ.A06(currency);
        return W2x.A02(currency, i, i2);
    }

    public static String A0j(Product product) {
        User user = product.A0B;
        if (user != null) {
            return AnonymousClass3ZA.A00(user);
        }
        return null;
    }

    public static StringBuilder A0m() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n            Group: ");
        return sb;
    }

    public static ArrayList A0n(AnonymousClass0xM r1) {
        return new ArrayList(r1.A00.A01());
    }

    public static HashMap A0p(Object obj, Object obj2, Object obj3, Object obj4) {
        HashMap hashMap = new HashMap();
        hashMap.put(obj, obj2);
        hashMap.put(obj3, obj4);
        return hashMap;
    }

    public static void A0t(Drawable drawable, Number number) {
        if (number == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public static void A12(0Aj r2, RankingInfo rankingInfo) {
        if (rankingInfo != null) {
            r2.AAK(VF4.A00(rankingInfo), "ranking_logging_info");
        }
    }

    public static void A13(0Aj r2, ShoppingTaggingFeedArguments shoppingTaggingFeedArguments) {
        r2.A7p("is_organic_product_tagging", Boolean.valueOf(shoppingTaggingFeedArguments.A00));
        r2.Cgf();
    }

    public static void A14(0Aj r2, Long l, int i) {
        if (i != 0) {
            r2.AAE(new C263944Ny(l), "shop_linked_creator_id");
        }
    }

    public static void A15(0Aj r2, Long l, long j) {
        r2.A9F("total_dwell_time", l);
        r2.A9F("page_id", Long.valueOf(j));
    }

    public static void A16(0Aj r2, String str) {
        if (str != null) {
            r2.A9F("merchant_bag_id", 00y.A0n(10, str));
        }
    }

    public static void A19(0Ak r2, ProductTile productTile) {
        1Xj r0;
        if (productTile != null && (r0 = productTile.A05) != null) {
            r2.A0R("displayed_m_pk", r0.getId());
        }
    }

    public static void A1A(0Ak r2, ProductTile productTile) {
        RankingInfo rankingInfo = productTile.A04;
        if (rankingInfo != null) {
            r2.A0N(VF4.A00(rankingInfo), "ranking_logging_info");
        }
    }

    public static void A1D(C270634h3 r1, C296925qs r2, String str) {
        r1.A1B = str;
        r1.A1C = r2.A01.A00().getId();
    }

    public static void A1J(Object obj, Object obj2, JSONObject jSONObject) {
        jSONObject.put("client_subscription_id", obj);
        jSONObject.put(TraceFieldType.BroadcastId, obj2);
    }

    public static Object[] A1b(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        return objArr;
    }

    public static int A01(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return i + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public static View A06(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return activity.getCurrentFocus();
        }
        return null;
    }

    public static TextView A08(View view, int i) {
        View requireViewById = view.requireViewById(i);
        0qQ.A07(requireViewById);
        return (TextView) requireViewById;
    }

    public static 28D A09(BaseBundle baseBundle, String str) {
        if (baseBundle.get(str) instanceof 28D) {
            return (28D) baseBundle.get(str);
        }
        return 28D.A5J;
    }

    public static 28D A0A(BaseBundle baseBundle, String str) {
        Object obj = baseBundle.get(str);
        0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraEntryPointTypes");
        return (28D) obj;
    }

    public static AnonymousClass4L7 A0B() {
        return new AnonymousClass4L7(AnonymousClass4Kz.A01(), "attribution_top_icon_url");
    }

    public static AnonymousClass4L7 A0D() {
        return new AnonymousClass4L7(AnonymousClass4Kz.A01(), "attribution_cta_action_url");
    }

    public static AnonymousClass4L7 A0E() {
        return new AnonymousClass4L7(AnonymousClass4Kz.A01(), "attribution_cta_text");
    }

    public static AnonymousClass4L7 A0F() {
        return new AnonymousClass4L7(AnonymousClass4Kz.A01(), "attribution_icon_url");
    }

    public static AnonymousClass4L7 A0G() {
        return new AnonymousClass4L7(AnonymousClass4Kz.A01(), "attribution_subtitle");
    }

    public static AnonymousClass4L7 A0H() {
        return new AnonymousClass4L7(AnonymousClass4Kz.A01(), "attribution_title");
    }

    public static AnonymousClass4L7 A0I() {
        return new AnonymousClass4L7(AnonymousClass4LF.A00(), "is_wearable_media_producer");
    }

    public static C18649Vw1 A0J(float f) {
        if (Float.isNaN(f)) {
            return null;
        }
        return new C18649Vw1(AnonymousClass05K.A00, f);
    }

    public static C309516Yo A0M(ReelDashboardFragment reelDashboardFragment) {
        return new C309516Yo(reelDashboardFragment.requireActivity(), reelDashboardFragment.A06);
    }

    public static AnonymousClass6u8 A0P(Object obj, Map map) {
        AnonymousClass6u8 r0 = (AnonymousClass6u8) map.get(obj);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass6u8 r02 = new AnonymousClass6u8();
        map.put(obj, r02);
        return r02;
    }

    public static C15045UKy A0Q(05G r0, int i) {
        return (C15045UKy) 00k.A0O((List) r0.getValue(), i);
    }

    public static Reel A0S(String str, AnonymousClass0eM r2) {
        return 1OP.A05((UserSession) r2.getValue()).A0M(str);
    }

    public static T8B A0T(BaseBundle baseBundle, 0lg r2, String str, String str2, String str3) {
        baseBundle.putString(str, str2);
        baseBundle.putString("externalFlowID", str3);
        1WM.getInstance();
        return new T8B(r2);
    }

    public static ULE A0U(C15337Uam uam) {
        return (ULE) C15337Uam.A01(uam).A00.A02();
    }

    public static EmptyStateView A0V(0S7 r1) {
        0S7.A00(r1);
        View emptyView = r1.A04.getEmptyView();
        0qQ.A0C(emptyView, "null cannot be cast to non-null type com.instagram.ui.emptystaterow.EmptyStateView");
        return (EmptyStateView) emptyView;
    }

    public static Object A0Y(Iterator it) {
        return ((Map.Entry) it.next()).getKey();
    }

    public static Object A0Z(List list, int i, int i2) {
        return ((List) list.get(i)).get(i2);
    }

    public static String A0c(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        if (string == null) {
            return typedArray.getString(i2);
        }
        return string;
    }

    public static String A0d(Fragment fragment, Object obj, int i) {
        String string = fragment.getString(i, new Object[]{obj});
        0qQ.A07(string);
        return string;
    }

    public static String A0e(Fragment fragment, Object obj, Object obj2, int i) {
        String string = fragment.getString(i, new Object[]{obj, obj2});
        0qQ.A07(string);
        return string;
    }

    public static String A0h(UserSession userSession) {
        return 0eE.A00(userSession).A00().A03.getFbidV2();
    }

    public static String A0i(C15337Uam uam) {
        return (String) C15337Uam.A01(uam).A02.getValue();
    }

    public static String A0k(AnonymousClass0eM r0) {
        return ((C249763kK) r0.getValue()).getSessionId();
    }

    public static void A0r(Context context) {
        AnonymousClass07t.A00(context).A02(new Intent("IGBoostPostSubmitSuccessNotification"));
    }

    public static void A0s(Context context, C3253572b r2) {
        r2.A00 = context.getColor(2Yu.A0C(context));
    }

    public static void A0v(ViewGroup viewGroup, AnonymousClass80D r1, AnonymousClass80C r2) {
        r2.getClass();
        r1.A0t = r2;
        viewGroup.getClass();
        r1.A09 = viewGroup;
    }

    public static void A0w(Fragment fragment) {
        BaseFragmentActivity requireActivity = fragment.requireActivity();
        0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        requireActivity.A0a();
    }

    public static void A0y(2Fk r0, 2Fk r1, 0sP r2) {
        Object A02 = r0.A02();
        0qQ.A0A(A02);
        r1.A0B(r2.invoke(A02));
    }

    public static void A0z(AnonymousClass0Ac r1, 0Ak r2, String str) {
        r2.A0M(r1, str);
        r2.A0M(V1X.CONTINUE_SHOPPING, "analytics_page");
    }

    public static void A10(0Aj r2) {
        r2.A7p("is_dark_mode", Boolean.valueOf(AnonymousClass1GD.A03()));
    }

    public static void A17(0Aj r2, String str) {
        r2.A9F("product_id", Long.valueOf(Long.parseLong(str)));
    }

    public static void A18(0Aj r2, String str, boolean z) {
        r2.A7p("is_in_stock", Boolean.valueOf(z));
        r2.AAJ("merchant_id", str);
    }

    public static void A1B(1Fa r2, double d, double d2) {
        r2.A9m("longitude", String.valueOf(d));
        r2.A9m(Location.LATITUDE, String.valueOf(d2));
    }

    public static void A1C(AnonymousClass4DH r1, int i) {
        Activity rootActivity = r1.getRootActivity();
        if (rootActivity instanceof AnonymousClass2ZP) {
            ((AnonymousClass2ZP) rootActivity).Enj(i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2tF, java.lang.Object] */
    public static void A1E(AnonymousClass2tC r1, C232232tF r2) {
        r1.A01(r2);
        r1.A01(new Object());
    }

    public static void A1F(0lg r1, C254523sc r2) {
        C60510iO.A00(r1).EHF(r2.A00());
    }

    public static void A1G(Integer num, String str) {
        0wb.A03("IgLiveUserRowHolder", 002.A0R(str, C49201Er6.A00(num)));
    }

    public static void A1H(Object obj, Object obj2, Object obj3, Map map) {
        map.put(obj, obj2);
        map.put("mixBlendMode", obj3);
        map.put("nativeID", obj3);
    }

    public static void A1I(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        map.put("filter", "Filter");
    }

    public static void A1M(AbstractCollection abstractCollection, AbstractCollection abstractCollection2, Iterator it) {
        Object next = it.next();
        if (abstractCollection.contains(next)) {
            abstractCollection2.add(next);
        }
    }

    public static void A1N(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (((LeadGenFormBaseQuestion) next).A03 != C16595Uxp.A06) {
            abstractCollection.add(next);
        }
    }

    public static void A1O(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (((LeadGenFormBaseQuestion) next).A03 == C16595Uxp.A06) {
            abstractCollection.add(next);
        }
    }

    public static void A1P(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(Long.valueOf(29f.A00((String) it.next())));
    }

    public static void A1Q(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C21026XAf) it.next()).FB5());
    }

    public static void A1R(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(Long.valueOf(29f.A01((String) it.next())));
    }

    public static void A1S(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(29f.A02((String) it.next()));
    }

    public static void A1T(Iterator it, Map map) {
        Object next = it.next();
        map.put(((LocalInjectionUnit) next).unitId, next);
    }

    public static void A1U(Iterator it, JSONObject jSONObject) {
        0eP r2 = (0eP) it.next();
        jSONObject.put(((C16586Uxg) r2.A00).A00, r2.A01);
    }

    public static void A1V(JSONArray jSONArray, long j) {
        jSONArray.getJSONObject(jSONArray.length() - 1).put("end_time_ms", j);
    }

    public static boolean A1W(Parcel parcel) {
        if (parcel.readByte() != 0) {
            return true;
        }
        return false;
    }

    public static boolean A1X(C319836rJ r0, String str) {
        Boolean bool = (Boolean) r0.A00(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean A1Y(AudienceInterest audienceInterest, Iterator it) {
        return 0qQ.A0K(((AudienceInterest) it.next()).A00(), audienceInterest.A00());
    }

    public static boolean A1Z(C16672Uz8 uz8, HAI hai) {
        return !(!HAI.A00(uz8, hai).A02.isEmpty());
    }

    public static boolean A1a(AnonymousClass0eM r0) {
        return AnonymousClass2xO.A01((UserSession) r0.getValue());
    }
}
