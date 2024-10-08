package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.gallery.Medium;

/* renamed from: X.JVx  reason: case insensitive filesystem */
public final class C59739JVx extends C249703kE implements B1G {
    public Medium A00 = null;
    public final ConstraintLayout A01;
    public final MQB A02;
    public final C59738JVw A03;

    public C59739JVx(ConstraintLayout constraintLayout, MQB mqb, C59738JVw jVw) {
        super(constraintLayout);
        this.A01 = constraintLayout;
        this.A03 = jVw;
        this.A02 = mqb;
    }

    public final void DSb() {
        C378479Py r1;
        MQB mqb = this.A02;
        if ((mqb instanceof C378479Py) && (r1 = (C378479Py) mqb) != null) {
            r1.A03 = true;
        }
    }
}
