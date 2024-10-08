package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class OML {
    public final QuickPerformanceLogger A00;
    public final AtomicInteger A01 = new AtomicInteger(0);

    public final int A00(C69335Nja nja, int i) {
        int andIncrement = this.A01.getAndIncrement();
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        quickPerformanceLogger.markerStartWithCancelPolicy(i, false, andIncrement, -1, TimeUnit.NANOSECONDS);
        quickPerformanceLogger.markerAnnotate(i, andIncrement, "clientType", nja.A00.intValue());
        return andIncrement;
    }

    public OML(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }

    public final void A01(Integer num, Integer num2, Long l, int i) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        int i2 = i;
        quickPerformanceLogger.markerAnnotate(178991798, i2, "errorCode", DbX.A02(num));
        quickPerformanceLogger.markerAnnotate(178991798, i2, "attemptsRemaining", C51967G9n.A04(num2, -1));
        quickPerformanceLogger.markerAnnotate(178991798, i2, "backOffInSeconds", JTS.A06(l));
        if (C66581MXm.A1W(DbX.A02(num), 0sr.A1P(new Number[]{C69363Nk3.A09.A00, C69363Nk3.A06.A00, C69363Nk3.A05.A00}))) {
            quickPerformanceLogger.markerEnd(178991798, i2, 2);
        } else {
            quickPerformanceLogger.markerEnd(178991798, i2, 3);
        }
    }
}
