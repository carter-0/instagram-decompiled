package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GwM  reason: case insensitive filesystem */
public final class C53916GwM extends C251343mx {
    public final int A00;
    public final AnonymousClass3B3 A01;
    public final 2WX A02;
    public final C54627HLk A03;
    public final HMY A04;
    public final List A05;
    public final 0sP A06;
    public final 0sP A07;
    public final 0sP A08;
    public final 0sP A09;
    public final 0sL A0A;
    public final 0sJ A0B;
    public final boolean A0C;
    public final boolean A0D;

    public final C251263mp A0X(AnonymousClass3Y5 r52) {
        C53096GiU giU;
        Boolean bool;
        float f;
        0sP r3;
        AnonymousClass3Y5 r2 = r52;
        0qQ.A0B(r2, 0);
        long A0G = C51970G9q.A0G();
        2Wa A002 = C243643Zq.A00(r2, C58554Itn.A00);
        C54627HLk hLk = this.A03;
        HMY hmy = this.A04;
        Object A003 = AnonymousClass3Zw.A00(r2, C58687Ivw.A00(r2, this, 40), new Object[]{hLk, hmy});
        2Wa A004 = C243643Zq.A00(r2, C58553Itm.A00);
        2Wa A005 = C243643Zq.A00(r2, C58550Itj.A00);
        List list = this.A05;
        int size = list.size();
        Number number = (Number) A005.A03;
        int intValue = number.intValue();
        if (intValue >= 0 && intValue < size && (r3 = this.A07) != null) {
            r3.invoke(list.get(number.intValue()));
        }
        C334997cD r21 = (C334997cD) AnonymousClass3Zw.A00(r2, C58552Itl.A00, new Object[0]);
        if (this.A0C) {
            giU = new C53096GiU(6, r21, A005, this);
        } else {
            giU = null;
        }
        2Wa A006 = C243643Zq.A00(r2, C58551Itk.A00);
        C243773a4.A00(r2, C58697Iw6.A00(A006, r21, this, 19), AnonymousClass7TF.A1b(list.size()));
        Integer A0t = C51968G9o.A0t(list);
        C55947HqB hqB = (C55947HqB) 00k.A0J(list);
        if (hqB != null) {
            bool = Boolean.valueOf(hqB.A01);
        } else {
            bool = null;
        }
        C243773a4.A00(r2, C58697Iw6.A00(A006, r21, this, 20), new Object[]{A0t, bool, A006.A03});
        0sP A012 = AnonymousClass3j0.A01(r2, C59105J6n.A02(this, 0));
        Object A007 = AnonymousClass3Zw.A00(r2, C58677Ivm.A00(this, 39), new Object[]{list});
        C55947HqB hqB2 = (C55947HqB) 00k.A0J(list);
        if (list.size() != 1 || hqB2 == null || (!(hqB2 instanceof C54518HHe) && !(hqB2 instanceof C54519HHf))) {
            int ordinal = hLk.ordinal();
            if (ordinal == 0) {
                AnonymousClass3XV r4 = 2WX.A02;
                long A0D2 = C51970G9q.A0D();
                return HSK.A00(r2, C51974G9v.A0D(C51974G9v.A0F((2WX) null, C51965G9l.A0c(AnonymousClass05K.A04, 0, A0D2), 0, A0D2), C51965G9l.A0b(AnonymousClass05K.A00, 100.0f, 0), 100.0f, 0), new J8N(A002, A006, A004, r21, this, A0G));
            } else if (ordinal == 1) {
                int ordinal2 = hmy.ordinal();
                if (ordinal2 == 0) {
                    f = 0.65f;
                } else if (ordinal2 == 1) {
                    f = hmy.A00;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                2WX r11 = 2WX.A02;
                long A0D3 = C51970G9q.A0D();
                2WX A0X = C51971G9r.A0X(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0G, 0, A0D3), AnonymousClass05K.A0Y, f, 1);
                Integer num = AnonymousClass05K.A01;
                2WX A0X2 = C51971G9r.A0X(A0X, num, 100.0f, 0);
                Integer num2 = AnonymousClass05K.A00;
                2WX A0X3 = C51971G9r.A0X(A0X2, num2, 100.0f, 0);
                int i = this.A00;
                AnonymousClass3B3 r17 = this.A01;
                2WX r7 = this.A02;
                AnonymousClass9JQ A0b = C51965G9l.A0b(num2, 100.0f, 0);
                if (r7 == r11) {
                    r7 = null;
                }
                2WX A0H = C51974G9v.A0H(C51973G9u.A0S(r7, A0b, num, 100.0f, 0), C51965G9l.A0c(AnonymousClass05K.A0E, 0, A0D3), 0, A0D3);
                C58677Ivm A008 = C58677Ivm.A00(A006, 38);
                2Wd A0e = C51965G9l.A0e(A0G);
                long A0D4 = C51969G9p.A0D();
                AnonymousClass3AS r23 = C336767f9.A00;
                2V1 r42 = r2.A05;
                2Sa r32 = r42.A02.A01;
                AnonymousClass3X7 r13 = r32.A02;
                boolean z = r32.A0W;
                IIS iis = new IIS(r42);
                iis.A00(list, J5I.A00, J5J.A00, new C59137J7t(23, this, A0X3, A007, A012));
                return new C336707f3(r23, r17, (C331097Pn) null, (C249403jg) null, A0H, (C334327b5) null, new C54012Gxu(r42, r13, 1, i, G9t.A0i(r2, A0D4), 2, z), iis.A01, r21, (C335477d1) null, (2Wd) null, (2Wd) null, (2Wd) null, A0e, (Boolean) null, (Boolean) null, (Integer) null, 2, (List) null, A008, (0sI) null, false, false);
            } else if (ordinal == 2) {
                2WX r9 = 2WX.A02;
                2WX A0X4 = C51971G9r.A0X(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0E, 0, C51969G9p.A0B()), AnonymousClass05K.A0Y, hmy.A00, 1);
                Integer num3 = AnonymousClass05K.A01;
                2WX A0X5 = C51971G9r.A0X(A0X4, num3, 100.0f, 0);
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : list) {
                    if ((next instanceof C54518HHe) || (next instanceof C54519HHf)) {
                        A1C.add(next);
                    }
                }
                int i2 = this.A00;
                AnonymousClass3B3 r25 = this.A01;
                2WX r112 = this.A02;
                long A0D5 = C51970G9q.A0D();
                AnonymousClass9JR A0c = C51965G9l.A0c(AnonymousClass05K.A0F, 0, A0D5);
                if (r112 == r9) {
                    r112 = null;
                }
                2WX A009 = AnonymousClass9JR.A00(C51965G9l.A0X(r112, A0c), AnonymousClass05K.A04, 0, A0D5);
                long A0D6 = C51969G9p.A0D();
                AnonymousClass3AS r232 = C336767f9.A00;
                2V1 r43 = r2.A05;
                2Sa r72 = r43.A02.A01;
                AnonymousClass3X7 r24 = r72.A02;
                boolean z2 = r72.A0W;
                C336557eo r172 = new C336557eo();
                J5K j5k = J5K.A00;
                C59098J6g A013 = C59098J6g.A01(A005, 49);
                C59137J7t j7t = new C59137J7t(24, this, A005, A0X5, A003);
                0qQ.A0B(j5k, 1);
                C336607et r10 = new C336607et(r43);
                Iterator it = A1C.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    r172.A01(j5k.invoke(next2), new C58696Iw5(14, r10, j7t, next2), (Object[]) A013.invoke(next2), 100.0f);
                }
                return new C336707f3(r232, r25, (C331097Pn) null, giU, A009, (C334327b5) null, C336677f0.A01(r43, r24, num3, 0, i2, G9t.A0i(r2, A0D6), false, z2), r172, r21, (C335477d1) null, (2Wd) null, (2Wd) null, (2Wd) null, (2Wd) null, false, (Boolean) null, (Integer) null, 2, (List) null, (C62320sa) null, (0sI) null, true, false);
            } else {
                throw AnonymousClass7TE.A1K();
            }
        } else {
            2WX r113 = 2WX.A02;
            2WX A0D7 = C51974G9v.A0D((2WX) null, C51965G9l.A0b(AnonymousClass05K.A0Y, hmy.A00, 1), 100.0f, 0);
            2WX r12 = this.A02;
            long A0F = C51969G9p.A0F();
            long A0D8 = C51970G9q.A0D();
            AnonymousClass9JR A0c2 = C51965G9l.A0c(AnonymousClass05K.A08, 0, A0F);
            if (r12 == r113) {
                r12 = null;
            }
            return A00(r2, A0D7, C51971G9r.A0X(C51974G9v.A0F(r12, A0c2, 0, A0D8), AnonymousClass05K.A00, 100.0f, 0), this, hqB2, (0sK) null, false, false);
        }
    }

    public C53916GwM(AnonymousClass3B3 r2, 2WX r3, C54627HLk hLk, HMY hmy, List list, 0sP r7, 0sP r8, 0sP r9, 0sP r10, 0sL r11, 0sJ r12, int i, boolean z, boolean z2) {
        AnonymousClass7TG.A1U(list, hmy, r7);
        C51969G9p.A1P(r8, 5, r3);
        this.A05 = list;
        this.A04 = hmy;
        this.A06 = r7;
        this.A0B = r12;
        this.A08 = r8;
        this.A07 = r9;
        this.A0A = r11;
        this.A09 = r10;
        this.A03 = hLk;
        this.A01 = r2;
        this.A00 = i;
        this.A0C = z;
        this.A0D = z2;
        this.A02 = r3;
    }

    public static final 2Tp A00(C70832Wc r14, 2WX r15, 2WX r16, C53916GwM gwM, C55947HqB hqB, 0sK r19, boolean z, boolean z2) {
        int i;
        C251263mp r2;
        boolean z3;
        2Wb A0M = C51973G9u.A0M(r14);
        C55947HqB hqB2 = hqB;
        String str = null;
        if (hqB2 instanceof C54518HHe) {
            i = hqB2.A00;
            C54518HHe hHe = (C54518HHe) hqB2;
            C57570Icx icx = hHe.A01;
            if (icx != null) {
                str = icx.A04;
            }
            r2 = hHe.A00;
            z3 = false;
        } else if (hqB2 instanceof C54519HHf) {
            i = hqB2.A00;
            C54519HHf hHf = (C54519HHf) hqB2;
            C56146HtY htY = hHf.A01.A01;
            if (htY != null) {
                str = htY.A0A;
            }
            r2 = hHf.A00;
            z3 = hHf.A02;
        } else {
            throw AnonymousClass7TE.A0w("Unsupported ImagineContentListItem type");
        }
        C53916GwM gwM2 = gwM;
        return C51967G9n.A0O(new C53837Gv4(r15, new C55791HnQ(r2, str, i, z3), new J6T(44, (Object) hqB2, (Object) gwM2), new J6T(45, (Object) hqB2, (Object) gwM2), new JG0(12, hqB2, gwM2), r19, z, z2), A0M, r14, r16);
    }
}
