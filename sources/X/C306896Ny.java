package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6Ny  reason: invalid class name and case insensitive filesystem */
public abstract class C306896Ny {
    public static int A00;
    public static int A01;
    public static long A02;
    public static final HashMap A03 = new HashMap();

    public static final void A02(AnonymousClass0iw r5, UserSession userSession, FollowStatus followStatus, String str, String str2, String str3, String str4, int i) {
        EWA ewa;
        String str5;
        0qQ.A0B(str2, 5);
        AnonymousClass6KM r2 = new AnonymousClass6KM("su_stories", str, r5.getModuleName());
        r2.A00 = i;
        r2.A04 = str2;
        r2.A06 = GTN.A00(GTO.A00(followStatus));
        int ordinal = followStatus.ordinal();
        if (ordinal != 4) {
            if (ordinal == 3) {
                ewa = EWA.UserActionFollow;
            } else if (ordinal != 5) {
                str5 = null;
            } else {
                ewa = EWA.UserActionCancelRequest;
            }
            str5 = ewa.A00;
        } else {
            ewa = EWA.UserActionUnfollow;
            str5 = ewa.A00;
        }
        r2.A0A = str5;
        if (str3 != null) {
            r2.A07 = str3;
        }
        if (str4 != null) {
            r2.A08 = str4;
        }
        new C230012om(r5, userSession).A08(new AnonymousClass6KN(r2));
    }

    public static final AnonymousClass6KM A00(AnonymousClass0iw r6, C306886Nx r7, String str, int i, boolean z) {
        Number valueOf;
        long j;
        int i2;
        if (z) {
            valueOf = (Number) A03.get(((C306876Nw) r7).A02.getId());
        } else {
            valueOf = Long.valueOf(A02);
        }
        if (valueOf != null) {
            j = valueOf.longValue();
        } else {
            j = 0;
        }
        AnonymousClass6KM r2 = new AnonymousClass6KM("su_stories", C306906Nz.A00(r7).getId(), r6.getModuleName());
        r2.A00 = i;
        C306876Nw r72 = (C306876Nw) r7;
        String str2 = r72.A09;
        if (str2 != null) {
            r2.A04 = str2;
        }
        r2.A03 = Long.valueOf(System.currentTimeMillis() - j);
        r2.A08 = str;
        r2.A0B = r72.A0D;
        List list = r72.A0I;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        r2.A02 = Integer.valueOf(i2);
        String str3 = r72.A0E;
        if (str3 != null) {
            r2.A07 = str3;
        }
        return r2;
    }

    public static final void A04(String str) {
        Number number;
        HashMap hashMap = A03;
        if (!hashMap.containsKey(str) || ((number = (Number) hashMap.get(str)) != null && number.longValue() == -1)) {
            hashMap.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static final void A01(AnonymousClass0iw r9, UserSession userSession, C270074g9 r11, boolean z) {
        List A012 = r11.A01();
        int size = A012.size();
        C230012om r5 = new C230012om(r9, userSession);
        int i = A00;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (A01 + i2) % size;
            C306886Nx r2 = (C306886Nx) A012.get(i3);
            r5.A09(new AnonymousClass6KN(A00(r9, r2, r11.getId(), i3, z)));
            if (z) {
                A03.put(((C306876Nw) r2).A02.getId(), -1L);
            }
        }
    }

    public static final void A03(C270074g9 r5, C309426Yf r6) {
        int i = 0;
        for (Object next : r5.A00()) {
            int i2 = i + 1;
            HashMap hashMap = r6.A1C;
            if (!hashMap.containsKey(next)) {
                hashMap.put(next, Integer.valueOf(i));
            }
            i = i2;
        }
    }
}
