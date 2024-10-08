package X;

import android.content.Context;
import android.graphics.Color;

public abstract class I2I {
    public static final Integer A02(C278014w6 r5) {
        int i;
        0qQ.A0B(r5, 0);
        Integer Aiw = r5.Aiw();
        if (Aiw != null) {
            int intValue = Aiw.intValue();
            for (Integer num : AnonymousClass05K.A00(4)) {
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == intValue) {
                    return num;
                }
            }
        }
        return null;
    }

    public static final int A00(Context context, C278014w6 r1, int i) {
        String light;
        C46269DSy C53 = r1.C53();
        if (C53 == null) {
            return context.getColor(i);
        }
        if (AnonymousClass3HA.A00(context)) {
            light = C53.getDark();
        } else {
            light = C53.getLight();
        }
        return Color.parseColor(light);
    }

    public static final Integer A01(C278014w6 r5) {
        int i;
        Integer AYG = r5.AYG();
        if (AYG != null) {
            int intValue = AYG.intValue();
            for (Integer num : AnonymousClass05K.A00(5)) {
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 4;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == intValue) {
                    return num;
                }
            }
        }
        return null;
    }
}
