package X;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.TMy  reason: case insensitive filesystem */
public final class C13140TMy implements Map, Serializable {
    public static final C13140TMy A06 = new C13140TMy((Object) null, new Object[0], 0);
    public transient C13245TRl A00;
    public transient C8554Qws A01;
    public transient C8554Qws A02;
    public final transient Object[] A03;
    public final transient int A04;
    public final transient Object A05;

    public C13140TMy() {
    }

    public C13140TMy(Object obj, Object[] objArr, int i) {
        this();
        this.A05 = obj;
        this.A03 = objArr;
        this.A04 = i;
    }

    public final Object get(Object obj) {
        char c;
        char c2;
        if (obj != null) {
            int i = this.A04;
            Object[] objArr = this.A03;
            if (i != 1) {
                Object obj2 = this.A05;
                if (obj2 != null) {
                    if (!(obj2 instanceof byte[])) {
                        if (!(obj2 instanceof short[])) {
                            int[] iArr = (int[]) obj2;
                            int length = iArr.length - 1;
                            int A002 = C9721Rfe.A00(obj.hashCode());
                            while (true) {
                                int i2 = A002 & length;
                                int i3 = iArr[i2];
                                if (i3 == -1) {
                                    break;
                                } else if (obj.equals(objArr[i3])) {
                                    c = i3 ^ 1;
                                    break;
                                } else {
                                    A002 = i2 + 1;
                                }
                            }
                        } else {
                            short[] sArr = (short[]) obj2;
                            int length2 = sArr.length - 1;
                            int A003 = C9721Rfe.A00(obj.hashCode());
                            while (true) {
                                int i4 = A003 & length2;
                                c2 = (char) sArr[i4];
                                if (c2 != 65535) {
                                    if (obj.equals(objArr[c2])) {
                                        break;
                                    }
                                    A003 = i4 + 1;
                                } else {
                                    break;
                                }
                            }
                        }
                    } else {
                        byte[] bArr = (byte[]) obj2;
                        int length3 = bArr.length - 1;
                        int A004 = C9721Rfe.A00(obj.hashCode());
                        while (true) {
                            int i5 = A004 & length3;
                            c2 = bArr[i5] & 255;
                            if (c2 != 255) {
                                if (obj.equals(objArr[c2])) {
                                    break;
                                }
                                A004 = i5 + 1;
                            } else {
                                break;
                            }
                        }
                    }
                    c = c2 ^ 1;
                    Object obj3 = objArr[c];
                    if (obj3 == null) {
                        return null;
                    }
                    return obj3;
                }
            } else if (Pxe.A0t(objArr, 0).equals(obj)) {
                return Pxe.A0t(objArr, 1);
            }
        }
        return null;
    }

