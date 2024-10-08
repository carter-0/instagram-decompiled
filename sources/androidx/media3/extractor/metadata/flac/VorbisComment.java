package androidx.media3.extractor.metadata.flac;

import X.002;
import X.C256643w7;
import X.C41845B3m;
import X.C66583MXo;
import X.C7216Pzk;
import X.Xo1;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(30);
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

    public final void E36(Xo1 xo1) {
        String str = this.A00;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    xo1.A05 = this.A01;
                    return;
                }
                return;
            case 79833656:
                if (str.equals("TITLE")) {
                    xo1.A0F = this.A01;
                    return;
                }
                return;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    xo1.A0A = this.A01;
                    return;
                }
                return;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    xo1.A04 = this.A01;
                    return;
                }
                return;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    xo1.A06 = this.A01;
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

    public VorbisComment(String str, String str2) {
        this.A00 = C256643w7.A01(str);
        this.A01 = str2;
    }

    public VorbisComment(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
