package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.ImmutablePandoSubscriptionStickerDict;
import com.instagram.api.schemas.OnboardingEntryActionType;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.androidlink.AndroidLinkImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.B3n  reason: case insensitive filesystem */
public abstract class C41846B3n {
    public static 1E9 A0S(1E6 r3) {
        return new 1E9(r3, 6, false);
    }

    public static SubscriptionStickerDict A0U(1E9 r1, SubscriptionStickerDictIntf subscriptionStickerDictIntf) {
        if (subscriptionStickerDictIntf != null) {
            return subscriptionStickerDictIntf.FC2(r1);
        }
        return null;
    }

    public static User A0a(16F r2, User user, Object obj, String str) {
        if (!str.equals(obj)) {
            return user;
        }
        Parcelable.Creator creator = User.CREATOR;
        return 1aC.A00(r2, false);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.MDh, X.4D7] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A0h(X.1Ef r1, X.1vn r2, java.lang.Object r3, X.C66129MDh r4) {
        /*
            r0 = 1
            r4.A01 = r3
            r4.A00 = r0
            java.lang.Object r0 = r2.A04(r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41846B3n.A0h(X.1Ef, X.1vn, java.lang.Object, X.MDh):java.lang.Object");
    }

    public static void A1E(16F r2, AbstractCollection abstractCollection) {
        Parcelable.Creator creator = User.CREATOR;
        User A00 = 1aC.A00(r2, false);
        if (A00 != null) {
            abstractCollection.add(A00);
        }
    }

    public static void A1I(OnboardingEntryActionType onboardingEntryActionType, Map map) {
        0qQ.A0B(onboardingEntryActionType, 0);
        map.put("action_type", onboardingEntryActionType.A00);
    }

    public static AnonymousClass612 A00(Class cls, int i) {
        return new AnonymousClass612(new C295925p8(cls, "InlineQPIntTemplateParameter", i), "QPIntTemplateParameter");
    }

    public static AnonymousClass612 A01(Class cls, int i) {
        return new AnonymousClass612(new C295925p8(cls, "InlineQPStringTemplateParameter", i), "QPStringTemplateParameter");
    }

    public static AnonymousClass612 A02(Class cls, int i) {
        return new AnonymousClass612(new C295925p8(cls, "InlineQPBooleanTemplateParameter", i), "QPBooleanTemplateParameter");
    }

    public static AnonymousClass4L7 A03() {
        return new AnonymousClass4L7(AnonymousClass4L8.A00, "count");
    }

    public static AnonymousClass4L7 A04() {
        return new AnonymousClass4L7(new AnonymousClass4L5(new AnonymousClass4L3(AnonymousClass4L8.A00)), "account_badges");
    }

    public static AnonymousClass4L7 A05() {
        return new AnonymousClass4L7(AnonymousClass4Kz.A00, "client_mutation_id");
    }

    public static AnonymousClass4L7 A06() {
        return new AnonymousClass4L7(AnonymousClass4LF.A00, RealtimeConstants.SEND_SUCCESS);
    }

    public static AnonymousClass4L7 A07() {
        return new AnonymousClass4L7(AnonymousClass4Kz.A00, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public static AnonymousClass4L7 A08(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), TraceFieldType.BroadcastId);
    }

    public static AnonymousClass4L7 A09(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public static AnonymousClass4L7 A0A(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "text");
    }

    public static AnonymousClass4L7 A0B(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "pk");
    }

    public static AnonymousClass4L7 A0C(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
    }

    public static AnonymousClass4L7 A0D(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "__typename");
    }

    public static AnonymousClass4L7 A0E(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "has_viewer_saved");
    }

    public static AnonymousClass4L7 A0F(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "text");
    }

    public static AnonymousClass4L7 A0H(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "is_verified");
    }

    public static AnonymousClass4L7 A0I(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "product_type");
    }

    public static AnonymousClass4L3 A0J() {
        return new AnonymousClass4L3(AnonymousClass4LF.A00);
    }

    public static C295075nX A0O(AnonymousClass4L1 r2, String str, String str2) {
        return new C295075nX(new AnonymousClass4L7(r2, str), str2);
    }

    public static TreeUpdaterJNI A0Q(ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf) {
        if (productDetailsProductItemDictIntf != null) {
            return productDetailsProductItemDictIntf.FHC();
        }
        return null;
    }

    public static C250663lr A0R(Object obj) {
        return (C250663lr) ((AnonymousClass3JC) ((C239793Ih) obj).A00).A01;
    }

    public static SubscriptionStickerDict A0V(1E9 r0, SubscriptionStickerDictIntf subscriptionStickerDictIntf) {
        if (subscriptionStickerDictIntf != null) {
            return subscriptionStickerDictIntf.FC2(r0);
        }
        return null;
    }

    public static SubscriptionStickerDictIntf A0W(1E9 r0, SubscriptionStickerDictIntf subscriptionStickerDictIntf) {
        if (subscriptionStickerDictIntf == null) {
            return null;
        }
        subscriptionStickerDictIntf.E9E(r0);
        return subscriptionStickerDictIntf;
    }

    public static SubscriptionStickerDictIntf A0X(SubscriptionStickerDictIntf subscriptionStickerDictIntf, 17P r1) {
        if (subscriptionStickerDictIntf == null) {
            return (SubscriptionStickerDictIntf) r1.A06(ImmutablePandoSubscriptionStickerDict.class);
        }
        return subscriptionStickerDictIntf;
    }

    public static 1Xj A0Y(1E9 r1, AnonymousClass17K r2) {
        return r1.A00.E5d(r1, r2);
    }

    public static ImmutablePandoUserDict A0Z(17P r1) {
        return (ImmutablePandoUserDict) r1.A07(ImmutablePandoUserDict.class);
    }

    public static User A0b(1E9 r1, AnonymousClass17K r2) {
        return r1.A00.E5d(r1, r2);
    }

    public static User A0c(1E9 r2, 17P r3, int i) {
        Parcelable.Creator creator = User.CREATOR;
        return 1aC.A01(r2, (ImmutablePandoUserDict) r3.A04(i, ImmutablePandoUserDict.class));
    }

    public static void A0j(17Z r2, StickerTraySurface stickerTraySurface) {
        if (stickerTraySurface != null) {
            r2.A0R("surface", stickerTraySurface.A00);
        }
    }

    public static void A0k(17Z r1, SubscriptionStickerDict subscriptionStickerDict) {
        if (subscriptionStickerDict != null) {
            r1.A0q("subscription_sticker");
            D06.A00(r1, subscriptionStickerDict);
        }
    }

    public static void A0l(17Z r2, Number number) {
        if (number != null) {
            r2.A0P("is_hidden", number.intValue());
        }
    }

    public static void A0m(17Z r2, Number number) {
        if (number != null) {
            r2.A0P("is_pinned", number.intValue());
        }
    }

    public static void A0n(17Z r2, Number number) {
        if (number != null) {
            r2.A0P("is_sticker", number.intValue());
        }
    }

    public static void A0o(17Z r2, Number number) {
        if (number != null) {
            r2.A0P("is_fb_sticker", number.intValue());
        }
    }

    public static void A0p(17Z r2, Number number) {
        if (number != null) {
            r2.A0P("sticker_style_enum", number.intValue());
        }
    }

    public static void A0q(17Z r2, Number number) {
        if (number != null) {
            r2.A0O("x", number.floatValue());
        }
    }

    public static void A0r(17Z r2, Number number) {
        if (number != null) {
            r2.A0O("y", number.floatValue());
        }
    }

    public static void A0s(17Z r2, Number number) {
        if (number != null) {
            r2.A0O("z", number.floatValue());
        }
    }

    public static void A0t(17Z r2, Number number) {
        if (number != null) {
            r2.A0O(IgReactMediaPickerNativeModule.WIDTH, number.floatValue());
        }
    }

    public static void A0u(17Z r2, Number number) {
        if (number != null) {
            r2.A0O(IgReactMediaPickerNativeModule.HEIGHT, number.floatValue());
        }
    }

    public static void A0v(17Z r2, Number number) {
        if (number != null) {
            r2.A0O("rotation", number.floatValue());
        }
    }

    public static void A0w(17Z r2, Number number) {
        if (number != null) {
            r2.A0O("end_time_ms", number.floatValue());
        }
    }

    public static void A0x(17Z r2, Number number) {
        if (number != null) {
            r2.A0O("start_time_ms", number.floatValue());
        }
    }

    public static void A0y(17Z r1, String str) {
        if (str != null) {
            r1.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
    }

    public static void A0z(17Z r1, String str) {
        if (str != null) {
            r1.A0R("text", str);
        }
    }

    public static void A10(17Z r1, String str) {
        if (str != null) {
            r1.A0R(DialogModule.KEY_TITLE, str);
        }
    }

    public static void A11(17Z r1, String str) {
        if (str != null) {
            r1.A0R("media_id", str);
        }
    }

    public static void A12(17Z r1, String str) {
        if (str != null) {
            r1.A0R("media_type", str);
        }
    }

    public static void A13(17Z r1, String str) {
        if (str != null) {
            r1.A0R("attribution", str);
        }
    }

    public static void A14(17Z r1, String str) {
        if (str != null) {
            r1.A0R("merchant_id", str);
        }
    }

    public static void A15(17Z r1, String str) {
        if (str != null) {
            r1.A0R("display_type", str);
        }
    }

    public static void A16(17Z r1, String str) {
        if (str != null) {
            r1.A0R("attribution_url", str);
        }
    }

    public static void A17(17Z r1, String str) {
        if (str != null) {
            r1.A0R("custom_text_color", str);
        }
    }

    public static void A1J(User user, Map map) {
        if (user != null) {
            map.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, user.A08());
        }
    }

    public static AnonymousClass4L7 A0G(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, Dbq.A03());
    }

    public static AnonymousClass4Kx A0K(AnonymousClass4Kr r0, AnonymousClass4Kr r1, AnonymousClass4Kr r2) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r0, r1, r2});
    }

    public static AnonymousClass4Kx A0L(AnonymousClass4Kr r0, AnonymousClass4Kr r1, AnonymousClass4Kr r2, AnonymousClass4Kr r3) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r0, r1, r2, r3});
    }

    public static AnonymousClass4Kx A0M(AnonymousClass4Kr r0, AnonymousClass4Kr r1, AnonymousClass4Kr r2, AnonymousClass4Kr r3, AnonymousClass4Kr r4) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r0, r1, r2, r3, r4});
    }

    public static AnonymousClass4Kx A0N(Object obj, AnonymousClass4Kr[] r1, int i, int i2, int i3) {
        System.arraycopy(obj, i, r1, i2, i3);
        return new AnonymousClass4Kx(r1);
    }

    public static TreeUpdaterJNI A0P(TreeJNI treeJNI, Map map) {
        return new TreeUpdaterJNI(0Yt.A0B(map), treeJNI);
    }

    public static 1hu A0T(17Z r0, String str) {
        r0.A0q(str);
        return new 1hu((UserSession) null);
    }

    public static Boolean A0d(C250663lr r0, String str, int i) {
        return Boolean.valueOf(r0.getCoercedBooleanField(i, str));
    }

    public static Double A0e(16F r1) {
        return Double.valueOf(r1.A0U());
    }

    public static Float A0f(16F r2) {
        return new Float(r2.A0U());
    }

    public static Integer A0g(C250663lr r0, String str, int i) {
        return Integer.valueOf(r0.getCoercedIntField(i, str));
    }

    public static String A0i(C250663lr r0, String str, int i) {
        String optionalStringField = r0.getOptionalStringField(i, str);
        if (optionalStringField == null) {
            return "";
        }
        return optionalStringField;
    }

    public static void A18(17Z r1, Iterator it) {
        String str = (String) it.next();
        if (str != null) {
            r1.A0t(str);
        }
    }

    public static void A19(17Z r2, Iterator it) {
        User user = (User) it.next();
        if (user != null) {
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r2, user);
        }
    }

    public static void A1A(16F r2) {
        if (r2.A11() != 16L.A0G) {
            r2.A1P();
        }
    }

    public static void A1B(16F r0, AbstractCollection abstractCollection) {
        SimpleImageUrl A00 = 16h.A00(r0);
        if (A00 != null) {
            abstractCollection.add(A00);
        }
    }

    public static void A1C(16F r0, AbstractCollection abstractCollection) {
        AndroidLinkImpl parseFromJson = C250113kv.parseFromJson(r0);
        if (parseFromJson != null) {
            abstractCollection.add(parseFromJson);
        }
    }

    public static void A1D(16F r0, AbstractCollection abstractCollection) {
        1Xj A00 = 1Xj.A00(r0);
        if (A00 != null) {
            abstractCollection.add(A00);
        }
    }

    public static void A1F(16F r0, AbstractCollection abstractCollection) {
        C276014sL parseFromJson = C275974sH.parseFromJson(r0);
        if (parseFromJson != null) {
            abstractCollection.add(parseFromJson);
        }
    }

    public static void A1G(16F r0, AbstractCollection abstractCollection) {
        ProductDetailsProductItemDict parseFromJson = C275404q6.parseFromJson(r0);
        if (parseFromJson != null) {
            abstractCollection.add(parseFromJson);
        }
    }

    public static void A1H(1E9 r1, AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C65211bM) it.next()).FDv(r1));
    }

    public static void A1K(Object obj, Map map) {
        map.put("x", 012.A0p(String.valueOf(obj)));
    }

    public static void A1L(Object obj, Map map) {
        map.put("y", 012.A0p(String.valueOf(obj)));
    }

    public static void A1M(Object obj, Map map) {
        map.put("z", 012.A0p(String.valueOf(obj)));
    }

    public static void A1N(Object obj, Map map) {
        map.put(IgReactMediaPickerNativeModule.WIDTH, 012.A0p(String.valueOf(obj)));
    }

    public static void A1O(Object obj, Map map) {
        map.put(IgReactMediaPickerNativeModule.HEIGHT, 012.A0p(String.valueOf(obj)));
    }

    public static void A1P(Object obj, Map map) {
        map.put("rotation", 012.A0p(String.valueOf(obj)));
    }

    public static void A1Q(Object obj, Map map) {
        map.put("end_time_ms", 012.A0p(String.valueOf(obj)));
    }

    public static void A1R(Object obj, Map map) {
        map.put("start_time_ms", 012.A0p(String.valueOf(obj)));
    }

    public static void A1S(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((AudioFilterInfoIntf) it.next()).F0c());
    }

    public static void A1T(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((User) it.next()).A08());
    }

    public static void A1U(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((1Xj) it.next()).A1C());
    }

    public static void A1V(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C272014jx) it.next()).FCL());
    }

    public static void A1W(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((AndroidLink) it.next()).FES());
    }

    public static void A1X(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C246193eB) it.next()).F3D());
    }

    public static boolean A1Y(16F r0, Object obj) {
        r0.A1J();
        return PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(obj);
    }

    public static boolean A1Z(16F r0, Object obj) {
        r0.A1J();
        return DialogModule.KEY_ITEMS.equals(obj);
    }

    public static boolean A1a(16F r0, Object obj) {
        r0.A1J();
        return "attribution".equals(obj);
    }

    public static boolean A1b(16F r1, String str) {
        String A0q = r1.A0q();
        r1.A1J();
        return str.equals(A0q);
    }
}
