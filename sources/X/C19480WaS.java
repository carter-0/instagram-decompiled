package X;

/* renamed from: X.WaS  reason: case insensitive filesystem */
public final class C19480WaS implements AnonymousClass3PN {
    public final /* synthetic */ W2M A00;
    public final /* synthetic */ Ki3 A01;

    public C19480WaS(W2M w2m, Ki3 ki3) {
        this.A00 = w2m;
        this.A01 = ki3;
    }

    public final void DOJ(String str) {
        W2M w2m = this.A00;
        AnonymousClass6ST r0 = w2m.A00;
        if (r0 != null) {
            r0.hide();
            w2m.A00 = null;
            C59689JTv.A0F(w2m.A01, "failed_to_load_highlight_message", 2131961943);
        }
    }

    public final void DOW(String str, boolean z) {
        W2M w2m = this.A00;
        AnonymousClass6ST r0 = w2m.A00;
        if (r0 != null) {
            Ki3 ki3 = this.A01;
            r0.hide();
            w2m.A00 = null;
            W2M.A00(w2m, ki3);
        }
    }
}
