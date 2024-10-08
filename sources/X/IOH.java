package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;

public final class IOH implements C61110lV, AnonymousClass0lh {
    public final Context A00;
    public final Handler A01;
    public final UserSession A02;
    public final 1Cm A03;
    public final boolean A04;

    public /* synthetic */ IOH(UserSession userSession, boolean z) {
        1Cm r2 = new 1Cm(userSession);
        Context applicationContext = C51966G9m.A0P(userSession).getApplicationContext();
        Handler A0D = AnonymousClass7TF.A0D();
        0qQ.A0B(applicationContext, 4);
        this.A02 = userSession;
        this.A04 = z;
        this.A03 = r2;
        this.A00 = applicationContext;
        this.A01 = A0D;
        14i.A05(this);
        A0D.postDelayed(new C57797Igc(this), 10000);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r32 = this;
            r11 = r32
            com.instagram.common.session.UserSession r0 = r11.A02
            X.0ug r1 = X.0tq.A00(r0)
            X.1Cm r3 = r11.A03
            X.0to r16 = new X.0to
            r0 = r16
            r0.<init>(r1)
            boolean r14 = r11.A04
            java.util.LinkedHashMap r13 = X.AnonymousClass7TE.A1H()
            android.content.Context r0 = r3.A00
            com.instagram.common.session.UserSession r2 = r3.A01
            X.WT2 r0 = X.WT2.A00(r0, r2)
            X.WT2.A01(r0)
            X.VSs r1 = r0.A01
            java.util.List r0 = r1.A01
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003b
            java.lang.String r1 = X.C18221Vnl.A00(r1)     // Catch:{ IOException -> 0x003b }
            if (r1 == 0) goto L_0x003b
            java.lang.String r0 = "client_feed_changelist"
            r13.put(r0, r1)
        L_0x003b:
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            X.0qQ.A07(r0)
            java.lang.String r12 = X.AnonymousClass1FM.A00()
            X.1FI r10 = X.1FI.A0I
            X.1DD r9 = r3.A02
            r8 = 0
            r0 = 1
            X.1FX r7 = X.1FV.A01(r2, r0)
            X.0sm r6 = X.0Yt.A0E()
            X.J3c r5 = X.C59017J3c.A00
            java.lang.String r4 = "feed/timeline/"
            r3 = -20
            r0 = 5
            X.AnonymousClass7TF.A1G(r7, r0, r6)
            r0 = 11
            X.0qQ.A0B(r5, r0)
            com.instagram.common.session.UserSession r2 = r9.A01
            X.0Tu r15 = X.0Tu.A05
            r0 = 36886656606798549(0x830c38000002d5, double:3.390608396559103E-306)
            java.lang.String r26 = X.182.A04(r15, r2, r0)
            r1 = 0
            X.1FQ r19 = X.1FP.A00(r2, r10, r8, r8, r1)
            int r0 = r26.length()
            if (r0 != 0) goto L_0x007d
            r26 = r8
        L_0x007d:
            java.lang.String r25 = X.AnonymousClass7TG.A0j()
            java.util.concurrent.atomic.AtomicInteger r0 = X.1FS.A0G
            int r29 = r0.incrementAndGet()
            X.1FS r0 = new X.1FS
            r20 = r8
            r21 = r12
            r22 = r8
            r23 = r8
            r24 = r8
            r27 = r6
            r28 = r13
            r30 = r1
            r31 = r1
            r17 = r16
            r18 = r10
            r15 = r0
            r16 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.1NY r8 = X.AnonymousClass7TG.A0a(r2)
            r8.A0E = r4
            X.0bH r6 = new X.0bH
            r6.<init>(r2)
            X.5jd r4 = new X.5jd
            r4.<init>(r6, r7, r3)
            r8.A0P(r4)
            java.lang.Object r3 = r5.invoke(r8)
            X.1Fa r3 = (X.1Fa) r3
            android.content.Context r5 = r9.A00
            X.1Cn r4 = r9.A02
            X.1Fl.A02(r5, r3, r2, r0, r4)
            java.lang.String r0 = X.C46346Dcp.A00()
            r3.A0F(r0, r12)
            java.lang.String r2 = "X-IG-App-ID"
            r0 = 94
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0F(r2, r0)
            java.lang.String r2 = X.1Ch.A00()
            java.lang.String r0 = "User-Agent"
            r3.A0F(r0, r2)
            X.1NY r3 = (X.1NY) r3
            if (r14 == 0) goto L_0x00eb
            java.lang.String r2 = "X_IG_TRANSFER_ENCODING"
            java.lang.String r0 = "chunked"
            r3.A0F(r2, r0)
        L_0x00eb:
            X.1QX r0 = r3.A0N()     // Catch:{ IOException -> 0x01c7 }
            X.1QS r7 = r0.A02     // Catch:{ IOException -> 0x01c7 }
            X.1HW r3 = r7.A05
            if (r3 == 0) goto L_0x00fc
            java.net.URI r2 = r7.A09
            java.util.List r0 = r7.A01
            r3.ACo(r2, r0)
        L_0x00fc:
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()
            java.lang.Integer r0 = r7.A07
            java.lang.String r0 = X.1Qp.A00(r0)
            r6.append(r0)
            java.lang.String r0 = " "
            r6.append(r0)
            java.lang.String r0 = "/api/v1/feed/timeline/"
            r6.append(r0)
            java.lang.String r0 = " HTTP/1.1\n"
            r6.append(r0)
            java.lang.String r0 = "Host: "
            r6.append(r0)
            java.lang.String r0 = "i.instagram.com:443"
            r6.append(r0)
            java.lang.String r5 = "\n"
            r6.append(r5)
            java.lang.String r0 = "Accept: */*\n"
            r6.append(r0)
            java.util.List r0 = r7.A01
            java.util.Iterator r4 = r0.iterator()
        L_0x0132:
            boolean r0 = r4.hasNext()
            java.lang.String r3 = ": "
            if (r0 == 0) goto L_0x0151
            java.lang.Object r2 = r4.next()
            X.1Fn r2 = (X.1Fn) r2
            java.lang.String r0 = r2.A00
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = r2.A01
            r6.append(r0)
            r6.append(r5)
            goto L_0x0132
        L_0x0151:
            X.1Px r4 = r7.A06
            if (r4 == 0) goto L_0x017f
            X.1Fn r0 = r4.Aql()
            r6.append(r0)
            r6.append(r5)
            r0 = 426(0x1aa, float:5.97E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.append(r0)
            r6.append(r3)
            long r2 = r4.getContentLength()
            r6.append(r2)
            r6.append(r5)
            X.1Fn r0 = r4.Aqb()
            r6.append(r0)
            r6.append(r5)
        L_0x017f:
            r6.append(r5)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            if (r4 == 0) goto L_0x01c7
            java.lang.String r2 = X.DbT.A10(r6)     // Catch:{ IOException -> 0x01c7 }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ IOException -> 0x01c7 }
            byte[] r0 = r2.getBytes(r0)     // Catch:{ IOException -> 0x01c7 }
            X.0qQ.A07(r0)     // Catch:{ IOException -> 0x01c7 }
            r5.write(r0)     // Catch:{ IOException -> 0x01c7 }
            java.io.InputStream r4 = r4.E15()     // Catch:{ IOException -> 0x01c7 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r0]     // Catch:{ IOException -> 0x01c7 }
        L_0x01a1:
            int r2 = r4.read(r3)     // Catch:{ IOException -> 0x01c7 }
            r0 = -1
            if (r2 == r0) goto L_0x01ac
            r5.write(r3, r1, r2)     // Catch:{ IOException -> 0x01c7 }
            goto L_0x01a1
        L_0x01ac:
            r4.close()     // Catch:{ IOException -> 0x01c7 }
            byte[] r3 = r5.toByteArray()     // Catch:{ IOException -> 0x01c7 }
            if (r3 == 0) goto L_0x01c7
            android.content.Context r2 = r11.A00     // Catch:{  }
            r0 = 2278(0x8e6, float:3.192E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{  }
            java.io.FileOutputStream r0 = r2.openFileOutput(r0, r1)     // Catch:{  }
            r0.write(r3)     // Catch:{  }
            r0.close()     // Catch:{  }
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IOH.A00():void");
    }

    public final void onSessionWillEnd() {
        if (JVU.A01(this.A02, AnonymousClass05K.A07)) {
            14i.A06(this);
        }
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(617321055);
        A00();
        AnonymousClass0fD.A0A(647717887, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-1067708703, AnonymousClass0fD.A03(-27146086));
    }
}
