package X;

import com.instagram.android.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Uy5  reason: case insensitive filesystem */
public enum C16609Uy5 {
    SIMPLE_LINE(R.drawable.instagram_icons_exceptions_captions_simple_1_filled_68, 2131964537, "simple_line"),
    DYNAMIC_SIMPLE_LINE(R.drawable.instagram_icons_exceptions_captions_simple_2_filled_68, 2131964537, "simple_line_word_emphasis"),
    DYNAMIC_REVEAL(R.drawable.instagram_music_sticker_lyrics_dynamic_reveal, 2131964538, "dynamic_reveal"),
    TYPEWRITER(R.drawable.instagram_music_sticker_lyrics_typewriter, 2131964547, "typewriter"),
    CUBE_REVEAL(R.drawable.instagram_music_sticker_lyrics_cube_reveal, 2131964537, "cube_reveal"),
    KARAOKE(R.drawable.instagram_music_sticker_lyrics_karaoke, 2131964540, "karaoke");
    
    public static final Map A03 = null;
    public final int A00;
    public final int A01;
    public final String A02;

    /* access modifiers changed from: public */
    static {
        C16609Uy5[] uy5Arr;
        A04 = 0oU.A00(uy5Arr);
        A03 = new HashMap();
        for (C16609Uy5 uy5 : values()) {
            A03.put(uy5.A02, uy5);
        }
    }

    /* access modifiers changed from: public */
    C16609Uy5(int i, int i2, String str) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }
}
