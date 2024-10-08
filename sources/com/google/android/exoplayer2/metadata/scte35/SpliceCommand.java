package com.google.android.exoplayer2.metadata.scte35;

import X.002;
import X.AnonymousClass4RQ;
import X.C256683wB;
import X.C51968G9o;
import com.google.android.exoplayer2.metadata.Metadata;

public abstract class SpliceCommand implements Metadata.Entry {
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

    public final String toString() {
        return 002.A0R("SCTE-35 splice command: type=", C51968G9o.A16(this));
    }
}
