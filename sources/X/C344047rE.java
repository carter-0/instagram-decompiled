package X;

import com.facebook.onecamera.components.logging.xlogger.ar.OneCameraARXLoggerImpl;
import java.util.List;

/* renamed from: X.7rE  reason: invalid class name and case insensitive filesystem */
public final class C344047rE implements C344057rF {
    public final C312156dv A00 = new C344077rH();
    public final C344067rG A01 = new C344067rG();

    public final void onAnnotationUpdateEvent(int i, String str) {
        0qQ.A0B(str, 1);
        C344067rG r4 = this.A01;
        if (!0qQ.A0K(r4.A00(), "")) {
            C312156dv r2 = this.A00;
            r2.annotate(r2.getInstanceIdWithString(11287468, r4.A00()), "product_name", str);
        }
        long j = r4.A01;
        if (j != 0) {
            this.A00.annotate(j, "product_name", str);
        }
        long j2 = r4.A02;
        if (j2 != 0) {
            this.A00.annotate(j2, "product_name", str);
        }
        long j3 = r4.A04;
        if (j3 != 0) {
            this.A00.annotate(j3, "product_name", str);
        }
        long j4 = r4.A05;
        if (j4 != 0) {
            this.A00.annotate(j4, "product_name", str);
        }
    }

    public final String onFailureEvent(int i, int i2, String str, String str2) {
        String str3 = str;
        int i3 = i2;
        if (i == 3) {
            C312156dv r5 = this.A00;
            C344067rG r4 = this.A01;
            long j = r4.A01;
            if (str2 == null) {
                str2 = "";
            }
            r5.annotate(j, "error_severity", str2);
            long j2 = r4.A01;
            if (str == null) {
                str3 = "";
            }
            r5.endFail(j2, "onecamera", i3, str3);
            String A0Q = 002.A0Q(r4.A00(), r4.A01);
            r4.A01 = 0;
            return A0Q;
        } else if (i == 9) {
            C312156dv r52 = this.A00;
            C344067rG r42 = this.A01;
            long j3 = r42.A04;
            if (str2 == null) {
                str2 = "";
            }
            r52.annotate(j3, "error_severity", str2);
            long j4 = r42.A04;
            if (str == null) {
                str3 = "";
            }
            r52.endFail(j4, "onecamera", i3, str3);
            String A0Q2 = 002.A0Q(r42.A00(), r42.A04);
            r42.A04 = 0;
            return A0Q2;
        } else if (i == 14) {
            C312156dv r53 = this.A00;
            C344067rG r43 = this.A01;
            long j5 = r43.A05;
            if (str2 == null) {
                str2 = "";
            }
            r53.annotate(j5, "error_severity", str2);
            long j6 = r43.A05;
            if (str == null) {
                str3 = "";
            }
            r53.endFail(j6, "onecamera", i3, str3);
            String A0Q3 = 002.A0Q(r43.A00(), r43.A05);
            r43.A05 = 0;
            r43.A06 = "";
            return A0Q3;
        } else if (i != 17) {
            return "invalid";
        } else {
            C312156dv r54 = this.A00;
            C344067rG r44 = this.A01;
            long j7 = r44.A02;
            if (str2 == null) {
                str2 = "";
            }
            r54.annotate(j7, "error_severity", str2);
            long j8 = r44.A02;
            if (str == null) {
                str3 = "";
            }
            r54.endFail(j8, "onecamera", i3, str3);
            String A0Q4 = 002.A0Q(r44.A00(), r44.A02);
            r44.A02 = 0;
            return A0Q4;
        }
    }

    public final String onPostCaptureEvent(int i, int i2, String str, String str2, int i3) {
        String str3 = str2;
        0qQ.A0B(str3, 3);
        int i4 = i;
        if (i4 == 19) {
            C344067rG r2 = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("POSTCAPTURE_");
            sb.append(AnonymousClass0HM.A00());
            r2.A01(sb.toString());
            synchronized (r2) {
            }
            C312156dv r1 = this.A00;
            C312156dv r19 = r1;
            r19.startWithFlowInstanceId(r1.getInstanceIdWithString(11283810, r2.A00()), new C342137o6(r2.A00(), str, str3, "", "", "false", (List) null, (List) null, (List) null, -1, -1, i2, -1, -1), 3600);
            return r2.A00();
        } else if (i4 != 22) {
            return "invalid";
        } else {
            C312156dv r3 = this.A00;
            C344067rG r22 = this.A01;
            r3.endSuccess(r3.getInstanceIdWithString(11283810, r22.A00()));
            String A002 = r22.A00();
            r22.A01("");
            r22.A00 = 0;
            return A002;
        }
    }

