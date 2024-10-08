package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.transientanalysis.InstagramTransientNetworkDataCollector;

/* renamed from: X.3hL  reason: invalid class name and case insensitive filesystem */
public final class C248053hL extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248053hL(2Lk r7) {
        super("initTA", 358, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        CallerContext callerContext = 2Lk.A08;
        InstagramTransientNetworkDataCollector.Companion.A00();
    }
}
