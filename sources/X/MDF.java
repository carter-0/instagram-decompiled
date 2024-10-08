package X;

import androidx.compose.foundation.gestures.ScrollableNestedScrollConnection;
import com.instagram.pendingmedia.service.common.IngestionStepDebugLogger;

public final class MDF extends C64101El {
    public int A00;
    public long A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX WARNING: type inference failed for: r8v0, types: [X.MDF, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        this.A02 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        switch (i) {
            case 0:
                return ((ScrollableNestedScrollConnection) this.A04).DYV(this, 0, 0);
            case 1:
                return ((IngestionStepDebugLogger) this.A04).A01((MU6) null, (LP8) null, this, 0);
            case 2:
                return ((IG9) this.A04).DYV(this, 0, 0);
            default:
                return ((IG9) this.A04).DYa(this, 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDF(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A04 = obj;
    }
}
