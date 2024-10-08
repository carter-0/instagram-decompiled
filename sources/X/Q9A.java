package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import com.fbpay.w3c.CardDetails;
import com.instagram.android.R;

public final class Q9A extends ArrayAdapter {
    public final C7419QCi A00;
    public final LayoutInflater A01;

    public Q9A(Context context, C7419QCi qCi) {
        super(context, 0, qCi.A0A);
        this.A00 = qCi;
        LayoutInflater from = LayoutInflater.from(context);
        0qQ.A07(from);
        this.A01 = from;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        if (view == null) {
            view = DbT.A0C(this.A01, viewGroup, R.layout.layout_iab_autofill_dropdown_list_item);
            0qQ.A07(view);
        }
        C7419QCi qCi = this.A00;
        CardDetails cardDetails = (CardDetails) qCi.A0A.get(i);
        SGO.A00.A00(getContext(), view, cardDetails);
        ((CompoundButton) view.findViewById(R.id.radio_button)).setChecked(0qQ.A0K(cardDetails, qCi.A05.A02()));
        return view;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        if (view == null) {
            view = DbT.A0C(this.A01, viewGroup, R.layout.layout_iab_autofill_dropdown_list);
            0qQ.A07(view);
        }
        SGO.A00.A00(getContext(), view, (CardDetails) this.A00.A0A.get(i));
        return view;
    }

    public final int getCount() {
        return this.A00.A0A.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.A0A.get(i);
    }
}
