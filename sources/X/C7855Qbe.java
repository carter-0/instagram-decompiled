package X;

import com.facebook.rsys.log.gen.CallSummaryInfo;
import com.facebook.rsys.log.gen.LogPersistenceProxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.Qbe  reason: case insensitive filesystem */
public final class C7855Qbe extends LogPersistenceProxy {
    public SE6 A00;
    public AnonymousClass1BJ A01;
    public ExecutorService A02;

    public final void deleteCallSummaryLog(String str) {
        0qQ.A0B(str, 0);
        SE6 se6 = this.A00;
        se6.A00.execute(new TGC(se6, str));
    }

    public C7855Qbe() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.A02 = newSingleThreadExecutor;
        AnonymousClass1BJ A002 = AnonymousClass1F2.A00();
        this.A01 = A002;
        this.A00 = new SE6(A002, newSingleThreadExecutor);
    }

    public final void writeCallSummaryLog(CallSummaryInfo callSummaryInfo, String str) {
        AnonymousClass7TG.A1N(callSummaryInfo, str);
        SE6 se6 = this.A00;
        se6.A00.execute(new Y3I(se6, callSummaryInfo, str));
    }
}
