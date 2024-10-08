package X;

import android.view.LayoutInflater;

public final class PIF implements C231272rL {
    public final AnonymousClass2t9 A00;

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this.A00;
    }

    public final int getCount() {
        return this.A00.getItemCount();
    }

    public final Object getItem(int i) {
        Object A04 = this.A00.A04(i);
        0qQ.A07(A04);
        return A04;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    public PIF(LayoutInflater layoutInflater, AnonymousClass0iw r4, C74400PuG puG) {
        AnonymousClass7TG.A1Q(r4, puG);
        AnonymousClass2tC r1 = new AnonymousClass2tC(layoutInflater);
        r1.A01(new Object());
        r1.A01(new C68621NPr(r4, puG));
        this.A00 = DbU.A0U(r1, new Object());
    }
}
