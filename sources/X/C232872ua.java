package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2ua  reason: invalid class name and case insensitive filesystem */
public final class C232872ua {
    public C229252n5 A00;
    public final UserSession A01;
    public final C232892uc A02;
    public final AnonymousClass4DU A03;
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();
    public final C232842uX A07;

    public static 1Bk A00(C232872ua r3, 1Nv r4) {
        C229252n5 r2;
        synchronized (r3) {
            r2 = r3.A00;
            if (r2 == null) {
                r2 = r3.A02.AXC(r3.A01);
                r3.A00 = r2;
            }
        }
        AnonymousClass4DU r1 = r3.A03;
        if (AnonymousClass3WX.A02(r4, r1)) {
            return r2.A01;
        }
        if (AnonymousClass3WX.A01(r4, r1)) {
            return r2.A00;
        }
        return null;
    }

    public static String A03(Integer num, String str) {
        if (AnonymousClass05K.A00.equals(num)) {
            return str;
        }
        if (AnonymousClass05K.A01.equals(num)) {
            return 002.A0R(str, "_LAST_VIEWED_IMPRESSION_TIME");
        }
        return null;
    }

    public final void A06(1Nv r13, int i) {
        C309376Ya r3;
        1Nv r6 = r13;
        String A012 = A01(this, r13);
        1Bk A002 = A00(this, r13);
        if (A012 != null && A002 != null && (r3 = (C309376Ya) this.A05.remove(A012)) != null) {
            long currentTimeMillis = System.currentTimeMillis() - r3.A05.longValue();
            if (currentTimeMillis > 500) {
                AnonymousClass4DU r7 = this.A03;
                if (AnonymousClass3WX.A00(r13, r7)) {
                    this.A07.Cku((C254223s8) this.A06.remove(A012), r6, r7, i, r3.A01, currentTimeMillis);
                }
            }
        }
    }

    public final void A07(1Xj r12, 1Xj r13, int i) {
        C309376Ya r3;
        1Xj r5 = r12;
        String A022 = A02(this, r12, r13);
        1Bk A002 = A00(this, r12);
        if (A022 != null && A002 != null && (r3 = (C309376Ya) this.A05.remove(A022)) != null) {
            long currentTimeMillis = System.currentTimeMillis() - r3.A05.longValue();
            if (currentTimeMillis > 500) {
                AnonymousClass4DU r6 = this.A03;
                if (AnonymousClass3WX.A00(r12, r6)) {
                    this.A07.ChW(r5, r6, i, r3.A01, currentTimeMillis);
                }
            }
        }
    }

    public final void A0A(1Xj r13, 1Xj r14, int i, int i2) {
        1Xj r5 = r13;
        String A022 = A02(this, r13, r14);
        1Bk A002 = A00(this, r13);
        if (A022 != null && A002 != null) {
            this.A04.put(A022, new C309376Ya(r5, Long.valueOf(System.currentTimeMillis()), (Long) null, i, i2, 1000));
        }
    }

    public static String A01(C232872ua r2, 1Nv r3) {
        AnonymousClass4DU r1 = r2.A03;
        if (AnonymousClass3WX.A02(r3, r1)) {
            String A062 = C231122qu.A06(r2.A01, r3);
            A062.getClass();
            return 002.A0R(Integer.toHexString(A062.hashCode()), r3.getId());
        } else if (AnonymousClass3WX.A01(r3, r1)) {
            return r3.getId();
        } else {
            return null;
        }
    }

    public static String A02(C232872ua r2, 1Xj r3, 1Xj r4) {
        String id;
        AnonymousClass4DU r1 = r2.A03;
        if (AnonymousClass3WX.A02(r3, r1)) {
            String A0F = C231122qu.A0F(r2.A01, r3);
            A0F.getClass();
            id = 002.A0R(Integer.toHexString(A0F.hashCode()), r4.getId());
        } else if (!AnonymousClass3WX.A01(r3, r1)) {
            return null;
        } else {
            id = r4.getId();
        }
        return 002.A0R("carousel_", id);
    }

