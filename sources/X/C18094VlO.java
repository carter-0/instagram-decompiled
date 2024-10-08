package X;

import android.media.MediaCodecInfo;
import android.os.Build;

/* renamed from: X.VlO  reason: case insensitive filesystem */
public abstract class C18094VlO {
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c8, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d0, code lost:
        r1 = 8192;
        r9 = r9.profile;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        if ((3 - r16) == 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00da, code lost:
        if (r9 == 4096) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
        if (r9 == r1) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        if (r9 == 4096) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e1, code lost:
        if (r9 == 8192) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e5, code lost:
        if (r9 == 16384) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e7, code lost:
        r1 = com.facebook.common.dextricks.Constants.LOAD_RESULT_PGO;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ef, code lost:
        if (r18.isEncoder() == false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f1, code lost:
        r2 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.SharedPreferences r51) {
        /*
            r47 = 1
            android.media.MediaCodecList r1 = new android.media.MediaCodecList
            r0 = r47
            r1.<init>(r0)
            android.media.MediaCodecInfo[] r46 = r1.getCodecInfos()
            r0 = r46
            int r0 = r0.length
            r50 = r0
            r45 = 0
            r44 = 0
            r15 = 0
            r43 = 0
            r42 = 0
            r41 = 0
            r40 = 0
            r39 = 0
            r38 = 0
            r37 = 0
            r36 = 0
            r35 = 0
            r34 = 0
            r33 = 0
            r32 = 0
            r31 = 0
            r30 = 0
            r29 = 0
            r28 = 0
            r27 = 0
            r26 = 0
            r25 = 0
            r24 = 0
            r8 = 0
            r23 = 0
            r7 = 0
            r22 = 0
            r6 = 0
            r21 = 0
            r5 = 0
            r20 = 0
            r4 = 0
            r19 = 0
            r3 = 0
            r2 = 0
        L_0x0050:
            r0 = r50
            if (r15 >= r0) goto L_0x01cf
            r18 = r46[r15]
            java.lang.String[] r14 = r18.getSupportedTypes()
            int r0 = r14.length
            r49 = r0
            r13 = 0
        L_0x005e:
            r0 = r49
            if (r13 >= r0) goto L_0x01cb
            r12 = r14[r13]
            r0 = r18
            android.media.MediaCodecInfo$CodecCapabilities r17 = r0.getCapabilitiesForType(r12)
            r0 = r17
            android.media.MediaCodecInfo$CodecProfileLevel[] r11 = r0.profileLevels
            r11.getClass()
            int r0 = r11.length
            r48 = r0
            r10 = 0
        L_0x0075:
            r0 = r48
            if (r10 >= r0) goto L_0x00f2
            r9 = r11[r10]
            int r1 = r12.hashCode()
            r0 = 2
            switch(r1) {
                case -1851077871: goto L_0x0086;
                case -1662735862: goto L_0x00b0;
                case -1662541442: goto L_0x00bb;
                case 1599127257: goto L_0x00c6;
                default: goto L_0x0083;
            }
        L_0x0083:
            int r10 = r10 + 1
            goto L_0x0075
        L_0x0086:
            r1 = 5369(0x14f9, float:7.524E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r12.equals(r1)
            if (r1 == 0) goto L_0x0083
            int r9 = r9.profile
            r1 = r47
            if (r9 == r1) goto L_0x00eb
            if (r9 == r0) goto L_0x00eb
            r0 = 4
            if (r9 == r0) goto L_0x00eb
            r0 = 8
            if (r9 == r0) goto L_0x00eb
            r0 = 16
            if (r9 == r0) goto L_0x00eb
            r0 = 32
            if (r9 == r0) goto L_0x00eb
            r0 = 64
            if (r9 == r0) goto L_0x00eb
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x00dc
        L_0x00b0:
            java.lang.String r0 = "video/av01"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0083
            r16 = 1
            goto L_0x00d0
        L_0x00bb:
            java.lang.String r0 = "video/hevc"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0083
            r16 = 2
            goto L_0x00d0
        L_0x00c6:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0083
            r16 = 3
        L_0x00d0:
            r1 = 8192(0x2000, float:1.14794E-41)
            r0 = 4096(0x1000, float:5.74E-42)
            int r9 = r9.profile
            int r16 = 3 - r16
            if (r16 == 0) goto L_0x00df
            if (r9 == r0) goto L_0x00eb
        L_0x00dc:
            if (r9 == r1) goto L_0x00eb
            goto L_0x0083
        L_0x00df:
            if (r9 == r0) goto L_0x00eb
            if (r9 == r1) goto L_0x00eb
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r9 == r0) goto L_0x00eb
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x00dc
        L_0x00eb:
            boolean r0 = r18.isEncoder()
            if (r0 == 0) goto L_0x01c8
            r2 = 1
        L_0x00f2:
            int r0 = r12.hashCode()
            switch(r0) {
                case -1662735862: goto L_0x00fd;
                case -1662541442: goto L_0x012e;
                case 1331836730: goto L_0x0160;
                case 1599127257: goto L_0x0196;
                default: goto L_0x00f9;
            }
        L_0x00f9:
            int r13 = r13 + 1
            goto L_0x005e
        L_0x00fd:
            java.lang.String r0 = "video/av01"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r18.isEncoder()
            boolean r1 = A01(r18)
            if (r0 == 0) goto L_0x011e
            int r0 = r17.getMaxSupportedInstances()
            if (r1 == 0) goto L_0x0119
            r23 = r0
            r8 = 1
            goto L_0x00f9
        L_0x0119:
            r24 = r0
            r25 = 1
            goto L_0x00f9
        L_0x011e:
            int r0 = r17.getMaxSupportedInstances()
            if (r1 == 0) goto L_0x0129
            r26 = r0
            r27 = 1
            goto L_0x00f9
        L_0x0129:
            r28 = r0
            r29 = 1
            goto L_0x00f9
        L_0x012e:
            java.lang.String r0 = "video/hevc"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r18.isEncoder()
            boolean r1 = A01(r18)
            if (r0 == 0) goto L_0x0150
            int r0 = r17.getMaxSupportedInstances()
            if (r1 == 0) goto L_0x014b
            r30 = r0
            r31 = 1
            goto L_0x00f9
        L_0x014b:
            r32 = r0
            r44 = 1
            goto L_0x00f9
        L_0x0150:
            int r0 = r17.getMaxSupportedInstances()
            if (r1 == 0) goto L_0x015b
            r45 = r0
            r33 = 1
            goto L_0x00f9
        L_0x015b:
            r34 = r0
            r35 = 1
            goto L_0x00f9
        L_0x0160:
            java.lang.String r0 = "video/avc"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r18.isEncoder()
            boolean r1 = A01(r18)
            if (r0 == 0) goto L_0x0184
            int r0 = r17.getMaxSupportedInstances()
            if (r1 == 0) goto L_0x017e
            r36 = r0
            r37 = 1
            goto L_0x00f9
        L_0x017e:
            r38 = r0
            r39 = 1
            goto L_0x00f9
        L_0x0184:
            int r0 = r17.getMaxSupportedInstances()
            if (r1 == 0) goto L_0x0190
            r40 = r0
            r41 = 1
            goto L_0x00f9
        L_0x0190:
            r42 = r0
            r43 = 1
            goto L_0x00f9
        L_0x0196:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r18.isEncoder()
            boolean r1 = A01(r18)
            if (r0 == 0) goto L_0x01b8
            int r0 = r17.getMaxSupportedInstances()
            if (r1 == 0) goto L_0x01b3
            r19 = r0
            r4 = 1
            goto L_0x00f9
        L_0x01b3:
            r20 = r0
            r5 = 1
            goto L_0x00f9
        L_0x01b8:
            int r0 = r17.getMaxSupportedInstances()
            if (r1 == 0) goto L_0x01c3
            r21 = r0
            r6 = 1
            goto L_0x00f9
        L_0x01c3:
            r22 = r0
            r7 = 1
            goto L_0x00f9
        L_0x01c8:
            r3 = 1
            goto L_0x00f2
        L_0x01cb:
            int r15 = r15 + 1
            goto L_0x0050
        L_0x01cf:
            android.content.SharedPreferences$Editor r1 = r51.edit()
            java.lang.String r9 = "video_avc_software_decoder_supported"
            r0 = r43
            r1.putBoolean(r9, r0)
            java.lang.String r9 = "video_avc_software_decoder_max_instances"
            r0 = r42
            r1.putInt(r9, r0)
            java.lang.String r9 = "video_avc_hardware_decoder_supported"
            r0 = r41
            r1.putBoolean(r9, r0)
            java.lang.String r9 = "video_avc_hardware_decoder_max_instances"
            r0 = r40
            r1.putInt(r9, r0)
            java.lang.String r9 = "video_avc_software_encoder_supported"
            r0 = r39
            r1.putBoolean(r9, r0)
            java.lang.String r9 = "video_avc_software_encoder_max_instances"
            r0 = r38
            r1.putInt(r9, r0)
            java.lang.String r9 = "video_avc_hardware_encoder_supported"
            r0 = r37
            r1.putBoolean(r9, r0)
            java.lang.String r9 = "video_avc_hardware_encoder_max_instances"
            r0 = r36
            r1.putInt(r9, r0)
            java.lang.String r9 = "video_hevc_software_decoder_supported"
            r0 = r35
            r1.putBoolean(r9, r0)
            java.lang.String r9 = "video_hevc_software_decoder_max_instances"
            r0 = r34
            r1.putInt(r9, r0)
            java.lang.String r9 = "video_hevc_hardware_decoder_supported"
            r0 = r33
            r1.putBoolean(r9, r0)
            java.lang.String r9 = "video_hevc_hardware_decoder_max_instances"
            r0 = r45
            r1.putInt(r9, r0)
            java.lang.String r9 = "video_hevc_software_encoder_supported"
            r0 = r44
            r1.putBoolean(r9, r0)
            java.lang.String r9 = "video_hevc_software_encoder_max_instances"
            r0 = r32
            r1.putInt(r9, r0)
            java.lang.String r9 = "video_hevc_hardware_encoder_supported"
            r0 = r31
            r1.putBoolean(r9, r0)
            java.lang.String r9 = "video_hevc_hardware_encoder_max_instances"
            r0 = r30
            r1.putInt(r9, r0)
            java.lang.String r9 = "video_av1_software_decoder_supported"
            r0 = r29
            r1.putBoolean(r9, r0)
            java.lang.String r9 = "video_av1_software_decoder_max_instances"
            r0 = r28
            r1.putInt(r9, r0)
            java.lang.String r9 = "video_av1_hardware_decoder_supported"
            r0 = r27
            r1.putBoolean(r9, r0)
            java.lang.String r9 = "video_av1_hardware_decoder_max_instances"
            r0 = r26
            r1.putInt(r9, r0)
            java.lang.String r9 = "video_av1_software_encoder_supported"
            r0 = r25
            r1.putBoolean(r9, r0)
            java.lang.String r9 = "video_av1_software_encoder_max_instances"
            r0 = r24
            r1.putInt(r9, r0)
            java.lang.String r0 = "video_av1_hardware_encoder_supported"
            r1.putBoolean(r0, r8)
            java.lang.String r8 = "video_av1_hardware_encoder_max_instances"
            r0 = r23
            r1.putInt(r8, r0)
            java.lang.String r0 = "video_vp9_software_decoder_supported"
            r1.putBoolean(r0, r7)
            java.lang.String r7 = "video_vp9_software_decoder_max_instances"
            r0 = r22
            r1.putInt(r7, r0)
            java.lang.String r0 = "video_vp9_hardware_decoder_supported"
            r1.putBoolean(r0, r6)
            java.lang.String r6 = "video_vp9_hardware_decoder_max_instances"
            r0 = r21
            r1.putInt(r6, r0)
            java.lang.String r0 = "video_vp9_software_encoder_supported"
            r1.putBoolean(r0, r5)
            java.lang.String r5 = "video_vp9_software_encoder_max_instances"
            r0 = r20
            r1.putInt(r5, r0)
            java.lang.String r0 = "video_vp9_hardware_encoder_supported"
            r1.putBoolean(r0, r4)
            java.lang.String r4 = "video_vp9_hardware_encoder_max_instances"
            r0 = r19
            r1.putInt(r4, r0)
            java.lang.String r0 = "video_decoder_hdr_supported"
            r1.putBoolean(r0, r3)
            java.lang.String r0 = "video_encoder_hdr_supported"
            r1.putBoolean(r0, r2)
            r1.commit()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18094VlO.A00(android.content.SharedPreferences):void");
    }

    public static boolean A01(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        String lowerCase = mediaCodecInfo.getName().toLowerCase();
        if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
            return false;
        }
        if ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
            return false;
        }
        if (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")) {
            return true;
        }
        return false;
    }
}
