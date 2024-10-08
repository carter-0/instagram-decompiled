package X;

import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

public final class TJR implements Runnable {
    public final /* synthetic */ C255323tw A00;
    public final /* synthetic */ C282975Fm A01;
    public final /* synthetic */ C2379539x A02;
    public final /* synthetic */ UUID A03;

    public TJR(C255323tw r1, C282975Fm r2, C2379539x r3, UUID uuid) {
        this.A01 = r2;
        this.A03 = uuid;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void run() {
        IllegalStateException th;
        C251983oI r1;
        String obj = this.A03.toString();
        AnonymousClass389.A00();
        String str = C282975Fm.A02;
        C255323tw r5 = this.A00;
        WorkDatabase workDatabase = this.A01.A00;
        workDatabase.beginTransaction();
        try {
            AnonymousClass3DG CGi = workDatabase.A05().CGi(obj);
            if (CGi != null) {
                if (CGi.A0E == C2379139t.RUNNING) {
                    C10351Rqo rqo = new C10351Rqo(r5, obj);
                    AnonymousClass3C5 r0 = (AnonymousClass3C5) workDatabase.A04();
                    r1 = r0.A01;
                    r1.assertNotSuspendingTransaction();
                    r1.beginTransaction();
                    r0.A00.insert(rqo);
                    r1.setTransactionSuccessful();
                    r1.endTransaction();
                } else {
                    AnonymousClass389.A00();
                    Pxf.A1L("Ignoring setProgressAsync(...). WorkSpec (", obj, ") is not in a RUNNING state.", str);
                }
                this.A02.A07((Object) null);
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                return;
            }
            th = AnonymousClass7TE.A0z("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            throw th;
        } catch (Throwable th2) {
            try {
                AnonymousClass389.A00();
                Log.e(str, "Error updating Worker progress", th2);
                this.A02.A08(th2);
            } catch (Throwable th3) {
                workDatabase.endTransaction();
                throw th3;
            }
        }
    }
}
