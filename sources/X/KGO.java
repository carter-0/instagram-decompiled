package X;

public final class KGO extends AnonymousClass4AA {
    public final Integer A00;
    public final boolean A01;

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        KGO kgo = (KGO) obj;
        0qQ.A0B(kgo, 0);
        if (!0qQ.A0K(this.A00, kgo.A00) || this.A01 != kgo.A01) {
            return false;
        }
        return true;
    }

    public KGO(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }

    public KGO() {
        this((Integer) null, false);
    }
}
