package X;

import android.content.Context;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.EnumSet;
import java.util.concurrent.ScheduledExecutorService;

public final class SRA {
    public C10951S2j A00;
    public C10677RwG A01;
    public String A02;
    public InetAddress A03;
    public InetAddress A04;
    public Socket A05;
    public boolean A06;
    public final Context A07;
    public final RealtimeSinceBootClock A08;
    public final SRZ A09;
    public final C10676RwF A0A;
    public final C10937S1q A0B;
    public final C10859RzK A0C;
    public final C2601944q A0D;
    public final String A0E;
    public final ScheduledExecutorService A0F;
    public final AnonymousClass458 A0G;
    public volatile C10233Rot A0H;
    public volatile S5H A0I;
    public volatile boolean A0J = false;

    public static AssertionError A01(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(C273654mx.A00(521));
        sb.append(obj);
        return new AssertionError(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x034d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r5 = r5.name();
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x022f, code lost:
        r7 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02b5, code lost:
        r12 = r12 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02b6, code lost:
        r7 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02b9, code lost:
        if (r6 == false) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02bb, code lost:
        r5 = "PUBLISH_".concat(((X.S1G) ((X.C7881Qc5) r14).A02).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02ca, code lost:
        r10 = r15.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02cc, code lost:
        if (r7 < 0) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02ce, code lost:
        r2 = r10.A00;
        r0 = X.ST3.A0c;
        ((X.C12250Sq4) r2.A0B.A05(X.C7866Qbq.class)).A03(new java.lang.String[]{r2.A0a, "m", "s", "b"}, (long) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02ed, code lost:
        r8 = r10.A00;
        r0 = X.ST3.A0c;
        ((X.C12250Sq4) r8.A0B.A05(X.C7866Qbq.class)).A03(new java.lang.String[]{r8.A0a, "m", "s", "c"}, 1);
        X.SH2.A02.A00(r7, true);
        r2 = r8.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0315, code lost:
        if (r2 == null) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0317, code lost:
        r2.A01.A0M.EFn((long) r7, r5, true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.SRA r13, X.C10938S1r r14, X.C10677RwG r15) {
        /*
            if (r15 == 0) goto L_0x0366
            boolean r6 = r14 instanceof X.C7881Qc5
            if (r6 == 0) goto L_0x0017
            java.lang.Object r0 = r14.A02
            X.S1G r0 = (X.S1G) r0
            java.lang.String r0 = r0.A01
            X.Qbl r1 = X.C7861Qbl.A00(r0)
        L_0x0010:
            boolean r0 = r1 instanceof X.C7860Qbk
            if (r0 == 0) goto L_0x001a
            java.lang.String r4 = ""
            goto L_0x002c
        L_0x0017:
            X.Qbk r1 = X.C7860Qbk.A00
            goto L_0x0010
        L_0x001a:
            java.lang.Object r0 = r1.A01()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = X.C11147SCc.A00(r0)
            if (r4 != 0) goto L_0x002c
            java.lang.Object r4 = r1.A01()
            java.lang.String r4 = (java.lang.String) r4
        L_0x002c:
            monitor-enter(r15)     // Catch:{ IOException -> 0x0351 }
            X.SNX r1 = r14.A00     // Catch:{ all -> 0x034e }
            X.RFZ r5 = r1.A03     // Catch:{ all -> 0x034e }
            int r0 = r5.ordinal()     // Catch:{ all -> 0x034e }
            r7 = 0
            switch(r0) {
                case 0: goto L_0x0232;
                case 1: goto L_0x0056;
                case 2: goto L_0x0263;
                case 3: goto L_0x020c;
                case 4: goto L_0x0039;
                case 5: goto L_0x0039;
                case 6: goto L_0x0039;
                case 7: goto L_0x00c2;
                case 8: goto L_0x0138;
                case 9: goto L_0x0183;
                case 10: goto L_0x01e8;
                case 11: goto L_0x0243;
                case 12: goto L_0x0253;
                default: goto L_0x0039;
            }     // Catch:{ all -> 0x034e }
        L_0x0039:
            java.lang.String r3 = "MessageEncoder"
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x034e }
            java.lang.String r0 = "Unknown message type: "
            java.lang.IllegalArgumentException r2 = X.C51973G9u.A0g(r5, r0, r1)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "send/unexpected; type=%s"
            java.lang.Object[] r0 = new java.lang.Object[]{r5}     // Catch:{ all -> 0x034e }
            X.0KC.A0M(r3, r1, r2, r0)     // Catch:{ all -> 0x034e }
        L_0x004f:
            java.lang.String r5 = r5.name()     // Catch:{ all -> 0x034e }
            r3 = r5
            goto L_0x02b9
        L_0x0056:
            boolean r0 = r14 instanceof X.C7878Qc2     // Catch:{ all -> 0x034e }
            if (r0 == 0) goto L_0x0326
            r3 = r14
            X.Qc2 r3 = (X.C7878Qc2) r3     // Catch:{ all -> 0x034e }
            java.lang.Object r0 = r3.A02     // Catch:{ all -> 0x034e }
            X.Rou r0 = (X.C10234Rou) r0     // Catch:{ all -> 0x034e }
            byte r2 = r0.A00     // Catch:{ all -> 0x034e }
            r1 = 1
            r12 = 4
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x034e }
            X.S2z r0 = (X.C10967S2z) r0     // Catch:{ all -> 0x034e }
            if (r2 != 0) goto L_0x009f
            r0.getClass()     // Catch:{ all -> 0x034e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x034e }
            byte[] r8 = X.C11369SPu.A03(r0)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x034e }
            X.SNX r0 = r3.A00     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r1 = A00(r0, r15, r1)     // Catch:{ all -> 0x034e }
            int r3 = r8.length     // Catch:{ all -> 0x034e }
            int r0 = r3 + 4
            int r0 = X.C11369SPu.A02(r1, r0)     // Catch:{ all -> 0x034e }
            int r1 = r0 + 1
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.writeByte(r7)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.writeByte(r2)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.writeShort(r3)     // Catch:{ all -> 0x034e }
            int r12 = r1 + 4
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.write(r8)     // Catch:{ all -> 0x034e }
            int r12 = r12 + r3
            goto L_0x00bb
        L_0x009f:
            if (r0 == 0) goto L_0x00a2
            r1 = 0
        L_0x00a2:
            X.S9L.A01(r1)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x034e }
            X.SNX r0 = r3.A00     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r1 = A00(r0, r15, r1)     // Catch:{ all -> 0x034e }
            r0 = 2
            r1.writeByte(r0)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.writeByte(r7)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.writeByte(r2)     // Catch:{ all -> 0x034e }
        L_0x00bb:
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.flush()     // Catch:{ all -> 0x034e }
            goto L_0x02b6
        L_0x00c2:
            boolean r0 = r14 instanceof X.C7883Qc7     // Catch:{ all -> 0x034e }
            if (r0 == 0) goto L_0x032b
            r0 = r14
            X.Qc7 r0 = (X.C7883Qc7) r0     // Catch:{ all -> 0x034e }
            X.SNX r8 = r0.A00     // Catch:{ all -> 0x034e }
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x034e }
            X.S0O r1 = (X.S0O) r1     // Catch:{ all -> 0x034e }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x034e }
            X.S0P r0 = (X.S0P) r0     // Catch:{ all -> 0x034e }
            java.util.List r2 = r0.A00     // Catch:{ all -> 0x034e }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ all -> 0x034e }
            r3 = 0
        L_0x00da:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x034e }
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x034e }
            com.facebook.rti.mqtt.protocol.messages.SubscribeTopic r0 = (com.facebook.rti.mqtt.protocol.messages.SubscribeTopic) r0     // Catch:{ all -> 0x034e }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x034e }
            byte[] r0 = X.C11369SPu.A03(r0)     // Catch:{ all -> 0x034e }
            int r0 = r0.length     // Catch:{ all -> 0x034e }
            int r0 = r0 + 2
            int r3 = r3 + r0
            int r3 = r3 + 1
            goto L_0x00da
        L_0x00f3:
            int r3 = r3 + 2
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = A00(r8, r15, r0)     // Catch:{ all -> 0x034e }
            int r0 = X.C11369SPu.A02(r0, r3)     // Catch:{ all -> 0x034e }
            int r12 = r0 + 1
            int r1 = r1.A00     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.writeShort(r1)     // Catch:{ all -> 0x034e }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ all -> 0x034e }
        L_0x010c:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x034e }
            if (r0 == 0) goto L_0x0131
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x034e }
            com.facebook.rti.mqtt.protocol.messages.SubscribeTopic r8 = (com.facebook.rti.mqtt.protocol.messages.SubscribeTopic) r8     // Catch:{ all -> 0x034e }
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x034e }
            byte[] r2 = X.C11369SPu.A03(r0)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            int r1 = r2.length     // Catch:{ all -> 0x034e }
            r0.writeShort(r1)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.write(r2, r7, r1)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x034e }
            int r0 = r8.A00     // Catch:{ all -> 0x034e }
            r1.write(r0)     // Catch:{ all -> 0x034e }
            goto L_0x010c
        L_0x0131:
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.flush()     // Catch:{ all -> 0x034e }
            goto L_0x02b5
        L_0x0138:
            boolean r0 = r14 instanceof X.C7882Qc6     // Catch:{ all -> 0x034e }
            if (r0 == 0) goto L_0x0330
            r7 = r14
            X.Qc6 r7 = (X.C7882Qc6) r7     // Catch:{ all -> 0x034e }
            java.lang.Object r0 = r7.A01     // Catch:{ all -> 0x034e }
            X.Rov r0 = (X.C10235Rov) r0     // Catch:{ all -> 0x034e }
            java.util.List r2 = r0.A00     // Catch:{ all -> 0x034e }
            int r0 = r2.size()     // Catch:{ all -> 0x034e }
            int r3 = r0 + 2
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x034e }
            X.SNX r0 = r7.A00     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = A00(r0, r15, r1)     // Catch:{ all -> 0x034e }
            int r0 = X.C11369SPu.A02(r0, r3)     // Catch:{ all -> 0x034e }
            int r12 = r0 + 1
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x034e }
            java.lang.Object r0 = r7.A02     // Catch:{ all -> 0x034e }
            X.S0O r0 = (X.S0O) r0     // Catch:{ all -> 0x034e }
            int r0 = r0.A00     // Catch:{ all -> 0x034e }
            r1.writeShort(r0)     // Catch:{ all -> 0x034e }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x034e }
        L_0x0168:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x034e }
            if (r0 == 0) goto L_0x017c
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x034e }
            int r1 = X.Pxe.A09(r0)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.writeByte(r1)     // Catch:{ all -> 0x034e }
            goto L_0x0168
        L_0x017c:
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.flush()     // Catch:{ all -> 0x034e }
            goto L_0x02b5
        L_0x0183:
            boolean r0 = r14 instanceof X.C7884Qc9     // Catch:{ all -> 0x034e }
            if (r0 == 0) goto L_0x0335
            r0 = r14
            X.Qc9 r0 = (X.C7884Qc9) r0     // Catch:{ all -> 0x034e }
            X.SNX r8 = r0.A00     // Catch:{ all -> 0x034e }
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x034e }
            X.S0O r1 = (X.S0O) r1     // Catch:{ all -> 0x034e }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x034e }
            X.S0Q r0 = (X.S0Q) r0     // Catch:{ all -> 0x034e }
            java.util.List r2 = r0.A00     // Catch:{ all -> 0x034e }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ all -> 0x034e }
            r3 = 0
        L_0x019b:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x034e }
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = X.AnonymousClass7TE.A18(r9)     // Catch:{ all -> 0x034e }
            byte[] r0 = X.C11369SPu.A03(r0)     // Catch:{ all -> 0x034e }
            int r0 = r0.length     // Catch:{ all -> 0x034e }
            int r0 = r0 + 2
            int r3 = r3 + r0
            goto L_0x019b
        L_0x01ae:
            int r3 = r3 + 2
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = A00(r8, r15, r0)     // Catch:{ all -> 0x034e }
            int r0 = X.C11369SPu.A02(r0, r3)     // Catch:{ all -> 0x034e }
            int r12 = r0 + 1
            int r1 = r1.A00     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.writeShort(r1)     // Catch:{ all -> 0x034e }
            java.util.Iterator r8 = r2.iterator()     // Catch:{ all -> 0x034e }
        L_0x01c7:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x034e }
            if (r0 == 0) goto L_0x01e1
            java.lang.String r0 = X.AnonymousClass7TE.A18(r8)     // Catch:{ all -> 0x034e }
            byte[] r2 = X.C11369SPu.A03(r0)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            int r1 = r2.length     // Catch:{ all -> 0x034e }
            r0.writeShort(r1)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.write(r2, r7, r1)     // Catch:{ all -> 0x034e }
            goto L_0x01c7
        L_0x01e1:
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.flush()     // Catch:{ all -> 0x034e }
            goto L_0x02b5
        L_0x01e8:
            boolean r0 = r14 instanceof X.Qc8     // Catch:{ all -> 0x034e }
            if (r0 == 0) goto L_0x033a
            r2 = r14
            X.Qc8 r2 = (X.Qc8) r2     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x034e }
            X.SNX r0 = r2.A00     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r1 = A00(r0, r15, r1)     // Catch:{ all -> 0x034e }
            r0 = 2
            r1.writeByte(r0)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x034e }
            java.lang.Object r0 = r2.A02     // Catch:{ all -> 0x034e }
            X.S0O r0 = (X.S0O) r0     // Catch:{ all -> 0x034e }
            int r0 = r0.A00     // Catch:{ all -> 0x034e }
            r1.writeShort(r0)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.flush()     // Catch:{ all -> 0x034e }
            goto L_0x022f
        L_0x020c:
            boolean r0 = r14 instanceof X.C7880Qc4     // Catch:{ all -> 0x034e }
            if (r0 == 0) goto L_0x033f
            r0 = r14
            X.Qc4 r0 = (X.C7880Qc4) r0     // Catch:{ all -> 0x034e }
            X.SNX r1 = r0.A00     // Catch:{ all -> 0x034e }
            java.lang.Object r2 = r0.A02     // Catch:{ all -> 0x034e }
            X.S0O r2 = (X.S0O) r2     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r1 = A00(r1, r15, r0)     // Catch:{ all -> 0x034e }
            r0 = 2
            r1.writeByte(r0)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x034e }
            int r0 = r2.A00     // Catch:{ all -> 0x034e }
            r1.writeShort(r0)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.flush()     // Catch:{ all -> 0x034e }
        L_0x022f:
            r7 = 4
            goto L_0x004f
        L_0x0232:
            boolean r0 = r14 instanceof X.C7879Qc3     // Catch:{ all -> 0x034e }
            if (r0 == 0) goto L_0x0344
            r2 = r14
            X.Qc3 r2 = (X.C7879Qc3) r2     // Catch:{ all -> 0x034e }
            X.44q r1 = r15.A03     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            int r7 = r1.handleConnectMessage(r0, r2)     // Catch:{ all -> 0x034e }
            goto L_0x004f
        L_0x0243:
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = A00(r1, r15, r0)     // Catch:{ all -> 0x034e }
            r0.writeByte(r7)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.flush()     // Catch:{ all -> 0x034e }
            goto L_0x004f
        L_0x0253:
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = A00(r1, r15, r0)     // Catch:{ all -> 0x034e }
            r0.writeByte(r7)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.flush()     // Catch:{ all -> 0x034e }
            goto L_0x004f
        L_0x0263:
            if (r6 == 0) goto L_0x0349
            r0 = r14
            X.Qc5 r0 = (X.C7881Qc5) r0     // Catch:{ all -> 0x034e }
            X.SNX r12 = r0.A00     // Catch:{ all -> 0x034e }
            java.lang.Object r10 = r0.A02     // Catch:{ all -> 0x034e }
            X.S1G r10 = (X.S1G) r10     // Catch:{ all -> 0x034e }
            java.lang.Object r8 = r0.A01     // Catch:{ all -> 0x034e }
            byte[] r8 = (byte[]) r8     // Catch:{ all -> 0x034e }
            int r0 = r15.A01     // Catch:{ all -> 0x034e }
            r2 = 2
            if (r0 == 0) goto L_0x027b
            byte[] r8 = X.0gU.A00(r8)     // Catch:{ all -> 0x034e }
        L_0x027b:
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x034e }
            byte[] r11 = X.C11369SPu.A03(r0)     // Catch:{ all -> 0x034e }
            int r9 = r11.length     // Catch:{ all -> 0x034e }
            int r3 = r9 + 2
            int r1 = r12.A02     // Catch:{ all -> 0x034e }
            if (r1 > 0) goto L_0x0289
            r2 = 0
        L_0x0289:
            int r3 = r3 + r2
            int r2 = r8.length     // Catch:{ all -> 0x034e }
            int r3 = r3 + r2
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = A00(r12, r15, r0)     // Catch:{ all -> 0x034e }
            int r0 = X.C11369SPu.A02(r0, r3)     // Catch:{ all -> 0x034e }
            int r12 = r0 + 1
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.writeShort(r9)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.write(r11, r7, r9)     // Catch:{ all -> 0x034e }
            if (r1 <= 0) goto L_0x02ab
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x034e }
            int r0 = r10.A00     // Catch:{ all -> 0x034e }
            r1.writeShort(r0)     // Catch:{ all -> 0x034e }
        L_0x02ab:
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.write(r8, r7, r2)     // Catch:{ all -> 0x034e }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x034e }
            r0.flush()     // Catch:{ all -> 0x034e }
        L_0x02b5:
            int r12 = r12 + r3
        L_0x02b6:
            r7 = r12
            goto L_0x004f
        L_0x02b9:
            if (r6 == 0) goto L_0x02ca
            r0 = r14
            X.Qc5 r0 = (X.C7881Qc5) r0     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "PUBLISH_"
            java.lang.Object r0 = r0.A02     // Catch:{ all -> 0x034e }
            X.S1G r0 = (X.S1G) r0     // Catch:{ all -> 0x034e }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x034e }
            java.lang.String r5 = r1.concat(r0)     // Catch:{ all -> 0x034e }
        L_0x02ca:
            X.Rot r10 = r15.A02     // Catch:{ all -> 0x034e }
            if (r7 < 0) goto L_0x02ed
            X.ST3 r2 = r10.A00     // Catch:{ all -> 0x034e }
            java.util.EnumSet r0 = X.ST3.A0c     // Catch:{ all -> 0x034e }
            X.ST2 r1 = r2.A0B     // Catch:{ all -> 0x034e }
            java.lang.Class<X.Qbq> r0 = X.C7866Qbq.class
            X.TaT r11 = r1.A05(r0)     // Catch:{ all -> 0x034e }
            X.Sq4 r11 = (X.C12250Sq4) r11     // Catch:{ all -> 0x034e }
            long r0 = (long) r7     // Catch:{ all -> 0x034e }
            java.lang.String r9 = r2.A0a     // Catch:{ all -> 0x034e }
            java.lang.String r8 = "m"
            java.lang.String r6 = "s"
            java.lang.String r2 = "b"
            java.lang.String[] r2 = new java.lang.String[]{r9, r8, r6, r2}     // Catch:{ all -> 0x034e }
            r11.A03(r2, r0)     // Catch:{ all -> 0x034e }
        L_0x02ed:
            X.ST3 r8 = r10.A00     // Catch:{ all -> 0x034e }
            java.util.EnumSet r0 = X.ST3.A0c     // Catch:{ all -> 0x034e }
            X.ST2 r1 = r8.A0B     // Catch:{ all -> 0x034e }
            java.lang.Class<X.Qbq> r0 = X.C7866Qbq.class
            X.TaT r9 = r1.A05(r0)     // Catch:{ all -> 0x034e }
            X.Sq4 r9 = (X.C12250Sq4) r9     // Catch:{ all -> 0x034e }
            java.lang.String r10 = r8.A0a     // Catch:{ all -> 0x034e }
            java.lang.String r2 = "m"
            r6 = 1
            java.lang.String r1 = "s"
            java.lang.String r0 = "c"
            java.lang.String[] r2 = new java.lang.String[]{r10, r2, r1, r0}     // Catch:{ all -> 0x034e }
            r0 = 1
            r9.A03(r2, r0)     // Catch:{ all -> 0x034e }
            X.SH2 r0 = X.SH2.A02     // Catch:{ all -> 0x034e }
            r0.A00(r7, r6)     // Catch:{ all -> 0x034e }
            X.Rrs r2 = r8.A0X     // Catch:{ all -> 0x034e }
            if (r2 == 0) goto L_0x031f
            long r0 = (long) r7     // Catch:{ all -> 0x034e }
            X.ST9 r2 = r2.A01     // Catch:{ all -> 0x034e }
            X.TiD r2 = r2.A0M     // Catch:{ all -> 0x034e }
            r2.EFn(r0, r5, r6)     // Catch:{ all -> 0x034e }
        L_0x031f:
            monitor-exit(r15)     // Catch:{ IOException -> 0x0351 }
            X.S5H r0 = r13.A0I
            r0.A01(r3, r4)
            return
        L_0x0326:
            java.lang.AssertionError r0 = A01(r14)     // Catch:{ all -> 0x034e }
            goto L_0x034d
        L_0x032b:
            java.lang.AssertionError r0 = A01(r14)     // Catch:{ all -> 0x034e }
            goto L_0x034d
        L_0x0330:
            java.lang.AssertionError r0 = A01(r14)     // Catch:{ all -> 0x034e }
            goto L_0x034d
        L_0x0335:
            java.lang.AssertionError r0 = A01(r14)     // Catch:{ all -> 0x034e }
            goto L_0x034d
        L_0x033a:
            java.lang.AssertionError r0 = A01(r14)     // Catch:{ all -> 0x034e }
            goto L_0x034d
        L_0x033f:
            java.lang.AssertionError r0 = A01(r14)     // Catch:{ all -> 0x034e }
            goto L_0x034d
        L_0x0344:
            java.lang.AssertionError r0 = A01(r14)     // Catch:{ all -> 0x034e }
            goto L_0x034d
        L_0x0349:
            java.lang.AssertionError r0 = A01(r14)     // Catch:{ all -> 0x034e }
        L_0x034d:
            throw r0     // Catch:{ all -> 0x034e }
        L_0x034e:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ IOException -> 0x0351 }
            throw r0     // Catch:{ IOException -> 0x0351 }
        L_0x0351:
            r3 = move-exception
            X.S5H r2 = r13.A0I
            X.SNX r0 = r14.A00
            X.RFZ r0 = r0.A03
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "-failed"
            java.lang.String r0 = X.002.A0R(r1, r0)
            r2.A01(r0, r4)
            throw r3
        L_0x0366:
            java.lang.String r0 = "No message encoder"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SRA.A02(X.SRA, X.S1r, X.RwG):void");
    }

    public final void A03() {
        Socket socket = this.A05;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
        synchronized (this) {
            this.A05 = null;
            this.A02 = null;
            this.A00 = null;
            this.A01 = null;
            S5H s5h = this.A0I;
            Integer num = AnonymousClass05K.A0N;
            ST3 st3 = s5h.A00;
            EnumSet enumSet = ST3.A0c;
            st3.A0Y = num;
        }
        this.A0I.A00();
    }

    public SRA(Context context, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass458 r4, SRZ srz, C10676RwF rwF, C10937S1q s1q, C10859RzK rzK, C2601944q r9, String str, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.A0A = rwF;
        this.A09 = srz;
        this.A0C = rzK;
        this.A08 = realtimeSinceBootClock;
        this.A0G = r4;
        this.A0F = scheduledExecutorService;
        this.A0B = s1q;
        this.A0D = r9;
        this.A07 = context;
        this.A0E = str == null ? "android_legacy" : str;
        this.A06 = z;
    }

    public static DataOutputStream A00(SNX snx, C10677RwG rwG, DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(C11369SPu.A01(snx));
        return rwG.A00;
    }
}
