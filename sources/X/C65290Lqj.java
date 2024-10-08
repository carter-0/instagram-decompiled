package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lqj  reason: case insensitive filesystem */
public final class C65290Lqj implements MXS {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C381779cJ A03;
    public final List A04;
    public final IngestSessionShim A05;

    public C65290Lqj(Context context, AnonymousClass0iw r4, UserSession userSession, IngestSessionShim ingestSessionShim, C381779cJ r7, List list) {
        DbZ.A0t(1, context, userSession, ingestSessionShim);
        AnonymousClass7TG.A1S(r7, r4);
        this.A02 = userSession;
        this.A05 = ingestSessionShim;
        this.A04 = list;
        this.A03 = r7;
        this.A01 = r4;
        this.A00 = DbT.A05(context);
        if (ingestSessionShim.A00.size() != 1) {
            0wb.A03("blast_list_for_multimedia", "Only one medium supported");
        }
    }

    public final boolean CKn(DirectShareTarget directShareTarget) {
        0qQ.A0B(directShareTarget, 0);
        return this.A04.contains(directShareTarget);
    }

    public final List AxF() {
        return this.A04;
    }

    public final int BtD() {
        return 4;
    }

    public final void EM2() {
        List list = this.A05.A00;
        ArrayList A0p = AnonymousClass7TF.A0p(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            UserSession userSession = this.A02;
            AnonymousClass3Q2 A0M = JTQ.A0M(userSession, A18);
            if (A0M == null) {
                0wb.A04("BlastListCandidatesSendJob", 002.A0R(AnonymousClass000.A00(231), A18), 1);
                C3265677h.A0i(userSession, (DirectThreadKey) null, "unknown_media", String.valueOf(AnonymousClass0HN.A00()), false);
            } else {
                A0M.A5g = true;
                if (A0M.A0e == 0) {
                    A0M.A0e = AnonymousClass7TG.A0I();
                }
                List<DirectShareTarget> list2 = this.A04;
                ArrayList A0p2 = AnonymousClass7TF.A0p(list2);
                for (DirectShareTarget lqg : list2) {
                    C59960JcS A0P = JTS.A0P(userSession);
                    Context context = this.A00;
                    C381779cJ r13 = this.A03;
                    A0P.A01(new C65287Lqg(context, this.A01, userSession, lqg, r13, A18));
                    A0p2.add(C60340gF.A00);
                }
            }
            A0p.add(C60340gF.A00);
        }
    }
}
