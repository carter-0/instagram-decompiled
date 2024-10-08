package X;

/* renamed from: X.2uP  reason: invalid class name and case insensitive filesystem */
public final class C232762uP implements AnonymousClass0eK {
    public final /* synthetic */ C232722uK A00;

    public C232762uP(C232722uK r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        1Xj r5;
        int i;
        C263744Ne r1 = this.A00.A02;
        C282575Du r6 = null;
        if (!(r1 == null || (r5 = (1Xj) r1.A03) == null || !r5.A5D() || (i = r1.A0D) == -1)) {
            1Xj A1c = r5.A1c(i);
            int i2 = 0;
            1Xj A1c2 = r5.A1c(0);
            if (A1c == null || A1c2 == null) {
                String id = r5.getId();
                if (A1c2 != null) {
                    i2 = i;
                }
                String A07 = 002.A07(i2, "Media ID: ", id, ", carousel index: ");
                0qQ.A07(A07);
                0wb.A03("FeedVideoPlayer_getCarouselInfo", A07);
            } else {
                int A0o = r5.A0o();
                int i3 = A1c.BR7().A00;
                boolean A08 = A1c.CEL().A08();
                String id2 = A1c.getId();
                if (id2 != null) {
                    String id3 = A1c2.getId();
                    if (id3 != null) {
                        r6 = new C282575Du(id2, id3, i, A0o, i3, A08);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        return C257443xP.A00(r6);
    }
}
