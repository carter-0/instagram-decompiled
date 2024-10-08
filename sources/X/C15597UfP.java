package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.UfP  reason: case insensitive filesystem */
public final class C15597UfP extends 1P0 {
    public final /* synthetic */ C255783ui A00;
    public final /* synthetic */ C283405Hn A01;
    public final /* synthetic */ C310236ae A02;

    public C15597UfP(C255783ui r1, C283405Hn r2, C310236ae r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(-506087818);
        this.A00.A16 = this.A01;
        C59689JTv.A0F(this.A02.A06, "sticker_send_reaction_error", 2131974215);
        AnonymousClass0fD.A0A(74975639, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-715460124);
        int A032 = AnonymousClass0fD.A03(284621812);
        C310236ae r5 = this.A02;
        C273384mU r4 = r5.A0F;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r4;
        if (!(reelViewerFragment.A0a == null || r4.Au5() == null)) {
            r5.A0D.A07(reelViewerFragment.A0a.A0H, r4.Au5(), "reaction_sticker", 002.A0R("emoji_reaction_", this.A01.A00), reelViewerFragment.A0a.A01);
        }
        AnonymousClass0fD.A0A(425615443, A032);
        AnonymousClass0fD.A0A(1898867277, A03);
    }
}
