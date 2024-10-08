package X;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* renamed from: X.0vb  reason: invalid class name and case insensitive filesystem */
public final class C62770vb implements AnonymousClass02A {
    public final JobWorkItem A00;
    public final /* synthetic */ C62760vZ A01;

    public C62770vb(JobWorkItem jobWorkItem, C62760vZ r2) {
        this.A01 = r2;
        this.A00 = jobWorkItem;
    }

    public final void AIa() {
        C62760vZ r0 = this.A01;
        synchronized (r0.A02) {
            JobParameters jobParameters = r0.A00;
            if (jobParameters != null) {
                jobParameters.completeWork(this.A00);
            }
        }
    }

    public final Intent getIntent() {
        return this.A00.getIntent();
    }
}
