package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ts0  reason: case insensitive filesystem */
public final class C14220Ts0 {
    public AnonymousClass0hF A00;
    public C231402rc A01;
    public C14072TpM A02;
    public ViewPager2 A03;
    public long A04 = -1;
    public final /* synthetic */ C14191TrW A05;

    public C14220Ts0(C14191TrW trW) {
        this.A05 = trW;
    }

    public final void A00(boolean z) {
        int i;
        Fragment fragment;
        C14191TrW trW = this.A05;
        0hq r6 = trW.A07;
        if (!r6.A12() && this.A03.A08.A02 == 0) {
            01c r9 = trW.A04;
            if (r9.A00() != 0 && trW.getItemCount() != 0 && (i = this.A03.A00) < trW.getItemCount()) {
                long itemId = trW.getItemId(i);
                if ((itemId != this.A04 || z) && (fragment = (Fragment) r9.A05(itemId)) != null && fragment.isAdded()) {
                    this.A04 = itemId;
                    0s1 r5 = new 0s1(r6);
                    Fragment fragment2 = null;
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < r9.A00(); i2++) {
                        long A022 = r9.A02(i2);
                        Fragment fragment3 = (Fragment) r9.A04(i2);
                        if (fragment3.isAdded()) {
                            if (A022 != this.A04) {
                                r5.A04(fragment3, 07U.A05);
                                C14224Ts4 ts4 = trW.A00;
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = ts4.A00.iterator();
                                if (it.hasNext()) {
                                    it.next();
                                    throw new NullPointerException("onFragmentMaxLifecyclePreUpdated");
                                }
                                arrayList.add(arrayList2);
                            } else {
                                fragment2 = fragment3;
                            }
                            boolean z2 = false;
                            if (A022 == this.A04) {
                                z2 = true;
                            }
                            fragment3.setMenuVisibility(z2);
                        }
                    }
                    if (fragment2 != null) {
                        r5.A04(fragment2, 07U.A04);
                        C14224Ts4 ts42 = trW.A00;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = ts42.A00.iterator();
                        if (it2.hasNext()) {
                            it2.next();
                            throw new NullPointerException("onFragmentMaxLifecyclePreUpdated");
                        }
                        arrayList.add(arrayList3);
                    }
                    if (!r5.A0B.isEmpty()) {
                        r5.A0K();
                        Collections.reverse(arrayList);
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            C14224Ts4.A00((List) it3.next());
                        }
                    }
                }
            }
        }
    }
}
