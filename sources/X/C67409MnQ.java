package X;

/* renamed from: X.MnQ  reason: case insensitive filesystem */
public final class C67409MnQ implements C20899X3q {
    public final /* synthetic */ C20964X6r A00;
    public final /* synthetic */ C20910X4b A01;
    public final /* synthetic */ String A02;

    public C67409MnQ(C20964X6r x6r, C20910X4b x4b, String str) {
        this.A01 = x4b;
        this.A02 = str;
        this.A00 = x6r;
    }

    public final void ACr(1Ln r3) {
        r3.A0R("query_text", this.A01.E4p());
        r3.A0R("search_session_id", this.A02);
        r3.A0R("rank_token", this.A00.E4z());
    }
}
