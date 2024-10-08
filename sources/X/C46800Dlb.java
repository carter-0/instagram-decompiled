package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* renamed from: X.Dlb  reason: case insensitive filesystem */
public final class C46800Dlb extends 2Z7 {
    public final Application A00;
    public final UserSession A01;
    public final ChannelCreationFlowExtraArgs A02;
    public final C313756gx A03;
    public final ChannelCreationSource A04;
    public final C50338FYv A05;
    public final EV0 A06;
    public final Integer A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46800Dlb(Application application, UserSession userSession, ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs, C313756gx r5, ChannelCreationSource channelCreationSource, C50338FYv fYv, EV0 ev0, Integer num) {
        super(application);
        AnonymousClass7TG.A0w(2, userSession, r5, fYv);
        AnonymousClass7TG.A1S(ev0, channelCreationSource);
        0qQ.A0B(channelCreationFlowExtraArgs, 7);
        this.A00 = application;
        this.A01 = userSession;
        this.A03 = r5;
        this.A05 = fYv;
        this.A06 = ev0;
        this.A04 = channelCreationSource;
        this.A02 = channelCreationFlowExtraArgs;
        this.A07 = num;
    }

    public final 2YL create(Class cls) {
        EV0 ev0 = this.A06;
        int ordinal = ev0.ordinal();
        if (ordinal == 1) {
            return new C47820EIs(this.A00, this.A01, this.A03, this.A04, ev0, this.A07);
        } else if (ordinal == 0) {
            UserSession userSession = this.A01;
            C313756gx r4 = this.A03;
            C50338FYv fYv = this.A05;
            return new C47821EIt(this.A00, userSession, this.A02, r4, this.A04, fYv, ev0, this.A07);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }
}
