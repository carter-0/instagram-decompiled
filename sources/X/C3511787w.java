package X;

import android.app.Application;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.87w  reason: invalid class name and case insensitive filesystem */
public final class C3511787w extends C361478gI {
    public AtomicBoolean A00 = new AtomicBoolean(false);
    public boolean A01;
    public final 2Fk A02;
    public final EffectCollectionService A03;
    public final AnonymousClass861 A04;
    public final C249513ju A05;
    public final 05G A06 = 106.A01((Object) null);
    public final 05G A07;
    public final UserSession A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3511787w(Application application, EffectCollectionService effectCollectionService, UserSession userSession, AnonymousClass861 r8) {
        super(application);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(effectCollectionService, 3);
        0qQ.A0B(r8, 4);
        this.A08 = userSession;
        this.A03 = effectCollectionService;
        this.A04 = r8;
        02z r3 = new 02z(C3511887x.LOADING);
        this.A07 = r3;
        1HR r0 = new 1HR(0);
        this.A05 = r0;
        this.A02 = C226292g8.A00(19B.A00, 0u9.A04(r0));
        AnonymousClass11O.A03(C318116oQ.A00(this), new C61860pz(new AnonymousClass9K3(this, (AnonymousClass4D7) null, 25), r3));
    }
}
