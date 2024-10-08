package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.WCe  reason: case insensitive filesystem */
public final class C18910WCe implements AdapterView.OnItemClickListener {
    public final int A00;
    public final Object A01;

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        long j2 = j;
        int i2 = i;
        View view2 = view;
        switch (this.A00) {
            case 0:
                ((SearchView) this.A01).A0D(i);
                return;
            case 1:
                AdapterView.OnItemClickListener onItemClickListener = (AdapterView.OnItemClickListener) this.A01;
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(adapterView, view2, i2, j2);
                    return;
                }
                return;
            default:
                U60 u60 = (U60) this.A01;
                if (i < 0) {
                    WDV wdv = u60.A02;
                    if (!wdv.A09.isShowing()) {
                        item = null;
                    } else {
                        item = wdv.A0A.getSelectedItem();
                    }
                } else {
                    item = u60.getAdapter().getItem(i);
                }
                U60.A00(u60, item);
                AdapterView.OnItemClickListener onItemClickListener2 = u60.getOnItemClickListener();
                if (onItemClickListener2 != null) {
                    if (view == null || i < 0) {
                        WDV wdv2 = u60.A02;
                        PopupWindow popupWindow = wdv2.A09;
                        if (!popupWindow.isShowing()) {
                            view2 = null;
                        } else {
                            view2 = wdv2.A0A.getSelectedView();
                        }
                        if (!popupWindow.isShowing()) {
                            i2 = -1;
                        } else {
                            i2 = wdv2.A0A.getSelectedItemPosition();
                        }
                        if (!popupWindow.isShowing()) {
                            j2 = Long.MIN_VALUE;
                        } else {
                            j2 = wdv2.A0A.getSelectedItemId();
                        }
                    }
                    onItemClickListener2.onItemClick(u60.A02.A0A, view2, i2, j2);
                }
                u60.A02.dismiss();
                return;
        }
    }

    public C18910WCe(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
