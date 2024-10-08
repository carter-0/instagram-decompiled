package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateApi;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.LinkedHashMap;

/* renamed from: X.3iW  reason: invalid class name and case insensitive filesystem */
public final class C248743iW extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248743iW(2Lk r7, int i) {
        super("syncCXPNoticeImpressionState", 1158112076, i, true, true);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        CXPNoticeStateRepository cXPNoticeStateRepository = new CXPNoticeStateRepository(userSession, AnonymousClass05K.A00);
        LinkedHashMap A002 = C369438ul.A00(userSession);
        if (cXPNoticeStateRepository.A04(A002)) {
            CXPNoticeStateApi cXPNoticeStateApi = cXPNoticeStateRepository.A01;
            AnonymousClass9LT r2 = new AnonymousClass9LT(cXPNoticeStateRepository, 48);
            1ES.A05(AnonymousClass9D0.A00(cXPNoticeStateApi.A00.A03(CXPNoticeStateApi.A00(CXPNoticeStateApi.A01(A002))).A02(new C40274AYp(cXPNoticeStateApi, A002, r2), 1158112076, 3, true, true)), 1158112076, 3, true, true);
        }
    }
}
