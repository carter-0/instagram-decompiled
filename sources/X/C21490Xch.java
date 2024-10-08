package X;

import androidx.media3.common.Timeline;
import java.util.Arrays;

/* renamed from: X.Xch  reason: case insensitive filesystem */
public final class C21490Xch {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Timeline A06;
    public final Timeline A07;
    public final C21484Xcb A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C21490Xch xch = (C21490Xch) obj;
            if (!(this.A04 == xch.A04 && this.A01 == xch.A01 && this.A03 == xch.A03 && this.A00 == xch.A00 && this.A02 == xch.A02 && this.A05 == xch.A05 && 2PP.A00(this.A07, xch.A07) && 2PP.A00(this.A06, xch.A06) && 2PP.A00(this.A08, xch.A08))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A04), this.A07, Integer.valueOf(this.A01), null, Long.valueOf(this.A03), this.A06, Integer.valueOf(this.A00), this.A08, Long.valueOf(this.A02), Long.valueOf(this.A05)});
    }

    public C21490Xch(Timeline timeline, Timeline timeline2, C21484Xcb xcb, int i, int i2, long j, long j2, long j3, long j4) {
        this.A04 = j;
        this.A07 = timeline;
        this.A01 = i;
        this.A03 = j2;
        this.A06 = timeline2;
        this.A00 = i2;
        this.A08 = xcb;
        this.A02 = j3;
        this.A05 = j4;
    }
}
