package com.google.android.exoplayer2.metadata;

import X.002;
import X.AnonymousClass4RQ;
import X.C256683wB;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class Metadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376409Hw(34);
    public final long A00;
    public final Entry[] A01;

    public interface Entry extends Parcelable {
        byte[] CGn();

        C256683wB CGo();

        void E37(AnonymousClass4RQ r1);
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

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r6 = r8.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.metadata.Metadata A00(com.google.android.exoplayer2.metadata.Metadata r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return r7
        L_0x0003:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r6 = r8.A01
            int r5 = r6.length
            if (r5 != 0) goto L_0x0009
            return r7
        L_0x0009:
            long r2 = r7.A00
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = r7.A01
            int r4 = r1.length
            int r0 = r4 + r5
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r0 = 0
            java.lang.System.arraycopy(r6, r0, r1, r4, r5)
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = (com.google.android.exoplayer2.metadata.Metadata.Entry[]) r1
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.Metadata.A00(com.google.android.exoplayer2.metadata.Metadata):com.google.android.exoplayer2.metadata.Metadata");
    }

    public final int hashCode() {
        long j = this.A00;
        return (Arrays.hashCode(this.A01) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String A0Q;
        String arrays = Arrays.toString(this.A01);
        long j = this.A00;
        if (j == -9223372036854775807L) {
            A0Q = "";
        } else {
            A0Q = 002.A0Q(", presentationTimeUs=", j);
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

    public Metadata(Parcel parcel) {
        this.A01 = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Object[] objArr = this.A01;
            if (i < objArr.length) {
                objArr[i] = parcel.readParcelable(Entry.class.getClassLoader());
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

    public Metadata(Entry[] entryArr, long j) {
        this.A00 = j;
        this.A01 = entryArr;
    }

    public Metadata(Entry... entryArr) {
        this(entryArr, -9223372036854775807L);
    }
}
