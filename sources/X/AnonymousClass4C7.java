package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4C7  reason: invalid class name */
public final class AnonymousClass4C7 extends C249403jg {
    public final /* synthetic */ AnonymousClass49N A00;
    public final /* synthetic */ AnonymousClass49M A01;

    public AnonymousClass4C7(AnonymousClass49N r1, AnonymousClass49M r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0fD.A03(982493728);
        AnonymousClass49N r1 = this.A00;
        r1.A00 = i;
        AnonymousClass49N.A00(r1, this.A01);
        AnonymousClass0fD.A0A(1614750045, A03);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = AnonymousClass0fD.A03(-562912238);
        AnonymousClass49N.A00(this.A00, this.A01);
        AnonymousClass0fD.A0A(585624219, A03);
    }
}
