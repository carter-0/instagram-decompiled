package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

public abstract class LPE {
    public int A00;
    public int A01;
    public MTC A02;
    public String A03;
    public boolean A04;
    public final Context A05;
    public final C340307l3 A06;
    public final UserSession A07;
    public final C64112LOa A08;
    public final W1D A09;
    public final HandlerThread A0A;

    public static void A0B(BroadcastFailureType broadcastFailureType, C62423KfY kfY, String str, String str2, Throwable th) {
        C62423KfY.A02(new K0L(str, str2, th), broadcastFailureType, kfY);
    }

    public void A0C() {
        this.A0A.quitSafely();
    }

    public final void A0D() {
        if (this instanceof C62422KfX) {
            C62422KfX kfX = (C62422KfX) this;
            C21478XcN xcN = kfX.A05;
            if (xcN != null) {
                xcN.A01();
                kfX.A05 = null;
                return;
            }
            return;
        }
        C62423KfY kfY = (C62423KfY) this;
        C21478XcN xcN2 = kfY.A0A;
        if (xcN2 != null) {
            xcN2.A01();
            kfY.A0A = null;
        }
    }

    public final void A0E(int i) {
        C17992VjU A002;
        if (this instanceof C62422KfX) {
            A002 = (C17992VjU) C63486Kxq.A00(this.A07, C313666go.GUEST).A07.getValue();
        } else {
            A002 = LKG.A00(this.A07);
        }
        A002.A01((Pair) null, (Pair) null, Integer.valueOf(i));
    }

    public final void A0F(long j) {
        LSQ lsq;
        if (this instanceof C62422KfX) {
            lsq = ((C62422KfX) this).A08;
        } else {
            lsq = ((C62423KfY) this).A0G;
        }
        if (lsq != null) {
            lsq.A0I.A00(j);
        }
    }

    public final void A0G(SurfaceTexture surfaceTexture) {
        Integer num;
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        if (this instanceof C62423KfY) {
            C62423KfY kfY = (C62423KfY) this;
            0qQ.A0B(surfaceTexture, 0);
            kfY.A08 = surfaceTexture;
            if (kfY.A0U || kfY.A0T) {
                W1D w1d = kfY.A09;
                w1d.A09.obtainMessage(2, kfY.A03, kfY.A02, (Object) null).sendToTarget();
            } else {
                kfY.A08.A02(surfaceTexture2, new C61517KAw(kfY, 4), kfY.A03, kfY.A02, 1Au.A00(kfY.A07).A1u());
            }
            C62423KfY.A0A(kfY, AnonymousClass05K.A02);
            return;
        }
        C62422KfX kfX = (C62422KfX) this;
        0qQ.A0B(surfaceTexture, 0);
        kfX.A08.A02(surfaceTexture2, new C61517KAw(kfX, 7), kfX.A01, kfX.A00, kfX.A0H);
        if (kfX.A0C) {
            num = AnonymousClass05K.A02;
        } else {
            kfX.A0C = true;
            11Z.A02(new M5M(kfX));
            num = AnonymousClass05K.A01;
        }
        if (kfX.A0E) {
            kfX.A0K.A0A("broadcast resumed", LKE.A01(num));
            kfX.A0E = false;
            C61517KAw kAw = new C61517KAw(kfX, 8);
            C66537MVr mVr = kfX.A07;
            if (mVr != null) {
                mVr.Eww(new C61515KAu(5, kAw, kfX));
            } else {
                kAw.A03(AnonymousClass7TE.A0z("mCurrentStreamingSession == NULL"));
            }
        }
    }

    public final void A0H(C21028XAh xAh) {
        C66537MVr mVr;
        if (!(this instanceof C62422KfX) && (mVr = ((C62423KfY) this).A0F) != null) {
            mVr.Cr5(xAh);
        }
    }

    public LPE(Context context, C340307l3 r6, AnonymousClass82X r7, UserSession userSession) {
        this.A07 = userSession;
        this.A06 = r6;
        this.A05 = DbT.A05(context);
        C64112LOa lOa = new C64112LOa(r6);
        this.A08 = lOa;
        HandlerThread handlerThread = new HandlerThread("Live Streaming HandlerThread");
        AnonymousClass0fe.A00(handlerThread);
        this.A0A = handlerThread;
        handlerThread.start();
        lOa.A02 = 720;
        if (!this.A04) {
            this.A08.A06 = r7;
            this.A04 = true;
        }
        Looper looper = handlerThread.getLooper();
        0qQ.A07(looper);
        W1D w1d = new W1D(looper, r6, r7);
        this.A09 = w1d;
        w1d.A04 = this;
        lOa.A00 = 720;
    }
}