    public static void A04(1Bk r9, C232872ua r10, C309376Ya r11, 1Nv r12, AnonymousClass4DU r13, String str, int i) {
        if (str != null && r9 != null) {
            Long l = r11.A04;
            17k.A07(l, "End time required at impression end");
            long longValue = l.longValue();
            if (longValue - r11.A05.longValue() >= r11.A02) {
                Integer num = AnonymousClass05K.A01;
                boolean z = false;
                if (r9.A04(A03(num, str), -2147483648L) != -2147483648L) {
                    z = true;
                }
                if (!z) {
                    int i2 = r11.A00;
                    if (i2 == -1) {
                        r10.A07.ClD(r12, r13, i, r11.A01);
                    } else {
                        17k.A0E(r12 instanceof 1Xj);
                        r10.A07.ChX((1Xj) r12, r13, i2, r11.A01);
                    }
                } else if (longValue - r9.A04(A03(num, str), 0) > StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                    int i3 = r11.A00;
                    if (i3 == -1) {
                        r10.A07.Ckf(r12, r13, i, r11.A01);
                    } else {
                        17k.A0E(r12 instanceof 1Xj);
                        r10.A07.ChU((1Xj) r12, r13, i3, r11.A01);
                    }
                } else {
                    return;
                }
                r9.A0C(A03(num, str), l.longValue());
                if (r9.A03() > 200) {
                    C306366Lw.A00(r9);
                }
            }
        }
    }

    public final void A05(0jB r15, 1Nv r16, int i, int i2) {
        1Nv r10 = r16;
        String A012 = A01(this, r10);
        1Bk A002 = A00(this, r10);
        if (A012 != null && A002 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Integer num = AnonymousClass05K.A00;
            0jB r9 = r15;
            int i3 = i;
            int i4 = i2;
            if (A002.A04(A03(num, A012), -2147483648L) == -2147483648L) {
                this.A07.Cir(r9, r10, this.A03, i4, i3);
            } else if (currentTimeMillis > A002.A04(A03(num, A012), 0) + StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                this.A07.Cke(r9, r10, this.A03, i4, i3);
            } else {
                return;
            }
            A002.A0C(A03(num, A012), currentTimeMillis);
            if (A002.A03() > 200) {
                C306366Lw.A00(A002);
            }
        }
    }

    public final void A08(1Xj r18, 1Xj r19, int i) {
        1Xj r3 = r18;
        String A022 = A02(this, r3, r19);
        1Bk A002 = A00(this, r3);
        if (A022 != null && A002 != null) {
            C309376Ya r2 = (C309376Ya) this.A04.remove(A022);
            if (r2 == null) {
                0KC.A0O("ImpressionTracker", "Viewable info missing for media with key %s", new Object[]{A022});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            C309376Ya r22 = new C309376Ya(r3, r2.A05, Long.valueOf(currentTimeMillis), r2.A01, r2.A00, r2.A02);
            this.A05.put(A022, r22);
            A04(A002, this, r22, r3, this.A03, A022, i);
        }
    }

    public C232872ua(UserSession userSession, C232892uc r3, C232842uX r4, AnonymousClass4DU r5) {
        this.A03 = r5;
        this.A07 = r4;
        this.A01 = userSession;
        this.A02 = r3 == null ? new C232882ub(this) : r3;
    }

    public final void A09(1Xj r11, 1Xj r12, int i, int i2) {
        String A022 = A02(this, r11, r12);
        1Bk A002 = A00(this, r11);
        if (A022 != null && A002 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Integer num = AnonymousClass05K.A00;
            if (A002.A04(A03(num, A022), -2147483648L) == -2147483648L) {
                this.A07.ChS(r11, this.A03, i2, i);
            } else if (currentTimeMillis > A002.A04(A03(num, A022), 0) + StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                this.A07.ChT(r11, this.A03, i2, i);
            } else {
                return;
            }
            A002.A0C(A03(num, A022), currentTimeMillis);
            if (A002.A03() > 200) {
                C306366Lw.A00(A002);
            }
        }
    }
}
