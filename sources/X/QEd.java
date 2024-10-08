package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;

public final class QEd extends 2Rw {
    public View.OnAttachStateChangeListener A00;
    public ImmutableList A01;
    public final SparseArray A02;

    public QEd(SparseArray sparseArray) {
        0qQ.A0B(sparseArray, 1);
        this.A02 = sparseArray;
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        this.A01 = of;
    }

    public final void A00(ImmutableList immutableList) {
        0qQ.A0B(immutableList, 0);
        C232362ta A002 = C232332tX.A00(new QET(this, this.A01, immutableList));
        this.A01 = immutableList;
        A002.A03(this);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        GW4 gw4 = new GW4(2, recyclerView, this);
        this.A00 = gw4;
        recyclerView.addOnAttachStateChangeListener(gw4);
    }

    public final void onBindViewHolder(C249703kE r2, int i) {
        0qQ.A0B(r2, 0);
        ((C11345SOd) this.A01.get(i)).A03(r2);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        return ((C13606TdY) this.A02.get(i)).D75(viewGroup);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        recyclerView.removeOnAttachStateChangeListener(this.A00);
    }

    public final void onViewRecycled(C249703kE r2) {
        C7465QEu qEu;
        0qQ.A0B(r2, 0);
        if ((r2 instanceof C7465QEu) && (qEu = (C7465QEu) r2) != null) {
            qEu.A00();
        }
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1243391509);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(266034162, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int A03 = AnonymousClass0fD.A03(1252620778);
        int i2 = ((C11345SOd) this.A01.get(i)).A00.A05;
        AnonymousClass0fD.A0A(-130196553, A03);
        return i2;
    }
}
