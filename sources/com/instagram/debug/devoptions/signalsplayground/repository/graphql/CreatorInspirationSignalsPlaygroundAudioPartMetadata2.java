package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.C250673ls;
import X.UyX;

public interface CreatorInspirationSignalsPlaygroundAudioPartMetadata2 extends C250673ls {

    public interface IgArtist extends C250673ls {
        String getId();

        String getProfilePicUrl();

        String getUsername();

        boolean hasIsVerified();

        boolean isVerified();
    }

    UyX getAudioType();

    String getDisplayArtist();

    String getDisplayTitle();

    IgArtist getIgArtist();

    String getMusicCanonicalId();

    String getThumbnailUri();

    boolean hasIsBookmarked();

    boolean hasIsExplicit();

    boolean isBookmarked();

    boolean isExplicit();
}
