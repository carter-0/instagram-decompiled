package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.C250673ls;
import com.google.common.collect.ImmutableList;

public interface CreatorInspirationSignalsPlaygroundTrackData extends C250673ls {
    boolean getAllowsSaving();

    String getAudioAssetId();

    String getAudioClusterId();

    String getCoverArtworkThumbnailUri();

    String getCoverArtworkUri();

    String getDashManifest();

    String getDisplayArtist();

    int getDurationInMs();

    String getFastStartProgressiveDownloadUrl();

    boolean getHasLyrics();

    ImmutableList getHighlightStartTimesInMs();

    String getId();

    String getProgressiveDownloadUrl();

    String getSubtitle();

    String getTitle();

    boolean hasAllowsSaving();

    boolean hasDurationInMs();

    boolean hasHasLyrics();

    boolean hasIsEligibleForAudioEffects();

    boolean hasIsExplicit();

    boolean isEligibleForAudioEffects();

    boolean isExplicit();
}
