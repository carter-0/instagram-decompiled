package X;

import android.view.ViewGroup;
import java.util.List;
import java.util.Map;

/* renamed from: X.MvJ  reason: case insensitive filesystem */
public final class C67815MvJ extends 2Rw {
    public final List A00 = AnonymousClass7TE.A1C();
    public final Map A01;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        0fh.A01("GridAdapter.onCreateViewHolder", -1509047153);
        try {
            return A00(i).A00(viewGroup);
        } finally {
            0fh.A00(-716909832);
        }
    }

    private final C69663Npl A00(int i) {
        C69663Npl npl = (C69663Npl) C51968G9o.A10(this.A01, i);
        if (npl != null) {
            return npl;
        }
        throw AnonymousClass7TE.A0z("No item definition found for given viewHolder");
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r3, int i) {
        C68056MzN mzN = (C68056MzN) r3;
        0qQ.A0B(mzN, 0);
        0fh.A01("GridAdapter.onBindViewHolder", 139602435);
        try {
            if (!(A00(mzN.mItemViewType) instanceof NE9)) {
                C68166N3g n3g = (C68166N3g) this.A00.get(i);
                NE7 ne7 = (NE7) mzN;
                AnonymousClass7TF.A1H(n3g, ne7);
                ne7.A03(n3g);
            }
        } finally {
            0fh.A00(-783744089);
        }
    }

    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(C249703kE r3) {
        C68056MzN mzN = (C68056MzN) r3;
        0qQ.A0B(mzN, 0);
        A00(mzN.mItemViewType);
        NE7 ne7 = (NE7) mzN;
        0qQ.A0B(ne7, 0);
        ne7.A01.A01();
        return false;
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C249703kE r4) {
        C68056MzN mzN = (C68056MzN) r4;
        0qQ.A0B(mzN, 0);
        0fh.A01("GridAdapter.onViewRecycled", -930240099);
        try {
            if (!(A00(mzN.mItemViewType) instanceof NE9)) {
                NE7 ne7 = (NE7) mzN;
                0qQ.A0B(ne7, 0);
                ne7.A01.A01();
            }
        } finally {
            0fh.A00(321194642);
        }
    }

    public C67815MvJ(Map map) {
        this.A01 = map;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(39646548);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-837696817, A03);
        return size;
    }

    public final long getItemId(int i) {
        int A03 = AnonymousClass0fD.A03(355873893);
        long j = ((C68166N3g) this.A00.get(i)).A02;
        AnonymousClass0fD.A0A(-618686184, A03);
        return j;
    }

    public final int getItemViewType(int i) {
        int A03 = AnonymousClass0fD.A03(-1596196342);
        int i2 = ((C68166N3g) this.A00.get(i)).A01;
        AnonymousClass0fD.A0A(1156454795, A03);
        return i2;
    }
}
