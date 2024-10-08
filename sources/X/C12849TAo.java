package X;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.TAo  reason: case insensitive filesystem */
public final class C12849TAo implements Runnable {
    public final Sg6 A00;

    public final void run() {
        boolean A1Q;
        boolean A1Q2;
        Sg6 sg6 = this.A00;
        AnonymousClass389.A00();
        Sg6.A00();
        List list = sg6.A0A;
        synchronized (list) {
            if (sg6.A00 != null) {
                AnonymousClass389.A00();
                if (((Intent) list.remove(0)).equals(sg6.A00)) {
                    sg6.A00 = null;
                } else {
                    th = AnonymousClass7TE.A0z("Dequeue-d command is not the first.");
                    throw th;
                }
            }
            AnonymousClass38P r2 = ((AnonymousClass38M) sg6.A09).A01;
            Sg5 sg5 = sg6.A07;
            synchronized (sg5.A02) {
                try {
                    A1Q = AnonymousClass7TF.A1Q(sg5.A03.isEmpty() ? 1 : 0);
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                        break;
                    }
                }
            }
            if (!A1Q) {
                if (list.isEmpty()) {
                    synchronized (r2.A01) {
                        try {
                            A1Q2 = AnonymousClass7TF.A1Q(r2.A02.isEmpty() ? 1 : 0);
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    if (!A1Q2) {
                        AnonymousClass389.A00();
                        TZl tZl = sg6.A02;
                        if (tZl != null) {
                            SystemAlarmService systemAlarmService = (SystemAlarmService) tZl;
                            systemAlarmService.A01 = true;
                            AnonymousClass389.A00();
                            LinkedHashMap A1H = AnonymousClass7TE.A1H();
                            synchronized (SCT.A00) {
                                try {
                                    A1H.putAll(SCT.A01);
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            Iterator A0s = AnonymousClass7TF.A0s(A1H);
                            while (A0s.hasNext()) {
                                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) A1J.getKey();
                                String A0s2 = DbS.A0s(A1J);
                                if (wakeLock != null && wakeLock.isHeld()) {
                                    AnonymousClass389.A00();
                                    Pxh.A1K("WakeLock held for ", A0s2, SAu.A00);
                                }
                            }
                            systemAlarmService.stopSelf();
                        }
                    }
                }
            }
            if (!list.isEmpty()) {
                Sg6.A01(sg6);
            }
        }
    }

    public C12849TAo(Sg6 sg6) {
        this.A00 = sg6;
    }
}
