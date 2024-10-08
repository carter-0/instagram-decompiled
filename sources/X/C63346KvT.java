package X;

import com.instagram.music.common.model.InstagramAudioApplySource;

/* renamed from: X.KvT  reason: case insensitive filesystem */
public abstract class C63346KvT {
    public static final InstagramAudioApplySource A00(String str) {
        0qQ.A0B(str, 0);
        try {
            switch (Integer.parseInt(str)) {
                case 1:
                    return InstagramAudioApplySource.ARTIST_SPOTLIGHT;
                case 2:
                    return InstagramAudioApplySource.PLAYLISTS;
                case 3:
                    return InstagramAudioApplySource.SAVED;
                case 4:
                    return InstagramAudioApplySource.SEARCH;
                case 5:
                    return InstagramAudioApplySource.THIRD_PARTY_APP;
                case 6:
                    return InstagramAudioApplySource.SPOTIFY_PLAYLIST;
                default:
                    return null;
            }
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
