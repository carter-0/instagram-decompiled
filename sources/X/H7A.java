package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class H7A extends C232222tE {
    public final GTP A00;

    public final C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        Object tag = this.A00.createView(C231592rv.MEDIA_COMMENT.ordinal(), viewGroup).getTag();
        0qQ.A0C(tag, AnonymousClass000.A00(1625));
        return (C249703kE) tag;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        IOW iow = (IOW) r6;
        AnonymousClass7TG.A1N(iow, r7);
        GTP gtp = this.A00;
        int ordinal = C231592rv.MEDIA_COMMENT.ordinal();
        View view = r7.itemView;
        0qQ.A06(view);
        gtp.bindView(ordinal, view, iow.A00, iow.A01);
    }

    public final Class modelClass() {
        return IOW.class;
    }

    public H7A(GTP gtp) {
        this.A00 = gtp;
    }
}
