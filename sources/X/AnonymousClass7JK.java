package X;

import android.view.View;
import android.widget.Chronometer;

/* renamed from: X.7JK  reason: invalid class name */
public final class AnonymousClass7JK implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass7JI A00;

    public AnonymousClass7JK(AnonymousClass7JI r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-148078796);
        AnonymousClass7JI r6 = this.A00;
        AnonymousClass0eM r2 = r6.A0V;
        if (((C74493Pvn) r2.getValue()).isRecording()) {
            r6.A0Q.Dzp();
            ((C74493Pvn) r2.getValue()).EyI(false);
        } else {
            C63822L8d AuR = ((C74493Pvn) r2.getValue()).AuR();
            if (AuR != null) {
                AnonymousClass7JI.A09(r6, AuR);
                Chronometer chronometer = r6.A09;
                if (chronometer != null) {
                    boolean z = false;
                    if (((int) (r6.A02 - chronometer.getBase())) < 750) {
                        z = true;
                    }
                    AnonymousClass7JI.A0B(r6, z, false);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
                    AnonymousClass0fD.A0C(1812953616, A05);
                    throw illegalStateException;
                }
            }
        }
        AnonymousClass0fD.A0C(1391010276, A05);
    }
}
