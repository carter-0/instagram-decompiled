package X;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.material.transition.platform.MaterialContainerTransform;
import com.instagram.android.R;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.ProductTileContext;
import com.instagram.api.schemas.ProductTileMetadataDecorations;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.business.boost.model.AdCreativeAuthorizationCategory;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteAudiencePotentialReachStore;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteReachEstimationStore;
import com.instagram.business.promote.model.PromoteWhatsAppAccountType;
import com.instagram.business.promote.model.SelectedInterestRowItem;
import com.instagram.business.promote.model.SuggestedInterestRowItem;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalInjectionUnit;
import com.instagram.debug.trainyardtracker.TrainyardEventType;
import com.instagram.debug.trainyardtracker.TrainyardExecutorEvent;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.ui.widget.rangeseekbar.RangeSeekBar;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.text.NumberFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Tns  reason: case insensitive filesystem */
public abstract class C13992Tns {
    public static int A01(C17811VgO vgO) {
        int A00 = vgO.A00(4);
        if (A00 != 0) {
            return vgO.A01.getInt(A00 + vgO.A00);
        }
        return 0;
    }

    public static TrainyardExecutorEvent A0B(TrainyardEventType trainyardEventType) {
        return new TrainyardExecutorEvent(0, 0, 0, 0, (List) null, trainyardEventType, 0, 95, (DefaultConstructorMarker) null);
    }

    public static Long A0E(AnonymousClass0Ah r2, 0Aj r3, C15054ULx uLx) {
        r3.AAE(r2, "advertiser_id");
        r3.A9F("catalog_id", (Long) null);
        if (uLx != null) {
            return Long.valueOf(uLx.A00);
        }
        return null;
    }

    public static String A0H(0Ak r2, ProductTile productTile, String str) {
        FBProductItemDetailsDict A01;
        r2.A0R("search_session_id", str);
        r2.A0R("central_pdp_version", (String) null);
        if (productTile == null || (A01 = C18768W0o.A01(productTile)) == null) {
            return null;
        }
        return C45683D1i.A00(A01);
    }

    public static String A0I(1Ln r3, C231112qt r4, int i, int i2) {
        r3.A0R("position", C320166rs.A01(i, i2));
        r3.A0R("chaining_session_id", r4.A04);
        r3.A0R("parent_m_pk", r4.A06);
        r3.A0R("product_collection_id", r4.A09);
        r3.A0u(AnonymousClass1QI.A00.A02.A00);
        r3.A0R("shopping_session_id", r4.A0D);
        r3.A0R("prior_module", r4.A07);
        r3.A0R("prior_submodule", r4.A08);
        r3.A0Q("surface_category_id", (Long) null);
        r3.A0R("query_text", r4.A0B);
        String str = r4.A0C;
        if (str == null) {
            return null;
        }
        return str;
    }

    public static String A0L(LocalInjectionUnit.Item item) {
        String str = item.id;
        if (str == null) {
            return (String) 00l.A0R(item.filename, new String[]{"."}, 0).get(0);
        }
        return str;
    }

    public static void A0W(Paint.FontMetricsInt fontMetricsInt) {
        0qQ.A0B(fontMetricsInt, 5);
        int i = fontMetricsInt.descent;
        int i2 = fontMetricsInt.ascent;
        int i3 = i - i2;
        int i4 = (int) (((float) i3) * 1.1f);
        int i5 = (i4 - i3) / 2;
        int i6 = i2 - i5;
        fontMetricsInt.ascent = i6;
        fontMetricsInt.top -= i5;
        int i7 = i6 + i4;
        fontMetricsInt.descent = i7;
        fontMetricsInt.bottom = i7;
    }

