package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6sj  reason: invalid class name and case insensitive filesystem */
public final class C320656sj extends C232222tE {
    public final int A00;
    public final int A01;
    public final C320336sD A02;
    public final AnonymousClass0iw A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.layout_clips_grid_drafts_item, viewGroup, false);
        0qQ.A07(inflate);
        C46389DeB deB = new C46389DeB(inflate);
        View view = deB.itemView;
        0qQ.A06(view);
        0nA.A0f(view, this.A01);
        View view2 = deB.itemView;
        0qQ.A06(view2);
        0nA.A0V(view2, this.A00);
        return deB;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C320706so r42 = (C320706so) r4;
        C46389DeB deB = (C46389DeB) r5;
        0qQ.A0B(r42, 0);
        0qQ.A0B(deB, 1);
        ImageUrl imageUrl = r42.A00.A00;
        if (imageUrl != null) {
            deB.A00.setUrl(imageUrl, this.A03);
        } else {
            deB.A00.A0B();
        }
        AnonymousClass0fU.A00(new FNF(deB, this), deB.itemView);
    }

    public final Class modelClass() {
        return C320706so.class;
    }

    public C320656sj(C320336sD r1, AnonymousClass0iw r2, int i, int i2) {
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = i;
        this.A00 = i2;
    }
}
