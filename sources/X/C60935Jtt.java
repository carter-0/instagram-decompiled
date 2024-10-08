package X;

/* renamed from: X.Jtt  reason: case insensitive filesystem */
public final class C60935Jtt extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final C62483KgY A02;
    public final C62442Kfs A03;
    public final boolean A04;

    public C60935Jtt(C62483KgY kgY, C62442Kfs kfs, int i, int i2, boolean z) {
        0qQ.A0B(kgY, 3);
        this.A00 = i;
        this.A03 = kfs;
        this.A02 = kgY;
        this.A04 = z;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60935Jtt) {
                C60935Jtt jtt = (C60935Jtt) obj;
                if (!(this.A00 == jtt.A00 && this.A03 == jtt.A03 && this.A02 == jtt.A02 && this.A04 == jtt.A04 && this.A01 == jtt.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A07(this.A02, ((this.A00 * 31) + AnonymousClass7TG.A0C(this.A03)) * 31)) + this.A01;
    }
}
