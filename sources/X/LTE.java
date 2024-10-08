package X;

import android.os.Build;
import com.instagram.common.session.UserSession;
import com.instagram.util.jpeg.JpegBridge;

public final class LTE {
    public static Integer A00;
    public static Integer A01;
    public static Integer A02;
    public static Integer A03;

    public static synchronized int A00(int i) {
        int i2;
        synchronized (LTE.class) {
            A05();
            int intValue = A00.intValue();
            if (i >= intValue) {
                i2 = A02.intValue();
            } else {
                int intValue2 = A01.intValue();
                if (i <= intValue2) {
                    i2 = A03.intValue();
                } else {
                    int intValue3 = A02.intValue();
                    int intValue4 = A03.intValue();
                    float f = ((float) (intValue3 - intValue4)) / ((float) (intValue - intValue2));
                    i2 = Math.round((f * ((float) i)) + (((float) intValue4) - (((float) intValue2) * f)));
                }
            }
        }
        return i2;
    }

    public static synchronized int A01(UserSession userSession) {
        int intValue;
        synchronized (LTE.class) {
            intValue = AnonymousClass7TF.A0Y(0Tu.A05, userSession, 36593980355380772L).intValue();
        }
        return intValue;
    }

    public static int A02(UserSession userSession, int i) {
        int A002;
        if (i > 1080) {
            A002 = AnonymousClass7TF.A0Y(0Tu.A05, userSession, 36593980355446309L).intValue();
        } else {
            A002 = A00(i);
        }
        0Tu r8 = 0Tu.A05;
        if (182.A06(r8, userSession, 36311869723509542L)) {
            long A012 = (long) C64011Bq.A00().A01();
            long A013 = 182.A01(r8, userSession, 36593344700417144L);
            if (A012 > 0 && A012 >= A013) {
                A002 += AnonymousClass7TF.A0Y(r8, userSession, 36593344700482681L).intValue();
            }
        }
        return Math.min(100, A002);
    }

    public static String A04(String str) {
        if ("image/jpeg".equals(str)) {
            if (JpegBridge.A01()) {
                return JpegBridge.getJpegLibraryVersionNative();
            }
            return AnonymousClass000.A00(689);
        } else if ("image/webp".equals(str) || "image/heic".equals(str)) {
            return String.valueOf(Build.VERSION.SDK_INT);
        } else {
            return "unknown";
        }
    }

    public static synchronized void A05() {
        synchronized (LTE.class) {
            if (A01 == null || A03 == null || A00 == null || A02 == null) {
                A03 = 95;
                A02 = 70;
                A01 = 200;
                A00 = 1080;
            }
        }
    }

    public static String A03(UserSession userSession) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("highres");
        A1A.append(' ');
        synchronized (LTE.class) {
        }
        A1A.append(320);
        A1A.append('-');
        A1A.append(A01(userSession));
        return A1A.toString();
    }
}
