package X;

import com.facebook.dsp.core.ColorData;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.yoga.YogaNodeJNIBase;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.settings2.core.model.BloksNavigationRowDestinationValue;
import com.instagram.settings2.core.model.DictionaryValue;
import com.instagram.settings2.core.model.EqualsValue;
import com.instagram.settings2.core.model.IfValue;
import com.instagram.settings2.core.model.OrValue;
import com.instagram.settings2.core.model.ServerValue;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.XCe  reason: case insensitive filesystem */
public abstract class C21053XCe {
    public static int A02(Enum enumR) {
        0qQ.A0B(enumR, 0);
        return enumR.ordinal();
    }

    public static int A03(Number number) {
        0qQ.A0B(number, 0);
        return number.intValue();
    }

    public static C21116XFg A07(Object obj) {
        0qQ.A0B(obj, 0);
        return C21116XFg.A00;
    }

    public static TreeUpdaterJNI A09(SubscriptionStickerDictIntf subscriptionStickerDictIntf) {
        if (subscriptionStickerDictIntf != null) {
            return subscriptionStickerDictIntf.FHC();
        }
        return null;
    }

    public static Double A0X(0xF r2, String str) {
        String A05 = r2.A05(str);
        if (A05 != null) {
            return 012.A0p(A05);
        }
        return null;
    }

    public static Double A0Z(Number number) {
        if (number != null) {
            return Double.valueOf((double) number.floatValue());
        }
        return null;
    }

    public static String A0c(0j9 r2, 0jB r3) {
        Serializable A01 = r3.A01(r2);
        if (A01 != null) {
            return A01.toString();
        }
        return null;
    }

    public static float A00(Object obj, float f) {
        if (obj instanceof Double) {
            return ((Number) obj).floatValue();
        }
        return f;
    }

    public static long A04(ReactShadowNodeImpl reactShadowNodeImpl) {
        return ((YogaNodeJNIBase) reactShadowNodeImpl.A0B).mNativePointer;
    }

