package X;

import com.facebook.rsys.externalcall.gen.ExternalCallDelegate;

/* renamed from: X.Oqj  reason: case insensitive filesystem */
public final class C71783Oqj implements C74299PsY {
    public final /* synthetic */ ND1 A00;

    public C71783Oqj(ND1 nd1) {
        this.A00 = nd1;
    }

    public final void CvX() {
        ExternalCallDelegate externalCallDelegate = this.A00.A00;
        if (externalCallDelegate != null) {
            externalCallDelegate.onExternalCallStarted();
        }
    }
}
