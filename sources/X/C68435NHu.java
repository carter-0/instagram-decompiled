package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag$DIRECT_HTTP;

/* renamed from: X.NHu  reason: case insensitive filesystem */
public final class C68435NHu extends C272124k8 {
    public final C71028OZf A00;
    public final long A01;

    public C68435NHu(UserSession userSession, AnonymousClass7BV r8, AnonymousClass43S r9, C74484Pve pve, long j) {
        super(userSession);
        this.A01 = j;
        this.A00 = new C71028OZf(r8, r9, pve, (Integer) null, false);
    }

    public final void A02(UserSession userSession) {
        int A03 = AnonymousClass0fD.A03(-456795715);
        0qQ.A0B(userSession, 0);
        DLog.d(DLogTag$DIRECT_HTTP.INSTANCE, 002.A0Q("fetchThreadbyJid jid=", this.A01), new Object[0]);
        C71028OZf oZf = this.A00;
        AnonymousClass43S r1 = oZf.A01;
        if (r1 != null) {
            r1.A05(oZf.A00);
        }
        C74484Pve pve = oZf.A02;
        if (pve != null) {
            pve.onStart();
        }
        AnonymousClass0fD.A0A(-1740094838, A03);
    }

    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(1218078530);
        AnonymousClass1XT r9 = (AnonymousClass1XT) obj;
        int A032 = AnonymousClass0fD.A03(415238010);
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
        AnonymousClass0fD.A0A(-882349096, A032);
        AnonymousClass0fD.A0A(1464208141, A03);
    }

    public final /* bridge */ /* synthetic */ void A04(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(-1547684985);
        C370538wd r5 = (C370538wd) obj;
        int A032 = AnonymousClass0fD.A03(734014793);
        AnonymousClass7TG.A1N(userSession, r5);
        this.A00.A02(userSession, r5);
        AnonymousClass0fD.A0A(-125791485, A032);
        AnonymousClass0fD.A0A(-881767102, A03);
    }

    public final void A05(C268654dm r3, UserSession userSession) {
        int A03 = AnonymousClass0fD.A03(-2015454330);
        AnonymousClass7TG.A1N(userSession, r3);
        this.A00.A01(r3);
        AnonymousClass0fD.A0A(1523148156, A03);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(-1697807752);
        C370538wd r6 = (C370538wd) obj;
        int A032 = AnonymousClass0fD.A03(871139162);
        AnonymousClass7TG.A1N(userSession, r6);
        C71028OZf oZf = this.A00;
        C71028OZf.A00(r6, oZf);
        C74484Pve pve = oZf.A02;
        if (pve != null) {
            pve.onSuccess(oZf.A05);
        }
        AnonymousClass0fD.A0A(789928093, A032);
        AnonymousClass0fD.A0A(-110526348, A03);
    }
}
