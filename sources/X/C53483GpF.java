package X;

/* renamed from: X.GpF  reason: case insensitive filesystem */
public final class C53483GpF extends AnonymousClass0T0 implements C299575vQ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53483GpF(X.C299505vJ r3, int r4) {
        /*
            r2 = this;
            r2.A00 = r4
            X.9IC r1 = X.G9w.A0O()
            if (r4 == 0) goto L_0x000d
            r0 = 1
        L_0x0009:
            r2.<init>(r1, r3, r0)
            return
        L_0x000d:
            r0 = 0
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53483GpF.<init>(X.5vJ, int):void");
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53483GpF) || ((C53483GpF) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final String BK1() {
        String str;
        if (this.A00 != 0) {
            str = "pinnedPost";
        } else {
            str = "firstPost";
        }
        return C299615vU.A01(this, str, ((C299505vJ) this.A02).A03);
    }

    public final C299505vJ Be5() {
        return (C299505vJ) this.A02;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!A00(i, obj)) {
            return false;
        }
        C53483GpF gpF = (C53483GpF) obj;
        if (!0qQ.A0K(this.A02, gpF.A02) || !0qQ.A0K(this.A01, gpF.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A02));
    }

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public C53483GpF(AnonymousClass9IC r1, C299505vJ r2, int i) {
        this.A00 = i;
        this.A02 = r2;
        this.A01 = r1;
    }
}
