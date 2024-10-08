package X;

import java.util.List;

/* renamed from: X.GJm  reason: case insensitive filesystem */
public final class C52221GJm implements JRF {
    public final /* synthetic */ 2V5 A00;
    public final /* synthetic */ 2V5 A01;
    public final /* synthetic */ 2V5 A02;
    public final /* synthetic */ 2V5 A03;
    public final /* synthetic */ C52219GJk A04;

    public final void DaS(C267324bN r6, int i, int i2, boolean z) {
        0qQ.A0B(r6, 0);
        C52219GJk gJk = this.A04;
        if (r6.equals(gJk.A01)) {
            this.A03.A00(Integer.valueOf(i));
            AnonymousClass3W1 r0 = gJk.A02.A0E;
            if (r0 != null) {
                int intValue = ((Number) r0.A3X.A00).intValue();
                Integer valueOf = Integer.valueOf(intValue);
                int i3 = 0;
                if (intValue >= 0 && valueOf != null) {
                    2V5 r02 = this.A01;
                    r02.A00(valueOf);
                    Number number = (Number) r02.A00;
                    if (number != null) {
                        i3 = number.intValue();
                    }
                    this.A02.A00(Long.valueOf(AnonymousClass30M.A06(AnonymousClass30J.SECONDS, AnonymousClass30K.A03(AnonymousClass30J.MILLISECONDS, ((i3 * i2) + i2) - i)) + 1));
                }
            }
        }
    }

    public final void Dxi(C267324bN r3, int i) {
        0qQ.A0B(r3, 0);
        if (0qQ.A0K(this.A04.A01, r3)) {
            this.A00.A00(true);
        }
    }

    public final void Dxm(C267324bN r4, Integer num, int i) {
        0qQ.A0B(r4, 0);
        if (0qQ.A0K(this.A04.A01, r4)) {
            this.A00.A00(false);
        }
    }

    public C52221GJm(2V5 r1, 2V5 r2, 2V5 r3, 2V5 r4, C52219GJk gJk) {
        this.A04 = gJk;
        this.A03 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r4;
    }

    public final void Dzs() {
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void DxZ(C267324bN r1, int i, int i2) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
