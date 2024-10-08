package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;

public final class PFY implements C51871G5i {
    public final /* synthetic */ C67058MhZ A00;
    public final /* synthetic */ C66633Ma2 A01;
    public final /* synthetic */ DirectShareTarget A02;
    public final /* synthetic */ DirectThreadKey A03;
    public final /* synthetic */ String A04;

    public PFY(C67058MhZ mhZ, C66633Ma2 ma2, DirectShareTarget directShareTarget, DirectThreadKey directThreadKey, String str) {
        this.A01 = ma2;
        this.A03 = directThreadKey;
        this.A02 = directShareTarget;
        this.A04 = str;
        this.A00 = mhZ;
    }

    public final void D6I() {
        C66633Ma2 ma2 = this.A01;
        DirectThreadKey directThreadKey = this.A03;
        C66633Ma2.A0F(this.A00, ma2, this.A02, directThreadKey, this.A04);
    }
}
