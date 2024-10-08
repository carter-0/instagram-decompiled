package X;

/* renamed from: X.N9b  reason: case insensitive filesystem */
public final class C68288N9b extends AnonymousClass0T0 implements C74270Pry {
    public final Boolean A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68288N9b) {
                C68288N9b n9b = (C68288N9b) obj;
                if (this.A03 != n9b.A03 || !0qQ.A0K(this.A01, n9b.A01) || this.A02 != n9b.A02 || !0qQ.A0K(this.A00, n9b.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, (C51965G9l.A05(this.A03) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C68288N9b(Boolean bool, String str, boolean z, boolean z2) {
        this.A03 = z;
        this.A01 = str;
        this.A02 = z2;
        this.A00 = bool;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallArEffectsViewModel(shouldShowInstructions=");
        A1A.append(this.A03);
        A1A.append(", instructionText=");
        A1A.append(this.A01);
        A1A.append(", shouldAutoDismiss=");
        A1A.append(this.A02);
        A1A.append(", showArDeliveryDebugOverlay=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
