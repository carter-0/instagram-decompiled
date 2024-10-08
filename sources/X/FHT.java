package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.util.Calendar;

public final /* synthetic */ class FHT implements TimePickerDialog.OnTimeSetListener {
    public final /* synthetic */ C307896Rx A00;
    public final /* synthetic */ C277014uI A01;
    public final /* synthetic */ Calendar A02;

    public /* synthetic */ FHT(C307896Rx r1, C277014uI r2, Calendar calendar) {
        this.A02 = calendar;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        Calendar calendar = this.A02;
        C307896Rx r3 = this.A00;
        C277014uI r2 = this.A01;
        calendar.set(11, i);
        calendar.set(12, i2);
        DbX.A1O(r3, DbS.A0P(), r2, String.valueOf(AnonymousClass7TE.A0P(calendar.getTimeInMillis())));
    }
}
