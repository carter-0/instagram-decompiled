package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376389Hu;
import X.C393429wQ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

public final class NotePogVideoDict extends AnonymousClass0T0 implements Parcelable, NotePogVideoDictIntf {
    public static final Parcelable.Creator CREATOR = new C376389Hu(83);
    public final ImageInfo A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public NotePogVideoDict(ImageInfo imageInfo, String str, String str2, List list) {
        0qQ.A0B(str, 1);
        0qQ.A0B(imageInfo, 2);
        0qQ.A0B(str2, 3);
        0qQ.A0B(list, 4);
        this.A01 = str;
        this.A00 = imageInfo;
        this.A02 = str2;
        this.A03 = list;
    }

    public final NotePogVideoDict F6u() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NotePogVideoDict) {
                NotePogVideoDict notePogVideoDict = (NotePogVideoDict) obj;
                if (!0qQ.A0K(this.A01, notePogVideoDict.A01) || !0qQ.A0K(this.A00, notePogVideoDict.A00) || !0qQ.A0K(this.A02, notePogVideoDict.A02) || !0qQ.A0K(this.A03, notePogVideoDict.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        List<Parcelable> list = this.A03;
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }

    public final ImageInfo BGO() {
        return this.A00;
    }

    public final List CEY() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNotePogVideoDict", C393429wQ.A00(this));
    }

    public final String getId() {
        return this.A01;
    }

    public final String getPk() {
        return this.A02;
    }
}
