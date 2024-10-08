package X;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.5Q5  reason: invalid class name */
public final class AnonymousClass5Q5 implements AnonymousClass5Q3 {
    public AnonymousClass5S9 A00;
    public AnonymousClass5S9 A01;
    public final AnonymousClass5QB A02;
    public final AnonymousClass5QD A03 = new AnonymousClass5QC(this);

    public final void AQQ(C304786Ff r20, C288195bW r21, C289645dx r22, float f, float f2, float f3, int i, long j, long j2, boolean z) {
        AnonymousClass5QA r3 = this.A02.A01;
        float A012 = C289295dM.A01(0);
        float intBitsToFloat = Float.intBitsToFloat(0);
        r3.AQP(A00(r20, (C288195bW) null, r22, 1.0f, 3, 1), A012, intBitsToFloat, A012 + C288025bF.A02(j2), intBitsToFloat + C288025bF.A00(j2), f, f2, false);
    }

    public final void AQU(C304786Ff r10, C288195bW r11, C289645dx r12, float f, float f2, int i, long j) {
        this.A02.A01.AQT(A00(r10, (C288195bW) null, r12, f2, i, 1), f, j);
    }

    public final void AQi(C304786Ff r7, C288195bW r8, C13866Tin tin, float f, float f2, int i, int i2, long j, long j2) {
        this.A02.A01.AQk(A01(r7, this, f, f2, 0), j, j2);
    }

    public final void AQj(C288195bW r17, C13866Tin tin, float f, float f2, int i, int i2, long j, long j2, long j3) {
        AnonymousClass5QA r10 = this.A02.A01;
        AnonymousClass5S9 r11 = this.A01;
        AnonymousClass5S8 r112 = r11;
        if (r11 == null) {
            AnonymousClass5S8 r113 = new AnonymousClass5S8();
            r113.EnM(1);
            this.A01 = r113;
            r112 = r113;
        }
        AnonymousClass5S8 r2 = (AnonymousClass5S8) r112;
        long j4 = AnonymousClass5RW.A01;
        long j5 = j;
        if ((((long) r2.A01.getColor()) << 32) != j) {
            r112.ESE(j5);
        }
        if (r2.A02 != null) {
            r2.A02 = null;
            r2.A01.setShader((Shader) null);
        }
        if (!0qQ.A0K(r2.A03, (Object) null)) {
            r112.ESH((C288195bW) null);
        }
        if (r2.A00 != 3) {
            r112.EPk(3);
        }
        float f3 = f;
        if (r2.A01.getStrokeWidth() != f) {
            r2.A01.setStrokeWidth(f3);
        }
        if (r2.A01.getStrokeMiter() != 4.0f) {
            r2.A01.setStrokeMiter(4.0f);
        }
        int i3 = i;
        if (r112.C1y() != i3) {
            r112.EnK(i3);
        }
        if (r112.C20() != 0) {
            r2.A01.setStrokeJoin(Paint.Join.MITER);
        }
        if (!0qQ.A0K(r2.A04, (Object) null)) {
            r2.A01.setPathEffect((PathEffect) null);
            r2.A04 = null;
        }
        if (!r2.A01.isFilterBitmap()) {
            r2.A01.setFilterBitmap(true);
        }
        r10.AQk(r112, j2, j3);
    }

    public final void AQm(C304786Ff r10, C288195bW r11, C3018060d r12, C289645dx r13, float f, int i) {
        this.A02.A01.AQl(A00(r10, (C288195bW) null, r13, f, i, 1), r12);
    }

    public final void AQo(C304786Ff r4, C288195bW r5, C13866Tin tin, List list, float f, float f2, int i, int i2, int i3) {
        this.A02.A01.AQp(A01(r4, this, f, f2, 1), list, i);
    }

    public final void AQr(C304786Ff r15, C288195bW r16, C289645dx r17, float f, int i, long j, long j2) {
        AnonymousClass5QA r8 = this.A02.A01;
        float A012 = C289295dM.A01(j);
        float A022 = C289295dM.A02(j);
        r8.AQq(A00(r15, (C288195bW) null, r17, f, i, 1), A012, A022, A012 + C288025bF.A02(j2), A022 + C288025bF.A00(j2));
    }

    public final void AQs(C288195bW r15, C289645dx r16, float f, int i, long j, long j2, long j3) {
        AnonymousClass5QA r8 = this.A02.A01;
        float A012 = C289295dM.A01(j2);
        float A022 = C289295dM.A02(j2);
        r8.AQq(A02(r15, r16, f, i, j), A012, A022, A012 + C288025bF.A02(j3), A022 + C288025bF.A00(j3));
    }

    public final void AQu(C304786Ff r12, C288195bW r13, C289645dx r14, float f, int i, long j, long j2, long j3) {
        AnonymousClass5QA r3 = this.A02.A01;
        float A012 = C289295dM.A01(j);
        float A022 = C289295dM.A02(j);
        float A023 = A012 + C288025bF.A02(j2);
        float A002 = A022 + C288025bF.A00(j2);
        long j4 = AnonymousClass6GS.A00;
        r3.AQt(A00(r12, (C288195bW) null, r14, f, i, 1), A012, A022, A023, A002, Float.intBitsToFloat((int) (j3 >> 32)), AnonymousClass6GS.A00(j3));
    }

