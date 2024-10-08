package X;

import java.util.Map;

/* renamed from: X.Uz5  reason: case insensitive filesystem */
public enum C16669Uz5 {
    LIVE("live_viewer"),
    STORY("story"),
    STORY_AND_LIVE("story_and_live"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C16669Uz5 uz5;
        C16669Uz5 uz52;
        C16669Uz5 uz53;
        C16669Uz5[] uz5Arr;
        A02 = 0oU.A00(uz5Arr);
        A01 = DbY.A0q("story_and_live", uz53, new 0eP("live_viewer", uz5), new 0eP("story", uz52));
    }

    public final String toString() {
        return 002.A0R("QuestionSource: ", this.A00);
    }

    /* access modifiers changed from: public */
    C16669Uz5(String str) {
        this.A00 = str;
    }
}
