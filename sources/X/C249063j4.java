package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.3j4  reason: invalid class name and case insensitive filesystem */
public final class C249063j4 extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C249063j4(2Lk r7) {
        super("NotifyStartupPrefetcherStartFinished", 288230301, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        1Ck r12 = 1Ci.A00(r1.A04).A08;
        r12.A01 = true;
        if (r12.A00 != null) {
            r12.A00 = null;
        }
    }
}
