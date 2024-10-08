package X;

/* renamed from: X.Ujq  reason: case insensitive filesystem */
public final class C15866Ujq extends 0ng {
    public final /* synthetic */ 29f A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ 0rm A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15866Ujq(29f r4, String str, 0rm r6) {
        super(1948240166, 3, false, false);
        this.A02 = r6;
        this.A00 = r4;
        this.A01 = str;
    }

    public final void run() {
        0rm r4 = this.A02;
        0Ak r3 = (0Ak) r4.A00;
        String str = this.A01;
        r3.A0R("original_color_space", 29f.A02(str));
        r3.A0Q("original_color_depth", Long.valueOf(29f.A00(str)));
        r3.A0Q("original_frame_per_second", Long.valueOf(29f.A01(str)));
        C342057ny.A00(new C19999WjK(r4));
    }
}
