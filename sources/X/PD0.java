package X;

import com.instagram.model.direct.DirectThreadKey;

public final class PD0 implements C74338PtE {
    public final /* synthetic */ C254703su A00;
    public final /* synthetic */ C333537Zi A01;
    public final /* synthetic */ DirectThreadKey A02;

    public PD0(C254703su r1, C333537Zi r2, DirectThreadKey directThreadKey) {
        this.A01 = r2;
        this.A02 = directThreadKey;
        this.A00 = r1;
    }

    public final void D57(boolean z) {
        if (!z) {
            C333537Zi.A06(this.A00, this.A01, C70376O4d.A00, this.A02, "DirectSendMessageManager_retry_mutation_not_found");
        }
    }
}
