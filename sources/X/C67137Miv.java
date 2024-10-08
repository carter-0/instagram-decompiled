package X;

/* renamed from: X.Miv  reason: case insensitive filesystem */
public final class C67137Miv implements 1wn {
    public final /* synthetic */ C66633Ma2 A00;

    public C67137Miv(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1710931729);
        C291035gP r9 = (C291035gP) obj;
        int A032 = AnonymousClass0fD.A03(-442617848);
        0qQ.A0B(r9, 0);
        Integer num = r9.A00;
        if (num == AnonymousClass05K.A01) {
            C66633Ma2 ma2 = this.A00;
            C66633Ma2.A04(ma2).A05.A04();
            if (ma2.A2x) {
                C67537MpW mpW = (C67537MpW) ma2.A1l.getValue();
                mpW.A01.markerPoint(31797299, "mailbox_delta_awaiting");
                mpW.A06 = true;
            }
        } else if (num == AnonymousClass05K.A0C) {
            C66633Ma2 ma22 = this.A00;
            C66633Ma2.A04(ma22).A05.A05();
            if (ma22.A2x) {
                C67537MpW mpW2 = (C67537MpW) ma22.A1l.getValue();
                mpW2.A01.markerPoint(31797299, "mailbox_delta_up_to_date");
                mpW2.A06 = false;
                C66633Ma2.A0T(ma22);
            }
        }
        AnonymousClass0fD.A0A(-905256551, A032);
        AnonymousClass0fD.A0A(-2040541163, A03);
    }
}
