package X;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
import android.widget.DatePicker;
import com.instagram.android.R;
import java.util.Calendar;

public final class FHQ implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ Calendar A03;

    public FHQ(C307786Rm r1, C307896Rx r2, C277014uI r3, Calendar calendar) {
        this.A03 = calendar;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar calendar = this.A03;
        calendar.set(i, i2, i3);
        C307786Rm r4 = this.A00;
        C277014uI r6 = this.A02;
        C307896Rx r5 = this.A01;
        Context context = r4.A00;
        AnonymousClass0fN.A00(new TimePickerDialog(context, R.style.SpinnerTimePickerDialog, new FHU(r4, r5, r6, calendar, 1), calendar.get(11), calendar.get(12), DateFormat.is24HourFormat(context)));
    }
}
