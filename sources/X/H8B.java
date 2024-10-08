package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class H8B extends 0ng {
    public final /* synthetic */ AnonymousClass540 A00;
    public final /* synthetic */ C278794xX A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H8B(AnonymousClass540 r4, C278794xX r5) {
        super(1036460894, 3, false, false);
        this.A01 = r5;
        this.A00 = r4;
    }

    public final void run() {
        String A002;
        1NU r3;
        1GP A0M;
        T6F A0d;
        1FI r1 = 1FI.A0F;
        String A003 = AnonymousClass1FM.A00();
        C278794xX r5 = this.A01;
        UserSession userSession = r5.A01;
        1FI r16 = r1;
        1FS r13 = new 1FS((1FR) null, (C62500to) null, r16, 1FP.A00(userSession, r1, (String) null, (String) null, false), (Long) null, A003, (String) null, (String) null, (String) null, AnonymousClass7TG.A0j(), (String) null, 0Yt.A0E(), 0Yt.A0E(), 1FS.A0G.incrementAndGet(), false, false);
        0Tu r8 = 0Tu.A05;
        if (182.A06(r8, userSession, 36314098812062100L)) {
            A002 = 002.A0O("pando-parser-", DbS.A04(r8, userSession, 36595573788838068L));
        } else {
            A002 = AnonymousClass000.A00(3278);
        }
        if (182.A06(r8, userSession, 36314098812193173L)) {
            1FZ r12 = new 1FZ(userSession, 1957781489, 1, false);
            r12.A04();
            r12.A0A("feed/timeline/");
            if (182.A06(r8, userSession, 36314098812062100L)) {
                int A04 = DbS.A04(r8, userSession, 36595573788838068L);
                A0d = new T6F(r5.A02, Y6J.A00, A04);
            } else {
                A0d = C51973G9u.A0d(userSession, AnonymousClass1Fh.class, true, false);
            }
            r12.A00 = (1Fk) A0d;
            r12.A03 = 002.A0g("streaming-", A002, ": feed/timeline/");
            Context context = r5.A00;
            1Fl.A02(DbT.A05(context), r12, userSession, r13, new 1Cn(DbT.A05(context)));
            A0M = r12.A0M();
            A0M.A02(new INB(this.A00, 1));
        } else {
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("feed/timeline/");
            if (182.A06(r8, userSession, 36314098812062100L)) {
                int A042 = DbS.A04(r8, userSession, 36595573788838068L);
                Y6I y6i = Y6I.A00;
                C13758TgU createApiFrameworkParser = r5.A02.createApiFrameworkParser(false);
                0qQ.A07(createApiFrameworkParser);
                r3 = new C12790T7a(createApiFrameworkParser, y6i, A042);
            } else {
                r3 = new C292855jd(new 0bH(userSession), 1FX.A01, -20);
            }
            A0a.A0P(r3);
            A0a.A03 = 002.A0R(A002, ": feed/timeline/");
            Context context2 = r5.A00;
            1Fl.A02(DbT.A05(context2), A0a, userSession, r13, new 1Cn(DbT.A05(context2)));
            A0M = A0a.A0M();
            H50.A00(A0M, this.A00, 13);
        }
        1ES.A03((AnonymousClass11X) A0M);
    }
}
