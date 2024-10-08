package androidx.media3.extractor.metadata.mp4;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66583MXo;
import X.C7216Pzk;
import X.Pxe;
import X.Pxh;
import X.Xo1;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(44);
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public final /* synthetic */ void E36(Xo1 xo1) {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (!(this.A02 == motionPhotoMetadata.A02 && this.A01 == motionPhotoMetadata.A01 && this.A00 == motionPhotoMetadata.A00 && this.A04 == motionPhotoMetadata.A04 && this.A03 == motionPhotoMetadata.A03)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A02;
        return Pxh.A06(this.A03, AnonymousClass7TF.A01(this.A04, AnonymousClass7TF.A01(this.A00, AnonymousClass7TF.A01(this.A01, C66583MXo.A01((int) (j ^ (j >>> 32)))))));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.A02 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A03 = parcel.readLong();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Motion photo metadata: photoStartPosition=");
        A1A.append(this.A02);
        A1A.append(", photoSize=");
        A1A.append(this.A01);
        A1A.append(", photoPresentationTimestampUs=");
        A1A.append(this.A00);
        A1A.append(", videoStartPosition=");
        A1A.append(this.A04);
        A1A.append(", videoSize=");
        return Pxe.A10(A1A, this.A03);
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
        this.A04 = j4;
        this.A03 = j5;
    }
}
