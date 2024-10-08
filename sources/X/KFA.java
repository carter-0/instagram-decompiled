package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.banner.IgdsBanner;

public final class KFA extends C232222tE {
    public final C62320sa A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60522Jmt(DbT.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_gift_feed_fb, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C64754LhW lhW = (C64754LhW) r8;
        C60522Jmt jmt = (C60522Jmt) r9;
        AnonymousClass7TF.A1H(lhW, jmt);
        IgdsBanner igdsBanner = jmt.A00;
        igdsBanner.setBody(DbY.A0d(igdsBanner.getResources(), (int) lhW.A00, R.plurals.appreciation_gift_feed_fb_banner_body_text), false);
        igdsBanner.setIcon(C14091Tpi.A00(igdsBanner.getContext(), XDU.A4G, GOg.SIZE_24, C52337GOf.OUTLINE));
        igdsBanner.setDismissible(false);
        igdsBanner.A00 = new C50468FcG(this, 0);
    }

    public final Class modelClass() {
        return C64754LhW.class;
    }

    public KFA(C62320sa r1) {
        this.A00 = r1;
    }
}
