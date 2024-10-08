package X;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4Pm  reason: invalid class name and case insensitive filesystem */
public final class C264334Pm {
    public Pair A00;
    public CopyOnWriteArrayList A01;
    public boolean A02 = true;
    public Handler A03;
    public C264344Pn A04 = C264344Pn.A04;
    public final AnonymousClass4PI A05;
    public final C264264Pf A06;
    public final ArrayDeque A07 = new ArrayDeque();
    public final ArrayDeque A08 = new ArrayDeque();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r1 == 6) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C256683wB r9) {
        /*
            r8 = this;
            boolean r0 = r8.A02
            r4 = 0
            if (r0 == 0) goto L_0x000b
            java.util.concurrent.CopyOnWriteArrayList r0 = r8.A01
            if (r0 != 0) goto L_0x000c
            r8.A02 = r4
        L_0x000b:
            return
        L_0x000c:
            r2 = 0
            android.os.Looper r1 = android.os.Looper.myLooper()
            X.C256703wD.A01(r1)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1, r2)
            r8.A03 = r0
            X.4PI r3 = r8.A05
            com.google.android.exoplayer2.video.ColorInfo r7 = r9.A0Q
            if (r7 == 0) goto L_0x002d
            int r1 = r7.A03
            r0 = 7
            if (r1 == r0) goto L_0x0030
            r0 = 6
            if (r1 != r0) goto L_0x002d
        L_0x0029:
            android.util.Pair.create(r7, r7)
            goto L_0x003f
        L_0x002d:
            com.google.android.exoplayer2.video.ColorInfo r7 = com.google.android.exoplayer2.video.ColorInfo.A05
            goto L_0x0029
        L_0x0030:
            int r6 = r7.A02
            int r5 = r7.A01
            byte[] r2 = r7.A04
            r1 = 6
            com.google.android.exoplayer2.video.ColorInfo r0 = new com.google.android.exoplayer2.video.ColorInfo
            r0.<init>(r6, r5, r1, r2)
            android.util.Pair.create(r7, r0)
        L_0x003f:
            X.C10128Rn5.A00()     // Catch:{ Exception -> 0x0067 }
            java.lang.reflect.Constructor r1 = X.C10128Rn5.A01     // Catch:{ Exception -> 0x0067 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r2 = r1.newInstance(r0)     // Catch:{ Exception -> 0x0067 }
            java.lang.reflect.Method r1 = X.C10128Rn5.A03     // Catch:{ Exception -> 0x0067 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0067 }
            java.lang.Object r0 = r1.invoke(r2, r0)     // Catch:{ Exception -> 0x0067 }
            r0.getClass()     // Catch:{ Exception -> 0x0067 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r8.A01     // Catch:{ Exception -> 0x0067 }
            r0.getClass()     // Catch:{ Exception -> 0x0067 }
            android.os.Handler r0 = r8.A03     // Catch:{ Exception -> 0x0067 }
            r0.getClass()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = "create"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0067 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0067 }
            throw r0     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            r0 = 7000(0x1b58, float:9.809E-42)
            X.48u r0 = r3.A0F(r9, r1, r0, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C264334Pm.A00(X.3wB):void");
    }

    public C264334Pm(AnonymousClass4PI r2, C264264Pf r3) {
        this.A06 = r3;
        this.A05 = r2;
    }
}
