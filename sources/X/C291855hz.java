package X;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Shader;
import android.text.TextPaint;

/* renamed from: X.5hz  reason: invalid class name and case insensitive filesystem */
public final class C291855hz extends TextPaint {
    public int A00;
    public C270284gU A01;
    public C288025bF A02;
    public C304786Ff A03;
    public C291805hu A04;
    public C291795ht A05;
    public AnonymousClass5S9 A06;
    public C289645dx A07;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.5S9, X.5S8, java.lang.Object] */
    private final AnonymousClass5S9 A00() {
        AnonymousClass5S9 r1 = this.A06;
        if (r1 != null) {
            return r1;
        }
        ? obj = new Object();
        obj.A01 = this;
        obj.A00 = 3;
        this.A06 = obj;
        return obj;
    }

    public final void A01(int i) {
        if (i != this.A00) {
            A00().EPk(i);
            this.A00 = i;
        }
    }

    public final void A02(long j) {
        if (j != 16) {
            setColor(C285595Rx.A00(j));
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            setShader((Shader) null);
        }
    }

    public final void A03(C304786Ff r4, float f, long j) {
        Shader shader;
        C288025bF r0;
        if (r4 == null) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            setShader((Shader) null);
        } else if (r4 instanceof C304776Fe) {
            long j2 = ((C304776Fe) r4).A00;
            if (!Float.isNaN(f) && f < 1.0f) {
                j2 = C285595Rx.A02(AnonymousClass5RX.A0K[(int) (j2 & 63)], AnonymousClass5RW.A03(j2), AnonymousClass5RW.A02(j2), AnonymousClass5RW.A01(j2), AnonymousClass5RW.A00(j2) * f);
            }
            A02(j2);
        } else if (r4 instanceof C298605tj) {
            if ((!0qQ.A0K(this.A03, r4) || (r0 = this.A02) == null || r0.A00 != j) && j != 9205357640488583168L) {
                this.A03 = r4;
                this.A02 = new C288025bF(j);
                this.A01 = new AnonymousClass5TX((C284895Os) null, new C41565AwX(j, r4, 1));
            }
            AnonymousClass5S9 A002 = A00();
            C270284gU r02 = this.A01;
            if (r02 != null) {
                shader = (Shader) r02.getValue();
            } else {
                shader = null;
            }
            AnonymousClass5S8 r2 = (AnonymousClass5S8) A002;
            r2.A02 = shader;
            r2.A01.setShader(shader);
            C16756V4p.A00(this, f);
        }
    }

    public final void A04(C291805hu r7) {
        if (r7 != null && !0qQ.A0K(this.A04, r7)) {
            this.A04 = r7;
            if (r7.equals(C291805hu.A03)) {
                clearShadowLayer();
                return;
            }
            C291805hu r5 = this.A04;
            float f = r5.A00;
            if (f == 0.0f) {
                f = Float.MIN_VALUE;
            }
            long j = r5.A02;
            setShadowLayer(f, C289295dM.A01(j), C289295dM.A02(j), C285595Rx.A00(r5.A01));
        }
    }

    public final void A05(C289645dx r5) {
        Paint.Join join;
        PathEffect pathEffect;
        if (r5 != null && !0qQ.A0K(this.A07, r5)) {
            this.A07 = r5;
            if (r5.equals(C289635dw.A00)) {
                setStyle(Paint.Style.FILL);
            } else if (r5 instanceof C298575tg) {
                A00().EnM(1);
                AnonymousClass5S9 A002 = A00();
                C298575tg r52 = (C298575tg) r5;
                ((AnonymousClass5S8) A002).A01.setStrokeWidth(r52.A01);
                AnonymousClass5S9 A003 = A00();
                ((AnonymousClass5S8) A003).A01.setStrokeMiter(r52.A00);
                AnonymousClass5S9 A004 = A00();
                int i = r52.A03;
                Paint paint = ((AnonymousClass5S8) A004).A01;
                if (i == 0) {
                    join = Paint.Join.MITER;
                } else {
                    join = Paint.Join.ROUND;
                }
                paint.setStrokeJoin(join);
                A00().EnK(r52.A02);
                AnonymousClass5S9 A005 = A00();
                C13866Tin tin = r52.A04;
                AnonymousClass5S8 r3 = (AnonymousClass5S8) A005;
                Paint paint2 = r3.A01;
                C56878IFz iFz = (C56878IFz) tin;
                if (iFz != null) {
                    pathEffect = iFz.A00;
                } else {
                    pathEffect = null;
                }
                paint2.setPathEffect(pathEffect);
                r3.A04 = tin;
            }
        }
    }

    public final void A06(C291795ht r4) {
        if (r4 != null && !0qQ.A0K(this.A05, r4)) {
            this.A05 = r4;
            int i = r4.A00;
            boolean z = false;
            if ((i | 1) == i) {
                z = true;
            }
            setUnderlineText(z);
            int i2 = this.A05.A00;
            boolean z2 = false;
            if ((i2 | 2) == i2) {
                z2 = true;
            }
            setStrikeThruText(z2);
        }
    }
}
