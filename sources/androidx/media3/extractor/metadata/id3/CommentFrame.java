package androidx.media3.extractor.metadata.id3;

import X.002;
import X.C66583MXo;
import X.C7216Pzk;
import X.JTR;
import X.Pxh;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;

public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(37);
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CommentFrame commentFrame = (CommentFrame) obj;
            if (!Util.A0E(this.A00, commentFrame.A00) || !Util.A0E(this.A01, commentFrame.A01) || !Util.A0E(this.A02, commentFrame.A02)) {
                return false;
            }
        }
        return true;
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final int hashCode() {
        return ((C66583MXo.A01(JTR.A0G(this.A01)) + JTR.A0G(this.A00)) * 31) + Pxh.A0B(this.A02);
    }

    public final String toString() {
        return 002.A15(this.A00, ": language=", this.A01, ", description=", this.A00, ", text=", this.A02);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
