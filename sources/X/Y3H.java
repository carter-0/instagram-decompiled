package X;

import android.media.MediaCodec;
import android.os.Handler;
import com.facebook.proxygen.TraceFieldType;

public final /* synthetic */ class Y3H implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C341687nM A01;
    public final /* synthetic */ C22253XyB A02;

    public /* synthetic */ Y3H(Handler handler, C341687nM r2, C22253XyB xyB) {
        this.A02 = xyB;
        this.A01 = r2;
        this.A00 = handler;
    }

    public final void run() {
        C391719tX r6;
        String str;
        C22253XyB xyB = this.A02;
        C341687nM r4 = this.A01;
        Handler handler = this.A00;
        synchronized (xyB) {
            StringBuilder sb = xyB.A06;
            sb.append("asyncStart, ");
            if (xyB.A0B != AnonymousClass05K.A00) {
                Integer num = xyB.A0B;
                if (num != null) {
                    str = XVF.A00(num);
                } else {
                    str = "null";
                }
                r6 = new C391719tX(23001, 002.A0R("prepare() must be called before starting video encoding. Current state is: ", str));
                r6.A00(TraceFieldType.CurrentState, XVF.A00(xyB.A0B));
                r6.A00("method_invocation", sb.toString());
            } else {
                try {
                    MediaCodec mediaCodec = xyB.A00;
                    mediaCodec.getClass();
                    0fX.A05(mediaCodec, -1968880236);
                    xyB.A0B = AnonymousClass05K.A01;
                    xyB.A03 = false;
                    xyB.A05.post(new C22380Y1j(xyB));
                    sb.append("asyncStart end, ");
                    C18097VlR.A01(r4, handler);
                } catch (Exception e) {
                    r6 = new C391719tX(23001, (Throwable) e);
                    C22253XyB.A02(r6, xyB, e);
                }
            }
            C18097VlR.A00(handler, r6, r4);
        }
        return;
    }
}
