package X;

import java.util.List;

/* renamed from: X.Gss  reason: case insensitive filesystem */
public final class C53701Gss extends C251343mx {
    public final List A00;
    public final 0sP A01;
    public final 2WX A02;

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, X.0rk] */
    public final C251263mp A0X(AnonymousClass3Y5 r59) {
        AnonymousClass3Y5 r9 = r59;
        0qQ.A0B(r9, 0);
        long j = ((2Wd) AnonymousClass3Zw.A00(r9, C58714IwN.A01(r9, 13), new Object[0])).A00;
        2Wa A002 = C243643Zq.A00(r9, C58558Itr.A00);
        C334997cD r15 = (C334997cD) AnonymousClass3Zw.A00(r9, C58559Its.A00, new Object[0]);
        C53096GiU giU = new C53096GiU(7, r15, A002, this);
        2WX r3 = this.A02;
        Integer num = AnonymousClass05K.A00;
        AnonymousClass9JQ A0b = C51965G9l.A0b(num, 100.0f, 0);
        if (r3 == 2WX.A02) {
            r3 = null;
        }
        2WX A0X = C51965G9l.A0X(r3, A0b);
        2Wb A0Q = C51972G9s.A0Q(r9);
        long A0D = C51970G9q.A0D();
        int A09 = C51968G9o.A09(A0Q, A0D);
        long A0F = C51969G9p.A0F();
        int A092 = C51968G9o.A09(A0Q, A0F);
        ? obj = new Object();
        obj.A00 = (AnonymousClass7TF.A0E(C243803a8.A00(A0Q)).widthPixels - (A09 * 2)) - A092;
        int A093 = C51968G9o.A09(A0Q, A0F);
        float f = ((float) obj.A00) / 1.25f;
        List list = this.A00;
        if (list.size() < 2) {
            obj.A00 += A092;
        }
        Integer num2 = AnonymousClass05K.A01;
        2WX A003 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(C51971G9r.A0X((2WX) null, num, 100.0f, 0), num2, 0, ((long) ((int) f)) | 9221401712017801216L), AnonymousClass05K.A1I, 0, ((long) A093) | 9221401712017801216L);
        2Wd A0e = C51965G9l.A0e(A0D);
        2Wd A0e2 = C51965G9l.A0e(A0D);
        long A0D2 = C51969G9p.A0D();
        AnonymousClass3AS r26 = C336767f9.A00;
        2V1 Aqq = A0Q.Aqq();
        2Sa r1 = Aqq.A02.A01;
        AnonymousClass3X7 r28 = r1.A02;
        boolean z = r1.A0W;
        C336557eo r18 = new C336557eo();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            C59105J6n A022 = C59105J6n.A02(next, 13);
            2Wa r6 = A002;
            J6T j6t = new J6T(48, (Object) r6, next);
            r18.A01(A022.invoke(next), new C58696Iw5(13, new C336607et(Aqq), new C59193J9x(r6, next, this, obj, i, A09, 3, j), next), (Object[]) j6t.invoke(next), 100.0f);
            i = i2;
        }
        A0Q.A00(new C336707f3(r26, (AnonymousClass3B3) null, (C331097Pn) null, giU, A003, (C334327b5) null, C336677f0.A01(Aqq, r28, num2, 0, Integer.MAX_VALUE, G9t.A0i(A0Q, A0D2), false, z), r18, r15, (C335477d1) null, A0e, A0e2, (2Wd) null, (2Wd) null, false, (Boolean) null, (Integer) null, 2, (List) null, (C62320sa) null, (0sI) null, true, false));
        String A0E = C244013aV.A0E(A0Q, 2131966310);
        Integer num3 = AnonymousClass05K.A05;
        return C51967G9n.A0N(new C53907GwD(C51974G9v.A0F(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0E, 0, A0F), C51966G9m.A0k(0, C51969G9p.A0E()), 0, C51970G9q.A0I()), (AnonymousClass90N) null, HNO.A0Y, A0E, num3, 0, 120), A0Q, r9, A0X);
    }

    public C53701Gss(2WX r1, List list, 0sP r3) {
        AnonymousClass7TG.A1Q(r3, r1);
        this.A00 = list;
        this.A01 = r3;
        this.A02 = r1;
    }
}
