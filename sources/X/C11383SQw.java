package X;

import android.os.Handler;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.SQw  reason: case insensitive filesystem */
public final class C11383SQw {
    public static void A00(C274844pB r20, 0N1 r21, byte[] bArr, int i) {
        Integer num;
        byte b;
        byte[] bArr2 = bArr;
        short s = 0;
        int i2 = i;
        Arrays.fill(bArr2, i2, bArr2.length, (byte) 0);
        C274844pB r8 = r20;
        List<C10803RyP> list = r8.A0A;
        if (list != null) {
            long A01 = r8.A01();
            for (C10803RyP ryP : list) {
                long j = r8.A02;
                long j2 = ryP.A02;
                long j3 = j2 - j;
                if (j3 < A01) {
                    int i3 = i + 2 + (s * 133);
                    A01(bArr2, i3, (long) ((int) j3));
                    A01(bArr2, i3 + 4, ryP.A01 - j2);
                    int i4 = i3 + 8;
                    if (ryP.A06) {
                        num = AnonymousClass05K.A0C;
                    } else {
                        num = AnonymousClass05K.A01;
                    }
                    if (1 - num.intValue() != 0) {
                        b = 1;
                    } else {
                        b = 2;
                    }
                    bArr[i4] = b;
                    String str = ryP.A04;
                    if (str == null) {
                        str = "";
                    }
                    0N1 r4 = r21;
                    0Mq.A06(bArr2, i3 + 9, r4.A02(str));
                    StackTraceElement[] stackTraceElementArr = ryP.A07;
                    if (stackTraceElementArr != null) {
                        int length = stackTraceElementArr.length;
                        byte b2 = 24;
                        if (length < 24) {
                            b2 = (byte) length;
                        }
                        bArr[i3 + 11] = b2;
                        for (byte b3 = 0; b3 < b2; b3 = (byte) (b3 + 1)) {
                            0Mq.A06(bArr2, i3 + 12 + (b3 * 2), r4.A02(ryP.A07[b3].toString()));
                        }
                    }
                    S3X s3x = ryP.A03;
                    if (s3x != null) {
                        int i5 = i3 + 12 + 48;
                        try {
                            JSONObject A11 = DbS.A11();
                            s3x.A00(A11);
                            String[] strArr = C58880Au.A01;
                            int i6 = 0;
                            int i7 = 0;
                            do {
                                String str2 = strArr[i6];
                                if (!A11.optString(str2).equals("")) {
                                    0Mq.A06(bArr2, i5 + i7, r4.A02(A11.getString(str2)));
                                }
                                i7 += 2;
                                i6++;
                            } while (i6 < 4);
                            String[] strArr2 = C58880Au.A00;
                            int i8 = 0;
                            do {
                                String str3 = strArr2[i8];
                                if (A11.optLong(str3) != 0) {
                                    0Mq.A04(A11.getLong(str3), bArr2, i5 + i7);
                                }
                                i7 += 8;
                                i8++;
                            } while (i8 < 4);
                            JSONArray optJSONArray = A11.optJSONArray("render_thread_native_stack_trace");
                            if (optJSONArray != null) {
                                byte b4 = 16;
                                if (optJSONArray.length() < 16) {
                                    b4 = (byte) optJSONArray.length();
                                }
                                bArr[i5 + 40] = b4;
                                for (byte b5 = 0; b5 < b4; b5 = (byte) (b5 + 1)) {
                                    0Mq.A06(bArr2, i5 + 41 + (b5 * 2), r4.A02(optJSONArray.get(b5).toString()));
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    s = (short) (s + 1);
                    if (s >= 5) {
                        break;
                    }
                }
            }
            0Mq.A06(bArr2, i2, s);
        }
    }

    public final Integer A03(C274844pB r18, 0N1 r19, byte[] bArr, long j) {
        byte b;
        String str;
        String str2;
        String str3;
        long j2;
        Handler handler;
        C274844pB r5 = r18;
        byte[] bArr2 = bArr;
        A01(bArr2, 0, r5.A02 - j);
        0N1 r7 = r19;
        if (!r5.A0A) {
            Class cls = r5.A09;
            String str4 = null;
            if (cls != null) {
                str2 = cls.getName();
            } else {
                str2 = null;
            }
            Class cls2 = r5.A07;
            if (cls2 != null) {
                str3 = cls2.getName();
            } else {
                str3 = null;
            }
            Class cls3 = r5.A08;
            if (cls3 != null) {
                str4 = cls3.getName();
            }
            short[] sArr = r5.A0E;
            String[] strArr = {str2, str3, str4};
            synchronized (r7) {
                boolean z = false;
                for (int i = 0; i < 3; i++) {
                    String str5 = strArr[i];
                    sArr[i] = 0;
                    if (str5 != null) {
                        Properties properties = r7.A04;
                        String property = properties.getProperty(str5);
                        if (property == null) {
                            short s = (short) (r7.A00 + 1);
                            r7.A00 = s;
                            sArr[i] = s;
                            properties.setProperty(str5, Short.toString(s));
                            z = true;
                        } else {
                            sArr[i] = Short.parseShort(property);
                        }
                    }
                }
                if (z && (handler = r7.A03) != null) {
                    handler.post(new 0N0(r7));
                }
            }
            0Mq.A06(bArr2, 4, sArr[0]);
            0Mq.A06(bArr2, 6, sArr[1]);
            0Mq.A03(r5.A00, bArr2, 8);
            0Mq.A06(bArr2, 12, sArr[2]);
            long j3 = r5.A06;
            if (j3 > 0) {
                j2 = r5.A02 - j3;
            } else {
                j2 = -1;
            }
            if (j2 > 0) {
                0Mq.A06(bArr2, 14, (short) ((int) j2));
            } else {
                bArr[14] = 0;
                bArr[15] = 0;
            }
        } else {
            if (r5.A07 == AnonymousClass05K.A01) {
                str = "nativePollOnce:bg";
            } else {
                str = "nativePollOnce";
            }
            0Mq.A06(bArr2, 4, r7.A02(str));
            Arrays.fill(bArr2, 6, 16, (byte) 0);
        }
        0Mq.A04(r5.A03, bArr2, 16);
        switch (r5.A07.intValue()) {
            case 0:
                b = 0;
                break;
            case 1:
                b = 2;
                break;
            default:
                b = 1;
                break;
        }
        bArr[24] = b;
        if (!AnonymousClass7TF.A1P((r5.A05 > -1 ? 1 : (r5.A05 == -1 ? 0 : -1)))) {
            return AnonymousClass05K.A0C;
        }
        if (A02(r5, r7, bArr2, 25)) {
            return AnonymousClass05K.A0j;
        }
        return AnonymousClass05K.A01;
    }

    public static void A01(byte[] bArr, int i, long j) {
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        0Mq.A03((int) j, bArr, i);
    }

    public static final boolean A02(C274844pB r3, 0N1 r4, byte[] bArr, int i) {
        byte b;
        A01(bArr, i, r3.A01());
        A01(bArr, i + 4, r3.A00());
        int i2 = i + 8;
        switch (r3.A06.intValue()) {
            case 0:
                b = 0;
                break;
            case 1:
                b = 2;
                break;
            default:
                b = 1;
                break;
        }
        bArr[i2] = b;
        List list = r3.A0A;
        if (list == null || list.isEmpty()) {
            return false;
        }
        A00(r3, r4, bArr, i + 9);
        return true;
    }
}
