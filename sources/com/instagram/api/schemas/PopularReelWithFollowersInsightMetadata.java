package com.instagram.api.schemas;

import X.D64;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public interface PopularReelWithFollowersInsightMetadata extends Parcelable {
    public static final D64 A00 = D64.A00;

    List BQJ();

    PopularReelWithFollowersInsightMetadataImpl F7a();

    TreeUpdaterJNI FHC();

    int getLikeCount();

    int getPlayCount();

    int getReshareCount();
}
