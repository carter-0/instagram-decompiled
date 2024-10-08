package X;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.87I  reason: invalid class name */
public enum AnonymousClass87I {
    UNKNOWN("UNKNOWN"),
    TYPE(CredentialProviderBaseController.TYPE_TAG),
    AR_EFFECT("AR_EFFECT"),
    GROUPPOLL("GROUP_POLL"),
    POLL("POLL"),
    QUESTIONS("QUESTIONS"),
    QUIZ("QUIZ"),
    COUNTDOWN("COUNTDOWN"),
    SHOUTOUT("CARDS"),
    MEMORIES("MEMORIES"),
    BOOMERANG("BOOMERANG"),
    HANDSFREE("HANDSFREE"),
    MUSIC("MUSIC"),
    LAYOUT("LAYOUT"),
    STOPMOTION("STOPMOTION"),
    CLIPS("CLIPS"),
    CLIPS_TRANSITION("CLIPS_TRANSITION"),
    GIFS("GIFS"),
    TEMPLATES("TEMPLATES"),
    MENTIONS("MENTIONS"),
    FUNDRAISER("FUNDRAISER"),
    ELECTIONS("ELECTIONS"),
    DISCOVERY_SURFACE("DISCOVERY_SURFACE"),
    LOADING_AR_EFFECT("LOADING_AR_EFFECT"),
    AVATAR_EFFECT("AVATAR_EFFECT"),
    AVATAR_PRESET("AVATAR_PRESET"),
    AVATAR_PLACEHOLDER("AVATAR_PLACEHOLDER"),
    AVATAR_BACKGROUND("AVATAR_BACKGROUND"),
    EMPTY_AVATAR_BACKGROUND("EMPTY_AVATAR_BACKGROUND"),
    SUPPORT_PERSONALIZED_ADS("SUPPORT_PERSONALIZED_ADS"),
    FILTER("FILTER"),
    END_OF_YEAR("END_OF_YEAR"),
    GARMENT("GARMENT"),
    EMPTY("EMPTY"),
    BIRTHDAY_HIGHLIGHTS("BIRTHDAY_HIGHLIGHTS"),
    SUPERLATIVE("SUPERLATIVE"),
    QUICK_SNAP_CLOSE_FRIENDS_AUDIENCE("QUICK_SNAP_CLOSE_FRIENDS_AUDIENCE"),
    QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT("QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT"),
    QUICK_SNAP_AUDIENCE_MEMBER("QUICK_SNAP_AUDIENCE_MEMBER"),
    QUICK_SNAP_AUDIENCE_LIST("QUICK_SNAP_AUDIENCE_LIST");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass87I[] r4;
        A02 = 0oU.A00(r4);
        int A0L = 0se.A0L(r5);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass87I r3 : values()) {
            String upperCase = r3.A00.toUpperCase(Locale.ROOT);
            0qQ.A07(upperCase);
            linkedHashMap.put(upperCase, r3);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    AnonymousClass87I(String str) {
        this.A00 = str;
    }
}
