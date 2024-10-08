package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.3hh  reason: invalid class name and case insensitive filesystem */
public final class C248273hh extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248273hh(2Lk r7) {
        super("mprotectCode", 366, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        DalvikInternals.mprotectExecCode();
        14i.A03(15Y.A03, r1.A03);
    }
}
