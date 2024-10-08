package X;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.media.audiofx.DynamicsProcessing;
import android.os.Build;
import android.view.KeyEvent;
import androidx.media3.common.Timeline;
import com.facebook.common.dextricks.Constants;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.instagram.api.schemas.AchievementName;
import com.instagram.api.schemas.ISOCountryCode;
import com.instagram.api.schemas.PaymentCredentialTypeEnum;
import com.instagram.settings2.core.model.AndValue;
import com.instagram.settings2.core.model.DictionaryValue;
import com.instagram.settings2.core.model.FbtLinkTokenValue;
import com.instagram.settings2.core.model.FbtWithTokensValue;
import com.instagram.settings2.core.model.IfValue;
import com.instagram.settings2.core.model.ServerValue;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.security.GeneralSecurityException;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.XCg  reason: case insensitive filesystem */
public abstract class C21055XCg {
    public static DynamicsProcessing.Mbc A03(DynamicsProcessing.Config config) {
        return config.getChannelByChannelIndex(0).getMbc();
    }

    public static SJE A05(String str, String str2, String str3, int i) {
        return new SJE(str, str2, str3, i, 1, true);
    }

    public static C256733wG A07(C256633w6 r2) {
        return (C256733wG) ((C256773wK) r2.A02(0).A03.get(0)).A07.get(0);
    }

    public static AndValue A0B(C64185LSs lSs, long j) {
        return new AndValue(0sr.A1P(new C64185LSs[]{lSs, new C48011EQv(AnonymousClass0yP.A00(j), true)}));
    }

    public static AndValue A0C(C48011EQv eQv, long j) {
        return new AndValue(0sr.A1P(new C48011EQv[]{eQv, new C48011EQv(AnonymousClass0yP.A00(j), true)}));
    }

    public static Boolean A0J(0xF r2, String str) {
        String A05 = r2.A05(str);
        if (A05 != null) {
            return Boolean.valueOf(Boolean.parseBoolean(A05));
        }
        return null;
    }

    public static Double A0K(0j9 r2, 0jB r3) {
        Number number = (Number) r3.A01(r2);
        if (number != null) {
            return Double.valueOf((double) number.floatValue());
        }
        return null;
    }

    public static Double A0L(0jB r3) {
        Number number = (Number) r3.A01(C271774jZ.A68);
        if (number != null) {
            return Double.valueOf((double) number.longValue());
        }
        return null;
    }

    public static Long A0N(0bb r2, 0jB r3, Long l) {
        r2.A05("screen_height", l);
        Number number = (Number) r3.A01(C271774jZ.A7n);
        if (number != null) {
            return Long.valueOf((long) number.doubleValue());
        }
        return null;
    }

    public static Long A0O(0xF r2, String str) {
        String A05 = r2.A05(str);
        if (A05 != null) {
            return Long.valueOf(Long.parseLong(A05));
        }
        return null;
    }

