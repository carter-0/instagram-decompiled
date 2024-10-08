package com.instagram.api.schemas;

import X.XkK;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public interface TrackData extends Parcelable {
    public static final XkK A00 = XkK.A00;

    ImageUrl Arq();

    ImageUrl Arr();

    String Av6();

    Integer AzJ();

    Boolean BBW();

    List BDX();

    LyricsIntf BOn();

    String Bjs();

    String BpH();

    String CGG();

    Boolean CRq();

    Boolean CSQ();

    TrackDataImpl FCv();

    TreeUpdaterJNI FHC();

    boolean getAllowsSaving();

    String getArtistId();

    String getAudioAssetId();

    String getAudioClusterId();

    String getDashManifest();

    String getDisplayArtist();

    String getFastStartProgressiveDownloadUrl();

    String getId();

    String getIgUsername();

    String getProgressiveDownloadUrl();

    String getSubtitle();

    String getTitle();

    boolean isExplicit();
}
