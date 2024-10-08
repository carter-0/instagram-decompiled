package X;

import android.content.Context;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.interactor.areffects.RtcArEffectsManager$getCollectionsFlow$2;
import java.util.List;
import java.util.Map;

public final class LEN {
    public OK0 A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public List A05;
    public List A06;
    public List A07;
    public C262224Cq A08;
    public final EffectCollectionService A09;
    public final ONT A0A;
    public final UserSession A0B;
    public final C70753OJz A0C;
    public final L54 A0D;
    public final Map A0E = AnonymousClass7TE.A1E();

    public final C62090rM A00(C359218cI r12, long j, boolean z, boolean z2) {
        C359218cI r4 = r12;
        boolean equals = r12.equals(C359218cI.A0B);
        AnonymousClass05E r2 = new AnonymousClass05E(new C59674JTf((Object) r4, (Object) this, (AnonymousClass4D7) null, 15, z2));
        RtcArEffectsManager$getCollectionsFlow$2 rtcArEffectsManager$getCollectionsFlow$2 = new RtcArEffectsManager$getCollectionsFlow$2(r4, this, (AnonymousClass4D7) null, j, z, equals);
        int i = 10q.A00;
        return new C62090rM(new AnonymousClass0fv(rtcArEffectsManager$getCollectionsFlow$2, r2, 2));
    }

    public /* synthetic */ LEN(Context context, UserSession userSession) {
        EffectCollectionService A002 = C311766dD.A00(context, userSession);
        ONT ont = new ONT(userSession);
        C70753OJz oJz = new C70753OJz(userSession);
        L54 l54 = new L54(userSession, context);
        0qQ.A0B(A002, 3);
        this.A0B = userSession;
        this.A09 = A002;
        this.A0A = ont;
        this.A0C = oJz;
        this.A0D = l54;
        0sn r0 = 0sn.A00;
        this.A02 = r0;
        this.A01 = r0;
        this.A03 = r0;
        this.A05 = r0;
        this.A04 = r0;
        this.A07 = r0;
        this.A06 = r0;
    }
}
