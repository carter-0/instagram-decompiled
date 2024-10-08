package X;

/* renamed from: X.5S5  reason: invalid class name */
public final class AnonymousClass5S5 implements AnonymousClass5S6 {
    public final boolean EsO(AnonymousClass5R6 r2) {
        return true;
    }

    public final void AHA(AnonymousClass5T7 r8, AnonymousClass5R6 r9, long j, boolean z, boolean z2) {
        AnonymousClass5RP r2 = r9.A0W;
        C268054cg r1 = r2.A04;
        AnonymousClass5S3 r0 = C268054cg.A0L;
        long A0V = r1.A0V(j);
        r2.A04.A0n(r8, C268054cg.A0M, A0V, z, z2);
    }

    public final int ASm() {
        return 16;
    }

    public final boolean CNg(C267794cD r8) {
        C285045Pl r4 = null;
        while (r8 != null) {
            if (r8 instanceof AnonymousClass5VD) {
                if (((AnonymousClass5VD) r8).CNf()) {
                    return true;
                }
            } else if ((r8.A01 & 16) != 0 && (r8 instanceof C267944cV)) {
                int i = 0;
                for (C267794cD r2 = ((C267944cV) r8).A00; r2 != null; r2 = r2.A02) {
                    if ((r2.A01 & 16) != 0) {
                        i++;
                        if (i == 1) {
                            r8 = r2;
                        } else {
                            if (r4 == null) {
                                r4 = new C285045Pl(new C267794cD[16]);
                            }
                            if (r8 != null) {
                                r4.A09(r8);
                                r8 = null;
                            }
                            r4.A09(r2);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            r8 = AnonymousClass5WH.A00(r4);
        }
        return false;
    }
}
