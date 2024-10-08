package X;

import android.media.MediaMuxer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import java.io.File;
import java.io.IOException;

public final class Q7n extends Handler {
    public final /* synthetic */ SSS A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q7n(Looper looper, SSS sss) {
        super(looper);
        this.A00 = sss;
    }

    public final void handleMessage(Message message) {
        File parentFile;
        Looper looper;
        int i = message.what;
        if (i == 1) {
            Object obj = message.obj;
            if (obj != null) {
                SSS sss = this.A00;
                String str = (String) obj;
                int i2 = message.arg1;
                if (sss.A01 == null) {
                    0KC.A0C("BoomerangEncoder", "attempted to handle video encoding without configuring first");
                    return;
                }
                try {
                    C343967r6 r1 = sss.A06;
                    if (!(r1 == null || r1.B4t(3).isEmpty() || (parentFile = AnonymousClass7TE.A0t(str).getParentFile()) == null)) {
                        parentFile.mkdirs();
                    }
                    MediaMuxer mediaMuxer = new MediaMuxer(str, 0);
                    sss.A02 = mediaMuxer;
                    mediaMuxer.setOrientationHint(i2);
                    0fX.A05(sss.A01, -726206464);
                    sss.A09 = true;
                } catch (IOException e) {
                    SSS.A01(sss, e, "IOException: Cannot create MediaMuxer");
                } catch (IllegalStateException e2) {
                    SSS.A02(sss, e2);
                }
            }
        } else if (i == 2) {
            SSS.A03(this.A00, false);
        } else if (i == 3) {
            SSS.A00(this.A00);
        } else if (i == 4) {
            SSS sss2 = this.A00;
            if (sss2.A09) {
                SSS.A00(sss2);
            }
            if (sss2.A01 != null) {
                C343967r6 r12 = sss2.A06;
                if (r12 == null || !r12.CTO(120)) {
                    0fX.A03(sss2.A01, 483024479);
                } else {
                    C11292SKa.A00(sss2.A01);
                }
                sss2.A01 = null;
            }
            try {
                MediaMuxer mediaMuxer2 = sss2.A02;
                if (mediaMuxer2 != null) {
                    mediaMuxer2.release();
                }
            } catch (IllegalStateException e3) {
                SSS.A01(sss2, e3, "MediaMuxer.release() Error");
            } catch (Throwable th) {
                sss2.A02 = null;
                throw th;
            }
            sss2.A02 = null;
            Surface surface = sss2.A03;
            if (surface != null) {
                surface.release();
                sss2.A03 = null;
            }
            Q7n q7n = sss2.A05;
            if (!(q7n == null || (looper = q7n.getLooper()) == null)) {
                looper.quitSafely();
            }
            C13772Tgl tgl = sss2.A04;
            if (tgl != null) {
                tgl.DC0();
            }
        } else {
            throw AnonymousClass7TE.A15(002.A0O("Unsupported msg what = ", i));
        }
    }
}
