package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxF  reason: case insensitive filesystem */
public enum C16563UxF {
    UNKNOWN("unknown"),
    PRE_RELEASE("pre_release"),
    NEW_RELEASE("new_release"),
    SPOTIFY_PLAYLIST_AS_SPOTLIGHT_BANNER_SONG("spotify_playlist_as_spotlight_banner_song");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16563UxF[] uxFArr;
        A02 = 0oU.A00(uxFArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16563UxF uxF : values()) {
            linkedHashMap.put(uxF.A00, uxF);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16563UxF(String str) {
        this.A00 = str;
    }
}
