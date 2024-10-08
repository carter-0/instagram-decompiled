package X;

import android.os.Handler;
import android.view.View;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.maps.ttrc.common.MapboxTTRC;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowLogger;

public final class WFX implements XAA, X2S {
    public VZ8 A00;
    public C16652Uyo A01;
    public Integer A02;
    public float A03;
    public boolean A04;
    public final Handler A05;
    public final View A06;
    public final U00 A07;
    public final C17173VLc A08 = new C17173VLc();
    public final C17873VhQ A09;
    public final V3J A0A;

    public final void A00(int i) {
        C17873VhQ vhQ = this.A09;
        vhQ.A03.markerEnd(i, vhQ.A02, 2);
    }

    public final void D03(CameraPosition cameraPosition) {
        if (!this.A04) {
            this.A04 = true;
            V3J v3j = this.A0A;
            float f = cameraPosition.A02;
            UserFlowLogger userFlowLogger = v3j.A01;
            if (userFlowLogger != null) {
                userFlowLogger.flowAnnotate(v3j.A00, "initial_zoom", (double) f);
            }
            this.A03 = f;
        }
    }

    public final void ELr(String str) {
        float f;
        PointEditor markPointWithEditor;
        String str2;
        if (this.A04) {
            if (str.equals("zoom")) {
                this.A00.getClass();
                f = this.A00.A01.A02().A02;
                if (f != Float.MIN_VALUE) {
                    float f2 = this.A03;
                    if (f != f2) {
                        if (f > f2) {
                            str2 = "zoom_in";
                        } else {
                            str2 = "zoom_out";
                        }
                        V3J v3j = this.A0A;
                        UserFlowLogger userFlowLogger = v3j.A01;
                        if (userFlowLogger != null) {
                            markPointWithEditor = userFlowLogger.markPointWithEditor(v3j.A00, str2);
                        }
                        this.A03 = f;
                    }
                    return;
                }
                return;
            } else if (str.equals("rotate")) {
                this.A00.getClass();
                f = this.A00.A01.A02().A02;
                if (f != Float.MIN_VALUE) {
                    V3J v3j2 = this.A0A;
                    UserFlowLogger userFlowLogger2 = v3j2.A01;
                    if (userFlowLogger2 != null) {
                        markPointWithEditor = userFlowLogger2.markPointWithEditor(v3j2.A00, str);
                    }
                    this.A03 = f;
                }
                return;
            } else {
                V3J v3j3 = this.A0A;
                UserFlowLogger userFlowLogger3 = v3j3.A01;
                if (userFlowLogger3 != null) {
                    userFlowLogger3.markPointWithEditor(v3j3.A00, str).addPointData("is_interactive", true).markerEditingCompleted();
                    return;
                }
                return;
            }
            markPointWithEditor.addPointData("is_interactive", true).addPointData("zoom", f).markerEditingCompleted();
            this.A03 = f;
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.V3J, java.lang.Object] */
    public WFX(View view, 0Gb r6, C17612Vb4 vb4, QuickPerformanceLogger quickPerformanceLogger, UserFlowLogger userFlowLogger) {
        Handler A0D = AnonymousClass7TF.A0D();
        this.A05 = A0D;
        U00 u00 = new U00(this);
        this.A07 = u00;
        this.A02 = AnonymousClass05K.A00;
        MapboxTTRC.initialize(r6, vb4);
        this.A06 = view;
        0qQ.A0B(r6, 1);
        MapboxTTRC.initialize(r6, vb4);
        VJd.A00.addAll(AnonymousClass7TE.A1I("socal_home"));
        this.A09 = new C17873VhQ(quickPerformanceLogger);
        ? obj = new Object();
        obj.A01 = userFlowLogger;
        this.A0A = obj;
        A0D.postDelayed(u00, 500);
    }
}
