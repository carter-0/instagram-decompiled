package X;

import android.net.Uri;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;
import java.util.Arrays;
import java.util.List;

public final class JVX implements C66569MWx {
    public TrackMetadata A00;
    public MusicDataSource A01;
    public boolean A02;
    public AnonymousClass8IJ A03;
    public String A04;
    public final TrackData A05;
    public final TrackData A06;
    public final String A07;

    public final boolean ABC() {
        return this.A06.getAllowsSaving();
    }

    public final String Aab() {
        return this.A04;
    }

    public final AnonymousClass8IJ Adb() {
        return this.A03;
    }

    public final ImageUrl As3() {
        return this.A06.Arr();
    }

    public final ImageUrl As5() {
        ImageUrl Arq = this.A06.Arq();
        if (Arq != null) {
            return Arq;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String Axe() {
        return this.A06.Av6();
    }

    public final String Ay9() {
        Long Ay8;
        TrackMetadata trackMetadata = this.A00;
        if (trackMetadata == null || (Ay8 = trackMetadata.Ay8()) == null) {
            return null;
        }
        return Ay8.toString();
    }

    public final List BDX() {
        return this.A06.BDX();
    }

    public final MusicDataSource BUq() {
        MusicDataSource musicDataSource = this.A01;
        if (musicDataSource != null) {
            return musicDataSource;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String C94() {
        String dashManifest = this.A06.getDashManifest();
        if (dashManifest != null) {
            return dashManifest;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int C95() {
        Integer AzJ = this.A06.AzJ();
        if (AzJ != null) {
            return AzJ.intValue();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String C9F() {
        String progressiveDownloadUrl = this.A06.getProgressiveDownloadUrl();
        if (progressiveDownloadUrl != null) {
            return progressiveDownloadUrl;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final Integer C9r() {
        TrackMetadata trackMetadata = this.A00;
        if (trackMetadata != null) {
            return trackMetadata.C9r();
        }
        return null;
    }

    public final AudioType CAc() {
        return AudioType.MUSIC;
    }

    public final boolean CK6() {
        Boolean BBW = this.A06.BBW();
        if (BBW != null) {
            return BBW.booleanValue();
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CRQ() {
        /*
            r2 = this;
            com.instagram.api.schemas.TrackData r0 = r2.A06
            java.lang.String r0 = r0.Av6()
            if (r0 == 0) goto L_0x000f
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVX.CRQ():boolean");
    }

    public final boolean CSR() {
        return AnonymousClass7TG.A1X(this.A06.CSQ());
    }

    public final boolean Cdd() {
        TrackMetadata trackMetadata;
        TrackMetadata trackMetadata2;
        if (this.A02 || ((trackMetadata = this.A00) != null && trackMetadata.Cde() != null && (trackMetadata2 = this.A00) != null && AnonymousClass7TF.A1Y(trackMetadata2.Cde(), true))) {
            return true;
        }
        return false;
    }

    public final String getArtistId() {
        return this.A06.getArtistId();
    }

    public final String getAudioClusterId() {
        String audioClusterId = this.A06.getAudioClusterId();
        if (audioClusterId != null) {
            return audioClusterId;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String getDisplayArtist() {
        return this.A07;
    }

    public final String getFormattedClipsMediaCount() {
        TrackMetadata trackMetadata = this.A00;
        if (trackMetadata != null) {
            return trackMetadata.getFormattedClipsMediaCount();
        }
        return null;
    }

    public final String getId() {
        return this.A06.getId();
    }

    public final String getTitle() {
        String title = this.A06.getTitle();
        if (title != null) {
            return title;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean isBookmarked() {
        TrackMetadata trackMetadata = this.A00;
        if (trackMetadata != null) {
            return trackMetadata.isBookmarked();
        }
        return false;
    }

    public final boolean isEligibleForAudioEffects() {
        return AnonymousClass7TG.A1X(this.A06.CRq());
    }

    public final boolean isExplicit() {
        return this.A06.isExplicit();
    }

    public JVX(TrackData trackData) {
        this.A06 = trackData;
        this.A05 = trackData;
        if (trackData.getProgressiveDownloadUrl() == null && trackData.getDashManifest() == null) {
            String format = String.format("Progressive Download Url and Dash Manifest cannot both be null for music asset id: %s", Arrays.copyOf(new Object[]{trackData.getId()}, 1));
            0qQ.A07(format);
            0kD.A05("MusicSearchTrack", format, (Throwable) null);
        } else {
            this.A01 = new MusicDataSource((Uri) null, AudioType.MUSIC, trackData.getProgressiveDownloadUrl(), trackData.getDashManifest(), getAudioClusterId(), trackData.getArtistId());
        }
        String displayArtist = trackData.getDisplayArtist();
        if (displayArtist != null) {
            this.A07 = displayArtist;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String BfO() {
        return getAudioClusterId();
    }

    public final void EOL(String str) {
        this.A04 = str;
    }

    public final void EP7(AnonymousClass8IJ r1) {
        this.A03 = r1;
    }
}
