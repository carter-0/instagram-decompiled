package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.appreciation.analytics.LoggingFanData;
import java.util.Map;

/* renamed from: X.LRb  reason: case insensitive filesystem */
public final class C64160LRb {
    public final 2M7 A00 = 2M7.A09;
    public final C2818559v A01 = C2818559v.ANDROID;
    public final 0wc A02;

    public final void A02(C60776Jr7 jr7, String str, String str2, String str3, String str4, Map map) {
        C51973G9u.A0r(0, str, jr7, map);
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "client_load_appreciationgiver_fail");
        if (A0e.isSampled()) {
            A00(A0e, this, str);
            JTU.A0t(this.A01, A0e, jr7);
            if (!map.isEmpty()) {
                A0e.A9H("extra_data", map);
            }
            A0e.AAJ("error_message", str2);
            if (str3 != null) {
                A0e.AAJ(TraceFieldType.ErrorCode, str3);
            }
            if (str4 != null) {
                A0e.AAJ("error_stacktrace", str4);
            }
            A0e.Cgf();
        }
    }

    public final void A04(C60776Jr7 jr7, String str, Map map) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "client_load_appreciationgiver_success");
        if (A0e.isSampled()) {
            A00(A0e, this, str);
            JTU.A0t(this.A01, A0e, jr7);
            JTT.A1A(A0e, map);
        }
    }

    public static void A01(C60776Jr7 jr7, LoggingFanData loggingFanData, C64160LRb lRb) {
        lRb.A05(jr7, loggingFanData.A03, 0Yt.A0E());
    }

    public C64160LRb(0wc r2) {
        this.A02 = r2;
    }

    public static void A00(0Aj r2, C64160LRb lRb, String str) {
        r2.AAJ(Dbg.A00(), str);
        r2.A8M(lRb.A00, "product_type");
    }

    public final void A03(C60776Jr7 jr7, String str, Map map) {
        AnonymousClass7TG.A1T(str, jr7, map);
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "client_load_appreciationgiver_init");
        if (A0e.isSampled()) {
            A00(A0e, this, str);
            JTU.A0t(this.A01, A0e, jr7);
            JTT.A1A(A0e, map);
        }
    }

    public final void A05(C60776Jr7 jr7, String str, Map map) {
        DbY.A1S(str, map);
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "user_click_appreciationgiver_atomic");
        if (A0e.isSampled()) {
            A00(A0e, this, str);
            JTU.A0t(this.A01, A0e, jr7);
            JTT.A1A(A0e, map);
        }
    }
}
