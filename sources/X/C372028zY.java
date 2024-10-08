package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.google.common.collect.ImmutableList;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

/* renamed from: X.8zY  reason: invalid class name and case insensitive filesystem */
public abstract class C372028zY {
    public final List A01() {
        if (!(this instanceof C381019b2)) {
            return ((C372018zX) this).A03;
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) ((C381019b2) this).A01);
        0qQ.A07(copyOf);
        return copyOf;
    }

    public final void A02(WeakReference weakReference) {
        WeakReference weakReference2;
        if (this instanceof C372018zX) {
            C372018zX r2 = (C372018zX) this;
            r2.A02 = weakReference;
            C372038zZ r1 = r2.A00;
            if (r1 != null) {
                HandlerThread handlerThread = r1.A04;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    r1.A04 = null;
                }
                r2.A00 = null;
            }
            if (r2.A01.A06 && (weakReference2 = r2.A02) != null && weakReference2.get() != null) {
                C372038zZ r3 = new C372038zZ(r2);
                r2.A00 = r3;
                WeakReference weakReference3 = r2.A02;
                if (weakReference3.get() != null) {
                    r3.A0C = weakReference3;
                    Context applicationContext = ((View) weakReference3.get()).getContext().getApplicationContext();
                    C372038zZ.A02(r3);
                    C372038zZ.A03(r3);
                    r3.A03 = 1;
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null) {
                        if (r3.A04 == null) {
                            HandlerThread handlerThread2 = new HandlerThread(r3.getClass().getSimpleName());
                            AnonymousClass0fe.A00(handlerThread2);
                            r3.A04 = handlerThread2;
                            handlerThread2.start();
                        }
                        myLooper = r3.A04.getLooper();
                        myLooper.getClass();
                    }
                    Handler handler = new Handler(myLooper);
                    A8p a8p = new A8p(r3);
                    r3.A08 = a8p;
                    r3.A0A = new AH8(applicationContext, handler, a8p);
                    ALp aLp = new ALp(r3);
                    r3.A07 = aLp;
                    ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(applicationContext, aLp, handler);
                    r3.A05 = scaleGestureDetector;
                    scaleGestureDetector.setQuickScaleEnabled(false);
                    C39705A5w a5w = new C39705A5w(r3);
                    r3.A06 = a5w;
                    r3.A09 = new A87(a5w);
                    r3.A02 = 0;
                }
                C372038zZ r12 = r2.A00;
                r12.A0B = r2.A01;
                C372038zZ.A03(r12);
            }
        }
    }

    public boolean A03(MotionEvent motionEvent, int i) {
        return false;
    }
}
