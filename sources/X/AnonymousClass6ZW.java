package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6ZW  reason: invalid class name */
public final class AnonymousClass6ZW implements 27S {
    public final /* synthetic */ AnonymousClass6ZO A00;

    public AnonymousClass6ZW(AnonymousClass6ZO r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        1Ns r2;
        Integer num;
        AnonymousClass376 r9 = (AnonymousClass376) obj;
        0qQ.A0B(r9, 0);
        for (Reel reel : r9.A04) {
            AnonymousClass6ZO r6 = this.A00;
            C273384mU r22 = r6.A06;
            String id = reel.getId();
            0qQ.A07(id);
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r22;
            if (reelViewerFragment.A1E.Bl0(id) != null) {
                return true;
            }
            C250973mM r0 = reelViewerFragment.A0a;
            if (r0 != null) {
                Reel reel2 = r0.A0H;
                1Ns r3 = reel.A0W;
                if (r3 != null && (r2 = reel2.A0W) != null && reel.A0d() && reel2.A0d() && r3.CAm() == (num = AnonymousClass05K.A01) && r2.CAm() == num && r3.getId().equals(reel2.A0W.getId())) {
                    return true;
                }
            }
            if (reel.A0i()) {
                UserSession userSession = r6.A00;
                if (userSession == null) {
                    0qQ.A0F("userSession");
                    throw AnonymousClass00P.createAndThrow();
                } else if (!reel.A15(userSession)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(1749220696);
        int A032 = AnonymousClass0fD.A03(-281286643);
        this.A00.A06.DcT();
        AnonymousClass0fD.A0A(1904732204, A032);
        AnonymousClass0fD.A0A(1879477860, A03);
    }
}
