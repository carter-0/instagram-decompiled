package X;

import android.os.SystemClock;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Wpv  reason: case insensitive filesystem */
public final class C20356Wpv implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C18592Vuj A05;
    public final /* synthetic */ ArrayDeque A06;
    public final /* synthetic */ ArrayList A07;
    public final /* synthetic */ ArrayList A08;

    public C20356Wpv(C18592Vuj vuj, ArrayDeque arrayDeque, ArrayList arrayList, ArrayList arrayList2, int i, long j, long j2, long j3, long j4) {
        this.A05 = vuj;
        this.A00 = i;
        this.A08 = arrayList;
        this.A06 = arrayDeque;
        this.A07 = arrayList2;
        this.A01 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A04 = j4;
    }

    public final void run() {
        RuntimeException th;
        String str;
        0et A002 = SystraceMessage.A00(SystraceMessage.A00, "DispatchUI", 8192);
        A002.A01("BatchId", this.A00);
        A002.A02();
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            ArrayList arrayList = this.A08;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    X7X x7x = (X7X) it.next();
                    try {
                        x7x.ATR();
                    } catch (C20556WuW e) {
                        if (x7x.Bo3() == 0) {
                            x7x.CM7();
                            this.A05.A0G.add(x7x);
                        } else {
                            str = "UIViewOperationQueue";
                            th = new RuntimeException(e);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str = "UIViewOperationQueue";
                    }
                }
            }
            ArrayDeque arrayDeque = this.A06;
            if (arrayDeque != null) {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext()) {
                    ((C20876X2c) it2.next()).AT8();
                }
            }
            ArrayList arrayList2 = this.A07;
            if (arrayList2 != null) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((C20876X2c) it3.next()).AT8();
                }
            }
            C18592Vuj vuj = this.A05;
            if (vuj.A0J && vuj.A04 == 0) {
                long j = this.A01;
                vuj.A04 = j;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                vuj.A03 = uptimeMillis2;
                vuj.A06 = this.A03;
                vuj.A05 = this.A02;
                vuj.A09 = uptimeMillis;
                vuj.A08 = uptimeMillis2;
                vuj.A0A = this.A04;
                Systrace.A09("delayBeforeDispatchViewUpdates", 0, 8192, j * 1000000);
                Systrace.A0A("delayBeforeDispatchViewUpdates", 0, 8192, vuj.A05 * 1000000);
                Systrace.A09("delayBeforeBatchRunStart", 0, 8192, vuj.A05 * 1000000);
                Systrace.A0A("delayBeforeBatchRunStart", 0, 8192, vuj.A09 * 1000000);
            }
            W0R w0r = vuj.A0L;
            synchronized (w0r) {
                w0r.A08.A01();
            }
            0fc.A00(8192, 448273833);
            return;
            ReactSoftExceptionLogger.logSoftException(str, th);
        } catch (Exception e2) {
            try {
                this.A05.A0I = true;
                throw e2;
            } catch (Throwable th3) {
                0fc.A00(8192, -817232817);
                throw th3;
            }
        }
    }
}
