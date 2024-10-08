package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.android.maps.StaticMapView;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.facebook.maps.ttrc.common.MapboxTTRC;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.android.R;
import com.instagram.maps.raster.IgRasterMapView;
import com.instagram.maps.ui.IgStaticMapView;
import java.util.ArrayList;

public final class WIS implements X2U {
    public final int A00;
    public final Object A01;

    public WIS(U4T u4t, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = u4t;
        } else {
            this.A01 = u4t;
        }
    }

    public final void DPa(VZ8 vz8) {
        VZ8 vz82 = vz8;
        switch (this.A00) {
            case 0:
                IgRasterMapView igRasterMapView = (IgRasterMapView) this.A01;
                WFU wfu = vz8.A01;
                C69419Nl1 nl1 = igRasterMapView.A0N.A03;
                AnonymousClass7TG.A1N(wfu, nl1);
                Context context = igRasterMapView.getContext();
                Drawable drawable = context.getDrawable(R.drawable.instagram_info_filled_16);
                if (drawable != null) {
                    C14959UGx uGx = new C14959UGx(drawable, wfu, nl1, new UH1(context));
                    igRasterMapView.A00 = uGx;
                    C18608Vv1 vv1 = igRasterMapView.A01;
                    if (vv1 != null) {
                        uGx.A01 = vv1;
                    }
                    wfu.A0A(uGx);
                    uGx.A09(igRasterMapView.A03);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            case 1:
                U4T u4t = (U4T) this.A01;
                u4t.A01.getClass();
                WFX wfx = u4t.A01;
                wfx.A01.getClass();
                wfx.A00 = vz8;
                V3J v3j = wfx.A0A;
                UserFlowLogger userFlowLogger = v3j.A01;
                if (userFlowLogger != null) {
                    userFlowLogger.flowMarkPoint(v3j.A00, "map_ready");
                }
                if (wfx.A01 == C16652Uyo.MAPBOX) {
                    wfx.A05.postAtFrontOfQueue(new C20137Wlx(vz8, wfx));
                    throw new UnsupportedOperationException("Facebook map doesn't support on start move listener");
                }
                ArrayList arrayList = vz8.A00;
                if (arrayList == null) {
                    MapboxTTRC.onMapRendered();
                } else {
                    arrayList.add(wfx);
                }
                synchronized (MapboxTTRC.class) {
                    G8K g8k = MapboxTTRC.sTTRCTrace;
                    if (g8k != null) {
                        g8k.Ey0("style_loaded");
                    }
                }
                WFU wfu2 = vz8.A01;
                wfu2.A0N.add(new WFF(vz8, wfx, 1));
                while (true) {
                    X2U x2u = (X2U) u4t.A08.poll();
                    if (x2u != null) {
                        x2u.DPa(vz8);
                    } else {
                        return;
                    }
                }
            case 2:
                0qQ.A0A(vz8);
                ((UZB) this.A01).A06(vz8);
                return;
            case 3:
                C18663VwL vwL = (C18663VwL) this.A01;
                vwL.A00 = vz8;
                WFU wfu3 = vz8.A01;
                vwL.A01 = new C18016Vjs(vwL.A02, vz82, vwL.A04.getMapLogger(), vwL.A05, vwL.A06);
                vwL.A03.DPb(vwL);
                vz8.A02.add(new WIR(vwL));
                WFF wff = new WFF(vz8, new WIO(vwL), 1);
                ArrayList arrayList2 = wfu3.A0N;
                arrayList2.add(wff);
                arrayList2.add(new WFF(vz8, new WIP(wfu3, vwL), 0));
                return;
            case 4:
                CameraPosition A02 = vz8.A01.A02();
                StaticMapView.StaticMapOptions staticMapOptions = new StaticMapView.StaticMapOptions("dynamic_map_report_button");
                staticMapOptions.A04 = "IgMapViewDelegate.java";
                LatLng latLng = A02.A03;
                StringBuilder sb = new StringBuilder();
                sb.append(latLng.A00);
                sb.append(",");
                sb.append(latLng.A01);
                staticMapOptions.A02 = sb.toString();
                staticMapOptions.A03((int) A02.A02);
                U4T u4t2 = (U4T) this.A01;
                int width = u4t2.getWidth();
                int height = u4t2.getHeight();
                Context context2 = u4t2.getContext();
                Uri A002 = IgStaticMapView.A00(context2.getResources(), staticMapOptions, 2R6.A03, width, height);
                0qQ.A07(A002);
                UH1 uh1 = u4t2.A03;
                if (uh1 == null) {
                    0qQ.A0F("mapReporterLauncher");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    uh1.A01(context2, A002);
                    return;
                }
            default:
                return;
        }
    }

    public WIS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
