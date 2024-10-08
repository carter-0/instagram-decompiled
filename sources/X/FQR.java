package X;

import android.widget.DatePicker;
import java.util.Calendar;

public final class FQR implements DatePicker.OnDateChangedListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public FQR(C307786Rm r1, C276544tV r2, C277014uI r3, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A03 = r3;
            this.A02 = r2;
        } else {
            this.A02 = r2;
            this.A03 = r3;
        }
        this.A01 = r1;
    }

    public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        switch (this.A00) {
            case 0:
                Calendar instance = Calendar.getInstance();
                instance.set(i4, i5, i6, 0, 0, 0);
                C308276Tl A0P = DbS.A0P();
                A0P.A03("0", 0);
                AnonymousClass6Tm A0V = DbT.A0V(A0P, Long.valueOf(AnonymousClass7TE.A0P(instance.getTimeInMillis())));
                C307886Rw.A03((C307786Rm) this.A01, (C276544tV) this.A02, A0V, (C277014uI) this.A03);
                return;
            case 1:
                C277014uI r4 = (C277014uI) this.A03;
                if (r4 != null) {
                    Calendar instance2 = Calendar.getInstance();
                    instance2.set(i4, i5, i6, 0, 0);
                    C308276Tl A0P2 = DbS.A0P();
                    A0P2.A03("0", 0);
                    AnonymousClass6Tm A0V2 = DbT.A0V(A0P2, Long.valueOf(AnonymousClass7TE.A0P(instance2.getTimeInMillis())));
                    C307886Rw.A03((C307786Rm) this.A01, (C276544tV) this.A02, A0V2, r4);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
