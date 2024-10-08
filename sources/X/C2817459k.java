package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;

/* renamed from: X.59k  reason: invalid class name and case insensitive filesystem */
public final class C2817459k implements AnonymousClass1Cy {
    public C2817559l A00;
    public final AnonymousClass1Cy A01;

    public final AnonymousClass1T9 startRequest(1QS r11, 1QU r12, 1Qe r13) {
        0qQ.A0B(r11, 0);
        0qQ.A0B(r12, 1);
        0qQ.A0B(r13, 2);
        C2817559l r1 = this.A00;
        if (r1 != null) {
            String str = r12.A0D;
            0qQ.A06(str);
            String obj = r11.A09.toString();
            0qQ.A07(obj);
            C2817659m r3 = r1.A00;
            if (r3.A03) {
                Handler handler = r3.A00;
                if (handler == null) {
                    HandlerThread handlerThread = new HandlerThread("DuplicateRequestLogger", 10);
                    AnonymousClass0fe.A00(handlerThread);
                    handlerThread.start();
                    handler = new Handler(handlerThread.getLooper());
                    r3.A00 = handler;
                }
                handler.post(new C2817759n(r3, str, obj, System.currentTimeMillis(), SystemClock.elapsedRealtime()));
            }
        }
        AnonymousClass1T9 startRequest = this.A01.startRequest(r11, r12, r13);
        0qQ.A07(startRequest);
        return startRequest;
    }

    public C2817459k(Context context, AnonymousClass1Cy r4, 0lg r5) {
        C2817559l r0;
        this.A01 = r4;
        if (r5 instanceof UserSession) {
            r0 = (C2817559l) r5.A01(C2817559l.class, new C58185Inp(40, context, r5));
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }
}
