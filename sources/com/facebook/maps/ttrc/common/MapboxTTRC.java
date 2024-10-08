package com.facebook.maps.ttrc.common;

import X.002;
import X.0Gb;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C16682UzP;
import X.C17611Vb3;
import X.C17612Vb4;
import X.C17816VgV;
import X.C19884WhD;
import X.C66580MXl;
import X.G8K;
import android.util.Pair;
import com.facebook.quicklog.MarkerEditor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class MapboxTTRC {
    public static final Map mSeenUrls = new HashMap();
    public static 0Gb sFbErrorReporter = null;
    public static MapboxTTRC sInstance = null;
    public static final C17611Vb3 sMidgardRequestTracker = new C17611Vb3(new C19884WhD());
    public static final C17816VgV sMidgardRequests = new C17816VgV();
    public static int sStyleImageMissingCount = 1;
    public static G8K sTTRCTrace = null;
    public static C17612Vb4 sTTRCTraceProvider = null;
    public static int sUncategorizedResponseCount = 0;
    public static int sUnknownEndMarkerId = 900;

    public static Pair projectCoordinateToTile(double d, double d2, int i) {
        double d3 = (double) (1 << i);
        return new Pair(Double.valueOf(((d2 + 180.0d) * d3) / 360.0d), Double.valueOf(((180.0d - (Math.log(Math.tan(((Math.max(-85.0511287798066d, Math.min(85.0511287798066d, d)) * 3.141592653589793d) / 360.0d) + 0.7853981633974483d)) * 57.29577951308232d)) * d3) / 360.0d));
    }

    public static synchronized void cancel(String str) {
        synchronized (MapboxTTRC.class) {
            G8K g8k = sTTRCTrace;
            if (g8k != null) {
                g8k.Cft(str);
            }
            clearTrace();
        }
    }

    public static synchronized void clearTrace() {
        synchronized (MapboxTTRC.class) {
            mSeenUrls.clear();
            C17816VgV vgV = sMidgardRequests;
            vgV.A02.clear();
            vgV.A00 = 0;
            vgV.A01 = 0;
            sStyleImageMissingCount = 1;
            C17611Vb3 vb3 = sMidgardRequestTracker;
            vb3.A02 = -1;
            vb3.A06.clear();
            vb3.A00 = 0;
            vb3.A01 = 0;
            vb3.A03 = false;
            sUncategorizedResponseCount = 0;
            sTTRCTrace = null;
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.maps.ttrc.common.MapboxTTRC, java.lang.Object] */
    public static synchronized void initialize(0Gb r8, C17612Vb4 vb4) {
        synchronized (MapboxTTRC.class) {
            if (sInstance == null) {
                ? obj = new Object();
                sTTRCTraceProvider = vb4;
                sFbErrorReporter = r8;
                for (C16682UzP put : C16682UzP.values()) {
                    mSeenUrls.put(put, new C17816VgV());
                }
                sInstance = obj;
            }
        }
    }

    public static synchronized void onMapRendered() {
        synchronized (MapboxTTRC.class) {
            G8K g8k = sTTRCTrace;
            if (g8k != null) {
                g8k.CmD("uncat_unrequested_resp_count", sUncategorizedResponseCount);
                Iterator A0u = AnonymousClass7TF.A0u(mSeenUrls);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    sTTRCTrace.CmD(002.A0g(((C16682UzP) A1J.getKey()).A00, "_", "unrequested_resp_count"), ((C17816VgV) A1J.getValue()).A01);
                }
                sTTRCTrace.CmD("midgard_unrequested_resp_count", sMidgardRequests.A01);
                sTTRCTrace.Ey0("map_rendered");
            }
        }
    }

    public static synchronized void onMidgardRequest(String str, int i, int i2, int i3, String str2) {
        int i4;
        synchronized (MapboxTTRC.class) {
            if (sTTRCTrace != null) {
                C17816VgV vgV = sMidgardRequests;
                Map map = vgV.A02;
                if (!map.containsKey(str) && (i4 = vgV.A00) <= 20) {
                    int i5 = i4 + 1;
                    vgV.A00 = i5;
                    C66580MXl.A1T(str, map, i5);
                }
                C17611Vb3 vb3 = sMidgardRequestTracker;
                G8K g8k = sTTRCTrace;
                if (!vb3.A03) {
                    if (vb3.A02 == -1) {
                        g8k.CmG("zoom_invalid", true);
                        vb3.A05.run();
                        vb3.A03 = true;
                    }
                    if (i == vb3.A02) {
                        Set set = vb3.A06;
                        if (!set.contains(str)) {
                            set.add(str);
                        }
                    }
                }
                String A0O = 002.A0O("midgard_request_", vgV.A00(str));
                MarkerEditor FNW = sTTRCTrace.FNW();
                FNW.point(002.A0g(A0O, "_", "begin"));
                FNW.markerEditingCompleted();
            }
        }
    }

    public static synchronized void onMidgardResponse(String str, int i, int i2, int i3) {
        synchronized (MapboxTTRC.class) {
            if (sTTRCTrace != null) {
                C17816VgV vgV = sMidgardRequests;
                if (!vgV.A02.containsKey(str)) {
                    vgV.A01++;
                }
                C17611Vb3 vb3 = sMidgardRequestTracker;
                if (!vb3.A03) {
                    Set set = vb3.A06;
                    if (set.contains(str)) {
                        int i4 = vb3.A01 + 1;
                        vb3.A01 = i4;
                        if (i4 == vb3.A00) {
                            vb3.A05.run();
                            vb3.A03 = true;
                        } else {
                            set.remove(str);
                        }
                    }
                }
                String A0O = 002.A0O("midgard_request_", vgV.A00(str));
                MarkerEditor FNW = sTTRCTrace.FNW();
                FNW.point(002.A0g(A0O, "_", "end"));
                FNW.markerEditingCompleted();
            }
        }
    }

    public static synchronized void onUrlRequest(int i, int i2, String str, String str2) {
        int i3;
        synchronized (MapboxTTRC.class) {
            if (sTTRCTrace != null) {
                C16682UzP A00 = C16682UzP.A00(i2);
                if (A00 == C16682UzP.STYLE) {
                    sTTRCTrace.CmF("style_url", str);
                    sTTRCTrace.CmG("using_facebook_tiles", AnonymousClass7TF.A1Q(str.toLowerCase(Locale.US).contains("mapbox") ? 1 : 0));
                }
                Map map = mSeenUrls;
                C17816VgV vgV = (C17816VgV) map.get(A00);
                if (vgV == null) {
                    vgV = new C17816VgV();
                    map.put(A00, vgV);
                }
                Map map2 = vgV.A02;
                if (!map2.containsKey(str) && (i3 = vgV.A00) <= 20) {
                    int i4 = i3 + 1;
                    vgV.A00 = i4;
                    C66580MXl.A1T(str, map2, i4);
                }
                String A0o = 002.A0o(A00.A00, "_", "_", vgV.A00(str), i);
                MarkerEditor FNW = sTTRCTrace.FNW();
                FNW.point(002.A0g(A0o, "_", "begin"));
                FNW.markerEditingCompleted();
            }
        }
    }

    public static synchronized void onUrlResponse(int i, int i2, String str, boolean z, int i3) {
        int i4;
        synchronized (MapboxTTRC.class) {
            if (sTTRCTrace != null) {
                C17816VgV vgV = (C17816VgV) mSeenUrls.get(C16682UzP.A00(i2));
                if (vgV != null) {
                    i4 = vgV.A00(str);
                    if (!vgV.A02.containsKey(str)) {
                        vgV.A01++;
                    }
                    if (i4 == 999) {
                    }
                    String A0o = 002.A0o(C16682UzP.A00(i2).A00, "_", "_", i4, i);
                    MarkerEditor FNW = sTTRCTrace.FNW();
                    FNW.point(002.A0g(A0o, "_", "end"));
                    FNW.annotate(002.A0g(A0o, "_", "cached"), z);
                    FNW.annotate(002.A0g(A0o, "_", "size"), i3);
                    FNW.markerEditingCompleted();
                    C16682UzP.A00(i2);
                } else {
                    sUncategorizedResponseCount++;
                }
                i4 = sUnknownEndMarkerId;
                sUnknownEndMarkerId = i4 + 1;
                String A0o2 = 002.A0o(C16682UzP.A00(i2).A00, "_", "_", i4, i);
                MarkerEditor FNW2 = sTTRCTrace.FNW();
                FNW2.point(002.A0g(A0o2, "_", "end"));
                FNW2.annotate(002.A0g(A0o2, "_", "cached"), z);
                FNW2.annotate(002.A0g(A0o2, "_", "size"), i3);
                FNW2.markerEditingCompleted();
                C16682UzP.A00(i2);
            }
        }
    }
}
