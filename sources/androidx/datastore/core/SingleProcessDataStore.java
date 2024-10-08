package androidx.datastore.core;

import X.00k;
import X.05G;
import X.0qQ;
import X.0sL;
import X.106;
import X.AnonymousClass05E;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0r6;
import X.AnonymousClass4D7;
import X.AnonymousClass5KK;
import X.AnonymousClass5KR;
import X.AnonymousClass5KU;
import X.AnonymousClass5KV;
import X.AnonymousClass5KW;
import X.AnonymousClass5KX;
import X.AnonymousClass9K3;
import X.AnonymousClass9L8;
import X.C241063Ns;
import X.C262224Cq;
import X.C268254d4;
import X.C268304d9;
import X.C377189Kw;
import X.C62320sa;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class SingleProcessDataStore implements AnonymousClass5KU {
    public static final Object A09 = new Object();
    public static final Set A0A = new LinkedHashSet();
    public List A00;
    public final AnonymousClass5KX A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new AnonymousClass9L8(this, 42));
    public final C62320sa A03;
    public final 05G A04 = 106.A01(AnonymousClass5KV.A00);
    public final AnonymousClass5KK A05;
    public final AnonymousClass5KR A06;
    public final C262224Cq A07;
    public final AnonymousClass0r6 A08 = new AnonymousClass05E(new AnonymousClass9K3(this, (AnonymousClass4D7) null, 9));

    public SingleProcessDataStore(AnonymousClass5KK r6, AnonymousClass5KR r7, List list, C62320sa r9, C262224Cq r10) {
        0qQ.A0B(r6, 4);
        this.A03 = r9;
        this.A06 = r7;
        this.A05 = r6;
        this.A07 = r10;
        this.A00 = 00k.A0a(list);
        this.A01 = new AnonymousClass5KX(new C377189Kw(this, 14), AnonymousClass5KW.A00, new AnonymousClass9K3(this, (AnonymousClass4D7) null, 8), r10);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9Jd, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a A[Catch:{ all -> 0x00af }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C268304d9 r8, androidx.datastore.core.SingleProcessDataStore r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 4
            boolean r0 = X.C376739Jd.A00(r3, r10)
            if (r0 == 0) goto L_0x002e
            r4 = r10
            X.9Jd r4 = (X.C376739Jd) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A04
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r6 = 3
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 == r2) goto L_0x0041
            if (r0 == r7) goto L_0x0034
            if (r0 == r6) goto L_0x0041
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x002e:
            X.9Jd r4 = new X.9Jd
            r4.<init>(r9, r10, r3)
            goto L_0x0015
        L_0x0034:
            java.lang.Object r3 = r4.A03
            X.3Ns r3 = (X.C241063Ns) r3
            java.lang.Object r9 = r4.A02
            androidx.datastore.core.SingleProcessDataStore r9 = (androidx.datastore.core.SingleProcessDataStore) r9
            java.lang.Object r8 = r4.A01
            X.4d9 r8 = (X.C268304d9) r8
            goto L_0x0084
        L_0x0041:
            java.lang.Object r3 = r4.A01
            X.3Ns r3 = (X.C241063Ns) r3
            X.0eS.A00(r1)     // Catch:{ all -> 0x00af }
            goto L_0x00b5
        L_0x0049:
            X.0eS.A00(r1)
            X.3Ns r3 = r8.A03
            X.05G r0 = r9.A04     // Catch:{ all -> 0x00af }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x00af }
            X.4d4 r1 = (X.C268254d4) r1     // Catch:{ all -> 0x00af }
            boolean r0 = r1 instanceof X.C268264d5     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x0069
            X.0sL r1 = r8.A02     // Catch:{ all -> 0x00af }
            X.4Cc r0 = r8.A01     // Catch:{ all -> 0x00af }
            r4.A01 = r3     // Catch:{ all -> 0x00af }
            r4.A00 = r2     // Catch:{ all -> 0x00af }
            java.lang.Object r1 = A06(r9, r4, r0, r1)     // Catch:{ all -> 0x00af }
            if (r1 != r5) goto L_0x00b5
            return r5
        L_0x0069:
            boolean r0 = r1 instanceof X.C268274d6     // Catch:{ all -> 0x00af }
            if (r0 != 0) goto L_0x006f
            boolean r2 = r1 instanceof X.AnonymousClass5KV     // Catch:{ all -> 0x00af }
        L_0x006f:
            if (r2 == 0) goto L_0x00a0
            X.4d4 r0 = r8.A00     // Catch:{ all -> 0x00af }
            if (r1 != r0) goto L_0x009b
            r4.A01 = r8     // Catch:{ all -> 0x00af }
            r4.A02 = r9     // Catch:{ all -> 0x00af }
            r4.A03 = r3     // Catch:{ all -> 0x00af }
            r4.A00 = r7     // Catch:{ all -> 0x00af }
            java.lang.Object r0 = A02(r9, r4)     // Catch:{ all -> 0x00af }
            if (r0 != r5) goto L_0x0087
            return r5
        L_0x0084:
            X.0eS.A00(r1)     // Catch:{ all -> 0x00af }
        L_0x0087:
            X.0sL r2 = r8.A02     // Catch:{ all -> 0x00af }
            X.4Cc r1 = r8.A01     // Catch:{ all -> 0x00af }
            r4.A01 = r3     // Catch:{ all -> 0x00af }
            r0 = 0
            r4.A02 = r0     // Catch:{ all -> 0x00af }
            r4.A03 = r0     // Catch:{ all -> 0x00af }
            r4.A00 = r6     // Catch:{ all -> 0x00af }
            java.lang.Object r1 = A06(r9, r4, r1, r2)     // Catch:{ all -> 0x00af }
            if (r1 != r5) goto L_0x00b5
            return r5
        L_0x009b:
            X.4d6 r1 = (X.C268274d6) r1     // Catch:{ all -> 0x00af }
            java.lang.Throwable r0 = r1.A00     // Catch:{ all -> 0x00af }
            throw r0     // Catch:{ all -> 0x00af }
        L_0x00a0:
            boolean r0 = r1 instanceof X.C283965Ki     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x00a9
            X.5Ki r1 = (X.C283965Ki) r1     // Catch:{ all -> 0x00af }
            java.lang.Throwable r0 = r1.A00     // Catch:{ all -> 0x00af }
            throw r0     // Catch:{ all -> 0x00af }
        L_0x00a9:
            X.Wub r0 = new X.Wub     // Catch:{ all -> 0x00af }
            r0.<init>()     // Catch:{ all -> 0x00af }
            throw r0     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            X.0eQ r1 = new X.0eQ
            r1.<init>(r0)
        L_0x00b5:
            java.lang.Throwable r0 = X.0eR.A00(r1)
            if (r0 != 0) goto L_0x00c1
            r3.A0K(r1)
        L_0x00be:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x00c1:
            r3.A0U(r0)
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A00(X.4d9, androidx.datastore.core.SingleProcessDataStore, X.4D7):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: X.0rm} */
    /* JADX WARNING: type inference failed for: r11v1, types: [X.9Jk, java.lang.Object, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        if ((r2.getValue() instanceof X.C268274d6) != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (((X.C376809Jk) r15).A08 != 0) goto L_0x000d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0105 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(androidx.datastore.core.SingleProcessDataStore r14, X.AnonymousClass4D7 r15) {
        /*
            r3 = 0
            boolean r0 = r15 instanceof X.C376809Jk
            if (r0 == 0) goto L_0x000d
            r0 = r15
            X.9Jk r0 = (X.C376809Jk) r0
            int r1 = r0.A08
            r0 = 1
            if (r1 == r3) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0046
            r11 = r15
            X.9Jk r11 = (X.C376809Jk) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0046
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x001e:
            java.lang.Object r13 = r11.A07
            X.1Hj r8 = X.1Hj.A02
            int r0 = r11.A00
            r12 = 3
            r10 = 2
            r7 = 0
            r9 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0054
            if (r0 == r9) goto L_0x008d
            if (r0 == r10) goto L_0x00b5
            if (r0 != r12) goto L_0x004c
            java.lang.Object r5 = r11.A04
            X.136 r5 = (X.136) r5
            java.lang.Object r3 = r11.A03
            X.0r1 r3 = (X.0r1) r3
            java.lang.Object r4 = r11.A02
            X.0rm r4 = (X.0rm) r4
            java.lang.Object r14 = r11.A01
            androidx.datastore.core.SingleProcessDataStore r14 = (androidx.datastore.core.SingleProcessDataStore) r14
            X.0eS.A00(r13)
            goto L_0x0106
        L_0x0046:
            X.9Jk r11 = new X.9Jk
            r11.<init>(r14, r15, r3)
            goto L_0x001e
        L_0x004c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0054:
            X.0eS.A00(r13)
            X.05G r2 = r14.A04
            java.lang.Object r1 = r2.getValue()
            X.5KV r0 = X.AnonymousClass5KV.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x006e
            java.lang.Object r0 = r2.getValue()
            boolean r1 = r0 instanceof X.C268274d6
            r0 = 0
            if (r1 == 0) goto L_0x006f
        L_0x006e:
            r0 = 1
        L_0x006f:
            if (r0 == 0) goto L_0x0125
            X.136 r5 = new X.136
            r5.<init>()
            X.0rm r0 = new X.0rm
            r0.<init>()
            r11.A01 = r14
            r11.A02 = r5
            r11.A03 = r0
            r11.A04 = r0
            r11.A00 = r9
            java.lang.Object r13 = A05(r14, r11)
            if (r13 == r8) goto L_0x00ee
            r4 = r0
            goto L_0x00a0
        L_0x008d:
            java.lang.Object r0 = r11.A04
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r4 = r11.A03
            X.0rm r4 = (X.0rm) r4
            java.lang.Object r5 = r11.A02
            X.136 r5 = (X.136) r5
            java.lang.Object r14 = r11.A01
            androidx.datastore.core.SingleProcessDataStore r14 = (androidx.datastore.core.SingleProcessDataStore) r14
            X.0eS.A00(r13)
        L_0x00a0:
            r0.A00 = r13
            X.0r1 r3 = new X.0r1
            r3.<init>()
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1 r2 = new androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1
            r2.<init>(r14, r3, r4, r5)
            java.util.List r0 = r14.A00
            if (r0 == 0) goto L_0x00ef
            java.util.Iterator r1 = r0.iterator()
            goto L_0x00ce
        L_0x00b5:
            java.lang.Object r1 = r11.A06
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r2 = r11.A05
            java.lang.Object r3 = r11.A04
            X.0r1 r3 = (X.0r1) r3
            java.lang.Object r4 = r11.A03
            X.0rm r4 = (X.0rm) r4
            java.lang.Object r5 = r11.A02
            X.136 r5 = (X.136) r5
            java.lang.Object r14 = r11.A01
            androidx.datastore.core.SingleProcessDataStore r14 = (androidx.datastore.core.SingleProcessDataStore) r14
            X.0eS.A00(r13)
        L_0x00ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r0 = r1.next()
            X.0sL r0 = (X.0sL) r0
            r11.A01 = r14
            r11.A02 = r5
            r11.A03 = r4
            r11.A04 = r3
            r11.A05 = r2
            r11.A06 = r1
            r11.A00 = r10
            java.lang.Object r0 = r0.invoke(r2, r11)
            if (r0 != r8) goto L_0x00ce
        L_0x00ee:
            return r8
        L_0x00ef:
            r14.A00 = r6
            r11.A01 = r14
            r11.A02 = r4
            r11.A03 = r3
            r11.A04 = r5
            r11.A05 = r6
            r11.A06 = r6
            r11.A00 = r12
            java.lang.Object r0 = X.136.A00(r11, r5)
            if (r0 != r8) goto L_0x0106
            return r8
        L_0x0106:
            r3.A00 = r9     // Catch:{ all -> 0x0120 }
            X.0gF r8 = X.C60340gF.A00     // Catch:{ all -> 0x0120 }
            r5.A05(r6)
            X.05G r2 = r14.A04
            java.lang.Object r1 = r4.A00
            if (r1 == 0) goto L_0x0117
            int r7 = r1.hashCode()
        L_0x0117:
            X.4d5 r0 = new X.4d5
            r0.<init>(r1, r7)
            r2.Epw(r0)
            return r8
        L_0x0120:
            r0 = move-exception
            r5.A05(r6)
            throw r0
        L_0x0125:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A01(androidx.datastore.core.SingleProcessDataStore, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(androidx.datastore.core.SingleProcessDataStore r5, X.AnonymousClass4D7 r6) {
        /*
            r3 = 4
            boolean r0 = X.AnonymousClass9JX.A00(r3, r6)
            if (r0 == 0) goto L_0x0025
            r4 = r6
            X.9JX r4 = (X.AnonymousClass9JX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0025
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 != r0) goto L_0x002f
            java.lang.Object r5 = r4.A01
            androidx.datastore.core.SingleProcessDataStore r5 = (androidx.datastore.core.SingleProcessDataStore) r5
            goto L_0x002b
        L_0x0025:
            X.9JX r4 = new X.9JX
            r4.<init>(r5, r6, r3)
            goto L_0x0015
        L_0x002b:
            X.0eS.A00(r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0050
        L_0x002f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0037:
            X.0eS.A00(r3)
            r4.A01 = r5     // Catch:{ all -> 0x0045 }
            r4.A00 = r0     // Catch:{ all -> 0x0045 }
            java.lang.Object r0 = A01(r5, r4)     // Catch:{ all -> 0x0045 }
            if (r0 != r2) goto L_0x0050
            return r2
        L_0x0045:
            r2 = move-exception
            X.05G r1 = r5.A04
            X.4d6 r0 = new X.4d6
            r0.<init>(r2)
            r1.Epw(r0)
        L_0x0050:
            X.0gF r2 = X.C60340gF.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A03(androidx.datastore.core.SingleProcessDataStore, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|(3:27|28|29)|30|31|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b1, code lost:
        r0 = java.lang.Double.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01b6, code lost:
        r0 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b9, code lost:
        r8 = new X.AnonymousClass5Ka(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c1, code lost:
        if (r9.valueCase_ != 3) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c3, code lost:
        r0 = ((java.lang.Integer) r9.value_).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01cb, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d0, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d2, code lost:
        r8 = new X.AnonymousClass5Ka(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01da, code lost:
        if (r9.valueCase_ != 4) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01dc, code lost:
        r0 = ((java.lang.Long) r9.value_).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01e4, code lost:
        r0 = java.lang.Long.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01e9, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01ec, code lost:
        r1 = new X.AnonymousClass5Ka(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01f3, code lost:
        if (r9.valueCase_ != 5) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01f5, code lost:
        r0 = (java.lang.String) r9.value_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01f9, code lost:
        X.0qQ.A07(r0);
        r6.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0201, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0204, code lost:
        r8 = new X.AnonymousClass5Ka(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x020c, code lost:
        if (r9.valueCase_ != 6) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x020e, code lost:
        r0 = (X.C284215Lk) r9.value_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0212, code lost:
        r0 = r0.strings_;
        X.0qQ.A07(r0);
        r0 = X.00k.A0k(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x021b, code lost:
        r6.A01(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0220, code lost:
        r0 = X.C284215Lk.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0223, code lost:
        r1 = new java.io.IOException("Value not set.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x022c, code lost:
        r1 = new java.io.IOException("Value case is null.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x024e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0252, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0162, code lost:
        r0 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0168, code lost:
        switch(r0) {
            case -1: goto L_0x022c;
            case 0: goto L_0x016d;
            case 1: goto L_0x0186;
            case 2: goto L_0x01b9;
            case 3: goto L_0x01d2;
            case 4: goto L_0x01ec;
            case 5: goto L_0x0204;
            case 6: goto L_0x019f;
            default: goto L_0x016b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x016d, code lost:
        r8 = new X.AnonymousClass5Ka(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0174, code lost:
        if (r9.valueCase_ != 1) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0176, code lost:
        r0 = ((java.lang.Boolean) r9.value_).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017e, code lost:
        r0 = java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0184, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0186, code lost:
        r8 = new X.AnonymousClass5Ka(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x018e, code lost:
        if (r9.valueCase_ != 2) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0190, code lost:
        r0 = ((java.lang.Float) r9.value_).floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0198, code lost:
        r0 = java.lang.Float.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x019d, code lost:
        r0 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x019f, code lost:
        r8 = new X.AnonymousClass5Ka(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01a7, code lost:
        if (r9.valueCase_ != 7) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a9, code lost:
        r0 = ((java.lang.Double) r9.value_).doubleValue();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x007b */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(androidx.datastore.core.SingleProcessDataStore r12, X.AnonymousClass4D7 r13) {
        /*
            r5 = 5
            boolean r0 = X.C376739Jd.A00(r5, r13)
            if (r0 == 0) goto L_0x002b
            r6 = r13
            X.9Jd r6 = (X.C376739Jd) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r6.A04
            int r1 = r6.A00
            r4 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r4) goto L_0x0267
            java.lang.Object r3 = r6.A03
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r2 = r6.A02
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r12 = r6.A01
            androidx.datastore.core.SingleProcessDataStore r12 = (androidx.datastore.core.SingleProcessDataStore) r12
            goto L_0x0031
        L_0x002b:
            X.9Jd r6 = new X.9Jd
            r6.<init>(r12, r13, r5)
            goto L_0x0015
        L_0x0031:
            X.0eS.A00(r0)     // Catch:{ all -> 0x024c }
            goto L_0x0248
        L_0x0036:
            X.0eS.A00(r0)
            X.0eM r0 = r12.A02     // Catch:{ FileNotFoundException -> 0x0253 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ FileNotFoundException -> 0x0253 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ FileNotFoundException -> 0x0253 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0253 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0253 }
            r3 = 0
            r6.A01 = r12     // Catch:{ all -> 0x024c }
            r6.A02 = r2     // Catch:{ all -> 0x024c }
            r6.A03 = r3     // Catch:{ all -> 0x024c }
            r6.A00 = r4     // Catch:{ all -> 0x024c }
            X.5Kj r9 = X.C283975Kj.DEFAULT_INSTANCE     // Catch:{ 5eJ -> 0x00ea }
            X.5Kq r8 = new X.5Kq     // Catch:{ 5eJ -> 0x00ea }
            r8.<init>(r2)     // Catch:{ 5eJ -> 0x00ea }
            X.5Ku r6 = X.C284055Ku.A02     // Catch:{ 5eJ -> 0x00ea }
            if (r6 != 0) goto L_0x0084
            java.lang.Class<X.5Ku> r10 = X.C284055Ku.class
            monitor-enter(r10)     // Catch:{ 5eJ -> 0x00ea }
            X.5Ku r6 = X.C284055Ku.A02     // Catch:{ all -> 0x0081 }
            if (r6 != 0) goto L_0x007f
            java.lang.Class r7 = X.C284065Kv.A00     // Catch:{ all -> 0x0081 }
            if (r7 == 0) goto L_0x007b
            r0 = 749(0x2ed, float:1.05E-42)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ Exception -> 0x007b }
            r6 = 0
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x007b }
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r0, r1)     // Catch:{ Exception -> 0x007b }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x007b }
            java.lang.Object r6 = r1.invoke(r3, r0)     // Catch:{ Exception -> 0x007b }
            X.5Ku r6 = (X.C284055Ku) r6     // Catch:{ Exception -> 0x007b }
            goto L_0x007d
        L_0x007b:
            X.5Ku r6 = X.C284055Ku.A01     // Catch:{ all -> 0x0081 }
        L_0x007d:
            X.C284055Ku.A02 = r6     // Catch:{ all -> 0x0081 }
        L_0x007f:
            monitor-exit(r10)     // Catch:{ all -> 0x0081 }
            goto L_0x0084
        L_0x0081:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0081 }
            goto L_0x00e9
        L_0x0084:
            java.lang.Integer r7 = X.AnonymousClass05K.A0N     // Catch:{ 5eJ -> 0x00ea }
            java.lang.Object r9 = r9.A03(r7)     // Catch:{ 5eJ -> 0x00ea }
            X.5Kk r9 = (X.C283985Kk) r9     // Catch:{ 5eJ -> 0x00ea }
            X.5Kw r1 = X.C284075Kw.A02     // Catch:{ IOException -> 0x00bf, RuntimeException -> 0x00b1 }
            java.lang.Class r0 = r9.getClass()     // Catch:{ IOException -> 0x00bf, RuntimeException -> 0x00b1 }
            X.5L3 r1 = r1.A00(r0)     // Catch:{ IOException -> 0x00bf, RuntimeException -> 0x00b1 }
            X.5Le r0 = r8.A01     // Catch:{ IOException -> 0x00bf, RuntimeException -> 0x00b1 }
            if (r0 != 0) goto L_0x009f
            X.5Le r0 = new X.5Le     // Catch:{ IOException -> 0x00bf, RuntimeException -> 0x00b1 }
            r0.<init>(r8)     // Catch:{ IOException -> 0x00bf, RuntimeException -> 0x00b1 }
        L_0x009f:
            r1.Co6(r6, r0, r9)     // Catch:{ IOException -> 0x00bf, RuntimeException -> 0x00b1 }
            r1.ClW(r9)     // Catch:{ IOException -> 0x00bf, RuntimeException -> 0x00b1 }
            boolean r0 = X.C283985Kk.A01(r9)     // Catch:{ 5eJ -> 0x00ea }
            if (r0 == 0) goto L_0x00d7
            X.5Kj r9 = (X.C283975Kj) r9     // Catch:{ 5eJ -> 0x00ea }
            X.0qQ.A07(r9)     // Catch:{ 5eJ -> 0x00ea }
            goto L_0x00f3
        L_0x00b1:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ 5eJ -> 0x00ea }
            boolean r0 = r0 instanceof X.C289845eJ     // Catch:{ 5eJ -> 0x00ea }
            if (r0 == 0) goto L_0x00e9
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ 5eJ -> 0x00ea }
            goto L_0x00e9
        L_0x00bf:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ 5eJ -> 0x00ea }
            boolean r0 = r0 instanceof X.C289845eJ     // Catch:{ 5eJ -> 0x00ea }
            if (r0 == 0) goto L_0x00cd
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ 5eJ -> 0x00ea }
            goto L_0x00e9
        L_0x00cd:
            java.lang.String r0 = r1.getMessage()     // Catch:{ 5eJ -> 0x00ea }
            X.5eJ r1 = new X.5eJ     // Catch:{ 5eJ -> 0x00ea }
            r1.<init>(r0)     // Catch:{ 5eJ -> 0x00ea }
            goto L_0x00e7
        L_0x00d7:
            java.lang.String r1 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            X.TQ1 r0 = new X.TQ1     // Catch:{ 5eJ -> 0x00ea }
            r0.<init>(r1)     // Catch:{ 5eJ -> 0x00ea }
            java.lang.String r0 = r0.getMessage()     // Catch:{ 5eJ -> 0x00ea }
            X.5eJ r1 = new X.5eJ     // Catch:{ 5eJ -> 0x00ea }
            r1.<init>(r0)     // Catch:{ 5eJ -> 0x00ea }
        L_0x00e7:
            r1.A00 = r9     // Catch:{ 5eJ -> 0x00ea }
        L_0x00e9:
            throw r1     // Catch:{ 5eJ -> 0x00ea }
        L_0x00ea:
            r3 = move-exception
            java.lang.String r0 = "Unable to parse preferences proto."
            X.5eK r1 = new X.5eK     // Catch:{ all -> 0x024c }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x024c }
            goto L_0x0116
        L_0x00f3:
            r8 = 0
            X.5Ll[] r1 = new X.C284225Ll[r8]     // Catch:{ all -> 0x024c }
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x024c }
            r0.<init>()     // Catch:{ all -> 0x024c }
            X.5Lm r6 = new X.5Lm     // Catch:{ all -> 0x024c }
            r6.<init>(r0, r8)     // Catch:{ all -> 0x024c }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r8)     // Catch:{ all -> 0x024c }
            X.5Ll[] r0 = (X.C284225Ll[]) r0     // Catch:{ all -> 0x024c }
            X.0qQ.A0B(r0, r8)     // Catch:{ all -> 0x024c }
            r6.A00()     // Catch:{ all -> 0x024c }
            int r0 = r0.length     // Catch:{ all -> 0x024c }
            if (r8 >= r0) goto L_0x0117
            java.lang.String r0 = "getKey$datastore_preferences_core"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x024c }
            r1.<init>(r0)     // Catch:{ all -> 0x024c }
        L_0x0116:
            throw r1     // Catch:{ all -> 0x024c }
        L_0x0117:
            X.5Kp r0 = r9.preferences_     // Catch:{ all -> 0x024c }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x024c }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x024c }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x024c }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x024c }
        L_0x0128:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x024c }
            if (r0 == 0) goto L_0x0235
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x024c }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x024c }
            java.lang.Object r10 = r0.getKey()     // Catch:{ all -> 0x024c }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x024c }
            java.lang.Object r9 = r0.getValue()     // Catch:{ all -> 0x024c }
            X.5LJ r9 = (X.AnonymousClass5LJ) r9     // Catch:{ all -> 0x024c }
            X.0qQ.A05(r10)     // Catch:{ all -> 0x024c }
            X.0qQ.A05(r9)     // Catch:{ all -> 0x024c }
            int r0 = r9.valueCase_     // Catch:{ all -> 0x024c }
            switch(r0) {
                case 0: goto L_0x014c;
                case 1: goto L_0x014f;
                case 2: goto L_0x0152;
                case 3: goto L_0x0155;
                case 4: goto L_0x015e;
                case 5: goto L_0x0158;
                case 6: goto L_0x015b;
                case 7: goto L_0x0160;
                default: goto L_0x014b;
            }     // Catch:{ all -> 0x024c }
        L_0x014b:
            goto L_0x0167
        L_0x014c:
            java.lang.Integer r0 = X.AnonymousClass05K.A15     // Catch:{ all -> 0x024c }
            goto L_0x0162
        L_0x014f:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x024c }
            goto L_0x0162
        L_0x0152:
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x024c }
            goto L_0x0162
        L_0x0155:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x024c }
            goto L_0x0162
        L_0x0158:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x024c }
            goto L_0x0162
        L_0x015b:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x024c }
            goto L_0x0162
        L_0x015e:
            r0 = r7
            goto L_0x0162
        L_0x0160:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x024c }
        L_0x0162:
            int r0 = r0.intValue()     // Catch:{ all -> 0x024c }
            goto L_0x0168
        L_0x0167:
            r0 = -1
        L_0x0168:
            switch(r0) {
                case -1: goto L_0x022c;
                case 0: goto L_0x016d;
                case 1: goto L_0x0186;
                case 2: goto L_0x01b9;
                case 3: goto L_0x01d2;
                case 4: goto L_0x01ec;
                case 5: goto L_0x0204;
                case 6: goto L_0x019f;
                default: goto L_0x016b;
            }     // Catch:{ all -> 0x024c }
        L_0x016b:
            goto L_0x0223
        L_0x016d:
            X.5Ka r8 = new X.5Ka     // Catch:{ all -> 0x024c }
            r8.<init>(r10)     // Catch:{ all -> 0x024c }
            int r0 = r9.valueCase_     // Catch:{ all -> 0x024c }
            if (r0 != r4) goto L_0x0184
            java.lang.Object r0 = r9.value_     // Catch:{ all -> 0x024c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x024c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x024c }
        L_0x017e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x024c }
            goto L_0x021b
        L_0x0184:
            r0 = 0
            goto L_0x017e
        L_0x0186:
            X.5Ka r8 = new X.5Ka     // Catch:{ all -> 0x024c }
            r8.<init>(r10)     // Catch:{ all -> 0x024c }
            int r1 = r9.valueCase_     // Catch:{ all -> 0x024c }
            r0 = 2
            if (r1 != r0) goto L_0x019d
            java.lang.Object r0 = r9.value_     // Catch:{ all -> 0x024c }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{ all -> 0x024c }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x024c }
        L_0x0198:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x024c }
            goto L_0x021b
        L_0x019d:
            r0 = 0
            goto L_0x0198
        L_0x019f:
            X.5Ka r8 = new X.5Ka     // Catch:{ all -> 0x024c }
            r8.<init>(r10)     // Catch:{ all -> 0x024c }
            int r1 = r9.valueCase_     // Catch:{ all -> 0x024c }
            r0 = 7
            if (r1 != r0) goto L_0x01b6
            java.lang.Object r0 = r9.value_     // Catch:{ all -> 0x024c }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ all -> 0x024c }
            double r0 = r0.doubleValue()     // Catch:{ all -> 0x024c }
        L_0x01b1:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x024c }
            goto L_0x021b
        L_0x01b6:
            r0 = 0
            goto L_0x01b1
        L_0x01b9:
            X.5Ka r8 = new X.5Ka     // Catch:{ all -> 0x024c }
            r8.<init>(r10)     // Catch:{ all -> 0x024c }
            int r1 = r9.valueCase_     // Catch:{ all -> 0x024c }
            r0 = 3
            if (r1 != r0) goto L_0x01d0
            java.lang.Object r0 = r9.value_     // Catch:{ all -> 0x024c }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x024c }
            int r0 = r0.intValue()     // Catch:{ all -> 0x024c }
        L_0x01cb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x024c }
            goto L_0x021b
        L_0x01d0:
            r0 = 0
            goto L_0x01cb
        L_0x01d2:
            X.5Ka r8 = new X.5Ka     // Catch:{ all -> 0x024c }
            r8.<init>(r10)     // Catch:{ all -> 0x024c }
            int r1 = r9.valueCase_     // Catch:{ all -> 0x024c }
            r0 = 4
            if (r1 != r0) goto L_0x01e9
            java.lang.Object r0 = r9.value_     // Catch:{ all -> 0x024c }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x024c }
            long r0 = r0.longValue()     // Catch:{ all -> 0x024c }
        L_0x01e4:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x024c }
            goto L_0x021b
        L_0x01e9:
            r0 = 0
            goto L_0x01e4
        L_0x01ec:
            X.5Ka r1 = new X.5Ka     // Catch:{ all -> 0x024c }
            r1.<init>(r10)     // Catch:{ all -> 0x024c }
            int r0 = r9.valueCase_     // Catch:{ all -> 0x024c }
            if (r0 != r5) goto L_0x0201
            java.lang.Object r0 = r9.value_     // Catch:{ all -> 0x024c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x024c }
        L_0x01f9:
            X.0qQ.A07(r0)     // Catch:{ all -> 0x024c }
            r6.A01(r1, r0)     // Catch:{ all -> 0x024c }
            goto L_0x0128
        L_0x0201:
            java.lang.String r0 = ""
            goto L_0x01f9
        L_0x0204:
            X.5Ka r8 = new X.5Ka     // Catch:{ all -> 0x024c }
            r8.<init>(r10)     // Catch:{ all -> 0x024c }
            int r1 = r9.valueCase_     // Catch:{ all -> 0x024c }
            r0 = 6
            if (r1 != r0) goto L_0x0220
            java.lang.Object r0 = r9.value_     // Catch:{ all -> 0x024c }
            X.5Lk r0 = (X.C284215Lk) r0     // Catch:{ all -> 0x024c }
        L_0x0212:
            X.TnW r0 = r0.strings_     // Catch:{ all -> 0x024c }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x024c }
            java.util.Set r0 = X.00k.A0k(r0)     // Catch:{ all -> 0x024c }
        L_0x021b:
            r6.A01(r8, r0)     // Catch:{ all -> 0x024c }
            goto L_0x0128
        L_0x0220:
            X.5Lk r0 = X.C284215Lk.DEFAULT_INSTANCE     // Catch:{ all -> 0x024c }
            goto L_0x0212
        L_0x0223:
            java.lang.String r0 = "Value not set."
            X.5eK r1 = new X.5eK     // Catch:{ all -> 0x024c }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x024c }
            goto L_0x0116
        L_0x022c:
            java.lang.String r0 = "Value case is null."
            X.5eK r1 = new X.5eK     // Catch:{ all -> 0x024c }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x024c }
            goto L_0x0116
        L_0x0235:
            java.util.Map r0 = r6.A00     // Catch:{ all -> 0x024c }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x024c }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x024c }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x024c }
            r1.<init>(r0)     // Catch:{ all -> 0x024c }
            X.5Lm r0 = new X.5Lm     // Catch:{ all -> 0x024c }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x024c }
        L_0x0248:
            X.1zE.A00(r2, r3)     // Catch:{ FileNotFoundException -> 0x0253 }
            return r0
        L_0x024c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x024e }
        L_0x024e:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ FileNotFoundException -> 0x0253 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0253 }
        L_0x0253:
            r1 = move-exception
            X.0eM r0 = r12.A02
            java.lang.Object r0 = r0.getValue()
            java.io.File r0 = (java.io.File) r0
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x026e
            X.5Lm r0 = X.C392349uf.A00()
            return r0
        L_0x0267:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
        L_0x026e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A04(androidx.datastore.core.SingleProcessDataStore, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.5eK} */
    /* JADX WARNING: type inference failed for: r6v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(androidx.datastore.core.SingleProcessDataStore r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 5
            boolean r0 = X.C376709Ja.A00(r3, r8)
            if (r0 == 0) goto L_0x002d
            r6 = r8
            X.9Ja r6 = (X.C376709Ja) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r4 = r6.A00
            r3 = 3
            r2 = 2
            r1 = 1
            if (r4 == 0) goto L_0x0053
            if (r4 == r1) goto L_0x004b
            if (r4 == r2) goto L_0x003f
            if (r4 != r3) goto L_0x0037
            java.lang.Object r5 = r6.A02
            java.lang.Object r1 = r6.A01
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            goto L_0x0033
        L_0x002d:
            X.9Ja r6 = new X.9Ja
            r6.<init>(r7, r8, r3)
            goto L_0x0015
        L_0x0033:
            X.0eS.A00(r0)     // Catch:{ IOException -> 0x007c }
            return r5
        L_0x0037:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x003f:
            java.lang.Object r1 = r6.A02
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r7 = r6.A01
            androidx.datastore.core.SingleProcessDataStore r7 = (androidx.datastore.core.SingleProcessDataStore) r7
            X.0eS.A00(r0)
            goto L_0x0072
        L_0x004b:
            java.lang.Object r7 = r6.A01
            androidx.datastore.core.SingleProcessDataStore r7 = (androidx.datastore.core.SingleProcessDataStore) r7
            X.0eS.A00(r0)     // Catch:{ 5eK -> 0x0062 }
            return r0
        L_0x0053:
            X.0eS.A00(r0)
            r6.A01 = r7     // Catch:{ 5eK -> 0x0062 }
            r6.A00 = r1     // Catch:{ 5eK -> 0x0062 }
            java.lang.Object r0 = A04(r7, r6)     // Catch:{ 5eK -> 0x0062 }
            if (r0 != r5) goto L_0x0061
            return r5
        L_0x0061:
            return r0
        L_0x0062:
            r1 = move-exception
            X.5KK r0 = r7.A05
            r6.A01 = r7
            r6.A02 = r1
            r6.A00 = r2
            java.lang.Object r0 = r0.CIZ(r1, r6)
            if (r0 != r5) goto L_0x0072
            return r5
        L_0x0072:
            r6.A01 = r1     // Catch:{ IOException -> 0x007c }
            r6.A02 = r0     // Catch:{ IOException -> 0x007c }
            r6.A00 = r3     // Catch:{ IOException -> 0x007c }
            r7.A07(r0, r6)     // Catch:{ IOException -> 0x007c }
            return r0
        L_0x007c:
            r0 = move-exception
            X.2Og.A01(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A05(androidx.datastore.core.SingleProcessDataStore, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9Jd, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(androidx.datastore.core.SingleProcessDataStore r10, X.AnonymousClass4D7 r11, X.C262094Cc r12, X.0sL r13) {
        /*
            r3 = 6
            boolean r0 = X.C376739Jd.A00(r3, r11)
            if (r0 == 0) goto L_0x009d
            r5 = r11
            X.9Jd r5 = (X.C376739Jd) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009d
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r5.A04
            X.1Hj r9 = X.1Hj.A02
            int r0 = r5.A00
            r6 = 0
            r4 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 == r8) goto L_0x006f
            if (r0 != r4) goto L_0x00a4
            java.lang.Object r3 = r5.A02
            java.lang.Object r10 = r5.A01
            androidx.datastore.core.SingleProcessDataStore r10 = (androidx.datastore.core.SingleProcessDataStore) r10
            X.0eS.A00(r2)
        L_0x002d:
            X.05G r2 = r10.A04
            if (r3 == 0) goto L_0x003e
            int r1 = r3.hashCode()
        L_0x0035:
            X.4d5 r0 = new X.4d5
            r0.<init>(r3, r1)
            r2.Epw(r0)
        L_0x003d:
            return r3
        L_0x003e:
            r1 = 0
            goto L_0x0035
        L_0x0040:
            X.0eS.A00(r2)
            X.05G r0 = r10.A04
            java.lang.Object r7 = r0.getValue()
            X.4d5 r7 = (X.C268264d5) r7
            java.lang.Object r3 = r7.A01
            if (r3 == 0) goto L_0x006d
            int r1 = r3.hashCode()
        L_0x0053:
            int r0 = r7.A00
            if (r1 != r0) goto L_0x00b4
            r1 = 10
            X.9K3 r0 = new X.9K3
            r0.<init>((java.lang.Object) r13, (java.lang.Object) r3, (X.AnonymousClass4D7) r6, (int) r1)
            r5.A01 = r10
            r5.A02 = r7
            r5.A03 = r3
            r5.A00 = r8
            java.lang.Object r2 = X.1Eo.A00(r5, r12, r0)
            if (r2 != r9) goto L_0x007c
            return r9
        L_0x006d:
            r1 = 0
            goto L_0x0053
        L_0x006f:
            java.lang.Object r3 = r5.A03
            java.lang.Object r7 = r5.A02
            X.4d5 r7 = (X.C268264d5) r7
            java.lang.Object r10 = r5.A01
            androidx.datastore.core.SingleProcessDataStore r10 = (androidx.datastore.core.SingleProcessDataStore) r10
            X.0eS.A00(r2)
        L_0x007c:
            java.lang.Object r0 = r7.A01
            if (r0 == 0) goto L_0x009b
            int r1 = r0.hashCode()
        L_0x0084:
            int r0 = r7.A00
            if (r1 != r0) goto L_0x00ac
            boolean r0 = X.0qQ.A0K(r3, r2)
            if (r0 != 0) goto L_0x003d
            r5.A01 = r10
            r5.A02 = r2
            r5.A03 = r6
            r5.A00 = r4
            r10.A07(r2, r5)
            r3 = r2
            goto L_0x002d
        L_0x009b:
            r1 = 0
            goto L_0x0084
        L_0x009d:
            X.9Jd r5 = new X.9Jd
            r5.<init>(r10, r11, r3)
            goto L_0x0015
        L_0x00a4:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00ac:
            java.lang.String r1 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00b4:
            java.lang.String r1 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A06(androidx.datastore.core.SingleProcessDataStore, X.4D7, X.4Cc, X.0sL):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(androidx.datastore.core.SingleProcessDataStore r5, X.AnonymousClass4D7 r6) {
        /*
            r3 = 10
            boolean r0 = X.C66144MDw.A02(r3, r6)
            if (r0 == 0) goto L_0x0026
            r4 = r6
            X.MDw r4 = (X.C66144MDw) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r0) goto L_0x0030
            java.lang.Object r5 = r4.A01
            androidx.datastore.core.SingleProcessDataStore r5 = (androidx.datastore.core.SingleProcessDataStore) r5
            goto L_0x002c
        L_0x0026:
            X.MDw r4 = new X.MDw
            r4.<init>(r5, r6, r3)
            goto L_0x0016
        L_0x002c:
            X.0eS.A00(r3)     // Catch:{ all -> 0x0049 }
            goto L_0x0046
        L_0x0030:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x0038:
            X.0eS.A00(r3)
            r4.A01 = r5     // Catch:{ all -> 0x0049 }
            r4.A00 = r0     // Catch:{ all -> 0x0049 }
            java.lang.Object r0 = A01(r5, r4)     // Catch:{ all -> 0x0049 }
            if (r0 != r2) goto L_0x0046
            return r2
        L_0x0046:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0049:
            r2 = move-exception
            X.05G r1 = r5.A04
            X.4d6 r0 = new X.4d6
            r0.<init>(r2)
            r1.Epw(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A02(androidx.datastore.core.SingleProcessDataStore, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02bf, code lost:
        if (r3 <= 4096) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02c1, code lost:
        r3 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02c3, code lost:
        r1 = new X.C7193Pyg(r7, r3);
        r4.FOB(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02cd, code lost:
        if (r1.A00 <= 0) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02cf, code lost:
        X.C7193Pyg.A05(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02d2, code lost:
        r3 = r15;
        r0 = r5;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        r1 = new java.lang.RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x031f, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        X.1zE.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02af, code lost:
        r4 = r11.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b7, code lost:
        if (X.C283985Kk.A01(r4) == false) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b9, code lost:
        r3 = r4.BsY();
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0273 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f4 A[Catch:{ all -> 0x031f }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C60340gF A07(java.lang.Object r16, X.AnonymousClass4D7 r17) {
        /*
            r15 = this;
            r8 = r16
            r4 = 1
            r5 = r17
            boolean r0 = X.C376789Ji.A00(r4, r5)
            if (r0 == 0) goto L_0x0037
            r3 = r5
            X.9Ji r3 = (X.C376789Ji) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0037
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0019:
            java.lang.Object r1 = r3.A06
            int r0 = r3.A00
            if (r0 == 0) goto L_0x0045
            if (r0 != r4) goto L_0x003d
            java.lang.Object r0 = r3.A05
            java.io.FileOutputStream r0 = (java.io.FileOutputStream) r0
            java.lang.Object r6 = r3.A04
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r5 = r3.A03
            java.io.Closeable r5 = (java.io.Closeable) r5
            java.lang.Object r2 = r3.A02
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r3 = r3.A01
            androidx.datastore.core.SingleProcessDataStore r3 = (androidx.datastore.core.SingleProcessDataStore) r3
            goto L_0x02d5
        L_0x0037:
            X.9Ji r3 = new X.9Ji
            r3.<init>(r15, r5, r4)
            goto L_0x0019
        L_0x003d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0045:
            X.0eS.A00(r1)
            X.0eM r2 = r15.A02
            java.lang.Object r1 = r2.getValue()
            java.io.File r1 = (java.io.File) r1
            java.io.File r0 = r1.getCanonicalFile()
            java.io.File r0 = r0.getParentFile()
            if (r0 == 0) goto L_0x006f
            r0.mkdirs()
            boolean r0 = r0.isDirectory()
            if (r0 != 0) goto L_0x006f
            java.lang.String r0 = "Unable to create parent directories of "
            java.lang.String r0 = X.0qQ.A03(r0, r1)
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
        L_0x006e:
            throw r1
        L_0x006f:
            java.lang.Object r0 = r2.getValue()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r1 = r0.getAbsolutePath()
            java.lang.String r0 = ".tmp"
            java.lang.String r0 = X.0qQ.A03(r1, r0)
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0324 }
            r5.<init>(r2)     // Catch:{ IOException -> 0x0324 }
            r6 = 0
            X.PyX r7 = new X.PyX     // Catch:{ all -> 0x031d }
            r7.<init>(r5)     // Catch:{ all -> 0x031d }
            r3.A01 = r15     // Catch:{ all -> 0x031d }
            r3.A02 = r2     // Catch:{ all -> 0x031d }
            r3.A03 = r5     // Catch:{ all -> 0x031d }
            r3.A04 = r6     // Catch:{ all -> 0x031d }
            r3.A05 = r5     // Catch:{ all -> 0x031d }
            r3.A00 = r4     // Catch:{ all -> 0x031d }
            androidx.datastore.preferences.core.Preferences r8 = (androidx.datastore.preferences.core.Preferences) r8     // Catch:{ all -> 0x031d }
            X.5Lm r8 = (X.C284235Lm) r8     // Catch:{ all -> 0x031d }
            java.util.Map r0 = r8.A00     // Catch:{ all -> 0x031d }
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x031d }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x031d }
            X.5Kj r0 = X.C283975Kj.DEFAULT_INSTANCE     // Catch:{ all -> 0x031d }
            java.lang.Integer r12 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x031d }
            java.lang.Object r11 = r0.A03(r12)     // Catch:{ all -> 0x031d }
            X.PyY r11 = (X.PyY) r11     // Catch:{ all -> 0x031d }
            X.Pya r11 = (X.C7187Pya) r11     // Catch:{ all -> 0x031d }
            java.util.Set r0 = r1.entrySet()     // Catch:{ all -> 0x031d }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x031d }
        L_0x00bc:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x02af
            java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x031d }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x031d }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x031d }
            X.5Ka r0 = (X.AnonymousClass5Ka) r0     // Catch:{ all -> 0x031d }
            java.lang.Object r13 = r1.getValue()     // Catch:{ all -> 0x031d }
            java.lang.String r10 = r0.A00     // Catch:{ all -> 0x031d }
            boolean r0 = r13 instanceof java.lang.Boolean     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x0113
            X.PyZ r9 = X.AnonymousClass5LJ.A02()     // Catch:{ all -> 0x031d }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ all -> 0x031d }
            r9.A01()     // Catch:{ all -> 0x031d }
            X.5Kk r1 = r9.A00     // Catch:{ all -> 0x031d }
            X.5LJ r1 = (X.AnonymousClass5LJ) r1     // Catch:{ all -> 0x031d }
            r0 = 1
        L_0x00e6:
            r1.valueCase_ = r0     // Catch:{ all -> 0x031d }
            r1.value_ = r13     // Catch:{ all -> 0x031d }
        L_0x00ea:
            X.5Kk r4 = r9.A00()     // Catch:{ all -> 0x031d }
            boolean r0 = X.C283985Kk.A01(r4)     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x0273
            X.0qQ.A07(r4)     // Catch:{ all -> 0x031d }
            X.5LJ r4 = (X.AnonymousClass5LJ) r4     // Catch:{ all -> 0x031d }
            r4.getClass()     // Catch:{ all -> 0x031d }
            r11.A01()     // Catch:{ all -> 0x031d }
            X.5Kk r3 = r11.A00     // Catch:{ all -> 0x031d }
            X.5Kj r3 = (X.C283975Kj) r3     // Catch:{ all -> 0x031d }
            X.5Kp r1 = r3.preferences_     // Catch:{ all -> 0x031d }
            boolean r0 = r1.A00     // Catch:{ all -> 0x031d }
            if (r0 != 0) goto L_0x010f
            X.5Kp r1 = r1.A01()     // Catch:{ all -> 0x031d }
            r3.preferences_ = r1     // Catch:{ all -> 0x031d }
        L_0x010f:
            r1.put(r10, r4)     // Catch:{ all -> 0x031d }
            goto L_0x00bc
        L_0x0113:
            boolean r0 = r13 instanceof java.lang.Float     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x0132
            X.PyZ r9 = X.AnonymousClass5LJ.A02()     // Catch:{ all -> 0x031d }
            java.lang.Number r13 = (java.lang.Number) r13     // Catch:{ all -> 0x031d }
            float r1 = r13.floatValue()     // Catch:{ all -> 0x031d }
            r9.A01()     // Catch:{ all -> 0x031d }
            X.5Kk r8 = r9.A00     // Catch:{ all -> 0x031d }
            X.5LJ r8 = (X.AnonymousClass5LJ) r8     // Catch:{ all -> 0x031d }
            r0 = 2
            r8.valueCase_ = r0     // Catch:{ all -> 0x031d }
            java.lang.Float r0 = java.lang.Float.valueOf(r1)     // Catch:{ all -> 0x031d }
        L_0x012f:
            r8.value_ = r0     // Catch:{ all -> 0x031d }
            goto L_0x00ea
        L_0x0132:
            boolean r0 = r13 instanceof java.lang.Double     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x014f
            X.PyZ r9 = X.AnonymousClass5LJ.A02()     // Catch:{ all -> 0x031d }
            java.lang.Number r13 = (java.lang.Number) r13     // Catch:{ all -> 0x031d }
            double r3 = r13.doubleValue()     // Catch:{ all -> 0x031d }
            r9.A01()     // Catch:{ all -> 0x031d }
            X.5Kk r8 = r9.A00     // Catch:{ all -> 0x031d }
            X.5LJ r8 = (X.AnonymousClass5LJ) r8     // Catch:{ all -> 0x031d }
            r0 = 7
            r8.valueCase_ = r0     // Catch:{ all -> 0x031d }
            java.lang.Double r0 = java.lang.Double.valueOf(r3)     // Catch:{ all -> 0x031d }
            goto L_0x012f
        L_0x014f:
            boolean r0 = r13 instanceof java.lang.Integer     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x016c
            X.PyZ r9 = X.AnonymousClass5LJ.A02()     // Catch:{ all -> 0x031d }
            java.lang.Number r13 = (java.lang.Number) r13     // Catch:{ all -> 0x031d }
            int r1 = r13.intValue()     // Catch:{ all -> 0x031d }
            r9.A01()     // Catch:{ all -> 0x031d }
            X.5Kk r8 = r9.A00     // Catch:{ all -> 0x031d }
            X.5LJ r8 = (X.AnonymousClass5LJ) r8     // Catch:{ all -> 0x031d }
            r0 = 3
            r8.valueCase_ = r0     // Catch:{ all -> 0x031d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x031d }
            goto L_0x012f
        L_0x016c:
            boolean r0 = r13 instanceof java.lang.Long     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x0189
            X.PyZ r9 = X.AnonymousClass5LJ.A02()     // Catch:{ all -> 0x031d }
            java.lang.Number r13 = (java.lang.Number) r13     // Catch:{ all -> 0x031d }
            long r3 = r13.longValue()     // Catch:{ all -> 0x031d }
            r9.A01()     // Catch:{ all -> 0x031d }
            X.5Kk r8 = r9.A00     // Catch:{ all -> 0x031d }
            X.5LJ r8 = (X.AnonymousClass5LJ) r8     // Catch:{ all -> 0x031d }
            r0 = 4
            r8.valueCase_ = r0     // Catch:{ all -> 0x031d }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x031d }
            goto L_0x012f
        L_0x0189:
            boolean r0 = r13 instanceof java.lang.String     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x01a0
            X.PyZ r9 = X.AnonymousClass5LJ.A02()     // Catch:{ all -> 0x031d }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x031d }
            r9.A01()     // Catch:{ all -> 0x031d }
            X.5Kk r1 = r9.A00     // Catch:{ all -> 0x031d }
            X.5LJ r1 = (X.AnonymousClass5LJ) r1     // Catch:{ all -> 0x031d }
            r13.getClass()     // Catch:{ all -> 0x031d }
            r0 = 5
            goto L_0x00e6
        L_0x01a0:
            boolean r0 = r13 instanceof java.util.Set     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x029b
            X.PyZ r9 = X.AnonymousClass5LJ.A02()     // Catch:{ all -> 0x031d }
            X.5Lk r0 = X.C284215Lk.DEFAULT_INSTANCE     // Catch:{ all -> 0x031d }
            java.lang.Object r1 = r0.A03(r12)     // Catch:{ all -> 0x031d }
            X.PyY r1 = (X.PyY) r1     // Catch:{ all -> 0x031d }
            X.QBq r1 = (X.C7406QBq) r1     // Catch:{ all -> 0x031d }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x031d }
            r1.A01()     // Catch:{ all -> 0x031d }
            X.5Kk r4 = r1.A00     // Catch:{ all -> 0x031d }
            X.5Lk r4 = (X.C284215Lk) r4     // Catch:{ all -> 0x031d }
            X.TnW r8 = r4.strings_     // Catch:{ all -> 0x031d }
            r0 = r8
            X.TRo r0 = (X.C13248TRo) r0     // Catch:{ all -> 0x031d }
            boolean r0 = r0.A00     // Catch:{ all -> 0x031d }
            if (r0 != 0) goto L_0x01d4
            int r3 = r8.size()     // Catch:{ all -> 0x031d }
            int r0 = r3 * 2
            if (r3 != 0) goto L_0x01ce
            r0 = 10
        L_0x01ce:
            X.TnW r8 = r8.Con(r0)     // Catch:{ all -> 0x031d }
            r4.strings_ = r8     // Catch:{ all -> 0x031d }
        L_0x01d4:
            java.nio.charset.Charset r0 = X.C284045Ks.A03     // Catch:{ all -> 0x031d }
            r13.getClass()     // Catch:{ all -> 0x031d }
            boolean r0 = r13 instanceof X.C13977TnT     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x021a
            X.TnT r13 = (X.C13977TnT) r13     // Catch:{ all -> 0x031d }
            java.util.List r0 = r13.CBK()     // Catch:{ all -> 0x031d }
            r4 = r8
            X.TnT r4 = (X.C13977TnT) r4     // Catch:{ all -> 0x031d }
            int r8 = r8.size()     // Catch:{ all -> 0x031d }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x031d }
        L_0x01ee:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x025b
            java.lang.Object r3 = r13.next()     // Catch:{ all -> 0x031d }
            if (r3 != 0) goto L_0x020c
            java.lang.String r3 = "Element at index "
            int r1 = r4.size()     // Catch:{ all -> 0x031d }
            int r1 = r1 - r8
            java.lang.String r0 = " is null."
            java.lang.String r3 = X.002.A0c(r3, r0, r1)     // Catch:{ all -> 0x031d }
            int r0 = r4.size()     // Catch:{ all -> 0x031d }
            goto L_0x027c
        L_0x020c:
            boolean r0 = r3 instanceof X.AnonymousClass5L9     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x0216
            X.5L9 r3 = (X.AnonymousClass5L9) r3     // Catch:{ all -> 0x031d }
            r4.A7X(r3)     // Catch:{ all -> 0x031d }
            goto L_0x01ee
        L_0x0216:
            r4.add(r3)     // Catch:{ all -> 0x031d }
            goto L_0x01ee
        L_0x021a:
            boolean r0 = r8 instanceof java.util.ArrayList     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x0231
            boolean r0 = r13 instanceof java.util.Collection     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x0231
            r4 = r8
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x031d }
            int r3 = r8.size()     // Catch:{ all -> 0x031d }
            int r0 = r13.size()     // Catch:{ all -> 0x031d }
            int r3 = r3 + r0
            r4.ensureCapacity(r3)     // Catch:{ all -> 0x031d }
        L_0x0231:
            int r4 = r8.size()     // Catch:{ all -> 0x031d }
            java.util.Iterator r3 = r13.iterator()     // Catch:{ all -> 0x031d }
        L_0x0239:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x025b
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x031d }
            if (r0 != 0) goto L_0x0257
            java.lang.String r3 = "Element at index "
            int r1 = r8.size()     // Catch:{ all -> 0x031d }
            int r1 = r1 - r4
            java.lang.String r0 = " is null."
            java.lang.String r3 = X.002.A0c(r3, r0, r1)     // Catch:{ all -> 0x031d }
            int r0 = r8.size()     // Catch:{ all -> 0x031d }
            goto L_0x0284
        L_0x0257:
            r8.add(r0)     // Catch:{ all -> 0x031d }
            goto L_0x0239
        L_0x025b:
            r9.A01()     // Catch:{ all -> 0x031d }
            X.5Kk r3 = r9.A00     // Catch:{ all -> 0x031d }
            X.5LJ r3 = (X.AnonymousClass5LJ) r3     // Catch:{ all -> 0x031d }
            X.5Kk r1 = r1.A00()     // Catch:{ all -> 0x031d }
            boolean r0 = X.C283985Kk.A01(r1)     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x0293
            r3.value_ = r1     // Catch:{ all -> 0x031d }
            r0 = 6
            r3.valueCase_ = r0     // Catch:{ all -> 0x031d }
            goto L_0x00ea
        L_0x0273:
            java.lang.String r0 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            X.TQ1 r1 = new X.TQ1     // Catch:{ all -> 0x031d }
            r1.<init>(r0)     // Catch:{ all -> 0x031d }
            goto L_0x031c
        L_0x027c:
            int r0 = r0 + -1
            if (r0 < r8) goto L_0x0317
            r4.remove(r0)     // Catch:{ all -> 0x031d }
            goto L_0x027c
        L_0x0284:
            int r0 = r0 + -1
            if (r0 < r4) goto L_0x028c
            r8.remove(r0)     // Catch:{ all -> 0x031d }
            goto L_0x0284
        L_0x028c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x031d }
            r1.<init>(r3)     // Catch:{ all -> 0x031d }
            goto L_0x031c
        L_0x0293:
            java.lang.String r1 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            X.TQ1 r0 = new X.TQ1     // Catch:{ all -> 0x031d }
            r0.<init>(r1)     // Catch:{ all -> 0x031d }
            throw r0     // Catch:{ all -> 0x031d }
        L_0x029b:
            java.lang.Class r0 = r13.getClass()     // Catch:{ all -> 0x031d }
            java.lang.String r1 = r0.getName()     // Catch:{ all -> 0x031d }
            java.lang.String r0 = "PreferencesSerializer does not support type: "
            java.lang.String r0 = X.0qQ.A03(r0, r1)     // Catch:{ all -> 0x031d }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x031d }
            r1.<init>(r0)     // Catch:{ all -> 0x031d }
            goto L_0x031c
        L_0x02af:
            X.5Kk r4 = r11.A00()     // Catch:{ all -> 0x031d }
            boolean r0 = X.C283985Kk.A01(r4)     // Catch:{ all -> 0x031d }
            if (r0 == 0) goto L_0x030f
            int r3 = r4.BsY()     // Catch:{ all -> 0x031d }
            r0 = 4096(0x1000, float:5.74E-42)
            if (r3 <= r0) goto L_0x02c3
            r3 = 4096(0x1000, float:5.74E-42)
        L_0x02c3:
            X.Pyg r1 = new X.Pyg     // Catch:{ all -> 0x031d }
            r1.<init>(r7, r3)     // Catch:{ all -> 0x031d }
            r4.FOB(r1)     // Catch:{ all -> 0x031d }
            int r0 = r1.A00     // Catch:{ all -> 0x031d }
            if (r0 <= 0) goto L_0x02d2
            X.C7193Pyg.A05(r1)     // Catch:{ all -> 0x031d }
        L_0x02d2:
            r3 = r15
            r0 = r5
            goto L_0x02d8
        L_0x02d5:
            X.0eS.A00(r1)     // Catch:{ all -> 0x031d }
        L_0x02d8:
            java.io.FileDescriptor r0 = r0.getFD()     // Catch:{ all -> 0x031d }
            r0.sync()     // Catch:{ all -> 0x031d }
            X.0gF r1 = X.C60340gF.A00     // Catch:{ all -> 0x031d }
            X.1zE.A00(r5, r6)     // Catch:{ IOException -> 0x0324 }
            X.0eM r0 = r3.A02     // Catch:{ IOException -> 0x0324 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x0324 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ IOException -> 0x0324 }
            boolean r0 = r2.renameTo(r0)     // Catch:{ IOException -> 0x0324 }
            if (r0 == 0) goto L_0x02f3
            goto L_0x032f
        L_0x02f3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0324 }
            r1.<init>()     // Catch:{ IOException -> 0x0324 }
            java.lang.String r0 = "Unable to rename "
            r1.append(r0)     // Catch:{ IOException -> 0x0324 }
            r1.append(r2)     // Catch:{ IOException -> 0x0324 }
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r1.append(r0)     // Catch:{ IOException -> 0x0324 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0324 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0324 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0324 }
            goto L_0x0323
        L_0x030f:
            java.lang.String r0 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            X.TQ1 r1 = new X.TQ1     // Catch:{ all -> 0x031d }
            r1.<init>(r0)     // Catch:{ all -> 0x031d }
            goto L_0x031c
        L_0x0317:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x031d }
            r1.<init>(r3)     // Catch:{ all -> 0x031d }
        L_0x031c:
            throw r1     // Catch:{ all -> 0x031d }
        L_0x031d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x031f }
        L_0x031f:
            r1 = move-exception
            X.1zE.A00(r5, r0)     // Catch:{ IOException -> 0x0324 }
        L_0x0323:
            throw r1     // Catch:{ IOException -> 0x0324 }
        L_0x0324:
            r1 = move-exception
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x006e
            r2.delete()
            throw r1
        L_0x032f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A07(java.lang.Object, X.4D7):X.0gF");
    }

    public final AnonymousClass0r6 AvF() {
        return this.A08;
    }

    public final Object FK3(AnonymousClass4D7 r5, 0sL r6) {
        C241063Ns r3 = new C241063Ns();
        this.A01.A00(new C268304d9((C268254d4) this.A04.getValue(), r5.getContext(), r6, r3));
        return r3.A0E(r5);
    }
}
