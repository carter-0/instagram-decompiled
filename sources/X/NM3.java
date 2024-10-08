package X;

public final class NM3 extends 1P0 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C68369NCw A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public NM3(C68369NCw nCw, long j, boolean z, boolean z2) {
        this.A01 = nCw;
        this.A00 = j;
        this.A03 = z;
        this.A02 = z2;
    }

    public final void onFail(C268654dm r4) {
        int A032 = AnonymousClass0fD.A03(52691871);
        0KC.A0D("IgDevXAgentAppProxy", "Failed to fetch user for peer ID provided. Cannot start call from DevXAgent.");
        AnonymousClass0fD.A0A(-986322478, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-34741602);
        int A033 = AnonymousClass0fD.A03(741590910);
        this.A01.A00(this.A00, this.A03, this.A02);
        AnonymousClass0fD.A0A(-1101560984, A033);
        AnonymousClass0fD.A0A(98961794, A032);
    }
}
