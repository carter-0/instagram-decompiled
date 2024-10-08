package com.instagram.api.schemas;

import X.0qQ;
import X.17P;
import X.C3035269k;
import X.C44157CXw;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoGIFNoteResponseInfo extends 17P implements GIFNoteResponseInfo {
    public static final C3035269k CREATOR = new CTC(71);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGIFNoteResponseInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final CommentGiphyMediaInfoIntf B9E() {
        return (CommentGiphyMediaInfoIntf) A05(830589001, ImmutablePandoCommentGiphyMediaInfo.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.GIFNoteResponseInfo, com.instagram.api.schemas.ImmutablePandoGIFNoteResponseInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C44157CXw.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final GIFNoteResponseInfoImpl F3I() {
        CommentGiphyMediaInfo commentGiphyMediaInfo;
        CommentGiphyMediaInfoIntf B9E = B9E();
        if (B9E != null) {
            commentGiphyMediaInfo = B9E.F1x();
        } else {
            commentGiphyMediaInfo = null;
        }
        return new GIFNoteResponseInfoImpl(commentGiphyMediaInfo);
    }
}
