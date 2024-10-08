package X;

import android.content.res.Resources;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import org.webrtc.CameraCapturer;

/* renamed from: X.3rC  reason: invalid class name and case insensitive filesystem */
public final class C253673rC {
    public static final C253673rC A00 = new Object();
    public static final ThreadLocal A01 = new ThreadLocal();
    public static final Set A02 = 0sc.A07(new Locale[]{Locale.CHINA, Locale.TAIWAN, Locale.JAPAN, Locale.KOREA});

    public static final int A00(Integer num, double d) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 1;
        while (true) {
            int intValue = num.intValue();
            if (intValue != 0) {
                i = 3;
            } else {
                i = 4;
            }
            int i5 = i + i3;
            if (intValue != 0) {
                i2 = 9;
            } else {
                i2 = 8;
            }
            if (i5 > i2) {
                break;
            }
            i4 *= (int) Math.pow(10.0d, (double) i);
            if (((double) i4) > d) {
                break;
            }
            i3 += i;
        }
        return i3;
    }

    public static final String A02(Resources resources, Integer num) {
        0qQ.A0B(resources, 1);
        return A04(resources, num, CameraCapturer.OPEN_CAMERA_TIMEOUT, true, false);
    }

    public static final String A04(Resources resources, Integer num, int i, boolean z, boolean z2) {
        Integer num2;
        String A05;
        String str;
        int i2;
        String string;
        NumberFormat integerInstance;
        0qQ.A0B(resources, 1);
        if (num == null) {
            return "";
        }
        int intValue = num.intValue();
        if (intValue < i) {
            Locale A022 = AnonymousClass1Q2.A02();
            ThreadLocal threadLocal = A01;
            0eP r1 = (0eP) threadLocal.get();
            if (r1 == null || r1.A00 != A022) {
                integerInstance = NumberFormat.getIntegerInstance(A022);
                threadLocal.set(new 0eP(A022, integerInstance));
                0qQ.A0A(integerInstance);
            } else {
                integerInstance = (NumberFormat) r1.A01;
            }
            string = integerInstance.format((long) intValue);
        } else {
            Locale A023 = AnonymousClass1Q2.A02();
            C253673rC r12 = A00;
            if (A02.contains(A023)) {
                num2 = AnonymousClass05K.A00;
            } else {
                num2 = AnonymousClass05K.A01;
            }
            if (r12.A06(A023, intValue, i)) {
                A05 = String.format(A023, "%d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (((double) intValue) / Math.pow(10.0d, 3.0d)))}, 1));
                0qQ.A07(A05);
                str = "%s";
            } else {
                A05 = r12.A05(z2, intValue, A023);
                int A002 = A00(num2, (double) intValue);
                str = "%s";
                if (A002 != 3) {
                    if (A002 == 4) {
                        i2 = 2131973855;
                    } else if (A002 == 6) {
                        i2 = 2131973853;
                        if (z) {
                            i2 = 2131973854;
                        }
                    } else if (A002 == 8) {
                        i2 = 2131973852;
                    } else if (A002 == 9) {
                        i2 = 2131973850;
                        if (z) {
                            i2 = 2131973851;
                        }
                    } else {
                        throw new RuntimeException(002.A0O(AnonymousClass000.A00(969), A002));
                    }
                    string = resources.getString(i2, new Object[]{0mp.A06(str, new Object[]{A05})});
                }
            }
            i2 = 2131973856;
            if (z) {
                i2 = 2131973857;
            }
            string = resources.getString(i2, new Object[]{0mp.A06(str, new Object[]{A05})});
        }
        0qQ.A07(string);
        return string;
    }

    public static final C266444Yx A01(int i) {
        Integer num;
        int i2;
        Object[] objArr;
        if (i < 10000) {
            return JUH.A00(String.valueOf(i));
        }
        Locale A022 = AnonymousClass1Q2.A02();
        C253673rC r1 = A00;
        if (A02.contains(A022)) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        if (r1.A06(A022, i, CameraCapturer.OPEN_CAMERA_TIMEOUT)) {
            String format = String.format(A022, "%d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (((double) i) / Math.pow(10.0d, 3.0d)))}, 1));
            0qQ.A07(format);
            i2 = 2131973856;
            objArr = new Object[]{format};
        } else {
            String A05 = r1.A05(false, i, A022);
            int A002 = A00(num, (double) i);
            if (A002 == 3) {
                i2 = 2131973856;
            } else if (A002 == 4) {
                i2 = 2131973855;
            } else if (A002 == 6) {
                i2 = 2131973853;
            } else if (A002 == 8) {
                i2 = 2131973852;
            } else if (A002 == 9) {
                i2 = 2131973850;
            } else {
                throw new RuntimeException(002.A0O(AnonymousClass000.A00(969), A002));
            }
            objArr = new Object[]{A05};
        }
        return new GKO(new Object[]{0mp.A06("%s", objArr)}, i2);
    }

    public static final String A03(Resources resources, Integer num) {
        return A04(resources, num, CameraCapturer.OPEN_CAMERA_TIMEOUT, true, false);
    }

    private final String A05(boolean z, int i, Locale locale) {
        Integer num;
        int i2;
        double floor;
        double d;
        String str;
        if (A02.contains(locale)) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        double d2 = (double) i;
        if (num.intValue() != 0) {
            i2 = 3;
        } else {
            i2 = 4;
        }
        double d3 = (double) i2;
        double pow = d2 / Math.pow(Math.pow(10.0d, d3), Math.floor(Math.floor(Math.log10(d2)) / d3));
        if (pow >= Math.pow(10.0d, (double) (i2 - 1))) {
            d = Math.floor(pow);
        } else {
            double d4 = pow * 10.0d;
            if (z) {
                floor = (double) Math.round(d4);
            } else {
                floor = Math.floor(d4);
            }
            d = floor / 10.0d;
        }
        if (((int) Math.floor(10.0d * d)) % 10 == 0) {
            str = "%.0f";
        } else {
            str = "%.1f";
        }
        String format = String.format(locale, str, Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        0qQ.A07(format);
        return format;
    }

    private final boolean A06(Locale locale, int i, int i2) {
        Integer num;
        if (A02.contains(locale)) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        if (num == AnonymousClass05K.A00) {
            double pow = Math.pow(10.0d, 4.0d);
            if (((double) i2) < pow) {
                double d = (double) i;
                if (d < Math.pow(10.0d, 3.0d) || d >= pow) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
