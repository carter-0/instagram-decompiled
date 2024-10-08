package X;

import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.5q2  reason: invalid class name and case insensitive filesystem */
public abstract class C296425q2 {
    public static final int[] A00 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] A01 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, 7350};

    public static int A00(C284825Ob r3) {
        String str;
        int A012 = r3.A01(4);
        if (A012 == 15) {
            if (((r3.A01 - r3.A02) * 8) - r3.A00 >= 24) {
                return r3.A01(24);
            }
            str = "AAC header insufficient data";
        } else if (A012 < 13) {
            return A01[A012];
        } else {
            str = "AAC header wrong Sampling Frequency Index";
        }
        throw C2609347p.A00(str, (Throwable) null);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.5Ob] */
    public static C296435q3 A01(byte[] bArr) {
        int length = bArr.length;
        ? obj = new Object();
        obj.A03 = bArr;
        obj.A01 = length;
        int A012 = obj.A01(5);
        if (A012 == 31) {
            A012 = obj.A01(6) + 32;
        }
        int A002 = A00(obj);
        int A013 = obj.A01(4);
        String A0O = 002.A0O("mp4a.40.", A012);
        if (A012 == 5 || A012 == 29) {
            A002 = A00(obj);
            int A014 = obj.A01(5);
            if (A014 == 31) {
                A014 = obj.A01(6) + 32;
            }
            if (A014 == 22) {
                A013 = obj.A01(4);
            }
        }
        int i = A00[A013];
        if (i != -1) {
            return new C296435q3(A002, i, A0O);
        }
        throw C2609347p.A00((String) null, (Throwable) null);
    }
}
