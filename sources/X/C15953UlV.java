package X;

/* renamed from: X.UlV  reason: case insensitive filesystem */
public final class C15953UlV extends AnonymousClass2rW {
    public boolean A00;
    public final AnonymousClass32Q A01;
    public final 1wY A02;

    public final int A02() {
        double ceil;
        boolean z = this.A00;
        double size = ((double) this.A01.size()) / 3.0d;
        if (z) {
            ceil = Math.floor(size);
        } else {
            ceil = Math.ceil(size);
        }
        return (int) ceil;
    }

    public final /* bridge */ /* synthetic */ String A03(Object obj) {
        C17884Vhb vhb = (C17884Vhb) obj;
        0qQ.A0B(vhb, 0);
        return vhb.A00();
    }

    public C15953UlV(1wY r1, AnonymousClass32Q r2) {
        this.A02 = r1;
        this.A01 = r2;
    }
}
