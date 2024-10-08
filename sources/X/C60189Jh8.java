package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.channels.xposting.ChannelXpostingRepository;
import com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo;
import java.util.List;

/* renamed from: X.Jh8  reason: case insensitive filesystem */
public final class C60189Jh8 extends 2YL {
    public List A00;
    public C262204Co A01;
    public final 2Fk A02;
    public final ChannelXpostingRepository A03;
    public final 05G A04;
    public final 05G A05;
    public final UserSession A06;

    public C60189Jh8(UserSession userSession, ChannelXpostingRepository channelXpostingRepository) {
        0qQ.A0B(channelXpostingRepository, 2);
        this.A06 = userSession;
        this.A03 = channelXpostingRepository;
        C62486Kgb kgb = C62486Kgb.INITIAL_LOAD;
        02z A10 = DbS.A10(kgb);
        this.A05 = A10;
        0sn r5 = 0sn.A00;
        this.A00 = r5;
        02z A012 = 106.A01((Object) null);
        this.A04 = A012;
        C61820pm A032 = AnonymousClass10H.A03(new C66192MHi((Object) this, (AnonymousClass4D7) null, 8), A10, A012);
        this.A02 = DbT.A0G(10b.A02(new ODZ(kgb, (BroadcastChannelXpostingChannelInfo) null, r5), C318116oQ.A00(this), A032, AnonymousClass10A.A01));
    }
}
