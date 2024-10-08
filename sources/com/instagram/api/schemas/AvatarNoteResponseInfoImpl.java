package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44068CUl;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class AvatarNoteResponseInfoImpl extends AnonymousClass0T0 implements Parcelable, AvatarNoteResponseInfo {
    public static final Parcelable.Creator CREATOR = new SWT(57);
    public final MediaType A00;
    public final String A01;
    public final String A02;

    public final AvatarNoteResponseInfoImpl F0i() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarNoteResponseInfoImpl) {
                AvatarNoteResponseInfoImpl avatarNoteResponseInfoImpl = (AvatarNoteResponseInfoImpl) obj;
                if (this.A00 != avatarNoteResponseInfoImpl.A00 || !0qQ.A0K(this.A01, avatarNoteResponseInfoImpl.A01) || !0qQ.A0K(this.A02, avatarNoteResponseInfoImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final MediaType AeT() {
        return this.A00;
    }

    public final String AeU() {
        return this.A01;
    }

    public final String AmP() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTAvatarNoteResponseInfo", C44068CUl.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0K(this.A00)) + AnonymousClass7TG.A0E(this.A02);
    }

    public AvatarNoteResponseInfoImpl(MediaType mediaType, String str, String str2) {
        AnonymousClass7TG.A1O(mediaType, str);
        this.A00 = mediaType;
        this.A01 = str;
        this.A02 = str2;
    }
}
