package X;

/* renamed from: X.Mix  reason: case insensitive filesystem */
public final class C67139Mix implements 1wn {
    public final /* synthetic */ C66633Ma2 A00;

    public C67139Mix(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-329174147);
        C293845lR r8 = (C293845lR) obj;
        int A0D = AnonymousClass7TG.A0D(r8, -1595321752);
        boolean z = r8.A04;
        C66633Ma2 ma2 = this.A00;
        if (z) {
            ma2.A0u().A0J("snapshot_seq_id", String.valueOf(r8.A00));
            String str = r8.A03;
            if (str != null) {
                ma2.A0u().A0J("snapshot_fetch_reason", str);
            }
            ma2.A0u().A0J("snapshot_inbox_mode", r8.A01.toString());
            ma2.A0u().A0J("snapshot_inbox_type", C67312Mlm.A00(r8.A02));
            ma2.A0u().A06.A05();
        } else {
            ma2.A0u().A06.A04();
        }
        AnonymousClass0fD.A0A(49979900, A0D);
        AnonymousClass0fD.A0A(408598348, A03);
    }
}