    private final void A00(String str) {
        C344067rG r5 = this.A01;
        long j = r5.A01;
        if (j != 0) {
            this.A00.endCancel(j, str);
            r5.A01 = 0;
        }
        long j2 = r5.A02;
        if (j2 != 0) {
            this.A00.endCancel(j2, str);
            r5.A02 = 0;
        }
        long j3 = r5.A04;
        if (j3 != 0) {
            this.A00.endCancel(j3, str);
            r5.A04 = 0;
        }
        long j4 = r5.A05;
        if (j4 != 0) {
            this.A00.endCancel(j4, str);
            r5.A05 = 0;
            r5.A06 = "";
        }
    }

    public final C368758tH createOneCameraARXLogger() {
        OneCameraARXLoggerImpl oneCameraARXLoggerImpl = new OneCameraARXLoggerImpl();
        oneCameraARXLoggerImpl.createStandaloneOneCameraARXLogger();
        return oneCameraARXLoggerImpl;
    }

    public final String getActiveSessionId() {
        return this.A01.A00();
    }

    public final String getRecordingSessionId() {
        return this.A01.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        return r6.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002d, code lost:
        return "invalid";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0153, code lost:
        r3.markPoint(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x019f, code lost:
        return r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02e5, code lost:
        return X.002.A0Q(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        r1.markPoint(r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String onEvent(int r52, int r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, int r57, java.util.List r58, java.util.List r59, java.util.List r60, long r61, long r63, long r65, int r67, boolean r68, boolean r69, boolean r70) {
        /*
            r51 = this;
            r5 = r61
            r10 = 3
            r14 = r55
            X.0qQ.A0B(r14, r10)
            java.lang.String r3 = "OneCameraXLoggerJava"
            r11 = -1
            java.lang.String r9 = ""
            java.lang.String r2 = "invalid"
            r8 = 11287468(0xac3bac, float:1.5817112E-38)
            java.lang.String r16 = "true"
            java.lang.String r40 = "false"
            r0 = 0
            r7 = r51
            r19 = r54
            r4 = r67
            r13 = r57
            r24 = r58
            r25 = r59
            r26 = r60
            r30 = r63
            r32 = r65
            switch(r52) {
                case 0: goto L_0x004d;
                case 1: goto L_0x00f6;
                case 2: goto L_0x00ff;
                case 3: goto L_0x002d;
                case 4: goto L_0x0108;
                case 5: goto L_0x014b;
                case 6: goto L_0x0157;
                case 7: goto L_0x0173;
                case 8: goto L_0x01a0;
                case 9: goto L_0x002d;
                case 10: goto L_0x01ed;
                case 11: goto L_0x0228;
                case 12: goto L_0x002e;
                case 13: goto L_0x003b;
                case 14: goto L_0x002d;
                case 15: goto L_0x027e;
                case 16: goto L_0x0296;
                case 17: goto L_0x002d;
                case 18: goto L_0x02e6;
                default: goto L_0x002d;
            }
        L_0x002d:
            return r2
        L_0x002e:
            X.7rG r6 = r7.A01
            long r4 = r6.A05
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x002d
            X.6dv r1 = r7.A00
            r0 = 14
            goto L_0x0047
        L_0x003b:
            X.7rG r6 = r7.A01
            long r4 = r6.A05
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x002d
            X.6dv r1 = r7.A00
            r0 = 16
        L_0x0047:
            r1.markPoint(r4, r0)
            java.lang.String r2 = r6.A06
            return r2
        L_0x004d:
            X.7rG r4 = r7.A01
            java.lang.String r12 = r4.A00()
            long r2 = r4.A01
            int r10 = r12.length()
            if (r10 <= 0) goto L_0x006f
            java.lang.String r10 = "New camera session interrupted"
            int r15 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r15 == 0) goto L_0x0066
            X.6dv r0 = r7.A00
            r0.endCancel(r2, r10)
        L_0x0066:
            X.6dv r2 = r7.A00
            long r0 = r2.getInstanceIdWithString(r8, r12)
            r2.endCancel(r0, r10)
        L_0x006f:
            java.lang.String r0 = "PRECAPTURE_"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.util.UUID r0 = X.AnonymousClass0HM.A00()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.A01(r0)
            r0 = r4
            monitor-enter(r0)
            monitor-exit(r0)
            X.6dv r0 = r7.A00
            java.lang.String r1 = r4.A00()
            long r35 = r0.getInstanceIdWithString(r8, r1)
            java.lang.String r18 = r4.A00()
            r23 = r40
            if (r70 == 0) goto L_0x009e
            r23 = r16
        L_0x009e:
            X.7o6 r17 = new X.7o6
            r1 = r53
            r21 = r56
            r27 = r13
            r28 = r11
            r29 = r1
            r20 = r14
            r22 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32)
            r38 = 3600(0xe10, double:1.7786E-320)
            r34 = r0
            r37 = r17
            r34.startWithFlowInstanceId(r35, r37, r38)
            java.lang.String r35 = r4.A00()
            r39 = r40
            if (r68 == 0) goto L_0x00c4
            r39 = r16
        L_0x00c4:
            if (r70 == 0) goto L_0x00c8
            r40 = r16
        L_0x00c8:
            r8 = 11287836(0xac3d1c, float:1.5817627E-38)
            X.7o6 r7 = new X.7o6
            r34 = r7
            r36 = r19
            r37 = r14
            r38 = r21
            r41 = r24
            r42 = r25
            r43 = r26
            r44 = r13
            r45 = r11
            r46 = r1
            r47 = r30
            r49 = r32
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r49)
            r2 = 5
            long r2 = r0.start(r8, r7, r2)
            r4.A01 = r2
            r4.A03 = r5
            r4.A00 = r1
            goto L_0x019b
        L_0x00f6:
            X.6dv r3 = r7.A00
            X.7rG r4 = r7.A01
            long r1 = r4.A01
            r0 = 11
            goto L_0x0153
        L_0x00ff:
            X.6dv r3 = r7.A00
            X.7rG r4 = r7.A01
            long r1 = r4.A01
            r0 = 12
            goto L_0x0153
        L_0x0108:
            X.7rG r10 = r7.A01
            long r8 = r10.A03
            r3 = -1
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0125
            int r2 = (r61 > r3 ? 1 : (r61 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0125
            X.6dv r12 = r7.A00
            long r2 = r10.A01
            long r5 = r61 - r8
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "real_ttff_value_ms"
            r12.annotate(r2, r4, r5)
        L_0x0125:
            if (r13 == r11) goto L_0x0134
            X.6dv r6 = r7.A00
            long r2 = r10.A01
            if (r57 == 0) goto L_0x0148
            java.lang.String r5 = "Back"
        L_0x012f:
            java.lang.String r4 = "camera_facing"
            r6.annotate(r2, r4, r5)
        L_0x0134:
            X.6dv r4 = r7.A00
            long r2 = r10.A01
            r4.endSuccess(r2)
            java.lang.String r4 = r10.A00()
            long r2 = r10.A01
            java.lang.String r2 = X.002.A0Q(r4, r2)
            r10.A01 = r0
            return r2
        L_0x0148:
            java.lang.String r5 = "Front"
            goto L_0x012f
        L_0x014b:
            X.6dv r3 = r7.A00
            X.7rG r4 = r7.A01
            long r1 = r4.A01
            r0 = 13
        L_0x0153:
            r3.markPoint(r1, r0)
            goto L_0x019b
        L_0x0157:
            X.6dv r4 = r7.A00
            X.7rG r3 = r7.A01
            java.lang.String r0 = r3.A00()
            long r1 = r4.getInstanceIdWithString(r8, r0)
            java.lang.String r0 = "Camera evicted"
            r7.A00(r0)
            r4.endCancel(r1, r0)
            java.lang.String r2 = r3.A00()
            r3.A01(r9)
            return r2
        L_0x0173:
            if (r69 != 0) goto L_0x0194
            X.6dv r4 = r7.A00
            X.7rG r3 = r7.A01
            java.lang.String r0 = r3.A00()
            long r1 = r4.getInstanceIdWithString(r8, r0)
            java.lang.String r0 = "Camera closed"
            r7.A00(r0)
            r4.endSuccess(r1)
            java.lang.String r2 = r3.A00()
            r3.A01(r9)
            r0 = 0
            r3.A00 = r0
            return r2
        L_0x0194:
            java.lang.String r0 = "OneCameraXLoggerJava::onEvent CameraDisconnectFinished after CameraEvicted, skipping"
            X.0KC.A0D(r3, r0)
            X.7rG r4 = r7.A01
        L_0x019b:
            java.lang.String r2 = r4.A00()
            return r2
        L_0x01a0:
            X.7rG r5 = r7.A01
            long r2 = r5.A04
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x01af
            X.6dv r1 = r7.A00
            java.lang.String r0 = "New capture started"
            r1.endCancel(r2, r0)
        L_0x01af:
            X.6dv r6 = r7.A00
            java.lang.String r35 = r5.A00()
            int r0 = r5.A00
            if (r70 == 0) goto L_0x01bb
            r40 = r16
        L_0x01bb:
            r3 = 11276595(0xac1133, float:1.5801875E-38)
            X.7o6 r2 = new X.7o6
            r34 = r2
            r36 = r19
            r37 = r14
            r38 = r9
            r39 = r9
            r41 = r24
            r42 = r25
            r43 = r26
            r44 = r13
            r45 = r4
            r46 = r0
            r47 = r30
            r49 = r32
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r49)
            r0 = 60
            long r0 = r6.start(r3, r2, r0)
            r5.A04 = r0
            java.lang.String r2 = r5.A00()
            long r0 = r5.A04
            goto L_0x02e1
        L_0x01ed:
            if (r4 == r11) goto L_0x0206
            X.6dv r6 = r7.A00
            X.7rG r2 = r7.A01
            long r2 = r2.A04
            if (r67 == 0) goto L_0x0225
            r5 = 1
            if (r4 == r5) goto L_0x0222
            r5 = 2
            if (r4 == r5) goto L_0x021f
            if (r4 == r10) goto L_0x021c
            java.lang.String r5 = "NativeLowLightPhoto"
        L_0x0201:
            java.lang.String r4 = "photo_capture_type"
            r6.annotate(r2, r4, r5)
        L_0x0206:
            X.6dv r4 = r7.A00
            X.7rG r5 = r7.A01
            long r2 = r5.A04
            r4.endSuccess(r2)
            java.lang.String r4 = r5.A00()
            long r2 = r5.A04
            java.lang.String r2 = X.002.A0Q(r4, r2)
            r5.A04 = r0
            return r2
        L_0x021c:
            java.lang.String r5 = "NativeFullSizeFile"
            goto L_0x0201
        L_0x021f:
            java.lang.String r5 = "NativeViewSizePhoto"
            goto L_0x0201
        L_0x0222:
            java.lang.String r5 = "PreviewBitmap"
            goto L_0x0201
        L_0x0225:
            java.lang.String r5 = "PreviewPhoto"
            goto L_0x0201
        L_0x0228:
            X.7rG r4 = r7.A01
            long r2 = r4.A05
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0237
            X.6dv r1 = r7.A00
            java.lang.String r0 = "New recording started"
            r1.endCancel(r2, r0)
        L_0x0237:
            X.6dv r5 = r7.A00
            r3 = 11283980(0xac2e0c, float:1.5812224E-38)
            java.lang.String r35 = r4.A00()
            int r0 = r4.A00
            if (r70 == 0) goto L_0x0246
            r40 = r16
        L_0x0246:
            X.7o6 r2 = new X.7o6
            r34 = r2
            r36 = r19
            r37 = r14
            r38 = r9
            r39 = r9
            r41 = r24
            r42 = r25
            r43 = r26
            r44 = r13
            r45 = r11
            r46 = r0
            r47 = r30
            r49 = r32
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r49)
            r0 = 3600(0xe10, double:1.7786E-320)
            long r0 = r5.start(r3, r2, r0)
            r4.A05 = r0
            java.lang.String r2 = r4.A00()
            long r0 = r4.A05
            java.lang.String r2 = X.002.A0Q(r2, r0)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r4.A06 = r2
            return r2
        L_0x027e:
            X.6dv r4 = r7.A00
            X.7rG r5 = r7.A01
            long r2 = r5.A05
            r4.endSuccess(r2)
            java.lang.String r4 = r5.A00()
            long r2 = r5.A05
            java.lang.String r2 = X.002.A0Q(r4, r2)
            r5.A05 = r0
            r5.A06 = r9
            return r2
        L_0x0296:
            X.7rG r4 = r7.A01
            long r2 = r4.A02
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x02a5
            X.6dv r1 = r7.A00
            java.lang.String r0 = "New camera switch started"
            r1.endCancel(r2, r0)
        L_0x02a5:
            X.6dv r5 = r7.A00
            r3 = 11275520(0xac0d00, float:1.5800369E-38)
            java.lang.String r35 = r4.A00()
            int r0 = r4.A00
            if (r70 == 0) goto L_0x02b4
            r40 = r16
        L_0x02b4:
            X.7o6 r2 = new X.7o6
            r34 = r2
            r36 = r19
            r37 = r14
            r38 = r9
            r39 = r9
            r41 = r24
            r42 = r25
            r43 = r26
            r44 = r13
            r45 = r11
            r46 = r0
            r47 = r30
            r49 = r32
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r49)
            r0 = 30
            long r0 = r5.start(r3, r2, r0)
            r4.A02 = r0
            java.lang.String r2 = r4.A00()
            long r0 = r4.A02
        L_0x02e1:
            java.lang.String r2 = X.002.A0Q(r2, r0)
            return r2
        L_0x02e6:
            X.6dv r4 = r7.A00
            X.7rG r5 = r7.A01
            long r2 = r5.A02
            r4.endSuccess(r2)
            java.lang.String r4 = r5.A00()
            long r2 = r5.A02
            java.lang.String r2 = X.002.A0Q(r4, r2)
            r5.A02 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344047rE.onEvent(int, int, java.lang.String, java.lang.String, java.lang.String, int, java.util.List, java.util.List, java.util.List, long, long, long, int, boolean, boolean, boolean):java.lang.String");
    }
}
