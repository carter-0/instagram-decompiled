package X;

import android.text.TextUtils;
import android.widget.Filter;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Xy  reason: invalid class name */
public final class AnonymousClass9Xy extends Filter {
    public final UserSession A00;
    public final C379049Sf A01;

    public final CharSequence convertResultToString(Object obj) {
        if (obj instanceof Hashtag) {
            return 002.A0R("#", ((Hashtag) obj).getName());
        }
        return "";
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults != null) {
            C379049Sf r6 = this.A01;
            List list = (List) filterResults.values;
            AnonymousClass9YP r4 = r6.A0G;
            0qQ.A0B(list, 0);
            List list2 = r4.A01;
            list2.clear();
            int size = list.size();
            if (size > 2) {
                size = 2;
            }
            list2.addAll(list.subList(0, size));
            r4.notifyDataSetChanged();
            List list3 = r6.A0H.A02.BiX(charSequence.toString()).A06;
            if (list3 != null && !list3.isEmpty()) {
                r4.A00(list3);
            }
        }
    }

    public AnonymousClass9Xy(UserSession userSession, C379049Sf r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || charSequence.charAt(0) != '#') {
            return null;
        }
        ArrayList A02 = 1yr.A00(this.A00).A02(charSequence.subSequence(1, charSequence.length()).toString());
        ArrayList arrayList = new ArrayList(A02.size());
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            C18023Vjz vjz = new C18023Vjz(C281965Ag.A00(AnonymousClass7TE.A18(it)));
            vjz.A05 = true;
            arrayList.add(vjz.A00());
        }
        ArrayList A1D = AnonymousClass7TE.A1D(arrayList);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = A1D;
        filterResults.count = A1D.size();
        return filterResults;
    }
}
