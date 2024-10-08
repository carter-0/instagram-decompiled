package X;

import com.google.common.collect.ImmutableList;

public final class PFD implements C74419PuZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImmutableList A02;
    public final /* synthetic */ C71153OeR A03;

    public PFD(ImmutableList immutableList, C71153OeR oeR, int i, int i2) {
        this.A03 = oeR;
        this.A02 = immutableList;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void D0U() {
        C71153OeR.A0N(this.A03, "direct_request_allow_folder_dialog_cancel", "swipe", (String) null, this.A02, this.A00);
    }

    public final void DVU(N4G n4g) {
        C71153OeR.A09(n4g, this.A03, this.A02, this.A01);
    }
}
