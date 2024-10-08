package X;

import java.util.ArrayList;

/* renamed from: X.IhQ  reason: case insensitive filesystem */
public final class C57847IhQ implements Runnable {
    public final /* synthetic */ C254353sL A00;
    public final /* synthetic */ C56937IIg A01;

    public C57847IhQ(C254353sL r1, C56937IIg iIg) {
        this.A01 = iIg;
        this.A00 = r1;
    }

    public final void run() {
        C56937IIg iIg = this.A01;
        AnonymousClass0kM A0M = DbY.A0M(iIg.A01);
        A0M.A00 = iIg.A02;
        0wc A002 = A0M.A00();
        C297205rN r9 = C297205rN.A00;
        C297225rP r8 = C297225rP.A00;
        C297235rQ r7 = C297235rQ.A00;
        C51974G9v.A1M(r9, r8, r7);
        ArrayList A1C = AnonymousClass7TE.A1C();
        C254353sL r3 = this.A00;
        String str = iIg.A04;
        C297245rR.A00(A002, iIg.A00, r3, iIg.A03, str, A1C, r7, r8, r9);
    }
}
