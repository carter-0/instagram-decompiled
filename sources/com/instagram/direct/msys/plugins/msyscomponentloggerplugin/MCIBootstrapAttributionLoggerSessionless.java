package com.instagram.direct.msys.plugins.msyscomponentloggerplugin;

import X.002;
import X.02m;
import X.0qQ;
import X.0sr;
import java.util.List;

public final class MCIBootstrapAttributionLoggerSessionless extends Sessionless {
    public final List markers = 0sr.A1P(new Integer[]{20131727, 20127832, 20127518});
    public final 02m qpl;

    public void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateBool(int i, int i2, String str, boolean z) {
        0qQ.A0B(str, 2);
        if (i2 == 3) {
            for (Number intValue : this.markers) {
                this.qpl.markerAnnotate(intValue.intValue(), i, 002.A0R("xplat_", str), z);
            }
        }
    }

    public void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateDouble(int i, int i2, String str, double d) {
        0qQ.A0B(str, 2);
        if (i2 == 3) {
            for (Number intValue : this.markers) {
                this.qpl.markerAnnotate(intValue.intValue(), i, 002.A0R("xplat_", str), d);
            }
        }
    }

    public void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateInt(int i, int i2, String str, long j) {
        0qQ.A0B(str, 2);
        if (i2 == 3) {
            for (Number intValue : this.markers) {
                this.qpl.markerAnnotate(intValue.intValue(), i, 002.A0R("xplat_", str), j);
            }
        }
    }

    public void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateString(int i, int i2, String str, String str2) {
        0qQ.A0B(str, 2);
        0qQ.A0B(str2, 3);
        if (i2 == 3) {
            for (Number intValue : this.markers) {
                this.qpl.markerAnnotate(intValue.intValue(), i, 002.A0R("xplat_", str), str2);
            }
        }
    }

    public void MCIComponentLogger_MCIComponentLoggerExtensionEnd(int i, int i2) {
        if (i2 == 3) {
            for (Number intValue : this.markers) {
                this.qpl.markerPoint(intValue.intValue(), i, "xplat_mci_bootstrap_end");
            }
        }
    }

    public void MCIComponentLogger_MCIComponentLoggerExtensionPoint(int i, int i2, String str) {
        0qQ.A0B(str, 2);
        if (i2 == 3) {
            for (Number intValue : this.markers) {
                this.qpl.markerPoint(intValue.intValue(), i, 002.A0R("xplat_", str));
            }
        }
    }

    public void MCIComponentLogger_MCIComponentLoggerExtensionStart(int i, int i2) {
        if (i2 == 3) {
            for (Number intValue : this.markers) {
                this.qpl.markerPoint(intValue.intValue(), i, "xplat_mci_bootstrap_start");
            }
        }
    }

    public MCIBootstrapAttributionLoggerSessionless() {
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        this.qpl = r0;
    }
}
