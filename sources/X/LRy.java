package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;

public abstract class LRy {
    public static final 0xF A00(OMM omm, 1Cn r7) {
        0qQ.A0B(r7, 0);
        0xF r4 = new 0xF();
        r7.A04();
        1Cn.A00(r7);
        0xF.A00(r4, Integer.valueOf(r7.A00), AnonymousClass000.A00(4523));
        1Cn.A00(r7);
        0xF.A00(r4, r7.A01, AnonymousClass000.A00(4525));
        0xF.A00(r4, Integer.valueOf(r7.A01()), "screen_brightness");
        OMM A01 = OYL.A01(OYL.A02("/proc/self/stat"));
        if (!(A01 == null || omm == null)) {
            0xF.A00(r4, Double.valueOf(A01.A00 - omm.A00), C66579MXk.A00(738));
            0xF.A00(r4, Double.valueOf(A01.A01 - omm.A01), C66579MXk.A00(739));
        }
        return r4;
    }

    public static final void A03(1Ln r3, String str, String str2, String str3, String str4, int i) {
        String A0R = 002.A0R("Reason: ", str2);
        if (str3 != null) {
            A0R = 002.A0g(A0R, ", Description: ", str3);
        }
        if (str4 != null) {
            A0R = 002.A0g(A0R, ", Full Description: ", str4);
        }
        0KC.A0C("IgLiveBroadcastWaterfall", A0R);
        r3.A0Q(TraceFieldType.ErrorCode, DbS.A0j(i));
        r3.A0R(AnonymousClass000.A00(34), str);
        r3.A0R("error_info", A0R);
    }

    public static final void A01(Context context, 1Ln r2) {
        long j;
        if (AnonymousClass0Ke.A00(context) >= 2011) {
            j = 1;
        } else {
            j = 0;
        }
        r2.A0Q("supports_face_filters", Long.valueOf(j));
        r2.A0Q("has_face_effect", C51971G9r.A0m());
    }

    public static final void A02(Context context, 1Ln r2) {
        long j;
        if (AnonymousClass0Ke.A00(context) >= 2011) {
            j = 1;
        } else {
            j = 0;
        }
        r2.A0Q("supports_face_filters", Long.valueOf(j));
        r2.A0Q("has_face_effect", C51971G9r.A0m());
    }
}
