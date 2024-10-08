package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.77e  reason: invalid class name and case insensitive filesystem */
public final class C3265377e extends C272124k8 {
    public final AnonymousClass77Z A00;
    public final String A01;
    public volatile List A02 = 0sn.A00;

    public C3265377e(UserSession userSession, AnonymousClass77Z r3, String str) {
        super(userSession);
        this.A00 = r3;
        this.A01 = str;
    }

    public final void A05(C268654dm r4, UserSession userSession) {
        int A03 = AnonymousClass0fD.A03(-1142142727);
        this.A00.DEc("request_fail");
        AnonymousClass0fD.A0A(650991309, A03);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(-908339591);
        C3265177b r6 = (C3265177b) obj;
        int A032 = AnonymousClass0fD.A03(147087423);
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 1);
        List list = r6.A00;
        if (list != null) {
            this.A02 = C66785McW.A00(userSession, this.A01, list);
        }
        boolean z = !this.A02.isEmpty();
        AnonymousClass77Z r1 = this.A00;
        if (z) {
            r1.Doh(this.A02);
        } else {
            r1.DEc("fail_to_update_local_cache");
        }
        AnonymousClass0fD.A0A(1128879524, A032);
        AnonymousClass0fD.A0A(-1514535027, A03);
    }
}
