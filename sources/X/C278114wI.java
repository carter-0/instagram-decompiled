package X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.4wI  reason: invalid class name and case insensitive filesystem */
public enum C278114wI {
    ACTIVE(AppStateModule.APP_STATE_ACTIVE),
    INTERRUPTED("interrupted"),
    STOPPED("stopped"),
    HARD_STOPPED("hard_stop"),
    POST_LIVE("post_live"),
    POST_LIVE_POSTING("post_live_posting"),
    POST_LIVE_POSTING_FAILED("post_live_posting_failed"),
    POST_LIVE_POSTING_INITIATED("post_live_posting_initiated"),
    POST_LIVE_POST_REQUEST_FAILED("post_live_post_request_failed"),
    HIDDEN("hidden"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C278114wI[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r5);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C278114wI r2 : values()) {
            String lowerCase = r2.A00.toLowerCase(Locale.ROOT);
            0qQ.A07(lowerCase);
            linkedHashMap.put(lowerCase, r2);
        }
        A01 = linkedHashMap;
    }

    public final boolean A00() {
        if (this == ACTIVE || this == INTERRUPTED || this == HIDDEN) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        if (this == POST_LIVE || this == POST_LIVE_POSTING || this == POST_LIVE_POSTING_FAILED || this == POST_LIVE_POSTING_INITIATED || this == POST_LIVE_POST_REQUEST_FAILED) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C278114wI(String str) {
        this.A00 = str;
    }
}
