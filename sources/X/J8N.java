package X;

import java.util.ArrayList;
import java.util.List;

public final class J8N extends 0Yg implements 0sL {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 2Wa A01;
    public final /* synthetic */ 2Wa A02;
    public final /* synthetic */ 2Wa A03;
    public final /* synthetic */ C334997cD A04;
    public final /* synthetic */ C53916GwM A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J8N(2Wa r2, 2Wa r3, 2Wa r4, C334997cD r5, C53916GwM gwM, long j) {
        super(2);
        this.A05 = gwM;
        this.A03 = r2;
        this.A04 = r5;
        this.A00 = j;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        2WX A0x;
        2WX r1;
        AnonymousClass3Y5 r5 = (AnonymousClass3Y5) obj;
        long j = ((C245073cH) obj2).A00;
        0qQ.A0B(r5, 0);
        C53916GwM gwM = this.A05;
        HMY hmy = gwM.A04;
        HMY hmy2 = HMY.PORTRAIT;
        2WX r9 = 2WX.A02;
        if (hmy == hmy2) {
            A0x = C51971G9r.A0X((2WX) null, AnonymousClass05K.A01, 100.0f, 0);
        } else {
            A0x = G9t.A0x((2WX) null, AnonymousClass05K.A0Y, hmy.A00);
        }
        Integer num = AnonymousClass05K.A00;
        2WX A0X = C51971G9r.A0X(A0x, num, 100.0f, 0);
        if (hmy == hmy2) {
            2Wa r12 = this.A03;
            r12.A03(new GQ2(j, 18));
            r1 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0j, 0, C51969G9p.A0G(AnonymousClass7TE.A0M(r12.A03)));
        } else {
            r1 = r9;
        }
        AnonymousClass9JQ A0b = C51965G9l.A0b(num, 100.0f, 0);
        if (r1 == r9) {
            r1 = null;
        }
        2WX A002 = AnonymousClass9JR.A00(C51965G9l.A0X(r1, A0b), AnonymousClass05K.A06, 0, C51970G9q.A0D());
        List list = gwM.A05;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if ((next instanceof C54518HHe) || (next instanceof C54519HHf)) {
                A1C.add(next);
            }
        }
        int i = gwM.A00;
        AnonymousClass3B3 r45 = gwM.A01;
        2WX r24 = gwM.A02;
        C58677Ivm A003 = C58677Ivm.A00(this.A01, 36);
        C334997cD r15 = this.A04;
        2Wd A0e = C51965G9l.A0e(this.A00);
        2Wa r122 = this.A02;
        long A0D = C51969G9p.A0D();
        AnonymousClass3AS r17 = C336767f9.A00;
        2V1 r4 = r5.A05;
        2Sa r0 = r4.A02.A01;
        AnonymousClass3X7 r13 = r0.A02;
        boolean z = r0.A0W;
        IIS iis = new IIS(r4);
        iis.A00(A1C, J5G.A00, (0sP) null, new C59137J7t(22, gwM, A0X, r122, A002));
        return new C336707f3(r17, r45, (C331097Pn) null, (C249403jg) null, r24, (C334327b5) null, new C54012Gxu(r4, r13, 1, i, G9t.A0i(r5, A0D), 2, z), iis.A01, r15, (C335477d1) null, (2Wd) null, (2Wd) null, (2Wd) null, A0e, (Boolean) null, (Boolean) null, (Integer) null, 2, (List) null, A003, (0sI) null, false, false);
    }
}
