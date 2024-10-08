package X;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReference;

public final class TLG implements Thread.UncaughtExceptionHandler {
    public final AtomicReference A00;

    public final void uncaughtException(Thread thread, Throwable th) {
        0qQ.A0B(th, 1);
        STN stn = (STN) this.A00.get();
        if (stn != null) {
            C13587TdF tdF = stn.A0H.A0D;
            Exception exc = new Exception(th);
            if (tdF != null) {
                tdF.Chx(exc, "videolite-video-upload", "UncaughtException in MediaUploader");
            }
            STN.A05(stn, new Exception(th));
        }
    }

    public TLG(STN stn) {
        this.A00 = new AtomicReference(stn);
    }
}
