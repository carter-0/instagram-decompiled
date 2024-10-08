package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uxc  reason: case insensitive filesystem */
public enum C16582Uxc {
    SIMPLE("simple"),
    SIMPLE_LINE("simple_line"),
    SIMPLE_LINE_WORD_EMPHASIS("simple_line_word_emphasis"),
    DYNAMIC_SIMPLE_LINE("dynamic_simple_line"),
    DYNAMIC_REVEAL("dynamic_reveal"),
    TYPEWRITER("typewriter"),
    CUBE_REVEAL("cube_reveal"),
    KARAOKE("karaoke"),
    ALBUM_ART("album_art");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16582Uxc[] uxcArr;
        A02 = 0oU.A00(uxcArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16582Uxc uxc : values()) {
            linkedHashMap.put(uxc.A00, uxc);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16582Uxc(String str) {
        this.A00 = str;
    }
}
