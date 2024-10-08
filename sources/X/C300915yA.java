package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;
import java.util.Set;

/* renamed from: X.5yA  reason: invalid class name and case insensitive filesystem */
public final class C300915yA {
    public final long A00;
    public final UserSession A01;

    public final void A02(C254703su r21, C254783t2 r22, int i) {
        ExtendedImageUrl extendedImageUrl;
        String str;
        String A0g;
        String id;
        ExtendedImageUrl extendedImageUrl2;
        String str2;
        boolean A1S;
        Integer A0d;
        UserSession userSession;
        1Xj r0;
        1Xj r5;
        C254703su r4 = r21;
        0qQ.A0B(r4, 0);
        C254783t2 r10 = r22;
        if ((r10 instanceof C254773t1) && AnonymousClass48O.A05(i)) {
            if (r4.A0W() == 1iA.A0Q && A01(this, r4.C7c(), r4.A1S())) {
                C271374ik r52 = r4.A0e;
                1Xj r1 = r4.A0s;
                if (r52 != null) {
                    if (r4.A0w == null && (A0g = r4.A0g()) != null && (r0 = r52.A05) != null && (id = r0.getId()) != null && (r5 = r52.A05) != null) {
                        userSession = this.A01;
                        str2 = r5.A35(userSession.A03.A06());
                        if (str2 != null) {
                            A1S = r4.A1S();
                            A0d = r4.A0d(id);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (r1 != null && r1.A05 == null && (A0g = r4.A0g()) != null && (id = r1.getId()) != null && (extendedImageUrl2 = r1.A0E) != null && (str2 = extendedImageUrl2.A0A) != null) {
                    A1S = r4.A1S();
                    A0d = r4.A0d(id);
                    userSession = this.A01;
                } else {
                    return;
                }
                int i2 = 1;
                if (0qQ.A0K(userSession.A06, r4.BsI())) {
                    i2 = 0;
                }
                A00(this, new C60958JuG(r10, (Long) null, A0g, id, (String) null, i2, A1S, false), A0d, str2);
            } else if (r4.A1a() && A01(this, r4.C7c(), r4.A1S())) {
                int i3 = 1;
                if (0qQ.A0K(this.A01.A06, r4.BsI())) {
                    i3 = 0;
                }
                String A0g2 = r4.A0g();
                if (A0g2 != null) {
                    Object obj = r4.A1T;
                    if (obj instanceof List) {
                        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        for (Object next : (List) obj) {
                            if (next instanceof C254873tC) {
                                C254873tC r12 = (C254873tC) next;
                                if (!(r12.A0Z != null || (extendedImageUrl = r12.A0X) == null || (str = extendedImageUrl.A0A) == null)) {
                                    long j = r12.A0K;
                                    if (j != 0) {
                                        String valueOf = String.valueOf(j);
                                        boolean A1S2 = r4.A1S();
                                        A00(this, new C60958JuG(r10, (Long) null, A0g2, valueOf, (String) null, i3, A1S2, false), r4.A0d(valueOf), str);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void A03(C254783t2 r12, String str, String str2, String str3, boolean z) {
        C254783t2 r3 = r12;
        if (r12 == null || (r12 instanceof C254773t1)) {
            UserSession userSession = this.A01;
            boolean z2 = z;
            if (C66797Mcj.A02(userSession, z2)) {
                A00(this, new C60958JuG(r3, (Long) null, (String) null, str2, str, 0, z2, false), -1, str3);
                C278394wo A002 = C278384wn.A00(userSession);
                synchronized (A002) {
                    Set set = A002.A02;
                    if (!set.contains(str)) {
                        set.add(str);
                    }
                }
            }
        }
    }

    public final void A04(C254783t2 r11, String str, String str2, String str3, boolean z) {
        String str4 = str3;
        0qQ.A0B(str3, 3);
        if (!str3.equals("0")) {
            C60958JuG juG = new C60958JuG(r11, (Long) null, (String) null, str4, str2, 0, z, false);
            C278394wo A002 = C278384wn.A00(this.A01);
            A002.A01(juG, str);
            synchronized (A002) {
                Set set = A002.A02;
                if (!set.contains(str2)) {
                    set.add(str2);
                }
            }
        }
    }

    public static final void A00(C300915yA r8, C60958JuG juG, Integer num, String str) {
        int intValue;
        UserSession userSession = r8.A01;
        C278394wo A002 = C278384wn.A00(userSession);
        if (num == null || !((intValue = num.intValue()) == 0 || intValue == 1)) {
            String str2 = juG.A04;
            if (str2.length() != 0 && !str2.equals("0")) {
                C254783t2 r3 = juG.A00;
                if (!A002.A03(str)) {
                    if (juG.A01 == 1 && r3 != null) {
                        2L2.A00(userSession).Ed4(new DirectMessageIdentifier((2FW) null, juG.A05, (String) null), r3, 100, str2);
                    }
                    A002.A01(juG, str);
                } else if (num != null && num.intValue() == -1 && juG.A01 == 1 && r3 != null) {
                    2L2.A00(userSession).Ed4(new DirectMessageIdentifier((2FW) null, juG.A05, (String) null), r3, 100, str2);
                }
            }
        }
    }

    public static final boolean A01(C300915yA r6, long j, boolean z) {
        long j2 = r6.A00;
        if (j2 == 0 || j / 1000 <= j2 || !C66797Mcj.A02(r6.A01, z)) {
            return false;
        }
        return true;
    }

    public C300915yA(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = 1Au.A00(userSession).A01.getLong("odnc_last_opt_in_timestamp_ms", 0);
    }
}
