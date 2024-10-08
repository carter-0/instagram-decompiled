package X;

/* renamed from: X.GqF  reason: case insensitive filesystem */
public final class C53544GqF extends AnonymousClass0T0 implements JM9 {
    public final AnonymousClass62P A00;
    public final AnonymousClass62P A01;
    public final boolean A02;

    public C53544GqF(AnonymousClass62P r2, AnonymousClass62P r3, boolean z) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A02 = z;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53544GqF) {
                C53544GqF gqF = (C53544GqF) obj;
                if (!0qQ.A0K(this.A00, gqF.A00) || this.A02 != gqF.A02 || !0qQ.A0K(this.A01, gqF.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A00)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53544GqF() {
        /*
            r2 = this;
            X.62M r1 = X.AnonymousClass62M.A01
            r0 = 0
            r2.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53544GqF.<init>():void");
    }
}
