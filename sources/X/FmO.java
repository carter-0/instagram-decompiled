package X;

import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

public final class FmO implements C332277Ui {
    public final /* synthetic */ C49731F3w A00;
    public final /* synthetic */ C246803fG A01;
    public final /* synthetic */ C331127Pr A02;
    public final /* synthetic */ C332277Ui A03;
    public final /* synthetic */ AnonymousClass37D A04;

    public FmO(C49731F3w f3w, C246803fG r2, C331127Pr r3, C332277Ui r4, AnonymousClass37D r5) {
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = f3w;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void D9V() {
        C49731F3w f3w = this.A00;
        f3w.A08(false);
        DirectShareSheetFragment A002 = f3w.A00();
        C331127Pr r0 = this.A02;
        r0.A0T = A002;
        DbU.A1I(this.A01.A00, A002, r0.A00());
    }

    public final void D9a() {
        C332277Ui r1 = this.A03;
        if (r1 != null && ((AnonymousClass37F) this.A04).A0f) {
            r1.D9a();
        }
    }
}
