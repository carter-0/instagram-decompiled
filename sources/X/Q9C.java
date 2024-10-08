package X;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import com.instagram.android.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public final class Q9C extends BaseAdapter {
    public static final int A05 = Pxj.A0u().getMaximum(4);
    public C10811RyX A00;
    public Collection A01;
    public final CalendarConstraints A02;
    public final DateSelector A03;
    public final Month A04;

    public final boolean hasStableIds() {
        return true;
    }

    private void A00(TextView textView, long j) {
        C18569VuL vuL;
        if (textView != null) {
            if (this.A02.A03.CeC(j)) {
                textView.setEnabled(true);
                Iterator it = this.A03.Brc().iterator();
                while (true) {
                    if (it.hasNext()) {
                        long A0H = Pxg.A0H(it);
                        Calendar A0u = Pxj.A0u();
                        A0u.setTimeInMillis(j);
                        long timeInMillis = SMY.A01(A0u).getTimeInMillis();
                        Calendar A0u2 = Pxj.A0u();
                        A0u2.setTimeInMillis(A0H);
                        if (timeInMillis == SMY.A01(A0u2).getTimeInMillis()) {
                            vuL = this.A00.A03;
                            break;
                        }
                    } else {
                        int i = (SMY.A00().getTimeInMillis() > j ? 1 : (SMY.A00().getTimeInMillis() == j ? 0 : -1));
                        C10811RyX ryX = this.A00;
                        if (i == 0) {
                            vuL = ryX.A05;
                        } else {
                            vuL = ryX.A01;
                        }
                    }
                }
            } else {
                textView.setEnabled(false);
                vuL = this.A00.A02;
            }
            vuL.A01(textView);
        }
    }

    /* renamed from: A02 */
    public final Long getItem(int i) {
        Month month = this.A04;
        if (i < month.A00() || i > (month.A00() + month.A01) - 1) {
            return null;
        }
        Calendar A012 = SMY.A01(month.A05);
        A012.set(5, (i - month.A00()) + 1);
        return Long.valueOf(A012.getTimeInMillis());
    }

    public final int getCount() {
        Month month = this.A04;
        return month.A01 + month.A00();
    }

    public final long getItemId(int i) {
        return (long) (i / this.A04.A02);
    }

    public Q9C(CalendarConstraints calendarConstraints, DateSelector dateSelector, Month month) {
        this.A04 = month;
        this.A03 = dateSelector;
        this.A02 = calendarConstraints;
        this.A01 = dateSelector.Brc();
    }

    public static void A01(MaterialCalendarGridView materialCalendarGridView, Q9C q9c, long j) {
        Calendar A0u = Pxj.A0u();
        A0u.setTimeInMillis(j);
        Month month = new Month(A0u);
        Month month2 = q9c.A04;
        if (month.equals(month2)) {
            Calendar A012 = SMY.A01(month2.A05);
            A012.setTimeInMillis(j);
            q9c.A00((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.A00().A04.A00() + (A012.get(5) - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    public final /* bridge */ /* synthetic */ View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        Context context = viewGroup.getContext();
        if (this.A00 == null) {
            this.A00 = new C10811RyX(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(context).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        Month month = this.A04;
        int A002 = i - month.A00();
        if (A002 < 0 || A002 >= month.A01) {
            textView.setVisibility(8);
            textView.setEnabled(false);
        } else {
            int i2 = A002 + 1;
            textView.setTag(month);
            textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", AnonymousClass7TF.A1b(i2)));
            Calendar A012 = SMY.A01(month.A05);
            A012.set(5, i2);
            long timeInMillis = A012.getTimeInMillis();
            int i3 = month.A04;
            int i4 = new Month(SMY.A00()).A04;
            Locale locale = Locale.getDefault();
            if (i3 == i4) {
                str = "MMMEd";
            } else {
                str = "yMMMEd";
            }
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            textView.setContentDescription(instanceForSkeleton.format(new Date(timeInMillis)));
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        Long A022 = getItem(i);
        if (A022 != null) {
            A00(textView, A022.longValue());
        }
        return textView;
    }
}
