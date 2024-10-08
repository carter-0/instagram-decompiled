package X;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;

public final class S2T {
    public final String A00;
    public final String A01;
    public final long[] A02;
    public final EventMessage[] A03;

    public final String A00() {
        return 002.A0g(this.A00, "/", this.A01);
    }

    public S2T(String str, String str2, long[] jArr, EventMessage[] eventMessageArr) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = jArr;
        this.A03 = eventMessageArr;
    }
}
