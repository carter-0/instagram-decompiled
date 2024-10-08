package X;

import com.instagram.quicksand.QuickSandSolverBridge;

public final class EBW extends 1P0 {
    public final /* synthetic */ FAL A00;

    public EBW(FAL fal) {
        this.A00 = fal;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-1798347894);
        EBW.super.onFail(r4);
        int i = FAL.A03;
        FAL.A03 = i - 1;
        if (i > 0) {
            FAL.A00(this.A00);
        }
        AnonymousClass0fD.A0A(-1271340349, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(2069655902);
        Dw9 dw9 = (Dw9) obj;
        int A032 = AnonymousClass0fD.A03(108377186);
        EBW.super.onSuccess(dw9);
        FAL fal = this.A00;
        int i = dw9.A01;
        String str = dw9.A04;
        int i2 = dw9.A03;
        int i3 = dw9.A02;
        int i4 = dw9.A00;
        0ng r1 = new 0ng(179);
        r1.A01 = i;
        r1.A06 = str;
        r1.A02 = i3;
        r1.A03 = i2;
        r1.A04 = new C17959Vis();
        r1.A00 = 0;
        r1.A05 = new QuickSandSolverBridge(i2, i4);
        fal.A00 = r1;
        0nY.A00().ATE(fal.A00);
        AnonymousClass0fD.A0A(1811792520, A032);
        AnonymousClass0fD.A0A(227020634, A03);
    }
}
