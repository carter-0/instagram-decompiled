package X;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Djn  reason: case insensitive filesystem */
public final class C46716Djn extends Filter {
    public final C363318jW A00 = new AnonymousClass2FB();
    public final C49464Ew5 A01;
    public final C337287g2 A02;

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        int length;
        Collection collection;
        0qQ.A0B(charSequence, 0);
        String A012 = 0mp.A01(charSequence);
        if (A012 == null || (length = A012.length()) == 0) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList A002 = this.A01.A00.A00();
            filterResults.count = A002.size();
            filterResults.values = A002;
            return filterResults;
        }
        LinkedHashSet A0y = DbS.A0y();
        C363318jW r3 = this.A00;
        if (length > 0 && (collection = r3.A01[Character.toLowerCase(A012.charAt(0)) % 30]) != null) {
            C336427eb.A00((1UV) null, A012, collection, A0y);
        }
        ArrayList A1D = AnonymousClass7TE.A1D(A0y);
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        filterResults2.values = A1D;
        filterResults2.count = A1D.size();
        return filterResults2;
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj;
        0qQ.A0B(charSequence, 0);
        String A012 = 0mp.A01(charSequence);
        if (A012 != null) {
            if (!(A012.length() == 0 || filterResults == null || (obj = filterResults.values) == null)) {
                C49464Ew5 ew5 = this.A01;
                0qQ.A0C(obj, AnonymousClass000.A00(3675));
                List list = (List) obj;
                0qQ.A0B(list, 0);
                FRO fro = ew5.A00;
                String str = ew5.A01;
                List A03 = FFJ.A03(list);
                fro.A01();
                fro.A04(str, A03);
            }
            List list2 = this.A02.BiX(A012).A06;
            if (list2 != null) {
                C49464Ew5 ew52 = this.A01;
                FRO fro2 = ew52.A00;
                Integer num = AnonymousClass05K.A01;
                0qQ.A0B(num, 0);
                fro2.A00 = num;
                fro2.A04(ew52.A01, FFJ.A03(list2));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.8jW, X.2FB] */
    public C46716Djn(C49464Ew5 ew5, C337287g2 r3) {
        this.A02 = r3;
        this.A01 = ew5;
    }
}
