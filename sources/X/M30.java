package X;

public final class M30 implements Runnable {
    public final /* synthetic */ KMS A00;

    public M30(KMS kms) {
        this.A00 = kms;
    }

    public final void run() {
        KMS kms = this.A00;
        C249703kE A0W = kms.A0A.A0W(kms.A00);
        if (A0W == null) {
            return;
        }
        if (!kms.A03) {
            0kD.A07("ClipsStackedTimelineVideoTrackController", "view not attached during reorder drag", (Throwable) null);
        } else if (A0W.itemView != null) {
            kms.A09.A07(A0W);
        }
    }
}
