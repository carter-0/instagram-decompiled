package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uxm  reason: case insensitive filesystem */
public enum C16592Uxm {
    CUSTOM_UNDERLINE("custom_underline"),
    GRADIENT_UNDERLINE("gradient_underline"),
    ROUNDED_CORNER_BACKGROUND("rounded_corner_background"),
    STORY_MENTION("story_mention"),
    STORY_HASHTAG("story_hashtag"),
    TEXT_CASE("text_case"),
    TEXT_COLOR("text_color"),
    TEXT_EMPHASIS_COORDINATOR("text_emphasis_coordinator"),
    TEXT_EMPHASIS_DIRECTIONAL("text_emphasis_directional"),
    TEXT_EMPHASIS_ELEGANT("text_emphasis_elegant"),
    TEXT_EMPHASIS_LINE("text_emphasis_line"),
    TEXT_EMPHASIS_OUTLINE("text_emphasis_outline"),
    TEXT_EMPHASIS_LITERATURE("text_emphasis_literature"),
    TEXT_EMPHASIS_MEME("text_emphasis_meme"),
    TEXT_EMPHASIS_MODERN("text_emphasis_modern"),
    TEXT_EMPHASIS_NEON("text_emphasis_neon"),
    TEXT_EMPHASIS_PAINT("text_emphasis_paint"),
    TEXT_EMPHASIS_ROUNDED_BACKGROUND("text_emphasis_rounded_background"),
    TEXT_EMPHASIS_STRONG("text_emphasis_strong"),
    TEXT_EMPHASIS_SIMPLE_BOX("text_emphasis_simple_box"),
    TEXT_FONT("text_font"),
    TEXT_FORMAT("text_format"),
    TEXT_SIZE("text_size"),
    UNKNOWN("");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16592Uxm[] uxmArr;
        A02 = 0oU.A00(uxmArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r3));
        for (C16592Uxm uxm : values()) {
            linkedHashMap.put(uxm.A00, uxm);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16592Uxm(String str) {
        this.A00 = str;
    }
}
