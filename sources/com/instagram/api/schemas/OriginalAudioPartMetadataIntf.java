package com.instagram.api.schemas;

import X.1E9;
import X.C21789XiE;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

public interface OriginalAudioPartMetadataIntf extends Parcelable {
    public static final C21789XiE A00 = C21789XiE.A00;

    List Adc();

    int Adr();

    MusicCanonicalType Adu();

    User BEv();

    int Bag();

    ImageUrl C72();

    Boolean CRq();

    OriginalAudioPartMetadataIntf E7p(1E9 r1);

    OriginalAudioPartMetadata F7C(1E9 r1);

    TreeUpdaterJNI FHC();

    String getDisplayArtist();

    String getDisplayTitle();

    int getDurationInMs();

    String getMusicCanonicalId();

    boolean isBookmarked();

    boolean isExplicit();
}
