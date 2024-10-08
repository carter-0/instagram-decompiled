package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class NO8 extends C232222tE {
    public final C70482O8h A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67915Mwx(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_timeline_camera_entrypoint_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        NPI npi = (NPI) r3;
        C67915Mwx mwx = (C67915Mwx) r4;
        AnonymousClass7TG.A1N(npi, mwx);
        C71402Ok1.A00(mwx.itemView, 13, this);
        mwx.A00.setAlpha(npi.A00);
    }

    public final Class modelClass() {
        return NPI.class;
    }

    public NO8(C70482O8h o8h) {
        this.A00 = o8h;
    }
}
