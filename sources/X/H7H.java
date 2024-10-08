package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class H7H extends C232222tE {
    public final C231592rv A00;
    public final GTP A01;
    public final Class A02;

    public final C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        View createView = this.A01.createView(this.A00.ordinal(), viewGroup);
        if (createView.getTag() == null) {
            createView.setTag(new C53111Gij(createView, 1));
        }
        Object tag = createView.getTag();
        0qQ.A0C(tag, AnonymousClass000.A00(1625));
        return (C249703kE) tag;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        ITE ite = (ITE) r6;
        AnonymousClass7TG.A1N(ite, r7);
        GTP gtp = this.A01;
        int ordinal = this.A00.ordinal();
        View view = r7.itemView;
        0qQ.A06(view);
        gtp.bindView(ordinal, view, ite.A01, ite.A02);
    }

    public final Class modelClass() {
        return this.A02;
    }

    public H7H(C231592rv r1, GTP gtp, Class cls) {
        this.A00 = r1;
        this.A02 = cls;
        this.A01 = gtp;
    }
}
