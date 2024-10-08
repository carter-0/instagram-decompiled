package X;

/* renamed from: X.Miu  reason: case insensitive filesystem */
public final class C67136Miu implements 1wn {
    public final /* synthetic */ C66633Ma2 A00;

    public C67136Miu(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C2366634p r0;
        int A03 = AnonymousClass0fD.A03(1323170948);
        C291045gQ r10 = (C291045gQ) obj;
        int A032 = AnonymousClass0fD.A03(-1879965425);
        0qQ.A0B(r10, 0);
        Integer num = r10.A02;
        if (num == AnonymousClass05K.A01) {
            C66633Ma2 ma2 = this.A00;
            ma2.A0u().A0B.A04();
            if (C66633Ma2.A0j(ma2) && (r0 = C66633Ma2.A04(ma2).A07) != null) {
                r0.A04();
            }
            if (ma2.A2x) {
                C67537MpW mpW = (C67537MpW) ma2.A1l.getValue();
                mpW.A01.markerPoint(31797299, "mailbox_iris_sync_start");
                mpW.A07 = true;
            }
        } else if (num == AnonymousClass05K.A0C) {
            C66633Ma2 ma22 = this.A00;
            Mi9 A0u = ma22.A0u();
            long j = r10.A01;
            Long valueOf = Long.valueOf(j);
            A0u.A0I("latest_server_seq_id", valueOf);
            C67017Mgq A04 = C66633Ma2.A04(ma22);
            A04.A01 = valueOf;
            A04.A0I("latest_server_seq_id", valueOf);
            Mi9 A0u2 = ma22.A0u();
            long j2 = j - r10.A00;
            A0u2.A0I("total_delta_count", Long.valueOf(j2));
            C66633Ma2.A04(ma22).A0T(j2);
            ma22.A0u().A0B.A05();
            if (ma22.A2x) {
                C67537MpW mpW2 = (C67537MpW) ma22.A1l.getValue();
                mpW2.A01.markerPoint(31797299, "mailbox_iris_sync_completed");
                mpW2.A07 = false;
                C66633Ma2.A0T(ma22);
            }
        }
        AnonymousClass0fD.A0A(-259982750, A032);
        AnonymousClass0fD.A0A(1685186958, A03);
    }
}
