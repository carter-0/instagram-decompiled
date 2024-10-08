package X;

import android.content.Context;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.46i  reason: invalid class name and case insensitive filesystem */
public interface C2606046i extends C2606146j, C2606246k {
    String ACv(Context context);

    String AcV();

    User AdS();

    long AdT();

    ImageUrl AdY();

    List Adj();

    List Adk();

    OriginalAudioSubtype Ads();

    AudioType Adv();

    List Ay7();

    String BYx();

    MusicMuteAudioReason BuG();

    Integer C9r();

    boolean COy();

    boolean COz();

    boolean CP0();

    boolean CQr();

    boolean CZi(String str);

    boolean Cdd();

    boolean Ce0();

    MusicAttributionConfig Col(Context context);

    String getArtistId();

    String getAssetId();

    String getAudioAssetId();

    boolean isEligibleForAudioEffects();
}
