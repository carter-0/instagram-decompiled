package android.support.v4.media.session;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C7216Pzk;
import X.Pxe;
import X.Pxi;
import X.RLD;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(8);
    public List A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final Bundle A09;
    public final CharSequence A0A;

    public final class CustomAction implements Parcelable {
        public static final Parcelable.Creator CREATOR = C7216Pzk.A00(9);
        public final int A00;
        public final Bundle A01;
        public final CharSequence A02;
        public final String A03;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A03);
            TextUtils.writeToParcel(this.A02, parcel, i);
            parcel.writeInt(this.A00);
            parcel.writeBundle(this.A01);
        }

        public CustomAction(Parcel parcel) {
            this.A03 = parcel.readString();
            this.A02 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.A00 = parcel.readInt();
            this.A01 = Pxi.A0D(parcel, RLD.class);
        }

        public final String toString() {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Action:mName='");
            A1A.append(this.A02);
            A1A.append(", mIcon=");
            A1A.append(this.A00);
            A1A.append(", mExtras=");
            return AnonymousClass7TF.A0i(this.A01, A1A);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("PlaybackState {");
        A16.append("state=");
        A16.append(this.A03);
        A16.append(", position=");
        A16.append(this.A07);
        A16.append(", buffered position=");
        A16.append(this.A06);
        A16.append(", speed=");
        A16.append(this.A01);
        A16.append(", updated=");
        A16.append(this.A08);
        A16.append(", actions=");
        A16.append(this.A04);
        A16.append(", error code=");
        A16.append(this.A02);
        A16.append(", error message=");
        A16.append(this.A0A);
        A16.append(", custom actions=");
        A16.append(this.A00);
        A16.append(", active item id=");
        A16.append(this.A05);
        return AnonymousClass7TF.A0l("}", A16);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeLong(this.A07);
        parcel.writeFloat(this.A01);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A04);
        TextUtils.writeToParcel(this.A0A, parcel, i);
        parcel.writeTypedList(this.A00);
        parcel.writeLong(this.A05);
        parcel.writeBundle(this.A09);
        parcel.writeInt(this.A02);
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A07 = parcel.readLong();
        this.A01 = parcel.readFloat();
        this.A08 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A0A = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A00 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.A05 = parcel.readLong();
        this.A09 = Pxi.A0D(parcel, RLD.class);
        this.A02 = parcel.readInt();
    }
}
