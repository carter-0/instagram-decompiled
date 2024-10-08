package X;

import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.concurrent.TimeUnit;

public abstract class A1G {
    public static final void A00(AnonymousClass818 r15, UserSession userSession, CXPNoticeStateRepository cXPNoticeStateRepository, LGS lgs) {
        CXPNoticeStateRepository cXPNoticeStateRepository2 = cXPNoticeStateRepository;
        AnonymousClass7TG.A1O(cXPNoticeStateRepository2, r15);
        LGS lgs2 = lgs;
        String A03 = lgs2.A03();
        2DQ A00 = 2DQ.A00(A03);
        0qQ.A07(A00);
        AnonymousClass9I7 A002 = cXPNoticeStateRepository2.A00(A00);
        cXPNoticeStateRepository2.A02.A01(new AnonymousClass9I7(false, A002.A00 + 1, A002.A01, (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), 0), A00);
        AnonymousClass9I7 A02 = lgs2.A02(r15, userSession, cXPNoticeStateRepository2);
        2DQ A003 = 2DQ.A00(A03);
        0qQ.A07(A003);
        cXPNoticeStateRepository2.A03(A02, A003);
    }
}
