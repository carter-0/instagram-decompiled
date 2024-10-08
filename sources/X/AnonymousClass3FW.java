package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3FW  reason: invalid class name */
public final class AnonymousClass3FW {
    public final UserSession A00;
    public final User A01;

    public AnonymousClass3FW(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = 0eE.A00(userSession).A00();
    }

    public final long A00() {
        List Biu;
        C253703rF r0;
        Integer B1c;
        User user = this.A01;
        if (user.A2N() && !2B0.A01.A07(this.A00).getBoolean("BYPASS_QUIET_MODE_UPSELL_CHECKS", false) && (Biu = user.A03.Biu()) != null && (r0 = (C253703rF) 00k.A0O(Biu, 0)) != null && (B1c = r0.B1c()) != null) {
            return (long) B1c.intValue();
        }
        return 182.A01(0Tu.A05, this.A00, 36597476458892103L);
    }

    public final long A01() {
        List Biu;
        C253703rF r0;
        Integer Bym;
        User user = this.A01;
        if (user.A2N() && !2B0.A01.A07(this.A00).getBoolean("BYPASS_QUIET_MODE_UPSELL_CHECKS", false) && (Biu = user.A03.Biu()) != null && (r0 = (C253703rF) 00k.A0O(Biu, 0)) != null && (Bym = r0.Bym()) != null) {
            return (long) Bym.intValue();
        }
        return 182.A01(0Tu.A05, this.A00, 36597476459023176L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r3 != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.F10 A03(long r20) {
        /*
            r19 = this;
            r2 = r19
            X.4lf r3 = r2.A02()
            r12 = 0
            if (r3 == 0) goto L_0x0047
            java.lang.Long r0 = r3.A01
            if (r0 == 0) goto L_0x0047
            long r10 = r0.longValue()
        L_0x0012:
            java.lang.Long r0 = r3.A00
            if (r0 == 0) goto L_0x001a
            long r12 = r0.longValue()
        L_0x001a:
            com.instagram.user.model.User r0 = r2.A01
            boolean r16 = r0.A1Z()
            long r0 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r4
            boolean r17 = r2.A07(r0)
            long r4 = r2.A01()
            long r6 = r2.A00()
            r18 = 0
            if (r3 == 0) goto L_0x0039
            r18 = 1
        L_0x0039:
            long r14 = r12 - r10
            java.util.List r3 = r2.A04()
            X.F10 r2 = new X.F10
            r8 = r20
            r2.<init>(r3, r4, r6, r8, r10, r12, r14, r16, r17, r18)
            return r2
        L_0x0047:
            r10 = 0
            if (r3 == 0) goto L_0x001a
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3FW.A03(long):X.F10");
    }

    public final List A04() {
        List Biu;
        C253703rF r0;
        List AvS;
        User user = this.A01;
        if (!user.A2N() || (Biu = user.A03.Biu()) == null || (r0 = (C253703rF) 00k.A0O(Biu, 0)) == null || (AvS = r0.AvS()) == null) {
            return DcT.A02();
        }
        return AvS;
    }

    public final void A05(long j, long j2) {
        User user = this.A01;
        List singletonList = Collections.singletonList(new C272934lf(Long.valueOf(j2), Long.valueOf(j)));
        0qQ.A07(singletonList);
        user.A0x(singletonList);
    }

    public final boolean A06() {
        DcU dcU;
        UserSession userSession = this.A00;
        int i = 1;
        if (2Au.A00(userSession)) {
            Calendar instance = Calendar.getInstance();
            0qQ.A07(instance);
            DcU A012 = DcT.A01(instance);
            if (A012 != null) {
                List<String> A04 = new AnonymousClass3FW(userSession).A04();
                ArrayList arrayList = new ArrayList();
                for (String A002 : A04) {
                    DcU A003 = DcT.A00(A002);
                    if (A003 != null) {
                        arrayList.add(A003);
                    }
                }
                ArrayList A0U = 00k.A0U(arrayList);
                int i2 = A012.A00;
                if (i2 != 7) {
                    i = 1 + i2;
                }
                DcU[] values = DcU.values();
                int length = values.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        dcU = null;
                        break;
                    }
                    dcU = values[i3];
                    if (dcU.A00 == i) {
                        break;
                    }
                    i3++;
                }
                return 00k.A0u(A0U, dcU);
            }
        }
        return true;
    }

    public final boolean A07(long j) {
        List Bit;
        User user = this.A01;
        List Bit2 = user.A03.Bit();
        if (Bit2 != null && !Bit2.isEmpty() && (Bit = user.A03.Bit()) != null) {
            Iterator it = Bit.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C272944lg r1 = (C272944lg) it.next();
                Long startTimestamp = r1.getStartTimestamp();
                Long B1j = r1.B1j();
                if (startTimestamp != null && B1j != null && startTimestamp.longValue() + 1 <= j && j < B1j.longValue()) {
                    break;
                }
            }
            return false;
        }
        if (!user.A1Z() || !A08(j)) {
            return false;
        }
        return true;
    }

    public final boolean A09(DcU dcU) {
        if (!2Au.A00(this.A00)) {
            return true;
        }
        List<String> A04 = A04();
        ArrayList arrayList = new ArrayList(0Yv.A1E(A04, 10));
        for (String A002 : A04) {
            arrayList.add(DcT.A00(A002));
        }
        ArrayList A0U = 00k.A0U(arrayList);
        if (dcU == null || A0U.isEmpty() || A0U.contains(dcU)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r1 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C272934lf A02() {
        /*
            r13 = this;
            long r11 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r0
            com.instagram.user.model.User r2 = r13.A01
            X.4Cl r0 = r2.A03
            java.util.List r0 = r0.Bit()
            if (r0 == 0) goto L_0x0018
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            r0 = r0 ^ 1
            r10 = 0
            if (r0 == 0) goto L_0x0061
            X.4Cl r0 = r2.A03
            java.util.List r0 = r0.Bit()
            if (r0 == 0) goto L_0x0061
            java.util.Iterator r9 = r0.iterator()
        L_0x002a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r0 = r9.next()
            X.4lg r0 = (X.C272944lg) r0
            java.lang.Long r8 = r0.getStartTimestamp()
            java.lang.Long r7 = r0.B1j()
            if (r8 == 0) goto L_0x002a
            if (r7 == 0) goto L_0x002a
            long r5 = r8.longValue()
            r3 = 1
            long r1 = r5 + r3
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x005c
            long r1 = r7.longValue()
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005c
        L_0x0056:
            X.4lf r0 = new X.4lf
            r0.<init>(r7, r8)
            return r0
        L_0x005c:
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x002a
            goto L_0x0056
        L_0x0061:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3FW.A02():X.4lf");
    }

    public final boolean A08(long j) {
        long A012 = A01();
        long A002 = A00();
        long A003 = C280074zx.A00() / 1000;
        long j2 = A012 + A003;
        long j3 = A003 + A002;
        if (j3 < j2) {
            j2 -= SandboxRepository.CACHE_TTL;
        }
        if (j > j3) {
            j2 += SandboxRepository.CACHE_TTL;
            j3 += SandboxRepository.CACHE_TTL;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j2 * 1000);
        if (!A09(DcT.A01(instance)) || j2 > j || j >= j3) {
            return false;
        }
        return true;
    }
}
