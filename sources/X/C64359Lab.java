package X;

import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.Lab  reason: case insensitive filesystem */
public final class C64359Lab implements C22559YAv {
    public final AvatarsNativeInputDelegate A00;
    public final /* synthetic */ C64164LRf A01;

    public final String Bbu() {
        return null;
    }

    public final void ELO(String str) {
        0qQ.A0B(str, 0);
        C63572KzL kzL = this.A01.A0D.A00;
        if (kzL != null) {
            C64164LRf lRf = kzL.A00;
            lRf.A0J.FIA(new C60807Jrc(str));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C64359Lab(C64164LRf lRf) {
        this();
        this.A01 = lRf;
    }

    public final void CxL() {
        C64164LRf lRf = this.A01;
        if (lRf.A0K) {
            lRf.A0A = true;
        }
        C62977KpT.A00(lRf, AnonymousClass05K.A06);
    }

    public final void DKb() {
        C62977KpT.A00(this.A01, AnonymousClass05K.A04);
    }

    public final void DOJ(String str) {
        C64164LRf lRf = this.A01;
        if (lRf.A0K) {
            C62977KpT.A00(lRf, AnonymousClass05K.A08);
        }
    }

    public final void DOV(String str) {
        QuickPerformanceLogger quickPerformanceLogger;
        C64164LRf lRf = this.A01;
        if (lRf.A0K) {
            lRf.A08 = true;
            LGB lgb = lRf.A0C;
            if (lgb != null && lgb.A09 && (quickPerformanceLogger = lRf.A0G) != null) {
                quickPerformanceLogger.markerPoint(603995461, "avatar_load_end");
            }
        }
    }

    public final void ELP(String str, String str2, boolean z, String str3) {
        C51974G9v.A1K(str, str2, str3);
        C63572KzL kzL = this.A01.A0D.A00;
        if (kzL != null) {
            C64164LRf lRf = kzL.A00;
            lRf.A0J.FIA(new C60808Jrd(z, str3));
        }
    }

    public C64359Lab() {
        this.A00 = new AvatarsNativeInputDelegate();
    }
}
