package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.1E6;
import X.C250673ls;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf;

public interface CreatorInspirationSignalsPlaygroundAudio extends C250673ls {

    public interface Metadata extends C250673ls {
        CreatorInspirationSignalsPlaygroundAudioMetadata asCreatorInspirationSignalsPlaygroundAudioMetadata();
    }

    public interface OriginalSound extends C250673ls {
        CreatorInspirationSignalsPlaygroundOriginalSoundData asCreatorInspirationSignalsPlaygroundOriginalSoundData();
    }

    public interface Track extends C250673ls {
        CreatorInspirationSignalsPlaygroundTrackData asCreatorInspirationSignalsPlaygroundTrackData();
    }

    TrackOrOriginalSoundSchemaIntf asApiTypeModel(1E6 r1);

    TrackOrOriginalSoundSchema asRestModel__DO_NOT_USE(1E6 r1);

    Metadata getMetadata();

    OriginalSound getOriginalSound();

    Track getTrack();
}
