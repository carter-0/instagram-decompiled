package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;

/* renamed from: X.IiS  reason: case insensitive filesystem */
public final class C57911IiS implements Runnable {
    public final /* synthetic */ AnonymousClass540 A00;
    public final /* synthetic */ C278734xR A01;
    public final /* synthetic */ boolean A02;

    public C57911IiS(AnonymousClass540 r1, C278734xR r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }

    public final void run() {
        C278734xR r2 = this.A01;
        UserSession userSession = r2.A04;
        0tp A002 = 0tq.A00(userSession);
        C62500to r9 = new C62500to(A002);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        WT2 A003 = WT2.A00(r2.A03.getApplicationContext(), userSession);
        WT2.A01(A003);
        C17365VSs vSs = A003.A01;
        if (!Collections.unmodifiableList(vSs.A01).isEmpty()) {
            try {
                String A004 = C18221Vnl.A00(vSs);
                if (A004 != null) {
                    A1H.put("client_feed_changelist", A004);
                }
            } catch (IOException unused) {
            }
        }
        1FI r10 = 1FI.A04;
        Long l = null;
        if (182.A06(0Tu.A05, userSession, 36328151945919466L)) {
            l = Long.valueOf(1Al.A01(userSession).A03(1An.A29).getLong("lastHeadLoadTimeMs", -1));
        }
        String A005 = AnonymousClass1FM.A00();
        1FS r7 = new 1FS((1FR) null, r9, r10, 1FP.A00(userSession, r10, (String) null, (String) null, false), l, A005, (String) null, (String) null, (String) null, AnonymousClass7TG.A0j(), (String) null, 0Yt.A0E(), A1H, 1FS.A0G.incrementAndGet(), false, false);
        C228842mQ r8 = new C228842mQ(1DD.A00(r7, r2.A06.A01, C59018J3d.A00, 0, 14), r7);
        0qQ.A0C(r8, "null cannot be cast to non-null type com.instagram.mainfeed.api.MainFeedRequest.Rest.Http");
        1FS r72 = r8.A00;
        1OC r6 = r8.A00;
        r6.A00 = new C54256H4z(this.A00, A002, r8, r72, r2, this.A02);
        1ES.A03(r6);
    }
}
