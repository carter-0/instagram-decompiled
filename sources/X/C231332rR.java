package X;

import android.database.DataSetObserver;
import android.widget.Adapter;
import java.util.List;

/* renamed from: X.2rR  reason: invalid class name and case insensitive filesystem */
public interface C231332rR extends Adapter, C231292rN {
    void A8l(Object obj, int i);

    void AV9();

    int BJU(String str);

    List CBH();

    boolean CRD();

    void Crn();

    Object EDl(int i);

    int getCount();

    int[] getModelIndex(Object obj);

    void registerDataSetObserver(DataSetObserver dataSetObserver);

    void unregisterDataSetObserver(DataSetObserver dataSetObserver);
}