    public static Long A0P(0j9 r2, 0jB r3) {
        String str = (String) r3.A01(r2);
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static Long A0Q(0j9 r1, 0jB r2) {
        String str = (String) r2.A01(r1);
        if (str != null) {
            return 00y.A0n(10, str);
        }
        return null;
    }

    public static Long A0R(0j9 r2, 0jB r3) {
        Number number = (Number) r3.A01(r2);
        if (number != null) {
            return Long.valueOf((long) number.doubleValue());
        }
        return null;
    }

    public static List A0Z(String str, long j) {
        return 0sr.A1P(new C64185LSs[]{new C48011EQv(AnonymousClass0yP.A00(j), true), new ServerValue(str, new 0Yh(Boolean.class))});
    }

    public static void A0c(0Aj r2) {
        r2.AAJ("fb_user_id", (String) null);
    }

    public static void A1T(String str, String str2, AbstractMap abstractMap) {
        String str3 = str;
        abstractMap.put(str3, new SJE(str3, str2, (String) null, 1, 1, true));
    }

    public static int A00(Iterable iterable) {
        int A0L = 0se.A0L(0Yv.A1E(iterable, 10));
        if (A0L < 16) {
            return 16;
        }
        return A0L;
    }

    public static AudioFormat A02(int i, int i2) {
        return new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build();
    }

    public static 1VY A06(1VI r4, AnonymousClass1VQ r5, String str, String str2) {
        return r4.A02.AKv(1VU.A00(r4.A00, new 1VR(r4, r5, str, str2), r4.A04, false, false));
    }

    public static AchievementName A08(String str, String str2, int i) {
        return new AchievementName(str, i, str2);
    }

    public static ISOCountryCode A09(String str, int i) {
        return new ISOCountryCode(str, i, str);
    }

    public static PaymentCredentialTypeEnum A0A(String str, int i) {
        return new PaymentCredentialTypeEnum(str, i, str);
    }

    public static DictionaryValue A0D(Object obj, List list) {
        List singletonList = Collections.singletonList(new KY2(obj));
        0qQ.A07(singletonList);
        return new DictionaryValue(list, singletonList);
    }

    public static FbtWithTokensValue A0E(C64185LSs lSs, int i, int i2) {
        List singletonList = Collections.singletonList(new FbtLinkTokenValue(lSs, new KY2(new C61083JwL((MR0) new C61237JzV(i))), "learn_more"));
        0qQ.A07(singletonList);
        return new FbtWithTokensValue(i2, singletonList);
    }

    public static IfValue A0F(C64185LSs lSs, C64185LSs lSs2, int i) {
        return new IfValue(lSs, lSs2, new KY2(new C61083JwL((MR0) new C61237JzV(i))));
    }

    public static G9S A0G(C250663lr r1, Class cls, int i) {
        C250663lr A02 = r1.A02(cls, "friend_requests", i);
        if (A02 != null) {
            return (G9S) A02.A01(C383659fw.class, 839552330);
        }
        return null;
    }

    public static IOException A0H() {
        return new IOException("closed");
    }

    public static Serializable A0I(0Aj r2, 0jB r3) {
        r2.A9F("sponsor_tag_count", (Long) r3.A01(C271774jZ.A8F));
        return r3.A01(C271774jZ.A8H);
    }

    public static String A0S(int i) {
        if (i == 0) {
            return "STREAM_VOICE_CALL";
        }
        if (i == 1) {
            return "STREAM_SYSTEM";
        }
        if (i == 2) {
            return "STREAM_RING";
        }
        if (i == 3) {
            return "STREAM_MUSIC";
        }
        if (i == 4) {
            return "STREAM_ALARM";
        }
        if (i != 5) {
            return "STREAM_INVALID";
        }
        return "STREAM_NOTIFICATION";
    }

    public static String A0T(Map map) {
        map.put("bottom", "Dynamic");
        map.put("collapsable", "boolean");
        return "boolean";
    }

    public static void A0a(MediaFormat mediaFormat, C39800A9v a9v, boolean z) {
        mediaFormat.setInteger("profile", z ? 1 : 0);
        mediaFormat.setInteger("level", 1024);
        if (a9v.A02 == 7) {
            mediaFormat.setInteger("profile", 2);
            mediaFormat.setInteger("level", Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
            if (Build.VERSION.SDK_INT >= 33) {
                mediaFormat.setFeatureEnabled("hdr-editing", z);
            }
        }
    }

    public static void A0i(0Aj r2, 0jB r3) {
        r2.A9F("carousel_index", (Long) r3.A01(C271774jZ.A0z));
        r2.AAJ("carousel_media_id", (String) r3.A01(C271774jZ.A10));
    }

    public static void A0j(0Aj r2, 0jB r3) {
        r2.AAJ("hashtag_feed_type", (String) r3.A01(C271774jZ.A3N));
        r2.A9F("tab_index", (Long) r3.A01(C271774jZ.A8i));
    }

    public static void A0k(0Aj r2, 0jB r3) {
        r2.A9F("carousel_media_id_int", (Long) r3.A01(C271774jZ.A11));
        r2.AAJ("shopping_session_id", (String) r3.A01(C271774jZ.A80));
        r2.A9F("client_position", (Long) r3.A01(C271774jZ.A3r));
    }

    public static void A0l(0Aj r2, 0jB r3) {
        r2.A9F("top_likers_count", (Long) r3.A01(C271774jZ.A9I));
        r2.A9F("top_followers_count", (Long) r3.A01(C271774jZ.A9H));
        r2.AAJ("application_state", (String) r3.A01(C271774jZ.A0Q));
    }

    public static void A0m(0Aj r2, 0jB r3) {
        r2.AAJ("byline_text", (String) r3.A01(C271774jZ.A0l));
        r2.AAJ("sponsored_label_text", (String) r3.A01(C271774jZ.A8D));
    }

    public static void A0n(0Aj r2, 0jB r3) {
        r2.A9F("min_consumed_media_gap_to_previous_ad", (Long) r3.A01(C271774jZ.A5h));
        r2.A9F("min_consumed_media_gap_to_previous_netego", (Long) r3.A01(C271774jZ.A5i));
        r2.A9F("min_consumed_reel_gap_to_previous_ad", (Long) r3.A01(C271774jZ.A5j));
        r2.A9F("min_consumed_reel_gap_to_previous_netego", (Long) r3.A01(C271774jZ.A5k));
    }

    public static void A0o(0Aj r2, 0jB r3) {
        r2.A9F("entity_id", (Long) r3.A01(C271774jZ.A2Z));
        r2.AAJ("entity_name", (String) r3.A01(C271774jZ.A2a));
        r2.AAJ("entity_type", (String) r3.A01(C271774jZ.A2d));
    }

    public static void A0p(0Aj r2, 0jB r3) {
        r2.A9F("chaining_seed_media_id", (Long) r3.A01(C271774jZ.A3f));
        r2.A9F("chaining_seed_author_id", (Long) r3.A01(C271774jZ.A1B));
    }

    public static void A0q(0Aj r2, 0jB r3) {
        r2.A8D("time_elapsed", (Double) r3.A01(C271774jZ.A8z));
        r2.A8D("time_remaining", (Double) r3.A01(C271774jZ.A94));
    }

    public static void A0r(0Aj r2, 0jB r3) {
        r2.AAJ("dynamic_item_id", (String) r3.A01(C271774jZ.A2M));
        r2.AAJ("dynamic_creator_item_id", (String) r3.A01(C271774jZ.A2L));
    }

    public static void A0s(0Aj r2, 0jB r3) {
        r2.A9F("segment_index", (Long) r3.A01(C271774jZ.A7s));
        r2.A9F("segment_count", (Long) r3.A01(C271774jZ.A7r));
    }

    public static void A0t(0Aj r2, 0jB r3) {
        r2.A9F("chaining_seed_author_id", (Long) r3.A01(C271774jZ.A1B));
        r2.A9F("chaining_seed_media_id", (Long) r3.A01(C271774jZ.A3f));
    }

    public static void A0u(0Aj r2, 0jB r3) {
        r2.AAJ("reel_id", (String) r3.A01(C271774jZ.A7T));
        r2.A9F("reel_position", (Long) r3.A01(C271774jZ.A7U));
        r2.A9F("reel_size", (Long) r3.A01(C271774jZ.A7V));
    }

    public static void A0v(0Aj r2, 0jB r3) {
        r2.A9F("reel_size", (Long) r3.A01(C271774jZ.A7V));
        r2.A9F("reel_position", (Long) r3.A01(C271774jZ.A7U));
    }

    public static void A0w(0Aj r2, 0jB r3) {
        r2.A8D("media_dwell_time", (Double) r3.A01(C271774jZ.A5F));
        r2.A8D("media_time_elapsed", (Double) r3.A01(C271774jZ.A5Y));
    }

    public static void A0x(0Aj r2, 0jB r3) {
        r2.AAJ("topic_cluster_id", (String) r3.A01(C271774jZ.A9D));
        r2.AAJ("topic_cluster_title", (String) r3.A01(C271774jZ.A9F));
        r2.AAJ("topic_cluster_type", (String) r3.A01(C271774jZ.A9G));
    }

    public static void A0y(0Aj r2, 0jB r3) {
        r2.AAJ("collection_id", (String) r3.A01(C271774jZ.A1L));
        r2.AAJ("collection_name", (String) r3.A01(C271774jZ.A1N));
    }

    public static void A0z(0Aj r2, 0jB r3) {
        r2.A8D("elapsed_time_since_last_item", (Double) r3.A01(C271774jZ.A2P));
        r2.A7p("is_acp_delivered", (Boolean) r3.A01(C271774jZ.A3t));
    }

    public static void A10(0Aj r2, 0jB r3) {
        r2.A7p("is_influencer", (Boolean) r3.A01(C271774jZ.A4O));
        r2.A7p("is_checkout_enabled", (Boolean) r3.A01(C271774jZ.A41));
    }

    public static void A11(0Aj r2, 0jB r3) {
        r2.A9F("hashtag_id", (Long) r3.A01(C271774jZ.A3O));
        r2.AAJ("hashtag_name", (String) r3.A01(C271774jZ.A3Q));
    }

    public static void A12(0Aj r2, 0jB r3) {
        r2.AAJ("entity_type", (String) r3.A01(C271774jZ.A2d));
        r2.A9F("entity_id", (Long) r3.A01(C271774jZ.A2Z));
        r2.AAJ("entity_name", (String) r3.A01(C271774jZ.A2a));
    }

    public static void A13(0Aj r2, 0jB r3) {
        r2.A9F("segment_count", (Long) r3.A01(C271774jZ.A7r));
        r2.A9F("segment_index", (Long) r3.A01(C271774jZ.A7s));
    }

    public static void A14(0Aj r2, 0jB r3) {
        r2.AAJ("ad_pod_id", (String) r3.A01(C271774jZ.A0G));
        r2.A9F("index_in_ad_pod", (Long) r3.A01(C271774jZ.A3n));
    }

    public static void A15(0Aj r2, 0jB r3) {
        r2.AAJ("tray_session_id", (String) r3.A01(C271774jZ.A7X));
        r2.AAJ("viewer_session_id", (String) r3.A01(C271774jZ.A9i));
    }

    public static void A16(0Aj r2, 0jB r3) {
        r2.AAJ("media_tags_hashtag_name", (String) r3.A01(C271774jZ.A5V));
        r2.A9F("media_tags_total_hashtags", (Long) r3.A01(C271774jZ.A5W));
    }

    public static void A17(0Aj r2, 0jB r3) {
        r2.A9F("reel_gap_to_last_ad", (Long) r3.A01(C271774jZ.A7R));
        r2.A9F("reel_gap_to_last_netego", (Long) r3.A01(C271774jZ.A7S));
    }

    public static void A19(0Aj r2, 0jB r3, Long l) {
        r2.A9F("first_hscroll_item_ad_id", l);
        r2.A9F("horizontal_position_on_hscroll", (Long) r3.A01(C271774jZ.A3W));
        r2.A9F("vertical_position_on_feed_of_ads", (Long) r3.A01(C271774jZ.A9d));
        r2.A7p("is_multi_ads", (Boolean) r3.A01(C271774jZ.A4V));
        r2.A9F("multi_ads_type", (Long) r3.A01(C271774jZ.A5w));
        r2.AAJ("multi_ads_id", (String) r3.A01(C271774jZ.A5u));
        r2.A9F("position_in_multi_ads_unit", (Long) r3.A01(C271774jZ.A6Y));
    }

    public static void A1J(0bb r2, 0xF r3) {
        r2.A06("background_color_bottom", r3.A05("background_color_bottom"));
        r2.A06("background_color_top", r3.A05("background_color_top"));
    }

    public static void A1K(0bb r2, 0xF r3, Boolean bool) {
        r2.A03("is_caption_fully_displayed", bool);
        r2.A06("background_color_bottom", r3.A05("background_color_bottom"));
        r2.A06("background_color_caption", r3.A05("background_color_caption"));
        r2.A06("background_color_top", r3.A05("background_color_top"));
        r2.A06("caption_background_color_alpha", r3.A05("caption_background_color_alpha"));
    }

    public static void A1M(0bb r2, 0jB r3) {
        r2.A04("screen_density", (Double) r3.A01(C271774jZ.A7l));
        r2.A04("screen_height", (Double) r3.A01(C271774jZ.A7m));
        r2.A04("screen_width", (Double) r3.A01(C271774jZ.A7n));
    }

    public static void A1N(0bb r2, 0jB r3) {
        r2.A03("is_delayed_skip_ad", (Boolean) r3.A01(C271774jZ.A23));
        r2.A03("is_action_on_unskippable", (Boolean) r3.A01(C271774jZ.A22));
    }

    public static void A1O(0bb r2, 0jB r3, Object obj) {
        r2.A06("title_option", (String) obj);
        r2.A06(DialogModule.KEY_TITLE, (String) r3.A01(C271774jZ.A7J));
        r2.A06("subtitle", (String) r3.A01(C271774jZ.A7H));
        r2.A06("format", (String) r3.A01(C271774jZ.A79));
        r2.A05("image_width", (Long) r3.A01(C271774jZ.A7E));
        r2.A05("image_height", (Long) r3.A01(C271774jZ.A7D));
        r2.A03("hide_caption", (Boolean) r3.A01(C271774jZ.A7B));
        r2.A03("hide_social_context", (Boolean) r3.A01(C271774jZ.A7C));
        r2.A03("dismissible", (Boolean) r3.A01(C271774jZ.A77));
    }

    public static void A1P(LayoutShadowNode layoutShadowNode, Object obj, String str) {
        if (str.equals("columnGap")) {
            layoutShadowNode.setColumnGap(new C19057WIj(obj));
        }
    }

    public static void A1Q(XRq xRq, String str) {
        new PlayerOrigin(xRq, str);
    }

    public static void A1R(XRq xRq, String str, String str2) {
        new PlayerOrigin(xRq, str);
        new PlayerOrigin(xRq, str2);
    }

    public static void A1S(String str, AudioManager audioManager, int i, StringBuilder sb) {
        sb.append(002.A0g("  ", str, ": "));
        sb.append("volume=");
        sb.append(audioManager.getStreamVolume(i));
        sb.append(", max=");
        sb.append(audioManager.getStreamMaxVolume(i));
    }

    public static void A1U(String str, AbstractCollection abstractCollection, List list, List list2, boolean z) {
        abstractCollection.add(new S6D(str, list, list2, z));
    }

    public static void A1W(AbstractCollection abstractCollection, Iterator it) {
        String str = (String) it.next();
        0qQ.A0B(str, 0);
        Long A0n = 00y.A0n(10, str);
        if (A0n != null) {
            abstractCollection.add(A0n);
        }
    }

    public static boolean A1a(MediaFormat mediaFormat, C39800A9v a9v) {
        mediaFormat.setInteger("color-format", 2130708361);
        mediaFormat.setInteger(TraceFieldType.Bitrate, a9v.A00);
        mediaFormat.setInteger("frame-rate", a9v.A03);
        mediaFormat.setInteger("i-frame-interval", 5);
        mediaFormat.setInteger("channel-count", 1);
        mediaFormat.setInteger("max-input-size", 0);
        if (a9v.A09) {
            mediaFormat.setInteger("color-range", 2);
            mediaFormat.setInteger("color-standard", a9v.A01);
            mediaFormat.setInteger("color-transfer", a9v.A02);
        }
        return true;
    }

    public static long A01(KeyEvent keyEvent) {
        return ((long) keyEvent.getKeyCode()) << 32;
    }

    public static Timeline A04(C22056Xui xui) {
        C22056Xui.A02(xui);
        return xui.A0A.A06;
    }

    public static Long A0M(0Aj r2, 0j9 r3, 0j9 r4, 0jB r5) {
        r2.A9F("a_pk_long", (Long) r5.A01(r3));
        return (Long) r5.A01(r4);
    }

    public static BigInteger A0U(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.multiply(bigInteger).mod(bigInteger2);
    }

    public static ProtocolException A0V(String str, String str2) {
        return new ProtocolException(002.A0R(str, str2));
    }

    public static GeneralSecurityException A0W(String str, Object[] objArr) {
        return new GeneralSecurityException(String.format(str, objArr));
    }

    public static HashSet A0X(Object obj, Object obj2, AbstractMap abstractMap, int i) {
        abstractMap.put(obj, obj2);
        return new HashSet(i);
    }

    public static HashSet A0Y(Object obj, Object[] objArr, int i, int i2, int i3) {
        System.arraycopy(obj, i, objArr, i2, i3);
        return 0sc.A05(objArr);
    }

    public static void A0b(1W6 r1, Iterator it) {
        ((AnonymousClass2NN) it.next()).A01(r1);
    }

    public static void A0d(0Aj r2, AnonymousClass0iw r3, 0jB r4, Long l, String str) {
        r2.A9F(str, l);
        r2.A9F("carousel_starting_media_id", (Long) r4.A01(C271774jZ.A16));
        r2.AAJ("module_name", r3.getModuleName());
        r2.AAJ("ranking_session_id", (String) r4.A01(C271774jZ.A6q));
        r2.AAJ("ranking_info_token", (String) r4.A01(C271774jZ.A6p));
        r2.A9F("chaining_seed_author_id", (Long) r4.A01(C271774jZ.A1B));
        r2.A9F("chaining_seed_media_id", (Long) r4.A01(C271774jZ.A3f));
        r2.AAJ("radio_type", (String) r4.A01(C271774jZ.A6o));
    }

    public static void A0e(0Aj r2, 0j9 r3, 0jB r4) {
        r2.A9F("m_ts", (Long) r4.A01(r3));
        r2.A9F("top_liker_count", (Long) r4.A01(C271774jZ.A9J));
    }

    public static void A0f(0Aj r2, 0j9 r3, 0jB r4) {
        r2.A9F("media_type", (Long) r4.A01(r3));
        r2.A9F("media_index", (Long) r4.A01(C271774jZ.A5L));
    }

    public static void A0g(0Aj r2, 0j9 r3, 0jB r4) {
        r2.AAJ("parent_m_pk", (String) r4.A01(r3));
        r2.A9F("chaining_position", (Long) r4.A01(C271774jZ.A1A));
    }

    public static void A0h(0Aj r2, 0j9 r3, 0jB r4) {
        r2.A9F("m_t", (Long) r4.A01(r3));
        r2.A9F("m_ts", (Long) r4.A01(C271774jZ.A8x));
    }

    public static void A18(0Aj r2, 0jB r3, Double d, String str) {
        r2.A8D(str, d);
        r2.A8D("media_time_remaining", (Double) r3.A01(C271774jZ.A5Z));
        r2.A8D("media_time_to_load", (Double) r3.A01(C271774jZ.A5Q));
    }

    public static void A1A(0Aj r2, 0jB r3, Long l, String str) {
        r2.A9F(str, l);
        r2.A9F("media_author_id", (Long) r3.A01(C271774jZ.A5E));
    }

    public static void A1B(0Aj r2, 0jB r3, Long l, String str) {
        r2.A9F(str, l);
        r2.AAJ("follow_status", (String) r3.A01(C271774jZ.A2v));
    }

    public static void A1C(0Aj r2, 0jB r3, Long l, String str) {
        r2.A9F(str, l);
        r2.A9F("dr_ad_type", (Long) r3.A01(C271774jZ.A2J));
    }

    public static void A1D(0Aj r2, 0jB r3, Long l, String str) {
        r2.A9F(str, l);
        r2.A9F("carousel_container_media_id", (Long) r3.A01(C271774jZ.A0w));
        r2.A9F("carousel_cover_media_id_int", (Long) r3.A01(C271774jZ.A0y));
    }

    public static void A1E(0Aj r2, 0jB r3, Long l, String str) {
        r2.A9F(str, l);
        r2.A8D("tap_x_position", (Double) r3.A01(C271774jZ.A8q));
        r2.A8D("tap_y_position", (Double) r3.A01(C271774jZ.A8r));
    }

    public static void A1F(0Aj r2, 0jB r3, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("feed_request_id", (String) r3.A01(C271774jZ.A88));
        r2.AAJ("delivery_flags", (String) r3.A01(C271774jZ.A26));
        r2.A7p("is_eof", (Boolean) r3.A01(C271774jZ.A4G));
    }

    public static void A1G(0Aj r2, 0jB r3, String str, String str2) {
        r2.AAJ(str, str2);
        r2.A9F("m_ix", (Long) r3.A01(C271774jZ.A3m));
    }

    public static void A1H(0Aj r2, Long l, Object obj, String str) {
        r2.A9F(str, l);
        r2.A8D("lsp", Double.valueOf(((Number) obj).doubleValue()));
    }

    public static void A1I(0Aj r2, Object obj, int i, long j) {
        r2.A9F("session_reel_counter", Long.valueOf(j));
        r2.A8D("time", Double.valueOf(((Number) obj).doubleValue()));
        r2.A9F("tray_position", Long.valueOf((long) i));
    }

    public static void A1L(0bb r2, 0xF r3, String str) {
        r2.A06(str, r3.A05(str));
        r2.A06("headline_text_showed", r3.A05("headline_text_showed"));
    }

    public static void A1V(AbstractCollection abstractCollection, Iterator it) {
        Long valueOf = Long.valueOf(((Number) it.next()).longValue());
        abstractCollection.add(new 0eP(valueOf, valueOf));
    }

    public static void A1X(AbstractCollection abstractCollection, Iterator it) {
        String str = (String) it.next();
        abstractCollection.add(new 0eP(Long.valueOf(Long.parseLong(str)), Long.valueOf(Long.parseLong(str))));
    }

    public static void A1Y(Iterator it, Map map) {
        String str = (String) it.next();
        map.put(Long.valueOf(Long.parseLong(str)), Long.valueOf(Long.parseLong(str)));
    }

    public static void A1Z(Iterator it, Map map) {
        String str = (String) it.next();
        map.put(Long.valueOf((long) C271044ho.A00(str).ordinal()), str);
    }

    public static Object[] A1b(long[] jArr) {
        return new Object[]{Arrays.toString(jArr)};
    }
}
