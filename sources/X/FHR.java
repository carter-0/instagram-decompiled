package X;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import java.util.Calendar;

public final /* synthetic */ class FHR implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C48274Ebt A01;
    public final /* synthetic */ C307786Rm A02;
    public final /* synthetic */ C307896Rx A03;
    public final /* synthetic */ C277014uI A04;
    public final /* synthetic */ C277014uI A05;
    public final /* synthetic */ Calendar A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ FHR(Context context, C48274Ebt ebt, C307786Rm r3, C307896Rx r4, C277014uI r5, C277014uI r6, Calendar calendar, boolean z, boolean z2) {
        this.A06 = calendar;
        this.A07 = z;
        this.A00 = context;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = ebt;
        this.A03 = r4;
        this.A08 = z2;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar calendar = this.A06;
        boolean z = this.A07;
        Context context = this.A00;
        C307786Rm r2 = this.A02;
        C277014uI r4 = this.A04;
        C277014uI r5 = this.A05;
        C307896Rx r3 = this.A03;
        boolean z2 = this.A08;
        calendar.set(i, i2, i3);
        if (z) {
            C49733F3y.A01(context, r2, r3, r4, r5, calendar, z2);
            return;
        }
        DbX.A1O(r3, DbS.A0P(), r4, String.valueOf(AnonymousClass7TE.A0P(calendar.getTimeInMillis())));
    }
}
