package X;

import android.content.Context;
import com.facebook.litho.ComponentsSystrace;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3mp  reason: invalid class name and case insensitive filesystem */
public abstract class C251263mp implements C251213mk, Cloneable {
    public static final AnonymousClass2T1 A06 = new Object();
    public static final Map A07 = new HashMap();
    public static final AtomicInteger A08 = new AtomicInteger();
    public static final AtomicInteger A09 = new AtomicInteger(1);
    public int A00 = A09.getAndIncrement();
    public AnonymousClass2VW A01;
    public String A02;
    public String A03;
    public boolean A04;
    public final int A05;

    public final void A0L(2V1 r7, AnonymousClass2T3 r8, int i, int i2) {
        A0M(r7, r8, i, i2, true);
    }

    public boolean A0N() {
        return false;
    }

    public boolean A0R(C251263mp r4) {
        if (this == r4) {
            return true;
        }
        if (r4 == null || getClass() != r4.getClass()) {
            return false;
        }
        if (this.A00 != r4.A00) {
            return 2Vb.A05(this, r4);
        }
        return true;
    }

    public final boolean A0S(C251263mp r3, C251263mp r4, 2V1 r5, 2V1 r6) {
        2TB r0;
        2TB r1 = null;
        if (r5 == null) {
            r0 = null;
        } else {
            2Vz r02 = r5.A05;
            r02.getClass();
            r0 = r02.A02;
        }
        if (r6 != null) {
            2Vz r12 = r6.A05;
            r12.getClass();
            r1 = r12.A02;
        }
        boolean A0T = A0T(r3, r4, r0, r1);
        if (A0O()) {
            return A0T;
        }
        if (A0T) {
            return true;
        }
        if (r5 == null || r6 == null || r3 == null || r3.A0V(r5, r6)) {
            return false;
        }
        return true;
    }

    public boolean A0V(2V1 r2, 2V1 r3) {
        return true;
    }

    public static String A02(Context context) {
        if (context == null) {
            return "null";
        }
        return 002.A07(context.hashCode(), "<cls>", context.getClass().getName(), "</cls>@");
    }

    public C244533bL A0F(B0X b0x, C243243Xz r5, 2Vz r6, int i, int i2) {
        return new C244533bL((2TC) null, new 2TR());
    }

    public Integer A0G() {
        return AnonymousClass05K.A00;
    }

    public Object A0H(Context context) {
        throw new RuntimeException("Trying to mount a MountSpec that doesn't implement @OnCreateMountContent");
    }

    public final Object A0I(Context context) {
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        if (isTracing) {
            ComponentsSystrace.A02(002.A0R("createMountContent:", A0J()));
        }
        try {
            return A0H(context);
        } finally {
            if (isTracing) {
                ComponentsSystrace.A01();
            }
        }
    }

