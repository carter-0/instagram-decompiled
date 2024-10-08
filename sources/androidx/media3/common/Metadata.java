package androidx.media3.common;

import X.002;
import X.C273654mx;
import X.C41847B3o;
import X.C51968G9o;
import X.C7216Pzk;
import X.Xo1;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class Metadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(18);
    public final long A00;
    public final Entry[] A01;

    public interface Entry extends Parcelable {
        void E36(Xo1 xo1);
    }

    public final Metadata A00(Entry... entryArr) {
        int length = entryArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.A00;
        Entry[] entryArr2 = this.A01;
        int length2 = entryArr2.length;
        Object[] copyOf = Arrays.copyOf(entryArr2, length2 + length);
        System.arraycopy(entryArr, 0, copyOf, length2, length);
        return new Metadata((Entry[]) copyOf, j);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            if (!Arrays.equals(this.A01, metadata.A01) || this.A00 != metadata.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.A01) * 31) + C51968G9o.A03(this.A00);
    }

    public final String toString() {
        String A0Q;
        String arrays = Arrays.toString(this.A01);
        long j = this.A00;
        if (j == -9223372036854775807L) {
            A0Q = "";
        } else {
            A0Q = 002.A0Q(C273654mx.A00(1125), j);
        }
        return 002.A0g("entries=", arrays, A0Q);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(r3);
        for (Entry writeParcelable : this.A01) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.A00);
    }

    public Metadata(Entry[] entryArr, long j) {
        this.A00 = j;
        this.A01 = entryArr;
    }

    public Metadata(Parcel parcel) {
        this.A01 = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Object[] objArr = this.A01;
            if (i < objArr.length) {
                objArr[i] = C41847B3o.A03(parcel, Entry.class);
                i++;
            } else {
                this.A00 = parcel.readLong();
                return;
            }
        }
    }

    public Metadata(List list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Entry... entryArr) {
        this(entryArr, -9223372036854775807L);
    }
}
