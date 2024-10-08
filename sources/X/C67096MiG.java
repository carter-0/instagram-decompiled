package X;

/* renamed from: X.MiG  reason: case insensitive filesystem */
public final class C67096MiG implements C74321Psx {
    public final /* synthetic */ C66633Ma2 A00;

    public C67096MiG(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final void DrF(boolean z, boolean z2, boolean z3) {
        C66633Ma2 ma2 = this.A00;
        AnonymousClass4DH r3 = ma2.A1J;
        if (!r3.isResumed()) {
            0wb.A01.Ew0("DirectInboxPresenter", "Request should be canceled in onPause()");
            return;
        }
        C66582MXn.A1I(ma2);
        if (z) {
            C67197Mjt mjt = (C67197Mjt) ma2.A1s.getValue();
            mjt.A01.markerPoint(20125924, 002.A0c("inbox_fetch_", "_end", mjt.A00));
            if (ma2.A0f == C67237MkX.A07) {
                ((C68952Nbb) ma2.A2e.getValue()).A01.A05();
            }
            if (z2) {
                C67040MhD.A00(ma2.A0p()).A01();
            } else {
                AnonymousClass2mA r0 = (AnonymousClass2mA) ma2.A2m.getValue();
                if (r0 != null) {
                    r0.A02();
                }
            }
        } else {
            if (ma2.A0f == C67237MkX.A07) {
                ((C68952Nbb) ma2.A2e.getValue()).A01.A01();
            }
            ((C67197Mjt) ma2.A1s.getValue()).A05("FETCH_THREADS_FAILED");
            AnonymousClass2mA r02 = (AnonymousClass2mA) ma2.A2m.getValue();
            if (r02 != null) {
                r02.A00();
            }
            C69904Nu6.A00(r3.requireContext(), !z3);
            ma2.A06 = 0;
            ma2.A05 = 0;
        }
        ma2.A16((Integer) null);
    }
}
