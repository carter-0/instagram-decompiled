package X;

import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.UzD  reason: case insensitive filesystem */
public enum C16677UzD {
    MEDIA(RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    COMMENT("2"),
    DIRECT_MESSAGE("3"),
    DIRECT_MESSAGE_THREAD("4"),
    USER("5"),
    PRODUCT("6"),
    AD("7"),
    HASHTAG("8"),
    COWATCH_LOCAL_MEDIA("9"),
    STORY_QUESTION_RESPONSE("10"),
    STORY_HIGHLIGHT_COVER("11"),
    AR_EFFECT("12"),
    SONG("13"),
    FUNDRAISER("14"),
    GUIDE("15"),
    FRX_OBJECT("16"),
    ROOM("17"),
    ENCRYPTED_DIRECT_MESSAGE("18"),
    LIVE_QUESTION("19"),
    SERVICES("20"),
    COMMERCE_FB_REVIEW("21"),
    COMMERCE_IG_REVIEW("22"),
    COMMERCE_REVIEW_RESPONSE("23"),
    COMMERCE_FB_QUESTION("24"),
    COMMERCE_IG_QUESTION("25"),
    COMMERCE_PLATFORM_ANSWER("26"),
    COMMERCE_EXTERNAL_QUESTION("27"),
    COMMERCE_EXTERNAL_ANSWER("28"),
    CLEAR_HISTORY_WABAM("29"),
    LOCATION_PAGE("30"),
    CANVAS("31"),
    PROMPT("32"),
    NOTE("36"),
    IGD_PROMPT("37"),
    IGD_PROMPT_RESPONSE("38"),
    THIRD_PARTY_APP("39"),
    IGD_SHARED_STACK_SINGLE_ATTACHMENT("40"),
    IG_GENERATED_CONTENT("41"),
    IG_REUSE_TEXT("42"),
    IG_EVENT("43"),
    IG_GEN_AI_MAGIC_MOD("44"),
    IG_TEXT_APP_KEYWORD("45"),
    GEN_AI_RETEXTURING("47"),
    IG_COLLECTION("48"),
    GEN_AI_UGC("49"),
    THREAD_THEME("50"),
    FEDI_POST("51"),
    FEDI_USER("52"),
    WORLD_PAGES("53");
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C16677UzD[] uzDArr;
        A01 = 0oU.A00(uzDArr);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C16677UzD(String str) {
        this.A00 = str;
    }
}
