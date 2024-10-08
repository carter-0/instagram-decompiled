package X;

public final /* synthetic */ class AfQ implements C66461MSp {
    public final /* synthetic */ C357068Wi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AfQ(C357068Wi r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void afterSelection(boolean z) {
        C357068Wi r5 = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        if (z) {
            r5.A0A.A1q.A05(true, "upsell");
        }
        C357068Wi.A02(r5, str, str2);
    }
}
