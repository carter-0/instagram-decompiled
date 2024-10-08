package X;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* renamed from: X.5G4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5G4 implements Callable {
    public final /* synthetic */ C255353tz A00;

    public /* synthetic */ AnonymousClass5G4(C255353tz r1) {
        this.A00 = r1;
    }

    public final Object call() {
        C255353tz r0 = this.A00;
        int i = 0;
        0qQ.A0B(r0, 0);
        WorkDatabase workDatabase = r0.A00;
        int A002 = AnonymousClass5G5.A00(workDatabase, "next_job_scheduler_id");
        if (0 <= A002) {
            i = A002;
        } else {
            workDatabase.A01().CNV(new C255423u6("next_job_scheduler_id", 1L));
        }
        return Integer.valueOf(i);
    }
}
