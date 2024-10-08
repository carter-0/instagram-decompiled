package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.instagram.arlink.fragment.YUVImageData;
import com.instagram.common.session.UserSession;
import java.nio.ByteBuffer;

public final class LP6 {
    public int A00;
    public int A01;
    public Handler A02;
    public HandlerThread A03;
    public final Handler A04 = AnonymousClass7TF.A0D();
    public final C11455SVt A05 = new C11455SVt(this);
    public final SSE A06;
    public final AnonymousClass84F A07;
    public final AnonymousClass4DH A08;
    public final UserSession A09;
    public volatile boolean A0A;
    public volatile boolean A0B;

    public static final boolean A00(AnonymousClass34S r5, LP6 lp6, boolean z) {
        Handler handler;
        Runnable m8p;
        Runnable m5q;
        if (r5 == null) {
            return false;
        }
        Object obj = r5.A00;
        if (obj != null) {
            int ordinal = ((REY) obj).ordinal();
            if (ordinal != 1) {
                if (ordinal == 0) {
                    handler = lp6.A04;
                    m5q = new C65953M5q(r5, lp6);
                } else if (ordinal == 2 || ordinal == 4) {
                    handler = lp6.A04;
                    m5q = new C65954M5r(r5, lp6);
                } else if (ordinal != 3) {
                    return false;
                } else {
                    handler = lp6.A04;
                    m5q = new C65955M5s(r5, lp6);
                }
                m8p = m5q;
            } else {
                Object obj2 = r5.A01;
                if (obj2 != null) {
                    handler = lp6.A04;
                    m8p = new M8P(lp6, (String) obj2, z);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            handler.post(m8p);
            return true;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void A04(byte[] bArr) {
        0qQ.A0B(bArr, 0);
        Handler handler = this.A02;
        if (handler != null) {
            handler.removeMessages(1);
            0tS A0h = DbT.A0h();
            if (AnonymousClass7TG.A1a(A0h, A0h.A2p, 0tS.A4G, 113) || (!this.A0A && !this.A0B)) {
                Message obtainMessage = handler.obtainMessage(1, ByteBuffer.wrap(bArr));
                0qQ.A07(obtainMessage);
                handler.sendMessage(obtainMessage);
            }
        }
    }

    public final void A01() {
        Handler handler;
        if (this.A03 != null && (handler = this.A02) != null) {
            handler.removeCallbacksAndMessages((Object) null);
            HandlerThread handlerThread = this.A03;
            0qQ.A0A(handlerThread);
            handlerThread.quitSafely();
            this.A02 = null;
            this.A03 = null;
        }
    }

    public final void A02() {
        if (this.A03 == null) {
            synchronized (this) {
                if (this.A03 == null) {
                    HandlerThread handlerThread = new HandlerThread("ArLinkScanController.FrameHandlerThread", 9);
                    AnonymousClass0fe.A00(handlerThread);
                    this.A03 = handlerThread;
                    handlerThread.start();
                    HandlerThread handlerThread2 = this.A03;
                    0qQ.A0A(handlerThread2);
                    Looper looper = handlerThread2.getLooper();
                    if (looper != null) {
                        this.A02 = new Handler(looper, this.A05);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
        }
    }

    public final void A03(C363848kR r7) {
        Handler handler = this.A02;
        if (handler != null) {
            handler.removeMessages(2);
            0tS A0h = DbT.A0h();
            if (AnonymousClass7TG.A1a(A0h, A0h.A2p, 0tS.A4G, 113) || (!this.A0A && !this.A0B)) {
                Message obtainMessage = handler.obtainMessage(2);
                0qQ.A07(obtainMessage);
                obtainMessage.setData(new YUVImageData(r7).A03);
                handler.sendMessage(obtainMessage);
            }
        }
    }

    public LP6(AnonymousClass84F r3, AnonymousClass4DH r4, UserSession userSession) {
        AnonymousClass7TG.A1O(r4, userSession);
        C63058Kqn.A00(userSession);
        this.A08 = r4;
        this.A09 = userSession;
        this.A07 = r3;
        this.A06 = new SSE(r4.requireContext(), userSession);
        r4.getModuleName();
    }
}
