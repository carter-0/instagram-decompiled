package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import X.C393559wd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class StoryTemplateFillableStickersDictImpl extends AnonymousClass0T0 implements Parcelable, StoryTemplateFillableStickersDict {
    public static final Parcelable.Creator CREATOR = new C376419Hx(38);
    public final StoryTemplateFillableMusicStickerDict A00;
    public final List A01;

    public final StoryTemplateFillableStickersDictImpl FBb() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateFillableStickersDictImpl) {
                StoryTemplateFillableStickersDictImpl storyTemplateFillableStickersDictImpl = (StoryTemplateFillableStickersDictImpl) obj;
                if (!0qQ.A0K(this.A01, storyTemplateFillableStickersDictImpl.A01) || !0qQ.A0K(this.A00, storyTemplateFillableStickersDictImpl.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A01;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        StoryTemplateFillableMusicStickerDict storyTemplateFillableMusicStickerDict = this.A00;
        if (storyTemplateFillableMusicStickerDict != null) {
            i = storyTemplateFillableMusicStickerDict.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        List<Parcelable> list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        parcel.writeParcelable(this.A00, i);
    }

    public final List B5n() {
        return this.A01;
    }

    public final StoryTemplateFillableMusicStickerDict B5o() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryTemplateFillableStickersDict", C393559wd.A00(this));
    }

    public StoryTemplateFillableStickersDictImpl(StoryTemplateFillableMusicStickerDict storyTemplateFillableMusicStickerDict, List list) {
        this.A01 = list;
        this.A00 = storyTemplateFillableMusicStickerDict;
    }
}
