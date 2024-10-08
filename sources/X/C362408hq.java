package X;

/* renamed from: X.8hq  reason: invalid class name and case insensitive filesystem */
public final class C362408hq implements C232262tL, C296945qu {
    public final int A00;
    public final C369988ve A01;

    public C362408hq(C369988ve r2, int i) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A00 = i;
    }

    public final C296905qq B9p() {
        return new C296905qq(1, 1, 1, 1, 0.5625f);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A01.A07;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C362408hq r3 = (C362408hq) obj;
        0qQ.A0B(r3, 0);
        return 0qQ.A0K(this.A01.A07, r3.A01.A07);
    }
}
