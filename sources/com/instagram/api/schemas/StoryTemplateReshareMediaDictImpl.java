package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C44452CfA;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class StoryTemplateReshareMediaDictImpl extends AnonymousClass0T0 implements Parcelable, StoryTemplateReshareMediaDict {
    public static final Parcelable.Creator CREATOR = new FK6(8);
    public final Integer A00;
    public final String A01;
    public final String A02;

    public final StoryTemplateReshareMediaDictImpl FBg() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryTemplateReshareMediaDictImpl) {
                StoryTemplateReshareMediaDictImpl storyTemplateReshareMediaDictImpl = (StoryTemplateReshareMediaDictImpl) obj;
                if (!0qQ.A0K(this.A00, storyTemplateReshareMediaDictImpl.A00) || !0qQ.A0K(this.A01, storyTemplateReshareMediaDictImpl.A01) || !0qQ.A0K(this.A02, storyTemplateReshareMediaDictImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(C41847B3o.A00(parcel, this.A00));
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final Integer Als() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryTemplateReshareMediaDict", C44452CfA.A00(this));
    }

    public final String getMediaId() {
        return this.A01;
    }

    public final String getUserId() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public StoryTemplateReshareMediaDictImpl(String str, Integer num, String str2) {
        this.A00 = num;
        this.A01 = str;
        this.A02 = str2;
    }
}
