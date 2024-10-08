package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class CommentGiphyMediaImages extends AnonymousClass0T0 implements Parcelable, CommentGiphyMediaImagesIntf {
    public static final Parcelable.Creator CREATOR = DE7.A00(17);
    public final CommentGiphyMediaFixedHeightImages A00;

    public final CommentGiphyMediaImages F1w() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CommentGiphyMediaImages) && 0qQ.A0K(this.A00, ((CommentGiphyMediaImages) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final CommentGiphyMediaFixedHeightImages B6Q() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public CommentGiphyMediaImages(CommentGiphyMediaFixedHeightImages commentGiphyMediaFixedHeightImages) {
        this.A00 = commentGiphyMediaFixedHeightImages;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0t = C41845B3m.A0t();
        if (B6Q() != null) {
            CommentGiphyMediaFixedHeightImages B6Q = B6Q();
            if (B6Q != null) {
                treeUpdaterJNI = B6Q.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A0t.put("fixed_height", treeUpdaterJNI);
        }
        return C41845B3m.A0T("XDTCommentGiphyMediaImages", 0Yt.A0B(A0t));
    }
}
