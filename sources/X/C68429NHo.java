package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.DirectRealtimePayload;
import java.util.List;

/* renamed from: X.NHo  reason: case insensitive filesystem */
public final class C68429NHo extends C272124k8 {
    public final /* synthetic */ C74551Pwk A00;
    public final /* synthetic */ 1cp A01;
    public final /* synthetic */ DirectThreadKey A02;
    public final /* synthetic */ 2FW A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68429NHo(UserSession userSession, C74551Pwk pwk, 1cp r3, DirectThreadKey directThreadKey, 2FW r5, String str) {
        super(userSession);
        this.A01 = r3;
        this.A02 = directThreadKey;
        this.A03 = r5;
        this.A04 = str;
        this.A00 = pwk;
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        String str;
        int A032 = AnonymousClass0fD.A03(1073528773);
        NHZ nhz = (NHZ) obj;
        int A033 = AnonymousClass0fD.A03(-1842428835);
        UserSession userSession2 = this.A01.A00;
        DirectThreadKey directThreadKey = this.A02;
        2FW r10 = this.A03;
        String str2 = this.A04;
        0qQ.A0B(userSession2, 0);
        C51974G9v.A1P(directThreadKey, r10, str2, nhz);
        2Dr A002 = 1bJ.A00(userSession2);
        String BJR = nhz.BJR();
        DirectRealtimePayload directRealtimePayload = nhz.A00;
        if (directRealtimePayload != null) {
            long j = directRealtimePayload.timestamp;
            2Dr r2 = A002;
            synchronized (r2) {
                AnonymousClass48S A0P = r2.A0P(directThreadKey);
                if (A0P != null) {
                    C254703su A0I = A0P.A0I(r10, str2);
                    if (A0I == null) {
                        0wb.A03("DirectThreadStore", "Could not find local message using client context.");
                    } else {
                        AnonymousClass48S A0P2 = r2.A0P(directThreadKey);
                        if (A0P2 != null && A0I.A0g() == null) {
                            A0I.A1E(BJR);
                            A0I.A19((Long) null);
                            A0I.A1A(Long.valueOf(j));
                            A0I.A1m(AnonymousClass05K.A0j);
                            A0P2.A0G(A0I, true);
                            2Kb r12 = new 2Kb(directThreadKey, AnonymousClass05K.A0C, (List) null, (List) null, AnonymousClass7TE.A1I(A0I), false);
                            r2.A06.A00(r12);
                            r2.A09.accept(r12);
                            2Dr.A0F(r2, A0P2);
                            1bC r8 = r2.A0H;
                            r8.A02.ATE(new NS3(r8, directThreadKey));
                        }
                    }
                }
            }
            DirectRealtimePayload directRealtimePayload2 = nhz.A00;
            if (!(directRealtimePayload2 == null || (str = directRealtimePayload2.threadId) == null || r2.A0N(str) != null)) {
                C71129OdS.A04(userSession2, ThreadFetchReason.CONFIRM_PENDING_MESSAGES, (C74484Pve) null, str, true);
            }
            C74551Pwk.A02(this.A00);
            AnonymousClass0fD.A0A(1496096323, A033);
            AnonymousClass0fD.A0A(-103587563, A032);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A05(C268654dm r3, UserSession userSession) {
        int A032 = AnonymousClass0fD.A03(1314198586);
        C74551Pwk pwk = this.A00;
        C74551Pwk.A01(pwk);
        C74551Pwk.A00(r3, pwk);
        AnonymousClass0fD.A0A(428504075, A032);
    }
}
