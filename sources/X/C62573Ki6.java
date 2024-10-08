package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ki6  reason: case insensitive filesystem */
public enum C62573Ki6 {
    ADS("ads"),
    FOLLOWING("following"),
    EXPLORE("explore"),
    POPULAR("popular"),
    USER(PublicKeyCredentialControllerUtility.JSON_KEY_USER),
    USER_VIDEO("uservideo"),
    USER_MOST_VIEWED("usermostviewed"),
    USER_POST_LIVES_ONLY("userpostlives"),
    SINGLE_MEDIA("single_media"),
    CHAINING("chaining"),
    SEARCH_MEDIA_CHAINING("searchmediachaining"),
    SERIES("series"),
    EMPTY_PLACEHOLDER("empty_placeholder"),
    HASHTAG("hashtag"),
    SAVED("saved"),
    SHOPPING("shopping"),
    TOPIC("topical"),
    WATCHED("continue_watching"),
    LIVE("live"),
    POST_LIVE("post_live"),
    A0B(NetInfoModule.CONNECTION_TYPE_NONE),
    UNRECOGNIZED("unrecognized");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62573Ki6[] ki6Arr;
        A02 = 0oU.A00(ki6Arr);
        LinkedHashMap A0x = DbS.A0x(DbY.A00(r4));
        for (C62573Ki6 ki6 : values()) {
            A0x.put(ki6.A00, ki6);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C62573Ki6(String str) {
        this.A00 = str;
    }
}
