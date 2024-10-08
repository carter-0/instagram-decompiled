package X;

import com.instagram.api.schemas.DayOfTheWeek;
import com.instagram.common.session.UserSession;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FGi  reason: case insensitive filesystem */
public abstract class C49953FGi {
    public static final C51953G8w A02(UserSession userSession) {
        Integer Bym;
        0qQ.A0B(userSession, 0);
        2B1 r0 = 2B0.A01;
        List<C51953G8w> A01 = 2B1.A01(userSession);
        long A00 = A00();
        if (A01 != null) {
            for (C51953G8w g8w : A01) {
                if (!(g8w == null || (Bym = g8w.Bym()) == null)) {
                    int intValue = Bym.intValue();
                    Integer B1c = g8w.B1c();
                    if (B1c != null) {
                        int intValue2 = B1c.intValue();
                        if (((long) intValue) <= A00 && A00 <= ((long) intValue2) && A05(g8w)) {
                            return g8w;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public static final C51953G8w A03(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        2B1 r0 = 2B0.A01;
        List<C51953G8w> A01 = 2B1.A01(userSession);
        long A00 = A00();
        C51953G8w g8w = null;
        if (A01 != null) {
            for (C51953G8w g8w2 : A01) {
                if (g8w2 != null) {
                    Integer Bym = g8w2.Bym();
                    if (g8w != null) {
                        Integer Bym2 = g8w.Bym();
                        if (!(Bym == null || Bym2 == null)) {
                            int intValue = Bym.intValue();
                            if (A00 < ((long) intValue)) {
                                if (intValue >= Bym2.intValue()) {
                                }
                            }
                        }
                    } else if (Bym != null) {
                        if (A00 >= ((long) Bym.intValue())) {
                        }
                    }
                    if (A05(g8w2)) {
                        g8w = g8w2;
                    }
                }
            }
        }
        return g8w;
    }

    public static final Integer A04(C51953G8w g8w, UserSession userSession) {
        String BKL;
        Integer B1c;
        Integer Bym;
        List AvS;
        0qQ.A0B(userSession, 0);
        Integer B1c2 = g8w.B1c();
        if (B1c2 != null && ((long) B1c2.intValue()) == 86399 && (BKL = g8w.BKL()) != null && (B1c = g8w.B1c()) != null) {
            int intValue = B1c.intValue();
            if (g8w.Bym() != null && g8w.AvS() != null && ((long) intValue) == 86399) {
                2B1 r0 = 2B0.A01;
                List A01 = 2B1.A01(userSession);
                if (A01 != null) {
                    Calendar instance = Calendar.getInstance();
                    instance.add(5, 1);
                    int i = instance.get(7);
                    Iterator it = A01.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C51953G8w g8w2 = (C51953G8w) it.next();
                        String BKL2 = g8w2.BKL();
                        if (!(BKL2 == null || (Bym = g8w2.Bym()) == null)) {
                            int intValue2 = Bym.intValue();
                            if (g8w2.B1c() != null && (AvS = g8w2.AvS()) != null && BKL2.equals(BKL) && intValue2 == 0 && AvS.contains(A01(i))) {
                                Integer num = g8w2.F8R().A00;
                                if (num != null) {
                                    return num;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final boolean A05(C51953G8w g8w) {
        List AvS;
        0qQ.A0B(g8w, 0);
        DayOfTheWeek A01 = A01(Calendar.getInstance().get(7));
        if (A01 == null || (AvS = g8w.AvS()) == null || !AvS.contains(A01)) {
            return false;
        }
        return true;
    }

    public static final boolean A06(UserSession userSession) {
        2B1 r0 = 2B0.A01;
        List<C51953G8w> A01 = 2B1.A01(userSession);
        if (A01 == null) {
            return false;
        }
        if (!(A01 instanceof Collection) || !A01.isEmpty()) {
            for (C51953G8w A05 : A01) {
                if (A05(A05)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A07(UserSession userSession, 2Ay r4) {
        0qQ.A0B(userSession, 1);
        if (r4 == null) {
            return false;
        }
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            return new 2Cd(userSession).A04();
        }
        if ((ordinal == 5 || ordinal == 4) && A02(userSession) != null) {
            return true;
        }
        return false;
    }

    public static final long A00() {
        return (System.currentTimeMillis() / 1000) - (DbZ.A08(Calendar.getInstance()) / 1000);
    }

    public static final DayOfTheWeek A01(int i) {
        switch (i) {
            case 1:
                return DayOfTheWeek.SUNDAY;
            case 2:
                return DayOfTheWeek.MONDAY;
            case 3:
                return DayOfTheWeek.TUESDAY;
            case 4:
                return DayOfTheWeek.WEDNESDAY;
            case 5:
                return DayOfTheWeek.THURSDAY;
            case 6:
                return DayOfTheWeek.FRIDAY;
            case 7:
                return DayOfTheWeek.SATURDAY;
            default:
                return null;
        }
    }
}
