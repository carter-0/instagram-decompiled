package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.B3m  reason: case insensitive filesystem */
public abstract class C41845B3m {
    public static int A00(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static AnonymousClass5PJ A02(Object obj, int i) {
        return AnonymousClass5PI.A04(obj, i, false);
    }

    public static 2IS A04() {
        return new 2IS();
    }

    public static 1vR A05() {
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        return AnonymousClass1vS.A00();
    }

    public static C348457yU A07(AnonymousClass4Kr r1, String str) {
        return new C348457yU(r1, str);
    }

    public static C295925p8 A08(Class cls, String str, int i) {
        return new C295925p8(cls, str, i);
    }

    public static AnonymousClass612 A09(C295935p9 r1, String str) {
        return new AnonymousClass612(r1, str);
    }

    public static AnonymousClass4Kp A0A(AnonymousClass4Kw r1, Class cls, String str, int i) {
        return new AnonymousClass4Kp(r1, cls, str, i);
    }

    public static AnonymousClass4Kp A0B(Class cls, int i) {
        return new AnonymousClass4Kp(cls, PublicKeyCredentialControllerUtility.JSON_KEY_USER, i);
    }

    public static AnonymousClass4Kp A0C(Class cls, String str, int i) {
        return new AnonymousClass4Kp(cls, str, i);
    }

    public static AnonymousClass4L7 A0D(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "profile_pic_url");
    }

