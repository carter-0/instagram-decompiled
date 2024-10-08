package X;

import android.os.OutcomeReceiver;

public final class SWM implements OutcomeReceiver {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C11240SHa A01;

    public final /* bridge */ /* synthetic */ void onError(Throwable th) {
        0qQ.A0B(th, 0);
        this.A01.A00.flowEndFail(this.A00, "REGISTRATION_ERROR", th.getMessage());
    }

    public SWM(C11240SHa sHa, long j) {
        this.A01 = sHa;
        this.A00 = j;
    }

    public final void onResult(Object obj) {
        this.A01.A00.flowEndSuccess(this.A00);
    }
}
