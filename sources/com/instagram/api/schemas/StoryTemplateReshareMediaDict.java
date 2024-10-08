package com.instagram.api.schemas;

import X.ACI;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public interface StoryTemplateReshareMediaDict extends Parcelable {
    public static final ACI A00 = ACI.A00;

    Integer Als();

    StoryTemplateReshareMediaDictImpl FBg();

    TreeUpdaterJNI FHC();

    String getMediaId();

    String getUserId();
}
