package X;

import java.util.Map;

public final class GR5 implements C268004cb, C268014cc {
    public final AnonymousClass5Q8 A00;
    public final /* synthetic */ C268014cc A01;

    public final float AwL() {
        return this.A01.AwL();
    }

    public final float B77() {
        return this.A01.B77();
    }

    public final boolean CWf() {
        return this.A01.CWf();
    }

    public final /* synthetic */ C289145d6 Cfi(Map map, 0sP r5, int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & -16777216) == 0 && (-16777216 & i2) == 0) {
            return new GR7(i, i2, map);
        }
        I2E.A01(002.A0n("Size(", " x ", C273654mx.A00(436), i, i2));
        throw AnonymousClass00P.createAndThrow();
    }

    public final int EJS(float f) {
        return this.A01.EJS(f);
    }

    public final float Ezu(long j) {
        return this.A01.Ezu(j);
    }

    public final float Ezv(float f) {
        return this.A01.Ezv(f);
    }

    public final float Ezw(int i) {
        return this.A01.Ezw(i);
    }

    public final long Ezx(long j) {
        return this.A01.Ezx(j);
    }

    public final float F05(long j) {
        return this.A01.F05(j);
    }

    public final float F06(float f) {
        return this.A01.F06(f);
    }

    public final long FH8(long j) {
        return this.A01.FH8(j);
    }

    public final long FH9(float f) {
        return this.A01.FH9(f);
    }

    public final long FHA(float f) {
        return this.A01.FHA(f);
    }

    public final AnonymousClass5Q8 getLayoutDirection() {
        return this.A00;
    }

    public GR5(C268014cc r1, AnonymousClass5Q8 r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public static GR5 A00(C268014cc r2) {
        return new GR5(r2, r2.getLayoutDirection());
    }
}
