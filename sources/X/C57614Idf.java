package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.Idf  reason: case insensitive filesystem */
public final class C57614Idf implements C59615JQj {
    public final /* synthetic */ C55883Hp4 A00;
    public final /* synthetic */ String A01;

    public final void D3l(1Xj r6, C55673HlW hlW, List list, int i) {
        0qQ.A0B(r6, 0);
        C55883Hp4 hp4 = this.A00;
        UserSession userSession = hp4.A04;
        C270634h3 A0V = C51975G9x.A0V(ClipsViewerSource.CREATOR_INSPIRATION_SIGNALS_PLAYGROUND, userSession, r6);
        A0V.A0n = this.A01;
        A0V.A1c = false;
        A0V.A1g = true;
        A0V.A1Q = true;
        DbU.A1M(hp4.A01, A0V, userSession);
    }

    public final void D3m(C267324bN r1, IgSimpleImageView igSimpleImageView, IgImageView igImageView, 1Xj r4) {
    }

    public C57614Idf(C55883Hp4 hp4, String str) {
        this.A00 = hp4;
        this.A01 = str;
    }

    public final void D3k(C53152GjO gjO, String str) {
        this.A00.A07.A0G(gjO);
    }

    public final void D3n(C53152GjO gjO) {
        C57462Ib6 ib6 = gjO.A01;
        if (ib6 != null) {
            ib6.A00();
        }
        gjO.A01 = null;
    }
}
