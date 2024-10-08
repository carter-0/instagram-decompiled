package X;

import java.util.List;

/* renamed from: X.7h8  reason: invalid class name and case insensitive filesystem */
public final class C337927h8 extends C243963aQ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final AnonymousClass3AS A07;
    public final C331097Pn A08;
    public final C228432lf A09;
    public final C70852Wg A0A;
    public final C334327b5 A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E = true;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final 2WX A0P;
    public final C337727go A0Q;
    public final Integer A0R;
    public final List A0S;
    public final C62320sa A0T;

    public C337927h8(AnonymousClass3AS r3, C331097Pn r4, C228432lf r5, 2WX r6, C70852Wg r7, C334327b5 r8, C337727go r9, Integer num, List list, List list2, C62320sa r13, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A0A = r7;
        this.A0R = num;
        this.A0H = z;
        this.A01 = i;
        this.A06 = i2;
        this.A05 = i3;
        this.A04 = i4;
        this.A0G = z2;
        this.A0K = true;
        this.A0C = list;
        this.A0I = z3;
        this.A0O = z4;
        this.A0J = z5;
        this.A0M = z6;
        this.A0N = z7;
        this.A0F = z8;
        this.A00 = i5;
        this.A03 = i6;
        this.A02 = i7;
        this.A07 = r3;
        this.A0Q = r9;
        this.A0S = list2;
        this.A09 = r5;
        this.A0L = z9;
        this.A0B = r8;
        this.A08 = r4;
        this.A0T = r13;
        this.A0D = z10;
        this.A0P = r6;
    }

    public final C244523bK A0X(C244463bE r23) {
        2WU r4;
        0sP ixv;
        C244463bE r8 = r23;
        0qQ.A0B(r8, 0);
        2Wa A002 = C243643Zq.A00(r8, C337937h9.A00);
        2Wa A003 = C243643Zq.A00(r8, new C377179Kv(this, 23));
        Integer num = this.A0R;
        if (num == null) {
            num = r8.A05.A02.A01.A06;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            C62320sa r7 = this.A0T;
            List list = this.A0S;
            C337727go r5 = this.A0Q;
            Object obj = A003.A03;
            r4 = new 2WU(C243983aS.A00, new AVN(this), 3, false);
            ixv = new C58810Ixv(0, obj, A002, r7, r8, this, list, r5);
        } else if (intValue == 1) {
            C62320sa r13 = this.A0T;
            List list2 = this.A0S;
            C337727go r3 = this.A0Q;
            Object obj2 = A003.A03;
            r4 = new 2WU(C243983aS.A00, new C337947hA(this), 3, false);
            ixv = new C377529Me(0, A002, this, r13, obj2, list2, r3, r8);
        } else {
            throw new RuntimeException();
        }
        2WU r14 = r4;
        AnonymousClass2WG r132 = new AnonymousClass2WG(r14, (C62320sa) null, ixv, r8.A01());
        return new C244523bK(this.A0P, new C337957hB(this.A0A, new C377179Kv(A002, 22), this.A01, this.A05, this.A06), r132);
    }
}
