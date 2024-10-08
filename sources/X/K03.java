package X;

import com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.quicklog.QuickPerformanceLogger;

public final class K03 extends AnonymousClass82G {
    public int A00;
    public final /* synthetic */ C64164LRf A01;
    public final /* synthetic */ boolean A02;

    public final void A05(EffectManifest effectManifest) {
        0qQ.A0B(effectManifest, 0);
    }

    public final void A06(String str) {
        QuickPerformanceLogger quickPerformanceLogger;
        0qQ.A0B(str, 0);
        if (this.A02) {
            C64164LRf lRf = this.A01;
            C62977KpT.A00(lRf, AnonymousClass05K.A0j);
            LGB lgb = lRf.A0C;
            if (lgb != null && lgb.A09 && (quickPerformanceLogger = lRf.A0G) != null) {
                quickPerformanceLogger.markerPoint(603995461, "avatar_rendered_start");
                quickPerformanceLogger.markerPoint(603995461, "avatar_load_start");
            }
        }
    }

    public final void A0A(String str, Throwable th) {
        0qQ.A0B(str, 0);
        C62977KpT.A00(this.A01, AnonymousClass05K.A15);
    }

    public K03(C64164LRf lRf, boolean z) {
        this.A02 = z;
        this.A01 = lRf;
    }

    public final void A03() {
        String str;
        if (this.A02) {
            C64164LRf lRf = this.A01;
            OdrSnapshotHelper odrSnapshotHelper = lRf.A01;
            if (odrSnapshotHelper == null) {
                str = "odrSnapshotHelper";
            } else {
                AH4 ah4 = lRf.A04;
                if (ah4 == null) {
                    str = "richMediaViewerAr3d";
                } else {
                    odrSnapshotHelper.A07.markerPoint(603995461, "/take_snapshot/render_frame/1_start");
                    if (ah4.A04) {
                        AH4.A01(ah4);
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A04() {
        boolean z;
        if (this.A02) {
            C64164LRf lRf = this.A01;
            LGB lgb = lRf.A0C;
            if (lgb != null) {
                z = lgb.A09;
            } else {
                z = false;
            }
            String str = "odrSnapshotHelper";
            if (z && (!lRf.A0A || !lRf.A08)) {
                if (this.A00 == 0) {
                    OdrSnapshotHelper odrSnapshotHelper = lRf.A01;
                    if (odrSnapshotHelper != null) {
                        int i = odrSnapshotHelper.A00 + 1;
                        odrSnapshotHelper.A00 = i;
                        odrSnapshotHelper.A07.markerPoint(603995461, 002.A0R(002.A0O("/take_snapshot/render_frame/", i), "_end"));
                    }
                }
                AH4 ah4 = lRf.A04;
                if (ah4 == null) {
                    str = "richMediaViewerAr3d";
                } else if (ah4.A04) {
                    ah4.A0B.EEt((Long) null);
                }
            } else if (lgb == null || !lgb.A09 || lRf.A09) {
                OdrSnapshotHelper odrSnapshotHelper2 = lRf.A01;
                if (odrSnapshotHelper2 != null) {
                    int i2 = odrSnapshotHelper2.A00 + 1;
                    odrSnapshotHelper2.A00 = i2;
                    odrSnapshotHelper2.A07.markerPoint(603995461, 002.A0R(002.A0O("/take_snapshot/render_frame/", i2), "_end"));
                }
            } else {
                QuickPerformanceLogger quickPerformanceLogger = lRf.A0G;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerPoint(603995461, "avatar_ready_end");
                }
                lRf.A09 = true;
                C62977KpT.A00(lRf, AnonymousClass05K.A07);
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        int i3 = this.A00;
        if (i3 <= 3) {
            int i4 = i3 + 1;
            this.A00 = i4;
            if (i4 == 3) {
                C62977KpT.A00(this.A01, AnonymousClass05K.A0Y);
            }
        }
    }

    public final void A08(EffectAttribution effectAttribution, EffectManifest effectManifest, EffectServiceHost effectServiceHost, String str) {
        AnonymousClass7TG.A1N(str, effectManifest);
        C62977KpT.A00(this.A01, AnonymousClass05K.A0N);
    }
}
