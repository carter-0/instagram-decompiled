package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.3hg  reason: invalid class name and case insensitive filesystem */
public final class C248263hg extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248263hg(2Lk r7) {
        super("tryRegisterPushToken", 365, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        String str = r1.A04.A05;
        Integer num = AnonymousClass05K.A00;
        AnonymousClass3R2 A002 = AnonymousClass3QY.A00();
        0xm A003 = AnonymousClass0xl.A00(C61170le.A00);
        String str2 = A002.BiL().A01;
        long j = AnonymousClass3FH.A01;
        0qQ.A0B(str2, 0);
        String A0R = 002.A0R("push_reg_date", str2);
        0xa r7 = A003.A00;
        long j2 = r7.getLong("push_reg_date", -1);
        if (j2 != -1) {
            0xY AR4 = r7.AR4();
            AR4.ED3("push_reg_date");
            AR4.E5c(A0R, j2);
            AR4.apply();
        }
        if (r7.contains(A0R)) {
            if (Math.abs(r7.getLong(A0R, 0) - System.currentTimeMillis()) <= j) {
                1xC.A01.A00(new AnonymousClass3H0(str));
                return;
            }
        }
        A002.EBN(num);
    }
}
