package X;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* renamed from: X.5EP  reason: invalid class name */
public final class AnonymousClass5EP extends AnonymousClass4T8 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final boolean A03;

    public final C264744Rc A0D(C264744Rc r11, int i, boolean z) {
        long j;
        C264744Rc r3 = r11;
        this.A00.A0D(r11, 0, z);
        long j2 = r11.A02 - this.A02;
        long j3 = this.A00;
        if (j3 == -9223372036854775807L) {
            j = -9223372036854775807L;
        } else {
            j = j3 - j2;
        }
        r3.A02(j, r11.A04, j2, r11.A05);
        return r11;
    }

    public final AnonymousClass4RE A0E(AnonymousClass4RE r10, int i, long j) {
        this.A00.A0E(r10, 0, 0);
        long j2 = r10.A05;
        long j3 = this.A02;
        r10.A05 = j2 + j3;
        r10.A03 = this.A00;
        r10.A0D = this.A03;
        long j4 = r10.A02;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            r10.A02 = max;
            long j5 = this.A01;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            r10.A02 = max;
            r10.A02 = max - j3;
        }
        long A08 = Util.A08(j3);
        long j6 = r10.A06;
        if (j6 != -9223372036854775807L) {
            r10.A06 = j6 + A08;
        }
        long j7 = r10.A07;
        if (j7 != -9223372036854775807L) {
            r10.A07 = j7 + A08;
        }
        return r10;
    }

    public AnonymousClass5EP(Timeline timeline, long j, long j2) {
        super(timeline);
        long max;
        long j3;
        boolean z = false;
        if (timeline.A01() == 1) {
            AnonymousClass4RE A0E = timeline.A0E(new AnonymousClass4RE(), 0, 0);
            long max2 = Math.max(0, j);
            if (A0E.A0F || max2 == 0 || A0E.A0G) {
                long j4 = j2;
                if (j2 == Long.MIN_VALUE) {
                    max = A0E.A03;
                } else {
                    max = Math.max(0, j4);
                }
                long j5 = A0E.A03;
                if (j5 != -9223372036854775807L) {
                    max = max > j5 ? j5 : max;
                    if (max2 > max) {
                        throw new IOException(002.A0R("Illegal clipping: ", "start exceeds end"));
                    }
                }
                this.A02 = max2;
                this.A01 = max;
                if (max == -9223372036854775807L) {
                    j3 = -9223372036854775807L;
                } else {
                    j3 = max - max2;
                }
                this.A00 = j3;
                if (A0E.A0D && (max == -9223372036854775807L || (j5 != -9223372036854775807L && max == j5))) {
                    z = true;
                }
                this.A03 = z;
                return;
            }
            throw new IOException(002.A0R("Illegal clipping: ", "not seekable to start"));
        }
        throw new IOException(002.A0R("Illegal clipping: ", "invalid period count"));
    }
}
