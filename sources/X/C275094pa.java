package X;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4pa  reason: invalid class name and case insensitive filesystem */
public final class C275094pa implements Runnable, C275104pb {
    public long A00;
    public final C275064pX A01;
    public final List A02;
    public final boolean A03;
    public final long A04;
    public final Handler A05 = C262444Ef.A00().A00;
    public final C275044pV A06;

    public final void A00(long j, boolean z) {
        if (C274794p6.A02.A01.get()) {
            this.A00 = SystemClock.uptimeMillis() + j;
            this.A05.postDelayed(this, j);
            if (z) {
                for (C274924pJ update : this.A02) {
                    update.update();
                }
            }
        }
    }

    public final void ASk(boolean z) {
        Handler handler = this.A05;
        if (z) {
            handler.removeCallbacks(this);
            A00(0, false);
            return;
        }
        handler.removeCallbacks(this);
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [java.lang.Object, X.RyP] */
    public final void run() {
        long j;
        int size;
        C275064pX r7 = this.A01;
        C274844pB AuB = r7.AuB();
        if (AuB == null || AuB.A05 != -1) {
            j = this.A04;
        } else {
            List list = AuB.A0A;
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            if (size >= 5) {
                A00(this.A04, false);
                return;
            }
            long j2 = this.A04;
            long j3 = ((long) (size + 1)) * j2;
            long A012 = AuB.A01();
            if (A012 < j3) {
                j = j3 - A012;
            } else {
                long j4 = this.A00;
                long j5 = A012 - j3;
                while (j5 > j2) {
                    j5 -= j2;
                }
                A00(j2 - j5, false);
                ? obj = new Object();
                long uptimeMillis = SystemClock.uptimeMillis();
                obj.A02 = uptimeMillis;
                obj.A00 = uptimeMillis - j4;
                Thread thread = AuB.A09;
                if (thread != null) {
                    try {
                        obj.A04 = thread.getState().name();
                        obj.A06 = C274794p6.A02.A01.get();
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        obj.A07 = stackTrace;
                        if (AuB.A05 == -1) {
                            QJT qjt = new QJT();
                            Iterator it = this.A02.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C274924pJ r5 = (C274924pJ) it.next();
                                if (AuB.A05 != -1) {
                                    obj.A05 = true;
                                    break;
                                }
                                long uptimeMillis2 = SystemClock.uptimeMillis();
                                r5.AGZ(qjt, stackTrace);
                                long uptimeMillis3 = SystemClock.uptimeMillis() - uptimeMillis2;
                                if (this.A03) {
                                    Map map = qjt.A0E;
                                    if (map == null) {
                                        map = new HashMap();
                                        qjt.A0E = map;
                                    }
                                    map.put(r5, Long.valueOf(uptimeMillis3));
                                }
                            }
                            obj.A03 = qjt;
                        } else {
                            obj.A05 = true;
                        }
                    } catch (Throwable unused) {
                    }
                    obj.A01 = SystemClock.uptimeMillis();
                    List list2 = AuB.A0A;
                    if (list2 == null) {
                        list2 = new ArrayList();
                        AuB.A0A = list2;
                    }
                    list2.add(obj);
                    r7.CoJ(AuB);
                    return;
                }
                return;
            }
        }
        A00(j, true);
    }

    public C275094pa(C275064pX r3, C274884pF r4, C275044pV r5, List list) {
        boolean z;
        this.A01 = r3;
        this.A02 = list;
        this.A06 = r5;
        this.A04 = r4.A00();
        if (r4 instanceof C275114pc) {
            z = true;
        } else {
            z = false;
        }
        this.A03 = z;
        C274794p6.A02.A00(this);
    }
}
