package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl;

/* renamed from: X.Jfg  reason: case insensitive filesystem */
public final class C60100Jfg extends C361478gI {
    public final AnonymousClass57N A00;
    public final AnonymousClass0r6 A01;
    public final 1Ng A02;
    public final UserSession A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60100Jfg(Application application, 1Ng r9, UserSession userSession, AnonymousClass57N r11) {
        super(application);
        0qQ.A0B(application, 1);
        C51974G9v.A1M(userSession, r9, r11);
        this.A03 = userSession;
        this.A02 = r9;
        this.A00 = r11;
        FanClubContentPreviewInteractorImpl fanClubContentPreviewInteractorImpl = (FanClubContentPreviewInteractorImpl) r11;
        C61770pa r6 = fanClubContentPreviewInteractorImpl.A08;
        C61770pa r1 = fanClubContentPreviewInteractorImpl.A07;
        C61770pa r5 = fanClubContentPreviewInteractorImpl.A06;
        this.A01 = AnonymousClass10H.A00(new MHs(this, (AnonymousClass4D7) null, 0), r6, r1, r5);
        DbY.A19(this, new C73567Pfo(this, (AnonymousClass4D7) null, 0), MC9.A00(r1, 48));
        DbY.A19(this, new C73567Pfo(this, (AnonymousClass4D7) null, 1), new C51623FxC((AnonymousClass0r6) new AnonymousClass0qC(r5), 7));
    }

    public static final void A00(C60100Jfg jfg, 1Xj r5) {
        1Ng r3 = jfg.A02;
        r3.A00(new C321786uk(C294255m9.A08, jfg.A03.A06));
        r3.A00(new 1qJ(r5, true));
    }
}
