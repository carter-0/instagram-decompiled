package X;

/* renamed from: X.GXw  reason: case insensitive filesystem */
public final class C52571GXw extends C230372pW {
    public final /* synthetic */ C52570GXv A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52571GXw(1Bk r1, C52570GXv gXv) {
        super(r1);
        this.A00 = gXv;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C55788HnN hnN = (C55788HnN) obj;
        C51965G9l.A1U(obj2);
        0qQ.A0B(hnN, 0);
        String A0a = DbY.A0a();
        Integer num = hnN.A00;
        if (num == AnonymousClass05K.A00) {
            C14428Tvx.A00(this.A00.A00, A0a, hnN.A02, hnN.A01, hnN.A03);
        } else if (num == AnonymousClass05K.A01) {
            0wc r1 = this.A00.A00;
            String str = hnN.A02;
            String str2 = hnN.A01;
            C14428Tvx.A00(r1, A0a, str, str2, "");
            0Aj A0e = AnonymousClass7TE.A0e(r1, "instagram_search_meta_ai_airplane_impression");
            if (A0e.isSampled()) {
                A0e.AAJ("search_session_id", str);
                A0e.AAJ("query_text", str2);
                C51965G9l.A1K(A0e, A0a);
                A0e.Cgf();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C51965G9l.A1U(obj2);
    }
}
