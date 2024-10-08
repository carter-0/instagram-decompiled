package com.instagram.feed.media;

import X.C21888Xkz;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;

public interface EffectPreviewIntf extends Parcelable {
    public static final C21888Xkz A00 = C21888Xkz.A00;

    AttributionUser AdD();

    String Awu();

    EffectActionSheetIntf Azy();

    ImageUrl BEO();

    EffectThumbnailImageDictIntf C6y();

    Boolean COY();

    EffectPreview FE1();

    TreeUpdaterJNI FHC();

    String getEffectId();

    String getFailureCode();

    String getFailureReason();

    String getFormattedClipsMediaCount();

    String getId();

    String getName();

    String getSaveStatus();

    String getTitle();
}
