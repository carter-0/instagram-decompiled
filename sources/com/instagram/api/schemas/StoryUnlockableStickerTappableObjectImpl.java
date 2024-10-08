package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C44470CfS;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

public final class StoryUnlockableStickerTappableObjectImpl extends AnonymousClass0T0 implements Parcelable, StoryUnlockableStickerTappableObject {
    public static final Parcelable.Creator CREATOR = new FK6(15);
    public final String A00;
    public final String A01;
    public final List A02;

    public final StoryUnlockableStickerTappableObjectImpl FBt() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryUnlockableStickerTappableObjectImpl) {
                StoryUnlockableStickerTappableObjectImpl storyUnlockableStickerTappableObjectImpl = (StoryUnlockableStickerTappableObjectImpl) obj;
                if (!0qQ.A0K(this.A02, storyUnlockableStickerTappableObjectImpl.A02) || !0qQ.A0K(this.A00, storyUnlockableStickerTappableObjectImpl.A00) || !0qQ.A0K(this.A01, storyUnlockableStickerTappableObjectImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        List list = this.A02;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G = C41848B3p.A1G(parcel, list);
            while (A1G.hasNext()) {
                C41847B3o.A1I(parcel, A1G, i);
            }
        }
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final List Bzq() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryUnlockableStickerTappableObject", C44470CfS.A00(this));
    }

    public final String getSubtitle() {
        return this.A00;
    }

    public final String getTitle() {
        return this.A01;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A01);
    }

    public StoryUnlockableStickerTappableObjectImpl(String str, String str2, List list) {
        this.A02 = list;
        this.A00 = str;
        this.A01 = str2;
    }
}
