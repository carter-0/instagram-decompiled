package X;

import com.facebook.mediastreaming.opt.source.video.AndroidExternalVideoSource;
import java.lang.Thread;

public final class TLI implements Thread.UncaughtExceptionHandler {
    public final int A00;
    public final Object A01;

    public TLI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        switch (this.A00) {
            case 0:
                String str = "Failed to handle frame";
                AndroidExternalVideoSource androidExternalVideoSource = ((C12136Sng) this.A01).A06.A00;
                if (str.length() == 0) {
                    str = "";
                }
                androidExternalVideoSource.fireError(C16591Uxl.VideoSourceError, str, th);
                return;
            case 1:
                STM.A03((STM) this.A01, th);
                return;
            default:
                C12356Ss2.A0D((C12356Ss2) this.A01, th);
                return;
        }
    }
}
