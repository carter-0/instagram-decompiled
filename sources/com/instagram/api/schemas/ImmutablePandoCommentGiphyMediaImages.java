package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoCommentGiphyMediaImages extends 17P implements CommentGiphyMediaImagesIntf {
    public static final C3035269k CREATOR = CTC.A00(38);

    public final CommentGiphyMediaFixedHeightImages B6Q() {
        return (CommentGiphyMediaFixedHeightImages) A05(278928466, ImmutablePandoCommentGiphyMediaFixedHeightImages.class);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final CommentGiphyMediaImages F1w() {
        CommentGiphyMediaFixedHeightImagesImpl commentGiphyMediaFixedHeightImagesImpl;
        CommentGiphyMediaFixedHeightImages B6Q = B6Q();
        if (B6Q != null) {
            commentGiphyMediaFixedHeightImagesImpl = B6Q.F1v();
        } else {
            commentGiphyMediaFixedHeightImagesImpl = null;
        }
        return new CommentGiphyMediaImages(commentGiphyMediaFixedHeightImagesImpl);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.CommentGiphyMediaImagesIntf, com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaImages] */
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
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaImages] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
