package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;
import java.lang.ref.WeakReference;

/* renamed from: X.6ZO  reason: invalid class name */
public final class AnonymousClass6ZO extends C252233om {
    public UserSession A00;
    public ReelViewerConfig A01;
    public AnonymousClass3BQ A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass0iw A05;
    public final C273384mU A06;
    public final C317116mk A07;
    public final WeakReference A08;
    public final 1wn A09 = new AnonymousClass6ZP(this);
    public final 1wn A0A = new AnonymousClass6ZU(this);
    public final 1wn A0B = new AnonymousClass6ZT(this);
    public final 1wn A0C = new AnonymousClass6ZX(this);
    public final 1wn A0D = new AnonymousClass6ZR(this);
    public final 1wn A0E = new AnonymousClass6ZQ(this);
    public final 1wn A0F = new AnonymousClass6ZV(this);
    public final AnonymousClass6ZS A0G = new AnonymousClass6ZS(this);
    public final AnonymousClass6ZW A0H = new AnonymousClass6ZW(this);

    public final void D6z(View view) {
        UserSession userSession = this.A00;
        if (userSession == null) {
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass1Nd.A00(userSession).A01(this.A0B, C313176g0.class);
    }

    public final void onCreate() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        A002.A01(this.A09, C312456eS.class);
        A002.A03(this.A0E, C312466eT.class, "support_personalized_ads_sticker_shared_event");
        A002.A01(this.A0D, C317326n5.class);
        A002.A01(this.A0G, C312476eU.class);
        A002.A01(this.A0A, C2371136j.class);
        A002.A01(this.A0F, C312486eV.class);
        A002.A01(this.A0H, AnonymousClass376.class);
        A002.A01(this.A0C, AnonymousClass3PD.class);
    }

    public final void onDestroy() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        A002.A02(this.A09, C312456eS.class);
        A002.A02(this.A0E, C312466eT.class);
        A002.A02(this.A0D, C317326n5.class);
        A002.A02(this.A0G, C312476eU.class);
        A002.A02(this.A0A, C2371136j.class);
        A002.A02(this.A0F, C312486eV.class);
        A002.A02(this.A0H, AnonymousClass376.class);
        A002.A02(this.A0C, AnonymousClass3PD.class);
    }

    public final void onDestroyView() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass1Nd.A00(userSession).A02(this.A0B, C313176g0.class);
    }

    public AnonymousClass6ZO(AnonymousClass0iw r2, C273384mU r3, C317116mk r4, WeakReference weakReference) {
        this.A06 = r3;
        this.A07 = r4;
        this.A05 = r2;
        this.A08 = weakReference;
    }
}
