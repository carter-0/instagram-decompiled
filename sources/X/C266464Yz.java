package X;

import java.util.Locale;
import org.webrtc.CameraCapturer;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.4Yz  reason: invalid class name and case insensitive filesystem */
public enum C266464Yz {
    A1Y("UNKNOWN", 0, 0),
    A1A("RESPONSE_CODE_302", 1, 302),
    A1B("RESPONSE_CODE_403", 2, 403),
    A1C("RESPONSE_CODE_404", 3, 404),
    A1D("RESPONSE_CODE_410", 4, 410),
    A1E("RESPONSE_CODE_417_FAILEOVER", 5, 417),
    A1F("RESPONSE_CODE_429", 6, 429),
    A1G("RESPONSE_CODE_500", 7, CameraCapturer.OPEN_CAMERA_DELAY_MS),
    A1H("RESPONSE_CODE_502", 8, 502),
    A1I("RESPONSE_CODE_503", 9, 503),
    A1J("RESPONSE_CODE_504", 10, 504),
    A0e("INVALID_VIDEO_SOURCE", 11, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS),
    A0K("DEAD_PLAYER_SERVICE", 12, 2001),
    A1b("VIDEO_BIND_ERROR", 13, 2003),
    A0S("FAILOVER_STREAM_DRY", 14, 2006),
    A0j("LOCAL_SOCKET_NO_CONNECTION", 15, 2007),
    A0c("INVALID_REPLICA_NUMBER", 16, 2008),
    A0P("ERROR_IO", 17, 2009),
    A0H("CODEC_INITIALIZATION_ERROR", 18, 2010),
    A14("PLAYBACK_EXCEPTION", 19, 2011),
    A1X("TIGON_LIGER_ERROR", 20, 2012),
    A1W("TIGON_IDLE_TIMEOUT", 21, 2013),
    A1V("TIGON_CONNECTION_TIMEOUT", 22, 2014),
    A0k("MALFORMED_AUDIO", 23, 2015),
    A0B("BUILD_RENDERER_FAILED", 24, 2016),
    A0D("CANT_FIND_VIDEO_SOURCE", 25, 2017),
    A16("PLAYER_RELEASED_WHILE_PLAYING", 26, 2018),
    A1c("ZERO_AUDIO_VIDEO_BITRATE", 27, 2019),
    A0q("MANIFEST_REFRESH_BACKWARDS", 28, 2020),
    A0p("MANIFEST_PARSE_ERROR", 29, 2021),
    A0V("FALL_BACK_TO_PROGRESSIVE", 30, 2022),
    A1a("USE_DEFAULT_CACHE_SETTING", 31, 2023),
    A0U("FALL_BACK_TO_APACHE", 32, 2024),
    A0b("INCORRECT_OVERFETCH", 33, 2025),
    A11("OPEN_CACHE_EXCEPTION", 34, 2026),
    A1Z("UNSUPPORTED_DRM_EXCEPTION", 35, 2027),
    A0E("CANT_INITIALIZE_DRM_WITH_MANIFEST", 36, 2028),
    A0F("CANT_INITIALIZE_DRM_WITH_NO_MANIFEST", 37, 2029),
    A0y("NO_VALID_VIDEO_REPRESENTATION", 38, 2030),
    A0N("DYNAMIC_MANIFEST_FOR_VOD", 39, 2031),
    A0z("NO_VALID_VIDEO_REPRESENTATION_FALLBACK_PROGRESSIVE", 40, 2032),
    A03("ALL_VALID_VIDEO_REPRESENTATION_FILTERED_OUT", 41, 2033),
    A0i("LIVE_START_WITH_STATIC_MANIFEST", 42, 2034),
    A0d("INVALID_SEGMENT_INFO", 43, 2035),
    A0C("CANT_ACQUIRE_AUDIO_FOCUS", 44, 2038),
    A0G("CANT_RELEASE_AUDIO_FOCUS", 45, 2039),
    A09("AV1_INSTANTIATION", 46, C249703kE.FLAG_MOVED),
    A0w("NO_PLAYER", 47, 2049),
    A1Q("SURFACE_NOT_UPDATED_AFTER_PLAY", 48, 2050),
    A0o("MANIFEST_MISSING_PREFETCH_SEGMENT_RANGE", 49, 2051),
    A1S("SURFACE_NOT_UPDATED_AFTER_PLAY_WITH_REUSE", 50, 2052),
    A1R("SURFACE_NOT_UPDATED_AFTER_PLAY_REUSE_RETURN", 51, 2053),
    A0x("NO_PLAYER_SERVICE", 52, 2055),
    A1K("SKIP_CACHE", 53, 2056),
    A05("AUDIO_TRACK_INIT_FAILED", 54, 2057),
    A12("PARENT_OF_PLAYER_VIEW_INCONSISTENT", 55, 2058),
    A1T("SURFACE_TEXTURE_VIEW_ATTACHED_UNEXPECTEDLY", 56, 2059),
    A1U("SURFACE_TEXTURE_WAS_RELEASED_UNEXPECTEDLY", 57, 2060),
    A19("RESET_INTERNAL_REQUESTED_AFTER_RELEASED", 58, 2061),
    A08("AUDIO_TRACK_UPDATED_TOO_FREQUENTLY", 59, 2062),
    A0l("MANIFEST_GAPS_RECEIVED_MORE_THAN_EXPECTED", 60, 2063),
    A0r("MANIFEST_REPRESENTATION_FORMAT_MISMATCH", 61, 2064),
    A0a("ILLEGAL_STATE_EXCEPTION", 62, 2065),
    A04("ATOM_PARSE_EXCEPTION", 63, 2066),
    A0A("BIND_VIDEO_STATE_ERROR", 64, 2067),
    A0h("LIVE_NULL_SOURCE_URI", 65, 2068),
    A17("PLAYER_VIEW_NOT_ATTACHED", 66, 2069),
    A0J("COVER_IMAGE_VISIBLE_WHILE_PLAYING", 67, 2070),
    A06("AUDIO_TRACK_INIT_FAILED_VIDEO_ONLY_FALLBACK", 68, 2071),
    A0Z("HERO_SERVICE_ERROR", 69, 2072),
    A1L("SKIP_PAUSE", 70, 2073),
    A0g("LIVE_BROADCAST_INTERRUPT", 71, 2074),
    A0L("DOUBLE_BIND", 72, 2075),
    A0M("DOUBLE_BIND_WHILE_PLAYING", 73, 2076),
    A0W("GROOT_SKIP_ATTACH", 74, 2078),
    A0Y("GROOT_SKIP_PLAY", 75, 2079),
    A0X("GROOT_SKIP_DETACH", 76, 2080),
    A0O("EMSG_JSON_PARSE_FAIL", 77, 2081),
    A0R("EXCESSIVE_URI_REDIRECTS", 78, 2082),
    A0s("MANIFEST_TEXT_ADAPTATION_SET_NOT_FOUND", 79, 2083),
    A1O("SUBTITLE_PLUGIN_ADAPTER_ERROR", 80, 2084),
    A0T("FALLBACK_TRIGGERED", 81, 2085),
    A0m("MANIFEST_MISALIGNED", 82, 2086),
    A07("AUDIO_TRACK_SILENT", 83, 2087),
    A0f("IN_STREAM_ADS_EMSG_DISPLAY", 84, 2089),
    A0I("CONTENT_NOT_AVAILABLE", 85, 2090),
    A18("PREFETCH_TAG_BLOCKED", 86, 2091),
    A0u("MIXED_CODEC_MANIFEST", 87, 2092),
    A10("NULL_MEDIA_SOURCE", 88, 2093),
    A13("PAUSED_AUTO_PLAY", 89, 2094),
    A1P("SURFACEVIEW_SURFACE_WAS_RELEASED_UNEXPECTEDLY", 90, 2095),
    A0n("MANIFEST_MISSING_MINIMAL_PREFETCH_SEGMENT_RANGE", 91, 2096),
    A0Q("EXCESSIVE_LOOPING", 92, 2097),
    A0t("MEDIA_CODEC_RENDERER_SUPPORT_FORMAT_CHANGE", 93, 2098),
    A0v("NOT_ENFORCING_AUDIO", 94, 2099),
    A1M("SMART_PLAYER_BATTERY_CONSTRAINT", 95, 2100),
    A1N("SMART_PLAYER_THERMAL_CONSTRAINT", 96, 2101),
    A15("PLAYER_EXTERNAL_ERROR", 97, 2102);
    
    public final int A00;
    public final AnonymousClass4Z1 A01;

    /* access modifiers changed from: public */
    C266464Yz(String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = new AnonymousClass4Z1(r3, r4, name().toLowerCase(Locale.US));
    }

    public static C266464Yz A00(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException | NullPointerException unused) {
            return A1Y;
        }
    }
}
