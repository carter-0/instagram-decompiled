package X;

/* renamed from: X.INx  reason: case insensitive filesystem */
public final class C57083INx implements 1wn {
    public final /* synthetic */ AnonymousClass2xS A00;

    public C57083INx(AnonymousClass2xS r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int B6L;
        int BLQ;
        C245853da r0;
        int A03 = AnonymousClass0fD.A03(1748856019);
        C71909Osr osr = (C71909Osr) obj;
        int A032 = AnonymousClass0fD.A03(-794703041);
        0qQ.A0B(osr, 0);
        boolean z = osr.A00;
        if (z) {
            C232722uK r1 = this.A00.A0G;
            if (AnonymousClass4K8.A00(r1.A0J())) {
                r1.A0U("autoplay_disabled", false, false);
            }
        }
        AnonymousClass2xS r5 = this.A00;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C238133Ar r4 = r5.A03;
        if (r4 != null && (B6L = r4.B6L()) <= (BLQ = r4.BLQ())) {
            while (true) {
                AnonymousClass3V3 A01 = AnonymousClass3OG.A01(r5.A0A, r5.A0D, r4, B6L);
                if (A01 != null) {
                    if (z) {
                        r0 = C245853da.SHOW;
                    } else {
                        r0 = C245853da.HIDDEN;
                    }
                    AnonymousClass3OG.A03(A01, r0);
                }
                if (B6L == BLQ) {
                    break;
                }
                B6L++;
            }
        }
        AnonymousClass0fD.A0A(-1363833180, A032);
        AnonymousClass0fD.A0A(-1149091692, A03);
    }
}
