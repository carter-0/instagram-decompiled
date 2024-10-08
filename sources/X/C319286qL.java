package X;

import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.6qL  reason: invalid class name and case insensitive filesystem */
public final class C319286qL implements AnonymousClass07Y {
    public final AnonymousClass07V A00;
    public final /* synthetic */ C66940MfZ A01;

    public C319286qL(AnonymousClass07V r2, C66940MfZ mfZ) {
        0qQ.A0B(r2, 2);
        this.A01 = mfZ;
        this.A00 = r2;
    }

    @OnLifecycleEvent(07T.ON_DESTROY)
    public final void onDestroy() {
        C66940MfZ mfZ = this.A01;
        ((C46362Dde) mfZ).A00 = null;
        this.A00.A0A(this);
        mfZ.A04();
    }
}
