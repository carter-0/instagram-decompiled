package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GCx  reason: case insensitive filesystem */
public final class C52051GCx extends C270664h6 implements C252243on, JRF, AnonymousClass32U {
    public C267324bN A00;
    public C267324bN A01;
    public boolean A02;
    public boolean A03;
    public final QuickPerformanceLogger A04;
    public final String A05;
    public final UserSession A06;
    public final GD9 A07;

    public C52051GCx(QuickPerformanceLogger quickPerformanceLogger, UserSession userSession, GD9 gd9, String str) {
        0qQ.A0B(str, 4);
        this.A06 = userSession;
        this.A07 = gd9;
        this.A04 = quickPerformanceLogger;
        this.A05 = str;
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D3u(C52263GLe gLe) {
        C295365o2 r1;
        0qQ.A0B(gLe, 0);
        boolean A032 = 1KU.A03(this.A06);
        if (this.A02) {
            C267324bN r0 = this.A00;
            if (r0 != null) {
                r1 = r0.A01;
            } else {
                r1 = null;
            }
            if (r1 != C295365o2.GHOST) {
                return;
            }
            if (!A032 || gLe.A0C) {
                this.A04.markerPoint(31790981, "CLIPS_FETCH_END");
            }
        }
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DW8(int i, int i2) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final void DhU(Integer num) {
        QuickPerformanceLogger quickPerformanceLogger;
        int i;
        C295365o2 r1;
        short s;
        0qQ.A0B(num, 0);
        if (this.A03) {
            if (this.A02 && num != AnonymousClass05K.A00) {
                quickPerformanceLogger = this.A04;
                i = 31790981;
                s = 4;
            } else if (num == AnonymousClass05K.A00) {
                GD9 gd9 = this.A07;
                C267324bN A022 = gd9.A02();
                if (this.A00 == null && C52012GBj.A01(gd9.A00) == 0) {
                    this.A00 = A022;
                    return;
                } else if (!0qQ.A0K(A022, this.A00)) {
                    this.A00 = A022;
                    if (!this.A02) {
                        quickPerformanceLogger = this.A04;
                        i = 31790981;
                        quickPerformanceLogger.markerStart(31790981);
                        this.A02 = true;
                        quickPerformanceLogger.markerAnnotate(31790981, "navigation_source", this.A05);
                        C267324bN r0 = this.A00;
                        if (r0 != null) {
                            r1 = r0.A01;
                        } else {
                            r1 = null;
                        }
                        if (r1 == C295365o2.GHOST) {
                            quickPerformanceLogger.markerAnnotate(31790981, "wait_for_api_response", true);
                        }
                        quickPerformanceLogger.markerAnnotate(31790981, "APP_STARTUP_TIME_BUCKET", C64031Cc.A00());
                        if (0qQ.A0K(this.A01, this.A00) && this.A02) {
                            s = 2;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
            quickPerformanceLogger.markerEnd(i, s);
            this.A02 = false;
        }
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public final void Dxm(C267324bN r5, Integer num, int i) {
        C295365o2 r1;
        0qQ.A0B(r5, 0);
        this.A01 = r5;
        if (this.A02) {
            C267324bN r2 = this.A00;
            if (r2 != null) {
                r1 = r2.A01;
            } else {
                r1 = null;
            }
            if (r1 == C295365o2.GHOST || 0qQ.A0K(r2, r5)) {
                QuickPerformanceLogger quickPerformanceLogger = this.A04;
                quickPerformanceLogger.markerPoint(31790981, "VIDEO_PLAYED");
                if (this.A02) {
                    quickPerformanceLogger.markerEnd(31790981, 2);
                    this.A02 = false;
                }
            }
        }
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final void onPause() {
        this.A00 = null;
        this.A01 = null;
        if (this.A02) {
            this.A04.markerEnd(31790981, 4);
            this.A02 = false;
        }
        this.A03 = false;
    }

    public final void onResume() {
        this.A03 = true;
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void D3r(H3D h3d) {
        C295365o2 r1;
        if (this.A02) {
            C267324bN r0 = this.A00;
            if (r0 != null) {
                r1 = r0.A01;
            } else {
                r1 = null;
            }
            if (r1 == C295365o2.GHOST) {
                this.A04.markerEnd(31790981, 208);
                this.A02 = false;
            }
        }
    }

    public final void D3t(C52228GJt gJt) {
        C295365o2 r1;
        if (this.A02) {
            C267324bN r0 = this.A00;
            if (r0 != null) {
                r1 = r0.A01;
            } else {
                r1 = null;
            }
            if (r1 == C295365o2.GHOST) {
                this.A04.markerPoint(31790981, "CLIPS_FETCH_START");
            }
        }
    }

    public final void Dzs() {
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void DxZ(C267324bN r1, int i, int i2) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void DaS(C267324bN r1, int i, int i2, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
