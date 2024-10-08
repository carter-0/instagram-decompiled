package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import com.instagram.android.R;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

public final class QEc extends 2Rw {
    public final int A00;
    public final Context A01;
    public final CalendarConstraints A02;
    public final DateSelector A03;
    public final C13487TbE A04;

    public final int A00(Month month) {
        Month month2 = this.A02.A05;
        if (month2.A05 instanceof GregorianCalendar) {
            return ((month.A04 - month2.A04) * 12) + (month.A03 - month2.A03);
        }
        throw AnonymousClass7TE.A0w("Only Gregorian calendars are supported.");
    }

    public final Month A01(int i) {
        Calendar A012 = SMY.A01(this.A02.A05.A05);
        A012.add(2, i);
        return new Month(A012);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r8, int i) {
        QFB qfb = (QFB) r8;
        CalendarConstraints calendarConstraints = this.A02;
        Calendar A012 = SMY.A01(calendarConstraints.A05.A05);
        A012.add(2, i);
        Month month = new Month(A012);
        qfb.A00.setText(month.A01(DbS.A07(qfb)));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) qfb.A01.findViewById(R.id.month_grid);
        if (materialCalendarGridView.A00() == null || !month.equals(materialCalendarGridView.A00().A04)) {
            Q9C q9c = new Q9C(calendarConstraints, this.A03, month);
            materialCalendarGridView.setNumColumns(month.A02);
            materialCalendarGridView.setAdapter(q9c);
        } else {
            materialCalendarGridView.invalidate();
            Q9C A002 = materialCalendarGridView.A00();
            Iterator it = A002.A01.iterator();
            while (it.hasNext()) {
                Q9C.A01(materialCalendarGridView, A002, Pxg.A0H(it));
            }
            DateSelector dateSelector = A002.A03;
            if (dateSelector != null) {
                Iterator it2 = dateSelector.Brc().iterator();
                while (it2.hasNext()) {
                    Q9C.A01(materialCalendarGridView, A002, Pxg.A0H(it2));
                }
                A002.A01 = dateSelector.Brc();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new C11530Sbr(2, this, materialCalendarGridView));
    }

    public QEc(Context context, CalendarConstraints calendarConstraints, DateSelector dateSelector, C13487TbE tbE) {
        int i;
        Month month = calendarConstraints.A05;
        Month month2 = calendarConstraints.A04;
        Month month3 = calendarConstraints.A00;
        Calendar calendar = month.A05;
        Calendar calendar2 = month3.A05;
        if (calendar.compareTo(calendar2) > 0) {
            throw AnonymousClass7TE.A0w("firstPage cannot be after currentPage");
        } else if (calendar2.compareTo(month2.A05) <= 0) {
            int dimensionPixelSize = Q9C.A05 * context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
            if (QC7.A01(context)) {
                i = AnonymousClass7TF.A02(context, R.dimen.mtrl_calendar_day_height);
            } else {
                i = 0;
            }
            this.A01 = context;
            this.A00 = dimensionPixelSize + i;
            this.A02 = calendarConstraints;
            this.A03 = dateSelector;
            this.A04 = tbE;
            setHasStableIds(true);
        } else {
            throw AnonymousClass7TE.A0w("currentPage cannot be after lastPage");
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1635892790);
        int i = this.A02.A01;
        AnonymousClass0fD.A0A(1134934352, A032);
        return i;
    }

    public final long getItemId(int i) {
        int A032 = AnonymousClass0fD.A03(-342805615);
        Calendar A012 = SMY.A01(this.A02.A05.A05);
        A012.add(2, i);
        long timeInMillis = new Month(A012).A05.getTimeInMillis();
        AnonymousClass0fD.A0A(-1180910222, A032);
        return timeInMillis;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        boolean z = false;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (QC7.A01(context)) {
            linearLayout.setLayoutParams(new AnonymousClass3MX(-1, this.A00));
            z = true;
        }
        return new QFB(linearLayout, z);
    }
}
