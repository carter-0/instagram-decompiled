package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.4rv  reason: invalid class name and case insensitive filesystem */
public final class C275774rv implements 1wn {
    public final /* synthetic */ C275764ru A00;

    public C275774rv(C275764ru r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        Long valueOf;
        int i;
        Long l;
        int A03 = AnonymousClass0fD.A03(477862563);
        int A032 = AnonymousClass0fD.A03(-1308549522);
        C275764ru r6 = this.A00;
        r6.A02.A02(r6.A03, AnonymousClass2KZ.class);
        14i.A03(15Y.A03, r6.A04);
        2Dr A002 = 2L2.A00(r6.A05);
        synchronized (A002) {
            long j = Long.MAX_VALUE;
            for (Map.Entry value : A002.A0F.A08()) {
                AnonymousClass48S r9 = (AnonymousClass48S) value.getValue();
                synchronized (r9) {
                    UserSession userSession = r9.A0H;
                    0qQ.A0B(userSession, 0);
                    AnonymousClass5I6 r11 = (AnonymousClass5I6) userSession.A01(AnonymousClass5I6.class, new C41655Ay7(userSession, 32));
                    long j2 = Long.MAX_VALUE;
                    for (C254703su A003 : r9.A0K) {
                        Long A004 = r11.A00(A003);
                        if (A004 != null) {
                            long longValue = A004.longValue();
                            if (longValue < j2) {
                                j2 = longValue;
                            }
                        }
                    }
                    if (j2 == Long.MAX_VALUE) {
                        l = null;
                    } else {
                        l = Long.valueOf(j2);
                    }
                }
                if (l != null) {
                    long longValue2 = l.longValue();
                    if (longValue2 < j) {
                        j = longValue2;
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(j);
            }
        }
        if (valueOf != null) {
            r6.A01(valueOf.longValue());
            i = 1533108185;
        } else {
            i = -1616180216;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-794575629, A03);
    }
}
