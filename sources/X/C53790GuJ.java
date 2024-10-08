package X;

import java.util.List;

/* renamed from: X.GuJ  reason: case insensitive filesystem */
public final class C53790GuJ extends C251343mx {
    public final float A00 = 0.5f;
    public final 2WX A01;
    public final HLD A02;
    public final 0sP A03;
    public final 0sP A04;
    public final 0sL A05;

    public final C251263mp A0X(AnonymousClass3Y5 r33) {
        int i;
        AnonymousClass3Y5 r0 = r33;
        0qQ.A0B(r0, 0);
        2Wa A002 = C243643Zq.A00(r0, C58400IrJ.A00);
        0sP A012 = AnonymousClass3j0.A01(r0, new J6H(this, 18));
        0sL A022 = AnonymousClass3j0.A02(r0, JGK.A01(this, 33));
        Float valueOf = Float.valueOf(this.A00);
        HLD hld = this.A02;
        C249403jg r12 = (C249403jg) AnonymousClass3Zw.A00(r0, new C58208IoC(47, A012, this, A022, A002), new Object[]{A012, A022, valueOf, hld});
        int ordinal = hld.ordinal();
        if (ordinal == 1) {
            i = 0;
        } else if (ordinal == 0) {
            i = 1;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        Integer num = AnonymousClass05K.A01;
        2WX r13 = this.A01;
        long A0D = C51969G9p.A0D();
        AnonymousClass3AS r9 = C336767f9.A00;
        2V1 r14 = r0.A05;
        2Sa r3 = r14.A02.A01;
        AnonymousClass3X7 r15 = r3.A02;
        boolean z = r3.A0W;
        C336547en r32 = new C336547en(r14);
        this.A03.invoke(new IIR(r32.A00, r32));
        return new C336707f3(r9, (AnonymousClass3B3) null, (C331097Pn) null, r12, r13, (C334327b5) null, C336677f0.A01(r14, r15, num, i, -1, G9t.A0i(r0, A0D), false, z), r32.A01, (C334997cD) null, (C335477d1) null, (2Wd) null, (2Wd) null, (2Wd) null, (2Wd) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (List) null, (C62320sa) null, (0sI) null, true, false);
    }

    public /* synthetic */ C53790GuJ(2WX r4, 0sP r5, 0sP r6, 0sL r7) {
        HLD hld = HLD.HORIZONTAL;
        0qQ.A0B(r4, 6);
        this.A02 = hld;
        this.A04 = r5;
        this.A05 = r7;
        this.A01 = r4;
        this.A03 = r6;
    }
}
