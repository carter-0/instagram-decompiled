package X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.systrace.Systrace;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.6bI  reason: invalid class name and case insensitive filesystem */
public abstract class C310586bI extends BaseAdapter implements C255993v3 {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public final void EC1(AnonymousClass3TD r2) {
        0qQ.A0B(r2, 0);
        this.A00.addIfAbsent(r2);
    }

    public final void FJ4(AnonymousClass3TD r2) {
        0qQ.A0B(r2, 0);
        this.A00.remove(r2);
    }

    public abstract View getView(int i, View view, ViewGroup viewGroup);

    public void Cs4() {
        super.notifyDataSetChanged();
        Iterator it = this.A00.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            ReboundViewPager reboundViewPager = ((AnonymousClass3TD) it.next()).A00;
            if (Systrace.A0E(1)) {
                0fS.A01("ReboundViewPagerDataSetObserver.onItemsAddedOrRemoved", 1082415095);
            }
            try {
                ReboundViewPager.A06(reboundViewPager, false, false);
                int i = reboundViewPager.A08;
                if (i < reboundViewPager.A0D) {
                    reboundViewPager.A0D = i;
                }
            } finally {
                if (Systrace.A0E(1)) {
                    0fS.A00(1514651785);
                }
            }
        }
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Iterator it = this.A00.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            ((DataSetObserver) it.next()).onChanged();
        }
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Iterator it = this.A00.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            ((DataSetObserver) it.next()).onInvalidated();
        }
    }
}
