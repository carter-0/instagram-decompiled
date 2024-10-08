package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.2nS  reason: invalid class name and case insensitive filesystem */
public final class C229472nS {
    public static C229472nS A04;
    public static final Runnable A05 = new C229482nT();
    public Choreographer A00 = Choreographer.getInstance();
    public Method A01;
    public boolean A02;
    public Handler A03;

    public final void A00(Runnable runnable) {
        Choreographer choreographer;
        if (!this.A02) {
            Handler handler = this.A03;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                this.A03 = handler;
            }
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, runnable));
            return;
        }
        Method method = this.A01;
        if (method != null && (choreographer = this.A00) != null) {
            try {
                method.invoke(choreographer, new Object[]{3, runnable, null});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C229472nS() {
        /*
            r6 = this;
            r6.<init>()
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r6.A00 = r0
            java.lang.Class<android.view.Choreographer> r4 = android.view.Choreographer.class
            java.lang.String r3 = "postCallback"
            r5 = 3
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{  }
            java.lang.Class<java.lang.Runnable> r1 = java.lang.Runnable.class
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r1, r0}     // Catch:{  }
            java.lang.reflect.Method r4 = r4.getMethod(r3, r0)     // Catch:{  }
            r6.A01 = r4     // Catch:{  }
            java.lang.Runnable r3 = A05
            if (r4 == 0) goto L_0x0033
            android.view.Choreographer r2 = r6.A00
            if (r2 == 0) goto L_0x0033
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ NoSuchMethodException -> 0x0033 }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r3, r0}     // Catch:{ NoSuchMethodException -> 0x0033 }
            r4.invoke(r2, r0)     // Catch:{ NoSuchMethodException -> 0x0033 }
            goto L_0x0035
        L_0x0033:
            r0 = 0
            goto L_0x0036
        L_0x0035:
            r0 = 1
        L_0x0036:
            r6.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229472nS.<init>():void");
    }
}
