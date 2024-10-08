package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Afa  reason: case insensitive filesystem */
public final class C40612Afa implements X59 {
    public final /* synthetic */ C353398Hl A00;

    public C40612Afa(C353398Hl r1) {
        this.A00 = r1;
    }

    public final void Dba(C18078Vl7 vl7) {
        int i;
        boolean z;
        C353438Hq r3;
        C353438Hq r0;
        C353438Hq r6;
        0qQ.A0B(vl7, 0);
        C353398Hl r5 = this.A00;
        C279284yO r1 = r5.A00;
        if (r1 instanceof AnonymousClass80L) {
            i = 1;
        } else if (r1 instanceof AnonymousClass80O) {
            i = 4;
        } else {
            i = 0;
            if (r1 instanceof AnonymousClass9QA) {
                i = 3;
            }
        }
        int i2 = vl7.A00;
        if (!(i2 == i || i2 != 3 || (r6 = (C353438Hq) r5.A0G) == null)) {
            UserSession userSession = r6.A08;
            Context context = r6.A07;
            if (C362988ir.A01(context.getApplicationContext(), userSession)) {
                1pd.A00(C362988ir.A00()).A00(context, userSession, new C40618Afg(r6, 1), "GlassesStoryViewListenerEXIT_STORY_DESINATION_WITH_SUP_CALLBACK");
            }
        }
        vl7.A03(i);
        if (r5.A00 instanceof AnonymousClass9QA) {
            C357638Yz r4 = r5.A0A;
            W0T A002 = C353398Hl.A00(r5);
            boolean z2 = false;
            if (A002 != null) {
                z = A002.A0G();
            } else {
                z = false;
            }
            r4.A03 = z;
            W0T A003 = C353398Hl.A00(r5);
            if (A003 != null && A003.A0G()) {
                z2 = true;
            }
            AnonymousClass8Ho r32 = null;
            if (z2 && (r0 = (C353438Hq) r5.A0G) != null) {
                r0.A05();
                r0.A04();
            }
            C41832B2n b2n = r5.A01;
            if (b2n != null) {
                r32 = b2n.BN9();
            }
            if ((r32 instanceof C353438Hq) && (r3 = (C353438Hq) r32) != null) {
                vl7.A05(new C383779gF(vl7, r4, r3), "sup:SupDelegate_STORIES_DEST_WITH_SUP_CB_ID");
                W2Q w2q = vl7.A09;
                if (w2q != null) {
                    w2q.A0A.put("sup:SupDelegate_STORIES_DEST_WITH_SUP_CB_ID", new C18438Vrh(vl7, r3));
                    return;
                }
                return;
            }
            return;
        }
        vl7.A07("sup:SupDelegate_STORIES_DEST_WITH_SUP_CB_ID");
        W2Q w2q2 = vl7.A09;
        if (w2q2 != null) {
            w2q2.A0A.remove("sup:SupDelegate_STORIES_DEST_WITH_SUP_CB_ID");
        }
    }
}
