package X;

import android.app.Activity;
import android.os.Build;
import android.view.Display;
import android.view.Window;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Jk  reason: invalid class name and case insensitive filesystem */
public final class C240053Jk {
    public static WeakReference A00 = new WeakReference((Object) null);
    public static boolean A01;
    public static boolean A02;
    public static final C240053Jk A03 = new Object();
    public static final WeakHashMap A04 = new WeakHashMap();
    public static final ConcurrentLinkedQueue A05 = new ConcurrentLinkedQueue();
    public static final AtomicInteger A06 = new AtomicInteger(0);
    public static final boolean A07 = 0yU.A07(AnonymousClass0yP.A00(36321494745949634L));

    public final void A02(Activity activity, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        A00 = new WeakReference(activity);
        0Tu r3 = 0Tu.A05;
        if (!182.A06(r3, userSession, 36321494745884097L) || !((Boolean) SGY.A01.getValue()).booleanValue()) {
            AtomicInteger atomicInteger = A06;
            if (atomicInteger.get() > 0 && atomicInteger.decrementAndGet() == 0) {
                A02 = false;
                if (182.A06(r3, userSession, 36321494745687487L)) {
                    A00((Activity) A00.get(), false);
                }
            }
        }
    }

    public final void A03(Activity activity, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        A00 = new WeakReference(activity);
        0Tu r3 = 0Tu.A05;
        if ((!182.A06(r3, userSession, 36321494745884097L) || !((Boolean) SGY.A01.getValue()).booleanValue()) && A06.incrementAndGet() == 1) {
            A02 = true;
            if (182.A06(r3, userSession, 36321494745687487L)) {
                A00((Activity) A00.get(), true);
            }
        }
    }

    public static final void A00(Activity activity, boolean z) {
        if (A01 != z && Build.VERSION.SDK_INT >= 34 && activity != null && activity.getWindow() != null) {
            int i = 0;
            Display display = activity.getDisplay();
            if (display != null && display.isHdrSdrRatioAvailable()) {
                0KC.A0C("FragmentHdrModeSwitch", 002.A1D("change HDR mode: ", z));
                A01 = z;
                Boolean valueOf = Boolean.valueOf(z);
                ConcurrentLinkedQueue concurrentLinkedQueue = A05;
                concurrentLinkedQueue.add(valueOf);
                if (concurrentLinkedQueue.size() > 3) {
                    concurrentLinkedQueue.poll();
                }
                Window window = activity.getWindow();
                if (window != null) {
                    if (z) {
                        i = 2;
                    }
                    window.setColorMode(i);
                }
            }
        }
    }

    public static final boolean A01() {
        if (A01) {
            return true;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = A05;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                Boolean bool = (Boolean) it.next();
                0qQ.A0A(bool);
                if (bool.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if ((!r2.isEmpty()) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(android.graphics.Bitmap r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0045
            boolean r0 = A02
            if (r0 == 0) goto L_0x0045
            boolean r0 = A07
            if (r0 == 0) goto L_0x0045
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L_0x0023
            boolean r0 = r4.hasGainmap()
            if (r0 == 0) goto L_0x0023
            java.util.WeakHashMap r1 = A04
            int r0 = r4.getWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r4, r0)
        L_0x0023:
            boolean r0 = A01
            java.lang.String r1 = "FragmentHdrModeSwitch"
            java.util.WeakHashMap r2 = A04
            if (r0 == 0) goto L_0x0046
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "no hdr images, turn off HDR"
            X.0KC.A0C(r1, r0)
            r1 = 0
        L_0x0037:
            java.lang.ref.WeakReference r0 = A00
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            A00(r0, r1)
        L_0x0042:
            r2.size()
        L_0x0045:
            return
        L_0x0046:
            boolean r0 = r2.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0042
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C240053Jk.A04(android.graphics.Bitmap):void");
    }
}
