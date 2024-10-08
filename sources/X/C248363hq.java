package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3hq  reason: invalid class name and case insensitive filesystem */
public final class C248363hq extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248363hq(2Lk r7) {
        super("registerAuthDataBackgroundMigrationListener", 2022138370, 5, false, false);
        this.A00 = r7;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.9BR] */
    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        AnonymousClass9BR r12 = AnonymousClass9BR.A01;
        AnonymousClass9BR r13 = r12;
        if (r12 == null) {
            ? obj = new Object();
            obj.A00 = userSession;
            AnonymousClass9BR.A01 = obj;
            r13 = obj;
        }
        14i.A03(15Y.A03, r13);
    }
}
