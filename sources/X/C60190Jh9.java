package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Jh9  reason: case insensitive filesystem */
public final class C60190Jh9 extends 2YL {
    public final UserSession A00;
    public final C328767Gd A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final List A03 = AnonymousClass7TE.A1C();
    public final 0V2 A04;
    public final C61770pa A05;
    public final C65588LwO A06;

    public C60190Jh9(UserSession userSession, C328767Gd r10, String str, String str2) {
        int A032 = DbW.A03(1, userSession, str2);
        this.A00 = userSession;
        this.A01 = r10;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 1, 0);
        this.A04 = A012;
        this.A05 = new 0V1((C262204Co) null, A012);
        C65588LwO lwO = new C65588LwO(this, A032);
        this.A06 = lwO;
        JTO.A1Y(num, new MG3((Object) this, (AnonymousClass4D7) null, 0), C318116oQ.A00(this));
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(C273654mx.A00(289), RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        AnonymousClass3PP A002 = AnonymousClass3PO.A00(userSession);
        A002.A02(AnonymousClass3BU.ON_TAP, str, str2, A1E);
        A002.A05(lwO, str, (String) null, true);
    }
}
