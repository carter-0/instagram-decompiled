package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.GWd  reason: case insensitive filesystem */
public final class C52526GWd {
    public C238133Ar A00;
    public Integer A01;
    public String A02;
    public Set A03 = AnonymousClass7TE.A1F();
    public Set A04 = AnonymousClass7TE.A1F();
    public Set A05 = AnonymousClass7TE.A1F();
    public boolean A06;
    public final UserSession A07;
    public final C228362lW A08;
    public final String A09;

    public C52526GWd(UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A07 = userSession;
        this.A09 = str;
        this.A08 = AnonymousClass2lV.A00(userSession);
    }

    public final void A03(1Xj r9, String str) {
        1Xj A002;
        String id;
        String str2 = str;
        0qQ.A0B(str, 0);
        0qQ.A0B(r9, 1);
        if ("explore_popular".equals(str) && (A002 = A00(r9)) != null && (id = A002.getId()) != null && !this.A05.contains(id)) {
            this.A05.add(id);
            C228362lW r2 = this.A08;
            Integer num = AnonymousClass05K.A01;
            r2.A04(A002, num, str);
            if (this.A03.contains(id)) {
                r2.A06(A002, num, str2, "is_load_before_start", true);
                r2.A02(A002, num, str);
            }
        }
    }

    public static final 1Xj A00(1Xj r1) {
        if (r1 == null || !r1.A5D()) {
            return r1;
        }
        return r1.A1c(r1.A0w());
    }

    public final void A05(boolean z, boolean z2) {
        Integer num;
        if (!z) {
            num = AnonymousClass05K.A0C;
        } else if (!z2) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0N;
        }
        C228362lW r3 = this.A08;
        String str = this.A09;
        if (r3.A08((1Xj) null, num, str)) {
            r3.A05((1Xj) null, num, str, "cancel_ongoing_marker");
        }
        if (num == AnonymousClass05K.A0N) {
            this.A03 = AnonymousClass7TE.A1F();
            this.A05 = AnonymousClass7TE.A1F();
            this.A04 = AnonymousClass7TE.A1F();
            this.A02 = null;
            this.A06 = true;
        }
        r3.A04((1Xj) null, num, str);
    }

    public final void A01(1Xj r7) {
        String id;
        Integer num;
        1Xj A002 = A00(r7);
        if (A002 != null && (id = A002.getId()) != null) {
            String str = this.A02;
            if (str != null && str.equals(id)) {
                C228362lW r4 = this.A08;
                String str2 = this.A09;
                if (this.A06) {
                    num = AnonymousClass05K.A0N;
                } else {
                    num = AnonymousClass05K.A00;
                }
                r4.A01((1Xj) null, num, AnonymousClass05K.A0C, str2);
            }
            this.A08.A01(A002, AnonymousClass05K.A01, AnonymousClass05K.A0C, this.A09);
        }
    }

    public final void A02(1Xj r8) {
        String id;
        Integer num;
        Integer num2;
        1Xj A002 = A00(r8);
        if (A002 != null && (id = A002.getId()) != null) {
            this.A03.add(id);
            String str = this.A02;
            if (str != null && str.equals(id)) {
                C228362lW r6 = this.A08;
                String str2 = this.A09;
                if (this.A06) {
                    num = AnonymousClass05K.A0N;
                } else {
                    num = AnonymousClass05K.A00;
                }
                r6.A01((1Xj) null, num, AnonymousClass05K.A0Y, str2);
                Integer num3 = this.A01;
                int size = this.A03.size();
                if (num3 != null && num3.intValue() == size) {
                    if (this.A06) {
                        num2 = AnonymousClass05K.A0N;
                    } else {
                        num2 = AnonymousClass05K.A00;
                    }
                    r6.A02((1Xj) null, num2, str2);
                }
            }
            C228362lW r3 = this.A08;
            String str3 = this.A09;
            Integer num4 = AnonymousClass05K.A01;
            r3.A01(A002, num4, AnonymousClass05K.A0Y, str3);
            r3.A02(A002, num4, str3);
        }
    }

    public final void A04(1Xj r15, boolean z) {
        String id;
        Integer num;
        Integer num2;
        1Xj A002 = A00(r15);
        if (A002 != null && (id = A002.getId()) != null) {
            String str = this.A02;
            boolean z2 = z;
            if (str != null && str.equals(id)) {
                C228362lW r2 = this.A08;
                String str2 = this.A09;
                if (this.A06) {
                    num = AnonymousClass05K.A0N;
                } else {
                    num = AnonymousClass05K.A00;
                }
                Integer num3 = AnonymousClass05K.A0N;
                r2.A01((1Xj) null, num, num3, str2);
                if (this.A06) {
                    num2 = num3;
                } else {
                    num2 = AnonymousClass05K.A00;
                }
                r2.A06((1Xj) null, num2, str2, "is_auto_play", z2);
                if (!z) {
                    if (!this.A06) {
                        num3 = AnonymousClass05K.A00;
                    }
                    r2.A02((1Xj) null, num3, str2);
                }
            }
            C228362lW r8 = this.A08;
            String str3 = this.A09;
            Integer num4 = AnonymousClass05K.A01;
            r8.A01(A002, num4, AnonymousClass05K.A0N, str3);
            r8.A06(A002, num4, str3, "is_auto_play", z2);
            if (!z) {
                r8.A02(A002, num4, str3);
            }
        }
    }
}
