package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

public abstract class WDW implements X8C, X9H, AdapterView.OnItemClickListener {
    public Rect A00;

    public static int A01(Context context, ListAdapter listAdapter, int i) {
        FrameLayout frameLayout = null;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public final boolean AIC(C18932WDk wDk, C18934WDm wDm) {
        return false;
    }

    public final boolean ATe(C18932WDk wDk, C18934WDm wDm) {
        return false;
    }

    public final void CMm(Context context, C18932WDk wDk) {
    }

    public final void A02(boolean z) {
        if (this instanceof C14735U5x) {
            ((C14735U5x) this).A0E.A01 = z;
        } else {
            ((C14734U5w) this).A09 = z;
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        ListAdapter listAdapter2 = listAdapter;
        if (listAdapter instanceof HeaderViewListAdapter) {
            listAdapter2 = ((HeaderViewListAdapter) listAdapter2).getWrappedAdapter();
        }
        C18932WDk wDk = ((U4C) listAdapter2).A00;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (this instanceof C14734U5w) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        wDk.A0I(menuItem, this, JTQ.A00(i2));
    }
}
