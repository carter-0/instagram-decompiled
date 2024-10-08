package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.8iV  reason: invalid class name and case insensitive filesystem */
public final class C362798iV extends C249403jg {
    public final /* synthetic */ C362048hG A00;

    public C362798iV(C362048hG r1) {
        this.A00 = r1;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0fD.A03(1012322946);
        0qQ.A0B(recyclerView, 0);
        super.onScrollStateChanged(recyclerView, i);
        C362048hG r4 = this.A00;
        C362488hz r0 = r4.A0m;
        boolean z = false;
        if (i != 0) {
            z = true;
        }
        r0.A08.A0D = z;
        if (i == 1) {
            27r A01 = 27p.A01(r4.A0c);
            String moduleName = r4.A0Z.getModuleName();
            29R r3 = A01.A09;
            0qQ.A0B(moduleName, 0);
            1Ln A08 = 1Ln.A08(r3.A01);
            if (A08.A00.isSampled()) {
                A08.A0r("GALLERY_SCROLL");
                29R.A00(A08, r3);
                A08.A0b(r3.A04.A09);
                A08.A0a(r3.A0J());
                A08.A0W(2);
                A08.A0n(moduleName);
                A08.A0u(AnonymousClass1QI.A00.A02.A00);
                A08.Cgf();
            }
        }
        AnonymousClass0fD.A0A(1289126175, A03);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = AnonymousClass0fD.A03(416758147);
        C362048hG r4 = this.A00;
        int A01 = C240113Jq.A01(r4.A0V);
        if (A01 >= 0) {
            C362488hz r3 = r4.A0m;
            int AJv = r3.AJv(A01);
            if (r4.A08 == AnonymousClass05K.A00 && AJv < r3.A08.A00) {
                C361778gm r0 = r4.A1E;
                r0.A07(AJv);
                r0.A06();
            }
        }
        AnonymousClass0fD.A0A(-587032583, A03);
    }
}
