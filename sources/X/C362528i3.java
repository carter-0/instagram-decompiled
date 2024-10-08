package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;

/* renamed from: X.8i3  reason: invalid class name and case insensitive filesystem */
public final class C362528i3 extends C232222tE {
    public final C376529Ii A00;

    public C362528i3(C376529Ii r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.gallery_grid_empty_cell, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        return new C339897kL((ConstraintLayout) inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C339897kL r62 = (C339897kL) r6;
        0qQ.A0B(r62, 1);
        C376529Ii r0 = this.A00;
        0qQ.A0B(r0, 1);
        C270354gb r3 = new C270354gb();
        ConstraintLayout constraintLayout = r62.A00;
        r3.A0I(constraintLayout);
        r3.A0F(R.id.gallery_grid_empty_item_spacer, AnonymousClass8XE.A04((Integer) r0.A05));
        r3.A0G(constraintLayout);
    }

    public final Class modelClass() {
        return C362578i8.class;
    }
}
