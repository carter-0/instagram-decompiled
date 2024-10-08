package X;

public final class WS1 implements C232262tL {
    public final C266444Yx A00;
    public final C15683Ugo A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "product_collection_description";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        WS1 ws1 = (WS1) obj;
        C266444Yx r1 = this.A00;
        C266444Yx r0 = null;
        if (ws1 != null) {
            r0 = ws1.A00;
        }
        if (!0qQ.A0K(r1, r0) || ws1 == null || !0qQ.A0K(this.A01, ws1.A01)) {
            return false;
        }
        return true;
    }

    public WS1(C266444Yx r1, C15683Ugo ugo) {
        this.A00 = r1;
        this.A01 = ugo;
    }
}
