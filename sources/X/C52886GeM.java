package X;

/* renamed from: X.GeM  reason: case insensitive filesystem */
public final class C52886GeM extends HP4 {
    public final long A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C52886GeM)) {
            return false;
        }
        return AnonymousClass7TF.A1Q((this.A00 > ((C52886GeM) obj).A00 ? 1 : (this.A00 == ((C52886GeM) obj).A00 ? 0 : -1)));
    }

    public final int hashCode() {
        return C51968G9o.A03(this.A00);
    }

    public C52886GeM(long j) {
        this.A00 = j;
        if (!C289325dP.A02(j)) {
            throw AnonymousClass7TE.A0z("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Open(offset=");
        return AnonymousClass7TG.A0n(C289295dM.A08(this.A00), A1A);
    }
}
