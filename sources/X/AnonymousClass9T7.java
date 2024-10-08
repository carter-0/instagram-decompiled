package X;

/* renamed from: X.9T7  reason: invalid class name */
public final class AnonymousClass9T7 implements MUD {
    public final /* synthetic */ AnonymousClass9RT A00;
    public final /* synthetic */ AnonymousClass8k0 A01;

    public AnonymousClass9T7(AnonymousClass9RT r1, AnonymousClass8k0 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void DED() {
        this.A01.DEc("FbBPLCrossPostingSettingDataProvider - Fetch failed");
    }

    public final void DoW(AnonymousClass9R1 r5) {
        AnonymousClass9RT r1 = this.A00;
        boolean A002 = AnonymousClass9RT.A00(C295905p6.FEED, r5);
        AnonymousClass0eM r3 = r1.A01;
        0xY AR4 = ((2D6) r3.getValue()).A04.AR4();
        AR4.E5T("PREFERENCE_CREATOR_FEED_BPL_AUTO_XPOSTING", A002);
        AR4.apply();
        boolean A003 = AnonymousClass9RT.A00(C295905p6.STORY, r5);
        0xY AR42 = ((2D6) r3.getValue()).A04.AR4();
        AR42.E5T("PREFERENCE_CREATOR_STORY_BPL_AUTO_XPOSTING", A003);
        AR42.apply();
        ((2D6) r3.getValue()).A06(AnonymousClass9RT.A00(C295905p6.REELS, r5));
    }
}
