package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.XFz  reason: case insensitive filesystem */
public final class C21132XFz extends Handler {
    public 1tG A00;
    public C21970Xnw A01;
    public Queue A02;
    public Stack A03;
    public final 1qv A04;
    public final Integer A05;
    public final Object A06 = Pxe.A0p();
    public final Object A07 = Pxe.A0p();
    public final Object A08 = Pxe.A0p();
    public final /* synthetic */ C21488Xcf A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21132XFz(Looper looper, C21488Xcf xcf, 1qv r4, Integer num) {
        super(looper);
        this.A09 = xcf;
        this.A04 = r4;
        this.A05 = num;
    }

    private Xnq A00() {
        C21488Xcf xcf = this.A09;
        Xnq xnq = xcf.A00;
        if (xnq != null) {
            return xnq;
        }
        C21457XbL xbL = xcf.A05;
        Context context = xbL.A03;
        1uY A002 = 1uY.A00(!C67581ty.A00(context).A01());
        String str = xbL.A0D;
        File A003 = AnonymousClass0eX.A00(context, 1543572765);
        A003.mkdirs();
        File file = new File(A003, str);
        file.mkdirs();
        C66931qz r0 = xbL.A06;
        int Bxb = r0.Bxb();
        int BAQ = r0.BAQ();
        int AiP = r0.AiP();
        C67521tl r11 = xbL.A07;
        AnonymousClass0K0 r13 = xbL.A0A;
        String A004 = AnonymousClass1Uu.A00();
        if (A004 == null) {
            A004 = "unknown";
        }
        1un r9 = new 1un(xbL.A04, r11, A002, r13, new File(file, A004), Bxb, BAQ, AiP, xbL.A01);
        int i = xbL.A00;
        1uw r7 = new 1uw(xbL.A08, file, HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS);
        C66891qr r6 = xbL.A05;
        Class cls = xbL.A0C;
        C67301sn r02 = xbL.A09;
        Context context2 = context;
        Xnq xnq2 = new Xnq(r9, new C12011SkV(context2, r6, r7, r02.B7M(), r02.Aeq(), xbL.A0B, cls, i, xbL.A0E));
        xcf.A00 = xnq2;
        return xnq2;
    }

