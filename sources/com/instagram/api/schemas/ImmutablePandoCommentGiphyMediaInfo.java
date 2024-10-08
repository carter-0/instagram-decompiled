package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CW6;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCommentGiphyMediaInfo extends 17P implements CommentGiphyMediaInfoIntf {
    public static final C3035269k CREATOR = CTC.A00(39);

    public final CommentGiphyMediaImagesIntf B66() {
        return (CommentGiphyMediaImagesIntf) A05(1944022132, ImmutablePandoCommentGiphyMediaImages.class);
    }

    public final CommentGiphyMediaImagesIntf BGR() {
        return (CommentGiphyMediaImagesIntf) A05(-1185250696, ImmutablePandoCommentGiphyMediaImages.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaInfo, com.instagram.api.schemas.CommentGiphyMediaInfoIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CW6.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String B9F() {
        return A0j(1329489265);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaInfo] */
    public final Boolean CcU() {
        return getOptionalBooleanValueByHashCode(-389942488);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaInfo, X.17P] */
    public final CommentGiphyMediaInfo F1x() {
        CommentGiphyMediaImages commentGiphyMediaImages;
        CommentGiphyMediaImagesIntf B66 = B66();
        CommentGiphyMediaImages commentGiphyMediaImages2 = null;
        if (B66 != null) {
            commentGiphyMediaImages = B66.F1w();
        } else {
            commentGiphyMediaImages = null;
        }
        String A0j = A0j(1329489265);
        CommentGiphyMediaImagesIntf BGR = BGR();
        if (BGR != null) {
            commentGiphyMediaImages2 = BGR.F1w();
        }
        return new CommentGiphyMediaInfo(commentGiphyMediaImages, commentGiphyMediaImages2, getOptionalBooleanValueByHashCode(-389942488), A0j, A0Y(), C41845B3m.A0q(this));
    }

    public final String getTitle() {
        return A0Y();
    }

    public final String getUsername() {
        return C41845B3m.A0q(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
