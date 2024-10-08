package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.DirectApiError;
import com.instagram.realtimeclient.DirectRealtimePayload;

/* renamed from: X.NHq  reason: case insensitive filesystem */
public final class C68431NHq extends C272124k8 {
    public final C74417PuX A00;

    public C68431NHq(UserSession userSession, C74417PuX puX) {
        super(userSession);
        this.A00 = puX;
    }

    public final void A02(UserSession userSession) {
        AnonymousClass0fD.A0A(-1362302756, AnonymousClass0fD.A03(-188679929));
    }

    public final void A05(C268654dm r20, UserSession userSession) {
        C74417PuX puX;
        Integer num;
        C270214gN A01;
        DirectRealtimePayload directRealtimePayload;
        DirectApiError directApiError;
        int A03 = AnonymousClass0fD.A03(1853622432);
        C268654dm r4 = r20;
        NHZ nhz = (NHZ) r4.A00();
        if (nhz == null || (directRealtimePayload = nhz.A00) == null || (directApiError = directRealtimePayload.error) == null) {
            puX = this.A00;
            num = AnonymousClass05K.A00;
            A01 = C71115Od8.A01(r4, C71115Od8.A00);
        } else {
            puX = this.A00;
            num = AnonymousClass05K.A00;
            C69414Nku nku = C69414Nku.A0B;
            String str = directApiError.errorType;
            0qQ.A06(str);
            A01 = new C270214gN((C254403sQ) null, nku, str, (String) null, "http", directApiError.errorTitle, directApiError.errorDescription, (String) null, false, false, false, false, false, false);
        }
        puX.DEJ(A01, num);
        AnonymousClass0fD.A0A(481469796, A03);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(-443163528);
        int A032 = AnonymousClass0fD.A03(122762633);
        this.A00.Dop((NHZ) obj, AnonymousClass05K.A00);
        AnonymousClass0fD.A0A(1241582796, A032);
        AnonymousClass0fD.A0A(-1073743012, A03);
    }
}
