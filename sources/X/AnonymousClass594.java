package X;

import com.instagram.common.session.UserSession;
import com.instagram.service.tigon.IGHttpPriorityContext;
import com.instagram.service.tigon.IGTigonService;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.594  reason: invalid class name */
public final class AnonymousClass594 {
    public static final IGHttpPriorityContext A00(1QU r13, 0lg r14) {
        1wr r2;
        C257523xX r0;
        boolean z;
        int i;
        UserSession userSession;
        AnonymousClass9IM r02;
        C257523xX r03;
        UserSession userSession2;
        1wY A00;
        0qQ.A0B(r14, 0);
        1Rw A002 = C64631Ry.A00(r13);
        if (182.A06(0Tu.A05, r14, 36325321563059060L)) {
            IGTigonService tigonService = IGTigonService.getTigonService(r14);
            ReadWriteLock readWriteLock = IGTigonService.PREFETCH_MAP_LOCK;
            readWriteLock.readLock().lock();
            try {
                r2 = tigonService.mPrefetchItemMap;
            } finally {
                readWriteLock.readLock().unlock();
            }
        } else {
            r2 = null;
            if ((r14 instanceof UserSession) && (userSession2 = (UserSession) r14) != null && userSession2.A05(1wY.class) && (A00 = 1wY.A00(userSession2)) != null) {
                r2 = A00.A0C;
            }
        }
        String str = "";
        boolean z2 = false;
        boolean z3 = false;
        if (r2 != null) {
            int ordinal = r13.A09.ordinal();
            if (ordinal == 3 || ordinal == 2) {
                AnonymousClass2iN r04 = r13.A08;
                if (r04 != null) {
                    String A003 = r04.A00();
                    if (r2.A00(A003) != null) {
                        z2 = true;
                    }
                    str = r2.A02(A003);
                }
            } else if (ordinal == 1 && (r03 = r13.A0A) != null) {
                String str2 = r03.A07;
                if (r2.A01(str2) != null) {
                    z2 = true;
                }
                str = r2.A03(str2);
            }
            z3 = Boolean.valueOf(z2);
        }
        0eP r1 = new 0eP(z3, str);
        boolean booleanValue = ((Boolean) r1.A00).booleanValue();
        String str3 = (String) r1.A01;
        String str4 = 1Rm.A00().A00;
        Integer num = null;
        if (0yU.A07(AnonymousClass0yP.A00(36325321561551720L)) && (r14 instanceof UserSession) && (userSession = (UserSession) r14) != null) {
            1y3 A004 = 1y1.A00(userSession);
            1x3 r8 = new 1x3(userSession);
            if (0sc.A07(new 1CE[]{1CE.A06, 1CE.A0A}).contains(r13.A09)) {
                C73933PmD pmD = new C73933PmD(r13, 41);
                String str5 = 1Rm.A00().A00;
                0qQ.A07(str5);
                AnonymousClass46R A02 = A004.A02(r8.A01(str5), str5, pmD);
                if (!(A02 == null || !A02.hasNext() || (r02 = (AnonymousClass9IM) AnonymousClass46R.A00(A02, true).A01) == null)) {
                    num = Integer.valueOf(r02.A00);
                }
            }
        }
        AnonymousClass2iN r05 = r13.A08;
        if ((r05 == null || !r05.A01) && ((r0 = r13.A0A) == null || !r0.A05)) {
            z = false;
        } else {
            z = true;
        }
        AnonymousClass594 r06 = IGHttpPriorityContext.Companion;
        int i2 = A002.A00;
        1Fe A005 = r13.A00();
        0qQ.A07(A005);
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        boolean z4 = false;
        if (r2 == null) {
            z4 = true;
        }
        return new IGHttpPriorityContext(i2, A005, str3, booleanValue, str4, z, i, z4);
    }
}
