package X;

/* renamed from: X.Jy3  reason: case insensitive filesystem */
public final class C61152Jy3 extends AnonymousClass0T0 implements C232262tL {
    public final C62723KlN A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61152Jy3) && 0qQ.A0K(this.A00, ((C61152Jy3) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.toString();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C62723KlN klN;
        C61152Jy3 jy3 = (C61152Jy3) obj;
        C62723KlN klN2 = this.A00;
        if (jy3 != null) {
            klN = jy3.A00;
        } else {
            klN = null;
        }
        return 0qQ.A0K(klN2, klN);
    }

    public C61152Jy3(C62723KlN klN) {
        this.A00 = klN;
    }
}
