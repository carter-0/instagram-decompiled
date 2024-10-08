package com.google.android.exoplayer2.metadata.mp4;

import X.AnonymousClass4RQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C256683wB;
import X.C256703wD;
import X.C51970G9q;
import X.Pxf;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;
import java.util.Locale;

public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = SWW.A00(64);
    public final List A00;

    public final class Segment implements Parcelable {
        public static final Parcelable.Creator CREATOR = SWW.A00(65);
        public final int A00;
        public final long A01;
        public final long A02;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Segment segment = (Segment) obj;
                if (!(this.A02 == segment.A02 && this.A01 == segment.A01 && this.A00 == segment.A00)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return Pxf.A0B(Long.valueOf(this.A02), Long.valueOf(this.A01), Integer.valueOf(this.A00));
        }

        public final String toString() {
            return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Pxf.A1Y(Long.valueOf(this.A02), Long.valueOf(this.A01), this.A00));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.A02);
            parcel.writeLong(this.A01);
            parcel.writeInt(this.A00);
        }

        public Segment(long j, long j2, int i) {
            C256703wD.A03(C51970G9q.A1T((j > j2 ? 1 : (j == j2 ? 0 : -1))));
            this.A02 = j;
            this.A01 = j2;
            this.A00 = i;
        }
    }

    public final /* synthetic */ void E37(AnonymousClass4RQ r1) {
    }

    public final int describeContents() {
        return 0;
    }

    public final /* synthetic */ byte[] CGn() {
        return null;
    }

    public final /* synthetic */ C256683wB CGo() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((SlowMotionData) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
    }

    public SlowMotionData(List list) {
        boolean z;
        this.A00 = list;
        if (!list.isEmpty()) {
            long j = ((Segment) list.get(0)).A01;
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (((Segment) list.get(i)).A02 < j) {
                    z = true;
                    break;
                } else {
                    j = ((Segment) list.get(i)).A01;
                    i++;
                }
            }
        }
        z = false;
        C256703wD.A03(!z);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SlowMotion: segments=");
        return AnonymousClass7TF.A0i(this.A00, A1A);
    }
}
