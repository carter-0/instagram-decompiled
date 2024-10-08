package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Tqw  reason: case insensitive filesystem */
public class C14160Tqw implements C238133Ar {
    public C231272rL A00;
    public C231272rL A01;
    public boolean A02 = false;
    public final AbsListView A03;
    public final List A04 = new ArrayList();
    public final AbsListView.OnScrollListener A05 = new LZD(this, 2);

    public final boolean CWN() {
        return true;
    }

    public final void Eq3(boolean z) {
        this.A03.setVerticalScrollBarEnabled(true);
    }

    public final void AAD(C249383je r4) {
        List list = this.A04;
        if (list.contains(r4)) {
            0wb.A04("AbsListViewProxy", 002.A0R("Cannot add same listener twice: ", C66581MXm.A0y(r4)), 1000000);
        } else {
            list.add(r4);
        }
        if (!this.A02) {
            this.A03.setOnScrollListener(this.A05);
            this.A02 = true;
        }
    }

    public final void AHq() {
        this.A04.clear();
    }

    public final C231272rL AZK() {
        C231272rL r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C231272rL r02 = this.A00;
        if (r02 != null) {
            return r02;
        }
        AbsListView absListView = this.A03;
        Adapter adapter = absListView.getAdapter();
        if (adapter == null) {
            return null;
        }
        if (adapter instanceof C231272rL) {
            C231272rL r03 = (C231272rL) absListView.getAdapter();
            this.A00 = r03;
            return r03;
        }
        WZ8 wz8 = new WZ8(adapter, this);
        this.A01 = wz8;
        return wz8;
    }

    public final View AnC(int i) {
        return this.A03.getChildAt(i);
    }

    public final View AnE(int i) {
        return C13989Tnp.A0O(this.A03, i);
    }

    public final int AnH() {
        return this.A03.getChildCount();
    }

    public final int AyP() {
        return ((ListView) this.A03).getDividerHeight();
    }

    public final int B6L() {
        return this.A03.getFirstVisiblePosition();
    }

    public final void B9Z(Rect rect) {
        this.A03.getGlobalVisibleRect(rect);
    }

    public final int BCl() {
        AbsListView absListView = this.A03;
        if (absListView instanceof ListView) {
            return ((ListView) absListView).getHeaderViewsCount();
        }
        return 0;
    }

    public final int BLQ() {
        return this.A03.getLastVisiblePosition();
    }

    public final /* bridge */ /* synthetic */ ViewGroup CEd() {
        return this.A03;
    }

    public final boolean COv() {
        AbsListView absListView = this.A03;
        Field field = W11.A00;
        0qQ.A0B(absListView, 0);
        if (!(absListView.getChildCount() == 0 || absListView.getAdapter() == null)) {
            int count = absListView.getAdapter().getCount() - 1;
            int childCount = absListView.getChildCount() - 1;
            int A0F = C13989Tnp.A0F(absListView);
            if (absListView.getLastVisiblePosition() != count || absListView.getChildAt(childCount).getBottom() > A0F) {
                return false;
            }
        }
        return true;
    }

    public final boolean COw() {
        AbsListView absListView = this.A03;
        Field field = W11.A00;
        0qQ.A0B(absListView, 0);
        if (absListView.getChildCount() == 0 || (absListView.getFirstVisiblePosition() == 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
            return true;
        }
        return false;
    }

    public final boolean CTr() {
        return this.A03.isFocused();
    }

    public final void EEZ(C249383je r2) {
        this.A04.remove(r2);
    }

    public final void EKm(Fragment fragment) {
        C17118VIo.A00(this.A03, fragment);
    }

    public final void EKn(boolean z) {
        AbsListView absListView = this.A03;
        Field field = W11.A00;
        0qQ.A0B(absListView, 0);
        int count = absListView.getCount();
        if (z) {
            if (count != 0 && absListView.getHeight() != 0) {
                absListView.smoothScrollToPosition(0);
                absListView.postDelayed(new C20095Wkt(absListView), 100);
            }
        } else if (count != 0 && absListView.getHeight() != 0) {
            absListView.smoothScrollToPositionFromTop(0, 0, 0);
        }
    }

    public final void ENw(C231272rL r3) {
        ListAdapter listAdapter;
        this.A00 = r3;
        AbsListView absListView = this.A03;
        if (r3 == null) {
            listAdapter = null;
        } else {
            listAdapter = (ListAdapter) r3.getAdapter();
        }
        absListView.setAdapter(listAdapter);
    }

    public final void Ehv(IE9 ie9) {
        this.A03.setRecyclerListener(ie9);
    }

    public final void Ejl(int i) {
        this.A03.setSelection(i);
    }

    public final void Ejm(int i, int i2) {
        this.A03.setSelectionFromTop(i, i2);
    }

    public final void Evq(int i) {
        this.A03.smoothScrollToPosition(i);
    }

    public final void Evr(int i, int i2) {
        this.A03.smoothScrollToPositionFromTop(i, i2);
    }

    public final void Evs(int i, int i2, int i3) {
        this.A03.smoothScrollToPositionFromTop(i, i2, 150);
    }

    public final void EyK() {
        this.A03.smoothScrollBy(0, 0);
    }

    public final Context getContext() {
        return this.A03.getContext();
    }

    public final int getCount() {
        return this.A03.getCount();
    }

    public final ViewParent getParent() {
        return this.A03.getParent();
    }

    public C14160Tqw(AbsListView absListView) {
        this.A03 = absListView;
    }

    public final int BLx(View view) {
        ViewParent parent;
        while (true) {
            parent = view.getParent();
            if (!(parent instanceof View) || parent == this.A03) {
                AbsListView absListView = this.A03;
            } else {
                view = (View) parent;
            }
        }
        AbsListView absListView2 = this.A03;
        if (parent == absListView2) {
            for (int firstVisiblePosition = absListView2.getFirstVisiblePosition(); firstVisiblePosition <= absListView2.getLastVisiblePosition(); firstVisiblePosition++) {
                if (view == C13989Tnp.A0O(absListView2, firstVisiblePosition)) {
                    return firstVisiblePosition;
                }
            }
        }
        return -1;
    }
}
