package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.30H  reason: invalid class name */
public final class AnonymousClass30H implements C250603lj, AnonymousClass30I {
    public long A00;
    public final long A01;
    public final long A02;
    public final AnonymousClass30O A03;
    public final UserSession A04;
    public final C233102ux A05;
    public final AnonymousClass2pP A06;
    public final Map A07 = new LinkedHashMap();
    public final Integer A08;

    public AnonymousClass30H(UserSession userSession, C233102ux r6, AnonymousClass2pP r7) {
        0qQ.A0B(r6, 3);
        this.A06 = r7;
        this.A04 = userSession;
        this.A05 = r6;
        0Tu r3 = 0Tu.A06;
        double A002 = 182.A00(r3, userSession, 37159094972383324L);
        AnonymousClass30J r2 = AnonymousClass30J.SECONDS;
        this.A01 = AnonymousClass30M.A03(AnonymousClass30K.A02(r2, A002));
        this.A02 = AnonymousClass30M.A03(AnonymousClass30K.A02(r2, 182.A00(r3, userSession, 37159094972842077L)));
        Integer A003 = AnonymousClass30N.A00(AnonymousClass05K.A00, 182.A04(0Tu.A05, userSession, 36889186342994754L));
        this.A08 = A003;
        this.A03 = new AnonymousClass30O(A003);
        this.A00 = -1;
    }

    public final void ATF(AnonymousClass30Y r14, C252093oY r15) {
        long j;
        0qQ.A0B(r14, 0);
        0qQ.A0B(r15, 1);
        int intValue = r15.CEk(r14).intValue();
        if (intValue == 0) {
            A00(r14, r15, System.currentTimeMillis());
            AnonymousClass2pP r1 = this.A06;
            String id = ((1Xj) r14.A03).getId();
            if (id != null) {
                0qQ.A0A(r1.A00(id));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else if (intValue != 1) {
            this.A00 = -1;
            this.A03.A00 = -1;
            AnonymousClass2pP r12 = this.A06;
            String id2 = ((1Xj) r14.A03).getId();
            if (id2 != null) {
                C254213s7 A002 = r12.A00(id2);
                A002.A04(r15);
                if (182.A06(0Tu.A05, this.A04, 36326236389127821L)) {
                    A002.A02();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else {
            A00(r14, r15, System.currentTimeMillis());
            AnonymousClass30O r8 = this.A03;
            AnonymousClass2pP r7 = this.A06;
            r8.A01(r14, r15, r7);
            1Xj r9 = (1Xj) r14.A03;
            AnonymousClass3W1 r10 = (AnonymousClass3W1) r14.A04;
            UserSession userSession = this.A04;
            if (182.A06(0Tu.A05, userSession, 36326236389127821L)) {
                if (!r10.A2q && r10.getPosition() >= 0) {
                    long A003 = r8.A00(r14, r15, r7);
                    if (r9.BR7() == 1iA.A0a) {
                        j = this.A02;
                    } else {
                        j = this.A01;
                    }
                    if (A003 >= j) {
                        C233102ux r72 = this.A05;
                        Integer num = AnonymousClass05K.A0C;
                        AFI_TYPE afi_type = AFI_TYPE.DWELL_FEED_SEE_MORE_LESS;
                        if (r72.EsX(afi_type, r9, num)) {
                            r72.Cui(afi_type, r9, r10, num, r10.getPosition());
                        }
                    }
                }
            } else if (!A01(r9) && !r10.A2q && r10.getPosition() >= 0) {
                C233102ux r73 = this.A05;
                Integer num2 = AnonymousClass05K.A0C;
                AFI_TYPE afi_type2 = AFI_TYPE.DWELL_FEED_SEE_MORE_LESS;
                if (r73.EsX(afi_type2, r9, num2) && r15.B0M(r14) >= this.A01) {
                    r73.Cui(afi_type2, r9, r10, num2, r10.getPosition());
                    long currentTimeMillis = System.currentTimeMillis();
                    String A072 = C231122qu.A07(userSession, r9);
                    if (A072 != null) {
                        this.A07.put(A072, Long.valueOf(currentTimeMillis));
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }

    private final void A00(AnonymousClass30Y r6, C252093oY r7, long j) {
        if (this.A00 == -1) {
            int intValue = this.A08.intValue();
            if (intValue != 0) {
                if (intValue != 1 && intValue != 2) {
                    throw new RuntimeException();
                } else if (r7.CEk(r6) == AnonymousClass05K.A01) {
                    AnonymousClass2pP r1 = this.A06;
                    String id = ((1Xj) r6.A03).getId();
                    if (id == null) {
                        throw new IllegalStateException("Required value was null.");
                    } else if (r1.A00(id).A01(r7) <= 0) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (r7.CEk(r6) != AnonymousClass05K.A00) {
                return;
            }
            this.A00 = j;
            this.A05.EUa(AFI_TYPE.DWELL_FEED_SEE_MORE_LESS, j);
        }
    }

    private final boolean A01(1Xj r7) {
        String A072 = C231122qu.A07(this.A04, r7);
        if (A072 != null) {
            Number number = (Number) this.A07.get(A072);
            if (number == null || System.currentTimeMillis() >= number.longValue() + 1800000) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean CRp(AnonymousClass30Y r5, C252093oY r6) {
        if (182.A06(0Tu.A05, this.A04, 36326236389127821L)) {
            Integer num = AnonymousClass05K.A0C;
            return this.A05.EsX(AFI_TYPE.DWELL_FEED_SEE_MORE_LESS, (1Xj) r5.A03, num);
        }
        1Xj r3 = (1Xj) r5.A03;
        if (A01(r3)) {
            return false;
        }
        if (!this.A05.EsX(AFI_TYPE.DWELL_FEED_SEE_MORE_LESS, r3, AnonymousClass05K.A0C)) {
            return false;
        }
        return true;
    }
}
