package X;

import android.net.Uri;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;
import java.util.ArrayList;
import java.util.List;

public final class DHT implements C66569MWx {
    public AnonymousClass8IJ A00;
    public String A01;
    public final OriginalSoundDataIntf A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(DJS.A00);

    public final boolean ABC() {
        return false;
    }

    public final String Axe() {
        return null;
    }

    public final boolean CK6() {
        return false;
    }

    public final boolean CRQ() {
        return false;
    }

    public final boolean CSR() {
        return false;
    }

    public final String getAudioClusterId() {
        return "";
    }

    public final boolean isExplicit() {
        return false;
    }

    public final String Aab() {
        return this.A01;
    }

    public final AnonymousClass8IJ Adb() {
        return this.A00;
    }

    public final ImageUrl As3() {
        return this.A02.BEv().Bh3();
    }

    public final ImageUrl As5() {
        return this.A02.BEv().Bh3();
    }

    public final String Ay9() {
        String Ay9 = this.A02.AqB().Ay9();
        if (Ay9 == null) {
            return "";
        }
        return Ay9;
    }

    public final /* bridge */ /* synthetic */ List BDX() {
        return (ArrayList) this.A03.getValue();
    }

    public final MusicDataSource BUq() {
        OriginalSoundDataIntf originalSoundDataIntf = this.A02;
        return new MusicDataSource((Uri) null, AudioType.ORIGINAL_AUDIO, originalSoundDataIntf.getProgressiveDownloadUrl(), originalSoundDataIntf.getDashManifest(), originalSoundDataIntf.getAudioAssetId(), getArtistId());
    }

    public final String BfO() {
        return this.A02.getAudioAssetId();
    }

    public final String C94() {
        return this.A02.getDashManifest();
    }

    public final int C95() {
        Integer AzJ = this.A02.AzJ();
        if (AzJ != null) {
            return AzJ.intValue();
        }
        return 0;
    }

    public final String C9F() {
        return this.A02.getProgressiveDownloadUrl();
    }

    public final Integer C9r() {
        return this.A02.C9r();
    }

    public final AudioType CAc() {
        return AudioType.ORIGINAL_AUDIO;
    }

    public final boolean Cdd() {
        return this.A02.AqB().isTrendingInClips();
    }

    public final String getArtistId() {
        return this.A02.BEv().getId();
    }

    public final String getDisplayArtist() {
        return this.A02.BEv().getUsername();
    }

    public final String getFormattedClipsMediaCount() {
        return this.A02.getFormattedClipsMediaCount();
    }

    public final String getId() {
        return this.A02.getAudioAssetId();
    }

    public final String getTitle() {
        return this.A02.getOriginalAudioTitle();
    }

    public final boolean isBookmarked() {
        return this.A02.AqB().isBookmarked();
    }

    public final boolean isEligibleForAudioEffects() {
        return AnonymousClass7TG.A1X(this.A02.CRq());
    }

    public DHT(OriginalSoundDataIntf originalSoundDataIntf) {
        this.A02 = originalSoundDataIntf;
    }

    public final void EOL(String str) {
        this.A01 = str;
    }

    public final void EP7(AnonymousClass8IJ r1) {
        this.A00 = r1;
    }
}
