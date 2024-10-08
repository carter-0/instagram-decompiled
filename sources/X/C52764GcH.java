package X;

import java.util.List;

/* renamed from: X.GcH  reason: case insensitive filesystem */
public final class C52764GcH extends C308786Vp {
    public final int A00;
    public final 1Xj A01;
    public final C233402vf A02;
    public final C249863kU A03;

    public final int A03(C233472vm r9, int i, int i2, int i3) {
        0qQ.A0B(r9, 0);
        int i4 = i3;
        if (i3 == this.A00 && this.A01.CcK()) {
            return i3;
        }
        return A02(i, i2, i4, A01(i3, r9.A03()), r9.A07(), r9.A08());
    }

    public final 1PW A08(List list) {
        0qQ.A0B(list, 0);
        1PW A08 = super.A08(list);
        int i = this.A00;
        int A05 = A05(list);
        if (A05 == -1) {
            A05 = this.A00;
        }
        A08.A09 = i - A05;
        return A08;
    }

    public final void A0G(1PW r2, int i, int i2, int i3, int i4) {
        0qQ.A0B(r2, 0);
        super.A0G(r2, i, i2, i3, i4);
        int i5 = -1;
        if (i != -1) {
            i5 = (i3 - i) - 1;
        }
        r2.A09 = i5;
    }

    public final boolean A0K(C233472vm r2) {
        return false;
    }

    public /* synthetic */ C52764GcH(1Xj r4, C228812mN r5, C233402vf r6, C249863kU r7, int i) {
        super(new C233672wA(), new C233512vq(r5), true);
        this.A03 = r7;
        this.A00 = i;
        this.A02 = r6;
        this.A01 = r4;
    }

    public final int A01(int i, int i2) {
        return Math.max(this.A00 + i2, i + 1);
    }

    public final /* bridge */ /* synthetic */ int A04(Object obj) {
        return C51969G9p.A0l(obj).getPosition();
    }

    public final /* bridge */ /* synthetic */ C233472vm A09(Object obj) {
        return GV8.A00(obj);
    }

    public final /* bridge */ /* synthetic */ Object A0A(Object obj) {
        return this.A02.BTe(C51969G9p.A0l(obj).getPosition());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r4.A01.CcK() == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0H(X.C252093oY r5, X.1PW r6, X.C233472vm r7, int r8, int r9, int r10) {
        /*
            r4 = this;
            X.C51972G9s.A1D(r7, r6)
            X.3kU r0 = r4.A03
            java.util.LinkedList r0 = r0.A02
            boolean r0 = r0.isEmpty()
            r3 = 0
            if (r0 != 0) goto L_0x0031
            int r0 = r4.A00
            if (r10 != r0) goto L_0x001b
            X.1Xj r0 = r4.A01
            boolean r1 = r0.CcK()
            r0 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r2 = 1
            if (r0 != 0) goto L_0x0030
            java.util.Set r0 = r4.A0D
            int r1 = r0.size()
            int r0 = r7.A07()
            if (r1 < r0) goto L_0x0031
            java.lang.String r0 = "consumed_media_gap_did_meet"
            r6.A01(r0)
        L_0x0030:
            return r2
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52764GcH.A0H(X.3oY, X.1PW, X.2vm, int, int, int):boolean");
    }

    public final /* bridge */ /* synthetic */ boolean A0I(C252093oY r2, C233472vm r3, Object obj, int i, int i2, int i3, int i4, int i5) {
        return false;
    }
}
