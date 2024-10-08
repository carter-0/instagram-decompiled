package X;

import androidx.compose.ui.platform.AndroidComposeView;
import com.instagram.compose.ui.gradientspinner.GradientSpinnerNode;

/* renamed from: X.4cD  reason: invalid class name and case insensitive filesystem */
public abstract class C267794cD implements C267804cE {
    public int A00 = -1;
    public int A01;
    public C267794cD A02;
    public C267794cD A03 = this;
    public C267794cD A04;
    public C268054cg A05;
    public AnonymousClass6GX A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public C262224Cq A0A;
    public boolean A0B;
    public boolean A0C;

    public void A0D() {
    }

    public final C262224Cq A05() {
        C262224Cq r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass19S A022 = 19E.A02(((AndroidComposeView) AnonymousClass5WH.A05(this)).A05.plus(new AnonymousClass19G((C262204Co) ((AndroidComposeView) AnonymousClass5WH.A05(this)).A05.get(C262204Co.A00))));
        this.A0A = A022;
        return A022;
    }

    public final void A06(C267794cD r2) {
        if (this instanceof C267944cV) {
            C267944cV r0 = (C267944cV) this;
            r0.A03 = r2;
            for (C267794cD r02 = r0.A00; r02 != null; r02 = r02.A02) {
                r02.A06(r2);
            }
            return;
        }
        this.A03 = r2;
    }

    public final void A07(C268054cg r2) {
        if (this instanceof C267944cV) {
            C267944cV r0 = (C267944cV) this;
            r0.A05 = r2;
            for (C267794cD r02 = r0.A00; r02 != null; r02 = r02.A02) {
                r02.A07(r2);
            }
            return;
        }
        this.A05 = r2;
    }

    public void A08() {
        String str;
        if (!(!this.A08)) {
            str = "node attached multiple times";
        } else if (this.A05 != null) {
            this.A08 = true;
            this.A0B = true;
            return;
        } else {
            str = "attach invoked on a node without a coordinator";
        }
        I2E.A01(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void A09() {
        String str;
        if (!this.A08) {
            str = "Cannot detach a node that is not attached";
        } else if (!(!this.A0B)) {
            str = "Must run runAttachLifecycle() before markAsDetached()";
        } else if (!(!this.A0C)) {
            str = "Must run runDetachLifecycle() before markAsDetached()";
        } else {
            this.A08 = false;
            C262224Cq r1 = this.A0A;
            if (r1 != null) {
                19E.A05(new PzT(), r1);
                this.A0A = null;
                return;
            }
            return;
        }
        I2E.A01(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void A0A() {
        if (!this.A08) {
            I2E.A01("reset() called on an unattached node");
            throw AnonymousClass00P.createAndThrow();
        } else {
            A0D();
        }
    }

    public void A0B() {
        String str;
        if (!this.A08) {
            str = "Must run markAsAttached() prior to runAttachLifecycle";
        } else if (!this.A0B) {
            str = "Must run runAttachLifecycle() only once after markAsAttached()";
        } else {
            this.A0B = false;
            A0E();
            this.A0C = true;
            return;
        }
        I2E.A01(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void A0C() {
        String str;
        if (!this.A08) {
            str = "node detached multiple times";
        } else if (this.A05 == null) {
            str = "detach invoked on a node without a coordinator";
        } else if (!this.A0C) {
            str = "Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()";
        } else {
            this.A0C = false;
            A0F();
            return;
        }
        I2E.A01(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void A0E() {
        if (this instanceof GradientSpinnerNode) {
            ((GradientSpinnerNode) this).DUu();
        }
    }

    public void A0F() {
        if (this instanceof C268794e0) {
            C268794e0 r4 = (C268794e0) this;
            int ordinal = r4.A0I().ordinal();
            if (ordinal == 0 || ordinal == 2) {
                ((AndroidComposeView) AnonymousClass5WH.A05(r4)).A0S.AHe(8, true, true, false);
                C286375Wc.A01(r4);
            } else if (ordinal == 1) {
                C285195Qd A002 = C286375Wc.A00(r4);
                try {
                    if (A002.A00) {
                        C285195Qd.A00(A002);
                    }
                    A002.A00 = true;
                    C286375Wc.A00(r4).A01.A09(r4, C288905cg.Inactive);
                } finally {
                    C285195Qd.A01(A002);
                }
            }
            r4.A00 = null;
        } else if (this instanceof GradientSpinnerNode) {
            ((GradientSpinnerNode) this).A05 = null;
        }
    }

    public boolean A0G() {
        if ((this instanceof C268794e0) || (this instanceof C268444dP) || (this instanceof C268424dN)) {
            return false;
        }
        return true;
    }
}
