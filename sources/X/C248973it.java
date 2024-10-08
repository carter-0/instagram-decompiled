package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.3it  reason: invalid class name and case insensitive filesystem */
public final class C248973it extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248973it(2Lk r7) {
        super("LoadIGDResharedContent", 1330836973, 3, true, true);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        C290645fe A002 = C290635fd.A00(r1.A04);
        if (C290645fe.A00(A002)) {
            synchronized (A002) {
            }
        }
    }
}
