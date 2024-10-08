package X;

import java.io.IOException;

/* renamed from: X.Xyl  reason: case insensitive filesystem */
public final class C22276Xyl implements YAA {
    public final AnonymousClass4OI A00;
    public final C256883wV A01;
    public final C265144Ss A02;
    public final boolean A03;
    public final AnonymousClass4SU A04;
    public final /* synthetic */ C22274Xyj A05;

    public C22276Xyl(AnonymousClass4OI r1, AnonymousClass4SU r2, C256883wV r3, C22274Xyj xyj, C265144Ss r5, boolean z) {
        this.A05 = xyj;
        this.A02 = r5;
        this.A04 = r2;
        this.A00 = r1;
        this.A03 = z;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ void Dks(Object obj) {
        C256633w6 r7 = (C256633w6) obj;
        C22274Xyj xyj = this.A05;
        C290445fK r3 = xyj.A03;
        if (r3 != null) {
            r3.A01(this.A00.A0K.A0G, r7.A0P, r7.A02);
        }
        if (this.A03) {
            long A002 = C22274Xyj.A00(this.A00, this.A01, xyj);
            27B.A01("HeroExo2LiveInitHelper", "Inline manifest was null, setting live edge latency now to: %d", new Object[]{Long.valueOf(A002)});
            this.A02.A04 = A002;
        }
        C265144Ss r2 = this.A02;
        r2.A0C = r7;
        if (r2.A08 != null) {
            if (r2.A0N.A0U) {
                C265144Ss.A06(r2, false);
            } else {
                C265144Ss.A05(r2, false);
            }
        }
        xyj.A0A.Dks(r7);
    }

    public final void Dkt(IOException iOException) {
        this.A04.A00(iOException);
        this.A05.A0A.Dkt(iOException);
    }
}
