package X;

import com.instagram.api.schemas.ImmutablePandoOriginalSoundData;
import com.instagram.api.schemas.ImmutablePandoTrackData;
import com.instagram.api.schemas.ImmutablePandoTrackMetadata;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackMetadataImpl;

public final class CN8 extends 17P implements C66564MWs {
    public OriginalSoundDataIntf A00;

    public final TrackMetadata BSi() {
        return (TrackMetadata) A05(-450004177, ImmutablePandoTrackMetadata.class);
    }

    public final OriginalSoundDataIntf BZA() {
        OriginalSoundDataIntf originalSoundDataIntf = this.A00;
        if (originalSoundDataIntf == null) {
            return (OriginalSoundDataIntf) A05(1929598241, ImmutablePandoOriginalSoundData.class);
        }
        return originalSoundDataIntf;
    }

    public final TrackData C92() {
        return (TrackData) A05(110621003, ImmutablePandoTrackData.class);
    }

    public final C66564MWs E7z(1E9 r2) {
        OriginalSoundDataIntf BZA = BZA();
        if (BZA != null) {
            BZA.E7q(r2);
        } else {
            BZA = null;
        }
        this.A00 = BZA;
        return this;
    }

    public final C61112JxO F7h(1E9 r5) {
        TrackMetadataImpl trackMetadataImpl;
        OriginalSoundData originalSoundData;
        TrackMetadata BSi = BSi();
        TrackDataImpl trackDataImpl = null;
        if (BSi != null) {
            trackMetadataImpl = BSi.FCw();
        } else {
            trackMetadataImpl = null;
        }
        OriginalSoundDataIntf BZA = BZA();
        if (BZA != null) {
            originalSoundData = BZA.F7E(r5);
        } else {
            originalSoundData = null;
        }
        TrackData C92 = C92();
        if (C92 != null) {
            trackDataImpl = C92.FCv();
        }
        return new C61112JxO(originalSoundData, trackDataImpl, trackMetadataImpl);
    }
}
