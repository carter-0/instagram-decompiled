package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.TIq  reason: case insensitive filesystem */
public final class C13034TIq implements Runnable {
    public final /* synthetic */ S0X A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ Object A02;

    public C13034TIq(S0X s0x, Integer num, Object obj) {
        this.A00 = s0x;
        this.A01 = num;
        this.A02 = obj;
    }

    public final void run() {
        long j;
        long j2;
        C12356Ss2 ss2 = this.A00.A00;
        Integer num = this.A01;
        Object obj = this.A02;
        int intValue = num.intValue();
        if (intValue == 0) {
            obj.getClass();
            Object[] objArr = (Object[]) obj;
            boolean A1a = AnonymousClass7TE.A1a(objArr[0]);
            long A0R = AnonymousClass7TE.A0R(objArr[1]);
            if (A1a && ss2.A0X) {
                ss2.A0X = false;
                SNJ snj = ss2.A0h;
                HashMap A002 = C12356Ss2.A00(ss2);
                A002.put("first_frame_render_time_ms", String.valueOf(A0R - ss2.A0C));
                SNJ.A00(snj, "media_player_first_frame_rendered", A002);
            }
            long j3 = ss2.A08;
            if (j3 == 0) {
                j3 = ss2.A0C;
                ss2.A08 = j3;
            }
            if (j3 > 0) {
                long j4 = A0R - j3;
                if (j4 >= 35) {
                    boolean z = ss2.A0w;
                    long j5 = ss2.A0B;
                    if (z) {
                        j = j5 + (j4 - 35);
                    } else {
                        j = j5 + j4;
                    }
                    ss2.A0B = j;
                    long j6 = ss2.A0D + 1;
                    ss2.A0D = j6;
                    if (z) {
                        j2 = j4 - 35;
                    } else {
                        j2 = j4;
                    }
                    C12356Ss2.A0A(ss2, "doFrameRendered: adding delta=%s, mOverallStuckTimeMs=%s, mStuckFramesCount=%s, mEnableDeltaStuckTime=%s", Long.valueOf(j2), Long.valueOf(j), Long.valueOf(j6), Boolean.valueOf(z));
                    List list = ss2.A0U;
                    if (list.size() < 500) {
                        if (z) {
                            j4 -= 35;
                        }
                        Pxe.A1J(j4, list);
                    }
                }
                ss2.A08 = A0R;
            }
            ss2.A0A++;
        } else if (intValue != 1) {
            ss2.A02++;
        } else {
            obj.getClass();
            C12356Ss2.A0C(ss2, (Throwable) obj);
        }
    }
}
