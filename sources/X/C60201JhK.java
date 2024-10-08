package X;

import com.instagram.common.session.UserSession;
import com.instagram.igtv.live.model.IGTVLiveChannelRepository;
import java.util.List;

/* renamed from: X.JhK  reason: case insensitive filesystem */
public final class C60201JhK extends 2YL {
    public String A00;
    public List A01 = AnonymousClass7TE.A1C();
    public boolean A02 = true;
    public final AnonymousClass2Fj A03 = new 2Fk(C61936KSl.A00);
    public final UserSession A04;
    public final C63640L1c A05;
    public final IGTVLiveChannelRepository A06;
    public final C61292K1d A07;

    public /* synthetic */ C60201JhK(UserSession userSession, C63640L1c l1c, String str, String str2) {
        0qQ.A0B(userSession, 0);
        IGTVLiveChannelRepository iGTVLiveChannelRepository = (IGTVLiveChannelRepository) userSession.A01(IGTVLiveChannelRepository.class, C66306MMp.A02(userSession, 0));
        C51974G9v.A1M(str, str2, l1c);
        0qQ.A0B(iGTVLiveChannelRepository, 5);
        this.A04 = userSession;
        this.A05 = l1c;
        this.A06 = iGTVLiveChannelRepository;
        this.A07 = new C61292K1d(C62573Ki6.LIVE, str, str2);
    }
}
