package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44468CfQ;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StoryUnlockableStickerDataImpl extends AnonymousClass0T0 implements Parcelable, StoryUnlockableStickerData {
    public static final Parcelable.Creator CREATOR = new FK6(14);
    public final ImageURIDict A00;
    public final UnlockableStickerStatus A01;
    public final String A02;
    public final String A03;

    public final StoryUnlockableStickerDataImpl FBs() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryUnlockableStickerDataImpl) {
                StoryUnlockableStickerDataImpl storyUnlockableStickerDataImpl = (StoryUnlockableStickerDataImpl) obj;
                if (!0qQ.A0K(this.A02, storyUnlockableStickerDataImpl.A02) || !0qQ.A0K(this.A03, storyUnlockableStickerDataImpl.A03) || !0qQ.A0K(this.A00, storyUnlockableStickerDataImpl.A00) || this.A01 != storyUnlockableStickerDataImpl.A01) {
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
    }

    public final ImageURIDict C6x() {
        return this.A00;
    }

    public final UnlockableStickerStatus CBf() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryUnlockableStickerData", C44468CfQ.A00(this));
    }

    public final String getId() {
        return this.A02;
    }

    public final String getName() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public StoryUnlockableStickerDataImpl(ImageURIDict imageURIDict, UnlockableStickerStatus unlockableStickerStatus, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = imageURIDict;
        this.A01 = unlockableStickerStatus;
    }
}
