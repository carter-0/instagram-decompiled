package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Calendar;
import java.util.Locale;

public final class Q9B extends BaseAdapter {
    public final int A00;
    public final int A01;
    public final Calendar A02;

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) DbV.A0D(viewGroup).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.A02;
        int i2 = i + this.A01;
        int i3 = this.A00;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(2131967675), new Object[]{calendar.getDisplayName(7, 2, Locale.getDefault())}));
        return textView;
    }

    public final int getCount() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        int i2 = this.A00;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.A01;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    public Q9B() {
        Calendar A0u = Pxj.A0u();
        this.A02 = A0u;
        this.A00 = A0u.getMaximum(7);
        this.A01 = A0u.getFirstDayOfWeek();
    }
}
