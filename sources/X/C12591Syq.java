package X;

import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.Syq  reason: case insensitive filesystem */
public final class C12591Syq implements C13865Tim {
    public final C8567Qx5 A00;

    public final void FOj(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            C8567Qx5 A002 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int A0I = C51971G9r.A0I(list, i4);
                i3 += C8567Qx5.A00((A0I >> 31) ^ (A0I + A0I));
            }
            A002.A0C(i3);
            while (i2 < list.size()) {
                int A0I2 = C51971G9r.A0I(list, i2);
                A002.A0C((A0I2 >> 31) ^ (A0I2 + A0I2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C8567Qx5 qx5 = this.A00;
            int A0I3 = C51971G9r.A0I(list, i2);
            qx5.A0G(i, (A0I3 >> 31) ^ (A0I3 + A0I3));
            i2++;
        }
    }

    public final void FOq(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            C8567Qx5 A002 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8567Qx5.A00(C51971G9r.A0I(list, i4));
            }
            A002.A0C(i3);
            while (i2 < list.size()) {
                A002.A0C(C51971G9r.A0I(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0G(i, C51971G9r.A0I(list, i2));
            i2++;
        }
    }

    public final void FOs(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            C8567Qx5 A002 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8567Qx5.A01(Pxg.A0I(list, i4));
            }
            A002.A0C(i3);
            while (i2 < list.size()) {
                A002.A0M(Pxg.A0I(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0I(i, Pxg.A0I(list, i2));
            i2++;
        }
    }

    public final void FPR(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            C8567Qx5 A002 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3++;
            }
            A002.A0C(i3);
            while (i2 < list.size()) {
                A002.A09(AnonymousClass7TE.A1a(list.get(i2)) ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0K(i, AnonymousClass7TE.A1a(list.get(i2)));
            i2++;
        }
    }

    public final void FPd(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.A00.A0N((TAQ) list.get(i2), i);
        }
    }

    public final void FPt(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            C8567Qx5 A002 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 8;
            }
            A002.A0C(i3);
            while (i2 < list.size()) {
                A002.A0L(Pxg.A0G(list.get(i2)));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0H(i, Pxg.A0G(list.get(i2)));
            i2++;
        }
    }

    public final void FQ7(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            C8567Qx5 A002 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8567Qx5.A01((long) C51971G9r.A0I(list, i4));
            }
            A002.A0C(i3);
            while (i2 < list.size()) {
                A002.A0B(C51971G9r.A0I(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0E(i, C51971G9r.A0I(list, i2));
            i2++;
        }
    }

    public final void FQD(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            C8567Qx5 A002 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 4;
            }
            A002.A0C(i3);
            while (i2 < list.size()) {
                A002.A0A(C51971G9r.A0I(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0D(i, C51971G9r.A0I(list, i2));
            i2++;
        }
    }

    public final void FQG(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            C8567Qx5 A002 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 8;
            }
            A002.A0C(i3);
            while (i2 < list.size()) {
                A002.A0L(Pxg.A0I(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0H(i, Pxg.A0I(list, i2));
            i2++;
        }
    }

    public final void FQJ(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            C8567Qx5 A002 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 4;
            }
            A002.A0C(i3);
            while (i2 < list.size()) {
                A002.A0A(Float.floatToRawIntBits(AnonymousClass7TG.A00(list, i2)));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0D(i, Float.floatToRawIntBits(AnonymousClass7TG.A00(list, i2)));
            i2++;
        }
    }

    public final void FQM(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            C8567Qx5 A002 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8567Qx5.A01((long) C51971G9r.A0I(list, i4));
            }
            A002.A0C(i3);
            while (i2 < list.size()) {
                A002.A0B(C51971G9r.A0I(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0E(i, C51971G9r.A0I(list, i2));
            i2++;
        }
    }

    public final void FQO(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            C8567Qx5 A002 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8567Qx5.A01(Pxg.A0I(list, i4));
            }
            A002.A0C(i3);
            while (i2 < list.size()) {
                A002.A0M(Pxg.A0I(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0I(i, Pxg.A0I(list, i2));
            i2++;
        }
    }

    public final void FQS(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            C8567Qx5 A002 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 4;
            }
            A002.A0C(i3);
            while (i2 < list.size()) {
                A002.A0A(C51971G9r.A0I(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0D(i, C51971G9r.A0I(list, i2));
            i2++;
        }
    }

    public final void FQV(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            C8567Qx5 A002 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 8;
            }
            A002.A0C(i3);
            while (i2 < list.size()) {
                A002.A0L(Pxg.A0I(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0H(i, Pxg.A0I(list, i2));
            i2++;
        }
    }

    public static C8567Qx5 A00(C12591Syq syq, int i) {
        C8567Qx5 qx5 = syq.A00;
        qx5.A0F(i, 2);
        return qx5;
    }

    public static C12591Syq A01(C8567Qx5 qx5) {
        C12591Syq syq = qx5.A00;
        if (syq == null) {
            return new C12591Syq(qx5);
        }
        return syq;
    }

    public final void FOi(int i, int i2) {
        this.A00.A0G(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void FOk(int i, long j) {
        C8567Qx5 qx5 = this.A00;
        qx5.A0I(i, (j >> 63) ^ (j + j));
    }

    public final void FOl(int i, boolean z, List list) {
        int i2 = 0;
        if (z) {
            C8567Qx5 A002 = A00(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long A0I = Pxg.A0I(list, i4);
                i3 += C8567Qx5.A01((A0I >> 63) ^ (A0I + A0I));
            }
            A002.A0C(i3);
            while (i2 < list.size()) {
                long A0I2 = Pxg.A0I(list, i2);
                A002.A0M((A0I2 >> 63) ^ (A0I2 + A0I2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C8567Qx5 qx5 = this.A00;
            long A0I3 = Pxg.A0I(list, i2);
            qx5.A0I(i, (A0I3 >> 63) ^ (A0I3 + A0I3));
            i2++;
        }
    }

    @Deprecated
    public final void FOm(int i) {
        this.A00.A0F(i, 3);
    }

    public final void FOn(int i, String str) {
        this.A00.A0J(i, str);
    }

    public final void FOo(int i, List list) {
        int i2 = 0;
        if (list instanceof C13978TnU) {
            C13978TnU tnU = (C13978TnU) list;
            while (i2 < list.size()) {
                Object FPj = tnU.FPj(i2);
                boolean z = FPj instanceof String;
                C8567Qx5 qx5 = this.A00;
                if (z) {
                    qx5.A0J(i, (String) FPj);
                } else {
                    qx5.A0N((TAQ) FPj, i);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.A00.A0J(i, AnonymousClass7TE.A19(list, i2));
            i2++;
        }
    }

    public final void FOp(int i, int i2) {
        this.A00.A0G(i, i2);
    }

    public final void FOr(int i, long j) {
        this.A00.A0I(i, j);
    }

    public final void FPH(int i, boolean z) {
        this.A00.A0K(i, z);
    }

    public final void FPY(TAQ taq, int i) {
        this.A00.A0N(taq, i);
    }

    public final void FPk(int i, double d) {
        this.A00.A0H(i, Double.doubleToRawLongBits(d));
    }

    @Deprecated
    public final void FPw(int i) {
        this.A00.A0F(i, 4);
    }

    public final void FQ1(int i, int i2) {
        this.A00.A0E(i, i2);
    }

    public final void FQ9(int i, int i2) {
        this.A00.A0D(i, i2);
    }

    public final void FQF(int i, long j) {
        this.A00.A0H(i, j);
    }

    public final void FQI(int i, float f) {
        this.A00.A0D(i, Float.floatToRawIntBits(f));
    }

    public final void FQK(C13845TiL tiL, Object obj, int i) {
        C8567Qx5 qx5 = this.A00;
        qx5.A0F(i, 3);
        tiL.FQ3(qx5.A00, obj);
        qx5.A0F(i, 4);
    }

    public final void FQL(int i, int i2) {
        this.A00.A0E(i, i2);
    }

    public final void FQN(int i, long j) {
        this.A00.A0I(i, j);
    }

    public final void FQQ(C13845TiL tiL, Object obj, int i) {
        C13957TmK tmK = (C13957TmK) obj;
        C8567Qx5 qx5 = this.A00;
        qx5.A0C((i << 3) | 2);
        qx5.A0C(((C12586Syl) tmK).A0I(tiL));
        tiL.FQ3(qx5.A00, tmK);
    }

    public final void FQR(int i, int i2) {
        this.A00.A0D(i, i2);
    }

    public final void FQU(int i, long j) {
        this.A00.A0H(i, j);
    }

    public C12591Syq(C8567Qx5 qx5) {
        Charset charset = SS6.A02;
        this.A00 = qx5;
        qx5.A00 = this;
    }
}