    public final int size() {
        return this.A04;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r2v4 ?, r2v0 ?, r2v1 ?, r2v3 ?, r2v5 ?, r2v6 ?, r2v7 ?, r2v8 ?, r2v9 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public static X.C13140TMy A00(X.C10990S4c r17, java.lang.Object[] r18, int r19) {
        /*
            r4 = r18
            r6 = r19
            if (r19 != 0) goto L_0x0009
            X.TMy r0 = A06
            return r0
        L_0x0009:
            r9 = 0
            r7 = 0
            r5 = 1
            if (r6 != r5) goto L_0x001f
            java.lang.Object r1 = X.Pxe.A0t(r4, r7)
            java.lang.Object r0 = X.Pxe.A0t(r4, r5)
            X.C9720Rfd.A00(r1, r0)
            X.TMy r0 = new X.TMy
            r0.<init>(r9, r4, r5)
            return r0
        L_0x001f:
            int r0 = r4.length
            int r0 = r0 >> r5
            X.C11396SRp.A02(r6, r0)
            r8 = 2
            int r12 = java.lang.Math.max(r6, r8)
            r0 = 751619276(0x2ccccccc, float:5.8207657E-12)
            r11 = 1073741824(0x40000000, float:2.0)
            if (r12 >= r0) goto L_0x0044
            int r0 = r12 + -1
            int r11 = java.lang.Integer.highestOneBit(r0)
        L_0x0036:
            int r11 = r11 + r11
            double r2 = (double) r11
            r0 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r2 = r2 * r0
            double r0 = (double) r12
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x004d
            goto L_0x0036
        L_0x0044:
            if (r12 < r11) goto L_0x004d
            java.lang.String r0 = "collection too large"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x004d:
            int r16 = r11 + -1
            r0 = 128(0x80, float:1.794E-43)
            r12 = -1
            if (r11 > r0) goto L_0x00a8
            byte[] r2 = new byte[r11]
            java.util.Arrays.fill(r2, r12)
            r11 = 0
            r10 = 0
        L_0x005b:
            if (r11 >= r6) goto L_0x0168
            int r1 = r10 + r10
            int r0 = r11 + r11
            java.lang.Object r12 = X.Pxe.A0t(r4, r0)
            r0 = r0 ^ 1
            java.lang.Object r3 = X.Pxe.A0t(r4, r0)
            X.C9720Rfd.A00(r12, r3)
            int r0 = r12.hashCode()
            int r14 = X.C9721Rfe.A00(r0)
        L_0x0076:
            r14 = r14 & r16
            byte r13 = r2[r14]
            r0 = 255(0xff, float:3.57E-43)
            r13 = r13 & r0
            if (r13 != r0) goto L_0x008f
            byte r0 = (byte) r1
            r2[r14] = r0
            if (r10 >= r11) goto L_0x008a
            r18[r1] = r12
            r0 = r1 ^ 1
            r18[r0] = r3
        L_0x008a:
            int r10 = r10 + 1
        L_0x008c:
            int r11 = r11 + 1
            goto L_0x005b
        L_0x008f:
            r0 = r18[r13]
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00a5
            r1 = r13 ^ 1
            java.lang.Object r0 = X.Pxe.A0t(r4, r1)
            X.S23 r9 = new X.S23
            r9.<init>(r12, r3, r0)
            r18[r1] = r3
            goto L_0x008c
        L_0x00a5:
            int r14 = r14 + 1
            goto L_0x0076
        L_0x00a8:
            r0 = 32768(0x8000, float:4.5918E-41)
            if (r11 > r0) goto L_0x010d
            short[] r2 = new short[r11]
            java.util.Arrays.fill(r2, r12)
            r11 = 0
            r10 = 0
        L_0x00b4:
            if (r11 >= r6) goto L_0x0102
            int r1 = r10 + r10
            int r0 = r11 + r11
            java.lang.Object r12 = X.Pxe.A0t(r4, r0)
            r0 = r0 ^ 1
            java.lang.Object r3 = X.Pxe.A0t(r4, r0)
            X.C9720Rfd.A00(r12, r3)
            int r0 = r12.hashCode()
            int r14 = X.C9721Rfe.A00(r0)
        L_0x00cf:
            r14 = r14 & r16
            short r0 = r2[r14]
            char r13 = (char) r0
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r13 != r0) goto L_0x00e9
            short r0 = (short) r1
            r2[r14] = r0
            if (r10 >= r11) goto L_0x00e4
            r18[r1] = r12
            r0 = r1 ^ 1
            r18[r0] = r3
        L_0x00e4:
            int r10 = r10 + 1
        L_0x00e6:
            int r11 = r11 + 1
            goto L_0x00b4
        L_0x00e9:
            r0 = r18[r13]
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00ff
            r1 = r13 ^ 1
            java.lang.Object r0 = X.Pxe.A0t(r4, r1)
            X.S23 r9 = new X.S23
            r9.<init>(r12, r3, r0)
            r18[r1] = r3
            goto L_0x00e6
        L_0x00ff:
            int r14 = r14 + 1
            goto L_0x00cf
        L_0x0102:
            if (r10 == r6) goto L_0x0172
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0, r9}
            goto L_0x0172
        L_0x010d:
            int[] r2 = new int[r11]
            java.util.Arrays.fill(r2, r12)
            r11 = 0
            r10 = 0
        L_0x0114:
            if (r11 >= r6) goto L_0x015d
            int r15 = r10 + r10
            int r0 = r11 + r11
            java.lang.Object r13 = X.Pxe.A0t(r4, r0)
            r0 = r0 ^ 1
            java.lang.Object r3 = X.Pxe.A0t(r4, r0)
            X.C9720Rfd.A00(r13, r3)
            int r0 = r13.hashCode()
            int r14 = X.C9721Rfe.A00(r0)
        L_0x012f:
            r14 = r14 & r16
            r1 = r2[r14]
            if (r1 != r12) goto L_0x0144
            r2[r14] = r15
            if (r10 >= r11) goto L_0x013f
            r18[r15] = r13
            r0 = r15 ^ 1
            r18[r0] = r3
        L_0x013f:
            int r10 = r10 + 1
        L_0x0141:
            int r11 = r11 + 1
            goto L_0x0114
        L_0x0144:
            r0 = r18[r1]
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x015a
            r1 = r1 ^ 1
            java.lang.Object r0 = X.Pxe.A0t(r4, r1)
            X.S23 r9 = new X.S23
            r9.<init>(r13, r3, r0)
            r18[r1] = r3
            goto L_0x0141
        L_0x015a:
            int r14 = r14 + 1
            goto L_0x012f
        L_0x015d:
            if (r10 == r6) goto L_0x0172
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0, r9}
            goto L_0x0172
        L_0x0168:
            if (r10 == r6) goto L_0x0172
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0, r9}
        L_0x0172:
            boolean r0 = r2 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x0191
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r0 = r2[r8]
            X.S23 r0 = (X.S23) r0
            r1 = r17
            if (r17 == 0) goto L_0x0197
            r1.A01 = r0
            r1 = r2[r7]
            r0 = r2[r5]
            int r6 = X.AnonymousClass7TE.A0M(r0)
            int r0 = r6 + r6
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            r2 = r1
        L_0x0191:
            X.TMy r0 = new X.TMy
            r0.<init>(r2, r4, r6)
            return r0
        L_0x0197:
            java.lang.IllegalArgumentException r0 = r0.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13140TMy.A00(X.S4c, java.lang.Object[], int):X.TMy");
    }

    public static C13140TMy A01(Object obj, Object obj2, Object obj3) {
        C9720Rfd.A00("com.android.vending.billing.PURCHASES_UPDATED", obj);
        C9720Rfd.A00("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj2);
        C9720Rfd.A00("com.android.vending.billing.ALTERNATIVE_BILLING", obj3);
        return A00((C10990S4c) null, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj2, "com.android.vending.billing.ALTERNATIVE_BILLING", obj3}, 3);
    }

    /* renamed from: A02 */
    public final C13245TRl values() {
        C13245TRl tRl = this.A00;
        if (tRl != null) {
            return tRl;
        }
        C8550Qwo A062 = A06();
        this.A00 = A062;
        return A062;
    }

    /* renamed from: A03 */
    public final C8554Qws entrySet() {
        C8554Qws qws = this.A01;
        if (qws != null) {
            return qws;
        }
        C8557Qwv A042 = A04();
        this.A01 = A042;
        return A042;
    }

    public final C8557Qwv A04() {
        return new C8557Qwv(this, this.A03, this.A04);
    }

    public final C8556Qwu A05() {
        return new C8556Qwu(new C8550Qwo(this.A03, 0, this.A04), this);
    }

    public final C8550Qwo A06() {
        return new C8550Qwo(this.A03, 1, this.A04);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        C8554Qws qws = this.A02;
        if (qws != null) {
            return qws;
        }
        C8556Qwu A052 = A05();
        this.A02 = A052;
        return A052;
    }

    @Deprecated
    public final void clear() {
        throw C66580MXl.A11();
    }

    public final boolean containsKey(Object obj) {
        return AnonymousClass7TF.A1V(get(obj));
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public final int hashCode() {
        return C9724Rfh.A00(entrySet());
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1Q(size());
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw C66580MXl.A11();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder A0J = Pxk.A0J(size);
            Iterator it = entrySet().iterator();
            boolean z = true;
            while (it.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(it);
                if (!z) {
                    Pxe.A1Y(A0J);
                }
                Pxj.A1O(A0J, A1J);
                z = false;
            }
            return Pxg.A0x(A0J);
        }
        throw DbW.A0a("size cannot be negative but was: ", size);
    }
}
