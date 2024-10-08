package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.4cY  reason: invalid class name and case insensitive filesystem */
public abstract class C267974cY implements C267984cZ {
    public int A00;
    public int A01;
    public long A02 = 0;
    public long A03 = (0 << 32);
    public long A04 = AnonymousClass5SD.A00;

    public void A0I(GraphicsLayer graphicsLayer, float f, long j) {
        A0J((0sP) null, f, j);
    }

    public abstract void A0J(0sP r1, float f, long j);

    private final void A02() {
        long j = this.A03;
        int i = (int) (j >> 32);
        long j2 = this.A04;
        int A032 = C229632nm.A03(i, Constraints.A03(j2), Constraints.A01(j2));
        this.A01 = A032;
        int A002 = C289005cr.A00(j);
        int A033 = C229632nm.A03(A002, Constraints.A02(j2), Constraints.A00(j2));
        this.A00 = A033;
        this.A02 = AnonymousClass5TW.A00((A032 - i) / 2, (A033 - A002) / 2);
    }

    public final void A0E(long j) {
        if (this.A03 != j) {
            this.A03 = j;
            A02();
        }
    }

    public final void A0F(long j) {
        if (this.A04 != j) {
            this.A04 = j;
            A02();
        }
    }

    public int A0G() {
        return C289005cr.A00(this.A03);
    }

    public int A0H() {
        return (int) (this.A03 >> 32);
    }

    public /* synthetic */ Object BaX() {
        if (!(this instanceof C268054cg)) {
            return null;
        }
        AnonymousClass5R6 r8 = ((C268054cg) this).A0H;
        AnonymousClass5RP r2 = r8.A0W;
        boolean z = false;
        if ((r2.A02.A00 & 64) != 0) {
            z = true;
        }
        if (!z) {
            return null;
        }
        Object obj = null;
        for (C267794cD r7 = r2.A05; r7 != null; r7 = r7.A04) {
            if ((r7.A01 & 64) != 0) {
                C285045Pl r0 = null;
                C267794cD r5 = r7;
                do {
                    if (r5 instanceof AnonymousClass5VI) {
                        obj = ((AnonymousClass5VI) r5).CoX(r8.A0C, obj);
                    } else if ((r5.A01 & 64) != 0 && (r5 instanceof C267944cV)) {
                        int i = 0;
                        for (C267794cD r3 = ((C267944cV) r5).A00; r3 != null; r3 = r3.A02) {
                            if ((r3.A01 & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    r5 = r3;
                                } else {
                                    if (r0 == null) {
                                        r0 = new C285045Pl(new C267794cD[16]);
                                    }
                                    if (r5 != null) {
                                        r0.A09(r5);
                                        r5 = null;
                                    }
                                    r0.A09(r3);
                                }
                            }
                        }
                        if (i == 1) {
                            continue;
                        }
                    }
                    r5 = AnonymousClass5WH.A00(r0);
                    continue;
                } while (r5 != null);
            }
        }
        return obj;
    }
}
