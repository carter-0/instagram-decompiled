package X;

/* renamed from: X.GpH  reason: case insensitive filesystem */
public final class C53485GpH extends AnonymousClass0T0 implements C299575vQ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    public C53485GpH(AnonymousClass9IC r3, C278014w6 r4, C299505vJ r5, int i, boolean z) {
        String str;
        this.A00 = i;
        this.A03 = r5;
        this.A02 = r3;
        this.A05 = z;
        this.A01 = r4;
        if (i != 0) {
            str = "redesignedbannerview";
        } else {
            str = "bannerview";
        }
        this.A04 = C299615vU.A01(this, str, Be5().A03);
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53485GpH) || ((C53485GpH) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final String BK1() {
        if (2 - this.A00 != 0) {
            return this.A04;
        }
        return C299615vU.A01(this, "reposted", Be5().A03);
    }

    public final C299505vJ Be5() {
        Object obj;
        if (2 - this.A00 != 0) {
            obj = this.A03;
        } else {
            obj = this.A02;
        }
        return (C299505vJ) obj;
    }

    public final boolean equals(Object obj) {
        int i;
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (A00(2, obj)) {
                    C53485GpH gpH = (C53485GpH) obj;
                    if (0qQ.A0K(this.A02, gpH.A02) && 0qQ.A0K(this.A01, gpH.A01) && 0qQ.A0K(this.A04, gpH.A04) && this.A05 == gpH.A05) {
                        obj2 = this.A03;
                        obj3 = gpH.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
        }
        if (!A00(i, obj)) {
            return false;
        }
        C53485GpH gpH2 = (C53485GpH) obj;
        if (!0qQ.A0K(this.A03, gpH2.A03) || !0qQ.A0K(this.A02, gpH2.A02) || this.A05 != gpH2.A05) {
            return false;
        }
        obj2 = this.A01;
        obj3 = gpH2.A01;
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09;
        Object obj;
        int hashCode;
        if (2 - this.A00 != 0) {
            A09 = AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A03)));
            obj = this.A01;
        } else {
            A09 = AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02))));
            obj = this.A03;
        }
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return A09 + hashCode;
    }

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53485GpH(X.C278014w6 r7, X.C299505vJ r8, int r9, boolean r10) {
        /*
            r6 = this;
            r0 = r6
            r6.A00 = r9
            X.9IC r1 = X.G9w.A0O()
            if (r9 == 0) goto L_0x0011
            r4 = 1
        L_0x000a:
            r2 = r7
            r3 = r8
            r5 = r10
            r0.<init>((X.AnonymousClass9IC) r1, (X.C278014w6) r2, (X.C299505vJ) r3, (int) r4, (boolean) r5)
            return
        L_0x0011:
            r4 = 0
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53485GpH.<init>(X.4w6, X.5vJ, int, boolean):void");
    }

    public C53485GpH(AnonymousClass9IC r2, C299505vJ r3, Long l, String str, boolean z) {
        this.A00 = 2;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = str;
        this.A05 = z;
        this.A03 = l;
    }
}
