package X;

import com.instagram.music.common.model.AudioType;

/* renamed from: X.HbU  reason: case insensitive filesystem */
public abstract class C55059HbU {
    public static final HOL A00(AudioType audioType) {
        if (audioType == null) {
            return null;
        }
        int ordinal = audioType.ordinal();
        if (ordinal == 1) {
            return HOL.ORIGINAL;
        }
        if (ordinal == 0) {
            return HOL.SONG;
        }
        return null;
    }
}
