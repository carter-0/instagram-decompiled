package com.google.android.exoplayer2.metadata.flac;

import X.002;
import X.AnonymousClass4RQ;
import X.C256683wB;
import X.C41845B3m;
import X.C66583MXo;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;

@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = SWW.A00(48);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (!this.A00.equals(vorbisComment.A00) || !this.A01.equals(vorbisComment.A01)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ byte[] CGn() {
        return null;
    }

    public final /* synthetic */ C256683wB CGo() {
        return null;
    }

    public final void E37(AnonymousClass4RQ r3) {
        String str = this.A00;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    r3.A05 = this.A01;
                    return;
                }
                return;
            case 79833656:
                if (str.equals("TITLE")) {
                    r3.A0F = this.A01;
                    return;
                }
                return;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    r3.A0A = this.A01;
                    return;
                }
                return;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    r3.A04 = this.A01;
                    return;
                }
                return;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    r3.A06 = this.A01;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, C66583MXo.A06(this.A00));
    }

    public final String toString() {
        return 002.A0u("VC: ", this.A00, "=", this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public VorbisComment(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
