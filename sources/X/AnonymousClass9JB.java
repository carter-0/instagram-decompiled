package X;

/* renamed from: X.9JB  reason: invalid class name */
public final class AnonymousClass9JB extends AnonymousClass0T0 implements C299575vQ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public AnonymousClass9JB(AnonymousClass9IC r1, C299505vJ r2, String str, String str2, int i) {
        this.A00 = i;
        this.A02 = r2;
        this.A01 = r1;
        if (i != 0) {
            this.A03 = str;
            this.A04 = str2;
            return;
        }
        this.A04 = str;
        this.A03 = str2;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9JB) || ((AnonymousClass9JB) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final String BK1() {
        String A002;
        if (this.A00 != 0) {
            A002 = "transparencyLabel";
        } else {
            A002 = AnonymousClass000.A00(1560);
        }
        return C299615vU.A01(this, A002, ((C299505vJ) this.A02).A03);
    }

    public final C299505vJ Be5() {
        return (C299505vJ) this.A02;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!A00(1, obj)) {
                return false;
            }
            AnonymousClass9JB r3 = (AnonymousClass9JB) obj;
            if (!0qQ.A0K(this.A02, r3.A02) || !0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A03, r3.A03)) {
                return false;
            }
            str = this.A04;
            str2 = r3.A04;
        } else if (this == obj) {
            return true;
        } else {
            if (!A00(0, obj)) {
                return false;
            }
            AnonymousClass9JB r32 = (AnonymousClass9JB) obj;
            if (!0qQ.A0K(this.A02, r32.A02) || !0qQ.A0K(this.A01, r32.A01) || !0qQ.A0K(this.A04, r32.A04)) {
                return false;
            }
            str = this.A03;
            str2 = r32.A03;
        }
        if (!0qQ.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str;
        int i = this.A00;
        int hashCode2 = this.A02.hashCode();
        if (i != 0) {
            hashCode = ((((hashCode2 * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode()) * 31;
            str = this.A04;
        } else {
            hashCode = ((((hashCode2 * 31) + this.A01.hashCode()) * 31) + this.A04.hashCode()) * 31;
            str = this.A03;
        }
        return hashCode + str.hashCode();
    }

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9JB(X.C299505vJ r16, java.lang.String r17, java.lang.String r18, int r19) {
        /*
            r15 = this;
            r9 = r15
            r0 = r19
            r15.A00 = r0
            r3 = 0
            r2 = 31
            X.9IC r1 = new X.9IC
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            if (r19 == 0) goto L_0x0020
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r14 = 1
        L_0x0015:
            r10 = r1
            r11 = r16
            r12 = r17
            r13 = r18
            r9.<init>(r10, r11, r12, r13, r14)
            return
        L_0x0020:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r14 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9JB.<init>(X.5vJ, java.lang.String, java.lang.String, int):void");
    }
}