    public final void AQv(C288195bW r12, C289645dx r13, float f, int i, long j, long j2, long j3, long j4) {
        AnonymousClass5QA r3 = this.A02.A01;
        float A012 = C289295dM.A01(j2);
        float A022 = C289295dM.A02(j2);
        float A023 = A012 + C288025bF.A02(j3);
        float A002 = A022 + C288025bF.A00(j3);
        long j5 = AnonymousClass6GS.A00;
        r3.AQt(A02((C288195bW) null, r13, f, 3, j), A012, A022, A023, A002, Float.intBitsToFloat((int) (j4 >> 32)), AnonymousClass6GS.A00(j4));
    }

    public final /* synthetic */ int EJS(float f) {
        return C289055cw.A01(this, f);
    }

    public final /* synthetic */ float Ezu(long j) {
        return C291905i4.A00(this, j);
    }

    public final /* synthetic */ float Ezw(int i) {
        return ((float) i) / AwL();
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

    public static final AnonymousClass5S9 A01(C304786Ff r7, AnonymousClass5Q5 r8, float f, float f2, int i) {
        AnonymousClass5S9 r2 = r8.A01;
        AnonymousClass5S8 r22 = r2;
        if (r2 == null) {
            AnonymousClass5S8 r23 = new AnonymousClass5S8();
            r23.EnM(1);
            r8.A01 = r23;
            r22 = r23;
        }
        if (r7 != null) {
            r7.A00(r22, f2, r8.Bwg());
        } else if (((float) ((AnonymousClass5S8) r22).A01.getAlpha()) / 255.0f != f2) {
            r22.EOX(f2);
        }
        AnonymousClass5S8 r72 = (AnonymousClass5S8) r22;
        if (!0qQ.A0K(r72.A03, (Object) null)) {
            r22.ESH((C288195bW) null);
        }
        if (r72.A00 != 3) {
            r22.EPk(3);
        }
        if (r72.A01.getStrokeWidth() != f) {
            r72.A01.setStrokeWidth(f);
        }
        if (r72.A01.getStrokeMiter() != 4.0f) {
            r72.A01.setStrokeMiter(4.0f);
        }
        if (r22.C1y() != i) {
            r22.EnK(i);
        }
        if (r22.C20() != 0) {
            r72.A01.setStrokeJoin(Paint.Join.MITER);
        }
        if (!0qQ.A0K(r72.A04, (Object) null)) {
            r72.A01.setPathEffect((PathEffect) null);
            r72.A04 = null;
        }
        if (!r72.A01.isFilterBitmap()) {
            r72.A01.setFilterBitmap(true);
        }
        return r22;
    }

    private final AnonymousClass5S9 A03(C289645dx r6) {
        PathEffect pathEffect;
        Paint.Join join;
        if (0qQ.A0K(r6, C289635dw.A00)) {
            AnonymousClass5S9 r4 = this.A00;
            if (r4 != null) {
                return r4;
            }
            AnonymousClass5S8 r42 = new AnonymousClass5S8();
            r42.EnM(0);
            this.A00 = r42;
            return r42;
        } else if (r6 instanceof C298575tg) {
            AnonymousClass5S9 r43 = this.A01;
            AnonymousClass5S8 r44 = r43;
            if (r43 == null) {
                AnonymousClass5S8 r45 = new AnonymousClass5S8();
                r45.EnM(1);
                this.A01 = r45;
                r44 = r45;
            }
            AnonymousClass5S8 r3 = (AnonymousClass5S8) r44;
            float strokeWidth = r3.A01.getStrokeWidth();
            C298575tg r62 = (C298575tg) r6;
            float f = r62.A01;
            if (strokeWidth != f) {
                r3.A01.setStrokeWidth(f);
            }
            int C1y = r44.C1y();
            int i = r62.A02;
            if (C1y != i) {
                r44.EnK(i);
            }
            float strokeMiter = r3.A01.getStrokeMiter();
            float f2 = r62.A00;
            if (strokeMiter != f2) {
                r3.A01.setStrokeMiter(f2);
            }
            int C20 = r44.C20();
            int i2 = r62.A03;
            if (C20 != i2) {
                Paint paint = r3.A01;
                if (i2 == 0) {
                    join = Paint.Join.MITER;
                } else {
                    join = Paint.Join.ROUND;
                }
                paint.setStrokeJoin(join);
            }
            C13866Tin tin = r3.A04;
            C13866Tin tin2 = r62.A04;
            if (0qQ.A0K(tin, tin2)) {
                return r44;
            }
            Paint paint2 = r3.A01;
            C56878IFz iFz = (C56878IFz) tin2;
            if (iFz != null) {
                pathEffect = iFz.A00;
            } else {
                pathEffect = null;
            }
            paint2.setPathEffect(pathEffect);
            r3.A04 = tin2;
            return r44;
        } else {
            throw new RuntimeException();
        }
    }

    public final void AQR(C288195bW r15, C289645dx r16, float f, float f2, float f3, int i, long j, long j2, long j3, boolean z) {
        AnonymousClass5QA r1 = this.A02.A01;
        float A012 = C289295dM.A01(j2);
        float A022 = C289295dM.A02(j2);
        r1.AQP(A02((C288195bW) null, r16, 1.0f, 3, j), A012, A022, A012 + C288025bF.A02(j3), A022 + C288025bF.A00(j3), f, f2, z);
    }

    public final void AQV(C288195bW r10, C289645dx r11, float f, float f2, int i, long j, long j2) {
        this.A02.A01.AQT(A02((C288195bW) null, r11, 1.0f, i, j), f, j2);
    }

    public final void AQb(C288195bW r20, C3018260f r21, C289645dx r22, float f, int i, int i2, long j, long j2, long j3, long j4) {
        this.A02.A01.AQe(r21, A00((C304786Ff) null, r20, r22, f, i, i2), 0, j2, j3, j4);
    }

    public final void AQd(C288195bW r12, C3018260f r13, C289645dx r14, float f, int i, long j) {
        this.A02.A01.AQc(r13, A00((C304786Ff) null, r12, r14, 1.0f, 3, 1), 0);
    }

    public final void AQn(C288195bW r10, C3018060d r11, C289645dx r12, float f, int i, long j) {
        this.A02.A01.AQl(A02((C288195bW) null, r12, 1.0f, 3, j), r11);
    }

    public final /* synthetic */ long AmQ() {
        return C288015bE.A01(((AnonymousClass5QC) this.A03).A02.A02.A00);
    }

    public final float AwL() {
        return this.A02.A02.AwL();
    }

    public final AnonymousClass5QD Ayw() {
        return this.A03;
    }

    public final float B77() {
        return this.A02.A02.B77();
    }

    public final /* synthetic */ long Bwg() {
        return ((AnonymousClass5QC) this.A03).A02.A02.A00;
    }

    public final AnonymousClass5Q8 getLayoutDirection() {
        return this.A02.A03;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.5QA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.5QB] */
    public AnonymousClass5Q5() {
        C268024cd r5 = AnonymousClass5Q6.A00;
        AnonymousClass5Q8 r4 = AnonymousClass5Q8.Ltr;
        ? obj = new Object();
        ? obj2 = new Object();
        obj2.A02 = r5;
        obj2.A03 = r4;
        obj2.A01 = obj;
        obj2.A00 = 0;
        this.A02 = obj2;
    }

    private final AnonymousClass5S9 A00(C304786Ff r8, C288195bW r9, C289645dx r10, float f, int i, int i2) {
        AnonymousClass5S9 A032 = A03(r10);
        if (r8 != null) {
            r8.A00(A032, f, Bwg());
        } else {
            AnonymousClass5S8 r6 = (AnonymousClass5S8) A032;
            if (r6.A02 != null) {
                r6.A02 = null;
                r6.A01.setShader((Shader) null);
            }
            long j = AnonymousClass5RW.A01;
            if ((((long) r6.A01.getColor()) << 32) != j) {
                A032.ESE(j);
            }
            if (((float) r6.A01.getAlpha()) / 255.0f != f) {
                A032.EOX(f);
            }
        }
        AnonymousClass5S8 r2 = (AnonymousClass5S8) A032;
        if (!0qQ.A0K(r2.A03, r9)) {
            A032.ESH(r9);
        }
        if (r2.A00 != i) {
            A032.EPk(i);
        }
        int i3 = 1;
        if (!r2.A01.isFilterBitmap()) {
            i3 = 0;
        }
        if (i3 != i2) {
            Paint paint = r2.A01;
            boolean z = false;
            if (i2 == 0) {
                z = true;
            }
            paint.setFilterBitmap(!z);
        }
        return A032;
    }

    private final AnonymousClass5S9 A02(C288195bW r7, C289645dx r8, float f, int i, long j) {
        AnonymousClass5S9 A032 = A03(r8);
        if (f != 1.0f) {
            j = C285595Rx.A02(AnonymousClass5RX.A0K[(int) (j & 63)], AnonymousClass5RW.A03(j), AnonymousClass5RW.A02(j), AnonymousClass5RW.A01(j), AnonymousClass5RW.A00(j) * f);
        }
        AnonymousClass5S8 r3 = (AnonymousClass5S8) A032;
        long j2 = AnonymousClass5RW.A01;
        if ((((long) r3.A01.getColor()) << 32) != j) {
            A032.ESE(j);
        }
        if (r3.A02 != null) {
            r3.A02 = null;
            r3.A01.setShader((Shader) null);
        }
        if (!0qQ.A0K(r3.A03, r7)) {
            A032.ESH(r7);
        }
        if (r3.A00 != i) {
            A032.EPk(i);
        }
        if (!r3.A01.isFilterBitmap()) {
            r3.A01.setFilterBitmap(true);
        }
        return A032;
    }

    public final /* synthetic */ float Ezv(float f) {
        return f / AwL();
    }

    public final /* synthetic */ float F06(float f) {
        return f * AwL();
    }

    public final /* synthetic */ long FHA(float f) {
        return FH9(Ezv(f));
    }
}
