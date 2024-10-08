package X;

import java.util.Map;

/* renamed from: X.E7y  reason: case insensitive filesystem */
public final class C47560E7y extends C361158fl {
    public final /* synthetic */ C229382nI A00;
    public final /* synthetic */ 0lg A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;

    public final void A04(C268654dm r4) {
        0qQ.A0B(r4, 0);
        Throwable A012 = r4.A01();
        String str = this.A03;
        if (A012 != null) {
            0wb.A06(str, "Failed to load consent flow", A012);
        } else {
            0wb.A03(str, "Failed to load consent flow");
        }
    }

    public C47560E7y(C229382nI r1, 0lg r2, String str, String str2, Map map) {
        this.A02 = str;
        this.A04 = map;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = str2;
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C46620Di0 A0Q = DbV.A0Q(obj);
        if (A0Q.A02 == null) {
            C46649DiU.A09(this.A00.A03, C46649DiU.A04(this.A02, this.A04), this.A01);
            return;
        }
        C48382Edd.A00(this.A00, A0Q);
    }
}
