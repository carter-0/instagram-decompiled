package X;

/* renamed from: X.GlB  reason: case insensitive filesystem */
public final class C53263GlB extends AnonymousClass0T0 {
    public final long A00;
    public final C53278GlQ A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53263GlB) {
                C53263GlB glB = (C53263GlB) obj;
                if (!(this.A00 == glB.A00 && 0qQ.A0K(this.A01, glB.A01) && this.A02 == glB.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, (C51975G9x.A03(this.A00) + AnonymousClass7TG.A0C(this.A01)) * 31);
    }

    public C53263GlB(C53278GlQ glQ, long j, boolean z) {
        this.A00 = j;
        this.A01 = glQ;
        this.A02 = z;
    }
}
