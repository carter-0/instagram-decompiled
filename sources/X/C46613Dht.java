package X;

import java.util.Map;

/* renamed from: X.Dht  reason: case insensitive filesystem */
public final class C46613Dht extends C361158fl {
    public final /* synthetic */ C307896Rx A00;
    public final /* synthetic */ C277014uI A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;

    public final void A04(C268654dm r5) {
        0qQ.A0B(r5, 0);
        C277014uI r1 = this.A01;
        if (r1 != null) {
            DbS.A1Q(this.A00, r1);
        }
        1Kn.A00(this.A00.A03, 002.A0R("[Bloks] AsyncActionWithDataManifestV2: ", this.A03), "Failed to fetch action on payload", r5.A01());
    }

    public C46613Dht(C307896Rx r1, C277014uI r2, C277014uI r3, String str, Map map) {
        this.A00 = r1;
        this.A04 = map;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C307886Rw.A06(DbV.A0Q(obj), this.A00, this.A02, this.A01, this.A04);
    }
}
