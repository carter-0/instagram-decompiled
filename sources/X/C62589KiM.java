package X;

import java.util.HashMap;

/* renamed from: X.KiM  reason: case insensitive filesystem */
public enum C62589KiM {
    POSTS("posts_archive", 2131969682, "archive_feed"),
    STORY("stories_archive", 2131974252, "archive_stories"),
    LIVE("live_archive", 2131965136, "archive_live"),
    QUICK_SNAP("quick_snap_archive", 2131971086, "archive_quick_snap");
    
    public static final HashMap A03 = null;
    public final int A00;
    public final String A01;
    public final String A02;

    /* access modifiers changed from: public */
    static {
        C62589KiM[] kiMArr;
        A04 = 0oU.A00(kiMArr);
        A03 = AnonymousClass7TE.A1E();
        for (C62589KiM kiM : values()) {
            A03.put(kiM.A01, kiM);
        }
    }

    /* access modifiers changed from: public */
    C62589KiM(String str, int i, String str2) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
    }
}
