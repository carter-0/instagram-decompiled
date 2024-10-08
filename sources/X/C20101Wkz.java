package X;

import android.os.Handler;

/* renamed from: X.Wkz  reason: case insensitive filesystem */
public final /* synthetic */ class C20101Wkz implements Runnable {
    public final /* synthetic */ AnonymousClass4MM A00;

    public /* synthetic */ C20101Wkz(AnonymousClass4MM r1) {
        this.A00 = r1;
    }

    public final void run() {
        long preferredTimePeriod;
        float f;
        long j;
        AnonymousClass4MM r7 = this.A00;
        C14721U4j u4j = r7.A0P;
        if (u4j != null) {
            u4j.setPlayerId(r7.BdG());
            u4j.setVideoSource(r7.A0I);
            u4j.A02 = (int) AnonymousClass7TE.A0P(r7.A0n);
            AnonymousClass4Yf r0 = r7.A0E;
            if (r0 != null) {
                u4j.setFormat(r0);
            }
            u4j.A01 = 0;
            C263624Ms r9 = r7.A09;
            C263634Mt r8 = r9.A0I;
            u4j.A0D = r8.A0J();
            u4j.A05 = (long) r7.getCurrentPosition();
            u4j.A04 = (long) ((int) r8.A07());
            u4j.A06 = (long) r9.A04();
            u4j.A09 = r7.A0O;
            u4j.A0E = r7.FNM();
            C255653uU r02 = r7.A0I;
            if (r02 != null && r02.A03()) {
                if (r8.A0I()) {
                    f = ((C263674Mx) r8.A0B.get()).A00;
                } else {
                    f = 1.0f;
                }
                if (r8.A0I()) {
                    j = ((C263674Mx) r8.A0B.get()).A0A;
                } else {
                    j = 0;
                }
                u4j.A00 = f;
                u4j.A03 = (long) ((int) j);
                AnonymousClass4P1 r03 = r7.A0D;
                if (r03 != null) {
                    u4j.setLatencyDecision(r03);
                }
            }
            u4j.A05();
        }
        C14721U4j u4j2 = r7.A0P;
        if (u4j2 == null) {
            preferredTimePeriod = -1;
        } else {
            preferredTimePeriod = u4j2.getPreferredTimePeriod();
        }
        Runnable runnable = r7.A0R;
        if (runnable != null) {
            Handler handler = r7.A0d;
            if (preferredTimePeriod <= 0) {
                preferredTimePeriod = 1000;
            }
            handler.postDelayed(runnable, preferredTimePeriod);
        }
    }
}
