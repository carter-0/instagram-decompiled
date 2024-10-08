package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.6sg  reason: invalid class name and case insensitive filesystem */
public final class C320626sg extends C232222tE {
    public final int A00;
    public final int A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r1, C249703kE r2) {
    }

    public final C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        C46393DeG deG = new C46393DeG(layoutInflater.inflate(R.layout.layout_clips_grid_ghost_item, viewGroup, false));
        View view = deG.itemView;
        0qQ.A06(view);
        0nA.A0f(view, this.A01);
        View view2 = deG.itemView;
        0qQ.A06(view2);
        0nA.A0V(view2, this.A00);
        return deG;
    }

    public final Class modelClass() {
        return C320676sl.class;
    }

    public C320626sg(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
