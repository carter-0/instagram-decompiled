package X;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.maps.delegate.common.interfaces.MapOptions;
import com.facebook.maps.ttrc.common.MapboxTTRC;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.maps.raster.IgRasterMapView;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;

public final class U4T extends FrameLayout {
    public X5x A00;
    public WFX A01;
    public MapOptions A02;
    public UH1 A03;
    public boolean A04 = true;
    public X0Y A05;
    public UserSession A06;
    public final MapOptions A07;
    public final Queue A08 = new LinkedList();

    public final void A05(UserSession userSession) {
        int intValue;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        this.A06 = userSession2;
        this.A03 = new UH1(AnonymousClass7TE.A0S(this));
        VJP.A00 = new WFZ(userSession2);
        MapOptions mapOptions = this.A07;
        if (mapOptions.A05 == C16652Uyo.MAPBOX) {
            mapOptions.A05 = C16652Uyo.FACEBOOK;
        }
        QuickPerformanceLogger quickPerformanceLogger = 02m.A0p;
        0qQ.A07(quickPerformanceLogger);
        0Gb r4 = 0wb.A01;
        this.A01 = new WFX(this, r4, new C17612Vb4(r4, quickPerformanceLogger), quickPerformanceLogger, new UserFlowLoggerImpl(quickPerformanceLogger));
        synchronized (MapboxTTRC.class) {
            C17612Vb4 vb4 = MapboxTTRC.sTTRCTraceProvider;
            QuickPerformanceLogger quickPerformanceLogger2 = vb4.A04;
            C276904u6 r10 = vb4.A02;
            C276954uB r8 = vb4.A00;
            C276934u9 r9 = vb4.A01;
            synchronized (vb4) {
                try {
                    Map map = vb4.A05;
                    Integer num = (Integer) map.get(19152862);
                    if (num == null) {
                        C66580MXl.A1T(19152862, map, 1);
                    } else {
                        C66580MXl.A1T(19152862, map, num.intValue() + 1);
                    }
                    intValue = ((Integer) map.get(19152862)).intValue();
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            long now = vb4.A03.now();
            0qQ.A0B(quickPerformanceLogger2, 1);
            C51974G9v.A1M(r10, r8, r9);
            C14533Txt txt = new C14533Txt(r8, r9, r10, quickPerformanceLogger2, (String) null, 19152862, intValue, now, -1, false, true);
            r10.A00(txt);
            try {
                G8K g8k = MapboxTTRC.sTTRCTrace;
                if (g8k != null) {
                    g8k.AUZ("trace in progress already");
                    MapboxTTRC.sFbErrorReporter.Ew0("MapboxTTRC", "trace in progress already");
                    MapboxTTRC.clearTrace();
                }
                MapboxTTRC.sTTRCTrace = txt;
                txt.AAI("style_loaded");
                MapboxTTRC.sTTRCTrace.AAI("map_rendered");
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final void A00() {
        WFX wfx = this.A01;
        if (wfx != null) {
            MapboxTTRC.cancel("maps_perf_logger_on_destroy");
            V3J v3j = wfx.A0A;
            UserFlowLogger userFlowLogger = v3j.A01;
            if (userFlowLogger != null) {
                userFlowLogger.flowEndSuccess(v3j.A00);
            }
            v3j.A01 = null;
            wfx.A05.removeCallbacksAndMessages((Object) null);
        }
    }

    public final void A01() {
        this.A00.getClass();
        this.A01.getClass();
        this.A01.A09.A00(19136515);
        this.A01.A00(19136515);
    }

    public final void A02() {
        this.A00.getClass();
        this.A01.getClass();
        this.A01.A09.A00(19136514);
        this.A01.A00(19136514);
    }

    public final void A03(Bundle bundle) {
        MapOptions mapOptions = this.A02;
        if (mapOptions != null) {
            WFX wfx = this.A01;
            if (wfx != null) {
                C16652Uyo uyo = mapOptions.A05;
                String str = mapOptions.A08;
                if (str == null || str.isEmpty()) {
                    throw new IllegalArgumentException("Must set a surface in MapOptions");
                } else if (uyo != C16652Uyo.UNKNOWN) {
                    wfx.A01 = uyo;
                    String obj = uyo.toString();
                    String str2 = mapOptions.A08;
                    String str3 = mapOptions.A06;
                    boolean A1U = AnonymousClass7TF.A1U(0, obj, str2);
                    boolean contains = VJd.A00.contains(str2);
                    synchronized (MapboxTTRC.class) {
                        G8K g8k = MapboxTTRC.sTTRCTrace;
                        if (g8k != null) {
                            if (contains) {
                                g8k.AAI("midgard_data_done");
                            }
                            MarkerEditor FNW = MapboxTTRC.sTTRCTrace.FNW();
                            FNW.point("map_code_start");
                            FNW.annotate("surface", str2);
                            FNW.annotate("source", obj);
                            if (str3 == null) {
                                str3 = "unset";
                            }
                            FNW.annotate(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
                            FNW.markerEditingCompleted();
                        }
                    }
                    C17873VhQ vhQ = wfx.A09;
                    vhQ.A00 = obj;
                    vhQ.A01 = str2;
                    V3J v3j = wfx.A0A;
                    UserFlowLogger userFlowLogger = v3j.A01;
                    if (userFlowLogger != null) {
                        long generateNewFlowId = userFlowLogger.generateNewFlowId(19146604);
                        v3j.A00 = generateNewFlowId;
                        userFlowLogger.flowStart(generateNewFlowId, new UserFlowConfig.UserFlowConfigBuilder(str2, false).build());
                        UserFlowLogger userFlowLogger2 = v3j.A01;
                        if (userFlowLogger2 != null) {
                            userFlowLogger2.flowAnnotate(v3j.A00, "source", obj);
                        }
                        UserFlowLogger userFlowLogger3 = v3j.A01;
                        if (userFlowLogger3 != null) {
                            userFlowLogger3.flowAnnotate(v3j.A00, "surface", str2);
                        }
                    }
                    vhQ.A00(19136523);
                    this.A01.A09.A00(19136513);
                    try {
                        this.A01.getClass();
                        MapOptions mapOptions2 = this.A07;
                        if (mapOptions2.A05 == C16652Uyo.FACEBOOK) {
                            if (mapOptions2.A06 == null) {
                                mapOptions2.A06 = "IgMapViewDelegate.java";
                            }
                            double d = C14723U4m.A0p;
                            Context A0S = AnonymousClass7TE.A0S(this);
                            C18585Vuc vuc = new C18585Vuc();
                            vuc.A04 = mapOptions2.A04;
                            vuc.A07 = mapOptions2.A09;
                            vuc.A02 = mapOptions2.A02;
                            vuc.A09 = mapOptions2.A0D;
                            vuc.A0A = mapOptions2.A0E;
                            vuc.A0B = mapOptions2.A0G;
                            vuc.A0C = mapOptions2.A0H;
                            vuc.A0D = mapOptions2.A0I;
                            vuc.A0E = mapOptions2.A0J;
                            vuc.A00 = mapOptions2.A00;
                            vuc.A01 = mapOptions2.A01;
                            vuc.A06 = mapOptions2.A08;
                            vuc.A01(mapOptions2.A06);
                            vuc.A03 = mapOptions2.A03;
                            vuc.A08 = mapOptions2.A0A;
                            IgRasterMapView igRasterMapView = new IgRasterMapView(A0S, vuc);
                            this.A00 = igRasterMapView;
                            igRasterMapView.D6V(bundle);
                            X5x x5x = this.A00;
                            x5x.setMapEventHandler(this.A01);
                            addView((View) x5x);
                            if (!this.A04) {
                                C51969G9p.A1M(this.A00);
                            }
                            A04(new WIS(this, A1U ? 1 : 0));
                            return;
                        }
                        throw new IllegalStateException("Unsupported renderer");
                    } finally {
                        this.A01.A00(19136513);
                    }
                } else {
                    throw new IllegalArgumentException("Must set a renderer in MapOptions");
                }
            } else {
                throw new IllegalStateException("Must call setMapLogger() before onCreate()");
            }
        } else {
            throw new IllegalStateException("Must provide map options before onCreate()");
        }
    }

    public final void A04(X2U x2u) {
        X5x x5x = this.A00;
        if (x5x != null) {
            IgRasterMapView igRasterMapView = (IgRasterMapView) x5x;
            igRasterMapView.A0G(new WFO(x2u, igRasterMapView));
            return;
        }
        this.A08.add(x2u);
    }

    public WFX getMapLogger() {
        WFX wfx = this.A01;
        if (wfx != null) {
            return wfx;
        }
        throw new IllegalStateException("Must call setMapLogger() before getMapLogger()");
    }

    public C16481Uvb getMapType() {
        this.A02.getClass();
        if (this.A02.A05 == C16652Uyo.MAPBOX) {
            return C16481Uvb.MAPBOX_MAP;
        }
        return C16481Uvb.FACEBOOK_MAP;
    }

    public final boolean isEnabled() {
        X5x x5x = this.A00;
        if (x5x != null) {
            this.A04 = AnonymousClass7TF.A1Q(((View) x5x).getVisibility());
        }
        return this.A04;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setEnabled(boolean z) {
        this.A04 = z;
        X5x x5x = this.A00;
        if (x5x != null) {
            ((View) x5x).setVisibility(DbW.A01(z ? 1 : 0));
        }
    }

    public void setMapOptions(MapOptions mapOptions) {
        this.A02 = mapOptions;
    }

    public void setOnInterceptTouchEventListener(X0Y x0y) {
        this.A05 = x0y;
    }

    public U4T(Context context, MapOptions mapOptions) {
        super(context);
        this.A02 = mapOptions;
        this.A07 = mapOptions;
    }

    public Locale getDeviceLocale() {
        return AnonymousClass1Q2.A02();
    }
}
