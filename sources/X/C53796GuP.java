package X;

import java.util.List;

/* renamed from: X.GuP  reason: case insensitive filesystem */
public final class C53796GuP extends C251343mx {
    public final C62320sa A00;
    public final C62320sa A01;
    public final C251263mp A02;
    public final C53693Gsk A03;
    public final C56102Hsp A04;
    public final 0sP A05;

    public C53796GuP(C251263mp r2, C53693Gsk gsk, C56102Hsp hsp, C62320sa r5, C62320sa r6, 0sP r7) {
        0qQ.A0B(r7, 4);
        this.A03 = gsk;
        this.A01 = r5;
        this.A00 = r6;
        this.A05 = r7;
        this.A04 = hsp;
        this.A02 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r43) {
        AnonymousClass3Y5 r10 = r43;
        0qQ.A0B(r10, 0);
        2Wa A002 = C243643Zq.A00(r10, C58539ItY.A00);
        C56102Hsp hsp = this.A04;
        XSY xsy = XSY.CIRCLE_HANDLE;
        C54691HOw hOw = C54691HOw.OUTLINE;
        Integer num = AnonymousClass05K.A00;
        List A1I = AnonymousClass7TE.A1I(new Ho0(xsy, hOw, num, C244013aV.A0E(r10, 2131972860), C58687Ivw.A00(A002, this, 21)));
        2V1 r14 = r10.A05;
        2Wb A0S = AnonymousClass7TG.A0S(r14);
        A0S.A00(new C53739GtU(hsp.A01, hsp.A00, A1I, hsp.A02));
        A0S.A00(this.A02);
        C251263mp r21 = new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A0S.A01, false);
        2Wb A0S2 = AnonymousClass7TG.A0S(r14);
        AnonymousClass3XV r0 = 2WX.A02;
        long A0F = C51969G9p.A0F();
        long doubleToRawLongBits = Double.doubleToRawLongBits(22.0d);
        2WX A0E = C51974G9v.A0E(C51974G9v.A0G((2WX) null, C51965G9l.A0c(AnonymousClass05K.A0u, 0, A0F), 0, doubleToRawLongBits), C51965G9l.A0c(AnonymousClass05K.A1F, 0, A0F), 0, C51970G9q.A0I());
        2V1 r3 = A0S2.A00;
        2Wb A0S3 = AnonymousClass7TG.A0S(r3);
        A0S3.A00(new C53832Guz(XSY.ARROW_LEFT, XSY.ARROW_RIGHT, hOw, new 2WX((2WX) null, (AnonymousClass2WY) null).A00(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A09, 0, A0F)), num, C244013aV.A0E(A0S3, 2131972859), C58687Ivw.A00(A002, this, 22)));
        C51971G9r.A1E(this.A03, A0S3, A0S2, A0E);
        0sP r6 = this.A05;
        long A0D = C51969G9p.A0D();
        AnonymousClass3AS r16 = C336767f9.A00;
        2Sa r2 = r3.A02.A01;
        AnonymousClass3X7 r5 = r2.A02;
        boolean z = r2.A0W;
        C336547en r22 = new C336547en(r3);
        r6.invoke(r22);
        A0S2.A00(new C336707f3(r16, (AnonymousClass3B3) null, (C331097Pn) null, (C249403jg) null, (2WX) null, (C334327b5) null, C336677f0.A01(r3, r5, num, 1, AnonymousClass972.MUTABLE_FLAG_MASK, G9t.A0i(A0S2, A0D), false, z), r22.A01, (C334997cD) null, (C335477d1) null, (2Wd) null, (2Wd) null, (2Wd) null, (2Wd) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (List) null, (C62320sa) null, (0sI) null, true, false));
        C251263mp r1 = new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A0S2.A01, false);
        if (C51969G9p.A1V(A002)) {
            r21 = r1;
        }
        return C243563Zg.A03(G9t.A0v(r21, r14), r10, C51971G9r.A0X((2WX) null, AnonymousClass05K.A01, 100.0f, 0));
    }
}
