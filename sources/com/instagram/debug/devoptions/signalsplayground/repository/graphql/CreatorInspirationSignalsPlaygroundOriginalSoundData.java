package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.C250673ls;
import X.HN9;
import com.google.common.collect.ImmutableList;

public interface CreatorInspirationSignalsPlaygroundOriginalSoundData extends C250673ls {

    public interface AudioParts extends C250673ls {
        String getDisplayArtist();

        String getDisplayTitle();

        String getThumbnailUri();

        boolean hasIsExplicit();

        boolean isExplicit();
    }

    public interface ConsumptionInfo extends C250673ls {
        boolean hasIsTrendingInClips();

        boolean isTrendingInClips();
    }

    public interface IgArtist extends C250673ls {
        CreatorInspirationSignalsPlaygroundTestUser asCreatorInspirationSignalsPlaygroundTestUser();
    }

    String getAudioAssetId();

    ImmutableList getAudioParts();

    ConsumptionInfo getConsumptionInfo();

    String getDashManifest();

    int getDurationInMs();

    String getFormattedClipsMediaCount();

    IgArtist getIgArtist();

    HN9 getOriginalAudioSubtype();

    String getOriginalAudioTitle();

    String getProgressiveDownloadUrl();

    boolean getShouldMuteAudio();

    int getTrendRank();

    boolean hasDurationInMs();

    boolean hasIsEligibleForAudioEffects();

    boolean hasIsExplicit();

    boolean hasShouldMuteAudio();

    boolean hasTrendRank();

    boolean isEligibleForAudioEffects();

    boolean isExplicit();
}