    public static void A0d(TextView textView, Fragment fragment) {
        textView.setTextSize(0, (float) fragment.requireContext().getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
    }

    public static void A0q(MaterialContainerTransform materialContainerTransform) {
        materialContainerTransform.drawDebugEnabled = false;
        materialContainerTransform.holdAtEndEnabled = false;
        materialContainerTransform.pathMotionCustom = false;
        materialContainerTransform.appliedThemeValues = false;
        materialContainerTransform.drawingViewId = 16908290;
        materialContainerTransform.startViewId = -1;
        materialContainerTransform.endViewId = -1;
        materialContainerTransform.containerColor = 0;
        materialContainerTransform.startContainerColor = 0;
        materialContainerTransform.endContainerColor = 0;
        materialContainerTransform.scrimColor = 1375731712;
        materialContainerTransform.transitionDirection = 0;
        materialContainerTransform.fadeMode = 0;
        materialContainerTransform.fitMode = 0;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.instagram.business.promote.model.PromoteIntegrityCheckDataModel, java.lang.Object] */
    public static void A0v(PromoteData promoteData) {
        promoteData.A2U = false;
        promoteData.A1v = new ArrayList();
        promoteData.A0H = -1;
        promoteData.A1w = new ArrayList();
        promoteData.A0l = BoostFlowType.ORIGINAL;
        promoteData.A26 = new HashSet();
        promoteData.A20 = new ArrayList();
        promoteData.A21 = new ArrayList();
        promoteData.A22 = new HashMap();
        promoteData.A1n = new ArrayList();
        promoteData.A1y = new ArrayList();
        promoteData.A1z = new ArrayList();
        promoteData.A1o = new ArrayList();
        promoteData.A0u = new Object();
        promoteData.A1r = new ArrayList();
        promoteData.A1x = new ArrayList();
        promoteData.A1p = new ArrayList();
        promoteData.A0w = new PromoteReachEstimationStore();
        promoteData.A1q = new ArrayList();
        promoteData.A24 = new HashSet();
        promoteData.A0x = PromoteWhatsAppAccountType.CONSUMER;
    }

    public static void A0w(PromoteData promoteData) {
        promoteData.A0k = AdCreativeAuthorizationCategory.A04;
        PromoteAudienceInfo promoteAudienceInfo = PromoteAudienceInfo.A09;
        promoteData.A0q = promoteAudienceInfo;
        promoteData.A0p = promoteAudienceInfo;
        promoteData.A0o = new PendingLocation();
        promoteData.A0r = new PromoteAudiencePotentialReachStore();
        promoteData.A1u = new ArrayList();
        promoteData.A1s = new ArrayList();
        promoteData.A1t = new ArrayList();
        promoteData.A27 = new HashSet();
        promoteData.A2B = false;
        promoteData.A29 = false;
        promoteData.A2b = false;
        promoteData.A2M = false;
        promoteData.A2p = false;
        promoteData.A2E = false;
        promoteData.A2A = false;
        promoteData.A2N = false;
    }

    public static void A0x(AnonymousClass0iw r2, AnonymousClass3K2 r3) {
        if (r3 != null && r3.A0Z() && r3.A0H == AnonymousClass3BQ.REEL_VIEWER_LIST) {
            r3.A0X(r2);
        }
    }

    public static float A00(RangeSeekBar rangeSeekBar, float f) {
        return 0mi.A01(f, rangeSeekBar.A01, rangeSeekBar.A00, (float) rangeSeekBar.A05, (float) (rangeSeekBar.getWidth() - rangeSeekBar.A05));
    }

    public static int A02(C17811VgO vgO, int i) {
        int A00 = vgO.A00(16);
        if (A00 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = vgO.A01;
        int i2 = A00 + vgO.A00;
        return byteBuffer.getInt(i2 + byteBuffer.getInt(i2) + 4 + (i * 4));
    }

    public static int A03(C17811VgO vgO, int i) {
        int i2 = i + vgO.A00;
        return vgO.A01.getInt(i2 + vgO.A01.getInt(i2));
    }

    public static 0Aj A05(0wc r2, ShoppingTaggingFeedArguments shoppingTaggingFeedArguments, String str) {
        0Aj A00 = r2.A00(r2.A00, str);
        A00.AAJ("prior_module", shoppingTaggingFeedArguments.A0B);
        A00.AAJ("session_instance_id", shoppingTaggingFeedArguments.A0F);
        A00.AAJ("waterfall_id", shoppingTaggingFeedArguments.A0G);
        A00.AAJ("usage", shoppingTaggingFeedArguments.A03.A00);
        return A00;
    }

    public static AnonymousClass327 A06(Fragment fragment) {
        0bb r2 = new 0bb();
        r2.A06("prior_module", fragment.requireArguments().getString("prior_module_name"));
        return r2;
    }

    public static AnonymousClass4Kx A07() {
        AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r4, "cover_photo"), new AnonymousClass4L7(AnonymousClass4L8.A00, "post_count"), new AnonymousClass4L7(r4, "world_id")});
    }

    public static AnonymousClass4Kx A08() {
        AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
        AnonymousClass4L7 r3 = new AnonymousClass4L7(r2, "max_thumbnails_per_sprite");
        AnonymousClass4L7 r4 = new AnonymousClass4L7(r2, "rendered_width");
        AnonymousClass4L7 r5 = new AnonymousClass4L7(r2, "sprite_height");
        AnonymousClass4L7 r6 = new AnonymousClass4L7(AnonymousClass4Kz.A00(), "sprite_urls");
        AnonymousClass4L7 r7 = new AnonymousClass4L7(r2, "sprite_width");
        C342787pA r1 = C342787pA.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r3, r4, r5, r6, r7, new AnonymousClass4L7(r1, "thumbnail_duration"), new AnonymousClass4L7(r2, "thumbnail_height"), new AnonymousClass4L7(r2, "thumbnail_width"), new AnonymousClass4L7(r2, "thumbnails_per_row"), new AnonymousClass4L7(r2, "total_thumbnail_num_per_sprite"), new AnonymousClass4L7(r1, "video_length")});
    }

    public static AnonymousClass4Kx A09() {
        AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
        AnonymousClass4L7 r3 = new AnonymousClass4L7(r2, "file_size_kb");
        AnonymousClass4L7 r4 = new AnonymousClass4L7(r2, "max_thumbnails_per_sprite");
        AnonymousClass4L7 r5 = new AnonymousClass4L7(r2, "rendered_width");
        AnonymousClass4L7 r6 = new AnonymousClass4L7(r2, "sprite_height");
        AnonymousClass4L7 r7 = new AnonymousClass4L7(r2, "sprite_width");
        C342787pA r1 = C342787pA.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r3, r4, r5, r6, r7, new AnonymousClass4L7(r1, "thumbnail_duration"), new AnonymousClass4L7(r2, "thumbnail_height"), new AnonymousClass4L7(r2, "thumbnail_width"), new AnonymousClass4L7(r2, "thumbnails_per_row"), new AnonymousClass4L7(r2, "total_thumbnail_num_per_sprite"), new AnonymousClass4L7(r1, "video_length")});
    }

    public static String A0F(0Aj r2, C61069Jw7 jw7, String str) {
        r2.AAJ("position", str);
        r2.AAJ(TraceFieldType.ContentType, String.valueOf(jw7.A00));
        return String.valueOf(jw7.A02);
    }

    public static String A0G(0Aj r3, UserSession userSession, 1Xj r5) {
        r3.AAJ("m_pk", r5.getId());
        User A2A = r5.A2A(userSession);
        return A2A != null ? A2A.getId() : "";
    }

    public static String A0J(C17744VdD vdD, 1Xj r2) {
        String boostUnavailableReason = r2.A0C.getBoostUnavailableReason();
        if (boostUnavailableReason != null) {
            return boostUnavailableReason;
        }
        String string = vdD.A02.getString(2131957525);
        0qQ.A07(string);
        return string;
    }

    public static String A0N(Object obj, Map map) {
        map.put("elevation", "number");
        map.put("filter", "Filter");
        map.put("importantForAccessibility", obj);
        map.put("mixBlendMode", obj);
        map.put("nativeID", obj);
        map.put("onClick", "boolean");
        map.put("onClickCapture", "boolean");
        map.put("onMoveShouldSetResponder", "boolean");
        map.put("onMoveShouldSetResponderCapture", "boolean");
        return "boolean";
    }

    public static String A0O(Object obj, Map map) {
        map.put("accessible", "boolean");
        map.put("backfaceVisibility", obj);
        map.put("backgroundColor", "Color");
        map.put("borderBlockColor", "Color");
        map.put("borderBlockEndColor", "Color");
        map.put("borderBlockStartColor", "Color");
        map.put("borderBottomColor", "Color");
        map.put("borderBottomEndRadius", "Dynamic");
        map.put("borderBottomLeftRadius", "Dynamic");
        map.put("borderBottomRightRadius", "Dynamic");
        map.put("borderBottomStartRadius", "Dynamic");
        return "Color";
    }

    public static String A0Q(Map map) {
        map.put("backgroundColor", "Color");
        map.put("borderBottomColor", "Color");
        map.put("borderBottomLeftRadius", "number");
        map.put("borderBottomRightRadius", "number");
        map.put("borderBottomWidth", "number");
        map.put("borderColor", "Color");
        return "number";
    }

    public static String A0R(Map map) {
        map.put("accessibilityActions", "Array");
        map.put("accessibilityCollection", "Map");
        map.put("accessibilityCollectionItem", "Map");
        map.put("accessibilityHint", "String");
        map.put("accessibilityLabel", "String");
        map.put("accessibilityLabelledBy", "Dynamic");
        map.put("accessibilityLiveRegion", "String");
        map.put("accessibilityRole", "String");
        map.put("accessibilityState", "Map");
        map.put("accessibilityValue", "Map");
        return "String";
    }

    public static String A0S(Map map) {
        map.put("accessibilityCollection", "Map");
        map.put("accessibilityCollectionItem", "Map");
        map.put("accessibilityHint", "String");
        map.put("accessibilityLabel", "String");
        return "String";
    }

    public static HashMap A0T(Object obj, Object obj2) {
        HashMap hashMap = new HashMap();
        hashMap.put("bubbled", obj);
        hashMap.put("captured", obj2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("phasedRegistrationNames", hashMap);
        return hashMap2;
    }

    public static C255543uJ A0U(String str, C255533uI r4, int i) {
        C255543uJ r2 = new C255543uJ(str, r4, i);
        r2.A00("flowType");
        r2.A00(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        r2.A01("reason", true);
        r2.A00("group");
        return r2;
    }

    public static void A0X(Path path, RectF rectF) {
        path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
    }

    public static void A0Y(BaseBundle baseBundle, String str, boolean z, boolean z2, boolean z3) {
        baseBundle.putBoolean("is_ad_format_preferences_eligible", z);
        baseBundle.putBoolean("should_show_creative_optimization_toggle", z2);
        baseBundle.putBoolean("should_show_multi_advertiser_ads_toggle", z3);
        baseBundle.putString("political_ad_byline_text", str);
    }

    public static void A0Z(Bundle bundle, Serializable serializable) {
        bundle.putParcelable("camera_configuration", C358098aM.A00(AnonymousClass9QA.A00, C358088aL.A0C));
        bundle.putSerializable("camera_entry_point", serializable);
    }

    public static void A0a(Bundle bundle, Iterable iterable, Object obj, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        00k.A0r(iterable, arrayList);
        bundle.putStringArrayList("instagram_positions", arrayList);
        bundle.putString("media_id", str);
        bundle.putString("call_to_action", obj.toString());
        bundle.putBoolean("is_fb_placement_eligible", z);
    }

    public static void A0f(Fragment fragment, Object obj) {
        InputMethodManager inputMethodManager;
        if (obj != null) {
            Object systemService = fragment.requireActivity().getSystemService("input_method");
            if ((systemService instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) systemService) != null) {
                inputMethodManager.toggleSoftInput(1, 0);
            }
        }
    }

    public static void A0g(0Aj r2, C61062Jw0 jw0) {
        r2.AAJ("source_type", jw0.A01.toString());
        r2.AAJ("source_id", jw0.A03);
        r2.AAJ("source_name", jw0.A04);
    }

    public static void A0h(0Aj r2, UserSession userSession, Long l) {
        r2.A9F("tessa_integration_point_id", l);
        r2.A9F("ig_user_id", Long.valueOf(Long.parseLong(userSession.A06)));
    }

    public static void A0i(0Aj r3, String str, String str2) {
        r3.A9F("business_igid", 00y.A0n(10, str));
        r3.A9F("consumer_igid", 00y.A0n(10, str2));
        r3.Cgf();
    }

    public static void A0j(0Aj r2, String str, String str2, int i) {
        r2.AAJ("item_id", str);
        r2.AAJ("item_type", str2);
        r2.A9F("item_index", Long.valueOf((long) i));
    }

    public static void A0k(0Ak r2, UserSession userSession, String str) {
        r2.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        r2.A0O("is_employee", Boolean.valueOf(1CI.A00(userSession)));
    }

    public static void A0l(0Ak r2, HAI hai, Hashtag hashtag) {
        r2.A0R("hashtag_feed_type", hai.A00.toString());
        r2.A0R("hashtag_follow_status", C281965Ag.A02(hashtag));
        r2.Cgf();
    }

    public static void A0m(0Ak r2, ProductTile productTile) {
        ProductTileMetadataDecorations productTileMetadataDecorations;
        ProductTileContext CHg;
        ProductTileMetadataImpl productTileMetadataImpl = productTile.A01;
        if (productTileMetadataImpl != null && (productTileMetadataDecorations = productTileMetadataImpl.A00) != null && (CHg = productTileMetadataDecorations.CHg()) != null) {
            r2.A0R("social_context", CHg.CDY().toString());
        }
    }

    public static void A0o(0Ak r3, String str) {
        if (str != null && str.length() > 0) {
            r3.A00.AAE(C263944Ny.A00(str), "marketer_id");
        }
    }

    public static void A0p(0Ak r2, String str, String str2, String str3) {
        r2.A0R("flow_name", str);
        r2.A0R("flow_step", str2);
        r2.A0R(TraceFieldType.AdhocEventName, str3);
        r2.A0R("event_type", DexOptimization.OPT_KEY_CLIENT);
    }

    public static void A0y(OOA ooa, C255773uh r3, User user, boolean z) {
        ooa.A03(r3.A0k);
        ooa.A04(r3.A0j);
        ooa.A01.putBoolean("DirectReplyModalFragment.is_archive_reel", z);
        ooa.A06(user.getId());
    }

    public static void A0z(Object obj, Object obj2, Object obj3, Map map) {
        map.put(obj, obj2);
        map.put("borderStyle", obj3);
        map.put("borderTopColor", "Color");
        map.put("borderTopLeftRadius", obj2);
        map.put("borderTopRightRadius", obj2);
        map.put("borderTopWidth", obj2);
        map.put("borderWidth", obj2);
        map.put("boxShadow", "BoxShadow");
    }

    public static void A10(Object obj, Object obj2, Object obj3, Map map) {
        map.put("outlineColor", obj);
        map.put("outlineOffset", obj2);
        map.put("outlineStyle", obj3);
        map.put("outlineWidth", obj2);
    }

    public static void A11(Object obj, Object obj2, Object obj3, Map map) {
        map.put(obj, obj2);
        map.put("transform", "Array");
        map.put("transformOrigin", "Array");
        map.put("translateX", obj3);
        map.put("translateY", obj3);
    }

    public static void A12(Object obj, Object obj2, Map map) {
        map.put("onPointerEnter", obj);
        map.put("onPointerEnterCapture", obj);
        map.put("onPointerLeave", obj);
        map.put("onPointerLeaveCapture", obj);
        map.put("onPointerMove", obj);
        map.put("onPointerMoveCapture", obj);
        map.put("onPointerOut", obj);
        map.put("onPointerOutCapture", obj);
        map.put("onPointerOver", obj);
        map.put("onPointerOverCapture", obj);
        map.put("onResponderEnd", obj);
        map.put("onResponderGrant", obj);
        map.put("onResponderMove", obj);
        map.put("onResponderReject", obj);
        map.put("onResponderRelease", obj);
        map.put("onResponderStart", obj);
        map.put("onResponderTerminate", obj);
        map.put("onResponderTerminationRequest", obj);
        map.put("onShouldBlockNativeResponder", obj);
        map.put("onStartShouldSetResponder", obj);
        map.put("onStartShouldSetResponderCapture", obj);
        map.put("onTouchCancel", obj);
        map.put("onTouchEnd", obj);
        map.put("onTouchMove", obj);
        map.put("onTouchStart", obj);
        map.put("opacity", obj2);
    }

    public static void A13(Object obj, Object obj2, Map map) {
        map.put("borderColor", obj);
        map.put("borderEndColor", obj);
        map.put("borderEndEndRadius", "Dynamic");
        map.put("borderEndStartRadius", "Dynamic");
        map.put("borderEndWidth", "number");
        map.put("borderLeftColor", obj);
        map.put("borderLeftWidth", "number");
        map.put("borderRadius", "Dynamic");
        map.put("borderRightColor", obj);
        map.put("borderRightWidth", "number");
        map.put("borderStartColor", obj);
        map.put("borderStartEndRadius", "Dynamic");
        map.put("borderStartStartRadius", "Dynamic");
        map.put("borderStartWidth", "number");
        map.put("borderStyle", obj2);
        map.put("borderTopColor", obj);
        map.put("borderTopEndRadius", "Dynamic");
        map.put("borderTopLeftRadius", "Dynamic");
        map.put("borderTopRightRadius", "Dynamic");
        map.put("borderTopStartRadius", "Dynamic");
        map.put("borderTopWidth", "number");
        map.put("borderWidth", "number");
        map.put("boxShadow", "BoxShadow");
    }

    public static void A14(Object obj, Object obj2, Map map) {
        map.put("renderToHardwareTextureAndroid", "boolean");
        map.put("role", obj);
        map.put("rotation", obj2);
        map.put("scaleX", obj2);
        map.put("scaleY", obj2);
    }

    public static void A15(Object obj, Object obj2, Map map) {
        map.put("role", obj);
        map.put("rotation", "number");
        map.put("scaleX", "number");
        map.put("scaleY", "number");
        map.put("shadowColor", obj2);
        map.put("testID", obj);
        map.put("transform", "Array");
        map.put("transformOrigin", "Array");
        map.put("translateX", "number");
        map.put("translateY", "number");
        map.put("zIndex", "number");
    }

    public static void A16(Object obj, Map map) {
        map.put("borderLeftColor", "Color");
        map.put("borderLeftWidth", obj);
        map.put("borderRadius", obj);
        map.put("borderRightColor", "Color");
    }

    public static void A17(Object obj, Map map) {
        map.put("accessibilityLabelledBy", "Dynamic");
        map.put("accessibilityLiveRegion", obj);
        map.put("accessibilityRole", obj);
        map.put("accessibilityState", "Map");
        map.put("accessibilityValue", "Map");
    }

    public static void A18(Object obj, Map map) {
        map.put("importantForAccessibility", obj);
        map.put("mixBlendMode", obj);
        map.put("nativeBackgroundAndroid", "Map");
        map.put("nativeForegroundAndroid", "Map");
        map.put("nativeID", obj);
        map.put("needsOffscreenAlphaCompositing", "boolean");
        map.put("nextFocusDown", "number");
        map.put("nextFocusForward", "number");
        map.put("nextFocusLeft", "number");
        map.put("nextFocusRight", "number");
        map.put("nextFocusUp", "number");
    }

    public static void A19(StringBuilder sb, int i, int i2, int i3, int i4) {
        sb.append(",b=");
        sb.append(i);
        sb.append(",f=");
        sb.append(i2);
        sb.append(",profile=");
        sb.append(i3);
        sb.append(",mode=");
        sb.append(i4);
        sb.append(",interval=");
    }

    public static void A1B(Map map) {
        map.put("onClick", "boolean");
        map.put("onClickCapture", "boolean");
        map.put("onMoveShouldSetResponder", "boolean");
        map.put("onMoveShouldSetResponderCapture", "boolean");
    }

    public static boolean A1D(Paint paint, DisplayMetrics displayMetrics) {
        paint.setColor(-65536);
        paint.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, displayMetrics));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        return true;
    }

    public static Bundle A04(Fragment fragment) {
        String string = fragment.requireContext().getString(2131970133);
        Bundle bundle = new Bundle();
        bundle.putString(TraceFieldType.Error, string);
        return bundle;
    }

    public static C18649Vw1 A0A(float f) {
        if (Float.isNaN(f)) {
            return null;
        }
        return new C18649Vw1(AnonymousClass05K.A00, W2U.A00(f));
    }

    public static IllegalStateException A0C(Object obj, Object obj2, StringBuilder sb, int i) {
        sb.append(obj);
        sb.append(" for key: ");
        sb.append(i);
        sb.append(", found ");
        sb.append(obj2.getClass());
        sb.append(" instead.");
        return new IllegalStateException(sb.toString());
    }

    public static Long A0D(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return Long.valueOf(parcel.readLong());
    }

    public static String A0K(C15279UZh uZh, int i) {
        int i2 = C15279UZh.A00(uZh).A06;
        Currency currency = C15279UZh.A00(uZh).A1j;
        0qQ.A06(currency);
        return W2x.A02(currency, i, i2);
    }

    public static String A0M(Number number) {
        int intValue = number.intValue();
        if (intValue == 1) {
            return "hidden";
        }
        if (intValue == 2) {
            return "scroll";
        }
        if (intValue != 0) {
            return null;
        }
        return "visible";
    }

    public static String A0P(Currency currency, double d, int i, int i2) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(AnonymousClass1Q2.A02());
        currencyInstance.setCurrency(currency);
        currencyInstance.setMaximumFractionDigits(i);
        String format = currencyInstance.format(d / ((double) i2));
        0qQ.A07(format);
        return format;
    }

    public static short A0V(List list, int i) {
        Object obj = list.get(i);
        if (obj instanceof VAX) {
            return 0;
        }
        if (obj instanceof SelectedInterestRowItem) {
            return 1;
        }
        if (obj instanceof VAZ) {
            return 2;
        }
        if (obj instanceof SuggestedInterestRowItem) {
            return 3;
        }
        if (obj instanceof VMX) {
            return 4;
        }
        if (obj instanceof C17327VRg) {
            return 7;
        }
        if (obj instanceof C17328VRh) {
            return 5;
        }
        if (obj instanceof C17329VRi) {
            return 6;
        }
        return -1;
    }

    public static void A0b(View view, Rect rect) {
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static void A0c(View view, Fragment fragment) {
        View currentFocus;
        0nA.A0N(view);
        FragmentActivity activity = fragment.getActivity();
        if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
        }
    }

    public static void A0e(Fragment fragment) {
        BottomSheetFragment requireParentFragment = fragment.requireParentFragment();
        0qQ.A0C(requireParentFragment, "null cannot be cast to non-null type com.instagram.igds.components.bottomsheet.BottomSheetFragment");
        C331157Pu r1 = requireParentFragment.A02;
        if (r1 != null) {
            r1.A0L((C332277Ui) null);
        }
    }

    public static void A0n(0Ak r2, C15286UZq uZq) {
        String str = uZq.A06().A0J;
        if (str != null) {
            r2.A0R("query_text", str);
            r2.A0R("search_session_id", uZq.A06().A04());
            r2.A0R("rank_token", uZq.A07().A04());
            r2.Cgf();
            return;
        }
        0qQ.A0F("query");
        throw AnonymousClass00P.createAndThrow();
    }

    public static void A0r(2da r2, int i) {
        r2.Eom(i);
        AnonymousClass3JR r1 = new AnonymousClass3JR();
        r1.A00();
        r2.ErG(new AnonymousClass3Jb(r1));
    }

    public static void A0s(2da r2, String str) {
        r2.setTitle(str);
        AnonymousClass3JR r1 = new AnonymousClass3JR();
        r1.A00();
        r2.ErG(new AnonymousClass3Jb(r1));
    }

    public static void A0t(1Fa r2, int i, int i2) {
        r2.A9m("min_age", String.valueOf(i));
        r2.A9m("max_age", String.valueOf(i2));
    }

    public static void A0u(AnonymousClass4DH r1, AnonymousClass80D r2, AnonymousClass0eM r3) {
        UserSession userSession = (UserSession) r3.getValue();
        userSession.getClass();
        r2.A0S = userSession;
        Activity rootActivity = r1.getRootActivity();
        rootActivity.getClass();
        r2.A05 = rootActivity;
        r2.A0M = r1;
    }

    public static void A1A(AbstractCollection abstractCollection, Iterator it) {
        1Xj A02 = 1Xi.A02(((1Xg) it.next()).A05);
        if (A02 != null) {
            abstractCollection.add(A02);
        }
    }

    public static void A1C(Set set, int i) {
        Integer valueOf = Integer.valueOf(i);
        if (set.contains(valueOf)) {
            02m.A0p.markerEnd(i, 2);
            set.remove(valueOf);
        }
    }
}
