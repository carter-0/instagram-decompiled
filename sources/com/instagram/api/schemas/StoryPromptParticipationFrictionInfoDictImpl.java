package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44422Ceg;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StoryPromptParticipationFrictionInfoDictImpl extends AnonymousClass0T0 implements Parcelable, StoryPromptParticipationFrictionInfoDict {
    public static final Parcelable.Creator CREATOR = DE6.A00(99);
    public final StoryLinkInfoDict A00;
    public final StoryPromptParticipationFrictionType A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final StoryPromptParticipationFrictionInfoDictImpl FAq() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryPromptParticipationFrictionInfoDictImpl) {
                StoryPromptParticipationFrictionInfoDictImpl storyPromptParticipationFrictionInfoDictImpl = (StoryPromptParticipationFrictionInfoDictImpl) obj;
                if (!0qQ.A0K(this.A02, storyPromptParticipationFrictionInfoDictImpl.A02) || !0qQ.A0K(this.A03, storyPromptParticipationFrictionInfoDictImpl.A03) || !0qQ.A0K(this.A00, storyPromptParticipationFrictionInfoDictImpl.A00) || this.A01 != storyPromptParticipationFrictionInfoDictImpl.A01 || !0qQ.A0K(this.A04, storyPromptParticipationFrictionInfoDictImpl.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A04);
    }

    public final String Age() {
        return this.A02;
    }

    public final String Agf() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ StoryLinkInfoDictIntf Agg() {
        return this.A00;
    }

    public final StoryPromptParticipationFrictionType B89() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryPromptParticipationFrictionInfoDict", C44422Ceg.A00(this));
    }

    public final String getTitle() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A04);
    }

    public StoryPromptParticipationFrictionInfoDictImpl(StoryLinkInfoDict storyLinkInfoDict, StoryPromptParticipationFrictionType storyPromptParticipationFrictionType, String str, String str2, String str3) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = storyLinkInfoDict;
        this.A01 = storyPromptParticipationFrictionType;
        this.A04 = str3;
    }
}
