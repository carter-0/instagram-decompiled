package X;

import com.instagram.android.R;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6KJ  reason: invalid class name */
public enum AnonymousClass6KJ {
    MUSIC_OVERLAY_SIMPLE(R.drawable.instagram_music_sticker_overlay_small_art, 2131967881, "music_overlay_simple"),
    MUSIC_OVERLAY_ALBUM_ART(R.drawable.instagram_music_sticker_overlay_large_art, 2131967878, "music_overlay_album_art"),
    LYRICS_KARAOKE(R.drawable.instagram_music_sticker_lyrics_karaoke, 2131967877, "lyrics_karaoke"),
    LYRICS_CUBE_REVEAL(R.drawable.instagram_music_sticker_lyrics_cube_reveal, 2131967875, "lyrics_cube_reveal"),
    LYRICS_DYNAMIC_REVEAL(R.drawable.instagram_music_sticker_lyrics_dynamic_reveal, 2131967876, "lyrics_dynamic_reveal"),
    LYRICS_TYPEWRITER(R.drawable.instagram_music_sticker_lyrics_typewriter, 2131967882, "lyrics_typewriter"),
    LYRICS_LINE_BY_LINE_CUBE_REVEAL(R.drawable.instagram_music_sticker_lyrics_karaoke, 2131967879, "lyrics_line_by_line_cube_reveal"),
    MUSIC_ONLY(R.drawable.instagram_block_pano_filled_24, 2131967880, "music_only"),
    MUSIC_VINYL(R.drawable.new_music_icon_sticker_new_music_icon_sticker_selected, 2131967883, "music_vinyl"),
    HIDDEN(-1, -1, "music_hidden"),
    UNKNOWN(-1, -1, "unknown"),
    SMALL_ART_SOLID(-1, -1, "music_small_art_solid"),
    SMALL_ART_FROSTED(-1, -1, "music_small_art_frosted"),
    LARGE_ART_ALBUM(-1, -1, "music_large_art_album");
    
    public static final Map A03 = null;
    public final int A00;
    public final int A01;
    public final String A02;

    /* access modifiers changed from: public */
    static {
        AnonymousClass6KJ[] r0;
        A04 = 0oU.A00(r0);
        A03 = new HashMap();
        for (AnonymousClass6KJ r2 : values()) {
            A03.put(r2.A02, r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass6KJ(int i, int i2, String str) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public final AnonymousClass6KJ A00() {
        switch (ordinal()) {
            case 9:
                return MUSIC_ONLY;
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return MUSIC_OVERLAY_SIMPLE;
            case 13:
                return MUSIC_OVERLAY_ALBUM_ART;
            default:
                return this;
        }
    }

    public final String A01() {
        switch (ordinal()) {
            case 0:
                return "music_overlay_sticker_simple";
            case 1:
                return "music_overlay_sticker_album_art";
            case 2:
                return "music_overlay_sticker_lyrics_karaoke";
            case 3:
                return "music_overlay_sticker_lyrics_cube_reveal";
            case 4:
                return "music_overlay_sticker_lyrics_dynamic_reveal";
            case 5:
                return "music_overlay_sticker_lyrics_typewriter";
            case 6:
                return "music_overlay_sticker_lyrics_line_by_line_cube_reveal";
            case 7:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
                throw new IllegalStateException("The display type is not mapped to a valid sticker id");
            case 8:
                return "music_overlay_sticker_vinyl";
            default:
                throw new RuntimeException();
        }
    }

    public final boolean A02() {
        int ordinal = ordinal();
        if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5 || ordinal == 6) {
            return true;
        }
        return false;
    }
}
