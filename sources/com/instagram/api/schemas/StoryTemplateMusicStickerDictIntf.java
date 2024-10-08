package com.instagram.api.schemas;

import X.ACH;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public interface StoryTemplateMusicStickerDictIntf extends Parcelable {
    public static final ACH A00 = ACH.A00;

    String Ad0();

    int AwP();

    String AyE();

    float BCs();

    LyricsIntf BOn();

    StoryTemplateMusicAssetInfoDictIntf BUj();

    float Bod();

    float CGW();

    float CGs();

    float CHR();

    StoryTemplateMusicStickerDict FBf();

    TreeUpdaterJNI FHC();

    String getAudioAssetId();

    int getAudioAssetStartTimeInMs();

    String getAudioClusterId();

    String getColor();

    int getOverlapDurationInMs();

    int getZIndex();
}
