package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uxf  reason: case insensitive filesystem */
public enum C16585Uxf {
    MUSIC_OVERLAY_SIMPLE("music_overlay_simple"),
    MUSIC_OVERLAY_ALBUM_ART("music_overlay_album_art"),
    LYRICS_KARAOKE("lyrics_karaoke"),
    LYRICS_CUBE_REVEAL("lyrics_cube_reveal"),
    LYRICS_DYNAMIC_REVEAL("lyrics_dynamic_reveal"),
    LYRICS_TYPEWRITER("lyrics_typewriter"),
    LYRICS_LINE_BY_LINE_CUBE_REVEAL("lyrics_line_by_line_cube_reveal"),
    MUSIC_ONLY("music_only"),
    MUSIC_HIDDEN("music_hidden"),
    SIMPLE_LINE("simple_line"),
    SIMPLE_LINE_WORD_EMPHASIS("simple_line_word_emphasis"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16585Uxf[] uxfArr;
        A02 = 0oU.A00(uxfArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r4));
        for (C16585Uxf uxf : values()) {
            linkedHashMap.put(uxf.A00, uxf);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16585Uxf(String str) {
        this.A00 = str;
    }
}
