package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.Ahb  reason: case insensitive filesystem */
public final class C40706Ahb implements B38 {
    public C371938zO A00;

    public final void FKT(Bundle bundle) {
        C371938zO r0;
        String str;
        0qQ.A0B(bundle, 0);
        if (this.A00 != null && bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 1) {
                if (bundle.containsKey("amplitudes") && bundle.containsKey("timings")) {
                    float[] floatArray = bundle.getFloatArray("amplitudes");
                    float[] floatArray2 = bundle.getFloatArray("timings");
                    if (floatArray != null && floatArray2 != null) {
                        int length = floatArray2.length;
                        int length2 = floatArray.length;
                        if (length != length2) {
                            str = "Vibration timings and amplitudes must be the same size";
                        } else if (length > 1000) {
                            str = "Vibrations exceeded limit";
                        } else {
                            int i2 = 0;
                            while (i2 < length) {
                                if (floatArray2[i2] < 0.0f) {
                                    str = "Vibration timings must be positive";
                                } else {
                                    int i3 = 0;
                                    while (i3 < length2) {
                                        float f = floatArray[i3];
                                        if (f < 0.0f || f > 1.0f) {
                                            str = "Amplitudes must be normalized between [0,1]";
                                        } else {
                                            i3++;
                                        }
                                    }
                                    C371938zO r2 = this.A00;
                                    if (r2 != null) {
                                        r2.FMz(new 09s(floatArray2), new 09s(floatArray));
                                    }
                                    i2++;
                                }
                            }
                            return;
                        }
                        0KC.A0C("HapticService", str);
                    }
                }
            } else if (i == 0) {
                C371938zO r02 = this.A00;
                if (r02 != null) {
                    r02.FN0();
                }
            } else if (i == 2 && (r0 = this.A00) != null) {
                r0.cancel();
            }
        }
    }

    public final Bundle BH4() {
        return AnonymousClass7TH.A05(37);
    }

    public final void CMw(C371698yt r3) {
        C371938zO r0;
        if (r3 != null) {
            C371628yi r1 = C371918zM.A01;
            if (C371698yt.A01(r3, r1)) {
                C371918zM r02 = (C371918zM) r3.A02(r1);
                if (r02 != null) {
                    r0 = r02.A00;
                } else {
                    r0 = null;
                }
                this.A00 = r0;
            }
        }
    }

    public final List EzR() {
        return AnonymousClass7TE.A1I(AnonymousClass7TH.A05(37));
    }
}
