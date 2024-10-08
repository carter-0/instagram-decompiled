package X;

/* renamed from: X.AyG  reason: case insensitive filesystem */
public final class C41664AyG extends 0Yg implements 0sP {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41664AyG(String str, String str2, String str3, boolean z, boolean z2) {
        super(1);
        this.A04 = z;
        this.A03 = z2;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0f9 r3 = (0f9) obj;
        0qQ.A0B(r3, 0);
        r3.ABR("isPrefetch", this.A04);
        r3.ABR("isAd", this.A03);
        r3.ABQ("origin", this.A01);
        r3.ABQ("bad_url_type", this.A02);
        String str = this.A00;
        if (str == null) {
            str = "nullable";
        }
        r3.ABQ("cdn_content_type", str);
        return r3;
    }
}
