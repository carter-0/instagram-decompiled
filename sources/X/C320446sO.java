package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Locale;

/* renamed from: X.6sO  reason: invalid class name and case insensitive filesystem */
public final class C320446sO {
    public boolean A00 = true;
    public final 02m A01;
    public final 0k8 A02;

    public static final void A00(C320446sO r4, Integer num) {
        String str;
        if (r4.A00) {
            02m r3 = r4.A01;
            switch (num.intValue()) {
                case 0:
                    str = "PREFETCH_CACHE";
                    break;
                case 1:
                    str = "FLASH_CACHE";
                    break;
                default:
                    str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                    break;
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            0qQ.A07(lowerCase);
            r3.markerAnnotate(749812461, "cache_hit", lowerCase);
            r3.markerEnd(749812461, 2);
            r4.A00 = false;
        }
    }

    public static final void A01(C320446sO r3, Integer num) {
        if (r3.A00) {
            String lowerCase = B59.A00(num).toLowerCase(Locale.ROOT);
            0qQ.A07(lowerCase);
            String A0R = 002.A0R(lowerCase, "_end");
            r3.A01.markerPoint(749812461, A0R);
            r3.A02.CmM(A0R);
        }
    }

    public static final void A02(C320446sO r4, Integer num) {
        if (r4.A00) {
            if (num == AnonymousClass05K.A00) {
                02m r3 = r4.A01;
                r3.markerStart(749812461);
                r3.markerAnnotate(749812461, "logger_version", 2);
            }
            String lowerCase = B59.A00(num).toLowerCase(Locale.ROOT);
            0qQ.A07(lowerCase);
            String A0R = 002.A0R(lowerCase, "_start");
            r4.A01.markerPoint(749812461, A0R);
            r4.A02.CmM(A0R);
        }
    }

    public final void A03() {
        if (this.A00) {
            02m r4 = this.A01;
            Locale locale = Locale.ROOT;
            String lowerCase = "ON_RESPONSE_POINT".toLowerCase(locale);
            0qQ.A07(lowerCase);
            r4.markerPoint(749812461, lowerCase);
            0k8 r1 = this.A02;
            String lowerCase2 = "ON_RESPONSE_POINT".toLowerCase(locale);
            0qQ.A07(lowerCase2);
            r1.CmM(lowerCase2);
        }
    }

    public C320446sO(02m r2, 0k8 r3) {
        this.A01 = r2;
        this.A02 = r3;
    }
}
