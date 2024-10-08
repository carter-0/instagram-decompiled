package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6VQ  reason: invalid class name */
public final class AnonymousClass6VQ extends C308786Vp {
    public boolean A00;
    public final int A01;
    public final UserSession A02;
    public final C270414gh A03;
    public final boolean A04 = true;
    public final C233172vA A05;
    public final C310006aH A06;
    public final C249863kU A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D = true;

    public AnonymousClass6VQ(UserSession userSession, C233172vA r5, C310006aH r6, C270414gh r7, C249863kU r8, C233522vr r9, int i, boolean z, boolean z2) {
        super(new C233672wA(), r9, z);
        this.A02 = userSession;
        this.A01 = i;
        this.A03 = r7;
        this.A07 = r8;
        this.A06 = r6;
        this.A0C = z2;
        this.A05 = r5;
        0Tu r2 = 0Tu.A05;
        this.A0B = 182.A06(r2, userSession, 36326949353699419L);
        this.A08 = 182.A06(r2, userSession, 36326949353764956L);
        this.A0A = 182.A06(r2, userSession, 36329152671924056L);
        this.A09 = 182.A06(r2, userSession, 36329152671989593L);
    }

    public final int A03(C233472vm r14, int i, int i2, int i3) {
        int max;
        0qQ.A0B(r14, 0);
        if (this.A0B) {
            boolean z = this.A0C;
            r14.A01 = z;
            this.A05.A05 = Boolean.valueOf(z);
        }
        int i4 = i;
        int i5 = i2;
        if (this.A0A) {
            C233172vA r4 = this.A05;
            if (i == -1 && i5 == -1) {
                max = this.A01 + r14.A03();
            } else {
                int A072 = r14.A07();
                int A082 = r14.A08();
                int i6 = 0;
                int i7 = 0;
                if (i != -1) {
                    i7 = A072 + i + 1;
                }
                if (i5 != -1) {
                    i6 = i2 + A082 + 1;
                }
                max = Math.max(i7, i6);
            }
            r4.A0D = Integer.valueOf(max);
            r4.A0A = Integer.valueOf(r14.A03());
        }
        int i8 = i3;
        return A02(i4, i5, i8, A01(i8, r14.A03()), r14.A07(), r14.A08());
    }

    public final 1PW A08(List list) {
        0qQ.A0B(list, 0);
        1PW A082 = super.A08(list);
        int i = this.A00;
        int A052 = A05(list);
        if (A052 == -1) {
            A052 = this.A01;
        }
        A082.A09 = i - A052;
        int i2 = this.A00;
        int A062 = A06(list);
        if (A062 == -1) {
            A062 = this.A01;
        }
        A082.A0A = i2 - A062;
        return A082;
    }

