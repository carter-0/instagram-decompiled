package X;

import java.util.HashMap;

public final class SJC {
    public static final C10881Rzh A06 = new Object();
    public final long A00;
    public final long A01;
    public final C11354SOn A02;
    public final REA A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SJC)) {
            return false;
        }
        SJC sjc = (SJC) obj;
        return this.A05 == sjc.A05 && this.A04 == sjc.A04 && this.A03 == sjc.A03 && this.A02 == sjc.A02;
    }

    public final int hashCode() {
        return Pxh.A0A(this.A03, this.A02, Boolean.valueOf(this.A05), Boolean.valueOf(this.A04));
    }

    public SJC(C11354SOn sOn, REA rea, long j, long j2, boolean z, boolean z2) {
        this.A03 = rea;
        this.A02 = sOn;
        this.A05 = z;
        this.A04 = z2;
        this.A01 = j;
        this.A00 = j2;
    }

    public final String toString() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("mUploadMode", this.A03);
        A1E.put("mVideoTranscodeParams", this.A02);
        A1E.put("mIsStreamingEnabled", Boolean.valueOf(this.A05));
        A1E.put("mShouldEnableVideoSegmentationMode", Boolean.valueOf(this.A04));
        return A1E.toString();
    }
}
