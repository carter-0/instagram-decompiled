package X;

/* renamed from: X.WSk  reason: case insensitive filesystem */
public final class C19277WSk implements C232262tL {
    public final C53399GnW A00;
    public final AnonymousClass4DU A01;
    public final C17645Vbb A02;

    public C19277WSk(C53399GnW gnW, AnonymousClass4DU r3, C17645Vbb vbb) {
        0qQ.A0B(r3, 3);
        this.A00 = gnW;
        this.A02 = vbb;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19277WSk) || !0qQ.A0K(this.A00, ((C19277WSk) obj).A00)) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "product-collection-cover-contentile";
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C53399GnW gnW;
        C19277WSk wSk = (C19277WSk) obj;
        C53399GnW gnW2 = this.A00;
        if (wSk != null) {
            gnW = wSk.A00;
        } else {
            gnW = null;
        }
        return 0qQ.A0K(gnW2, gnW);
    }
}
