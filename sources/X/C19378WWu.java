package X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.WWu  reason: case insensitive filesystem */
public final class C19378WWu implements C231332rR, C231322rQ {
    public final C231382ra A00 = new DataSetObservable();
    public final UAY A01 = new UAY(this, 7);
    public final HashMap A02 = new HashMap();
    public final /* synthetic */ AnonymousClass2t9 A03;
    public final /* synthetic */ GTP A04;

    public final /* synthetic */ void A8l(Object obj, int i) {
    }

    public final void AV9() {
    }

    public final AnonymousClass3W1 BQr(1Xj r4) {
        0qQ.A0B(r4, 0);
        HashMap hashMap = this.A02;
        String id = r4.getId();
        if (id != null) {
            Object obj = hashMap.get(id);
            if (obj == null) {
                obj = G9t.A18(r4);
                hashMap.put(id, obj);
            }
            return (AnonymousClass3W1) obj;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean CRD() {
        return false;
    }

    public final void Crn() {
    }

    public final void EU8(AnonymousClass310 r2) {
        0qQ.A0B(r2, 0);
        this.A04.A03(r2);
    }

    public final void EWg(AnonymousClass2xS r2) {
        0qQ.A0B(r2, 0);
        this.A04.A03 = r2;
    }

    public final int[] getModelIndex(Object obj) {
        return null;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        0qQ.A0B(dataSetObserver, 0);
        C231382ra r2 = this.A00;
        if (r2.A00() == 0) {
            this.A03.registerAdapterDataObserver(this.A01);
        }
        r2.registerObserver(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        0qQ.A0B(dataSetObserver, 0);
        C231382ra r0 = this.A00;
        r0.unregisterObserver(dataSetObserver);
        if (r0.A00() == 0) {
            this.A03.unregisterAdapterDataObserver(this.A01);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2ra, android.database.DataSetObservable] */
    public C19378WWu(AnonymousClass2t9 r3, GTP gtp) {
        this.A03 = r3;
        this.A04 = gtp;
    }

    public final /* synthetic */ int BJU(String str) {
        return -1;
    }

    public final /* synthetic */ List CBH() {
        return new ArrayList();
    }

    public final void Cs9(1Xj r2) {
        this.A03.notifyDataSetChanged();
    }

    public final /* synthetic */ Object EDl(int i) {
        return null;
    }

    public final String getBinderGroupName(int i) {
        String binderGroupName = this.A04.getBinderGroupName();
        0qQ.A07(binderGroupName);
        return binderGroupName;
    }

    public final int getCount() {
        return this.A03.getItemCount();
    }

    public final Object getItem(int i) {
        Object A042 = this.A03.A04(i);
        0qQ.A07(A042);
        return A042;
    }

    public final long getItemId(int i) {
        return this.A03.getItemId(i);
    }

    public final int getItemViewType(int i) {
        return this.A03.getItemViewType(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        throw new UnsupportedOperationException();
    }

    public final int getViewTypeCount() {
        throw new UnsupportedOperationException();
    }

    public final boolean hasStableIds() {
        return this.A03.hasStableIds();
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1Q(this.A03.getItemCount());
    }
}
