package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.5RT  reason: invalid class name */
public final class AnonymousClass5RT implements AnonymousClass5RU {
    public float A00 = 1.0f;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05 = 1.0f;
    public float A06 = 1.0f;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public C289315dO A0G;
    public C54727HQg A0H;
    public AnonymousClass5S2 A0I;
    public C268024cd A0J;
    public AnonymousClass5Q8 A0K;
    public boolean A0L;

    public final /* synthetic */ int EJS(float f) {
        return C289055cw.A01(this, f);
    }

    public final /* synthetic */ float Ezu(long j) {
        return C291905i4.A00(this, j);
    }

    public final /* synthetic */ float Ezw(int i) {
        return ((float) i) / this.A0J.AwL();
    }

    public final /* synthetic */ long Ezx(long j) {
        return C289055cw.A03(this, j);
    }

    public final /* synthetic */ float F05(long j) {
        return C289055cw.A00(this, j);
    }

    public final /* synthetic */ long FH8(long j) {
        return C289055cw.A04(this, j);
    }

    public final /* synthetic */ long FH9(float f) {
        return C291905i4.A01(this, f);
    }

    public final float AwL() {
        return this.A0J.AwL();
    }

    public final float B77() {
        return this.A0J.B77();
    }

    public final void EOX(float f) {
        if (this.A00 != f) {
            this.A0B |= 4;
            this.A00 = f;
        }
    }

    public final void EOc(long j) {
        long j2 = this.A0C;
        long j3 = AnonymousClass5RW.A01;
        if (j2 != j) {
            this.A0B |= 64;
            this.A0C = j;
        }
    }

    public final void EQN(float f) {
        if (this.A01 != f) {
            this.A0B |= C249703kE.FLAG_MOVED;
            this.A01 = f;
        }
    }

    public final void ERg(boolean z) {
        if (this.A0L != z) {
            this.A0B |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            this.A0L = z;
        }
    }

    public final void ESY(int i) {
        if (this.A0A != i) {
            this.A0B |= Constants.LOAD_RESULT_PGO;
            this.A0A = i;
        }
    }

    public final void EiT(C54727HQg hQg) {
        if (!0qQ.A0K(this.A0H, hQg)) {
            this.A0B |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
            this.A0H = hQg;
        }
    }

    public final void Ej3(float f) {
        if (this.A02 != f) {
            this.A0B |= 256;
            this.A02 = f;
        }
    }

    public final void Ej4(float f) {
        if (this.A03 != f) {
            this.A0B |= 512;
            this.A03 = f;
        }
    }

    public final void Ej5(float f) {
        if (this.A04 != f) {
            this.A0B |= 1024;
            this.A04 = f;
        }
    }

    public final void EjG(float f) {
        if (this.A05 != f) {
            this.A0B |= 1;
            this.A05 = f;
        }
    }

    public final void EjH(float f) {
        if (this.A06 != f) {
            this.A0B |= 2;
            this.A06 = f;
        }
    }

    public final void Ek7(float f) {
        if (this.A07 != f) {
            this.A0B |= 32;
            this.A07 = f;
        }
    }

    public final void Ek8(AnonymousClass5S2 r2) {
        if (!0qQ.A0K(this.A0I, r2)) {
            this.A0B |= 8192;
            this.A0I = r2;
        }
    }

    public final void Elm(long j) {
        long j2 = this.A0E;
        long j3 = AnonymousClass5RW.A01;
        if (j2 != j) {
            this.A0B |= 128;
            this.A0E = j;
        }
    }

    public final void EpB(long j) {
        long j2 = this.A0F;
        long j3 = C285605Ry.A01;
        if (j2 != j) {
            this.A0B |= 4096;
            this.A0F = j;
        }
    }

    public final void EpG(float f) {
        if (this.A08 != f) {
            this.A0B |= 8;
            this.A08 = f;
        }
    }

    public final void EpH(float f) {
        if (this.A09 != f) {
            this.A0B |= 16;
            this.A09 = f;
        }
    }

    public final /* synthetic */ float Ezv(float f) {
        return f / this.A0J.AwL();
    }

    public final /* synthetic */ float F06(float f) {
        return f * this.A0J.AwL();
    }

    public AnonymousClass5RT() {
        long j = AnonymousClass5RV.A00;
        this.A0C = j;
        this.A0E = j;
        this.A01 = 8.0f;
        this.A0F = C285605Ry.A01;
        this.A0I = AnonymousClass5S0.A00;
        this.A0A = 0;
        this.A0D = 9205357640488583168L;
        this.A0J = new AnonymousClass5Q7(1.0f, 1.0f);
        this.A0K = AnonymousClass5Q8.Ltr;
    }

    public final /* synthetic */ long FHA(float f) {
        return FH9(Ezv(f));
    }
}
