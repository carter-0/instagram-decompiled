package X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ListAdapter;
import java.util.List;

/* renamed from: X.6y4  reason: invalid class name and case insensitive filesystem */
public final class C323766y4 {
    public static final Object A0A = new Object();
    public ListAdapter A00;
    public C322876wY A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public final DataSetObserver A06 = new C323786y6(this);
    public final ViewGroup A07;
    public final C323776y5 A08 = new C323776y5();
    public final C231452rh A09 = new C323796y7(this);

    public static final void A00(C323766y4 r10, String str) {
        if (!r10.A03) {
            C322876wY r1 = r10.A01;
            if (r1 != null) {
                r1.DvZ(r10.A05, str);
                r10.A05++;
            }
            C323776y5 r9 = r10.A08;
            List list = r9.A00;
            list.clear();
            ListAdapter listAdapter = r10.A00;
            if (listAdapter != null) {
                int count = listAdapter.getCount();
                for (int i = 0; i < count; i++) {
                    list.add(Integer.valueOf(listAdapter.getItemViewType(i)));
                }
            }
            C232332tX.A00(r9).A02(r10.A09);
            ListAdapter listAdapter2 = r10.A00;
            if (listAdapter2 != null) {
                int count2 = listAdapter2.getCount();
                for (int i2 = 0; i2 < count2; i2++) {
                    ViewGroup viewGroup = r10.A07;
                    View childAt = viewGroup.getChildAt(i2);
                    0qQ.A0A(childAt);
                    if (!(childAt instanceof ViewStub) || !0qQ.A0K(childAt.getTag(), A0A)) {
                        listAdapter2.getView(i2, childAt, viewGroup);
                    } else {
                        View view = listAdapter2.getView(i2, (View) null, viewGroup);
                        0qQ.A0A(view);
                        viewGroup.removeViewAt(i2);
                        viewGroup.addView(view, i2);
                    }
                }
                List list2 = r9.A01;
                list2.clear();
                list2.addAll(list);
                r10.A02 = false;
                C322876wY r0 = r10.A01;
                if (r0 != null) {
                    0qQ.A0B(((C322866wX) r0).A00.A0M, 0);
                    02m.A0p.markerEnd(18290511, 2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public C323766y4(ViewGroup viewGroup) {
        this.A07 = viewGroup;
    }
}
