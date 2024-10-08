package X;

import android.graphics.Paint;
import android.media.MediaCodec;
import com.facebook.common.json.FbJsonField;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastInitResponse;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.XCh  reason: case insensitive filesystem */
public abstract class C21056XCh {
    public static boolean A0U(String str, String str2, AbstractMap abstractMap) {
        String str3 = str;
        abstractMap.put(str3, new SJE(str3, str2, (String) null, 0, 1, true));
        return false;
    }

    public static int A02(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long A03(ST7 st7, long j) {
        st7.A0A(1);
        long A06 = j | ((long) (st7.A06(15) << 15)) | ((long) st7.A06(15));
        st7.A0A(1);
        return A06;
    }

    public static Paint A04() {
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(15.0f);
        return paint;
    }

    public static FbJsonField A05(String str) {
        return FbJsonField.jsonField(VideoBroadcastInitResponse.class.getDeclaredField(str), (Class) null, (TA4) null);
    }

    public static IllegalArgumentException A07(String str, Object[] objArr) {
        return new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    public static RuntimeException A08(1tn r2, Throwable th) {
        return new RuntimeException(002.A0R("Failed to create instance of ", r2.A02.getName()), th);
    }

    public static String A0B(Map map) {
        map.put("bottom", "Dynamic");
        map.put("collapsable", "boolean");
        map.put("collapsableChildren", "boolean");
        map.put("color", "Color");
        map.put("columnGap", "Dynamic");
        map.put("display", "String");
        map.put("end", "Dynamic");
        map.put("experimental_layoutConformance", "String");
        return "Dynamic";
    }

    public static GeneralSecurityException A0C(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid DEM parameters ");
        sb.append(obj);
        sb.append("; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported.");
        return new GeneralSecurityException(sb.toString());
    }

    public static PublicKey A0D(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return ((KeyFactory) AnonymousClass9DU.A03.A00.BHw("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
    }

    public static void A0E(1W6 r2) {
        r2.E5k("PRAGMA wal_checkpoint(FULL)").close();
        if (!((1W5) r2).A00.inTransaction()) {
            r2.AT6("VACUUM");
        }
    }

    public static void A0G(0Aj r2, 0jB r3, Long l) {
        r2.A9F("multi_ads_first_ad_id", l);
        r2.A9F("multi_ads_type", (Long) r3.A01(C271774jZ.A5w));
    }

    public static void A0H(C391719tX r3, C39800A9v a9v, Object obj) {
        r3.A00("profile", a9v.A06);
        r3.A00("b_frames", String.valueOf(a9v.A07));
        r3.A00("explicitly_set_baseline", String.valueOf(a9v.A08));
        r3.A00("size", 002.A0P("x", a9v.A05, a9v.A04));
        r3.A00(TraceFieldType.Bitrate, String.valueOf(a9v.A00));
        r3.A00("frameRate", String.valueOf(a9v.A03));
        r3.A00("iFrameIntervalS", String.valueOf(5));
        if (obj instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) obj;
            r3.A00("isRecoverable", String.valueOf(codecException.isRecoverable()));
            r3.A00("isTransient", String.valueOf(codecException.isTransient()));
        }
    }

    public static void A0I(Object obj, Object obj2, Object obj3, Map map) {
        map.put(obj, obj2);
        map.put("overflow", "String");
        map.put("padding", obj3);
        map.put("paddingBlock", obj3);
        map.put("paddingBlockEnd", obj3);
        map.put("paddingBlockStart", obj3);
        map.put("paddingBottom", obj3);
        map.put("paddingEnd", obj3);
        map.put("paddingHorizontal", obj3);
        map.put("paddingInline", obj3);
        map.put("paddingInlineEnd", obj3);
        map.put("paddingInlineStart", obj3);
        map.put("paddingLeft", obj3);
        map.put("paddingRight", obj3);
        map.put("paddingStart", obj3);
        map.put("paddingTop", obj3);
        map.put("paddingVertical", obj3);
    }

    public static void A0J(Object obj, Map map) {
        map.put("maxFontSizeMultiplier", "number");
        map.put("maxHeight", obj);
        map.put("maxWidth", obj);
        map.put("minHeight", obj);
        map.put("minWidth", obj);
        map.put("minimumFontScale", "number");
    }

    public static void A0K(Object obj, Map map) {
        map.put("margin", obj);
        map.put("marginBlock", obj);
        map.put("marginBlockEnd", obj);
        map.put("marginBlockStart", obj);
        map.put("marginBottom", obj);
        map.put("marginEnd", obj);
        map.put("marginHorizontal", obj);
        map.put("marginInline", obj);
        map.put("marginInlineEnd", obj);
        map.put("marginInlineStart", obj);
        map.put("marginLeft", obj);
        map.put("marginRight", obj);
        map.put("marginStart", obj);
        map.put("marginTop", obj);
        map.put("marginVertical", obj);
    }

    public static void A0L(Object obj, Map map) {
        map.put("flex", "number");
        map.put("flexBasis", obj);
        map.put("flexDirection", "String");
        map.put("flexGrow", "number");
        map.put("flexShrink", "number");
        map.put("flexWrap", "String");
        map.put("fontFamily", "String");
        map.put("fontSize", "number");
        map.put("fontStyle", "String");
        map.put("fontVariant", "Array");
        map.put("fontWeight", "String");
        map.put("gap", obj);
        map.put(IgReactMediaPickerNativeModule.HEIGHT, obj);
        map.put("includeFontPadding", "boolean");
        map.put("inset", obj);
        map.put("insetBlock", obj);
        map.put("insetBlockEnd", obj);
        map.put("insetBlockStart", obj);
        map.put("insetInline", obj);
        map.put("insetInlineEnd", obj);
        map.put("insetInlineStart", obj);
        map.put("justifyContent", "String");
        map.put("left", obj);
        map.put("letterSpacing", "number");
        map.put("lineHeight", "number");
    }

    public static void A0M(Object obj, Map map) {
        map.put("collapsableChildren", obj);
        map.put("columnGap", "Dynamic");
        map.put("display", "String");
        map.put("end", "Dynamic");
        map.put("experimental_layoutConformance", "String");
        map.put("flex", "number");
        map.put("flexBasis", "Dynamic");
        map.put("flexDirection", "String");
        map.put("flexGrow", "number");
        map.put("flexShrink", "number");
        map.put("flexWrap", "String");
        map.put("gap", "Dynamic");
        map.put(IgReactMediaPickerNativeModule.HEIGHT, "Dynamic");
        map.put("inset", "Dynamic");
        map.put("insetBlock", "Dynamic");
        map.put("insetBlockEnd", "Dynamic");
        map.put("insetBlockStart", "Dynamic");
        map.put("insetInline", "Dynamic");
        map.put("insetInlineEnd", "Dynamic");
        map.put("insetInlineStart", "Dynamic");
        map.put("justifyContent", "String");
        map.put("left", "Dynamic");
    }

    public static void A0N(Object obj, Map map) {
        map.put("maxHeight", "Dynamic");
        map.put("maxWidth", "Dynamic");
        map.put("minHeight", "Dynamic");
        map.put("minWidth", "Dynamic");
        map.put("onLayout", obj);
        map.put("onPointerEnter", obj);
        map.put("onPointerLeave", obj);
    }

    public static void A0O(Object obj, Map map) {
        map.put("position", "String");
        map.put("right", obj);
        map.put("role", "String");
        map.put("rowGap", obj);
        map.put("start", obj);
    }

    public static void A0P(Object obj, Map map) {
        map.put("textAlign", "String");
        map.put("textBreakStrategy", "String");
        map.put("textDecorationLine", "String");
        map.put("textShadowColor", "Color");
        map.put("textShadowOffset", "Map");
        map.put("textShadowRadius", "number");
        map.put("textTransform", "String");
        map.put("top", obj);
        map.put(IgReactMediaPickerNativeModule.WIDTH, obj);
    }

    public static void A0Q(Map map) {
        map.put("alignContent", "String");
        map.put("alignItems", "String");
        map.put("alignSelf", "String");
    }

    public static void A0R(Map map) {
        map.put("borderBottomWidth", "number");
        map.put("borderEndWidth", "number");
        map.put("borderLeftWidth", "number");
        map.put("borderRightWidth", "number");
        map.put("borderStartWidth", "number");
        map.put("borderTopWidth", "number");
        map.put("borderWidth", "number");
    }

    public static void A0S(Map map) {
        map.put("numberOfLines", "number");
        map.put("onLayout", "boolean");
        map.put("onPointerEnter", "boolean");
        map.put("onPointerLeave", "boolean");
    }

    public static void A0T(Map map) {
        map.put("position", "String");
        map.put("right", "Dynamic");
        map.put("rowGap", "Dynamic");
        map.put("start", "Dynamic");
        map.put("top", "Dynamic");
        map.put(IgReactMediaPickerNativeModule.WIDTH, "Dynamic");
    }

    public static double A00(0xF r0, String str) {
        Double A02 = r0.A02(str);
        if (A02 != null) {
            return A02.doubleValue();
        }
        return -1.0d;
    }

    public static int A01(Object obj) {
        return (527 + obj.hashCode()) * 31;
    }

    public static XPD A06(XPD xpd, 1Ab r3, 1Ab r4, int i) {
        int A02 = r3.A02(i);
        if (A02 == 0) {
            return null;
        }
        int i2 = A02 + r3.A00;
        int i3 = i2 + r3.A01.getInt(i2);
        ByteBuffer byteBuffer = r3.A01;
        r4.A00 = i3;
        r4.A01 = byteBuffer;
        return xpd;
    }

    public static String A09(int i) {
        switch (i) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static String A0A(StringBuilder sb, int i) {
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public static void A0F(1W6 r1, String str) {
        r1.AT6(str);
        r1.AT6("CREATE INDEX IF NOT EXISTS `index_message_updates_table_thread_jid_target_item_id` ON `message_updates_table` (`thread_jid`, `target_item_id`)");
        r1.AT6("CREATE INDEX IF NOT EXISTS `index_message_updates_table_target_item_id` ON `message_updates_table` (`target_item_id`)");
        r1.AT6("CREATE INDEX IF NOT EXISTS `index_message_updates_table_offline_threading_id` ON `message_updates_table` (`offline_threading_id`)");
        r1.AT6("CREATE INDEX IF NOT EXISTS `index_message_updates_table_hidden_ts_sec` ON `message_updates_table` (`hidden_ts_sec`)");
    }
}
