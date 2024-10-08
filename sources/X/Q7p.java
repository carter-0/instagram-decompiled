package X;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import java.io.IOException;

public final class Q7p extends Handler {
    public final /* synthetic */ SSN A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q7p(Looper looper, SSN ssn) {
        super(looper);
        this.A00 = ssn;
    }

    public final void handleMessage(Message message) {
        Looper looper;
        int i = message.what;
        if (i == 1) {
            SSN ssn = this.A00;
            String str = (String) message.obj;
            int i2 = message.arg1;
            if (ssn.A01 == null) {
                0kD.A01("BoomerangEncoder", "attempted to handle video recording without configuring first");
                return;
            }
            try {
                MediaMuxer mediaMuxer = new MediaMuxer(str, 0);
                ssn.A02 = mediaMuxer;
                mediaMuxer.setOrientationHint(i2);
                0fX.A05(ssn.A01, -859442207);
                ssn.A09 = true;
            } catch (IOException e) {
                SSN.A01(ssn, e, "IOException: Cannot create MediaMuxer");
            } catch (IllegalStateException e2) {
                SSN.A02(ssn, e2);
            }
        } else if (i == 2) {
            SSN.A03(this.A00, false);
        } else if (i == 3) {
            SSN.A00(this.A00);
        } else if (i == 4) {
            SSN ssn2 = this.A00;
            if (ssn2.A09) {
                SSN.A00(ssn2);
            }
            if (ssn2.A01 != null) {
                boolean A06 = 182.A06(0Tu.A05, ssn2.A08, 36316671497409108L);
                MediaCodec mediaCodec = ssn2.A01;
                if (A06) {
                    C11292SKa.A00(mediaCodec);
                } else {
                    0fX.A03(mediaCodec, 122333883);
                }
                ssn2.A01 = null;
            }
            try {
                MediaMuxer mediaMuxer2 = ssn2.A02;
                if (mediaMuxer2 != null) {
                    mediaMuxer2.release();
                }
            } catch (IllegalStateException e3) {
                SSN.A01(ssn2, e3, "MediaMuxer.release() Error");
            } catch (Throwable th) {
                ssn2.A02 = null;
                throw th;
            }
            ssn2.A02 = null;
            Surface surface = ssn2.A03;
            if (surface != null) {
                surface.release();
                ssn2.A03 = null;
            }
            Q7p q7p = ssn2.A05;
            if (q7p != null && (looper = q7p.getLooper()) != null) {
                looper.quitSafely();
            }
        } else {
            throw AnonymousClass7TE.A15(002.A0O("Unsupported msg what = ", i));
        }
    }
}
