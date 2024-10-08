package X;

import com.facebook.rsys.externalcall.gen.ExternalCallDelegate;

/* renamed from: X.Oqk  reason: case insensitive filesystem */
public final class C71784Oqk implements C74299PsY {
    public final /* synthetic */ ND0 A00;

    public C71784Oqk(ND0 nd0) {
        this.A00 = nd0;
    }

    public final void CvX() {
        ExternalCallDelegate externalCallDelegate = this.A00.A00;
        if (externalCallDelegate != null) {
            externalCallDelegate.onExternalCallStarted();
        }
    }
}
