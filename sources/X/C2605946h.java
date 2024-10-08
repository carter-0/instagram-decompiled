package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.46h  reason: invalid class name and case insensitive filesystem */
public final class C2605946h implements C2606046i {
    public final MusicInfo A00;
    public final AudioType A01 = AudioType.MUSIC;

    public final boolean CQr() {
        return false;
    }

    public final boolean CZi(String str) {
        return true;
    }

    public final String ACv(Context context) {
        String title = this.A00.BUk().getTitle();
        if (title == null) {
            return "";
        }
        return title;
    }

    public final User AdS() {
        return this.A00.BUp().BEv();
    }

    public final ImageUrl AdY() {
        return this.A00.BUk().Arr();
    }

    public final List Adj() {
        return 0sn.A00;
    }

    public final List Adk() {
        return 0sn.A00;
    }

    public final OriginalAudioSubtype Ads() {
        return OriginalAudioSubtype.A05;
    }

    public final AudioType Adv() {
        return this.A01;
    }

    public final List Ay7() {
        return this.A00.BUp().Ay7();
    }

    public final MusicDataSource BUq() {
        MusicInfo musicInfo = this.A00;
        return new MusicDataSource((Uri) null, this.A01, musicInfo.BUk().getProgressiveDownloadUrl(), musicInfo.BUk().getDashManifest(), getAssetId(), getArtistId());
    }

    public final String BYx() {
        return null;
    }

    public final MusicMuteAudioReason BuG() {
        return this.A00.BUp().BuG();
    }

    public final Integer C9r() {
        return this.A00.BUp().C9r();
    }

    public final boolean COz() {
        Boolean CPZ = this.A00.BUp().CPZ();
        if (CPZ != null) {
            return CPZ.booleanValue();
        }
        return false;
    }

    public final boolean CP0() {
        return this.A00.BUk().isExplicit();
    }

    public final boolean Cdd() {
        Boolean Cde = this.A00.BUp().Cde();
        if (Cde != null) {
            return Cde.booleanValue();
        }
        return false;
    }

    public final boolean Ce0() {
        Boolean Ab6 = this.A00.BUp().Ab6();
        if (Ab6 != null) {
            return Ab6.booleanValue();
        }
        return false;
    }

    public final MusicAttributionConfig Col(Context context) {
        int i;
        MusicAssetModel musicAssetModel;
        List BDX;
        MusicInfo musicInfo = this.A00;
        Number AdU = musicInfo.BUp().AdU();
        boolean z = false;
        if (AdU == null && ((BDX = musicInfo.BUk().BDX()) == null || (AdU = (Number) 00k.A0O(BDX, 0)) == null)) {
            i = 0;
        } else {
            i = AdU.intValue();
        }
        TrackData BUk = musicInfo.BUk();
        if (BUk != null) {
            musicAssetModel = MusicAssetModel.A01(BUk, false);
        } else {
            musicAssetModel = null;
        }
        boolean Esc = Esc();
        String shouldMuteAudioReason = musicInfo.BUp().getShouldMuteAudioReason();
        Boolean Ab6 = musicInfo.BUp().Ab6();
        if (Ab6 != null) {
            z = Ab6.booleanValue();
        }
        return new MusicAttributionConfig((AudioFilterType) null, musicAssetModel, (String) null, shouldMuteAudioReason, i, Esc, z);
    }

    public final boolean Esc() {
        return this.A00.BUp().getShouldMuteAudio();
    }

    public final String getAssetId() {
        String audioClusterId = this.A00.BUk().getAudioClusterId();
        if (audioClusterId == null) {
            return "";
        }
        return audioClusterId;
    }

    public final String getAudioAssetId() {
        return this.A00.BUk().getId();
    }

    public final String getShouldMuteAudioReason() {
        return this.A00.BUp().getShouldMuteAudioReason();
    }

    public final boolean isEligibleForAudioEffects() {
        Boolean CRq = this.A00.BUk().CRq();
        if (CRq != null) {
            return CRq.booleanValue();
        }
        return false;
    }

    public C2605946h(MusicInfo musicInfo) {
        this.A00 = musicInfo;
    }

    public final String AcV() {
        User AdS = AdS();
        if (AdS != null) {
            return AdS.getUsername();
        }
        String displayArtist = this.A00.BUk().getDisplayArtist();
        if (displayArtist == null) {
            return "";
        }
        return displayArtist;
    }

    public final long AdT() {
        return Long.parseLong(getAudioAssetId());
    }

    public final boolean COy() {
        User AdS = AdS();
        if (AdS != null) {
            return AdS.isVerified();
        }
        return false;
    }

    public final String getArtistId() {
        User AdS = AdS();
        if (AdS != null) {
            return AdS.getId();
        }
        return this.A00.BUk().getArtistId();
    }
}
