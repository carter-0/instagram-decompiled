package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.util.Util;

public final class W6C implements Handler.Callback, C296395pz {
    public final Handler A00;
    public final /* synthetic */ AnonymousClass5O2 A01;

    public W6C(C251403n3 r3, AnonymousClass5O2 r4) {
        this.A01 = r4;
        Looper myLooper = Looper.myLooper();
        C256703wD.A01(myLooper);
        Handler handler = new Handler(myLooper, this);
        this.A00 = handler;
        r3.setOnFrameRenderedListener(this, handler);
    }

    private void A00(long j) {
        AnonymousClass5O2 r3 = this.A01;
        if (this == r3.A0C && r3.A0H != null) {
            if (j == Long.MAX_VALUE) {
                r3.A0a = true;
                return;
            }
            try {
                r3.A0u(j);
            } catch (C2612348u e) {
                r3.A0A = e;
            }
        }
    }

    public final void DGx(C251403n3 r7, long j, long j2) {
        if (Util.A00 < 30) {
            Handler handler = this.A00;
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
            return;
        }
        A00(j);
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        A00((((long) message.arg2) & 4294967295L) | ((((long) i) & 4294967295L) << 32));
        return true;
    }
}
