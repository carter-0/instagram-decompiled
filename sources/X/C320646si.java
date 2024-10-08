package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.6si  reason: invalid class name and case insensitive filesystem */
public final class C320646si extends C232222tE {
    public final C320346sE A00;
    public final int A01;
    public final int A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r1, C249703kE r2) {
    }

    public final C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        C46897DnD dnD = new C46897DnD(layoutInflater.inflate(R.layout.layout_clips_grid_creation_entrypoint_item, viewGroup, false));
        View view = dnD.itemView;
        0qQ.A06(view);
        0nA.A0f(view, this.A02);
        View view2 = dnD.itemView;
        0qQ.A06(view2);
        0nA.A0V(view2, this.A01);
        AnonymousClass0fU.A00(new ANC(this), dnD.itemView);
        return dnD;
    }

    public final Class modelClass() {
        return C320696sn.class;
    }

    public C320646si(C320346sE r1, int i, int i2) {
        this.A00 = r1;
        this.A02 = i;
        this.A01 = i2;
    }
}
