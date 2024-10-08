package androidx.media3.extractor.metadata.scte35;

import X.002;
import X.C51968G9o;
import X.Xo1;
import androidx.media3.common.Metadata;

public abstract class SpliceCommand implements Metadata.Entry {
    public final /* synthetic */ void E36(Xo1 xo1) {
    }

    public final int describeContents() {
        return 0;
    }

    public String toString() {
        return 002.A0R("SCTE-35 splice command: type=", C51968G9o.A16(this));
    }
}
