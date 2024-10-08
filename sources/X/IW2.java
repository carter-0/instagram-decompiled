package X;

public final class IW2 implements C231272rL {
    public final /* synthetic */ C238123Aq A00;

    public IW2(C238123Aq r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this.A00.A03.A0A;
    }

    public final int getCount() {
        2Rw r0 = this.A00.A03.A0A;
        if (r0 != null) {
            return r0.getItemCount();
        }
        return 0;
    }

    public final Object getItem(int i) {
        AnonymousClass2t9 r0 = this.A00.A03.A0A;
        if (r0 != null) {
            return r0.A04(i);
        }
        return null;
    }
}
