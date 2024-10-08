package X;

import java.util.List;

/* renamed from: X.Gtc  reason: case insensitive filesystem */
public final class C53747Gtc extends C251343mx {
    public final C56107Hsu A00;
    public final 0sL A01;
    public final List A02;
    public final C62320sa A03;

    public C53747Gtc(C56107Hsu hsu, List list, C62320sa r4, 0sL r5) {
        0qQ.A0B(r5, 3);
        this.A02 = list;
        this.A00 = hsu;
        this.A01 = r5;
        this.A03 = r4;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r18) {
        AnonymousClass3Y5 r6 = r18;
        0qQ.A0B(r6, 0);
        int A002 = I61.A00(r6, C56493HzP.A07);
        int A003 = I61.A00(r6, C56493HzP.A08);
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0X = C51971G9r.A0X(C51973G9u.A0Q((2WX) null, C51965G9l.A0c(AnonymousClass05K.A04, 0, C56493HzP.A00), 0, C56493HzP.A01), AnonymousClass05K.A0C, 1.0f, 1);
        2Wb A0Q = C51972G9s.A0Q(r6);
        A0Q.A00(new C53882Gvn(this.A03));
        C56107Hsu hsu = this.A00;
        if (hsu != null) {
            Integer num = hsu.A01;
            int intValue = num.intValue();
            C251263mp r1 = null;
            if (intValue == 0) {
                String str = hsu.A02;
                if (str != null) {
                    r1 = new C53640Grt(str);
                }
            } else if (intValue == 1 || intValue == 2) {
                C56130HtI htI = hsu.A00;
                if (htI != null) {
                    r1 = new C53671GsO(htI, num);
                }
            } else {
                r1 = new AnonymousClass3XA();
            }
            A0Q.A00(r1);
        }
        2WX A004 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(G9t.A10((2WX) null, AnonymousClass05K.A00, C56493HzP.A00(A0Q, Integer.valueOf(A003), 16.0f, A002)), AnonymousClass05K.A06, 0, C56493HzP.A03), AnonymousClass05K.A0G, 0, C56493HzP.A02);
        2Wb A0w = G9t.A0w(A0Q);
        for (C56089Hsc hsc : this.A02) {
            A0w.A00(new C53800GuT((C251263mp) null, (C251263mp) null, A0X, C244013aV.A0E(A0w, hsc.A00), (String) null, C58688Ivx.A00(hsc, this, 28)));
        }
        C51967G9n.A1F(A0w, A0Q, A004);
        return new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A0Q.A01, false);
    }
}
