package X;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class SOP {
    public final AnonymousClass8MA A00;
    public final C11121SBa A01;
    public final S1H A02;
    public final S5Y A03;
    public final C11283SJb A04;
    public final C10833Ryt A05;
    public final C7334Q4k A06;
    public final Q1G A07;
    public final String A08;
    public final ExecutorService A09;
    public final boolean A0A;

    public static final void A00(Bitmap bitmap, SOP sop, Integer num, Map map, long j) {
        C60340gF r0;
        Bitmap bitmap2 = bitmap;
        SOP sop2 = sop;
        try {
            A01(bitmap2, sop2, sop.A08, map, j, sop.A0A);
            bitmap2.recycle();
            r0 = C60340gF.A00;
        } catch (Throwable th) {
            r0 = JTO.A1B(th);
        }
        Throwable A002 = 0eR.A00(r0);
        if (A002 != null) {
            sop2.A03.A02(AnonymousClass05K.A0N, num, Long.valueOf(j), (String) null, A002, (Map) null);
        }
    }

    public /* synthetic */ SOP(AnonymousClass8MA r5, C11121SBa sBa, S5Y s5y, C11283SJb sJb, C10833Ryt ryt, C7334Q4k q4k, Q1G q1g, String str, Set set, ExecutorService executorService) {
        long micros = TimeUnit.SECONDS.toMicros(1);
        C51972G9s.A1C(set, sBa);
        this.A04 = sJb;
        this.A00 = r5;
        this.A01 = sBa;
        this.A05 = ryt;
        this.A03 = s5y;
        this.A07 = q1g;
        this.A08 = str;
        this.A09 = executorService;
        this.A06 = q4k;
        this.A0A = DbW.A1a(r5);
        this.A02 = new S1H(set, micros);
        try {
            Iterator A0u = AnonymousClass7TF.A0u(C11283SJb.A06);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                Map map = sJb.A04;
                if (map != null && DbX.A1a(map.get(A1J.getKey()))) {
                    sJb.A05.add(C41847B3o.A1E(A1J.getValue()));
                }
            }
        } catch (Throwable th) {
            new 0eQ(th);
        }
        if (q1g != null) {
            C12363SsC ssC = new C12363SsC(this);
            C13858Tid tid = q1g.A00;
            tid.getClass();
            tid.EeS(ssC);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.graphics.Bitmap r12, X.SOP r13, java.lang.String r14, java.util.Map r15, long r16, boolean r18) {
        /*
            X.SJb r5 = r13.A04
            r0 = 1
            r10 = r14
            X.0qQ.A0B(r14, r0)
            if (r18 == 0) goto L_0x0039
            java.lang.String r4 = "_ready.png"
        L_0x000b:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = r5.A02
            r3.append(r0)
            r0 = r16
            r3.append(r0)
            r2 = 95
            r3.append(r2)
            java.lang.String r4 = X.Pxg.A0s(r14, r4, r3)
            java.io.File r3 = r5.A01
            boolean r2 = r3.exists()
            if (r2 != 0) goto L_0x002d
            r3.mkdir()
        L_0x002d:
            java.io.File r2 = X.JTO.A0s(r3, r4)
            r2.getCanonicalPath()
            java.io.FileOutputStream r4 = X.JTO.A0t(r2)
            goto L_0x003c
        L_0x0039:
            java.lang.String r4 = "_snapshot.png"
            goto L_0x000b
        L_0x003c:
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x006f }
            r2 = 100
            X.0fO.A02(r3, r12, r4, r2)     // Catch:{ all -> 0x006f }
            r4.close()
            X.S5Y r6 = r13.A03
            r12 = r15
            if (r18 == 0) goto L_0x0063
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            r8 = 0
            r11 = r8
            r6.A02(r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = r13.A08     // Catch:{ all -> 0x005c }
            r5.A03(r0)     // Catch:{ all -> 0x005c }
            return
        L_0x005c:
            r1 = move-exception
            X.0eQ r0 = new X.0eQ
            r0.<init>(r1)
            return
        L_0x0063:
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            r8 = 0
            r11 = r8
            r6.A02(r7, r8, r9, r10, r11, r12)
            return
        L_0x006f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            X.1zE.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SOP.A01(android.graphics.Bitmap, X.SOP, java.lang.String, java.util.Map, long, boolean):void");
    }

    public final void A02(long j) {
        S1H s1h = this.A02;
        HashMap hashMap = s1h.A01;
        long j2 = j;
        long j3 = j / s1h.A00;
        long j4 = j3;
        if (j < 0) {
            j3--;
        }
        Number number = (Number) hashMap.get(Long.valueOf(j3));
        if (number != null) {
            long longValue = number.longValue() - 1;
            Long valueOf = Long.valueOf(longValue);
            long j5 = j4;
            if (j < 0) {
                j5 = j4 - 1;
            }
            hashMap.put(Long.valueOf(j5), valueOf);
            if (valueOf != null && longValue >= 0) {
                if (j != 0) {
                    if (j > 0) {
                        C7334Q4k q4k = this.A06;
                        if (q4k instanceof C7964QeC) {
                            C7964QeC qeC = (C7964QeC) q4k;
                            if (1 - qeC.A00 != 0 || !((SJN) qeC.A01).A0i) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    Q1G q1g = this.A07;
                    if (q1g != null) {
                        C13858Tid tid = q1g.A00;
                        tid.getClass();
                        Bitmap EJv = tid.EJv();
                        long A072 = C51966G9m.A07(currentTimeMillis);
                        if (EJv.hasAlpha()) {
                            if ((AnonymousClass7TF.A1Q(EJv.getPixel(50, 50)) ? 1 : 0) + (AnonymousClass7TF.A1Q(EJv.getPixel(EJv.getWidth() - 50, 50)) ? 1 : 0) + (AnonymousClass7TF.A1Q(EJv.getPixel(50, EJv.getHeight() - 50)) ? 1 : 0) + (AnonymousClass7TF.A1Q(EJv.getPixel(EJv.getWidth() - 50, EJv.getHeight() - 50)) ? 1 : 0) >= 2) {
                                this.A03.A02(AnonymousClass05K.A01, (Integer) null, Long.valueOf(j2), this.A08, (Throwable) null, 0Yt.A06(AnonymousClass7TH.A0h("timestamp_us", String.valueOf(j2), AnonymousClass7TE.A1L(Py0.A01(31, 12, 45), "true"), AnonymousClass7TE.A1L("capture_latency_ms", String.valueOf(A072)), AnonymousClass7TE.A1L("snapshot_type", "image"))));
                            }
                        }
                        this.A09.submit(new TKD(EJv, this, AnonymousClass05K.A01, j2, A072));
                        if (j < 0) {
                            j4--;
                        }
                        hashMap.remove(Long.valueOf(j4));
                    }
                } catch (Throwable th) {
                    this.A03.A02(AnonymousClass05K.A0N, AnonymousClass05K.A01, Long.valueOf(j2), (String) null, th, (Map) null);
                }
            }
        }
    }
}
