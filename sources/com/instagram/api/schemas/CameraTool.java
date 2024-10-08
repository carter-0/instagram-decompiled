package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

public enum CameraTool implements Parcelable {
    UNRECOGNIZED("CameraTool_unspecified"),
    ADD_YOURS("44"),
    ADD_YOURS_TEMPLATES_PRECAP("257"),
    AI_CONTEXTUAL_BACKGROUND("248"),
    AI_EXPANDER("228"),
    AI_REWRITE("250"),
    AI_REWRITE_TEXT("252"),
    AI_REWRITE_TONE("251"),
    AI_REWRITE_WITH_META_AI_INTENT("261"),
    ALIGN_MODE("15"),
    APPEARANCE_EFFECT("22"),
    AR_EFFECT("81"),
    AR_STICKERS("40"),
    ASPECT_RATIO("87"),
    AUTO_TRIM("95"),
    BACKDROP("68"),
    BOOMERANG(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    BRIGHTNESS("153"),
    CAMERA_ICON("96"),
    CAMERA_SETTING("114"),
    CAMERA_SWITCH("89"),
    CLIPS_ADD("110"),
    COLLAGE("36"),
    COLOR_FILTER("84"),
    COLOR_FILTERS("25"),
    COMMENT_PROMPTS("253"),
    CONTENT_BASED_HASHTAG_SUGGESTION("266"),
    CONTRAST("154"),
    COVER_PHOTO_ADD("123"),
    CREATE("4"),
    CREATE_MODE_FORMAT("113"),
    CREATE_MODE_RANDOM("138"),
    CREATE_MODE_SUB_FORMAT("127"),
    CRUNCHY("79"),
    CUTOUT_MONTAGE("55"),
    DANCIFICATION("37"),
    DIRECT_ADD_YOURS("49"),
    DIRECT_ROLL_CALL("50"),
    DREAMY("71"),
    DUAL("18"),
    DUAL_ON_REELS("34"),
    DURATION_15_SEC("26"),
    DURATION_30_SEC("27"),
    DURATION_60_SEC("45"),
    DURATION_90_SEC("46"),
    DURATION_SELECTOR("16"),
    EDIT_CLIP_SELECTOR("39"),
    EFFECT_SELECTOR("7"),
    FACE_DETECTOR("82"),
    FADE("157"),
    FLASH("60"),
    FLIP_CAMERA("62"),
    FUNDED_CONTENT("119"),
    GALLERY_ALBUM_PICKER("94"),
    GALLERY_CONTEXT_MENU("112"),
    GALLERY_TIMELINE_SCRUBBER("61"),
    GALLERY_TOOLBAR("58"),
    GESTURE_CONTROL("42"),
    GREEN_SCREEN("54"),
    GRID_MODE("17"),
    HANDS_FREE("2"),
    HIDE_SHARE_COUNT("260"),
    HIGHLIGHTS("158"),
    HORIZON("43"),
    IMAGE_TO_TEXT_WITH_META_AI_INTENT("278"),
    IMAGINE("224"),
    IMAGINE_BUNDLE("263"),
    IMAGINE_BUNDLE_WITH_META_AI_INTENT("262"),
    IMAGINE_ME("225"),
    IMAGINE_ME_WITH_META_AI_INTENT("265"),
    IMAGINE_WITH_META_AI_INTENT("264"),
    LAYOUT("3"),
    LAYOUT_SCALE("133"),
    LAYOUT_VARIANTS("142"),
    LIVE_AUDIENCE("23"),
    LIVE_BADGES("11"),
    LIVE_FUNDRAISER("10"),
    LIVE_GAMES("76"),
    LIVE_INTERNAL("9"),
    LIVE_PHOTO_OFF("59"),
    LIVE_PHOTO_ON("57"),
    LIVE_PROMPTS("66"),
    LIVE_SCHEDULING("33"),
    LIVE_SHOPPING("30"),
    LIVE_SUBSCRIBE("41"),
    LIVE_TITLE("12"),
    LIVE_TRIVIA("64"),
    LIVE_VIDEO_TOGGLE("31"),
    MAGICMOD_BUNDLE("77"),
    MEME_HUB("249"),
    MEMU_IN_FEED("272"),
    MEMU_IN_FEED_WITH_MIMICRY("277"),
    MONTAGE("35"),
    MOTION_FILTER("28"),
    MULTICAPTURE("21"),
    MUSIC_ARTIST("98"),
    MUSIC_BROWSER("88"),
    MUSIC_BROWSER_VOLUME("131"),
    MUSIC_CHANGE("125"),
    MUSIC_SAVED_AUDIO_TAB("109"),
    MUSIC_SAVE_TO_CAMERA("129"),
    MUSIC_SELECTOR("32"),
    MUTE("8"),
    NO_FILTER("80"),
    OCULUS("65"),
    PHOTOBOOTH("29"),
    PHOTO_DUMP("63"),
    POSES("6"),
    PROFILE_COVER_PHOTO_CROP("126"),
    PROMPT_PICKER("121"),
    RADIO("78"),
    RECIPIENT_PICKER("92"),
    REMIX_AUDIO("20"),
    REMIX_LAYOUT("19"),
    REORDER("122"),
    RESTYLE("67"),
    RETAKE("147"),
    ROLL_CALL("48"),
    ROLL_CALL_DIRECT("148"),
    SATURATION("156"),
    SCALE("56"),
    SCALE_MODE("146"),
    SELECT_FORMAT("107"),
    SELECT_SEGMENT("102"),
    SETTING_CLIPS_TO_FEED("106"),
    SETTING_CONTROL("139"),
    SETTING_HIDE_USER("101"),
    SETTING_PRELOAD("103"),
    SETTING_RECOMMEND_ON_FB("140"),
    SETTING_SAVE_TO_CAMERA_ROLL("136"),
    SETTING_SHARE_TO_FB_ACCESS("128"),
    SETTING_SHARE_TO_FB_SELECT("134"),
    SETTING_SHARE_TO_FEED_UNSELECT("132"),
    SETTING_UNHIDE_USER("100"),
    SHADOWS("159"),
    SHARE_SHEET_INTEREST_TOPIC_SELECT("120"),
    SHARE_SHEET_INTEREST_TOPIC_UNSELECT("135"),
    SHARE_TO_FB_OPTION("105"),
    SHARE_TO_FB_PRIMER("124"),
    SHARE_TO_FB_TOGGLE_SHARE_TYPE("141"),
    SHARPEN("161"),
    SLOWED("70"),
    SMART_TRACKING("51"),
    SOUND_SYNC("38"),
    SOUND_SYNC_LAYOUT_EFFECT("152"),
    SPED_UP("72"),
    SPEED_SELECTOR("13"),
    SPEED_SLIDER("143"),
    SPINS_CREATIVE_TOOL_TOGGLE("256"),
    SPINS_TOGGLE("255"),
    SPLIT("151"),
    STACKED_TIMELINE_ENTER("111"),
    STICKER("86"),
    STICKER_TRAY("85"),
    STOP_MOTION("144"),
    SUGGESTED_AUDIO_PILL("258"),
    SUGGESTED_AUDIO_PILL_ADD("259"),
    SUPERZOOM("5"),
    SWIRL("73"),
    TAG_ANOTHER_PERSON("115"),
    TAG_PERSON("116"),
    TAP_TO_CUT("53"),
    TEMPERATURE("155"),
    TEMPLATES("47"),
    TEMPLATE_BROWSER("130"),
    TEMP_CAMERA_TOOL("91"),
    TEMP_FEED_ALBUM_SELECT("117"),
    TEMP_FEED_GALLERY_ALBUM_PICKER("118"),
    TEMP_SHARE_SHEET_ENTITY("99"),
    TEXT_ALIGNMENT("108"),
    TEXT_ANIMATION("104"),
    TEXT_COLOR("93"),
    TEXT_COLOR_EDIT("149"),
    TEXT_EFFECT("90"),
    TEXT_FORMAT("83"),
    TEXT_FORMAT_EDIT("150"),
    THIRD_PARTY_MEDIA("75"),
    TIMER_SELECTOR("14"),
    TRIAL("254"),
    TRIM("97"),
    VIDEO_HIGHTLIGHTS_DETECTION("52"),
    VIDEO_LAYOUT("24"),
    VIDEO_LAYOUT_VARIANTS("145"),
    VIDEO_LENGTH_TOGGLE("137"),
    VIGNETTE("160"),
    VINYL("74"),
    WAND("69");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        CameraTool[] cameraToolArr;
        A02 = 0oU.A00(cameraToolArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (CameraTool cameraTool : values()) {
            linkedHashMap.put(cameraTool.A00, cameraTool);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(64);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CameraTool(String str) {
        this.A00 = str;
    }
}
