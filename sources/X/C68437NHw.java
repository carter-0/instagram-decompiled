package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag$DIRECT_HTTP;
import java.util.List;

/* renamed from: X.NHw  reason: case insensitive filesystem */
public final class C68437NHw extends C272124k8 {
    public final C71028OZf A00;
    public final String A01;
    public final List A02;

    public C68437NHw(UserSession userSession, AnonymousClass7BV r8, AnonymousClass43S r9, C74484Pve pve, Integer num, String str, List list, boolean z) {
        super(userSession);
        this.A01 = str;
        this.A02 = list;
        this.A00 = new C71028OZf(r8, r9, pve, num, z);
    }

    public final void A02(UserSession userSession) {
        Object[] objArr;
        String str;
        int A0D = AnonymousClass7TG.A0D(userSession, -855480200);
        String str2 = this.A01;
        DLogTag$DIRECT_HTTP dLogTag$DIRECT_HTTP = DLogTag$DIRECT_HTTP.INSTANCE;
        if (str2 != null) {
            objArr = new Object[]{str2};
            str = "fetchThread id=%s";
        } else {
            objArr = new Object[]{this.A02};
            str = "fetchByRecipients id=%s";
        }
        DLog.d(dLogTag$DIRECT_HTTP, str, objArr);
        C71028OZf oZf = this.A00;
        AnonymousClass43S r1 = oZf.A01;
        if (r1 != null) {
            r1.A05(oZf.A00);
        }
        C74484Pve pve = oZf.A02;
        if (pve != null) {
            pve.onStart();
        }
        AnonymousClass0fD.A0A(725112557, A0D);
    }

    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(1853144577);
        AnonymousClass1XT r9 = (AnonymousClass1XT) obj;
        int A032 = AnonymousClass0fD.A03(-1977024374);
        0qQ.A0B(userSession, 0);
        C71028OZf oZf = this.A00;
        AnonymousClass43S r2 = oZf.A01;
        if (r2 != null) {
            r2.A0D(oZf.A00, false, false);
        }
        C74484Pve pve = oZf.A02;
        if (pve != null) {
            pve.onFailureInBackground(r9);
        }
        AnonymousClass0fD.A0A(-1457799779, A032);
        AnonymousClass0fD.A0A(-1286755521, A03);
    }

    public final /* bridge */ /* synthetic */ void A04(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(914989532);
        AnonymousClass74W r6 = (AnonymousClass74W) obj;
        int A032 = AnonymousClass0fD.A03(693250840);
        AnonymousClass7TG.A1N(userSession, r6);
        this.A00.A02(userSession, r6.A02);
        AnonymousClass0fD.A0A(-1323103755, A032);
        AnonymousClass0fD.A0A(451300487, A03);
    }

    public final void A05(C268654dm r3, UserSession userSession) {
        int A03 = AnonymousClass0fD.A03(-122052962);
        AnonymousClass7TG.A1N(userSession, r3);
        this.A00.A01(r3);
        AnonymousClass0fD.A0A(991783904, A03);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(-132525023);
        AnonymousClass74W r7 = (AnonymousClass74W) obj;
        int A032 = AnonymousClass0fD.A03(-561850687);
        AnonymousClass7TG.A1N(userSession, r7);
        C71028OZf oZf = this.A00;
        C71028OZf.A00(r7.A02, oZf);
        C74484Pve pve = oZf.A02;
        if (pve != null) {
            pve.onSuccess(oZf.A05);
        }
        AnonymousClass0fD.A0A(1868897930, A032);
        AnonymousClass0fD.A0A(1595922237, A03);
    }
}
