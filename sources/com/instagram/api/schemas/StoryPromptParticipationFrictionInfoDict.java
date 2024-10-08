package com.instagram.api.schemas;

import X.ACA;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public interface StoryPromptParticipationFrictionInfoDict extends Parcelable {
    public static final ACA A00 = ACA.A00;

    String Age();

    String Agf();

    StoryLinkInfoDictIntf Agg();

    StoryPromptParticipationFrictionType B89();

    StoryPromptParticipationFrictionInfoDictImpl FAq();

    TreeUpdaterJNI FHC();

    String getTitle();
}
