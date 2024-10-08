package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.RdY  reason: case insensitive filesystem */
public abstract class C9594RdY {
    public static final SJC A00(C11354SOn sOn, AnonymousClass3Q2 r11) {
        C273864nJ A0A = r11.A0A();
        REA rea = REA.NON_SEGMENTED_TRANSCODE;
        C11354SOn sOn2 = sOn;
        if (!(A0A instanceof RBC)) {
            return new SJC(sOn2, rea, -1, 2500000, false, false);
        }
        REA rea2 = REA.SEGMENTED_TRANSCODE;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        RBC rbc = (RBC) A0A;
        return new SJC(sOn2, rea2, timeUnit.toMicros(rbc.A01), timeUnit.toMicros(rbc.A00), false, true);
    }
}
