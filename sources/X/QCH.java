package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import com.instagram.android.R;
import java.util.LinkedHashSet;

public final class QCH extends Fragment {
    public static final Object A0B = "MONTHS_VIEW_GROUP_TAG";
    public static final Object A0C = "NAVIGATION_NEXT_TAG";
    public static final Object A0D = "NAVIGATION_PREV_TAG";
    public static final Object A0E = "SELECTOR_TOGGLE_TAG";
    public View A00;
    public View A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public CalendarConstraints A04;
    public C10811RyX A05;
    public DateSelector A06;
    public Month A07;
    public Integer A08;
    public int A09;
    public final LinkedHashSet A0A = DbS.A0y();

    public final void A00(Month month) {
        RecyclerView recyclerView = this.A02;
        QEc qEc = recyclerView.A0A;
        int A002 = qEc.A00(month);
        int A003 = A002 - qEc.A00(this.A07);
        boolean z = true;
        boolean A1W = C51970G9q.A1W(Math.abs(A003), 3);
        if (A003 <= 0) {
            z = false;
        }
        this.A07 = month;
        if (A1W) {
            int i = A002 + 3;
            if (z) {
                i = A002 - 3;
            }
            recyclerView.A0o(i);
        }
        this.A02.post(new THD(this, A002));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.A09);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.A06);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.A04);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.A07);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1119060977);
        QCH.super.onCreate(bundle);
        if (bundle == null) {
            bundle = this.mArguments;
        }
        this.A09 = bundle.getInt("THEME_RES_ID_KEY");
        this.A06 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.A04 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.A07 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
        AnonymousClass0fD.A09(505573587, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-299430201);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.A09);
        this.A05 = new C10811RyX(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.A04.A05;
        boolean A012 = QC7.A01(contextThemeWrapper);
        int i = R.layout.mtrl_calendar_horizontal;
        int i2 = 0;
        if (A012) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        03v.A0B(gridView, new U7N(this, 2));
        gridView.setAdapter(new Q9B());
        gridView.setNumColumns(month.A02);
        gridView.setEnabled(false);
        this.A02 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.A02.setLayoutManager(new C14789U9a(getContext(), this, i2, i2));
        this.A02.setTag("MONTHS_VIEW_GROUP_TAG");
        QEc qEc = new QEc(contextThemeWrapper, this.A04, this.A06, new SzP(this));
        this.A02.setAdapter(qEc);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mk_title_max_lines);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.A03 = recyclerView;
        if (recyclerView != null) {
            recyclerView.A0S = true;
            recyclerView.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.A03.setAdapter(new QEX(this));
            this.A03.A11(new QEg(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.month_navigation_fragment_toggle);
            A0d.setTag("SELECTOR_TOGGLE_TAG");
            03v.A0B(A0d, new U7N(this, 3));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.A01 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.A00 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            this.A08 = AnonymousClass05K.A00;
            this.A01.setVisibility(8);
            this.A00.setVisibility(0);
            A00(this.A07);
            A0d.setText(this.A07.A01(inflate.getContext()));
            this.A02.A15(new C53096GiU(0, A0d, this, qEc));
            C11496SbJ.A01(A0d, 69, this);
            C11499SbM.A01(findViewById2, 51, this, qEc);
            C11499SbM.A01(findViewById, 52, this, qEc);
        }
        if (!QC7.A01(contextThemeWrapper)) {
            new C228422le().A07(this.A02);
        }
        this.A02.A0o(qEc.A00(this.A07));
        AnonymousClass0fD.A09(1761182305, A022);
        return inflate;
    }
}
