package X;

/* renamed from: X.Li5  reason: case insensitive filesystem */
public final class C64789Li5 implements C232262tL {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "your_story_row_view_model";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        boolean z;
        C64789Li5 li5 = (C64789Li5) obj;
        boolean z2 = this.A02;
        if (li5 != null) {
            z = li5.A02;
        } else {
            z = false;
        }
        if (z2 == z) {
            return true;
        }
        return false;
    }

    public C64789Li5(Integer num, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = num;
    }
}
