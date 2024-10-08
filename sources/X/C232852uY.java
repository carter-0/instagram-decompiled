package X;

import com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2uY  reason: invalid class name and case insensitive filesystem */
public final class C232852uY {
    public static final C232862uZ A02 = new Object();
    public final UserSession A00;
    public final C249763kK A01;

    public C232852uY(UserSession userSession, C249763kK r3) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final C254523sc A03(1Xj r6, AnonymousClass4DU r7, String str, int i, int i2) {
        String str2;
        if (!AnonymousClass3WX.A00(r6, r7)) {
            return null;
        }
        UserSession userSession = this.A00;
        C254523sc A04 = C254513sb.A04(r6, r7, 002.A0R("carousel_", str));
        A04.A0G(userSession, r6);
        A04.A09(i2);
        A04.A07 = -1;
        String str3 = AnonymousClass1QI.A00.A02.A00;
        if (str3 != null) {
            A04.A65 = str3;
        }
        A04.A29 = true;
        C232862uZ.A01(A04);
        C232862uZ.A00(userSession, A04, r6, r7.getModuleName());
        C232862uZ.A02(A04, r6.A1c(i));
        A04.A5A = r6.A33(i);
        1Xj A1c = r6.A1c(i);
        if (A1c != null) {
            str2 = A1c.A0C.Aza();
        } else {
            str2 = null;
        }
        A04.A59 = str2;
        return A04;
    }

    public final C254523sc A04(1Xj r8, AnonymousClass4DU r9, String str, int i, int i2) {
        0qQ.A0B(r8, 2);
        C254523sc A022 = C254513sb.A02(this.A00, r8, r9, this.A01, Integer.valueOf(i), Integer.valueOf(i2), str);
        A00(this, A022, r8, r9);
        return A022;
    }

    public static final void A00(C232852uY r3, C254523sc r4, 1Xj r5, AnonymousClass4DU r6) {
        C250183l2 AaH;
        C250183l2 AaH2;
        C250513lZ injected;
        C257743xt BF6;
        IGFormatLiquidityUseCaseEnum B7T;
        if (r4 != null) {
            r4.A5n = 14i.A01();
            UserSession userSession = r3.A00;
            r4.A5q = C71342cb.A00(userSession).A03();
            boolean z = false;
            if (C71342cb.A00(userSession).A03 != null) {
                z = true;
            }
            r4.A1i = Boolean.valueOf(z);
            HashMap hashMap = new HashMap();
            if (C233822wX.A03(r5) != null) {
                hashMap.put("product_collection_id", C233822wX.A03(r5));
            }
            r4.A85 = hashMap;
            C232862uZ.A01(r4);
            C232862uZ.A00(userSession, r4, r5, r6.getModuleName());
            C232862uZ.A02(r4, r5);
            if (!(r5 == null || (injected = r5.A0C.getInjected()) == null || (BF6 = injected.BF6()) == null || (B7T = BF6.B7T()) == null)) {
                r4.A5J = B7T.A00;
            }
            0qQ.A0B(r5, 1);
            if (r5.CcK()) {
                C250513lZ injected2 = r5.A0C.getInjected();
                C269884fq r32 = null;
                if (!(injected2 == null || (AaH2 = injected2.AaH()) == null)) {
                    r32 = AaH2.B5N();
                }
                boolean z2 = true;
                boolean z3 = false;
                if (r32 != null) {
                    z3 = true;
                }
                C250513lZ injected3 = r5.A0C.getInjected();
                if (injected3 == null || (AaH = injected3.AaH()) == null || AaH.B5D() == null) {
                    z2 = false;
                }
                r4.A1E = Boolean.valueOf(z3);
                r4.A1F = Boolean.valueOf(z2);
            }
        }
    }

    public final C254523sc A01(C254223s8 r4, 1Xj r5, AnonymousClass4DU r6, int i, long j) {
        0qQ.A0B(r5, 2);
        UserSession userSession = this.A00;
        String A0H = C231122qu.A0H(userSession, r5.getId());
        C254523sc A04 = C254513sb.A04(r5, r6, "time_spent");
        A04.A0G(userSession, r5);
        A04.A09(i);
        A04.A5X = A0H;
        A04.A0B(j);
        if (r4 != null) {
            A04.A0v = r4;
        }
        C249763kK r0 = this.A01;
        if (r0 != null) {
            A04.A6t = r0.getSessionId();
        }
        return A04;
    }

    public final C254523sc A02(1Xj r10, AnonymousClass4DU r11, int i) {
        UserSession userSession = this.A00;
        C254523sc A022 = C254513sb.A02(userSession, r10, r11, this.A01, Integer.valueOf(i), -1, "sub_impression");
        C232862uZ.A01(A022);
        C232862uZ.A00(userSession, A022, r10, r11.getModuleName());
        return A022;
    }

    public final C254523sc A05(1Xj r8, AnonymousClass4DU r9, String str, int i, int i2) {
        C254523sc A022 = C254513sb.A02(this.A00, r8, r9, this.A01, Integer.valueOf(i), Integer.valueOf(i2), str);
        C232862uZ.A01(A022);
        return A022;
    }

    public final C254523sc A06(AnonymousClass4DU r8, AnonymousClass3OA r9, String str, int i) {
        C254523sc A012 = C254513sb.A01(this.A00, (1Xj) null, r8, r9, this.A01, Integer.valueOf(i), str);
        A00(this, A012, r9.A0K, r8);
        return A012;
    }
}
