package X;

import android.os.Bundle;
import java.util.List;

public final class ARd implements C41810B1p, B38 {
    public AnonymousClass8z2 A00;
    public Boolean A01 = false;
    public Boolean A02 = false;
    public Integer A03 = 0;
    public final List A04 = AnonymousClass7TE.A1C();

    public final void FKT(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        AnonymousClass8z2 r2 = this.A00;
        if (r2 != null && bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 0) {
                r2.start();
            } else if (i == 1) {
                r2.stop();
            }
        }
    }

    public final Bundle BH4() {
        return AnonymousClass7TG.A0P("executionMode", this.A03, AnonymousClass7TF.A0x("serviceType", 51));
    }

    public final void CMw(C371698yt r3) {
        AnonymousClass8z2 r0;
        Integer B2T;
        int i;
        if (r3 != null) {
            C371628yi r1 = C371738z0.A01;
            if (C371698yt.A01(r3, r1)) {
                C371738z0 r02 = (C371738z0) r3.A02(r1);
                Integer num = null;
                if (r02 != null) {
                    r0 = r02.A00;
                } else {
                    r0 = null;
                }
                this.A00 = r0;
                if (!(r0 == null || (B2T = r0.B2T()) == null)) {
                    if (1 - B2T.intValue() != 0) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    num = Integer.valueOf(i);
                }
                this.A03 = num;
                AnonymousClass8z2 r03 = this.A00;
                if (r03 != null) {
                    r03.A8u(this);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        if (r2 != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List EzR() {
        /*
            r6 = this;
            java.lang.Boolean r1 = r6.A01
            X.8z2 r0 = r6.A00
            r4 = 0
            if (r0 == 0) goto L_0x008c
            boolean r0 = r0.CKS()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x000f:
            boolean r0 = X.0qQ.A0K(r1, r0)
            r3 = 0
            if (r0 != 0) goto L_0x008a
            X.8z2 r0 = r6.A00
            if (r0 == 0) goto L_0x0088
            boolean r0 = r0.CKS()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0022:
            r6.A01 = r0
            r2 = 1
        L_0x0025:
            java.lang.Boolean r1 = r6.A02
            X.8z2 r0 = r6.A00
            if (r0 == 0) goto L_0x0086
            boolean r0 = r0.Cbe(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0033:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0083
            X.8z2 r0 = r6.A00
            if (r0 == 0) goto L_0x0045
            boolean r0 = r0.Cbe(r3)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L_0x0045:
            r6.A02 = r4
        L_0x0047:
            java.util.List r5 = r6.A04
            java.lang.String r1 = "serviceType"
            r0 = 51
            X.0eP r4 = X.AnonymousClass7TF.A0x(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.0eP r3 = X.AnonymousClass7TH.A0J(r0)
            java.lang.Boolean r1 = r6.A01
            java.lang.String r0 = "hasRawData"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.Boolean r1 = r6.A02
            java.lang.String r0 = "isSensorAvailable"
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r1, r4, r3, r2)
            X.AnonymousClass7TH.A0f(r5, r0)
        L_0x006a:
            java.util.List r2 = r6.A04
            java.util.ArrayList r1 = X.00k.A0U(r2)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x007f
            r0 = 51
            android.os.Bundle r0 = X.AnonymousClass7TH.A05(r0)
            r1.add(r0)
        L_0x007f:
            r2.clear()
            return r1
        L_0x0083:
            if (r2 == 0) goto L_0x006a
            goto L_0x0047
        L_0x0086:
            r0 = r4
            goto L_0x0033
        L_0x0088:
            r0 = r4
            goto L_0x0022
        L_0x008a:
            r2 = 0
            goto L_0x0025
        L_0x008c:
            r0 = r4
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARd.EzR():java.util.List");
    }

    public final void onDataChanged(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j) {
        AnonymousClass7TH.A0f(this.A04, new 0eP[]{AnonymousClass7TF.A0x("serviceType", 51), AnonymousClass7TH.A0J(AnonymousClass05K.A0C), AnonymousClass7TE.A1L("deviceRotationMatrix", fArr), AnonymousClass7TE.A1L("acceleration", fArr2), AnonymousClass7TE.A1L("gravity", fArr3), AnonymousClass7TE.A1L("rotation", fArr4), AnonymousClass7TE.A1L("timestampNs", Long.valueOf(j))});
    }

    public final void onRawSensorMeasurementChanged(C391119sN r8, float[] fArr, long j) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(fArr, 1);
        AnonymousClass7TH.A0f(this.A04, new 0eP[]{AnonymousClass7TF.A0x("serviceType", 51), AnonymousClass7TH.A0J(AnonymousClass05K.A0N), AnonymousClass7TF.A0x("measurementType", r8.ordinal()), AnonymousClass7TE.A1L("data", fArr), AnonymousClass7TE.A1L("timestampNs", Long.valueOf(j))});
    }
}
