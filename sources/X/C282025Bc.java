package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.model.OriginalPartsAttributionModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Bc  reason: invalid class name and case insensitive filesystem */
public final class C282025Bc implements C2606046i {
    public final int A00;
    public final OriginalAudioSubtype A01;
    public final OriginalSoundConsumptionInfoIntf A02;
    public final ImageUrl A03;
    public final User A04;
    public final User A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final long A0O;
    public final OriginalSoundDataIntf A0P;
    public final AudioType A0Q;
    public final MusicDataSource A0R;
    public final Integer A0S;
    public final List A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;

    public C282025Bc(OriginalSoundDataIntf originalSoundDataIntf) {
        int i;
        this.A0P = originalSoundDataIntf;
        this.A0E = originalSoundDataIntf.getOriginalMediaId();
        this.A05 = originalSoundDataIntf.BEv();
        String progressiveDownloadUrl = originalSoundDataIntf.getProgressiveDownloadUrl();
        this.A0F = progressiveDownloadUrl;
        String dashManifest = originalSoundDataIntf.getDashManifest();
        this.A0A = dashManifest;
        Integer AzJ = originalSoundDataIntf.AzJ();
        boolean z = false;
        if (AzJ != null) {
            i = AzJ.intValue();
        } else {
            i = 0;
        }
        this.A00 = i;
        this.A0V = originalSoundDataIntf.getHideRemixing();
        this.A0H = 0qQ.A0K(originalSoundDataIntf.AkO(), true);
        this.A0I = 0qQ.A0K(originalSoundDataIntf.AkP(), true);
        this.A0N = originalSoundDataIntf.getShouldMuteAudio();
        this.A0D = originalSoundDataIntf.getOriginalAudioTitle();
        this.A0U = originalSoundDataIntf.getAllowCreatorToRename();
        this.A0G = originalSoundDataIntf.Adj();
        0sn Adk = originalSoundDataIntf.Adk();
        this.A0T = Adk == null ? 0sn.A00 : Adk;
        this.A01 = originalSoundDataIntf.BYy();
        this.A02 = originalSoundDataIntf.AqB();
        this.A0L = originalSoundDataIntf.isAudioAutomaticallyAttributed();
        0qQ.A0K(originalSoundDataIntf.Caw(), true);
        this.A09 = originalSoundDataIntf.getAudioAssetId();
        this.A04 = originalSoundDataIntf.BEv();
        this.A06 = originalSoundDataIntf.BEv().getId();
        this.A07 = originalSoundDataIntf.BEv().getUsername();
        this.A0W = originalSoundDataIntf.BEv().isVerified();
        this.A08 = originalSoundDataIntf.getAudioAssetId();
        this.A0O = Long.parseLong(originalSoundDataIntf.getAudioAssetId());
        this.A0C = originalSoundDataIntf.getOriginalMediaId();
        this.A03 = originalSoundDataIntf.BEv().Bh3();
        this.A0X = originalSoundDataIntf.AqB().isBookmarked();
        this.A0J = originalSoundDataIntf.isExplicit();
        Boolean CRq = originalSoundDataIntf.CRq();
        this.A0K = CRq != null ? CRq.booleanValue() : z;
        this.A0M = originalSoundDataIntf.AqB().isTrendingInClips();
        this.A0S = originalSoundDataIntf.C9r();
        this.A0B = originalSoundDataIntf.getFormattedClipsMediaCount();
        String str = this.A08;
        String str2 = this.A06;
        AudioType audioType = AudioType.ORIGINAL_AUDIO;
        this.A0R = new MusicDataSource((Uri) null, audioType, progressiveDownloadUrl, dashManifest, str, str2);
        for (Object obj : this.A0G) {
            if (obj == null) {
                0wb.A03("ClipsOriginalSoundModel", 002.A0v("Null audio part received for original audio_asset_id: {", this.A08, "} and original_media_id: {", this.A0E, '}'));
            }
        }
        this.A0Q = audioType;
    }

