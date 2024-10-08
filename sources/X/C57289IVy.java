package X;

/* renamed from: X.IVy  reason: case insensitive filesystem */
public final class C57289IVy implements DQq {
    public final /* synthetic */ 1FI A00;
    public final /* synthetic */ AnonymousClass3B0 A01;
    public final /* synthetic */ AnonymousClass3GH A02;
    public final /* synthetic */ boolean A03;

    public C57289IVy(1FI r1, AnonymousClass3B0 r2, AnonymousClass3GH r3, boolean z) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = z;
    }

    public final void DoQ(CFN cfn) {
        if (cfn.A00) {
            AnonymousClass3GH r2 = this.A02;
            boolean A032 = AnonymousClass3GH.A03(this.A00, this.A01, r2);
            if (!this.A03) {
                r2.A0A.A06(A032);
            }
        }
    }

    public final void onFail(C268654dm r3) {
        if (!this.A03) {
            this.A02.A0A.A06(false);
        }
    }
}
