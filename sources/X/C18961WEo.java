package X;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.WEo  reason: case insensitive filesystem */
public final class C18961WEo implements C265614Vl {
    public final C265584Vi A00;
    public final WindowLayoutComponent A01;
    public final Map A02 = new LinkedHashMap();
    public final Map A03 = new LinkedHashMap();
    public final Map A04 = new LinkedHashMap();
    public final ReentrantLock A05 = new ReentrantLock();

    public final void EBh(Context context, 02R r13, Executor executor) {
        0qQ.A0B(context, 0);
        ReentrantLock reentrantLock = this.A05;
        reentrantLock.lock();
        try {
            Map map = this.A03;
            MulticastConsumer multicastConsumer = (MulticastConsumer) map.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.A00(r13);
                this.A04.put(r13, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                map.put(context, multicastConsumer2);
                this.A04.put(r13, context);
                multicastConsumer2.A00(r13);
                if (context instanceof Activity) {
                    C265584Vi r7 = this.A00;
                    WindowLayoutComponent windowLayoutComponent = this.A01;
                    0Yh r5 = new 0Yh(WindowLayoutInfo.class);
                    Activity activity = (Activity) context;
                    C20595WvY wvY = new C20595WvY(multicastConsumer2);
                    0qQ.A0B(activity, 4);
                    TLN tln = new TLN(wvY, r5);
                    ClassLoader classLoader = r7.A00;
                    String A002 = AnonymousClass000.A00(3476);
                    Class<?> loadClass = classLoader.loadClass(A002);
                    0qQ.A07(loadClass);
                    Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{loadClass}, tln);
                    0qQ.A07(newProxyInstance);
                    Class<?> cls = windowLayoutComponent.getClass();
                    Class<?> loadClass2 = classLoader.loadClass(A002);
                    0qQ.A07(loadClass2);
                    cls.getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, loadClass2}).invoke(windowLayoutComponent, new Object[]{activity, newProxyInstance});
                    Class<?> loadClass3 = classLoader.loadClass(A002);
                    0qQ.A07(loadClass3);
                    this.A02.put(multicastConsumer2, new C18957WEk(windowLayoutComponent, newProxyInstance, cls.getMethod("removeWindowLayoutInfoListener", new Class[]{loadClass3})));
                } else {
                    multicastConsumer2.accept(new WindowLayoutInfo(0sn.A00));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FIw(X.02R r8) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.util.concurrent.locks.ReentrantLock r4 = r7.A05
            r4.lock()
            java.util.Map r6 = r7.A04     // Catch:{ all -> 0x0059 }
            java.lang.Object r5 = r6.get(r8)     // Catch:{ all -> 0x0059 }
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ all -> 0x0059 }
            if (r5 == 0) goto L_0x0055
            java.util.Map r3 = r7.A03     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x0059 }
            androidx.window.layout.adapter.extensions.MulticastConsumer r2 = (androidx.window.layout.adapter.extensions.MulticastConsumer) r2     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0055
            java.util.concurrent.locks.ReentrantLock r1 = r2.A02     // Catch:{ all -> 0x0059 }
            r1.lock()     // Catch:{ all -> 0x0059 }
            java.util.Set r0 = r2.A01     // Catch:{ all -> 0x0050 }
            r0.remove(r8)     // Catch:{ all -> 0x0050 }
            r1.unlock()     // Catch:{ all -> 0x0059 }
            r6.remove(r8)     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0055
            r3.remove(r5)     // Catch:{ all -> 0x0059 }
            java.util.Map r0 = r7.A02     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r0.remove(r2)     // Catch:{ all -> 0x0059 }
            X.X0H r0 = (X.X0H) r0     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0055
            X.WEk r0 = (X.C18957WEk) r0     // Catch:{ all -> 0x0059 }
            java.lang.reflect.Method r2 = r0.A02     // Catch:{ all -> 0x0059 }
            java.lang.Object r1 = r0.A01     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0059 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0059 }
            r2.invoke(r1, r0)     // Catch:{ all -> 0x0059 }
            goto L_0x0055
        L_0x0050:
            r0 = move-exception
            r1.unlock()     // Catch:{ all -> 0x0059 }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0055:
            r4.unlock()
            return
        L_0x0059:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18961WEo.FIw(X.02R):void");
    }

    public C18961WEo(C265584Vi r2, WindowLayoutComponent windowLayoutComponent) {
        this.A01 = windowLayoutComponent;
        this.A00 = r2;
    }
}