    public final MusicAttributionConfig Col(Context context) {
        String str = this.A08;
        String str2 = this.A0F;
        String str3 = this.A0A;
        String str4 = this.A07;
        String str5 = this.A0D;
        ImageUrl A0D2 = this.A04.A0D();
        ImageUrl imageUrl = this.A03;
        int i = this.A00;
        boolean z = this.A0J;
        String str6 = this.A0C;
        boolean z2 = this.A0H;
        boolean z3 = this.A0I;
        OriginalAudioSubtype originalAudioSubtype = this.A01;
        ArrayList arrayList = new ArrayList();
        for (OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf : 00k.A0X(this.A0G)) {
            arrayList.add(new OriginalPartsAttributionModel(originalAudioPartMetadataIntf.C72(), originalAudioPartMetadataIntf.getDisplayArtist(), originalAudioPartMetadataIntf.getDisplayTitle(), originalAudioPartMetadataIntf.isExplicit()));
        }
        Boolean valueOf = Boolean.valueOf(this.A0L);
        boolean z4 = this.A0K;
        MusicAssetModel musicAssetModel = new MusicAssetModel();
        musicAssetModel.A0E = str;
        musicAssetModel.A0B = null;
        musicAssetModel.A0H = str2;
        musicAssetModel.A0C = str3;
        musicAssetModel.A0J = null;
        musicAssetModel.A0I = str5;
        musicAssetModel.A0D = str4;
        musicAssetModel.A0A = null;
        musicAssetModel.A02 = A0D2;
        musicAssetModel.A03 = imageUrl;
        musicAssetModel.A00 = i;
        musicAssetModel.A0S = z;
        musicAssetModel.A0Q = z4;
        musicAssetModel.A0R = false;
        musicAssetModel.A0O = false;
        musicAssetModel.A0U = true;
        musicAssetModel.A0G = str6;
        musicAssetModel.A09 = null;
        musicAssetModel.A0M = z2;
        musicAssetModel.A0N = z3;
        musicAssetModel.A0T = false;
        musicAssetModel.A0F = null;
        musicAssetModel.A01 = originalAudioSubtype;
        musicAssetModel.A0K = arrayList;
        musicAssetModel.A07 = valueOf;
        MusicAssetModel.A04(musicAssetModel);
        return new MusicAttributionConfig((AudioFilterType) null, musicAssetModel, (String) null, this.A02.getShouldMuteAudioReason(), 0, this.A0N, true);
    }

    public final String AcV() {
        return this.A07;
    }

    public final User AdS() {
        return this.A04;
    }

    public final long AdT() {
        return this.A0O;
    }

    public final ImageUrl AdY() {
        return this.A03;
    }

    public final List Adj() {
        return 00k.A0X(this.A0G);
    }

    public final List Adk() {
        return 00k.A0X(this.A0T);
    }

    public final OriginalAudioSubtype Ads() {
        return this.A01;
    }

    public final AudioType Adv() {
        return this.A0Q;
    }

    public final /* synthetic */ List Ay7() {
        return null;
    }

    public final MusicDataSource BUq() {
        return this.A0R;
    }

    public final String BYx() {
        return this.A0C;
    }

    public final MusicMuteAudioReason BuG() {
        return this.A02.BuG();
    }

    public final Integer C9r() {
        return this.A0S;
    }

    public final boolean COy() {
        return this.A0W;
    }

    public final boolean COz() {
        return this.A0X;
    }

    public final boolean CP0() {
        return this.A0J;
    }

    public final boolean CQr() {
        return this.A0U;
    }

    public final boolean CZi(String str) {
        User user = this.A04;
        if (user.A0N() == AnonymousClass05K.A01 || 0qQ.A0K(user.getId(), str)) {
            return true;
        }
        return false;
    }

    public final boolean Cdd() {
        return this.A0M;
    }

    public final boolean Ce0() {
        if (this.A0N || this.A0V) {
            return false;
        }
        return true;
    }

    public final boolean Esc() {
        return this.A0N;
    }

    public final String getArtistId() {
        return this.A06;
    }

    public final String getAssetId() {
        return this.A08;
    }

    public final String getAudioAssetId() {
        return this.A09;
    }

    public final String getShouldMuteAudioReason() {
        return this.A02.getShouldMuteAudioReason();
    }

    public final boolean isEligibleForAudioEffects() {
        return this.A0K;
    }

    public final String ACv(Context context) {
        return this.A0D;
    }
}
