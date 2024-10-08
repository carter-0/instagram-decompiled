package X;

import android.media.MediaCodecInfo;
import android.os.Build;

/* renamed from: X.5fS  reason: invalid class name and case insensitive filesystem */
public final class C290525fS {
    public static final C290525fS A00 = new Object();
    public static final AnonymousClass0eM A01;
    public static final AnonymousClass0eM A02;
    public static final AnonymousClass0eM A03;
    public static final AnonymousClass0eM A04;
    public static final AnonymousClass0eM A05;
    public static final AnonymousClass0eM A06;

    public static final boolean A01(String str) {
        try {
            MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) A01.getValue();
            0qQ.A07(mediaCodecInfoArr);
            for (MediaCodecInfo mediaCodecInfo : mediaCodecInfoArr) {
                0qQ.A0A(mediaCodecInfo);
                if (!mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    0qQ.A07(supportedTypes);
                    if (03t.A0O(str, supportedTypes) && A00(mediaCodecInfo)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            0KC.A0G("DecoderCapabilityUtil", "hardwareSupport error", e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if ((!X.00k.A0l(r6, X.00k.A0k(r11)).isEmpty()) == false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(java.lang.String r10, java.util.Set r11) {
        /*
            r9 = 0
            X.0eM r0 = A01     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r4 = r0.getValue()     // Catch:{ Exception -> 0x0067 }
            android.media.MediaCodecInfo[] r4 = (android.media.MediaCodecInfo[]) r4     // Catch:{ Exception -> 0x0067 }
            X.0qQ.A07(r4)     // Catch:{ Exception -> 0x0067 }
            int r3 = r4.length     // Catch:{ Exception -> 0x0067 }
            r2 = 0
            goto L_0x0011
        L_0x000f:
            int r2 = r2 + 1
        L_0x0011:
            if (r2 >= r3) goto L_0x0066
            r5 = r4[r2]     // Catch:{ Exception -> 0x0067 }
            java.lang.String[] r0 = r5.getSupportedTypes()     // Catch:{ Exception -> 0x0067 }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x0067 }
            boolean r0 = X.03t.A0O(r10, r0)     // Catch:{ Exception -> 0x0067 }
            if (r0 == 0) goto L_0x0054
            android.media.MediaCodecInfo$CodecCapabilities r0 = r5.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x0067 }
            if (r0 == 0) goto L_0x0054
            android.media.MediaCodecInfo$CodecProfileLevel[] r8 = r0.profileLevels     // Catch:{ Exception -> 0x0067 }
            if (r8 == 0) goto L_0x0054
            int r7 = r8.length     // Catch:{ Exception -> 0x0067 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0067 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0067 }
            r1 = 0
        L_0x0033:
            if (r1 >= r7) goto L_0x0043
            r0 = r8[r1]     // Catch:{ Exception -> 0x0067 }
            int r0 = r0.profile     // Catch:{ Exception -> 0x0067 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0067 }
            r6.add(r0)     // Catch:{ Exception -> 0x0067 }
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0043:
            java.util.Set r0 = X.00k.A0k(r11)     // Catch:{ Exception -> 0x0067 }
            java.util.Set r0 = X.00k.A0l(r6, r0)     // Catch:{ Exception -> 0x0067 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0067 }
            r0 = r0 ^ 1
            r1 = 1
            if (r0 != 0) goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            boolean r0 = r5.isEncoder()     // Catch:{ Exception -> 0x0067 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x000f
            if (r1 == 0) goto L_0x000f
            boolean r0 = A00(r5)     // Catch:{ Exception -> 0x0067 }
            if (r0 == 0) goto L_0x000f
            r9 = 1
        L_0x0066:
            return r9
        L_0x0067:
            r2 = move-exception
            java.lang.String r1 = "DecoderCapabilityUtil"
            java.lang.String r0 = "tenBitSupport error"
            X.0KC.A0G(r1, r0, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290525fS.A02(java.lang.String, java.util.Set):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.5fS, java.lang.Object] */
    static {
        0eO r1 = 0eO.A02;
        A01 = AnonymousClass0eN.A00(r1, C290535fT.A00);
        A02 = AnonymousClass0eN.A00(r1, C290545fU.A00);
        A04 = AnonymousClass0eN.A00(r1, C290555fV.A00);
        A03 = AnonymousClass0eN.A00(r1, C290565fW.A00);
        A05 = AnonymousClass0eN.A00(r1, C290575fX.A00);
        A06 = AnonymousClass0eN.A00(r1, C290585fY.A00);
    }

    public static final boolean A00(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        String name = mediaCodecInfo.getName();
        0qQ.A07(name);
        0qQ.A0B("OMX.", 1);
        if (!name.startsWith("OMX.")) {
            return false;
        }
        String name2 = mediaCodecInfo.getName();
        0qQ.A07(name2);
        if (!00l.A0d(name2, "google", false)) {
            return true;
        }
        return false;
    }
}
