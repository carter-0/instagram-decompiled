package X;

/* renamed from: X.HsA  reason: case insensitive filesystem */
public final class C56061HsA {
    public final C54715HPu A00;

    public final boolean equals(Object obj) {
        C54715HPu hPu = this.A00;
        if (!(obj instanceof C56061HsA) || !0qQ.A0K(hPu, ((C56061HsA) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        C54715HPu hPu = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CdsSectionContentStyle(config=");
        return AnonymousClass7TG.A0n(hPu, A1A);
    }

    public /* synthetic */ C56061HsA(C54715HPu hPu) {
        this.A00 = hPu;
    }
}
