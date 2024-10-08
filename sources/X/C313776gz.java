package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.6gz  reason: invalid class name and case insensitive filesystem */
public abstract class C313776gz {
    public static final C313786h0 A0K = new Object();
    public IgLiveCobroadcastRepository A00;
    public final UserSession A01;
    public final C313666go A02;
    public final C313816h4 A03;
    public final IgLiveHeartbeatManager A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C377169Ku(this, 25));
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H = AnonymousClass0eN.A01(new C377169Ku(this, 26));
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;

    public final IgLiveCobroadcastRepository A00(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, 1);
        IgLiveCobroadcastRepository igLiveCobroadcastRepository = this.A00;
        if (igLiveCobroadcastRepository != null) {
            return igLiveCobroadcastRepository;
        }
        IgLiveCobroadcastRepository igLiveCobroadcastRepository2 = new IgLiveCobroadcastRepository(userSession, new L5I(userSession), new L7D(userSession, context));
        this.A00 = igLiveCobroadcastRepository2;
        return igLiveCobroadcastRepository2;
    }

    public final IgLiveBroadcastInfoManager A01() {
        return (IgLiveBroadcastInfoManager) this.A0H.getValue();
    }

    public final LES A02() {
        return (LES) this.A0I.getValue();
    }

    public final C59720JVe A03() {
        return (C59720JVe) this.A0J.getValue();
    }

    public C313776gz(UserSession userSession, C313666go r4) {
        this.A01 = userSession;
        this.A02 = r4;
        this.A03 = new C313816h4(r4);
        0t0 A012 = AnonymousClass0eN.A01(new C377169Ku(this, 28));
        this.A08 = A012;
        this.A04 = (IgLiveHeartbeatManager) A012.getValue();
        this.A0I = AnonymousClass0eN.A01(new C377169Ku(this, 30));
        this.A07 = AnonymousClass0eN.A01(C313826hA.A00);
        this.A0J = AnonymousClass0eN.A01(C313836hB.A00);
        this.A06 = AnonymousClass0eN.A01(new C377169Ku(this, 27));
        this.A09 = AnonymousClass0eN.A01(new C377169Ku(this, 29));
        this.A0E = AnonymousClass0eN.A01(new C377169Ku(this, 35));
        this.A0G = AnonymousClass0eN.A01(new C377169Ku(this, 37));
        this.A0A = AnonymousClass0eN.A01(new C377169Ku(this, 31));
        this.A0D = AnonymousClass0eN.A01(new C377169Ku(this, 34));
        this.A0C = AnonymousClass0eN.A01(new C377169Ku(this, 33));
        this.A0B = AnonymousClass0eN.A01(new C377169Ku(this, 32));
        this.A0F = AnonymousClass0eN.A01(new C377169Ku(this, 36));
    }
}
