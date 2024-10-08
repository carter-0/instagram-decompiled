package X;

/* renamed from: X.LFx  reason: case insensitive filesystem */
public final class C63970LFx {
    public final C63569KzI A00;
    public final C63569KzI A01;
    public final C63569KzI A02;
    public final LP3 A03;
    public final LP3 A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (0qQ.A0K(getClass(), JTR.A0v(obj))) {
                0qQ.A0C(obj, "null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
                C63970LFx lFx = (C63970LFx) obj;
                if (!0qQ.A0K(this.A02, lFx.A02) || !0qQ.A0K(this.A01, lFx.A01) || !0qQ.A0K(this.A00, lFx.A00) || !0qQ.A0K(this.A04, lFx.A04) || !0qQ.A0K(this.A03, lFx.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02)))) + C51971G9r.A0E(this.A03);
    }

    public C63970LFx(C63569KzI kzI, C63569KzI kzI2, C63569KzI kzI3, LP3 lp3, LP3 lp32) {
        this.A02 = kzI;
        this.A01 = kzI2;
        this.A00 = kzI3;
        this.A04 = lp3;
        this.A03 = lp32;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CombinedLoadStates(refresh=");
        A1A.append(this.A02);
        A1A.append(", prepend=");
        A1A.append(this.A01);
        A1A.append(", append=");
        A1A.append(this.A00);
        A1A.append(", source=");
        A1A.append(this.A04);
        A1A.append(", mediator=");
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }
}
