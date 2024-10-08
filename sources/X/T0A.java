package X;

public final class T0A implements C635813i {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public T0A(String str, String str2, boolean z, String str3) {
        this.A01 = str;
        this.A03 = z;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        String str;
        1Fc r2 = new 1Fc();
        String str2 = this.A01;
        if (this.A03) {
            str = this.A00;
        } else {
            str = this.A02;
        }
        r2.A05(str2, str);
        return r2;
    }
}
