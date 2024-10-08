package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44157CXw;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class GIFNoteResponseInfoImpl extends AnonymousClass0T0 implements Parcelable, GIFNoteResponseInfo {
    public static final Parcelable.Creator CREATOR = DE7.A00(77);
    public final CommentGiphyMediaInfo A00;

    public final GIFNoteResponseInfoImpl F3I() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof GIFNoteResponseInfoImpl) && 0qQ.A0K(this.A00, ((GIFNoteResponseInfoImpl) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final /* bridge */ /* synthetic */ CommentGiphyMediaInfoIntf B9E() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTGIFNoteResponseInfo", C44157CXw.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public GIFNoteResponseInfoImpl(CommentGiphyMediaInfo commentGiphyMediaInfo) {
        this.A00 = commentGiphyMediaInfo;
    }
}
