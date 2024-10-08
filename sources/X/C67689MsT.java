package X;

import android.widget.Filter;

/* renamed from: X.MsT  reason: case insensitive filesystem */
public final class C67689MsT extends Filter {
    public final /* synthetic */ C67688MsQ A00;

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
    }

    public C67689MsT(C67688MsQ msQ) {
        this.A00 = msQ;
    }

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        C67688MsQ msQ = this.A00;
        filterResults.values = msQ.A00;
        filterResults.count = msQ.getCount();
        return filterResults;
    }
}
