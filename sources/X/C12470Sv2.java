package X;

/* renamed from: X.Sv2  reason: case insensitive filesystem */
public final class C12470Sv2 implements C13736Tg8 {
    public final /* synthetic */ C13736Tg8 A00;
    public final /* synthetic */ C10258RpI A01;
    public final /* synthetic */ String A02;

    public C12470Sv2(C13736Tg8 tg8, C10258RpI rpI, String str) {
        this.A00 = tg8;
        this.A01 = rpI;
        this.A02 = str;
    }

    public final void Dap(Boolean bool, Integer num, Throwable th) {
        this.A00.Dap(bool, num, th);
    }

    public final void Das(String str) {
        this.A00.Das(str);
        C10258RpI rpI = this.A01;
        rpI.A00.remove(this.A02);
    }
}
