package X;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.7ku  reason: invalid class name and case insensitive filesystem */
public final class C340227ku extends Handler {
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05;
    public final Queue A06 = new LinkedList();
    public final Queue A07 = new LinkedList();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x040a, code lost:
        r5.ChO(r6, r7, "SETTINGS", r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x045d, code lost:
        r2 = r1.A03;
        r12 = (X.C341397mo) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0462, code lost:
        if (r4 == 5) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0465, code lost:
        if (r4 == 6) goto L_0x04c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0468, code lost:
        if (r4 == 7) goto L_0x04c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x046c, code lost:
        if (r4 == 23) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0470, code lost:
        if (r4 == 24) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0472, code lost:
        switch(r4) {
            case 30: goto L_0x04b4;
            case 31: goto L_0x04b7;
            case 32: goto L_0x04ba;
            case 33: goto L_0x04bd;
            default: goto L_0x0475;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0475, code lost:
        switch(r4) {
            case 37: goto L_0x049c;
            case 38: goto L_0x049f;
            case 39: goto L_0x04a2;
            case 40: goto L_0x04a5;
            case go.Seq.NULL_REFNUM :int: goto L_0x04a8;
            case go.Seq.RefTracker.REF_OFFSET :int: goto L_0x04ab;
            case 43: goto L_0x04ae;
            case 44: goto L_0x04b1;
            default: goto L_0x0478;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0478, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0479, code lost:
        r8 = "CameraEventLoggerImpl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x047b, code lost:
        if (r7 == null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x047d, code lost:
        r11 = r12.A01;
        r0 = r11.A7G();
        r0.put("timestamp", java.lang.String.valueOf(r2));
        r2 = (long) r12.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0491, code lost:
        r11.ChM(r2, r7, r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0497, code lost:
        r11.ECg(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x049c, code lost:
        r7 = "get_surface_texture_started";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x049f, code lost:
        r7 = "get_surface_texture_finished";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04a2, code lost:
        r7 = "initialise_camera_started";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x04a5, code lost:
        r7 = "initialise_camera_finished";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04a8, code lost:
        r7 = "camera_meta_data_handler_setup_started";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04ab, code lost:
        r7 = "camera_meta_data_handler_setup_finished";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x04ae, code lost:
        r7 = "camera_features_prepare_started";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04b1, code lost:
        r7 = "camera_features_prepare_finished";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04b4, code lost:
        r7 = "camera_open_started";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04b7, code lost:
        r7 = "camera_open_finished";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04ba, code lost:
        r7 = "preview_start_started";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04bd, code lost:
        r7 = "preview_start_finished";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04c0, code lost:
        r7 = "camera_disconnect_started";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04c3, code lost:
        r7 = "camera_disconnect_requested";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04c6, code lost:
        r7 = "camera_warmup_finished";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04c9, code lost:
        r7 = "camera_warmup_started";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04cc, code lost:
        r7 = "camera_warmup_requested";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r1.A04 = null;
        r1.A05 = null;
        r2 = X.C342087o1.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04d6, code lost:
        if (r2 >= 5) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04d8, code lost:
        r1.A00 = X.C342087o1.A07;
        X.C342087o1.A07 = r1;
        X.C342087o1.A06 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04e2, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04e3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01c8, code lost:
        r11.ChL(r12, r13, r14, r15, r14, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0226, code lost:
        r11.ChO(r5, r6, "SWITCH", r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r3 = X.C342087o1.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        monitor-enter(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r22) {
        /*
            r21 = this;
            r5 = r22
            java.lang.Object r1 = r5.obj
            X.7o1 r1 = (X.C342087o1) r1
            if (r1 == 0) goto L_0x04ff
            X.7lS r12 = r1.A04
            if (r12 == 0) goto L_0x04e8
            int r0 = r5.what
            r6 = -1
            r2 = 0
            r8 = 1
            r10 = r21
            switch(r0) {
                case 3: goto L_0x001d;
                case 4: goto L_0x004d;
                case 5: goto L_0x00c3;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00c9;
                case 8: goto L_0x00cc;
                case 9: goto L_0x0107;
                case 10: goto L_0x0140;
                case 11: goto L_0x015e;
                case 12: goto L_0x016e;
                case 13: goto L_0x0192;
                case 14: goto L_0x0204;
                case 15: goto L_0x0230;
                case 16: goto L_0x0234;
                case 17: goto L_0x01d6;
                case 18: goto L_0x027a;
                case 19: goto L_0x02bf;
                case 20: goto L_0x02cc;
                case 21: goto L_0x02e1;
                case 22: goto L_0x02f0;
                case 23: goto L_0x02ff;
                case 24: goto L_0x0305;
                case 25: goto L_0x0310;
                case 26: goto L_0x0084;
                case 27: goto L_0x03b3;
                case 28: goto L_0x03c9;
                case 29: goto L_0x03c9;
                case 30: goto L_0x03d0;
                case 31: goto L_0x03d4;
                case 32: goto L_0x03d8;
                case 33: goto L_0x03dc;
                case 34: goto L_0x03f5;
                case 35: goto L_0x03df;
                case 36: goto L_0x0411;
                case 37: goto L_0x0449;
                case 38: goto L_0x044c;
                case 39: goto L_0x044f;
                case 40: goto L_0x0452;
                case 41: goto L_0x0455;
                case 42: goto L_0x0458;
                case 43: goto L_0x045b;
                case 44: goto L_0x00bf;
                default: goto L_0x0017;
            }
        L_0x0017:
            java.lang.Object r3 = X.C342087o1.A08
            monitor-enter(r3)
            r0 = 0
            goto L_0x04cf
        L_0x001d:
            java.lang.Object r4 = r1.A05
            java.lang.String r4 = (java.lang.String) r4
            X.7mo r12 = (X.C341397mo) r12
            if (r4 != 0) goto L_0x0027
            java.lang.String r4 = ""
        L_0x0027:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r4)
            X.7rD r5 = r12.A01
            java.lang.String r8 = "CameraEventLoggerImpl"
            int r0 = r12.hashCode()
            long r12 = (long) r0
            r0 = 10004(0x2714, float:1.4019E-41)
            X.9dR r6 = new X.9dR
            r6.<init>(r4, r3, r0)
            r11 = 0
            java.lang.String r7 = "camera_error"
            java.lang.String r9 = "medium"
            r10 = r8
            r5.ChL(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = r5.BgN()
            r5.Ew8(r0, r3, r2)
            goto L_0x0017
        L_0x004d:
            java.lang.Object r4 = r1.A05
            r4.getClass()
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            X.7mo r12 = (X.C341397mo) r12
            java.lang.String r0 = r4.getMessage()
            if (r0 == 0) goto L_0x0081
            java.lang.String r3 = r4.getMessage()
        L_0x0060:
            X.7rD r5 = r12.A01
            java.lang.String r8 = "CameraEventLoggerImpl"
            int r0 = r12.hashCode()
            long r12 = (long) r0
            r0 = 10004(0x2714, float:1.4019E-41)
            X.9dR r6 = new X.9dR
            r6.<init>(r3, r4, r0)
            r11 = 0
            java.lang.String r7 = "camera_error"
            java.lang.String r9 = "medium"
            r10 = r8
            r5.ChL(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = r5.BgN()
            r5.Ew8(r0, r4, r2)
            goto L_0x0017
        L_0x0081:
            java.lang.String r3 = "Optic Camera Unhandled Exception"
            goto L_0x0060
        L_0x0084:
            long r2 = r1.A03
            java.lang.Object r6 = r1.A05
            r6.getClass()
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            X.7mo r12 = (X.C341397mo) r12
            java.lang.String r0 = r6.getMessage()
            if (r0 == 0) goto L_0x00bc
            java.lang.String r5 = r6.getMessage()
        L_0x0099:
            X.7rD r11 = r12.A01
            java.util.Map r0 = r11.A7G()
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "timestamp"
            r0.put(r2, r3)
            java.lang.String r14 = "CameraEventLoggerImpl"
            int r2 = r12.hashCode()
            long r2 = (long) r2
            r4 = 10014(0x271e, float:1.4033E-41)
            X.9dR r12 = new X.9dR
            r12.<init>(r5, r6, r4)
            java.lang.String r13 = "camera_disconnect_failed"
            java.lang.String r15 = "medium"
            goto L_0x01c8
        L_0x00bc:
            java.lang.String r5 = "No error message provided."
            goto L_0x0099
        L_0x00bf:
            r4 = 44
            goto L_0x045d
        L_0x00c3:
            r4 = 5
            goto L_0x045d
        L_0x00c6:
            r4 = 6
            goto L_0x045d
        L_0x00c9:
            r4 = 7
            goto L_0x045d
        L_0x00cc:
            long r2 = r1.A03
            java.lang.Object r6 = r1.A05
            r6.getClass()
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            X.7mo r12 = (X.C341397mo) r12
            X.7rD r11 = r12.A01
            java.util.Map r0 = r11.A7G()
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "timestamp"
            r0.put(r2, r3)
            java.lang.String r2 = r6.getMessage()
            if (r2 == 0) goto L_0x0104
            java.lang.String r5 = r6.getMessage()
        L_0x00f0:
            java.lang.String r14 = "CameraEventLoggerImpl"
            int r2 = r12.hashCode()
            long r2 = (long) r2
            r4 = 10012(0x271c, float:1.403E-41)
            X.9dR r12 = new X.9dR
            r12.<init>(r5, r6, r4)
            java.lang.String r13 = "camera_warmup_failed"
            java.lang.String r15 = "low"
            goto L_0x01c8
        L_0x0104:
            java.lang.String r5 = "No error message provided."
            goto L_0x00f0
        L_0x0107:
            r10.A03 = r2
            r10.A02 = r2
            r10.A01 = r6
            long r3 = r1.A02
            r10.A00 = r3
            long r3 = r1.A03
            X.7mo r12 = (X.C341397mo) r12
            java.lang.String r8 = "CameraEventLoggerImpl"
            X.7rD r11 = r12.A01
            java.util.Map r0 = r11.A7G()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "timestamp"
            r0.put(r3, r4)
            boolean r3 = X.C341397mo.A04
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "is_cold_start"
            r0.put(r3, r4)
            boolean r3 = X.C341397mo.A04
            if (r3 == 0) goto L_0x0137
            X.C341397mo.A04 = r2
        L_0x0137:
            int r2 = r12.hashCode()
            long r2 = (long) r2
            java.lang.String r7 = "camera_connect_requested"
            goto L_0x0491
        L_0x0140:
            long r2 = r1.A03
            X.7mo r12 = (X.C341397mo) r12
            java.lang.String r8 = "CameraEventLoggerImpl"
            X.7rD r11 = r12.A01
            java.util.Map r0 = r11.A7G()
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "timestamp"
            r0.put(r2, r3)
            int r2 = r12.hashCode()
            long r2 = (long) r2
            java.lang.String r7 = "camera_connect_request_posted"
            goto L_0x0491
        L_0x015e:
            r10.A03 = r8
            r10.A02 = r8
            java.util.Queue r0 = r10.A06
            r0.clear()
            long r2 = r1.A03
            r12.D5d(r2)
            goto L_0x0017
        L_0x016e:
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x0017
            long r2 = r1.A03
            long r8 = r10.A00
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0190
            long r6 = r1.A02
            long r8 = r10.A00
            long r6 = r6 - r8
            int r14 = (int) r6
        L_0x0180:
            int r15 = r5.arg1
            java.lang.Object r13 = r1.A05
            r13.getClass()
            X.7q6 r13 = (X.C343367q6) r13
            r16 = r2
            r12.D5b(r13, r14, r15, r16)
            goto L_0x0017
        L_0x0190:
            r14 = -1
            goto L_0x0180
        L_0x0192:
            long r2 = r1.A03
            java.lang.Object r6 = r1.A05
            r6.getClass()
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            X.7mo r12 = (X.C341397mo) r12
            java.lang.String r0 = r6.getMessage()
            if (r0 == 0) goto L_0x01d3
            java.lang.String r5 = r6.getMessage()
        L_0x01a7:
            X.7rD r11 = r12.A01
            java.util.Map r0 = r11.A7G()
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "timestamp"
            r0.put(r2, r3)
            java.lang.String r14 = "CameraEventLoggerImpl"
            int r2 = r12.hashCode()
            long r2 = (long) r2
            r4 = 10013(0x271d, float:1.4031E-41)
            X.9dR r12 = new X.9dR
            r12.<init>(r5, r6, r4)
            java.lang.String r13 = "camera_connect_failed"
            java.lang.String r15 = "high"
        L_0x01c8:
            r16 = r14
            r17 = r0
            r18 = r2
            r11.ChL(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0497
        L_0x01d3:
            java.lang.String r5 = "No error message provided."
            goto L_0x01a7
        L_0x01d6:
            long r2 = r1.A03
            int r5 = r5.arg1
            X.7mo r12 = (X.C341397mo) r12
            X.7rD r11 = r12.A01
            X.7rK r4 = r11.Ajt()
            if (r5 == 0) goto L_0x0202
            r0 = 0
            if (r5 == r8) goto L_0x01e8
            r0 = -1
        L_0x01e8:
            r4.EQO(r0)
            java.util.Map r0 = r11.A7G()
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "timestamp"
            r0.put(r2, r3)
            java.lang.String r6 = "CameraEventLoggerImpl"
            int r2 = r12.hashCode()
            long r2 = (long) r2
            java.lang.String r5 = "camera_update_finished"
            goto L_0x0226
        L_0x0202:
            r0 = 1
            goto L_0x01e8
        L_0x0204:
            r10.A02 = r2
            long r2 = r1.A02
            r10.A01 = r2
            long r2 = r1.A03
            X.7mo r12 = (X.C341397mo) r12
            X.7rD r11 = r12.A01
            java.util.Map r0 = r11.A7G()
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "timestamp"
            r0.put(r2, r3)
            java.lang.String r6 = "CameraEventLoggerImpl"
            int r2 = r12.hashCode()
            long r2 = (long) r2
            java.lang.String r5 = "camera_update_requested"
        L_0x0226:
            java.lang.String r7 = "SWITCH"
            r4 = r11
            r8 = r0
            r9 = r2
            r4.ChO(r5, r6, r7, r8, r9)
            goto L_0x0497
        L_0x0230:
            r10.A02 = r8
            goto L_0x0017
        L_0x0234:
            long r2 = r1.A03
            java.lang.Object r6 = r1.A05
            r6.getClass()
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            X.7mo r12 = (X.C341397mo) r12
            java.lang.String r0 = r6.getMessage()
            if (r0 == 0) goto L_0x0277
            java.lang.String r5 = r6.getMessage()
        L_0x0249:
            X.7rD r11 = r12.A01
            java.util.Map r0 = r11.A7G()
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "timestamp"
            r0.put(r2, r3)
            java.lang.String r14 = "CameraEventLoggerImpl"
            int r2 = r12.hashCode()
            long r2 = (long) r2
            r4 = 10016(0x2720, float:1.4035E-41)
            X.9dR r12 = new X.9dR
            r12.<init>(r5, r6, r4)
            java.lang.String r13 = "camera_update_failed"
            java.lang.String r15 = "SWITCH"
            java.lang.String r16 = "medium"
            r17 = r14
            r18 = r0
            r19 = r2
            r11.ChN(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0497
        L_0x0277:
            java.lang.String r5 = "No error message provided."
            goto L_0x0249
        L_0x027a:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x04e7
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x0286
            r10.A05 = r2
            goto L_0x0017
        L_0x0286:
            long r4 = r10.A01
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x028e
            long r4 = r10.A00
        L_0x028e:
            long r2 = r1.A03
            long r6 = r1.A02
            long r6 = r6 - r4
            int r5 = (int) r6
            int r4 = r1.A01
            X.7mo r12 = (X.C341397mo) r12
            java.lang.String r8 = "CameraEventLoggerImpl"
            r0 = 9
            if (r4 != r0) goto L_0x0017
            X.7rD r11 = r12.A01
            java.util.Map r0 = r11.A7G()
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "timestamp"
            r0.put(r2, r3)
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "ttff_optic_value_ms"
            r0.put(r2, r3)
            int r2 = r12.hashCode()
            long r2 = (long) r2
            java.lang.String r7 = "camera_first_frame_rendered"
            goto L_0x0491
        L_0x02bf:
            java.util.Queue r4 = r10.A06
            long r2 = r1.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.add(r0)
            goto L_0x0017
        L_0x02cc:
            java.util.Queue r2 = r10.A06
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0017
            java.lang.Object r2 = r2.remove()
            if (r2 == 0) goto L_0x0017
            java.util.Queue r0 = r10.A07
            r0.add(r2)
            goto L_0x0017
        L_0x02e1:
            r10.A05 = r8
            java.util.Queue r2 = r10.A07
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0017
            r2.remove()
            goto L_0x0017
        L_0x02f0:
            java.util.Queue r2 = r10.A07
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x02fb
            r2.remove()
        L_0x02fb:
            r10.A05 = r8
            goto L_0x0017
        L_0x02ff:
            r10.A04 = r2
            r4 = 23
            goto L_0x045d
        L_0x0305:
            r10.A04 = r8
            java.util.Queue r0 = r10.A06
            r0.clear()
            r4 = 24
            goto L_0x045d
        L_0x0310:
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x0017
            r10.A05 = r2
            long r3 = r1.A03
            int r0 = r5.arg1
            if (r0 != r8) goto L_0x031d
            r2 = 1
        L_0x031d:
            X.7mo r12 = (X.C341397mo) r12
            java.lang.String r15 = "CameraEventLoggerImpl"
            X.7rD r11 = r12.A01
            java.lang.String r10 = r11.getActiveSessionId()
            java.util.HashMap r6 = X.C341397mo.A08
            boolean r0 = r6.containsKey(r10)
            r5 = 0
            if (r0 != 0) goto L_0x0337
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r6.put(r10, r0)
        L_0x0337:
            java.util.HashMap r9 = X.C341397mo.A09
            java.lang.Object r0 = r9.get(r10)
            if (r0 == 0) goto L_0x03b1
            java.lang.Object r0 = r9.get(r10)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
        L_0x034b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.put(r10, r0)
            java.util.Map r0 = r11.A7G()
            java.lang.Object r6 = r6.get(r10)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            java.lang.String r6 = "session_connect_count"
            r0.put(r6, r7)
            java.lang.Object r6 = r9.get(r10)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            java.lang.String r6 = "session_disconnect_count"
            r0.put(r6, r7)
            int r6 = X.C341397mo.A05
            int r6 = r6 - r8
            X.C341397mo.A05 = r6
            java.lang.String r7 = java.lang.String.valueOf(r6)
            java.lang.String r6 = "open_connections_count"
            r0.put(r6, r7)
            java.util.concurrent.atomic.AtomicBoolean r6 = r12.A03
            boolean r7 = r6.get()
            java.lang.String r8 = java.lang.String.valueOf(r7)
            java.lang.String r7 = "has_connect_request"
            r0.put(r7, r8)
            java.lang.String r7 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "evicted_during_disconnect"
            r0.put(r2, r7)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = "timestamp"
            r0.put(r2, r3)
            int r2 = r12.hashCode()
            long r2 = (long) r2
            java.lang.String r14 = "camera_disconnect_finished"
            r12 = r2
            r16 = r0
            r11.ChM(r12, r14, r15, r16)
            r6.set(r5)
            goto L_0x0497
        L_0x03b1:
            r0 = 1
            goto L_0x034b
        L_0x03b3:
            java.lang.Object r0 = r1.A05
            r0.getClass()
            android.util.Pair r0 = (android.util.Pair) r0
            long r3 = r1.A03
            java.lang.Object r2 = r0.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r12.D08(r3, r2, r0)
            goto L_0x0017
        L_0x03c9:
            java.lang.Object r0 = r1.A05
            r0.getClass()
            goto L_0x0017
        L_0x03d0:
            r4 = 30
            goto L_0x045d
        L_0x03d4:
            r4 = 31
            goto L_0x045d
        L_0x03d8:
            r4 = 32
            goto L_0x045d
        L_0x03dc:
            r4 = 33
            goto L_0x045d
        L_0x03df:
            long r2 = r1.A03
            int r4 = r5.arg1
            X.7mo r12 = (X.C341397mo) r12
            X.7rD r5 = r12.A01
            java.lang.String r7 = "CameraEventLoggerImpl"
            int r0 = r12.hashCode()
            long r10 = (long) r0
            java.util.HashMap r9 = X.C341397mo.A00(r4, r2)
            java.lang.String r6 = "camera_update_finished"
            goto L_0x040a
        L_0x03f5:
            long r2 = r1.A03
            int r4 = r5.arg1
            X.7mo r12 = (X.C341397mo) r12
            X.7rD r5 = r12.A01
            java.lang.String r7 = "CameraEventLoggerImpl"
            int r0 = r12.hashCode()
            long r10 = (long) r0
            java.util.HashMap r9 = X.C341397mo.A00(r4, r2)
            java.lang.String r6 = "camera_update_started"
        L_0x040a:
            java.lang.String r8 = "SETTINGS"
            r5.ChO(r6, r7, r8, r9, r10)
            goto L_0x0017
        L_0x0411:
            long r2 = r1.A03
            int r6 = r5.arg1
            java.lang.Object r5 = r1.A05
            r5.getClass()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            X.7mo r12 = (X.C341397mo) r12
            java.lang.String r0 = r5.getMessage()
            if (r0 == 0) goto L_0x0446
            java.lang.String r4 = r5.getMessage()
        L_0x0428:
            X.7rD r7 = r12.A01
            java.lang.String r10 = "CameraEventLoggerImpl"
            int r0 = r12.hashCode()
            long r14 = (long) r0
            r0 = 10017(0x2721, float:1.4037E-41)
            X.9dR r8 = new X.9dR
            r8.<init>(r4, r5, r0)
            java.util.HashMap r13 = X.C341397mo.A00(r6, r2)
            java.lang.String r9 = "camera_update_failed"
            java.lang.String r11 = "medium"
            r12 = r10
            r7.ChL(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0017
        L_0x0446:
            java.lang.String r4 = "No error message provided."
            goto L_0x0428
        L_0x0449:
            r4 = 37
            goto L_0x045d
        L_0x044c:
            r4 = 38
            goto L_0x045d
        L_0x044f:
            r4 = 39
            goto L_0x045d
        L_0x0452:
            r4 = 40
            goto L_0x045d
        L_0x0455:
            r4 = 41
            goto L_0x045d
        L_0x0458:
            r4 = 42
            goto L_0x045d
        L_0x045b:
            r4 = 43
        L_0x045d:
            long r2 = r1.A03
            X.7mo r12 = (X.C341397mo) r12
            r0 = 5
            if (r4 == r0) goto L_0x04cc
            r0 = 6
            if (r4 == r0) goto L_0x04c9
            r0 = 7
            if (r4 == r0) goto L_0x04c6
            r0 = 23
            if (r4 == r0) goto L_0x04c3
            r0 = 24
            if (r4 == r0) goto L_0x04c0
            switch(r4) {
                case 30: goto L_0x04b4;
                case 31: goto L_0x04b7;
                case 32: goto L_0x04ba;
                case 33: goto L_0x04bd;
                default: goto L_0x0475;
            }
        L_0x0475:
            switch(r4) {
                case 37: goto L_0x049c;
                case 38: goto L_0x049f;
                case 39: goto L_0x04a2;
                case 40: goto L_0x04a5;
                case 41: goto L_0x04a8;
                case 42: goto L_0x04ab;
                case 43: goto L_0x04ae;
                case 44: goto L_0x04b1;
                default: goto L_0x0478;
            }
        L_0x0478:
            r7 = 0
        L_0x0479:
            java.lang.String r8 = "CameraEventLoggerImpl"
            if (r7 == 0) goto L_0x0017
            X.7rD r11 = r12.A01
            java.util.Map r0 = r11.A7G()
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "timestamp"
            r0.put(r2, r3)
            int r2 = r12.hashCode()
            long r2 = (long) r2
        L_0x0491:
            r4 = r11
            r5 = r2
            r9 = r0
            r4.ChM(r5, r7, r8, r9)
        L_0x0497:
            r11.ECg(r0)
            goto L_0x0017
        L_0x049c:
            java.lang.String r7 = "get_surface_texture_started"
            goto L_0x0479
        L_0x049f:
            java.lang.String r7 = "get_surface_texture_finished"
            goto L_0x0479
        L_0x04a2:
            java.lang.String r7 = "initialise_camera_started"
            goto L_0x0479
        L_0x04a5:
            java.lang.String r7 = "initialise_camera_finished"
            goto L_0x0479
        L_0x04a8:
            java.lang.String r7 = "camera_meta_data_handler_setup_started"
            goto L_0x0479
        L_0x04ab:
            java.lang.String r7 = "camera_meta_data_handler_setup_finished"
            goto L_0x0479
        L_0x04ae:
            java.lang.String r7 = "camera_features_prepare_started"
            goto L_0x0479
        L_0x04b1:
            java.lang.String r7 = "camera_features_prepare_finished"
            goto L_0x0479
        L_0x04b4:
            java.lang.String r7 = "camera_open_started"
            goto L_0x0479
        L_0x04b7:
            java.lang.String r7 = "camera_open_finished"
            goto L_0x0479
        L_0x04ba:
            java.lang.String r7 = "preview_start_started"
            goto L_0x0479
        L_0x04bd:
            java.lang.String r7 = "preview_start_finished"
            goto L_0x0479
        L_0x04c0:
            java.lang.String r7 = "camera_disconnect_started"
            goto L_0x0479
        L_0x04c3:
            java.lang.String r7 = "camera_disconnect_requested"
            goto L_0x0479
        L_0x04c6:
            java.lang.String r7 = "camera_warmup_finished"
            goto L_0x0479
        L_0x04c9:
            java.lang.String r7 = "camera_warmup_started"
            goto L_0x0479
        L_0x04cc:
            java.lang.String r7 = "camera_warmup_requested"
            goto L_0x0479
        L_0x04cf:
            r1.A04 = r0     // Catch:{ all -> 0x04e4 }
            r1.A05 = r0     // Catch:{ all -> 0x04e4 }
            int r2 = X.C342087o1.A06     // Catch:{ all -> 0x04e4 }
            r0 = 5
            if (r2 >= r0) goto L_0x04e2
            X.7o1 r0 = X.C342087o1.A07     // Catch:{ all -> 0x04e4 }
            r1.A00 = r0     // Catch:{ all -> 0x04e4 }
            X.C342087o1.A07 = r1     // Catch:{ all -> 0x04e4 }
            int r0 = r2 + 1
            X.C342087o1.A06 = r0     // Catch:{ all -> 0x04e4 }
        L_0x04e2:
            monitor-exit(r3)     // Catch:{ all -> 0x04e4 }
            return
        L_0x04e4:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x04e4 }
            throw r1
        L_0x04e7:
            return
        L_0x04e8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Null camera event logger found when processing message:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x04ff:
            java.lang.String r0 = "LoggerEventData must not be null"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340227ku.handleMessage(android.os.Message):void");
    }

    public C340227ku(Looper looper) {
        super(looper);
    }
}
