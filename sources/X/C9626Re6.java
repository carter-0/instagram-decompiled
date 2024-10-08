package X;

import android.view.View;
import android.widget.TableLayout;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.apm.APMLinkCellParams;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.Re6  reason: case insensitive filesystem */
public abstract class C9626Re6 {
    public static final void A00(TableLayout tableLayout, ImmutableList immutableList) {
        APMLinkCellParams aPMLinkCellParams;
        0qQ.A0B(immutableList, 1);
        tableLayout.removeAllViews();
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            CellParams cellParams = (CellParams) it.next();
            C13601TdT A00 = cellParams.A00(tableLayout.getContext());
            if (!(A00 instanceof View)) {
                throw DbT.A0m();
            } else if (tableLayout instanceof C13602TdU) {
                C13602TdU tdU = (C13602TdU) tableLayout;
                View view = (View) A00;
                if (cellParams instanceof APMLinkCellParams) {
                    aPMLinkCellParams = (APMLinkCellParams) cellParams;
                } else {
                    aPMLinkCellParams = null;
                }
                tdU.AAg(view, aPMLinkCellParams);
            } else {
                tableLayout.addView((View) A00);
            }
        }
    }
}
