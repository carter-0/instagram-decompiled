package X;

import com.facebook.common.callercontext.CallerContext;

public final class MYH extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MYH(2Lk r7) {
        super("prewarmDirectInboxDatabase", 1934382846, 2, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Ot r1 = AnonymousClass2Oq.A06;
        if (r1.A00() != null) {
            AnonymousClass2Oq A002 = r1.A00();
            0qQ.A0A(A002);
            2Lk r12 = this.A00;
            CallerContext callerContext = 2Lk.A08;
            A002.A02(new 2E8(r12.A04));
        }
    }
}
