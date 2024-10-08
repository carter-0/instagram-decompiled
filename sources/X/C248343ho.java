package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.reliability.ulimit.Ulimit;

/* renamed from: X.3ho  reason: invalid class name and case insensitive filesystem */
public final class C248343ho extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248343ho(2Lk r7) {
        super("setFileDescriptorLimit", 379, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        CallerContext callerContext = 2Lk.A08;
        if (Ulimit.sNativeLibLoaded) {
            Ulimit.setNativeMaxUlimit();
        }
    }
}
