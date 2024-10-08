package X;

/* renamed from: X.TKe  reason: case insensitive filesystem */
public final class C13074TKe implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass46Z A01;
    public final /* synthetic */ C2605346a A02;
    public final /* synthetic */ 26B A03;
    public final /* synthetic */ C13775Tgq A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ byte[] A06;

    public C13074TKe(AnonymousClass46Z r1, C2605346a r2, 26B r3, C13775Tgq tgq, String str, byte[] bArr, int i) {
        this.A03 = r3;
        this.A05 = str;
        this.A06 = bArr;
        this.A02 = r2;
        this.A01 = r1;
        this.A04 = tgq;
        this.A00 = i;
    }

    public final void run() {
        C2602244t r2 = this.A03.A04;
        String str = this.A05;
        byte[] bArr = this.A06;
        int A002 = r2.A00(new C12144Snp(this.A04, this.A00), this.A02, str, (String) null, bArr);
        AnonymousClass46Z r0 = this.A01;
        if (A002 == -1) {
            if (r0 != null) {
                r0.onFailure();
            }
        } else if (r0 != null) {
            r0.onSuccess();
        }
    }
}
