package X;

/* renamed from: X.DtQ  reason: case insensitive filesystem */
public final class C47239DtQ extends AnonymousClass0T0 implements C232262tL {
    public int A00 = -1;
    public final int A01;
    public final 1Xj A02;

    public C47239DtQ(1Xj r2, int i) {
        this.A02 = r2;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47239DtQ) {
                C47239DtQ dtQ = (C47239DtQ) obj;
                if (!(0qQ.A0K(this.A02, dtQ.A02) && this.A01 == dtQ.A01 && this.A00 == dtQ.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A02.getId();
        if (id != null) {
            return id;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A02) + this.A01) * 31) + this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C47239DtQ dtQ = (C47239DtQ) obj;
        0qQ.A0B(dtQ, 0);
        if (0qQ.A0K(this.A02.getId(), dtQ.A02.getId()) && this.A01 == dtQ.A01 && this.A00 == dtQ.A00) {
            return true;
        }
        return false;
    }
}
