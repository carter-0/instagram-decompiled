package X;

/* renamed from: X.Gw0  reason: case insensitive filesystem */
public final class C53895Gw0 extends C251343mx {
    public final C56107Hsu A00;
    public final 0sP A01;
    public final 0sP A02;
    public final 0sP A03;

    public C53895Gw0(C56107Hsu hsu, 0sP r3, 0sP r4, 0sP r5) {
        0qQ.A0B(r4, 3);
        this.A00 = hsu;
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = r5;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r21) {
        AnonymousClass3Y5 r7 = r21;
        0qQ.A0B(r7, 0);
        int A002 = I61.A00(r7, C56493HzP.A07);
        int A003 = I61.A00(r7, C56493HzP.A08);
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0Q = C51973G9u.A0Q((2WX) null, C51965G9l.A0c(AnonymousClass05K.A04, 0, C56493HzP.A00), 0, C56493HzP.A01);
        Integer num = AnonymousClass05K.A0C;
        2WX A0X = C51971G9r.A0X(A0Q, num, 0.0f, 1);
        2Wb A0Q2 = C51972G9s.A0Q(r7);
        C56107Hsu hsu = this.A00;
        if (hsu != null) {
            Integer num2 = hsu.A01;
            int intValue = num2.intValue();
            C251263mp r3 = null;
            if (intValue == 0) {
                String str = hsu.A02;
                if (str != null) {
                    r3 = new C53640Grt(str);
                }
            } else if (intValue == 1 || intValue == 2) {
                C56130HtI htI = hsu.A00;
                if (htI != null) {
                    r3 = new C53671GsO(htI, num2);
                }
            } else {
                r3 = new AnonymousClass3XA();
            }
            A0Q2.A00(r3);
        }
        2WX A004 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(G9t.A10((2WX) null, AnonymousClass05K.A00, C56493HzP.A00(A0Q2, Integer.valueOf(A003), 16.0f, A002)), AnonymousClass05K.A06, 0, C56493HzP.A03), AnonymousClass05K.A0G, 0, C56493HzP.A02);
        Integer num3 = null;
        2Wb A0S = AnonymousClass7TG.A0S(A0Q2.A00);
        if (hsu != null) {
            num3 = hsu.A01;
        }
        if (num3 == AnonymousClass05K.A01 || (hsu != null && hsu.A01 == num)) {
            A0S.A00(new C53800GuT(A00(A0S, HNN.A0I, (HNN) null, C244013aV.A0E(A0S, 2131966305)), (C251263mp) null, A0X, C244013aV.A0E(A0S, 2131966400), (String) null, C58708IwH.A01(this, 15)));
        }
        A0S.A00(new C53800GuT(A00(A0S, HNN.A0O, (HNN) null, C244013aV.A0E(A0S, 2131966308)), (C251263mp) null, A0X, C244013aV.A0E(A0S, 2131966309), (String) null, C58708IwH.A01(this, 16)));
        2WX r16 = A0X;
        C51971G9r.A1D(new C53800GuT(A00(A0S, HNN.A0N, (HNN) null, C244013aV.A0E(A0S, 2131966307)), A00(A0S, HNN.A0F, HNN.A0E, C244013aV.A0E(A0S, 2131966304)), r16, C244013aV.A0E(A0S, 2131966286), (String) null, C58708IwH.A01(this, 17)), A0S, A0Q2, A004);
        return new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A0Q2.A01, false);
    }

    public static final C53854GvL A00(C70832Wc r9, HNN hnn, HNN hnn2, String str) {
        return new C53854GvL((2WX) null, hnn, hnn2, (Integer) null, Integer.valueOf(I61.A00(r9, HNO.A0Y)), str, (C62320sa) null, 12, true);
    }
}
