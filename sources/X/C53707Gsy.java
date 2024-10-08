package X;

/* renamed from: X.Gsy  reason: case insensitive filesystem */
public final class C53707Gsy extends C251343mx {
    public final 2WX A00;
    public final JMU A01;
    public final boolean A02;

    public C53707Gsy(2WX r2, JMU jmu, boolean z) {
        0qQ.A0B(jmu, 3);
        this.A00 = r2;
        this.A02 = z;
        this.A01 = jmu;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        float f;
        HNO hno;
        HNO hno2;
        0qQ.A0B(r13, 0);
        long A022 = I61.A02(r13, AnonymousClass05K.A0a);
        JMU jmu = this.A01;
        C57578Id5 id5 = C57578Id5.A00;
        if (0qQ.A0K(jmu, id5)) {
            f = 0.2f;
        } else if (0qQ.A0K(jmu, C57579Id6.A00)) {
            f = 0.8f;
        } else if (0qQ.A0K(jmu, C57580Id7.A00)) {
            f = 1.0f;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        if (0qQ.A0K(jmu, id5)) {
            hno = HNO.A0l;
        } else if (0qQ.A0K(jmu, C57579Id6.A00)) {
            hno = HNO.A0I;
        } else if (0qQ.A0K(jmu, C57580Id7.A00)) {
            hno = HNO.A0q;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        if (0qQ.A0K(jmu, id5)) {
            hno2 = HNO.A0G;
        } else if (0qQ.A0K(jmu, C57579Id6.A00) || 0qQ.A0K(jmu, C57580Id7.A00)) {
            hno2 = HNO.A0H;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        2WX r5 = this.A00;
        AnonymousClass9JS A0d = C51965G9l.A0d(AnonymousClass05K.A0N, true, 4);
        if (r5 == 2WX.A02) {
            r5 = null;
        }
        2WX A002 = AnonymousClass9JR.A00(C51965G9l.A0X(r5, A0d), AnonymousClass05K.A06, 0, C51969G9p.A0F());
        int A003 = I61.A00(r13, hno);
        Integer num = AnonymousClass05K.A00;
        2WX A0Y = C51971G9r.A0Y(A002, num, C51965G9l.A0Y(A003), 4);
        2Wb A0Q = C51972G9s.A0Q(r13);
        if (!this.A02) {
            A0Q.A00(new C53931Gwb(new C56090Hsd(C52112GFg.A01(C51974G9v.A0M((2WX) null, num, 0, A022), f), Integer.valueOf(I61.A00(A0Q, hno2)))));
        }
        return C243563Zg.A0E(A0Q, r13, A0Y);
    }
}