    public final void A0G(1PW r3, int i, int i2, int i3, int i4) {
        0qQ.A0B(r3, 0);
        super.A0G(r3, i, i2, i3, i4);
        int i5 = -1;
        int i6 = -1;
        if (i != -1) {
            i6 = (i3 - i) - 1;
        }
        r3.A09 = i6;
        if (i2 != -1) {
            i5 = (i3 - i2) - 1;
        }
        r3.A0A = i5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        if (r6 != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0H(X.C252093oY r9, X.1PW r10, X.C233472vm r11, int r12, int r13, int r14) {
        /*
            r8 = this;
            r0 = 3
            X.0qQ.A0B(r11, r0)
            r0 = 4
            X.0qQ.A0B(r10, r0)
            boolean r0 = r8.A04
            r7 = 0
            if (r0 == 0) goto L_0x0024
            int r2 = r14 + 1
            r1 = r12
            if (r12 >= r13) goto L_0x0013
            r1 = r13
        L_0x0013:
            int r0 = r11.A04()
            int r1 = r1 + r0
            int r0 = r1 + 1
            if (r2 < r0) goto L_0x0024
            java.lang.String r0 = "max_reel_gap_did_meet"
        L_0x001e:
            r10.A01(r0)
        L_0x0021:
            r0 = r7 ^ 1
            return r0
        L_0x0024:
            java.util.Set r0 = r8.A0D
            int r1 = r0.size()
            int r0 = r11.A01()
            r6 = 0
            if (r1 >= r0) goto L_0x0032
            r6 = 1
        L_0x0032:
            java.util.Set r0 = r8.A0E
            int r1 = r0.size()
            int r0 = r11.A02()
            if (r1 >= r0) goto L_0x008c
            r6 = 1
        L_0x003f:
            if (r12 >= r13) goto L_0x0042
            r12 = r13
        L_0x0042:
            X.4gh r0 = r8.A03
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r2 = r0.A0B
            int r1 = r2.A00()
            r0 = 1
            int r1 = r1 - r0
            if (r14 != r1) goto L_0x008f
            if (r14 <= r12) goto L_0x008f
            int r0 = r2.A00()
            long r3 = (long) r0
            com.instagram.common.session.UserSession r5 = r8.A02
            X.0Tu r2 = X.0Tu.A06
            r0 = 36599293231304162(0x8206dd00150de2, double:3.2088786407770167E-306)
            long r1 = X.182.A01(r2, r5, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x008f
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317818254530120(0x8106dd00141648, double:3.030872732056355E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x008f
            double r3 = java.lang.Math.random()
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r0
            r0 = 37162243184787679(0x8406dd001600df, double:3.5648904581775076E-306)
            double r1 = X.182.A00(r2, r5, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x008f
            java.lang.String r0 = "end_of_stories_did_meet"
            goto L_0x001e
        L_0x008c:
            if (r6 == 0) goto L_0x008f
            goto L_0x003f
        L_0x008f:
            java.lang.String r0 = "consumed_media_gap_did_meet"
            r10.A01(r0)
            r7 = r6
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VQ.A0H(X.3oY, X.1PW, X.2vm, int, int, int):boolean");
    }

    public final boolean A0K(C233472vm r4) {
        Boolean bool;
        0qQ.A0B(r4, 0);
        boolean z = false;
        if (this.A00 || ((this.A0D && (bool = r4.A00.A01) != null && !bool.booleanValue()) || (this.A08 && this.A0C))) {
            return false;
        }
        if (this.A0D.size() >= r4.A01() || this.A0E.size() >= r4.A02()) {
            z = true;
        }
        this.A00 = z;
        return z;
    }

    public final int A01(int i, int i2) {
        boolean z = this.A09;
        int i3 = this.A01 + i2;
        int i4 = i + i2;
        if (z) {
            i4 = i + 1;
        }
        return Math.max(i3, i4);
    }

    public final /* bridge */ /* synthetic */ int A04(Object obj) {
        AnonymousClass6YY r2 = (AnonymousClass6YY) obj;
        0qQ.A0B(r2, 0);
        return r2.A02.A0I;
    }

    public final /* bridge */ /* synthetic */ C233472vm A09(Object obj) {
        C250973mM r2 = (C250973mM) obj;
        0qQ.A0B(r2, 0);
        return r2.A0H.A0b;
    }

    public final /* bridge */ /* synthetic */ Object A0A(Object obj) {
        AnonymousClass6YY r2 = (AnonymousClass6YY) obj;
        0qQ.A0B(r2, 0);
        return r2.A00;
    }

    public final /* bridge */ /* synthetic */ void A0E(AnonymousClass30Y r5, C252093oY r6, Object obj, int i) {
        int i2 = this.A01;
        int i3 = -1;
        int i4 = -1;
        if (i2 != -1) {
            i4 = (i - i2) - 1;
        }
        int i5 = this.A02;
        if (i5 != -1) {
            i3 = (i - i5) - 1;
        }
        this.A05.EXL(i4, i3);
        super.A0E(r5, r6, obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r1 < ((r7 + r5.A04()) + 1)) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean A0I(X.C252093oY r4, X.C233472vm r5, java.lang.Object r6, int r7, int r8, int r9, int r10, int r11) {
        /*
            r3 = this;
            X.3mM r6 = (X.C250973mM) r6
            r0 = 5
            X.0qQ.A0B(r5, r0)
            r0 = 6
            X.0qQ.A0B(r6, r0)
            int r0 = r6.A0E
            r2 = 0
            if (r9 > r0) goto L_0x0011
            r0 = 0
            return r0
        L_0x0011:
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0023
            int r1 = r9 + 1
            if (r7 >= r8) goto L_0x001a
            r7 = r8
        L_0x001a:
            int r0 = r5.A04()
            int r7 = r7 + r0
            int r0 = r7 + 1
            if (r1 >= r0) goto L_0x0031
        L_0x0023:
            int r0 = r5.A01()
            if (r10 >= r0) goto L_0x002a
            r2 = 1
        L_0x002a:
            int r0 = r5.A02()
            if (r11 >= r0) goto L_0x0031
            r2 = 1
        L_0x0031:
            r0 = r2 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VQ.A0I(X.3oY, X.2vm, java.lang.Object, int, int, int, int, int):boolean");
    }
}
