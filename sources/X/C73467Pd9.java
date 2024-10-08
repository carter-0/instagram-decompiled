package X;

import android.content.Context;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Pd9  reason: case insensitive filesystem */
public final class C73467Pd9 implements AnonymousClass0eL, C62320sa {
    public final int A00;
    public final Object A01;

    public C73467Pd9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static Object A00(0lg r3, Object obj) {
        return r3.A01(C68963Nbq.class, new C73467Pd9(obj, 3));
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [X.7Wp, X.7Xa] */
    /* JADX WARNING: type inference failed for: r6v0, types: [X.7Wn, X.7Wp] */
    public final Object invoke() {
        switch (this.A00) {
            case 0:
                return new IgNetworkConsentStorage((UserSession) this.A01);
            case 1:
                UserSession userSession = (UserSession) this.A01;
                return new OyN(AnonymousClass1Nd.A00(userSession), userSession, AnonymousClass4k9.A00(userSession));
            case 2:
                return new C71026OZd((UserSession) this.A01);
            case 3:
                return new C67211Mk7((C72208OyY) this.A01);
            case 4:
                return new C72208OyY((UserSession) this.A01);
            case 5:
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                return C66582MXn.A0A((AnonymousClass7L2) this.A01);
            case 6:
                C67814MvI mvI = (C67814MvI) this.A01;
                List emptyList = Collections.emptyList();
                ? r6 = mvI.A08;
                C331037Pg r8 = mvI.A0A;
                AnonymousClass9HC r7 = mvI.A09;
                return new AnonymousClass74R(mvI.A06, mvI.A07, r6, r7, r8, emptyList, false, mvI.A0B);
            case 7:
                C67814MvI mvI2 = (C67814MvI) this.A01;
                Context context = mvI2.A05.getContext();
                ? r3 = mvI2.A08;
                return AnonymousClass78E.A00(context, mvI2.A06, mvI2.A07, r3, mvI2.A09, (AnonymousClass78D) null);
            case 8:
                return new C72200OyM((UserSession) this.A01);
            case 9:
                return new C67089Mi7((UserSession) this.A01);
            case 10:
                return new C72214Oyf(C60960kU.A00, (UserSession) this.A01);
            default:
                return AnonymousClass0kN.A02((0lg) this.A01);
        }
    }
}
