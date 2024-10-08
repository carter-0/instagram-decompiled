package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6cR  reason: invalid class name and case insensitive filesystem */
public final class C311286cR implements 1wn {
    public final /* synthetic */ C311276cQ A00;

    public C311286cR(C311276cQ r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1045993827);
        C57061INb iNb = (C57061INb) obj;
        int A032 = AnonymousClass0fD.A03(422008571);
        0qQ.A0B(iNb, 0);
        boolean z = iNb.A00;
        C311276cQ r2 = this.A00;
        if (z) {
            C273384mU r1 = r2.A02;
            r1.EHS(true);
            r2.A00 = true;
            if (!((ReelViewerFragment) r1).A2q) {
                r1.EHY("BKStoryViewerTooltipEvent");
            }
        } else {
            r2.A00 = false;
            C273384mU r12 = r2.A02;
            if (!((ReelViewerFragment) r12).A2q) {
                r12.EHd();
            }
        }
        AnonymousClass0fD.A0A(-656344608, A032);
        AnonymousClass0fD.A0A(-330892833, A03);
    }
}
