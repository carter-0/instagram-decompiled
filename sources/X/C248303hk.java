package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.3hk  reason: invalid class name and case insensitive filesystem */
public final class C248303hk extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248303hk(2Lk r3) {
        super("updateSessionCountForPushPermission", 1147742495);
        this.A00 = r3;
    }

    public final void loggedRun() {
        CallerContext callerContext = 2Lk.A08;
        0xa r3 = AnonymousClass0xl.A00(C61170le.A00).A00;
        int i = r3.getInt("session_count_for_push_permission", 0) + 1;
        0xY AR4 = r3.AR4();
        AR4.E5Z("session_count_for_push_permission", i);
        AR4.apply();
    }
}
