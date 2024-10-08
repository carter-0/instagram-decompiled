package X;

import java.util.List;

/* renamed from: X.Gt1  reason: case insensitive filesystem */
public final class C53710Gt1 extends C251343mx {
    public final int A00;
    public final List A01;
    public final 2WX A02;

    public final C251263mp A0X(AnonymousClass3Y5 r42) {
        AnonymousClass3Y5 r10 = r42;
        0qQ.A0B(r10, 0);
        2Wa A002 = C243643Zq.A00(r10, C58708IwH.A01(this, 29));
        0sL A022 = AnonymousClass3j0.A02(r10, new JGB(A002, 2));
        2WX r22 = this.A02;
        long A0D = C51969G9p.A0D();
        AnonymousClass3AS r18 = C336767f9.A00;
        2V1 r7 = r10.A05;
        2Sa r2 = r7.A02.A01;
        AnonymousClass3X7 r14 = r2.A02;
        boolean z = r2.A0W;
        C336557eo r25 = new C336557eo();
        int i = 0;
        for (Object next : this.A01) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            C56112Hsz hsz = (C56112Hsz) next;
            r25.A00(new C53748Gtd(hsz.A01, hsz.A00, new GL8(i, 43, hsz, A022), AnonymousClass7TF.A1S(i, AnonymousClass7TE.A0M(A002.A03))), Integer.valueOf(i), -1.0f, -1.0f, false);
            i = i2;
        }
        return new C336707f3(r18, (AnonymousClass3B3) null, (C331097Pn) null, (C249403jg) null, r22, (C334327b5) null, C336677f0.A00(r7, r14, G9t.A0i(r10, A0D), z), r25, (C334997cD) null, (C335477d1) null, (2Wd) null, (2Wd) null, (2Wd) null, (2Wd) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (List) null, (C62320sa) null, (0sI) null, true, false);
    }

    public C53710Gt1(2WX r1, List list, int i) {
        this.A02 = r1;
        this.A01 = list;
        this.A00 = i;
    }
}
