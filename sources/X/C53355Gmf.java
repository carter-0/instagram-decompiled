package X;

/* renamed from: X.Gmf  reason: case insensitive filesystem */
public final class C53355Gmf extends AnonymousClass0T0 {
    public float A00;
    public float A01;
    public float A02;
    public final int A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53355Gmf(int r3) {
        /*
            r2 = this;
            r2.A03 = r3
            r1 = 0
            if (r3 == 0) goto L_0x000a
            r0 = 1
        L_0x0006:
            r2.<init>(r1, r1, r1, r0)
            return
        L_0x000a:
            r0 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53355Gmf.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A03 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof C53355Gmf)) {
            return false;
        }
        C53355Gmf gmf = (C53355Gmf) obj;
        if (gmf.A03 == i && Float.compare(this.A01, gmf.A01) == 0 && Float.compare(this.A02, gmf.A02) == 0 && Float.compare(this.A00, gmf.A00) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C51966G9m.A02(AnonymousClass7TF.A00(G9w.A00(this.A01), this.A02), this.A00);
    }

    public C53355Gmf(float f, float f2, float f3, int i) {
        this.A03 = i;
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
    }
}
