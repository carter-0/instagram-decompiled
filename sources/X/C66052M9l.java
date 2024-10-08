package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.M9l  reason: case insensitive filesystem */
public final /* synthetic */ class C66052M9l implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass5Gv A01;
    public final /* synthetic */ 1Av A02;
    public final /* synthetic */ C64159LRa A03;

    public /* synthetic */ C66052M9l(AnonymousClass5Gv r1, 1Av r2, C64159LRa lRa, int i) {
        this.A03 = lRa;
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public final void run() {
        C64159LRa lRa = this.A03;
        AnonymousClass5Gv r0 = this.A01;
        1Av r4 = this.A02;
        int i = this.A00;
        r0.A07((UserSession) null);
        C64125LOw lOw = lRa.A05;
        if (lOw != null) {
            lOw.A03(lRa.A06);
        }
        0xY A0p = AnonymousClass7TE.A0p(r4);
        A0p.E5Z("feed_mentioned_tagged_nudge_nux_shown_count", i + 1);
        A0p.apply();
        lRa.A0C.A0B = true;
        lRa.A06 = null;
    }
}
