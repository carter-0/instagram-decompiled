package X;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4mN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C273344mN implements Runnable {
    public final /* synthetic */ C273264mF A00;

    public /* synthetic */ C273344mN(C273264mF r1) {
        this.A00 = r1;
    }

    public final void run() {
        C273264mF r7 = this.A00;
        Process.setThreadPriority(0);
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.clear();
            synchronized (r7.A03) {
                arrayList.addAll(r7.A04);
                for (C273284mH remove : r7.A05) {
                    arrayList.remove(remove);
                }
            }
            if (!Debug.isDebuggerConnected()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C273294mI) it.next()).CoZ();
                }
            }
            long j = 30000;
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                try {
                    Thread.sleep(j);
                } catch (InterruptedException unused) {
                }
                j -= SystemClock.uptimeMillis() - uptimeMillis;
            } while (j > 0);
            boolean z = true;
            if (!Debug.isDebuggerConnected()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    z &= ((C273284mH) it2.next()).AH4();
                }
            }
            long j2 = 30000;
            long uptimeMillis2 = SystemClock.uptimeMillis();
            do {
                try {
                    Thread.sleep(j2);
                } catch (InterruptedException unused2) {
                }
                j2 -= SystemClock.uptimeMillis() - uptimeMillis2;
            } while (j2 > 0);
            if (!z && !Debug.isDebuggerConnected()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((C273284mH) it3.next()).EFw();
                }
            }
        }
    }
}
