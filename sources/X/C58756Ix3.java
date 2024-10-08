package X;

/* renamed from: X.Ix3  reason: case insensitive filesystem */
public final class C58756Ix3 extends 0Yg implements 0sP {
    public final /* synthetic */ ILM A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58756Ix3(ILM ilm, String str, String str2, String str3, boolean z) {
        super(1);
        this.A04 = z;
        this.A00 = ilm;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (!AnonymousClass7TE.A1a(obj)) {
            return null;
        }
        boolean z = this.A04;
        ILM ilm = this.A00;
        if (z) {
            ilm.A02.invoke(new C64512LdE(this.A01, this.A03, this.A02, false));
            return null;
        }
        ilm.A00.CqD(this.A01, ilm.A01.getModuleName(), this.A03, this.A02);
        return null;
    }
}
