package X;

public final class THY implements Runnable {
    public final /* synthetic */ C13754TgQ A00;
    public final /* synthetic */ Exception A01;

    public THY(C13754TgQ tgQ, Exception exc) {
        this.A01 = exc;
        this.A00 = tgQ;
    }

    public final void run() {
        Exception exc = this.A01;
        0kD.A0G("ClipsGalleryUploadTranscoder", "Could not transcode, media metadata is probably corrupt", exc);
        if (exc != null) {
            this.A00.DtT(exc, true);
        }
    }
}
