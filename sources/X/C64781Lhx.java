package X;

/* renamed from: X.Lhx  reason: case insensitive filesystem */
public final class C64781Lhx implements C232262tL {
    public final MXT A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A00.getId();
        if (id != null) {
            return id;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64781Lhx lhx = (C64781Lhx) obj;
        0qQ.A0B(lhx, 0);
        String id = this.A00.getId();
        if (id != null) {
            String id2 = lhx.A00.getId();
            if (id2 == null) {
                throw AnonymousClass7TE.A0y();
            } else if (!id.equals(id2) || !0qQ.A0K(this.A01, lhx.A01)) {
                return false;
            } else {
                return true;
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    public C64781Lhx(MXT mxt, String str) {
        this.A00 = mxt;
        this.A01 = str;
    }
}
