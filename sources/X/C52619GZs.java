package X;

import java.util.List;

/* renamed from: X.GZs  reason: case insensitive filesystem */
public final class C52619GZs implements C304736Ez {
    public final /* synthetic */ GZF A00;
    public final /* synthetic */ JRR A01;
    public final /* synthetic */ 0sK A02;

    public C52619GZs(GZF gzf, JRR jrr, 0sK r3) {
        this.A00 = gzf;
        this.A02 = r3;
        this.A01 = jrr;
    }

    public final float AEt(float f, float f2) {
        GZF gzf = this.A00;
        C284945Oz r2 = gzf.A0C;
        int i = ((GZQ) r2.getValue()).A05 + ((GZQ) r2.getValue()).A06;
        if (i == 0) {
            return 0.0f;
        }
        int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        int i3 = gzf.A02;
        if (i2 < 0) {
            i3++;
        }
        int A03 = C229632nm.A03(((int) (f2 / ((float) i))) + i3, 0, gzf.A04());
        r2.getValue();
        r2.getValue();
        long j = (long) i3;
        long j2 = j - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        int i4 = (int) j2;
        long j3 = j + 1;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        int abs = Math.abs((C229632nm.A03(C229632nm.A03(A03, i4, (int) j3), 0, gzf.A04()) - i3) * i) - i;
        if (abs < 0 || abs == 0) {
            return 0.0f;
        }
        return Math.signum(f) * ((float) abs);
    }

    public final float AF8(float f) {
        float f2;
        int A04;
        GZF gzf = this.A00;
        C284945Oz r8 = gzf.A0C;
        C304716Ex r7 = C51970G9q.A0Q(r8).A0A;
        List list = C51970G9q.A0Q(r8).A0F;
        int size = list.size();
        boolean z = false;
        int i = 0;
        float f3 = Float.NEGATIVE_INFINITY;
        float f4 = Float.POSITIVE_INFINITY;
        while (true) {
            f2 = 0.0f;
            if (i >= size) {
                break;
            }
            JLG jlg = (JLG) list.get(i);
            GZQ A0Q = C51970G9q.A0Q(r8);
            AnonymousClass6Gj r10 = A0Q.A09;
            AnonymousClass6Gj r9 = AnonymousClass6Gj.Vertical;
            long A0m = G9t.A0m(A0Q.A0J);
            if (r10 == r9) {
                A04 = C289005cr.A00(A0m);
            } else {
                A04 = C51965G9l.A04(A0m);
            }
            int i2 = -C51970G9q.A0Q(r8).A08;
            int i3 = C51970G9q.A0Q(r8).A03;
            int i4 = C51970G9q.A0Q(r8).A05;
            C52640GaE gaE = (C52640GaE) jlg;
            float E3C = ((float) gaE.A01) - ((float) r7.E3C(A04, i4, i2, i3, gaE.A03, gzf.A04()));
            if (E3C <= 0.0f && E3C > f3) {
                f3 = E3C;
            }
            if (E3C >= 0.0f && E3C < f4) {
                f4 = E3C;
            }
            i++;
        }
        if (f3 == Float.NEGATIVE_INFINITY) {
            f3 = f4;
        }
        if (f4 == Float.POSITIVE_INFINITY) {
            f4 = f3;
        }
        if (C56163Htr.A00(gzf) == 0.0f) {
            z = true;
        }
        boolean z2 = !z;
        if (!C51971G9r.A1W(gzf.A0R)) {
            if (z2 && C56163Htr.A01(gzf)) {
                f3 = 0.0f;
            }
            f4 = 0.0f;
        }
        if (C51971G9r.A1W(gzf.A0Q)) {
            f2 = f3;
        } else if (z2 && !C56163Htr.A01(gzf)) {
            f4 = 0.0f;
        }
        Float valueOf = Float.valueOf(f2);
        Float valueOf2 = Float.valueOf(f4);
        float floatValue = valueOf.floatValue();
        float floatValue2 = valueOf2.floatValue();
        float A042 = AnonymousClass7TE.A04(this.A02.invoke(Float.valueOf(f), Float.valueOf(floatValue), Float.valueOf(floatValue2)));
        if (A042 != floatValue && A042 != floatValue2 && A042 != 0.0f) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Final Snapping Offset Should Be one of ");
            A1A.append(floatValue);
            A1A.append(", ");
            A1A.append(floatValue2);
            throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(" or 0.0", A1A));
        } else if (A042 == Float.POSITIVE_INFINITY || A042 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        } else {
            return A042;
        }
    }
}
