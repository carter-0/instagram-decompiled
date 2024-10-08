package X;

import android.graphics.Canvas;
import android.view.MotionEvent;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7PL  reason: invalid class name */
public abstract class AnonymousClass7PL extends C249703kE implements AnonymousClass7PM, AnonymousClass7PN {
    public C331837So A00;

    public void A01() {
    }

    public abstract void A03(C331837So r1);

    public boolean A02() {
        if ((this instanceof AnonymousClass7PI) || (this instanceof AnonymousClass7PR) || (this instanceof C331257Qe) || (this instanceof C331267Qf) || (this instanceof C3256773r)) {
            return false;
        }
        return true;
    }

    public final boolean AFz() {
        if (!(this instanceof C331017Pd) && !(this instanceof AnonymousClass7AU)) {
            return false;
        }
        C249703kE r1 = ((AnonymousClass7PK) this).A00;
        if (r1 instanceof AnonymousClass7PM) {
            return ((AnonymousClass7PM) r1).AFz();
        }
        return false;
    }

    public boolean AG0(MotionEvent motionEvent) {
        if (!(this instanceof C331017Pd) && !(this instanceof AnonymousClass7AU)) {
            return false;
        }
        C249703kE r1 = ((AnonymousClass7PK) this).A00;
        if (r1 instanceof AnonymousClass7PM) {
            return ((AnonymousClass7PM) r1).AG0(motionEvent);
        }
        return false;
    }

    public void APf(MotionEvent motionEvent) {
        if (this instanceof C331017Pd) {
            C249703kE r1 = ((AnonymousClass7PK) this).A00;
            if (r1 instanceof AnonymousClass7PN) {
                ((AnonymousClass7PN) r1).APf(motionEvent);
            }
        }
    }

    public final Integer C3V() {
        if ((this instanceof AnonymousClass7AU) || (this instanceof C331017Pd)) {
            C249703kE r1 = ((AnonymousClass7PK) this).A00;
            if (r1 instanceof AnonymousClass7PM) {
                return ((AnonymousClass7PM) r1).C3V();
            }
        }
        return AnonymousClass05K.A00;
    }

    public final float C3X() {
        if (!(this instanceof AnonymousClass7AU) && !(this instanceof C331017Pd)) {
            return 2.14748365E9f;
        }
        C249703kE r1 = ((AnonymousClass7PK) this).A00;
        if (r1 instanceof AnonymousClass7PM) {
            return ((AnonymousClass7PM) r1).C3X();
        }
        return 2.14748365E9f;
    }

    public final List CFS() {
        if ((this instanceof C331017Pd) || (this instanceof AnonymousClass7AU)) {
            C249703kE r1 = ((AnonymousClass7PK) this).A00;
            if (r1 instanceof AnonymousClass7PM) {
                return ((AnonymousClass7PM) r1).CFS();
            }
        }
        return Collections.emptyList();
    }

    public final List CFT() {
        if ((this instanceof C331017Pd) || (this instanceof AnonymousClass7AU)) {
            C249703kE r1 = ((AnonymousClass7PK) this).A00;
            if (r1 instanceof AnonymousClass7PM) {
                return ((AnonymousClass7PM) r1).CFT();
            }
        }
        return Collections.emptyList();
    }

    public final void DAn(Canvas canvas, Integer num, float f) {
        if ((this instanceof AnonymousClass7AU) || (this instanceof C331017Pd)) {
            C249703kE r1 = ((AnonymousClass7PK) this).A00;
            if (r1 instanceof AnonymousClass7PM) {
                ((AnonymousClass7PM) r1).DAn(canvas, num, f);
            }
        }
    }

    public final void Dq2(Integer num) {
        if ((this instanceof AnonymousClass7AU) || (this instanceof C331017Pd)) {
            C249703kE r1 = ((AnonymousClass7PK) this).A00;
            if (r1 instanceof AnonymousClass7PM) {
                ((AnonymousClass7PM) r1).Dq2(num);
            }
        }
    }

    public boolean EsS(MotionEvent motionEvent) {
        if (!(this instanceof C331017Pd)) {
            return false;
        }
        C249703kE r1 = ((AnonymousClass7PK) this).A00;
        if (r1 instanceof AnonymousClass7PN) {
            return ((AnonymousClass7PN) r1).EsS(motionEvent);
        }
        return false;
    }

    public final boolean Esh() {
        if (!(this instanceof C331017Pd)) {
            return false;
        }
        C249703kE r1 = ((AnonymousClass7PK) this).A00;
        if (r1 instanceof AnonymousClass7PN) {
            return ((AnonymousClass7PN) r1).Esh();
        }
        return false;
    }

    public void DAV(float f, float f2) {
        if (A02()) {
            this.itemView.setTranslationX(f);
        }
    }

    public final String toString() {
        return 002.A0R(getClass().getName(), super.toString());
    }
}
