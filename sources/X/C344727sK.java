package X;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;

/* renamed from: X.7sK  reason: invalid class name and case insensitive filesystem */
public final class C344727sK implements Handler.Callback {
    public final C344697sH A00;
    public final ConditionVariable A01 = new ConditionVariable();
    public final Handler A02;
    public final C344647sC A03;

    public static void A00(C344727sK r4, Long l) {
        IllegalStateException th;
        try {
            C349257zq.A03("MediaGraphRendererSession.render");
            C344647sC r3 = r4.A03;
            if (r3.A01.getLooper() == Looper.myLooper()) {
                if (!r3.A04.A06()) {
                    r3.A03.A00(C368978td.MEDIA_GRAPH_HOST_SKIP_RENDER_CONTEXT_DETACHED);
                    r3.A05.DQL(r3);
                } else {
                    C344637sB r2 = r3.A05;
                    r2.DQN(r3, l);
                    try {
                        C349257zq.A03("MediaGraphHost.mMediaGraph.render()");
                        C344737sL r1 = r3.A00;
                        r1.getClass();
                        r1.EEx(r4.A00, l);
                        C349257zq.A01();
                        C349257zq.A03("MediaGraphHost.mMediaGraph.render().listeners()");
                        r2.DQK(r3, l);
                    } catch (Exception e) {
                        r2.DQJ(r3, e);
                    } catch (Throwable th2) {
                        th = th2;
                        C349257zq.A01();
                    }
                    C349257zq.A01();
                }
                return;
            }
            r3.A03.A00(C368978td.MEDIA_GRAPH_HOST_SKIP_RENDER_WRONG_THREAD);
            th = new IllegalStateException("render() can be only called if you already are in the render thread");
            throw th;
        } finally {
            C349257zq.A01();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.7v4, java.lang.Object] */
    public final void A01(int i, int i2, int i3, boolean z, int i4, int i5) {
        C344647sC r2 = this.A03;
        SparseArray sparseArray = r2.A02;
        ? obj = new Object();
        int i6 = i2;
        obj.A01 = i2;
        int i7 = i3;
        obj.A00 = i3;
        int i8 = i4;
        obj.A03 = i4;
        int i9 = i5;
        obj.A02 = i9;
        boolean z2 = z;
        obj.A04 = z;
        int i10 = i;
        sparseArray.put(i, obj);
        C344737sL r3 = r2.A00;
        if (r3 != null) {
            try {
                r3.FLA(i10, i6, i7, z2, i8, i9);
            } catch (Exception e) {
                r2.A05.DQJ(r2, e);
            }
        }
    }

    public final void A02(Long l, boolean z) {
        Message obtain;
        C344647sC r1 = this.A03;
        r1.A05.DQM(r1, l);
        Handler handler = this.A02;
        if (l != null) {
            obtain = Message.obtain(handler, 1, l);
        } else {
            obtain = Message.obtain(handler, 1);
        }
        obtain.getClass();
        if (z) {
            handler.removeMessages(1);
        }
        handler.sendMessage(obtain);
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            A00(this, (Long) message.obj);
        }
        return true;
    }

    public C344727sK(C344697sH r3, C344647sC r4) {
        this.A03 = r4;
        this.A00 = r3;
        this.A02 = new Handler(((C344687sG) r3).A05.A00.getLooper(), this);
    }
}
