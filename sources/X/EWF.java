package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

public enum EWF {
    USER(PublicKeyCredentialControllerUtility.JSON_KEY_USER),
    LIKE_COUNT_CHRONO("like_count_chrono"),
    FOLLOW_COUNT_CHRONO("follow_count_chrono"),
    COMMENT_LIKE_COUNT_CHRONO("comment_like_count_chrono"),
    COMMENT_COUNT("comment_count"),
    LOCATION("location"),
    PHOTOMAP("photomap"),
    HASHTAG("hashtag"),
    TAG("tag"),
    MENTION("mention"),
    STORY_VIEWER_LIST("story_viewer_list"),
    PROFILE_IMAGE_DESTINATION("profile_image_destination");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        EWF[] ewfArr;
        A02 = 0oU.A00(ewfArr);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        for (EWF ewf : values()) {
            A1H.put(ewf.A00, ewf);
        }
        A01 = A1H;
    }

    /* access modifiers changed from: public */
    EWF(String str) {
        this.A00 = str;
    }
}