    public static XGP A05(Object obj, Object obj2) {
        0qQ.A0C(obj, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (XGP) AnonymousClass5P3.A08((XGP) obj2);
    }

    public static ColorData A06(int i, int i2) {
        return new ColorData(i, i2);
    }

    public static C61079JwH A08(XTW xtw, MR1 mr1, String str) {
        return new C61079JwH(xtw, mr1, str);
    }

    public static AnonymousClass4Y0 A0A(C257263x7 r3, C266214Xz r4) {
        return new AnonymousClass4Y0(r4.A01, r3, r4.A02);
    }

    public static ClipsMidCardSubtype A0B(String str, String str2, int i) {
        return new ClipsMidCardSubtype(str, i, str2);
    }

    public static InstagramMidcardType A0C(String str, String str2, int i) {
        return new InstagramMidcardType(str, i, str2);
    }

    public static 0jB A0D(0jB r1) {
        return r1.A01(C271774jZ.A5N);
    }

    public static C47271Dtz A0E(String str, Locale locale, int i, int i2) {
        return new C47271Dtz(str, locale, i, i2);
    }

    public static BloksNavigationRowDestinationValue A0F(C64185LSs lSs, C64185LSs lSs2, DictionaryValue dictionaryValue, String str) {
        return new BloksNavigationRowDestinationValue(lSs, lSs2, dictionaryValue, str);
    }

    public static EqualsValue A0G(C64185LSs lSs, Object obj) {
        return new EqualsValue(lSs, new KY2(obj));
    }

    public static IfValue A0H(C64185LSs lSs, C64185LSs lSs2, C64185LSs lSs3) {
        return new IfValue(lSs, lSs2, lSs3);
    }

    public static IfValue A0I(C64185LSs lSs, C64185LSs lSs2, Object obj) {
        return new IfValue(lSs, lSs2, new KY2(obj));
    }

    public static KY6 A0K(Class cls, Integer num) {
        return new KY6(num, new 0Yh(cls));
    }

    public static ServerValue A0N(Class cls, String str) {
        return new ServerValue(str, new 0Yh(cls));
    }

    public static ServerValue A0O(String str, C62230ry r2) {
        return new ServerValue(str, r2);
    }

    public static KY2 A0Q(C21251XQw xQw) {
        return new KY2(new C47268Dtw(xQw));
    }

    public static KY2 A0R(Integer num) {
        return new KY2(new C47268Dtw(num));
    }

    public static KY2 A0S(Object obj) {
        return new KY2(obj);
    }

    public static AbstractCollection A0e(0jB r1) {
        return (AbstractCollection) r1.A01(C271774jZ.A6j);
    }

    public static AbstractCollection A0f(0jB r1) {
        return (AbstractCollection) r1.A01(C271774jZ.A8j);
    }

    public static AbstractMap A0g(0jB r1) {
        return (AbstractMap) r1.A01(C271774jZ.A6l);
    }

    public static HashMap A0h(int i) {
        return new HashMap(i);
    }

    public static List A0j(Object obj) {
        List singletonList = Collections.singletonList(new KY2(obj));
        0qQ.A07(singletonList);
        return singletonList;
    }

    public static Locale A0l(String str, String str2) {
        return new Locale(str, str2);
    }

    public static void A0y(0Aj r2, 0jB r3) {
        r2.A7p("is_unified_video", (Boolean) r3.A01(C271774jZ.A4w));
    }

    public static void A0z(0Aj r2, 0jB r3) {
        r2.AAJ("carousel_media_id", (String) r3.A01(C271774jZ.A10));
    }

    public static void A10(0Aj r2, 0jB r3) {
        r2.A9F("ad_position_from_server", (Long) r3.A01(C271774jZ.A0I));
    }

    public static void A11(0Aj r2, 0jB r3) {
        r2.AAJ("entity_page_name", (String) r3.A01(C271774jZ.A2c));
    }

    public static void A12(0Aj r2, 0jB r3) {
        r2.AAJ("carousel_cover_media_id", (String) r3.A01(C271774jZ.A0x));
    }

    public static void A13(0Aj r2, 0jB r3) {
        r2.A9F("media_owner_id", (Long) r3.A01(C271774jZ.A5S));
    }

    public static void A14(0Aj r1, Double d) {
        r1.A8D("normalized_feed_position", d);
    }

    public static void A15(0Aj r1, String str) {
        r1.AAJ("waterfall_id", str);
    }

    public static void A16(0Aj r1, Map map) {
        r1.A9H("tagged_user_ids", map);
    }

    public static void A17(0Aj r1, Map map) {
        r1.A9H("product_merchant_ids", map);
    }

    public static void A19(0bb r2, 0jB r3) {
        r2.A06("cta_color", (String) r3.A01(C271774jZ.A1i));
    }

    public static void A1C(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setWidth(new C19057WIj(obj));
    }

    public static void A1D(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setRowGap(new C19057WIj(obj));
    }

    public static void A1E(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setMaxWidth(new C19057WIj(obj));
    }

    public static void A1F(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setMaxHeight(new C19057WIj(obj));
    }

    public static void A1G(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setHeight(new C19057WIj(obj));
    }

    public static void A1H(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setMinHeight(new C19057WIj(obj));
    }

    public static void A1I(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setMinWidth(new C19057WIj(obj));
    }

    public static void A1J(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setFlexBasis(new C19057WIj(obj));
    }

    public static void A1K(LayoutShadowNode layoutShadowNode, Object obj) {
        layoutShadowNode.setGap(new C19057WIj(obj));
    }

    public static void A1L(LayoutShadowNode layoutShadowNode, Object obj, int i) {
        layoutShadowNode.setPositionValues(i, new C19057WIj(obj));
    }

    public static void A1M(LayoutShadowNode layoutShadowNode, Object obj, int i) {
        layoutShadowNode.setPaddings(i, new C19057WIj(obj));
    }

    public static void A1N(LayoutShadowNode layoutShadowNode, Object obj, int i) {
        layoutShadowNode.setMargins(i, new C19057WIj(obj));
    }

    public static void A1O(Object obj, int i, Object obj2) {
        System.arraycopy(obj, i, obj2, 27, 2);
    }

    public static void A1Q(Object obj, Map map) {
        map.put("surface", obj);
    }

    public static void A1R(Object obj, Map map) {
        map.put("is_hidden", obj);
    }

    public static void A1S(Object obj, Map map) {
        map.put("is_pinned", obj);
    }

    public static void A1T(Object obj, Map map) {
        map.put("media_type", obj);
    }

    public static void A1U(Object obj, Map map) {
        map.put("is_sticker", obj);
    }

    public static void A1V(Object obj, Map map) {
        map.put("attribution", obj);
    }

    public static void A1W(Object obj, Map map) {
        map.put("display_type", obj);
    }

    public static void A1X(Object obj, Map map) {
        map.put("is_fb_sticker", obj);
    }

    public static void A1Y(Object obj, Map map) {
        map.put("attribution_url", obj);
    }

    public static void A1Z(Object obj, Map map) {
        map.put("custom_text_color", obj);
    }

    public static void A1a(Object obj, Map map) {
        map.put("sticker_style_enum", obj);
    }

    public static void A1b(Object obj, Map map) {
        map.put("subscription_sticker", obj);
    }

    public static int A01(Dynamic dynamic, C17791Vg3 vg3) {
        vg3.A00(dynamic);
        return vg3.A01.intValue();
    }

    public static C48011EQv A0J(long j, boolean z) {
        return new C48011EQv(AnonymousClass0yP.A00(j), z);
    }

    public static OrValue A0L(C64185LSs lSs, C64185LSs lSs2) {
        return new OrValue(0sr.A1P(new C64185LSs[]{lSs, lSs2}));
    }

    public static OrValue A0M(Object[] objArr) {
        return new OrValue(0sr.A1P(objArr));
    }

    public static KY2 A0P(int i) {
        return new KY2(Integer.valueOf(i));
    }

    public static KY2 A0T(Object obj) {
        List singletonList = Collections.singletonList(obj);
        0qQ.A07(singletonList);
        return new KY2(singletonList);
    }

    public static KY2 A0U(Object[] objArr) {
        return new KY2(0sr.A1P(objArr));
    }

    public static IOException A0V(String str, Locale locale, Object[] objArr) {
        return new IOException(String.format(locale, str, objArr));
    }

    public static Boolean A0W(0j9 r0, 0jB r1) {
        return (Boolean) r1.A01(r0);
    }

    public static Double A0Y(0j9 r0, 0jB r1) {
        return (Double) r1.A01(r0);
    }

    public static Double A0a(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    public static Number A0b(0j9 r0, 0jB r1) {
        return (Number) r1.A01(r0);
    }

    public static AbstractCollection A0d(0j9 r0, 0jB r1) {
        return (AbstractCollection) r1.A01(r0);
    }

    public static LinkedHashMap A0i(Iterable iterable) {
        return new LinkedHashMap(0Yt.A08(iterable));
    }

    public static List A0k(String str) {
        return Arrays.asList(new String[]{str});
    }

    public static void A0m(1W6 r1, String str) {
        r1.AT6(str);
        r1.AT6("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public static void A0n(1W6 r1, Iterator it) {
        ((AnonymousClass2NN) it.next()).A00(r1);
    }

    public static void A0o(1W6 r1, Iterator it) {
        ((AnonymousClass2NN) it.next()).A02(r1);
    }

    public static void A0p(0Aj r2, long j) {
        r2.A9F("is_igtv", Long.valueOf(j));
    }

    public static void A0q(0Aj r1, 0xF r2, String str) {
        r1.AAJ(str, r2.A05(str));
    }

    public static void A0r(0Aj r2, 0j9 r3, 0jB r4) {
        r2.AAJ("hashtag_name", (String) r4.A01(r3));
    }

    public static void A0s(0Aj r2, 0j9 r3, 0jB r4) {
        r2.AAJ("hashtag_follow_status", (String) r4.A01(r3));
    }

    public static void A0t(0Aj r2, 0j9 r3, 0jB r4) {
        r2.A9F("m_t", (Long) r4.A01(r3));
    }

    public static void A0u(0Aj r2, 0j9 r3, 0jB r4) {
        r2.A9F("a_pk", (Long) r4.A01(r3));
    }

    public static void A0v(0Aj r2, 0j9 r3, 0jB r4) {
        r2.A9F("ad_id", (Long) r4.A01(r3));
    }

    public static void A0w(0Aj r2, 0j9 r3, 0jB r4) {
        r2.A9F("carousel_m_t", (Long) r4.A01(r3));
    }

    public static void A0x(0Aj r2, 0j9 r3, 0jB r4) {
        r2.A9F("carousel_media_type", (Long) r4.A01(r3));
    }

    public static void A18(0bb r1, 0xF r2, String str) {
        r1.A06(str, r2.A05(str));
    }

    public static void A1A(0bb r1, String str, double d) {
        r1.A04(str, Double.valueOf(d));
    }

    public static void A1B(0bb r1, String str, long j) {
        r1.A05(str, Long.valueOf(j));
    }

    public static void A1P(Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, Collections.emptyList());
    }
}
