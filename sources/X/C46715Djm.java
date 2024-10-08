package X;

import android.text.TextUtils;
import android.widget.Filter;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Djm  reason: case insensitive filesystem */
public final class C46715Djm extends Filter {
    public final EUT A00 = new AnonymousClass2FB();
    public final E9J A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.EUT, X.2FB] */
    public C46715Djm(E9J e9j) {
        this.A01 = e9j;
        Iterator A0o = DbY.A0o(e9j.A04);
        while (A0o.hasNext()) {
            this.A00.A02(A0o.next());
        }
    }

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        int length;
        String A012 = 0mp.A01(charSequence);
        if (TextUtils.isEmpty(A012)) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            List unmodifiableList = Collections.unmodifiableList(this.A01.A04);
            0qQ.A07(unmodifiableList);
            filterResults.count = unmodifiableList.size();
            filterResults.values = unmodifiableList;
            return filterResults;
        }
        if (A012 == null || (length = A012.length()) == 0) {
            arrayList = AnonymousClass7TE.A1C();
        } else {
            17k.A0E(AnonymousClass7TF.A1R(length));
            HashSet A1F = AnonymousClass7TE.A1F();
            EUT eut = this.A00;
            Set set = (Set) eut.A01[Character.toLowerCase(A012.charAt(0)) % 30];
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    DirectShareTarget A0f = DbT.A0f(it);
                    String str = A0f.A0I;
                    String str2 = str;
                    if (str == null) {
                        str = "";
                    }
                    if (str.length() != 0) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (0mp.A0I(str2, A012, 0)) {
                            A1F.add(A0f);
                        }
                    }
                    String str3 = A0f.A0J;
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (str3.length() != 0 && 0mp.A0H(str3, A012)) {
                        A1F.add(A0f);
                    }
                }
            }
            arrayList = AnonymousClass7TE.A1D(A1F);
        }
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        filterResults2.values = arrayList;
        filterResults2.count = arrayList.size();
        return filterResults2;
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (!TextUtils.isEmpty(0mp.A01(charSequence)) && filterResults != null) {
            this.A01.A01((List) filterResults.values);
        }
    }
}
