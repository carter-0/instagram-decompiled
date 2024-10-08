package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.user.model.User;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* renamed from: X.DdX  reason: case insensitive filesystem */
public abstract class C46359DdX {
    public static final AnonymousClass0iw A00 = DbS.A0O("quiet_mode");

    public static final long A00(UserSession userSession) {
        long A002;
        long timeInMillis;
        0qQ.A0B(userSession, 0);
        AnonymousClass3FW r1 = new AnonymousClass3FW(userSession);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (!2Au.A00(userSession)) {
            A002 = r1.A00();
            timeInMillis = C280074zx.A00();
        } else {
            currentTimeMillis = A01(userSession);
            Calendar A03 = C280074zx.A03(currentTimeMillis);
            A002 = r1.A00();
            timeInMillis = A03.getTimeInMillis();
        }
        long j = A002 + (timeInMillis / 1000);
        if (currentTimeMillis > j) {
            return j + SandboxRepository.CACHE_TTL;
        }
        return j;
    }

    public static final long A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        AnonymousClass3FW r1 = new AnonymousClass3FW(userSession);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        boolean A08 = r1.A08(currentTimeMillis);
        long A01 = r1.A01() + (C280074zx.A00() / 1000);
        if (A08) {
            if (currentTimeMillis < A01) {
                return A01 - SandboxRepository.CACHE_TTL;
            }
            return A01;
        } else if (2Au.A00(userSession)) {
            return A03(userSession, A01);
        } else {
            if (currentTimeMillis > A01) {
                return A01 + SandboxRepository.CACHE_TTL;
            }
            return A01;
        }
    }

    public static final long A02(UserSession userSession, long j) {
        long A0P;
        int i;
        0qQ.A0B(userSession, 0);
        AnonymousClass3FW r8 = new AnonymousClass3FW(userSession);
        if (!2Au.A00(userSession) || r8.A08(j)) {
            A0P = AnonymousClass7TE.A0P(C280074zx.A00()) + r8.A00();
            i = (j > A0P ? 1 : (j == A0P ? 0 : -1));
        } else {
            long A03 = A03(userSession, j);
            A0P = AnonymousClass7TE.A0P(C280074zx.A03(A03).getTimeInMillis()) + r8.A00();
            i = (A03 > A0P ? 1 : (A03 == A0P ? 0 : -1));
        }
        if (i >= 0) {
            return A0P + SandboxRepository.CACHE_TTL;
        }
        return A0P;
    }

    public static final long A03(UserSession userSession, long j) {
        long j2;
        DcU dcU;
        int i;
        int i2;
        0qQ.A0B(userSession, 0);
        AnonymousClass3FW r8 = new AnonymousClass3FW(userSession);
        boolean A002 = 2Au.A00(userSession);
        long j3 = SandboxRepository.CACHE_TTL;
        if (A002) {
            Calendar A03 = C280074zx.A03(j);
            DcU A01 = DcT.A01(A03);
            long A0P = AnonymousClass7TE.A0P(A03.getTimeInMillis()) + r8.A01();
            if (j >= A0P) {
                A03.setTimeInMillis(A03.getTimeInMillis() + 86400000);
            }
            DcU A012 = DcT.A01(A03);
            if (A012 != null && (i = A012.A00) <= (i2 = i + 6)) {
                while (true) {
                    int i3 = i % 7;
                    if (i3 == 0) {
                        i3 = 7;
                    }
                    DcU[] values = DcU.values();
                    int length = values.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            dcU = null;
                            break;
                        }
                        dcU = values[i4];
                        if (dcU.A00 == i3) {
                            break;
                        }
                        i4++;
                    }
                    if (!new AnonymousClass3FW(userSession).A09(dcU)) {
                        if (i == i2) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            dcU = null;
            if (!(A01 == null || dcU == null)) {
                int i5 = dcU.A00 - A01.A00;
                if (i5 < 0) {
                    i5 += 7;
                }
                j2 = A0P + (((long) i5) * SandboxRepository.CACHE_TTL);
                if (i5 != 0 || j < j2) {
                    return j2;
                }
                j3 = 604800;
                return j2 + j3;
            }
        }
        j2 = AnonymousClass7TE.A0P(C280074zx.A00()) + r8.A01();
        if (j < j2) {
            return j2;
        }
        return j2 + j3;
    }

    public static final Date A04(UserSession userSession, long j) {
        0qQ.A0B(userSession, 0);
        long A03 = A03(userSession, j);
        if (!new AnonymousClass3FW(userSession).A08(j)) {
            if (2Au.A00(userSession)) {
                return new Date(A03(userSession, A03) * 1000);
            }
            A03 += SandboxRepository.CACHE_TTL;
        }
        return new Date(A03 * 1000);
    }

    public static final void A05(Context context, FragmentActivity fragmentActivity, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 3);
        AnonymousClass3FW r3 = new AnonymousClass3FW(userSession);
        boolean A01 = 2Au.A01(userSession);
        C331127Pr A0W = DbS.A0W(userSession);
        int i = 2131971211;
        if (A01) {
            i = 2131973959;
        }
        A0W.A0g = context.getString(i);
        A0W.A0K = new C50072FNn(fragmentActivity, userSession, str, 12);
        A0W.A1J = true;
        int i2 = 2131971210;
        if (A01) {
            i2 = 2131973958;
        }
        A0W.A0h = context.getString(i2);
        A0W.A0L = new C50072FNn(fragmentActivity, userSession, str, 11);
        A0W.A1N = true;
        A0W.A0U = new C72956PQo(r3, userSession, str, 3);
        A0W.A00().A02(fragmentActivity, new ERV());
        AnonymousClass0iw r0 = A00;
        AnonymousClass7TG.A1N(userSession, r0);
        DcM.A03(new DcM(r0, userSession), Dba.A0Q(r3), "ig_quiet_mode_pause_bottom_sheet_shown", str);
    }

    public static final void A06(UserSession userSession) {
        long j;
        0qQ.A0B(userSession, 0);
        AnonymousClass3FW r10 = new AnonymousClass3FW(userSession);
        boolean A07 = r10.A07(System.currentTimeMillis() / 1000);
        1Av A002 = 1Au.A00(userSession);
        if (A07) {
            long A01 = r10.A01();
            long A003 = r10.A00();
            long A004 = C280074zx.A00() / 1000;
            if (A01 < A003) {
                j = A004 + A003;
            } else {
                if (A01 > A003 && r10.A06()) {
                    A004 += A003;
                }
                j = A004 + SandboxRepository.CACHE_TTL;
            }
        } else {
            j = 0;
        }
        0xY A0p = AnonymousClass7TE.A0p(A002);
        A0p.E5c(C66579MXk.A00(1061), j);
        A0p.apply();
    }

    public static final void A07(UserSession userSession, User user, List list, long j, long j2) {
        0qQ.A0B(userSession, 1);
        List list2 = 0sn.A00;
        if (2Au.A00(userSession)) {
            if (list == null) {
                list = new AnonymousClass3FW(userSession).A04();
            }
            list2 = list;
        }
        user.A03.Ehd(AnonymousClass7TE.A1I(new C253693rE(Integer.valueOf((int) j2), Integer.valueOf((int) j), (String) null, list2)));
    }

    public static final boolean A08(UserSession userSession) {
        List<C272944lg> Bit;
        0qQ.A0B(userSession, 0);
        long A0I = AnonymousClass7TG.A0I();
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        List Bit2 = A0Q.A03.Bit();
        if (Bit2 != null && !Bit2.isEmpty() && (Bit = A0Q.A03.Bit()) != null && !Bit.isEmpty()) {
            for (C272944lg r0 : Bit) {
                Long startTimestamp = r0.getStartTimestamp();
                Long l = null;
                if (startTimestamp == null) {
                    startTimestamp = null;
                }
                Long B1j = r0.B1j();
                if (B1j != null) {
                    l = B1j;
                }
                if (!(startTimestamp == null || l == null)) {
                    long longValue = startTimestamp.longValue();
                    if ((longValue + 1 <= A0I && A0I < l.longValue()) || A0I <= longValue) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
