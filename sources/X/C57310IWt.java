package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.IWt  reason: case insensitive filesystem */
public final class C57310IWt implements C317186mr {
    public final C317186mr A00;
    public final IgBouncyUfiButtonImageView A01;

    public C57310IWt(AnonymousClass0iw r8, UserSession userSession, IgBouncyUfiButtonImageView igBouncyUfiButtonImageView) {
        0qQ.A0B(r8, 3);
        C311636d0 r0 = new C311636d0(r8, userSession, (C310016aI) null, (SearchContext) null, (String) null, (String) null);
        this.A01 = igBouncyUfiButtonImageView;
        this.A00 = r0;
    }

    public final void DNS(C243363Yl r3, Reel reel, C255773uh r5) {
        0qQ.A0B(r3, 2);
        this.A01.setSelected(AnonymousClass7TF.A1W(r3, C243363Yl.LIKED));
        this.A00.DNS(r3, reel, r5);
    }
}
