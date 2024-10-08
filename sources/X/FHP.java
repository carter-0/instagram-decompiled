package X;

import android.app.DatePickerDialog;
import android.text.format.DateFormat;
import android.widget.DatePicker;
import java.util.Calendar;

public final class FHP implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ Calendar A03;

    public FHP(C307786Rm r1, C307896Rx r2, C277014uI r3, Calendar calendar) {
        this.A03 = calendar;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar calendar = this.A03;
        calendar.set(i, i2, i3);
        C277014uI r3 = this.A02;
        if (r3 != null) {
            C307896Rx r2 = this.A01;
            C308276Tl A0P = DbS.A0P();
            A0P.A01(this.A00);
            C299275ur.A00(r2, DbT.A0V(A0P, DateFormat.format("yyyy-MM-dd", calendar)), r3);
        }
    }
}