    private Xnq A01() {
        C21488Xcf xcf = this.A09;
        if (xcf.A01 == null) {
            C21457XbL xbL = xcf.A05;
            C66931qz r0 = xbL.A06;
            int Bxb = r0.Bxb();
            int BAQ = r0.BAQ();
            int AiP = r0.AiP();
            C67521tl r7 = xbL.A07;
            AnonymousClass0K0 r8 = xbL.A0A;
            Xnq xnq = new Xnq(new 1uo(xbL.A04, r7, r8, Bxb, BAQ, AiP), new C22140Xw4(xbL.A03, xbL.A08, r8, xbL.A0B));
            xcf.A01 = xnq;
            xnq.A00.A03(this.A00);
        }
        return xcf.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r0 != null) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(X.1tH r7) {
        /*
            r6 = this;
            java.lang.String r0 = "doWrite"
            X.08j.A00(r0)
            X.0Df r3 = r7.A03
            java.lang.String r0 = "writeToDisk"
            X.08j.A00(r0)     // Catch:{ all -> 0x0072 }
            r4 = 1
            X.Xnq r1 = r6.A00()     // Catch:{ 1tu | 1tv | IOException -> 0x0023 }
            X.1uo r0 = r1.A00     // Catch:{ 1tu | 1tv | IOException -> 0x0023 }
            r0.A04(r3)     // Catch:{ 1tu | 1tv | IOException -> 0x0023 }
            X.Xnq.A00(r1)     // Catch:{ 1tu | 1tv | IOException -> 0x0023 }
            java.lang.String r2 = "event.persisted"
            java.lang.String r1 = r7.A05     // Catch:{ 1tu | 1tv | IOException -> 0x0023 }
            java.lang.String r0 = r7.A06     // Catch:{ 1tu | 1tv | IOException -> 0x0023 }
            A05(r6, r3, r2, r1, r0)     // Catch:{ 1tu | 1tv | IOException -> 0x0023 }
            goto L_0x0047
        L_0x0023:
            java.lang.String r0 = "event.not_processed.persist.failed"
            java.lang.String r5 = r7.A05     // Catch:{ all -> 0x0064 }
            java.lang.String r2 = r7.A06     // Catch:{ all -> 0x0064 }
            A05(r6, r3, r0, r5, r2)     // Catch:{ all -> 0x0064 }
            X.Xnq r1 = r6.A01()     // Catch:{ IOException -> 0x005d }
            X.1uo r0 = r1.A00     // Catch:{ IOException -> 0x005d }
            r0.A04(r3)     // Catch:{ IOException -> 0x005d }
            X.Xnq.A00(r1)     // Catch:{ IOException -> 0x005d }
            java.lang.String r0 = "event.persisted.in_memory"
            A05(r6, r3, r0, r5, r2)     // Catch:{ IOException -> 0x005d }
            X.AnonymousClass08k.A00()     // Catch:{ all -> 0x0072 }
            X.Xcf r0 = r6.A09     // Catch:{ all -> 0x0072 }
            X.1qH r0 = r0.A03     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0053
            goto L_0x0050
        L_0x0047:
            X.AnonymousClass08k.A00()     // Catch:{ all -> 0x0072 }
            X.Xcf r0 = r6.A09     // Catch:{ all -> 0x0072 }
            X.1qH r0 = r0.A03     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0053
        L_0x0050:
            r0.onEventsWritten(r4)     // Catch:{ all -> 0x0072 }
        L_0x0053:
            r6.A06(r3)     // Catch:{ all -> 0x0072 }
            r3.A02()
            X.AnonymousClass08k.A00()
            return
        L_0x005d:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0064 }
            r0.<init>(r1)     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            X.AnonymousClass08k.A00()     // Catch:{ all -> 0x0072 }
            X.Xcf r0 = r6.A09     // Catch:{ all -> 0x0072 }
            X.1qH r0 = r0.A03     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0071
            r0.onEventsWritten(r4)     // Catch:{ all -> 0x0072 }
        L_0x0071:
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            r3.A02()
            X.AnonymousClass08k.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21132XFz.A02(X.1tH):void");
    }

    private void A03(1tG r5) {
        08j.A00("doStartNewSession");
        try {
            0Sd.A01(r5, "A new batch session should never be null");
            this.A00 = r5;
            Xnq A002 = A00();
            A002.A00.A03(this.A00);
            Xnq xnq = this.A09.A01;
            if (xnq != null) {
                xnq.A00.A03(this.A00);
            }
            boolean A082 = A08();
            LinkedList linkedList = new LinkedList();
            synchronized (this.A08) {
                Queue queue = this.A02;
                if (queue != null) {
                    linkedList.addAll(queue);
                    this.A02.clear();
                    this.A02 = null;
                }
            }
            while (!linkedList.isEmpty()) {
                Message message = (Message) linkedList.poll();
                if (message != null) {
                    A07(!A082, message);
                    message.recycle();
                    A082 = true;
                }
            }
            AnonymousClass08k.A00();
        } catch (Throwable th) {
            AnonymousClass08k.A00();
            throw th;
        }
    }

    public static void A04(C21132XFz xFz) {
        if (xFz.A09.A04.B12()) {
            synchronized (xFz.A07) {
                xFz.A01 = null;
            }
        }
    }

    public static void A05(C21132XFz xFz, 0Df r9, String str, String str2, String str3) {
        1sY r1 = xFz.A09.A02;
        if (r1.A01()) {
            r1.A00().Cgk(str, str2, str3, new C20405Wqp(r9, 0), 1, true);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.1z2] */
    private void A06(0Df r3) {
        C66731qH r1 = this.A09.A03;
        if (r1 != null) {
            08j.A00("eventListener");
            try {
                AnonymousClass1z4.A00(r1, new Object(), r3);
            } finally {
                AnonymousClass08k.A00();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(17:37|38|93|45|46|47|48|49|50|51|52|53|(1:55)|59|(4:62|(2:64|89)(1:90)|65|60)|88|66) */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c6, code lost:
        r1 = r4.A09.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ca, code lost:
        if (r1 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cc, code lost:
        r1.onEventsWritten(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ea, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f0, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f1, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r1 = r4.A09.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00fa, code lost:
        if (r1 != null) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00fc, code lost:
        r1.onEventsWritten(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0101, code lost:
        X.AnonymousClass08k.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0104, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00af */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c0 A[Catch:{ all -> 0x0105 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A07(boolean r5, android.os.Message r6) {
        /*
            r4 = this;
            int r1 = r6.what
            r2 = 1
            if (r1 == r2) goto L_0x006a
            r0 = 3
            if (r1 == r0) goto L_0x0062
            r0 = 4
            if (r1 == r0) goto L_0x0040
            r0 = 7
            if (r1 == r0) goto L_0x0038
            r0 = 8
            if (r1 == r0) goto L_0x0069
            r0 = 9
            if (r1 != r0) goto L_0x0031
            java.lang.String r0 = "doUpload"
            X.08j.A00(r0)
            X.Xnq r0 = r4.A00()     // Catch:{ all -> 0x005f }
            X.1v4 r0 = r0.A01     // Catch:{ all -> 0x005f }
            r0.FHz()     // Catch:{ all -> 0x005f }
            X.Xcf r0 = r4.A09     // Catch:{ all -> 0x005f }
            X.Xnq r0 = r0.A01     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x00e6
            X.1v4 r0 = r0.A01     // Catch:{ all -> 0x005f }
            r0.FHz()     // Catch:{ all -> 0x005f }
            goto L_0x00e6
        L_0x0031:
            java.lang.String r0 = "Unknown what="
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r1)
            throw r0
        L_0x0038:
            java.lang.Object r0 = r6.obj
            android.os.ConditionVariable r0 = (android.os.ConditionVariable) r0
            r0.open()
            return
        L_0x0040:
            java.lang.Object r1 = r6.obj
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "doUserLogout"
            X.08j.A00(r0)
            X.Xnq r0 = r4.A00()     // Catch:{ all -> 0x005f }
            X.1v4 r0 = r0.A01     // Catch:{ all -> 0x005f }
            r0.CsG(r1)     // Catch:{ all -> 0x005f }
            X.Xcf r0 = r4.A09     // Catch:{ all -> 0x005f }
            X.Xnq r0 = r0.A01     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x00e6
            X.1v4 r0 = r0.A01     // Catch:{ all -> 0x005f }
            r0.CsG(r1)     // Catch:{ all -> 0x005f }
            goto L_0x00e6
        L_0x005f:
            r0 = move-exception
            goto L_0x0109
        L_0x0062:
            java.lang.Object r0 = r6.obj
            X.1tG r0 = (X.1tG) r0
            r4.A03(r0)
        L_0x0069:
            return
        L_0x006a:
            if (r5 == 0) goto L_0x007d
            X.1qv r1 = r4.A04
            if (r1 == 0) goto L_0x007d
            java.lang.String r0 = "doWaitForWriteBlockRelease"
            X.08j.A00(r0)
            java.lang.Integer r0 = r4.A05
            r1.A00(r0)
            X.AnonymousClass08k.A00()
        L_0x007d:
            int r1 = r6.arg1
            r0 = 2
            java.lang.Object r3 = r6.obj
            if (r1 == r0) goto L_0x008a
            X.1tH r3 = (X.1tH) r3
            r4.A02(r3)
            return
        L_0x008a:
            X.Xnw r3 = (X.C21970Xnw) r3
            java.lang.String r0 = "doWrites"
            X.08j.A00(r0)
            java.lang.Object r1 = r4.A07     // Catch:{ all -> 0x0105 }
            monitor-enter(r1)     // Catch:{ all -> 0x0105 }
            r3.A03 = r2     // Catch:{ all -> 0x00f3 }
            X.Xnw r0 = r4.A01     // Catch:{ all -> 0x00f3 }
            if (r0 != r3) goto L_0x009d
            r0 = 0
            r4.A01 = r0     // Catch:{ all -> 0x00f3 }
        L_0x009d:
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = "writeToDisk"
            X.08j.A00(r0)     // Catch:{ all -> 0x0105 }
            X.Xnq r1 = r4.A00()     // Catch:{ 1tu | 1tv | IOException -> 0x00af }
            X.0Df[] r2 = r3.A04     // Catch:{ 1tu | 1tv | IOException -> 0x00af }
            int r0 = r3.A01     // Catch:{ 1tu | 1tv | IOException -> 0x00af }
            r1.A01(r2, r0)     // Catch:{ 1tu | 1tv | IOException -> 0x00af }
            goto L_0x00c6
        L_0x00af:
            X.Xnq r1 = r4.A01()     // Catch:{ IOException -> 0x00ea }
            X.0Df[] r2 = r3.A04     // Catch:{ IOException -> 0x00ea }
            int r0 = r3.A01     // Catch:{ IOException -> 0x00ea }
            r1.A01(r2, r0)     // Catch:{ IOException -> 0x00ea }
            X.Xcf r0 = r4.A09     // Catch:{ all -> 0x0105 }
            X.1qH r1 = r0.A03     // Catch:{ all -> 0x0105 }
            if (r1 == 0) goto L_0x00d1
            int r0 = r3.A01     // Catch:{ all -> 0x0105 }
            r1.onEventsWritten(r0)     // Catch:{ all -> 0x0105 }
            goto L_0x00d1
        L_0x00c6:
            X.Xcf r0 = r4.A09     // Catch:{ all -> 0x0105 }
            X.1qH r1 = r0.A03     // Catch:{ all -> 0x0105 }
            if (r1 == 0) goto L_0x00d1
            int r0 = r3.A01     // Catch:{ all -> 0x0105 }
            r1.onEventsWritten(r0)     // Catch:{ all -> 0x0105 }
        L_0x00d1:
            X.AnonymousClass08k.A00()     // Catch:{ all -> 0x0105 }
            r1 = 0
        L_0x00d5:
            int r0 = r3.A01     // Catch:{ all -> 0x0105 }
            if (r1 >= r0) goto L_0x00e3
            r0 = r2[r1]     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00e0
            r4.A06(r0)     // Catch:{ all -> 0x0105 }
        L_0x00e0:
            int r1 = r1 + 1
            goto L_0x00d5
        L_0x00e3:
            r3.A00()
        L_0x00e6:
            X.AnonymousClass08k.A00()
            return
        L_0x00ea:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00f1 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r2 = move-exception
            goto L_0x00f6
        L_0x00f3:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            goto L_0x0104
        L_0x00f6:
            X.Xcf r0 = r4.A09     // Catch:{ all -> 0x0105 }
            X.1qH r1 = r0.A03     // Catch:{ all -> 0x0105 }
            if (r1 == 0) goto L_0x0101
            int r0 = r3.A01     // Catch:{ all -> 0x0105 }
            r1.onEventsWritten(r0)     // Catch:{ all -> 0x0105 }
        L_0x0101:
            X.AnonymousClass08k.A00()     // Catch:{ all -> 0x0105 }
        L_0x0104:
            throw r2     // Catch:{ all -> 0x0105 }
        L_0x0105:
            r0 = move-exception
            r3.A00()
        L_0x0109:
            X.AnonymousClass08k.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21132XFz.A07(boolean, android.os.Message):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        X.08j.A00("handleAsapMessage");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r3 != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1 = r4.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r1 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        X.08j.A00("doWaitForWriteBlockRelease");
        r1.A00(r4.A05);
        X.AnonymousClass08k.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        A02(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        X.AnonymousClass08k.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A08() {
        /*
            r4 = this;
            X.Xcf r0 = r4.A09
            X.1qz r0 = r0.A04
            boolean r0 = r0.B11()
            r3 = 0
            if (r0 != 0) goto L_0x000c
            return r3
        L_0x000c:
            java.lang.Object r1 = r4.A06
            monitor-enter(r1)
            java.util.Stack r0 = r4.A03     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0047
            java.util.Stack r0 = r4.A03     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = r0.pop()     // Catch:{ all -> 0x0049 }
            X.1tH r2 = (X.1tH) r2     // Catch:{ all -> 0x0049 }
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "handleAsapMessage"
            X.08j.A00(r0)
            if (r3 != 0) goto L_0x003b
            X.1qv r1 = r4.A04     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x003a
            java.lang.String r0 = "doWaitForWriteBlockRelease"
            X.08j.A00(r0)     // Catch:{ all -> 0x0042 }
            java.lang.Integer r0 = r4.A05     // Catch:{ all -> 0x0042 }
            r1.A00(r0)     // Catch:{ all -> 0x0042 }
            X.AnonymousClass08k.A00()     // Catch:{ all -> 0x0042 }
        L_0x003a:
            r3 = 1
        L_0x003b:
            r4.A02(r2)     // Catch:{ all -> 0x0042 }
            X.AnonymousClass08k.A00()
            goto L_0x000c
        L_0x0042:
            r0 = move-exception
            X.AnonymousClass08k.A00()
            throw r0
        L_0x0047:
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            return r3
        L_0x0049:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0049 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21132XFz.A08():boolean");
    }

    public final void handleMessage(Message message) {
        boolean z;
        1tG r3 = this.A00;
        if (r3 != null || message.what == 3) {
            boolean z2 = false;
            if (r3 != null) {
                z = A08();
            } else {
                z = false;
            }
            08j.A00("handleMessage");
            if (!z) {
                z2 = true;
            }
            try {
                A07(z2, message);
            } finally {
                AnonymousClass08k.A00();
            }
        } else {
            synchronized (this.A08) {
                Queue queue = this.A02;
                if (queue == null) {
                    queue = new LinkedList();
                    this.A02 = queue;
                }
                queue.add(Message.obtain(message));
            }
        }
    }
}
