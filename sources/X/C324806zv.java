package X;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6zv  reason: invalid class name and case insensitive filesystem */
public abstract class C324806zv {
    public static void A00(TabLayout tabLayout, C324796zu r10, int i, int i2) {
        ArrayList arrayList;
        tabLayout.setImportantForAccessibility(4);
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i3 = i * 2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            arrayList = tabLayout.A0c;
            if (i4 >= arrayList.size()) {
                break;
            }
            View AN8 = r10.AN8(i4);
            AN8.measure(makeMeasureSpec, makeMeasureSpec);
            i6 += AN8.getMeasuredWidth() + i3;
            i5 = Math.max(i5, AN8.getMeasuredWidth());
            arrayList2.add(AN8);
            i4++;
        }
        int size = arrayList.size() * (i3 + i5);
        if (i6 > i2) {
            tabLayout.setTabMode(0);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                view.setMinimumWidth(view.getMeasuredWidth());
            }
        } else if (size > i2) {
            tabLayout.setTabMode(0);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setMinimumWidth(i5);
            }
        } else {
            tabLayout.setTabMode(1);
        }
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            C324746zp A07 = tabLayout.A07(i7);
            A07.getClass();
            A07.A03((View) arrayList2.get(i7));
        }
        if (1 == tabLayout.A02) {
            z = true;
        }
        0ok.A07(tabLayout, z);
        tabLayout.setImportantForAccessibility(1);
    }
}
