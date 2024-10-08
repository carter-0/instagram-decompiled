package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class N4P extends AnonymousClass0T0 {
    public List A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final ImageUrl A0C;
    public final C242373Tu A0D;
    public final C242243Te A0E;
    public final MessagingUser A0F;
    public final CreatorSubscriberThreadInfo A0G;
    public final C272964li A0H;
    public final C327857Cl A0I;
    public final C68179N3u A0J;
    public final C254793t3 A0K;
    public final C254793t3 A0L;
    public final Long A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final List A0R;
    public final List A0S;
    public final List A0T;
    public final Map A0U;
    public final Map A0V;
    public final Map A0W;
    public final Map A0X;
    public final AnonymousClass0eM A0Y = C73907Pli.A00(this, 18);
    public final AnonymousClass0eM A0Z = C73907Pli.A00(this, 19);
    public final AnonymousClass0eM A0a = C73907Pli.A00(this, 20);
    public final AnonymousClass0eM A0b = C73907Pli.A00(this, 21);
    public final AnonymousClass0eM A0c = C73907Pli.A00(this, 22);
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;

    public static User A01(N4P n4p) {
        return ((C68303N9q) n4p.A09().get(0)).A00;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N4P) {
                N4P n4p = (N4P) obj;
                if (!(0qQ.A0K(this.A0L, n4p.A0L) && 0qQ.A0K(this.A0Q, n4p.A0Q) && this.A0A == n4p.A0A && this.A08 == n4p.A08 && 0qQ.A0K(this.A0P, n4p.A0P) && 0qQ.A0K(this.A0C, n4p.A0C) && 0qQ.A0K(this.A0N, n4p.A0N) && this.A12 == n4p.A12 && this.A10 == n4p.A10 && this.A0w == n4p.A0w && this.A04 == n4p.A04 && this.A0B == n4p.A0B && this.A0v == n4p.A0v && this.A0o == n4p.A0o && this.A0q == n4p.A0q && this.A0n == n4p.A0n && this.A0u == n4p.A0u && this.A0z == n4p.A0z && this.A0i == n4p.A0i && this.A0k == n4p.A0k && this.A13 == n4p.A13 && this.A0s == n4p.A0s && this.A0r == n4p.A0r && this.A0e == n4p.A0e && this.A0d == n4p.A0d && this.A0y == n4p.A0y && 0qQ.A0K(this.A0X, n4p.A0X) && 0qQ.A0K(this.A0F, n4p.A0F) && 0qQ.A0K(this.A0T, n4p.A0T) && 0qQ.A0K(this.A00, n4p.A00) && 0qQ.A0K(this.A0S, n4p.A0S) && 0qQ.A0K(this.A0J, n4p.A0J) && 0qQ.A0K(this.A0R, n4p.A0R) && this.A0j == n4p.A0j && 0qQ.A0K(this.A0O, n4p.A0O) && 0qQ.A0K(this.A0G, n4p.A0G) && this.A0l == n4p.A0l && this.A0p == n4p.A0p && this.A0g == n4p.A0g && this.A0x == n4p.A0x && this.A0m == n4p.A0m && 0qQ.A0K(this.A0K, n4p.A0K) && this.A09 == n4p.A09 && 0qQ.A0K(this.A0E, n4p.A0E) && this.A07 == n4p.A07 && this.A06 == n4p.A06 && this.A0I == n4p.A0I && 0qQ.A0K(this.A0H, n4p.A0H) && this.A11 == n4p.A11 && 0qQ.A0K(this.A0M, n4p.A0M) && this.A0h == n4p.A0h && this.A01 == n4p.A01 && 0qQ.A0K(this.A0U, n4p.A0U) && this.A0f == n4p.A0f && this.A0t == n4p.A0t && 0qQ.A0K(this.A0D, n4p.A0D) && this.A02 == n4p.A02 && this.A03 == n4p.A03 && this.A05 == n4p.A05 && 0qQ.A0K(this.A0V, n4p.A0V) && 0qQ.A0K(this.A0W, n4p.A0W))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static String A02(N4P n4p) {
        C242243Te r0 = n4p.A0E;
        if (r0 != null) {
            return r0.A07;
        }
        return null;
    }

    public static String A03(N4P n4p) {
        return C300965yF.A07(n4p.A0L);
    }

    public static boolean A04(UserSession userSession, N4P n4p) {
        return n4p.A0S.contains(userSession.A06);
    }

    public static boolean A05(N4P n4p) {
        return OPx.A00(n4p.A0A);
    }

    public final int A06() {
        C242243Te r0 = this.A0E;
        if (r0 != null) {
            return r0.A00;
        }
        return 0;
    }

    public final C68303N9q A07() {
        for (C68303N9q n9q : this.A0T) {
            if (MessagingUser.A00(n9q.A00).A02(this.A0F)) {
                return n9q;
            }
        }
        return null;
    }

    public final C254743sy A08() {
        DirectThreadKey directThreadKey;
        String str = this.A0Q;
        if (str == null) {
            return C300965yF.A05(this.A0L);
        }
        Object obj = this.A0L;
        0qQ.A0B(obj, 0);
        if (obj instanceof C254763t0) {
            C254763t0 r2 = (C254763t0) obj;
            0qQ.A0B(r2, 0);
            DirectThreadKey A0e2 = C66581MXm.A0e(r2.A00);
            A0e2.A01 = str;
            directThreadKey = A0e2;
        } else {
            boolean z = obj instanceof MsysThreadId;
            directThreadKey = obj;
            if (!z) {
                if (obj instanceof C69042Ndc) {
                    C69042Ndc ndc = (C69042Ndc) obj;
                    DirectThreadKey A0e3 = C66581MXm.A0e(ndc.A00.A00);
                    A0e3.A01 = str;
                    directThreadKey = new DirectMsysMixedThreadKey(A0e3, ndc.A01);
                } else {
                    throw C66582MXn.A0k(obj, AnonymousClass000.A00(108), AnonymousClass7TE.A1A());
                }
            }
        }
        return (C254743sy) directThreadKey;
    }

    public final List A09() {
        return JTO.A15(this.A0c);
    }

    public final void A0A(User user, String str) {
        List<C68303N9q> list = this.A0T;
        int i = 0;
        for (C68303N9q n9q : list) {
            if (!C66582MXn.A1T(n9q.A00, user)) {
                i++;
            } else if (i != -1) {
                C68303N9q n9q2 = (C68303N9q) list.get(i);
                list.remove(n9q2);
                User user2 = n9q2.A00;
                boolean z = n9q2.A07;
                boolean z2 = n9q2.A08;
                boolean z3 = n9q2.A0A;
                boolean z4 = n9q2.A04;
                boolean z5 = n9q2.A09;
                boolean z6 = n9q2.A0D;
                boolean z7 = n9q2.A0C;
                boolean z8 = n9q2.A0B;
                boolean z9 = n9q2.A05;
                boolean z10 = n9q2.A0F;
                boolean z11 = n9q2.A0E;
                boolean z12 = n9q2.A06;
                0qQ.A0B(user2, 0);
                boolean z13 = z9;
                boolean z14 = z8;
                boolean z15 = z7;
                boolean z16 = z6;
                boolean z17 = z5;
                boolean z18 = z4;
                boolean z19 = z3;
                boolean z20 = z2;
                boolean z21 = z;
                list.add(i, new C68303N9q(user2, str, z21, z20, z19, z18, z17, z16, z15, z14, z13, z10, z11, z12));
                return;
            } else {
                return;
            }
        }
    }

    public final boolean A0C() {
        return 0qQ.A0K(this.A0N, "pending");
    }

    public final boolean A0E(String str) {
        List<C68303N9q> list = this.A0T;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C68303N9q n9q : list) {
                if (MessagingUser.A00(n9q.A00).A03(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A10, AnonymousClass7TF.A09(this.A12, (((((((((((AnonymousClass7TE.A0K(this.A0L) + AnonymousClass7TG.A0E(this.A0Q)) * 31) + this.A0A) * 31) + this.A08) * 31) + AnonymousClass7TG.A0E(this.A0P)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TG.A0E(this.A0N)) * 31));
        int A093 = AnonymousClass7TF.A09(this.A0d, AnonymousClass7TF.A09(this.A0e, AnonymousClass7TF.A09(this.A0r, AnonymousClass7TF.A09(this.A0s, AnonymousClass7TF.A09(this.A13, AnonymousClass7TF.A09(this.A0k, AnonymousClass7TF.A09(this.A0i, AnonymousClass7TF.A09(this.A0z, AnonymousClass7TF.A09(this.A0u, AnonymousClass7TF.A09(this.A0n, AnonymousClass7TF.A09(this.A0q, AnonymousClass7TF.A09(this.A0o, AnonymousClass7TF.A09(this.A0v, (((AnonymousClass7TF.A09(this.A0w, A092) + this.A04) * 31) + this.A0B) * 31)))))))))))));
        int A072 = AnonymousClass7TF.A07(this.A0S, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A0T, AnonymousClass7TF.A07(this.A0F, (AnonymousClass7TF.A09(this.A0y, A093) + AnonymousClass7TG.A0C(this.A0X)) * 31))));
        boolean z = this.A0j;
        int A094 = AnonymousClass7TF.A09(this.A0x, AnonymousClass7TF.A09(this.A0g, AnonymousClass7TF.A09(this.A0p, AnonymousClass7TF.A09(this.A0l, (((AnonymousClass7TF.A09(z, (AnonymousClass7TF.A07(this.A0J, A072) + AnonymousClass7TG.A0C(this.A0R)) * 31) + AnonymousClass7TG.A0E(this.A0O)) * 31) + AnonymousClass7TG.A0C(this.A0G)) * 31))));
        int A073 = AnonymousClass7TF.A07(this.A0H, AnonymousClass7TF.A07(this.A0I, (((((((((AnonymousClass7TF.A09(this.A0m, A094) + AnonymousClass7TG.A0C(this.A0K)) * 31) + this.A09) * 31) + AnonymousClass7TG.A0C(this.A0E)) * 31) + this.A07) * 31) + this.A06) * 31));
        boolean z2 = this.A0h;
        return ((((((((((AnonymousClass7TF.A09(this.A0t, AnonymousClass7TF.A09(this.A0f, AnonymousClass7TF.A07(this.A0U, (AnonymousClass7TF.A09(z2, (AnonymousClass7TF.A09(this.A11, A073) + AnonymousClass7TG.A0C(this.A0M)) * 31) + this.A01) * 31))) + AnonymousClass7TG.A0C(this.A0D)) * 31) + this.A02) * 31) + this.A03) * 31) + this.A05) * 31) + AnonymousClass7TG.A0C(this.A0V)) * 31) + AnonymousClass7TE.A0L(this.A0W);
    }

    public static int A00(N4P n4p) {
        return n4p.A09().size();
    }

    public final boolean A0B() {
        if (A05(this) || !AnonymousClass7TE.A1b(JTO.A15(this.A0c)) || !A01(this).CXO()) {
            return false;
        }
        return true;
    }

    public final boolean A0D() {
        C242243Te r0;
        if (!A05(this) || (r0 = this.A0E) == null || !r0.A0Q) {
            return false;
        }
        return true;
    }

    public N4P(ImageUrl imageUrl, C242373Tu r4, C242243Te r5, MessagingUser messagingUser, CreatorSubscriberThreadInfo creatorSubscriberThreadInfo, C272964li r8, C327857Cl r9, C68179N3u n3u, C254793t3 r11, C254793t3 r12, Long l, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, Map map, Map map2, Map map3, Map map4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27) {
        0qQ.A0B(messagingUser, 28);
        List list5 = list3;
        0qQ.A0B(list5, 31);
        this.A0L = r11;
        this.A0Q = str;
        this.A0A = i;
        this.A08 = i2;
        this.A0P = str2;
        this.A0C = imageUrl;
        this.A0N = str3;
        this.A12 = z;
        this.A10 = z2;
        this.A0w = z3;
        this.A04 = i3;
        this.A0B = i4;
        this.A0v = z4;
        this.A0o = z5;
        this.A0q = z6;
        this.A0n = z7;
        this.A0u = z8;
        this.A0z = z9;
        this.A0i = z10;
        this.A0k = z11;
        this.A13 = z12;
        this.A0s = z13;
        this.A0r = z14;
        this.A0e = z15;
        this.A0d = z16;
        this.A0y = z17;
        this.A0X = map;
        this.A0F = messagingUser;
        this.A0T = list;
        this.A00 = list2;
        this.A0S = list5;
        this.A0J = n3u;
        this.A0R = list4;
        this.A0j = z18;
        this.A0O = str4;
        this.A0G = creatorSubscriberThreadInfo;
        this.A0l = z19;
        this.A0p = z20;
        this.A0g = z21;
        this.A0x = z22;
        this.A0m = z23;
        this.A0K = r12;
        this.A09 = i5;
        this.A0E = r5;
        this.A07 = i6;
        this.A06 = i7;
        this.A0I = r9;
        this.A0H = r8;
        this.A11 = z24;
        this.A0M = l;
        this.A0h = z25;
        this.A01 = i8;
        this.A0U = map2;
        this.A0f = z26;
        this.A0t = z27;
        this.A0D = r4;
        this.A02 = i9;
        this.A03 = i10;
        this.A05 = i11;
        this.A0V = map3;
        this.A0W = map4;
    }
}
