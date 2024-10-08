package X;

/* renamed from: X.51Y  reason: invalid class name */
public final class AnonymousClass51Y implements AnonymousClass0L7, AnonymousClass0c8, AnonymousClass0dL {
    public 0TS A00;
    public 0TS A01;
    public boolean A02 = false;
    public final 0TS A03;
    public final AnonymousClass51Z A04;
    public final AnonymousClass51Z A05;

    public AnonymousClass51Y() {
        0TS r0;
        0TS r02 = 0TS.A01;
        this.A01 = r02;
        this.A00 = r02;
        this.A05 = 0yU.A07(AnonymousClass0yP.A00(36330402507932270L)) ? 0yU.A07(AnonymousClass0yP.A00(36330402507997807L)) ? AnonymousClass51Z.HIT_DANGER_ZONE : AnonymousClass51Z.IN_DANGER_ZONE : AnonymousClass51Z.DISABLED;
        if (0yU.A07(AnonymousClass0yP.A00(36330402508063344L))) {
            this.A04 = 0yU.A07(AnonymousClass0yP.A00(36330402508128881L)) ? AnonymousClass51Z.HIT_DANGER_ZONE : AnonymousClass51Z.IN_DANGER_ZONE;
            r0 = ((int) 0yU.A01(AnonymousClass0yP.A00(36611877484894502L))) == 2 ? 0TS.A03 : r0;
            r0 = 0TS.A02;
        } else {
            this.A04 = AnonymousClass51Z.DISABLED;
            r0 = 0TS.A02;
        }
        this.A03 = r0;
        AnonymousClass51Z r03 = this.A05;
        AnonymousClass51Z r1 = AnonymousClass51Z.DISABLED;
        if (r03 != r1 || this.A04 != r1) {
            0LA.A03(this, false);
        }
    }

    public final void Cvd() {
    }

    public final void CuY(0TS r4) {
        this.A00 = r4;
        if (this.A04 == AnonymousClass51Z.HIT_DANGER_ZONE) {
            0TS r2 = 0TS.A02;
            if (r4 == r2) {
                0TS r1 = this.A03;
                if (!(r1 == 0TS.A03 || r1 == r2)) {
                    return;
                }
            } else {
                0TS r12 = 0TS.A03;
                if (!(r4 == r12 && this.A03 == r12)) {
                    return;
                }
            }
            this.A02 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r6.A01 != X.0TS.A02) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cvh() {
        /*
            r6 = this;
            X.51Z r5 = r6.A05
            X.51Z r2 = X.AnonymousClass51Z.IN_DANGER_ZONE
            if (r5 != r2) goto L_0x000d
            X.0TS r1 = r6.A01
            X.0TS r0 = X.0TS.A02
            r4 = 1
            if (r1 == r0) goto L_0x000e
        L_0x000d:
            r4 = 0
        L_0x000e:
            X.51Z r3 = r6.A04
            if (r3 != r2) goto L_0x0046
            X.0TS r0 = r6.A00
            X.0TS r2 = X.0TS.A02
            if (r0 != r2) goto L_0x003d
            X.0TS r1 = r6.A03
            X.0TS r0 = X.0TS.A03
            if (r1 == r0) goto L_0x0020
            if (r1 != r2) goto L_0x0046
        L_0x0020:
            r1 = 1
        L_0x0021:
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x0029
            if (r4 != 0) goto L_0x0029
            if (r1 == 0) goto L_0x003c
        L_0x0029:
            X.0TS r2 = r6.A01
            X.0TS r1 = r6.A00
            X.0TS r0 = r6.A03
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r3, r2, r1, r0}
            java.lang.String r0 = "Expected application restart due to Memory-Red. JavaMode: %s, SpaceMode: %s, JavaState: %s, SpaceState: %s, SpaceThreshold: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.0Je.A00(r0)
        L_0x003c:
            return
        L_0x003d:
            X.0TS r1 = X.0TS.A03
            if (r0 != r1) goto L_0x0046
            X.0TS r0 = r6.A03
            if (r0 != r1) goto L_0x0046
            goto L_0x0020
        L_0x0046:
            r1 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51Y.Cvh():void");
    }

    public final void DMb(0TS r3) {
        this.A01 = r3;
        if (this.A05 == AnonymousClass51Z.HIT_DANGER_ZONE && r3 == 0TS.A02) {
            this.A02 = true;
        }
    }
}
