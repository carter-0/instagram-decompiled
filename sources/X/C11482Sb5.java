package X;

import android.view.View;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;

/* renamed from: X.Sb5  reason: case insensitive filesystem */
public final class C11482Sb5 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C11482Sb5(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        if (this.A00 != 0) {
            A05 = AnonymousClass0fD.A05(766943790);
            ((QEa) this.A02).A01.Dx0(this.A01);
            i = 1222828751;
        } else {
            A05 = AnonymousClass0fD.A05(247383473);
            int i2 = this.A01;
            QCH qch = ((QEX) this.A02).A00;
            int i3 = qch.A07.A03;
            Calendar A0u = Pxj.A0u();
            A0u.set(1, i2);
            A0u.set(2, i3);
            Month month = new Month(A0u);
            CalendarConstraints calendarConstraints = qch.A04;
            Month month2 = calendarConstraints.A05;
            Calendar calendar = month.A05;
            if (calendar.compareTo(month2.A05) >= 0) {
                Month month3 = calendarConstraints.A04;
                if (calendar.compareTo(month3.A05) > 0) {
                    month = month3;
                }
                month2 = month;
            }
            qch.A00(month2);
            qch.A08 = AnonymousClass05K.A00;
            qch.A01.setVisibility(8);
            qch.A00.setVisibility(0);
            qch.A00(qch.A07);
            i = -195383731;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
