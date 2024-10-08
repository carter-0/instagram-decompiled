package X;

import android.media.MediaCodec;
import android.os.Handler;
import com.facebook.proxygen.TraceFieldType;

public final /* synthetic */ class Y3E implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C341687nM A01;
    public final /* synthetic */ C22254XyC A02;

    public /* synthetic */ Y3E(Handler handler, C341687nM r2, C22254XyC xyC) {
        this.A02 = xyC;
        this.A01 = r2;
        this.A00 = handler;
    }

    public final void run() {
        C391719tX r2;
        String str;
        C22254XyC xyC = this.A02;
        C341687nM r5 = this.A01;
        Handler handler = this.A00;
        synchronized (xyC) {
            StringBuilder sb = xyC.A07;
            sb.append("asyncStart, ");
            if (xyC.A0D != AnonymousClass05K.A00) {
                Integer num = xyC.A0D;
                if (num != null) {
                    str = XVF.A00(num);
                } else {
                    str = "null";
                }
                r2 = new C391719tX(23001, 002.A0R("prepare() must be called before starting video encoding. Current state is: ", str));
                r2.A00(TraceFieldType.CurrentState, XVF.A00(xyC.A0D));
                r2.A00("method_invocation", sb.toString());
            } else {
                try {
                    MediaCodec mediaCodec = xyC.A00;
                    mediaCodec.getClass();
                    0fX.A05(mediaCodec, 1983915391);
                    xyC.A0D = AnonymousClass05K.A01;
                    sb.append("asyncStart end, ");
                    C18097VlR.A01(r5, handler);
                } catch (Exception e) {
                    r2 = new C391719tX(23001, (Throwable) e);
                    C22254XyC.A03(r2, xyC, e);
                }
            }
            C18097VlR.A00(handler, r2, r5);
        }
        return;
    }
}
