package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.PXX  reason: case insensitive filesystem */
public final class C73137PXX implements Runnable {
    public final /* synthetic */ PMQ A00;

    public C73137PXX(PMQ pmq) {
        this.A00 = pmq;
    }

    public final void run() {
        AnonymousClass0eM r3 = this.A00.A0I;
        AnonymousClass7TE.A0c(r3).requestFocus();
        AnonymousClass7TE.A0c(r3).sendAccessibilityEvent(8);
        AnonymousClass7TE.A0c(r3).sendAccessibilityEvent(Constants.LOAD_RESULT_PGO);
        AnonymousClass7TE.A0c(r3).sendAccessibilityEvent(8);
    }
}
