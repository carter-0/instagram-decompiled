package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2lU  reason: invalid class name */
public abstract class AnonymousClass2lU {
    public 1Xj A00;
    public String A01;
    public String A02;
    public String A03;
    public final C228362lW A04;
    public final String A05;
    public final Set A06 = new HashSet();
    public final UserSession A07;
    public final Set A08 = new HashSet();

    public final void A06(1Xj r10, int i) {
        String id;
        1Xj r4 = r10;
        if ((!r10.A5D() || (r4 = r10.A1c(i)) != null) && (id = r4.getId()) != null) {
            Set set = this.A08;
            if (!set.contains(id)) {
                set.add(id);
                C228362lW r3 = this.A04;
                String str = this.A05;
                Integer num = AnonymousClass05K.A01;
                r3.A04(r4, num, str);
                if (this.A06.contains(id)) {
                    r3.A06(r4, num, str, "is_load_before_start", true);
                    r3.A02(r4, num, str);
                }
            }
        }
    }

    public abstract boolean A09(1sy r1);

    public abstract boolean A0A(String str);

    public static final 1Xj A00(1Xj r1) {
        if (r1 == null || !r1.A5D()) {
            return r1;
        }
        return r1.A1c(r1.A0w());
    }

    public final void A08(1Xj r6, boolean z) {
        Integer num;
        if (z) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0C;
        }
        1Xj A002 = A00(r6);
        C228362lW r2 = this.A04;
        String str = this.A05;
        if (r2.A08(A002, num, str)) {
            r2.A05(A002, num, str, "cancel_ongoing_marker");
        }
        r2.A04(A002, num, str);
    }

    public AnonymousClass2lU(String str, UserSession userSession, 1Xj r4) {
        String str2;
        this.A05 = str;
        this.A07 = userSession;
        this.A00 = r4;
        this.A04 = AnonymousClass2lV.A00(userSession);
        1Xj A002 = A00(this.A00);
        this.A00 = A002;
        if (A002 != null) {
            str2 = A002.getId();
        } else {
            str2 = null;
        }
        this.A01 = str2;
    }

    public static final 1Xj A01(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            1Xj A022 = 1Xi.A02(((1Xg) list.get(i)).A05);
            if (A022 != null) {
                return A00(A022);
            }
        }
        return null;
    }

    public void A02(1Xj r6) {
        String id = r6.getId();
        if (id != null) {
            String str = this.A01;
            if (str != null && str.equals(id)) {
                this.A04.A03(r6, AnonymousClass05K.A00, this.A05);
            }
            String str2 = this.A03;
            if (str2 != null && str2.equals(id)) {
                this.A04.A03((1Xj) null, AnonymousClass05K.A0C, this.A05);
            }
            if (this.A08.contains(id)) {
                this.A04.A03(r6, AnonymousClass05K.A01, this.A05);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r12.A5E() != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.1Xj r12) {
        /*
            r11 = this;
            java.lang.String r2 = r12.getId()
            if (r2 == 0) goto L_0x002f
            java.util.Set r1 = r11.A06
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = r11.A01
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r12.CeS()
            if (r0 != 0) goto L_0x002f
            r1.add(r2)
            X.2lW r1 = r11.A04
            java.lang.String r4 = r11.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A02(r12, r0, r4)
        L_0x002a:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A02(r12, r0, r4)
        L_0x002f:
            return
        L_0x0030:
            java.lang.String r0 = r11.A03
            if (r0 == 0) goto L_0x0068
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0068
            r1.add(r2)
            boolean r0 = r12.A5D()
            if (r0 != 0) goto L_0x004a
            boolean r0 = r12.A5E()
            r10 = 0
            if (r0 == 0) goto L_0x004b
        L_0x004a:
            r10 = 1
        L_0x004b:
            X.2lW r1 = r11.A04
            java.lang.String r4 = r11.A05
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            boolean r6 = r12.CeS()
            r2 = 0
            java.lang.String r5 = "is_video"
            r1.A06(r2, r3, r4, r5, r6)
            java.lang.String r9 = "is_carousel"
            r5 = r1
            r6 = r2
            r7 = r3
            r8 = r4
            r5.A06(r6, r7, r8, r9, r10)
            r1.A02(r2, r3, r4)
            goto L_0x002a
        L_0x0068:
            r1.add(r2)
            X.2lW r1 = r11.A04
            java.lang.String r4 = r11.A05
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2lU.A03(X.1Xj):void");
    }

    public void A04(1Xj r6) {
        String id;
        1Xj A002 = A00(r6);
        if (A002 != null && (id = A002.getId()) != null) {
            this.A06.add(id);
            String str = this.A01;
            if (str != null && str.equals(id)) {
                this.A04.A01(A002, AnonymousClass05K.A00, AnonymousClass05K.A0C, this.A05);
            }
            this.A04.A01(A002, AnonymousClass05K.A01, AnonymousClass05K.A0C, this.A05);
        }
    }

    public void A05(1Xj r6) {
        String id;
        1Xj A002 = A00(r6);
        if (A002 != null && (id = A002.getId()) != null) {
            this.A06.add(id);
            String str = this.A01;
            if (str != null && str.equals(id)) {
                C228362lW r3 = this.A04;
                String str2 = this.A05;
                Integer num = AnonymousClass05K.A00;
                r3.A01(A002, num, AnonymousClass05K.A0Y, str2);
                r3.A02(A002, num, str2);
            }
            C228362lW r32 = this.A04;
            String str3 = this.A05;
            Integer num2 = AnonymousClass05K.A01;
            r32.A01(A002, num2, AnonymousClass05K.A0Y, str3);
            r32.A02(A002, num2, str3);
        }
    }

    public void A07(1Xj r8, boolean z) {
        String id;
        1Xj A002 = A00(r8);
        if (A002 != null && (id = A002.getId()) != null) {
            String str = this.A01;
            boolean z2 = z;
            if (str != null && str.equals(id)) {
                C228362lW r1 = this.A04;
                String str2 = this.A05;
                Integer num = AnonymousClass05K.A00;
                r1.A01(A002, num, AnonymousClass05K.A0N, str2);
                r1.A06(A002, num, str2, "is_auto_play", z2);
                if (!z) {
                    r1.A02(A002, num, str2);
                }
            }
            C228362lW r12 = this.A04;
            String str3 = this.A05;
            Integer num2 = AnonymousClass05K.A01;
            r12.A01(A002, num2, AnonymousClass05K.A0N, str3);
            r12.A06(A002, num2, str3, "is_auto_play", z2);
            if (!z) {
                r12.A02(A002, num2, str3);
            }
        }
    }
}