    public static AnonymousClass4L7 A0E(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "pk");
    }

    public static AnonymousClass4L7 A0F(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "url");
    }

    public static AnonymousClass4L7 A0G(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
    }

    public static AnonymousClass4L7 A0H(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public static AnonymousClass4L7 A0I(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, DialogModule.KEY_TITLE);
    }

    public static AnonymousClass4L7 A0J(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, IgReactMediaPickerNativeModule.WIDTH);
    }

    public static AnonymousClass4L7 A0K(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, IgReactMediaPickerNativeModule.HEIGHT);
    }

    public static AnonymousClass4L7 A0L(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
    }

    public static AnonymousClass4L7 A0M(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
    }

    public static AnonymousClass4L7 A0N(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "full_name");
    }

    public static AnonymousClass4L7 A0O(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "media_type");
    }

    public static AnonymousClass4L3 A0P() {
        return new AnonymousClass4L3(AnonymousClass4Kz.A00);
    }

    public static AnonymousClass4L3 A0Q() {
        return new AnonymousClass4L3(AnonymousClass69U.A00);
    }

    public static AnonymousClass4L3 A0R() {
        return new AnonymousClass4L3(AnonymousClass4L8.A00);
    }

    public static TreeUpdaterJNI A0S(TreeJNI treeJNI, Map map) {
        return new TreeUpdaterJNI(map, treeJNI);
    }

    public static TreeUpdaterJNI A0T(String str, Map map) {
        return new TreeUpdaterJNI(str, map);
    }

    public static ImmutablePandoUserDict A0Z(17P r1, int i) {
        return (ImmutablePandoUserDict) r1.A05(i, ImmutablePandoUserDict.class);
    }

    public static User A0a(16F r1, boolean z) {
        Parcelable.Creator creator = User.CREATOR;
        return 1aC.A00(r1, z);
    }

    public static User A0b(1E9 r1, ImmutablePandoUserDict immutablePandoUserDict) {
        Parcelable.Creator creator = User.CREATOR;
        return 1aC.A01(r1, immutablePandoUserDict);
    }

    public static C297815sO A0c(Object obj) {
        return new C297815sO(obj);
    }

    public static C239793Ih A0d(Object obj) {
        return new C239793Ih(obj);
    }

    public static RuntimeException A0j(Throwable th) {
        return new RuntimeException(th);
    }

    public static String A0k(C250663lr r1) {
        return r1.A07("strong_id__");
    }

    public static String A0l(C250663lr r1, int i) {
        return r1.getOptionalStringField(i, "text");
    }

    public static String A0m(17P r1) {
        return r1.A0h(3355);
    }

    public static String A0o(17P r1) {
        return r1.A0j(3579);
    }

    public static LinkedHashMap A0t() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new LinkedHashMap();
    }

    public static void A0v() {
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        throw null;
    }

    public static void A0x(Object obj, Map map) {
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, obj);
    }

    public static void A0y(Object obj, Map map) {
        map.put("url", obj);
    }

    public static void A0z(Object obj, Map map) {
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, obj);
    }

    public static void A10(Object obj, Map map) {
        map.put("text", obj);
    }

    public static void A11(Object obj, Map map) {
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, obj);
    }

    public static void A12(Object obj, Map map) {
        map.put(DialogModule.KEY_TITLE, obj);
    }

    public static void A13(Object obj, Map map) {
        map.put("media_id", obj);
    }

    public static boolean A15(Object obj) {
        return "x".equals(obj);
    }

    public static boolean A16(Object obj) {
        return "y".equals(obj);
    }

    public static boolean A17(Object obj) {
        return PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(obj);
    }

    public static boolean A18(Object obj) {
        return "url".equals(obj);
    }

    public static boolean A19(Object obj) {
        return PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(obj);
    }

    public static boolean A1A(Object obj) {
        return "text".equals(obj);
    }

    public static boolean A1B(Object obj) {
        return PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(obj);
    }

    public static boolean A1C(Object obj) {
        return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(obj);
    }

    public static boolean A1D(Object obj) {
        return "media".equals(obj);
    }

    public static boolean A1E(Object obj) {
        return DialogModule.KEY_TITLE.equals(obj);
    }

    public static boolean A1F(Object obj) {
        return IgReactMediaPickerNativeModule.WIDTH.equals(obj);
    }

    public static boolean A1G(Object obj) {
        return IgReactMediaPickerNativeModule.HEIGHT.equals(obj);
    }

    public static boolean A1H(Object obj) {
        return "max_id".equals(obj);
    }

    public static boolean A1I(Object obj) {
        return "surface".equals(obj);
    }

    public static boolean A1J(Object obj) {
        return "media_id".equals(obj);
    }

    public static boolean A1K(Object obj) {
        return "rotation".equals(obj);
    }

    public static boolean A1L(Object obj) {
        return "subtitle".equals(obj);
    }

    public static boolean A1M(Object obj) {
        return "is_hidden".equals(obj);
    }

    public static boolean A1N(Object obj) {
        return "is_pinned".equals(obj);
    }

    public static boolean A1O(Object obj) {
        return "media_type".equals(obj);
    }

    public static boolean A1P(Object obj) {
        return "is_sticker".equals(obj);
    }

    public static boolean A1Q(Object obj) {
        return DevServerEntity.COLUMN_DESCRIPTION.equals(obj);
    }

    public static boolean A1R(Object obj) {
        return "end_time_ms".equals(obj);
    }

    public static boolean A1S(Object obj) {
        return "display_type".equals(obj);
    }

    public static boolean A1T(Object obj) {
        return "is_fb_sticker".equals(obj);
    }

    public static boolean A1U(Object obj) {
        return "start_time_ms".equals(obj);
    }

    public static boolean A1V(Object obj) {
        return "more_available".equals(obj);
    }

    public static boolean A1W(Object obj) {
        return "tracking_token".equals(obj);
    }

    public static boolean A1X(Object obj) {
        return "attribution_url".equals(obj);
    }

    public static boolean A1Y(Object obj) {
        return "global_position".equals(obj);
    }

    public static boolean A1Z(Object obj) {
        return "custom_text_color".equals(obj);
    }

    public static boolean A1a(Object obj) {
        return "sticker_style_enum".equals(obj);
    }

    public static boolean A1b(Object obj) {
        return "subscription_sticker".equals(obj);
    }

    public static int A01(String str, int i) {
        return i + str.hashCode();
    }

    public static 0Df A03(AnonymousClass0K0 r0, Object obj, String str) {
        0Df A02 = r0.A02();
        0Df.A00(A02, obj, str);
        return A02;
    }

    public static 1vR A06(boolean z) {
        17k.A0E(z);
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        return AnonymousClass1vS.A00();
    }

    public static C250663lr A0U(AnonymousClass3JD r0) {
        return (C250663lr) r0.Bny();
    }

    public static C250663lr A0V(Iterator it) {
        return (C250663lr) it.next();
    }

    public static 16L A0W(16F r0) {
        r0.A1J();
        return r0.A11();
    }

    public static ImmutableList A0X(C250663lr r0, Class cls, String str, int i, int i2) {
        ImmutableList requiredCompactedTreeListField = r0.getRequiredCompactedTreeListField(i, str, cls, i2);
        0qQ.A07(requiredCompactedTreeListField);
        return requiredCompactedTreeListField;
    }

    public static StickerTraySurface A0Y(17P r0, 0sP r1) {
        return (StickerTraySurface) r0.A0O(r1);
    }

    public static Integer A0e(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(-1128035601);
    }

    public static Integer A0f(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(-753448353);
    }

    public static Integer A0g(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(-524107635);
    }

    public static Integer A0h(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(-389942488);
    }

    public static Integer A0i(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(1457597201);
    }

    public static String A0n(17P r1) {
        return r1.A0j(-147132913);
    }

    public static String A0p(17P r1) {
        return r1.A0i(-2115337775);
    }

    public static String A0q(17P r1) {
        return r1.A0i(-265713450);
    }

    public static String A0r(17P r1) {
        return r1.A0i(2036780306);
    }

    public static Iterator A0s(17Z r0, String str, List list) {
        16P.A03(r0, str);
        return list.iterator();
    }

    public static Map A0u(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 0Yt.A0B(map);
    }

    public static void A0w(17Z r1, User user, String str) {
        r1.A0q(str);
        Parcelable.Creator creator = User.CREATOR;
        1aC.A08(r1, user);
    }

    public static boolean A14(Boolean bool) {
        0qQ.A0A(bool);
        return bool.booleanValue();
    }
}
