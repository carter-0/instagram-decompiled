package X;

/* renamed from: X.Llo  reason: case insensitive filesystem */
public final class C65011Llo implements MTU {
    public final /* synthetic */ String A00;
    public final /* synthetic */ 1IX A01;

    public C65011Llo(String str, 1IX r2) {
        this.A01 = r2;
        this.A00 = str;
    }

    public final void DtU() {
        this.A01.resumeWith(JTU.A0c(new Exception(G9w.A0k("Could not transcribe captions from video (", this.A00))));
    }

    public final void DtV(C61077JwF jwF, String str) {
        this.A01.resumeWith(jwF);
    }
}
