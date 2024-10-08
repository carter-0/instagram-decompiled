package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class StoryMultiProductStickerLinkDataImpl extends AnonymousClass0T0 implements Parcelable, StoryMultiProductStickerLinkData {
    public static final Parcelable.Creator CREATOR = DE6.A00(95);
    public final Integer A00;

    public final StoryMultiProductStickerLinkDataImpl FAU() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof StoryMultiProductStickerLinkDataImpl) && 0qQ.A0K(this.A00, ((StoryMultiProductStickerLinkDataImpl) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(C41847B3o.A00(parcel, this.A00));
    }

    public final Integer BMu() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public StoryMultiProductStickerLinkDataImpl(Integer num) {
        this.A00 = num;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        Integer num = this.A00;
        if (num != null) {
            A0t.put("linkType", num);
        }
        return C41845B3m.A0T("XDTStoryMultiProductStickerLinkData", 0Yt.A0B(A0t));
    }
}
