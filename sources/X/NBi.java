package X;

public final class NBi extends AnonymousClass45Y {
    public final /* synthetic */ C296065pO A00;
    public final /* synthetic */ C300195wh A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NBi(C296065pO r2, C300195wh r3) {
        super("StreamingUploadDataTask_initial_ask_for_data");
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void run() {
        C296065pO r0 = this.A00;
        r0.A03.canHandleStreamingUploadUpdate(r0.A02.mTaskIdentifier);
    }
}
