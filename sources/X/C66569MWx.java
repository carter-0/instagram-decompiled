package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;
import java.util.List;

/* renamed from: X.MWx  reason: case insensitive filesystem */
public interface C66569MWx {
    boolean ABC();

    String Aab();

    AnonymousClass8IJ Adb();

    ImageUrl As3();

    ImageUrl As5();

    String Axe();

    String Ay9();

    List BDX();

    MusicDataSource BUq();

    String BfO();

    String C94();

    int C95();

    String C9F();

    Integer C9r();

    AudioType CAc();

    boolean CK6();

    boolean CRQ();

    boolean CSR();

    boolean Cdd();

    void EOL(String str);

    void EP7(AnonymousClass8IJ r1);

    String getArtistId();

    String getAudioClusterId();

    String getDisplayArtist();

    String getFormattedClipsMediaCount();

    String getId();

    String getTitle();

    boolean isBookmarked();

    boolean isEligibleForAudioEffects();

    boolean isExplicit();

    static void A00(0Aj r2, C66569MWx mWx) {
        r2.AAJ("song_name", mWx.getTitle());
    }

    static void A01(0Aj r2, C66569MWx mWx) {
        r2.A9F("audio_cluster_id", 2AL.A08(mWx.getAudioClusterId()));
        r2.AAJ("audio_type", mWx.CAc().A00);
    }

    static void A02(0Aj r2, C66569MWx mWx) {
        r2.A7p("is_bookmarked", Boolean.valueOf(mWx.isBookmarked()));
    }

    static void A03(0Aj r2, C66569MWx mWx) {
        r2.AAJ("artist_name", mWx.getDisplayArtist());
    }

    static void A04(0Aj r2, C66569MWx mWx, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("alacorn_session_id", mWx.Aab());
    }
}
