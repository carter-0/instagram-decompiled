package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6Lf  reason: invalid class name and case insensitive filesystem */
public final class C306196Lf implements C229222n2 {
    public final /* synthetic */ UserSession A00;

    public C306196Lf(UserSession userSession) {
        this.A00 = userSession;
    }

    public final String BK2(AnonymousClass30Y r4) {
        0qQ.A0B(r4, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("carousel_transformation_reel_");
        Reel reel = ((C250973mM) r4.A03).A0H;
        String id = reel.getId();
        0qQ.A07(id);
        sb.append(id);
        sb.append("_segment_");
        sb.append(((C306176Ld) r4.A04).A00);
        sb.append("_token_");
        sb.append(reel.ByO(this.A00));
        return sb.toString();
    }
}
