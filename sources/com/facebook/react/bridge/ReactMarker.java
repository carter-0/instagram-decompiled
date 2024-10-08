package com.facebook.react.bridge;

import X.02m;
import X.AnonymousClass7TE;
import X.C10410Rrm;
import X.C12218SpL;
import X.C13432TaK;
import X.C13433TaL;
import X.C13498TbP;
import X.JTR;
import X.Pxh;
import X.RH1;
import X.SBO;
import X.T8A;
import android.os.SystemClock;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class ReactMarker {
    public static final List sFabricMarkerListeners = new CopyOnWriteArrayList();
    public static final List sListeners = new CopyOnWriteArrayList();
    public static Queue sNativeReactMarkerQueue = new ConcurrentLinkedQueue();

    public static native void nativeLogMarker(String str, long j);

    public static void addFabricListener(C13432TaK taK) {
        JTR.A1T(taK, sFabricMarkerListeners);
    }

    public static void addListener(C13433TaL taL) {
        JTR.A1T(taL, sListeners);
    }

    public static void clearFabricMarkerListeners() {
        sFabricMarkerListeners.clear();
    }

    public static void clearMarkerListeners() {
        sListeners.clear();
    }

    public static void notifyNativeMarker(RH1 rh1, Long l) {
        if (rh1.A00) {
            if (l == null) {
                l = Long.valueOf(SystemClock.uptimeMillis());
            }
            if (SBO.A00) {
                String name = rh1.name();
                long longValue = l.longValue();
                while (true) {
                    nativeLogMarker(name, longValue);
                    C10410Rrm rrm = (C10410Rrm) sNativeReactMarkerQueue.poll();
                    if (rrm != null) {
                        name = rrm.A01;
                        longValue = rrm.A00;
                    } else {
                        return;
                    }
                }
            } else {
                sNativeReactMarkerQueue.add(new C10410Rrm(rh1.name(), l.longValue()));
            }
        }
    }

    public static void removeFabricListener(C13432TaK taK) {
        sFabricMarkerListeners.remove(taK);
    }

    public static void removeListener(C13433TaL taL) {
        sListeners.remove(taL);
    }

    public static void logFabricMarker(RH1 rh1, String str, int i) {
        logFabricMarker(rh1, str, i, SystemClock.uptimeMillis(), 0);
    }

    public static void logMarker(String str) {
        logMarker(str, (String) null, 0);
    }

    public static void logMarker(RH1 rh1) {
        logMarker(rh1, (String) null, 0);
    }

    public static void logMarker(String str, String str2, int i) {
        logMarker(RH1.valueOf(str), str2, i);
    }

    public static void logMarker(RH1 rh1, int i) {
        logMarker(rh1, (String) null, i);
    }

    public static void logMarker(RH1 rh1, String str) {
        logMarker(rh1, str, 0);
    }

    public static void logMarker(String str, String str2) {
        logMarker(str, str2, 0);
    }

    public static void logMarker(String str, int i) {
        logMarker(str, (String) null, i);
    }

    public static void logMarker(RH1 rh1, String str, int i) {
        logMarker(rh1, str, i, (Long) null);
    }

    public static void logMarker(RH1 rh1, long j) {
        logMarker(rh1, (String) null, 0, Long.valueOf(j));
    }

    public static void logMarker(RH1 rh1, String str, int i, Long l) {
        logFabricMarker(rh1, str, i);
        for (C13433TaL taL : sListeners) {
            C12218SpL spL = (C12218SpL) taL;
            switch (rh1.ordinal()) {
                case 3:
                    for (C13498TbP tbP : spL.A00) {
                        T8A t8a = (T8A) tbP;
                        synchronized (t8a) {
                            Pxh.A1S(t8a.A07);
                            int i2 = t8a.A00;
                            if (i2 == 0) {
                                break;
                            } else {
                                02m.A0p.markerPoint(i2, "BRIDGE_STARTUP_DID_FINISH");
                                break;
                            }
                        }
                    }
                    continue;
                case 14:
                    for (C13498TbP tbP2 : spL.A00) {
                        T8A t8a2 = (T8A) tbP2;
                        synchronized (t8a2) {
                            Pxh.A1S(t8a2.A0J);
                            int i3 = t8a2.A00;
                            if (i3 == 0) {
                                break;
                            } else {
                                02m.A0p.markerPoint(i3, "START_EXECUTING_JS_BUNDLE");
                                break;
                            }
                        }
                    }
                    continue;
                case 15:
                    for (C13498TbP tbP3 : spL.A00) {
                        T8A t8a3 = (T8A) tbP3;
                        synchronized (t8a3) {
                            Pxh.A1S(t8a3.A0I);
                            int i4 = t8a3.A00;
                            if (i4 == 0) {
                                break;
                            } else {
                                02m.A0p.markerPoint(i4, "FINISH_EXECUTING_JS_BUNDLE");
                                break;
                            }
                        }
                    }
                    continue;
                case 21:
                    for (C13498TbP tbP4 : spL.A00) {
                        T8A t8a4 = (T8A) tbP4;
                        synchronized (t8a4) {
                            Pxh.A1S(t8a4.A0A);
                            int i5 = t8a4.A00;
                            if (i5 == 0) {
                                break;
                            } else {
                                02m.A0p.markerPoint(i5, "CREATE_UI_MANAGER_MODULE_START");
                                break;
                            }
                        }
                    }
                    continue;
                case 22:
                    for (C13498TbP tbP5 : spL.A00) {
                        T8A t8a5 = (T8A) tbP5;
                        synchronized (t8a5) {
                            Pxh.A1S(t8a5.A09);
                            int i6 = t8a5.A00;
                            if (i6 == 0) {
                                break;
                            } else {
                                02m.A0p.markerPoint(i6, "CREATE_UI_MANAGER_MODULE_END");
                                break;
                            }
                        }
                    }
                    continue;
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                    for (C13498TbP tbP6 : spL.A00) {
                        T8A t8a6 = (T8A) tbP6;
                        synchronized (t8a6) {
                            Pxh.A1S(t8a6.A0N);
                            int i7 = t8a6.A00;
                            if (i7 == 0) {
                                break;
                            } else {
                                02m.A0p.markerPoint(i7, "UNPACKER_CHECK_START");
                                break;
                            }
                        }
                    }
                    continue;
                case 51:
                    for (C13498TbP tbP7 : spL.A00) {
                        T8A t8a7 = (T8A) tbP7;
                        synchronized (t8a7) {
                            Pxh.A1S(t8a7.A0M);
                            int i8 = t8a7.A00;
                            if (i8 == 0) {
                                break;
                            } else {
                                02m.A0p.markerPoint(i8, "UNPACKER_CHECK_END");
                                break;
                            }
                        }
                    }
                    continue;
                case 52:
                    for (C13498TbP tbP8 : spL.A00) {
                        T8A t8a8 = (T8A) tbP8;
                        synchronized (t8a8) {
                            Pxh.A1S(t8a8.A0O);
                            int i9 = t8a8.A00;
                            if (i9 == 0) {
                                break;
                            } else {
                                02m.A0p.markerPoint(i9, "UNPACKING_END");
                                break;
                            }
                        }
                    }
                    continue;
            }
        }
        notifyNativeMarker(rh1, l);
    }

    public static void logFabricMarker(RH1 rh1, String str, int i, long j, int i2) {
        Iterator it = sFabricMarkerListeners.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("logFabricMarker");
        }
    }

    public static void logFabricMarker(RH1 rh1, String str, int i, long j) {
        Iterator it = sFabricMarkerListeners.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("logFabricMarker");
        }
    }
}
