package androidx.media3.extractor.metadata.scte35;

import X.002;
import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;

public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(52);
    public final long A00;
    public final long A01;

    public final String toString() {
        return 002.A0t("SCTE-35 TimeSignalCommand { ptsTime=", ", playbackPositionUs= ", " }", this.A01, this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
