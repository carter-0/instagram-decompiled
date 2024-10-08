package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3id  reason: invalid class name and case insensitive filesystem */
public final class C248813id extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248813id(2Lk r7) {
        super("initUiiDetector", 1241229546, 5, false, true);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 1);
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession, 36314983574932394L)) {
            Object obj = new Object();
            synchronized (C59800bM.class) {
                C59800bM.A00.add(obj);
            }
            1wx.A00(userSession);
            Object obj2 = new Object();
            int A01 = (int) 182.A01(r4, userSession, 36596458551708148L);
            boolean A06 = 182.A06(r4, userSession, 36314983575063467L);
            List singletonList = Collections.singletonList(obj2);
            0qQ.A07(singletonList);
            C70756OKc oKc = new C70756OKc(AnonymousClass0kN.A02(userSession), 0wj.A01, A06);
            Arrays.copyOf(new Object[]{Integer.valueOf(singletonList.size()), Integer.valueOf(A01)}, 2);
            OTR otr = new OTR(oKc, singletonList, A01);
            synchronized (O51.A01) {
                O51.A00 = otr;
            }
        }
    }
}
