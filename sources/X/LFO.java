package X;

import android.app.Activity;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.appreciation.graphql.QueryAppreciationPacksResponseImpl;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class LFO {
    public final Activity A00;
    public final LNj A01;
    public final 1a8 A02;
    public final UserSession A03;
    public final 1vn A04;
    public final T7R A05;
    public final String A06;

    public final AnonymousClass0r6 A01(C61071Jw9 jw9) {
        List list;
        0qQ.A0B(jw9, 0);
        C61071Jw9 A002 = this.A01.A00();
        if (A002 == null || (list = (List) jw9.A04) == null || list.isEmpty()) {
            return AnonymousClass0Zq.A00(new MHH((AnonymousClass4D7) null, (Object) this, (Object) jw9, 11));
        }
        boolean z = A002.A02;
        return new 0rr(new C61132Jxi((C61081JwJ) A002.A01, (Integer) A002.A00, (List) A002.A04, z, true));
    }

    public final AnonymousClass0r6 A00() {
        List<C60962JuK> list;
        C61071Jw9 A002 = this.A01.A00();
        if (A002 == null || (list = (List) A002.A04) == null || list.isEmpty()) {
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            return JUM.A00(new C59677JTi(this, (AnonymousClass4D7) null, 43), AnonymousClass0Zq.A00(new MHH((Object) this.A04, (Object) new PandoGraphQLRequest(DbU.A0J(A042, Dbg.A00(), this.A06), "QueryAppreciationPacks", A042.getParamsCopy(), A043.getParamsCopy(), QueryAppreciationPacksResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "viewer", AnonymousClass7TE.A1C()), (AnonymousClass4D7) null, 3)));
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C60962JuK juK : list) {
            A0r.add(new C60944Ju2(juK.A07, juK.A06, juK.A08, juK.A01, juK.A02, juK.A03));
        }
        return new 0rr(new C59678JTj(new C61071Jw9((C61081JwJ) A002.A01, (Integer) A002.A00, (List) A0r, A002.A02), 1));
    }

    public /* synthetic */ LFO(UserSession userSession, Activity activity, String str) {
        T7R A002 = C49054EoY.A00().A00(activity, userSession);
        1a8 r3 = new 1a8(C318146oT.A01);
        1vn A012 = 1vm.A01(userSession);
        LNj lNj = LNj.A02;
        0qQ.A0B(userSession, 1);
        C51974G9v.A1S(activity, str, A002, r3, A012);
        0qQ.A0B(lNj, 7);
        this.A03 = userSession;
        this.A00 = activity;
        this.A06 = str;
        this.A05 = A002;
        this.A02 = r3;
        this.A04 = A012;
        this.A01 = lNj;
    }
}
