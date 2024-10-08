package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.R7p  reason: case insensitive filesystem */
public final class C8751R7p extends C272124k8 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C13920TlM A01;
    public final /* synthetic */ C327307Ag A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8751R7p(C13920TlM tlM, UserSession userSession, C327307Ag r3, String str, long j) {
        super(userSession);
        this.A02 = r3;
        this.A01 = tlM;
        this.A03 = str;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ void A04(UserSession userSession, Object obj) {
        int A032 = AnonymousClass0fD.A03(-443821846);
        C54060Gyj gyj = (C54060Gyj) obj;
        int A033 = AnonymousClass0fD.A03(561952938);
        0qQ.A0B(gyj, 1);
        C54059Gyi gyi = gyj.A00;
        if (gyi != null) {
            long j = gyi.A00;
            if (Long.valueOf(j) != null && j > 0) {
                C327307Ag r4 = this.A02;
                List<C327337Aj> list = r4.A01;
                String str = this.A03;
                for (C327337Aj DNu : list) {
                    DNu.DNu(j, str, true, r4.A00.A05);
                }
                C13920TlM tlM = this.A01;
                UserSession userSession2 = r4.A00;
                long j2 = this.A00;
                C11367SPk.A03(str, "groupishId");
                String valueOf = String.valueOf(j);
                C11367SPk.A03(valueOf, "sessionId");
                long currentTimeMillis = System.currentTimeMillis();
                String str2 = userSession2.A06;
                C11367SPk.A03(str2, C273654mx.A00(421));
                tlM.onSuccess(new LiveLocationSession(str, (String) null, valueOf, str2, j2, currentTimeMillis, false));
                AnonymousClass0fD.A0A(-1809107520, A033);
                AnonymousClass0fD.A0A(-759521171, A032);
            }
        }
        this.A01.onError(new Throwable("Location sharing session ID missing from server response"));
        AnonymousClass0fD.A0A(-1809107520, A033);
        AnonymousClass0fD.A0A(-759521171, A032);
    }

    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        int A032 = AnonymousClass0fD.A03(-1284996322);
        int A033 = AnonymousClass0fD.A03(-773532204);
        C327307Ag r2 = this.A02;
        ((Executor) r2.A02.getValue()).execute(new C12922TDl(this.A01));
        AnonymousClass0fD.A0A(-468902768, A033);
        AnonymousClass0fD.A0A(147622253, A032);
    }
}
