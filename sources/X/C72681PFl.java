package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.PFl  reason: case insensitive filesystem */
public final /* synthetic */ class C72681PFl implements C74349PtP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C74516PwB A01;
    public final /* synthetic */ C71153OeR A02;
    public final /* synthetic */ C254743sy A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C72681PFl(C74516PwB pwB, C71153OeR oeR, C254743sy r3, int i, boolean z) {
        this.A02 = oeR;
        this.A03 = r3;
        this.A01 = pwB;
        this.A00 = i;
        this.A04 = z;
    }

    public final void DVV(Integer num) {
        C71153OeR oeR = this.A02;
        C254743sy r5 = this.A03;
        C74516PwB pwB = this.A01;
        int i = this.A00;
        boolean z = this.A04;
        int intValue = num.intValue();
        if (intValue == 0) {
            oeR.A0k(r5);
        } else if (intValue == 2) {
            C71153OeR.A0E(pwB, oeR, r5, i, z);
        } else if (intValue == 1 && (r5 instanceof DirectThreadKey)) {
            C71097OcX.A01(oeR.A0Y, oeR.A0h, C66647MaG.A03(r5));
        }
    }
}