    public final String A0K() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        if (!this.A04) {
            String num = Integer.toString(this.A05);
            this.A03 = num;
            return num;
        }
        throw new IllegalStateException(002.A0g("Should not have null manual key! (", A0J(), ")"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (X.AnonymousClass2VV.A00(r9.A00, r10, r5.getHeight()) != false) goto L_0x00f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(X.2V1 r32, X.AnonymousClass2T3 r33, int r34, int r35, boolean r36) {
        /*
            r31 = this;
            r13 = r32
            java.lang.ThreadLocal r4 = r13.A0E
            java.lang.Object r2 = r4.get()
            X.2VG r2 = (X.2VG) r2
            r6 = r31
            r7 = r33
            r11 = r34
            r10 = r35
            if (r2 != 0) goto L_0x0028
            if (r36 != 0) goto L_0x018f
            java.lang.Object r2 = r4.get()
            X.2VG r2 = (X.2VG) r2
            if (r2 == 0) goto L_0x0102
            boolean r0 = r2.CU9()
            if (r0 != 0) goto L_0x0102
            r6.A0L(r13, r7, r11, r10)
        L_0x0027:
            return
        L_0x0028:
            int r20 = r2.BLz()
            int r21 = r2.Boc()
            if (r36 == 0) goto L_0x006c
            X.3Xp r15 = r2.AjG()
        L_0x0036:
            X.3XI r17 = r2.C9q()
            boolean r0 = r2 instanceof X.C243243Xz
            r3 = 0
            if (r0 == 0) goto L_0x006a
            r0 = r2
            X.3Xz r0 = (X.C243243Xz) r0
        L_0x0042:
            int r1 = r6.A00
            X.2TY r5 = r15.A00(r1)
            if (r5 == 0) goto L_0x0064
            X.3cC r9 = r5.A02
            int r8 = r9.A01
            int r1 = r5.getWidth()
            boolean r1 = X.AnonymousClass2VV.A00(r8, r11, r1)
            if (r1 == 0) goto L_0x0064
            int r8 = r9.A00
            int r1 = r5.getHeight()
            boolean r1 = X.AnonymousClass2VV.A00(r8, r10, r1)
            if (r1 != 0) goto L_0x00f0
        L_0x0064:
            r15.A03(r6)
            if (r5 == 0) goto L_0x007b
            goto L_0x0073
        L_0x006a:
            r0 = r3
            goto L_0x0042
        L_0x006c:
            r0 = 0
            X.3Xp r15 = new X.3Xp
            r15.<init>(r0)
            goto L_0x0036
        L_0x0073:
            r5.A04()     // Catch:{ all -> 0x01a7 }
            X.2TR r5 = r5.A04()     // Catch:{ all -> 0x01a7 }
            goto L_0x009d
        L_0x007b:
            int r27 = r2.C9o()     // Catch:{ all -> 0x01a7 }
            boolean r30 = r2.COA()     // Catch:{ all -> 0x01a7 }
            r23 = 0
            X.3Xz r3 = new X.3Xz     // Catch:{ all -> 0x01a7 }
            r22 = r3
            r24 = r15
            r25 = r23
            r26 = r17
            r28 = r20
            r29 = r21
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x01a7 }
            r4.set(r3)     // Catch:{ all -> 0x01a7 }
            X.2TR r5 = X.AnonymousClass3Y0.A03(r6, r13, r3)     // Catch:{ all -> 0x01a7 }
        L_0x009d:
            r8 = 0
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.A00()     // Catch:{ all -> 0x01a7 }
            if (r0 == 0) goto L_0x00aa
            if (r5 == 0) goto L_0x00aa
            goto L_0x019f
        L_0x00aa:
            int r19 = r2.C9o()     // Catch:{ all -> 0x01a7 }
            boolean r22 = r2.COA()     // Catch:{ all -> 0x01a7 }
            r14 = 0
            X.3bz r0 = new X.3bz     // Catch:{ all -> 0x01a7 }
            r0.<init>(r14)     // Catch:{ all -> 0x01a7 }
            X.2VF r12 = new X.2VF     // Catch:{ all -> 0x01a7 }
            r16 = r14
            r18 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x01a7 }
            android.content.Context r9 = r13.A0C     // Catch:{ all -> 0x01a7 }
            r0 = 1
            X.0qQ.A0B(r9, r0)     // Catch:{ all -> 0x01a7 }
            long r0 = X.C244873bt.A00(r11, r10)     // Catch:{ all -> 0x01a7 }
            X.2TY r5 = X.AnonymousClass2VI.A00(r9, r12, r5, r0)     // Catch:{ all -> 0x01a7 }
            if (r5 == 0) goto L_0x019f
            X.C52327GNu.A00(r3, r2)     // Catch:{ all -> 0x01a7 }
            X.C52327GNu.A00(r12, r2)     // Catch:{ all -> 0x01a7 }
            r4.set(r2)
            X.2TR r2 = r5.A04()
            int r1 = r6.A00
            boolean r0 = r15.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01ac
            X.01s r0 = r15.A01
            r0.A07(r1, r2)
            java.util.Map r0 = r15.A03
            r0.put(r2, r5)
        L_0x00f0:
            int r0 = r5.getWidth()
            r7.A01 = r0
            int r0 = r5.getHeight()
            r7.A00 = r0
            if (r36 != 0) goto L_0x0027
            r15.A03(r6)
            return
        L_0x0102:
            X.3XH r0 = r13.A03     // Catch:{ all -> 0x0188 }
            if (r0 != 0) goto L_0x0140
            X.3X6 r0 = new X.3X6     // Catch:{ all -> 0x0188 }
            r0.<init>(r13)     // Catch:{ all -> 0x0188 }
            com.facebook.litho.ComponentTree r3 = r0.A00()     // Catch:{ all -> 0x0188 }
            int r1 = r3.A0T     // Catch:{ all -> 0x0188 }
            android.content.Context r12 = r13.A0C     // Catch:{ all -> 0x0188 }
            X.2VJ r9 = r13.A07     // Catch:{ all -> 0x0188 }
            X.2V1 r0 = r3.A0V     // Catch:{ all -> 0x0188 }
            X.3X5 r8 = r0.A02     // Catch:{ all -> 0x0188 }
            X.3XH r17 = new X.3XH     // Catch:{ all -> 0x0188 }
            r19 = r3
            r20 = r3
            r21 = r3
            r18 = r3
            r22 = r1
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0188 }
            java.lang.String r5 = r13.A08     // Catch:{ all -> 0x0188 }
            X.2TL r4 = r13.A04     // Catch:{ all -> 0x0188 }
            X.2VJ r0 = r13.A06     // Catch:{ all -> 0x0188 }
            X.2V1 r3 = new X.2V1     // Catch:{ all -> 0x0188 }
            r19 = r9
            r20 = r0
            r21 = r5
            r14 = r3
            r15 = r12
            r16 = r8
            r18 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0188 }
            goto L_0x0143
        L_0x0140:
            int r1 = r0.A00     // Catch:{ all -> 0x0188 }
            r3 = r13
        L_0x0143:
            r13 = 0
            X.3Xp r14 = new X.3Xp     // Catch:{ all -> 0x0185 }
            r14.<init>(r13)     // Catch:{ all -> 0x0185 }
            X.3XI r4 = new X.3XI     // Catch:{ all -> 0x0185 }
            r4.<init>(r13)     // Catch:{ all -> 0x0185 }
            r18 = 0
            r19 = -1
            if (r2 == 0) goto L_0x0155
            goto L_0x0164
        L_0x0155:
            android.content.Context r5 = r3.A0C     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r5.getSystemService(r0)     // Catch:{ all -> 0x0185 }
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0     // Catch:{ all -> 0x0185 }
            boolean r20 = X.2VH.A00(r0)     // Catch:{ all -> 0x0185 }
            goto L_0x0168
        L_0x0164:
            boolean r20 = r2.COA()     // Catch:{ all -> 0x0185 }
        L_0x0168:
            X.3Xz r12 = new X.3Xz     // Catch:{ all -> 0x0185 }
            r15 = r13
            r16 = r4
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0185 }
            java.lang.ThreadLocal r0 = r3.A0E     // Catch:{ all -> 0x0185 }
            r0.set(r12)     // Catch:{ all -> 0x0185 }
            r4 = r6
            r5 = r3
            r6 = r7
            r7 = r11
            r8 = r10
            r9 = r18
            r4.A0M(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0185 }
            r0.set(r2)
            return
        L_0x0185:
            r1 = move-exception
            r13 = r3
            goto L_0x0189
        L_0x0188:
            r1 = move-exception
        L_0x0189:
            java.lang.ThreadLocal r0 = r13.A0E
            r0.set(r2)
            throw r1
        L_0x018f:
            java.lang.String r1 = r6.A0J()
            java.lang.String r0 = ": Trying to measure outside of layout calculation. See Component#measureMightNotCacheInternalNode instead."
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x019f:
            r7.A01 = r8     // Catch:{ all -> 0x01a7 }
            r7.A00 = r8     // Catch:{ all -> 0x01a7 }
            r4.set(r2)
            return
        L_0x01a7:
            r0 = move-exception
            r4.set(r2)
            throw r0
        L_0x01ac:
            java.lang.String r1 = "Cannot write into a frozen cache."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251263mp.A0M(X.2V1, X.2T3, int, int, boolean):void");
    }

    public boolean A0O() {
        if ((this instanceof C247403gH) || (this instanceof C251353my) || (this instanceof C243963aQ)) {
            return true;
        }
        return false;
    }

    public boolean A0P() {
        if ((this instanceof C243963aQ) || (this instanceof C251353my) || (this instanceof C247403gH)) {
            return true;
        }
        return false;
    }

    public final boolean A0Q(C251263mp r2) {
        if (this instanceof C251253mo) {
            return A0U(r2, 2Sa.shouldCompareCommonPropsInIsEquivalentTo);
        }
        return A0R(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0087, code lost:
        if (r2 != null) goto L_0x0089;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0U(X.C251263mp r10, boolean r11) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.C251253mo
            if (r0 == 0) goto L_0x0093
            r7 = r9
            X.3mo r7 = (X.C251253mo) r7
            if (r11 == 0) goto L_0x0022
            boolean r0 = r10 instanceof X.C251253mo
            if (r0 == 0) goto L_0x0022
            r0 = r10
            X.3mo r0 = (X.C251253mo) r0
            if (r0 == 0) goto L_0x001a
            X.2TC r1 = r7.A00
            X.2TC r0 = r0.A00
            if (r1 != 0) goto L_0x001c
            if (r0 == 0) goto L_0x0022
        L_0x001a:
            r0 = 0
            return r0
        L_0x001c:
            boolean r0 = r1.A0Z(r0)
            if (r0 == 0) goto L_0x001a
        L_0x0022:
            X.2Sa r0 = X.2Sa.defaultInstance
            java.lang.Integer r0 = r0.A04
            int r1 = r0.intValue()
            r2 = 1
            r0 = 2
            if (r1 == r0) goto L_0x0038
            if (r1 != r2) goto L_0x008e
            java.lang.Integer r1 = r7.A0G()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x008e
        L_0x0038:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            if (r7 == r10) goto L_0x0089
            r8 = 0
            if (r10 == 0) goto L_0x0083
            java.lang.Class r1 = r7.getClass()
            java.lang.Class r0 = r10.getClass()
            if (r1 != r0) goto L_0x0083
            int r1 = r7.A00
            int r0 = r10.A00
            if (r1 == r0) goto L_0x0089
            java.lang.Object[] r6 = r7.A0W()
            java.lang.Object[] r5 = r10.A0W()
            if (r6 == 0) goto L_0x008e
            if (r5 == 0) goto L_0x008e
            int r4 = r6.length
            int r0 = r5.length
            if (r4 != r0) goto L_0x0083
            r3 = 0
        L_0x0062:
            if (r3 >= r4) goto L_0x0082
            r2 = r6[r3]
            r1 = r5[r3]
            boolean r0 = r2 instanceof X.C251263mp
            if (r0 == 0) goto L_0x007d
            boolean r0 = r1 instanceof X.C251263mp
            if (r0 == 0) goto L_0x007d
            X.3mp r2 = (X.C251263mp) r2
            X.3mp r1 = (X.C251263mp) r1
            boolean r0 = X.2Vb.A04(r2, r1, r11)
        L_0x0078:
            if (r0 == 0) goto L_0x0083
            int r3 = r3 + 1
            goto L_0x0062
        L_0x007d:
            boolean r0 = X.C245173cR.A02(r2, r1)
            goto L_0x0078
        L_0x0082:
            r8 = 1
        L_0x0083:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            if (r2 == 0) goto L_0x008e
        L_0x0089:
            boolean r0 = r2.booleanValue()
            return r0
        L_0x008e:
            boolean r0 = r7.A18(r10, r11)
            return r0
        L_0x0093:
            boolean r0 = r9.A0Q(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251263mp.A0U(X.3mp, boolean):boolean");
    }

    public Object[] A0W() {
        if (!(this instanceof C247373gE)) {
            return null;
        }
        C247373gE r0 = (C247373gE) this;
        return new Object[]{r0.A00, r0.A01, Boolean.valueOf(r0.A02)};
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        C251263mp r2 = (C251263mp) obj;
        if (this instanceof C251253mo) {
            return A0U(r2, 2Sa.shouldCompareCommonPropsInIsEquivalentTo);
        }
        return A0Q(r2);
    }

    public C251263mp() {
        int incrementAndGet;
        Class<?> cls = getClass();
        Map map = A07;
        synchronized (map) {
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                incrementAndGet = num.intValue();
            } else {
                incrementAndGet = A08.incrementAndGet();
                map.put(cls, Integer.valueOf(incrementAndGet));
            }
        }
        this.A05 = incrementAndGet;
    }

    public static 2Vh A01(C251263mp r4, 2V1 r5, int i) {
        String A082;
        String A0K = r4.A0K();
        AnonymousClass2VW r2 = r4.A01;
        if (r5.A01 == null) {
            A082 = "";
        } else {
            A082 = r5.A08();
        }
        return new 2Vh(r2, A082, A0K, i);
    }

    public static boolean A03(C251263mp r2) {
        if (r2.A0G() != AnonymousClass05K.A00 || !r2.A0N()) {
            return false;
        }
        return true;
    }

    public C251263mp A0E() {
        try {
            return (C251263mp) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String A0J() {
        return AnonymousClass3XB.A00(getClass());
    }

    public boolean A0T(C251263mp r3, C251263mp r4, 2TB r5, 2TB r6) {
        if (!A0P() || !2Vb.A04(r3, r4, false)) {
            return true;
        }
        if (r5 == null) {
            if (r6 == null) {
                return false;
            }
            return true;
        } else if (r6 == null || !2Vb.A05(r5, r6)) {
            return true;
        }
        return false;
    }

    public final Object clone() {
        return super.clone();
    }

    public final String toString() {
        return A0J();
    }
}
