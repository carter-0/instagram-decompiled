package X;

/* renamed from: X.92v  reason: invalid class name and case insensitive filesystem */
public final class C3728592v extends C231402rc {
    public final 2Rw A00;
    public final /* synthetic */ AnonymousClass8AY A01;

    public C3728592v(2Rw r1, AnonymousClass8AY r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onChanged() {
        AnonymousClass8AY r0 = this.A01;
        AnonymousClass8AY.A00(r0);
        r0.notifyDataSetChanged();
    }

    public final void onItemRangeChanged(int i, int i2) {
        AnonymousClass8AY r1 = this.A01;
        r1.notifyItemRangeChanged(r1.A01(this.A00) + i, i2);
    }

    public final void onItemRangeInserted(int i, int i2) {
        AnonymousClass8AY r1 = this.A01;
        r1.notifyItemRangeInserted(r1.A01(this.A00) + i, i2);
    }

    public final void onItemRangeRemoved(int i, int i2) {
        AnonymousClass8AY r1 = this.A01;
        r1.notifyItemRangeRemoved(r1.A01(this.A00) + i, i2);
    }
}
