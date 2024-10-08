package X;

import java.nio.charset.Charset;

/* renamed from: X.Nbm  reason: case insensitive filesystem */
public final class C68960Nbm extends AnonymousClass7BP {
    public C68962Nbo A00;
    public final String A01;
    public final /* synthetic */ 1bO A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68960Nbm(1bO r2, String str) {
        super((C74340PtG) null, r2);
        this.A02 = r2;
        this.A01 = str;
    }

    public final void A00() {
        1bO r1 = this.A02;
        Charset charset = 1bO.A0w;
        C68962Nbo A022 = r1.A0N.A02(this.A01, r1.A01);
        this.A00 = A022;
        A022.A06.add(this);
    }

    public final void A01() {
        C68962Nbo nbo = this.A00;
        if (nbo != null) {
            nbo.A06(this);
            this.A00 = null;
        }
    }
}
