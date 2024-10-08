package X;

/* renamed from: X.NBs  reason: case insensitive filesystem */
public final class C68356NBs extends AnonymousClass45Y {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ OFG A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68356NBs(OFG ofg, long j, long j2) {
        super("notifyTransferred");
        this.A02 = ofg;
        this.A01 = j;
        this.A00 = j2;
    }

    public final void run() {
        OFG ofg = this.A02;
        ofg.A02.updateDataTaskDownloadProgress(ofg.A03, this.A01, this.A00, ofg.A01);
    }
}
