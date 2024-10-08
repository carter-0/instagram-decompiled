package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class ARe implements AnonymousClass8z2, C41801B1g {
    public C41810B1p A00;
    public boolean A01;
    public boolean A02;
    public final Integer A03;
    public final List A04 = AnonymousClass7TE.A1C();

    public final List EzQ(Bundle bundle) {
        C41810B1p b1p;
        C391119sN r0;
        C41810B1p b1p2;
        0qQ.A0B(bundle, 0);
        if (bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 4) {
                if (bundle.containsKey("hasRawData")) {
                    this.A01 = bundle.getBoolean("hasRawData");
                }
                if (bundle.containsKey("isSensorAvailable")) {
                    this.A02 = bundle.getBoolean("isSensorAvailable");
                }
            } else if (i == 2) {
                if (bundle.containsKey("deviceRotationMatrix") && bundle.containsKey("acceleration") && bundle.containsKey("gravity") && bundle.containsKey("rotation") && bundle.containsKey("timestampNs")) {
                    float[] floatArray = bundle.getFloatArray("deviceRotationMatrix");
                    float[] floatArray2 = bundle.getFloatArray("acceleration");
                    float[] floatArray3 = bundle.getFloatArray("gravity");
                    float[] floatArray4 = bundle.getFloatArray("rotation");
                    long j = bundle.getLong("timestampNs");
                    if (!(floatArray == null || floatArray2 == null || floatArray3 == null || floatArray4 == null || (b1p2 = this.A00) == null)) {
                        b1p2.onDataChanged(floatArray, floatArray2, floatArray3, floatArray4, j);
                    }
                }
            } else if (i == 3 && bundle.containsKey("measurementType") && bundle.containsKey("data") && bundle.containsKey("timestampNs")) {
                int i2 = bundle.getInt("measurementType");
                float[] floatArray5 = bundle.getFloatArray("data");
                long j2 = bundle.getLong("timestampNs");
                if (!(floatArray5 == null || (b1p = this.A00) == null)) {
                    switch (i2) {
                        case 1:
                            r0 = C391119sN.ATTITUDE;
                            break;
                        case 2:
                            r0 = C391119sN.GRAVITY;
                            break;
                        case 3:
                            r0 = C391119sN.ACCELERATION;
                            break;
                        case 4:
                            r0 = C391119sN.ROTATION_RATE;
                            break;
                        case 5:
                            r0 = C391119sN.RAW_GYROSCOPE;
                            break;
                        case 6:
                            r0 = C391119sN.RAW_ACCELEROMETER;
                            break;
                        case 7:
                            r0 = C391119sN.RAW_MAGNETOMETER;
                            break;
                        default:
                            r0 = C391119sN.UNKNOWN;
                            break;
                    }
                    b1p.onRawSensorMeasurementChanged(r0, floatArray5, j2);
                }
            }
        }
        List list = this.A04;
        ArrayList A0U = 00k.A0U(list);
        list.clear();
        return A0U;
    }

    public final Integer B2T() {
        Integer num;
        Integer num2 = this.A03;
        if (num2 == null) {
            return AnonymousClass05K.A00;
        }
        if (num2.intValue() != 1) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        0qQ.A07(num);
        return num;
    }

    public final boolean CKS() {
        return this.A01;
    }

    public final boolean Cbe(int i) {
        if (i == 0) {
            return this.A02;
        }
        0KC.A0C("MotionDataSource", "Only supports RotationVector Sensor type");
        return false;
    }

    public final void start() {
        AnonymousClass7TH.A0d(AnonymousClass05K.A00, this.A04, AnonymousClass7TF.A0x("serviceType", 51));
    }

    public final void stop() {
        AnonymousClass7TH.A0d(AnonymousClass05K.A01, this.A04, AnonymousClass7TF.A0x("serviceType", 51));
    }

    public ARe(Integer num) {
        this.A03 = num;
    }

    public final void A8u(C41810B1p b1p) {
        this.A00 = b1p;
    }
}
