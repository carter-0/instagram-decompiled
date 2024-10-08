package X;

import com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker;

public final class T0G implements 2IR {
    public final int A00;

    public T0G(int i) {
        this.A00 = i;
    }

    public final void onFailure(Throwable th) {
        if (this.A00 != 0) {
            0qQ.A0B(th, 0);
            0KC.A0F(FederatedAnalyticsWorker.TAG, "Background worker schedule failed", th);
        }
    }

    public final void onSuccess(Object obj) {
    }
}
