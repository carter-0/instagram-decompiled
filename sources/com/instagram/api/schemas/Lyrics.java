package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376389Hu;
import X.C393389wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class Lyrics extends AnonymousClass0T0 implements Parcelable, LyricsIntf {
    public static final Parcelable.Creator CREATOR = new C376389Hu(52);
    public final List A00;

    public Lyrics(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final Lyrics F5h() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof Lyrics) && 0qQ.A0K(this.A00, ((Lyrics) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        List<Parcelable> list = this.A00;
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }

    public final List BcI() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLyrics", C393389wM.A00(this));
    }
}
