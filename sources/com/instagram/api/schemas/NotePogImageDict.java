package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C393419wP;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class NotePogImageDict extends AnonymousClass0T0 implements Parcelable, NotePogImageDictIntf {
    public static final Parcelable.Creator CREATOR = new FK5(97);
    public final String A00;
    public final String A01;
    public final String A02;

    public NotePogImageDict(String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final NotePogImageDict F6t() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NotePogImageDict) {
                NotePogImageDict notePogImageDict = (NotePogImageDict) obj;
                if (!0qQ.A0K(this.A00, notePogImageDict.A00) || !0qQ.A0K(this.A01, notePogImageDict.A01) || !0qQ.A0K(this.A02, notePogImageDict.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final String BGL() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNotePogImageDict", C393419wP.A00(this));
    }

    public final String getId() {
        return this.A00;
    }

    public final String getPk() {
        return this.A02;
    }
}
