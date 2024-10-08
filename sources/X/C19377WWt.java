package X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WWt  reason: case insensitive filesystem */
public final class C19377WWt implements C231332rR, C231322rQ {
    public final /* synthetic */ GTP A00;
    public final /* synthetic */ C231332rR A01;

    public final /* synthetic */ void A8l(Object obj, int i) {
    }

    public final void AV9() {
        this.A01.AV9();
    }

    public final AnonymousClass3W1 BQr(1Xj r2) {
        0qQ.A0B(r2, 0);
        return this.A01.BQr(r2);
    }

    public final boolean CRD() {
        return this.A01.CRD();
    }

    public final void Crn() {
        this.A01.Crn();
    }

    public final void Cs9(1Xj r2) {
        this.A01.Cs9(r2);
    }

    public final void EU8(AnonymousClass310 r2) {
        0qQ.A0B(r2, 0);
        this.A00.A03(r2);
    }

    public final void EWg(AnonymousClass2xS r2) {
        0qQ.A0B(r2, 0);
        this.A00.A03 = r2;
    }

    public final int getCount() {
        return this.A01.getCount();
    }

    public final Object getItem(int i) {
        return this.A01.getItem(i);
    }

    public final long getItemId(int i) {
        return this.A01.getItemId(i);
    }

    public final int getItemViewType(int i) {
        return this.A01.getItemViewType(i);
    }

    public final int[] getModelIndex(Object obj) {
        return this.A01.getModelIndex(obj);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        this.A01.getView(i, view, viewGroup);
        throw null;
    }

    public final int getViewTypeCount() {
        this.A01.getViewTypeCount();
        throw null;
    }

    public final boolean hasStableIds() {
        return this.A01.hasStableIds();
    }

    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.A01.registerDataSetObserver(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.A01.unregisterDataSetObserver(dataSetObserver);
    }

    public C19377WWt(AnonymousClass2t9 r2, GTP gtp) {
        this.A00 = gtp;
        this.A01 = new C19378WWu(r2, gtp);
    }

    public final /* synthetic */ int BJU(String str) {
        return -1;
    }

    public final /* synthetic */ List CBH() {
        return new ArrayList();
    }

    public final /* synthetic */ Object EDl(int i) {
        return null;
    }

    public final String getBinderGroupName(int i) {
        String binderGroupName = this.A00.getBinderGroupName();
        0qQ.A07(binderGroupName);
        return binderGroupName;
    }
}
