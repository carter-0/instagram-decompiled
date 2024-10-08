package X;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import java.util.Arrays;

/* renamed from: X.3D5  reason: invalid class name */
public final class AnonymousClass3D5 extends DataSetObserver {
    public float A00 = 0.0f;
    public int A01 = -1;
    public View A02;
    public int[] A03;
    public final Handler A04;
    public final SparseArray A05;
    public final ViewGroup A06;
    public final ListAdapter A07;
    public final AnonymousClass3D6 A08 = new AnonymousClass3D6(this);
    public final C238133Ar A09;

    public static void A00(C238133Ar r8, AnonymousClass3D5 r9, int i) {
        int[] iArr = r9.A03;
        if (!(iArr == null || iArr.length == 0)) {
            int i2 = 0;
            while (true) {
                if (i2 >= r8.AnH()) {
                    break;
                } else if (((float) r8.AnC(i2).getBottom()) > r9.A00) {
                    i += i2;
                    break;
                } else {
                    i2++;
                }
            }
            int binarySearch = Arrays.binarySearch(r9.A03, i);
            if (binarySearch != -1) {
                if (binarySearch < 0) {
                    binarySearch = Math.abs(binarySearch + 2);
                }
                int[] iArr2 = r9.A03;
                int i3 = iArr2[binarySearch];
                int i4 = Integer.MAX_VALUE;
                if (binarySearch < iArr2.length - 1) {
                    i4 = iArr2[binarySearch + 1];
                }
                ListAdapter listAdapter = r9.A07;
                C231272rL r6 = (C231272rL) listAdapter;
                if (i3 >= r6.getCount()) {
                    0wb.A03("STICKY_ITEM_POSITION", 002.A02(i3, r6.getCount(), "The sticky item position ", " is larger than than the adapter count "));
                    return;
                }
                int itemViewType = listAdapter.getItemViewType(i3);
                SparseArray sparseArray = r9.A05;
                View view = listAdapter.getView(i3, (View) sparseArray.get(itemViewType), r9.A06);
                sparseArray.put(itemViewType, view);
                View view2 = r9.A02;
                if (view2 != view) {
                    if (view2 != null) {
                        r9.A04.post(new C20088Wkm(r9));
                    }
                    r9.A04.post(new C20255Wnu(view, r9));
                }
                View AnC = r9.A09.AnC(1);
                int i5 = i + 1;
                float f = r9.A00;
                if (view != null) {
                    if (i5 < r6.getCount() && AnC != null && i5 == i4) {
                        f = (float) Math.min(AnC.getTop() - view.getMeasuredHeight(), 0);
                    }
                    view.setTranslationY(f);
                    return;
                }
                return;
            }
        }
        if (r9.A02 != null) {
            r9.A04.post(new C20088Wkm(r9));
        }
    }

    public final void onChanged() {
        int[] iArr;
        Boolean bool;
        int[] modelIndex;
        AnonymousClass2rI r3 = (AnonymousClass2rI) this.A07;
        AnonymousClass4ZI r2 = r3.A04;
        if (r2 == null || (((bool = ((C272714lF) r2.A00).A01) != null && !bool.booleanValue()) || (modelIndex = r3.getModelIndex(r2)) == null)) {
            iArr = new int[0];
        } else {
            iArr = new int[]{modelIndex[0]};
        }
        this.A03 = iArr;
        int i = this.A01;
        if (i != -1) {
            A00(this.A09, this, i);
        }
    }

    public AnonymousClass3D5(Context context, ViewGroup viewGroup, ListAdapter listAdapter, C238133Ar r6, float f) {
        this.A04 = new Handler(context.getMainLooper());
        this.A07 = listAdapter;
        listAdapter.registerDataSetObserver(this);
        this.A09 = r6;
        this.A06 = viewGroup;
        this.A05 = new SparseArray();
        this.A00 = f;
    }
}
