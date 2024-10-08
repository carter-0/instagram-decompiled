package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.5cD  reason: invalid class name and case insensitive filesystem */
public final class C288625cD extends C268054cg {
    public static final AnonymousClass5S9 A03;
    public C22052Xud A00;
    public C268434dO A01;
    public AnonymousClass6GP A02;

    static {
        AnonymousClass5S8 r2 = new AnonymousClass5S8();
        r2.ESE(AnonymousClass5RW.A02);
        r2.A01.setStrokeWidth(1.0f);
        r2.EnM(1);
        A03 = r2;
    }

    private final void A02() {
        if (!this.A03) {
            A0f();
            if (this.A00 != null) {
                0qQ.A0A(this.A02);
                throw new NullPointerException("isPlacementApproachInProgress");
            }
            A0N().E2n();
            0qQ.A0A(this.A06);
        }
    }

    public final int A0K(C292215ia r2) {
        AnonymousClass6GP r0 = this.A02;
        if (r0 == null) {
            return HRZ.A00(r2, this);
        }
        Number number = (Number) r0.A05.get(r2);
        if (number != null) {
            return number.intValue();
        }
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final C267794cD A0X() {
        return ((C267794cD) this.A01).A03;
    }

    public final AnonymousClass6GP A0Z() {
        return this.A02;
    }

    public final void A0b() {
        if (this.A02 == null) {
            this.A02 = new C52939GfD(this);
        }
    }

    public final void A0j(AnonymousClass5QA r2, GraphicsLayer graphicsLayer) {
        C268054cg r0 = this.A06;
        0qQ.A0A(r0);
        r0.A0k(r2, graphicsLayer);
        if (((AndroidComposeView) AnonymousClass5RJ.A00(this.A0H)).A0A) {
            A0i(r2, A03);
        }
    }

    public final void A0q(C268434dO r3) {
        C22052Xud xud;
        if (!r3.equals(this.A01)) {
            if ((((C267794cD) r3).A03.A01 & 512) != 0) {
                xud = this.A00;
                if (xud == null) {
                    xud = new C22052Xud(this);
                }
            } else {
                xud = null;
            }
            this.A00 = xud;
        }
        this.A01 = r3;
    }

    public final int CmV(int i) {
        if (this.A00 != null) {
            0qQ.A0A(this.A06);
            throw new NullPointerException("maxApproachIntrinsicHeight");
        }
        C268434dO r1 = this.A01;
        C268054cg r0 = this.A06;
        0qQ.A0A(r0);
        return r1.CmX(r0, this, i);
    }

    public final int CmY(int i) {
        if (this.A00 != null) {
            0qQ.A0A(this.A06);
            throw new NullPointerException("maxApproachIntrinsicWidth");
        }
        C268434dO r1 = this.A01;
        C268054cg r0 = this.A06;
        0qQ.A0A(r0);
        return r1.Cma(r0, this, i);
    }

    public final int CoO(int i) {
        if (this.A00 != null) {
            0qQ.A0A(this.A06);
            throw new NullPointerException("minApproachIntrinsicHeight");
        }
        C268434dO r1 = this.A01;
        C268054cg r0 = this.A06;
        0qQ.A0A(r0);
        return r1.CoQ(r0, this, i);
    }

    public final int CoR(int i) {
        if (this.A00 != null) {
            0qQ.A0A(this.A06);
            throw new NullPointerException("minApproachIntrinsicWidth");
        }
        C268434dO r1 = this.A01;
        C268054cg r0 = this.A06;
        0qQ.A0A(r0);
        return r1.CoT(r0, this, i);
    }

    public C288625cD(C268434dO r4, AnonymousClass5R6 r5) {
        super(r5);
        C52939GfD gfD;
        this.A01 = r4;
        C22052Xud xud = null;
        if (r5.A08 != null) {
            gfD = new C52939GfD(this);
        } else {
            gfD = null;
        }
        this.A02 = gfD;
        this.A00 = (((C267794cD) r4).A03.A01 & 512) != 0 ? new C22052Xud(this) : xud;
    }

    public final void A0I(GraphicsLayer graphicsLayer, float f, long j) {
        super.A0I(graphicsLayer, f, j);
        A02();
    }

    public final void A0J(0sP r1, float f, long j) {
        super.A0J(r1, f, j);
        A02();
    }

    public final C267974cY Cnz(long j) {
        A0F(j);
        C22052Xud xud = this.A00;
        if (xud != null) {
            AnonymousClass6GP r0 = xud.A00.A02;
            0qQ.A0A(r0);
            r0.A0N();
            throw new NullPointerException("isMeasurementApproachInProgress-ozmzZPI");
        }
        C268434dO r1 = this.A01;
        C268054cg r02 = this.A06;
        0qQ.A0A(r02);
        A0l(r1.Cny(r02, this, j));
        A0e();
        return this;
    }
}
