package X;

import android.text.TextUtils;
import android.widget.Filter;
import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Djl  reason: case insensitive filesystem */
public final class C46714Djl extends Filter {
    public final /* synthetic */ C47583E8v A00;

    public C46714Djl(C47583E8v e8v) {
        this.A00 = e8v;
    }

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        ArrayList A0v = DbS.A0v(2);
        if (!TextUtils.isEmpty(charSequence)) {
            C47583E8v e8v = this.A00;
            synchronized (e8v) {
                for (Hashtag hashtag : e8v.A03) {
                    if (hashtag.getName() != null && hashtag.getName().contains(charSequence)) {
                        A1C.add(hashtag);
                    }
                }
                for (Hashtag hashtag2 : e8v.A04) {
                    if (hashtag2.getName() != null && hashtag2.getName().contains(charSequence)) {
                        A1C2.add(hashtag2);
                    }
                }
            }
        }
        A0v.add(0, A1C);
        A0v.add(1, A1C2);
        filterResults.count = A1C.size() + A1C2.size();
        filterResults.values = A0v;
        return filterResults;
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        C47583E8v e8v = this.A00;
        e8v.A00 = charSequence;
        e8v.A01 = (List) AnonymousClass7TE.A13((List) filterResults.values);
        e8v.A02 = (List) ((List) filterResults.values).get(1);
        List list = e8v.A01;
        if (list == null) {
            return;
        }
        if (!list.isEmpty() || !TextUtils.isEmpty(charSequence)) {
            List list2 = e8v.A01;
            List list3 = e8v.A02;
            e8v.A07 = true;
            List<Object> list4 = e8v.A03;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object add : list4) {
                A1C.add(add);
            }
            ArrayList A1D = AnonymousClass7TE.A1D(A1C);
            List<Object> list5 = e8v.A04;
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (Object add2 : list5) {
                A1C2.add(add2);
            }
            ArrayList A1D2 = AnonymousClass7TE.A1D(A1C2);
            e8v.A06();
            e8v.A03.clear();
            e8v.A03.addAll(list2);
            e8v.A04.clear();
            e8v.A04.addAll(list3);
            C47583E8v.A00(e8v);
            e8v.A03 = A1D;
            e8v.A04 = A1D2;
            return;
        }
        C47583E8v.A00(e8v);
    }
}
