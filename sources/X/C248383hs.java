package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.3hs  reason: invalid class name and case insensitive filesystem */
public final class C248383hs extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248383hs(2Lk r7) {
        super("maybeInitializeMobileBoostProvider", 384, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        try {
            Context context = r1.A01;
            1Hm.A00(context).A08(context, 02m.A0p, r1.A04);
        } catch (Throwable th) {
            0wb.A06(AnonymousClass000.A00(1031), "failed to initialize mobileboost", th);
        }
    }
}
