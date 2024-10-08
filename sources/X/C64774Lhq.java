package X;

/* renamed from: X.Lhq  reason: case insensitive filesystem */
public final class C64774Lhq implements C232262tL {
    public final int A00;
    public final boolean A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "audience_lists_row_view_model";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64774Lhq lhq = (C64774Lhq) obj;
        if (lhq != null && this.A01 == lhq.A01 && this.A00 == lhq.A00) {
            return true;
        }
        return false;
    }

    public C64774Lhq(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }
}
