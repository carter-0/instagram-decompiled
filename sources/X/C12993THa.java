package X;

import java.io.IOException;

/* renamed from: X.THa  reason: case insensitive filesystem */
public final class C12993THa implements Runnable {
    public final /* synthetic */ C13754TgQ A00;
    public final /* synthetic */ IOException A01;

    public C12993THa(C13754TgQ tgQ, IOException iOException) {
        this.A01 = iOException;
        this.A00 = tgQ;
    }

    public final void run() {
        IOException iOException = this.A01;
        0kD.A0G("ClipsGalleryUploadTranscoder", "Could not extract media duration for transcoding", iOException);
        this.A00.DtT(iOException, false);
    }
}
