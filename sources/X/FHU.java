package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.util.Calendar;

public final class FHU implements TimePickerDialog.OnTimeSetListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public FHU(C307786Rm r1, C307896Rx r2, C277014uI r3, Calendar calendar, int i) {
        this.A00 = i;
        this.A02 = calendar;
        if (i != 0) {
            this.A03 = r2;
            this.A04 = r3;
        } else {
            this.A04 = r3;
            this.A03 = r2;
        }
        this.A01 = r1;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        int i3 = this.A00;
        Object obj = this.A02;
        if (i3 != 0) {
            Calendar calendar = (Calendar) obj;
            calendar.set(11, i);
            calendar.set(12, i2);
            long A0P = AnonymousClass7TE.A0P(calendar.getTimeInMillis());
            C308276Tl A0P2 = DbS.A0P();
            A0P2.A01(this.A01);
            C299275ur.A00((C307896Rx) this.A03, DbT.A0V(A0P2, Long.valueOf(A0P)), (C277014uI) this.A04);
            return;
        }
        Calendar calendar2 = (Calendar) obj;
        calendar2.set(11, i);
        calendar2.set(12, i2);
        C277014uI r4 = (C277014uI) this.A04;
        if (r4 != null) {
            C308276Tl A0P3 = DbS.A0P();
            A0P3.A01(this.A01);
            A0P3.A02(String.valueOf(i));
            DbX.A1P((C307896Rx) this.A03, A0P3, r4, String.valueOf(i2), 2);
        }
    }
}
