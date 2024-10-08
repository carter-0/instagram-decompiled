package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class W0M {
    public static final Object A06 = new Object();
    public static volatile W0M A07;
    public int A00 = 3;
    public final Handler A01;
    public final VUI A02;
    public final X01 A03;
    public final Set A04;
    public final ReadWriteLock A05 = new ReentrantReadWriteLock();

    public final CharSequence A02(CharSequence charSequence) {
        int length;
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return A03(charSequence2, 0, length, Integer.MAX_VALUE, 0);
    }

    public static W0M A00() {
        W0M w0m;
        synchronized (A06) {
            02V.A07(AnonymousClass7TF.A1V(A07), "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            w0m = A07;
        }
        return w0m;
    }

    public final int A01() {
        ReadWriteLock readWriteLock = this.A05;
        readWriteLock.readLock().lock();
        try {
            return this.A00;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: android.text.SpannableString} */
    /* JADX WARNING: type inference failed for: r7v4, types: [java.lang.CharSequence] */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e0, code lost:
        if (X.AnonymousClass7TF.A1S(r19, 65039) != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01e3, code lost:
        if (r1 != false) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01f3, code lost:
        if (X.W16.A02(r5.A00, r9, r12, r2, r11) == false) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0159, code lost:
        if (X.AnonymousClass7TF.A1S(r19, 65039) != false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x015c, code lost:
        if (r1 != false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0168, code lost:
        if (r15 == null) goto L_0x016a;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01ed A[SYNTHETIC, Splitter:B:114:0x01ed] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01f7 A[Catch:{ all -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x020a A[Catch:{ all -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0213 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2 A[Catch:{ all -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c4 A[Catch:{ all -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010f A[Catch:{ all -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a0 A[Catch:{ all -> 0x021d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence A03(java.lang.CharSequence r25, int r26, int r27, int r28, int r29) {
        /*
            r24 = this;
            r3 = r24
            r12 = r25
            r10 = r28
            r13 = r27
            r11 = r26
            int r0 = r3.A01()
            boolean r1 = X.C66581MXm.A1V(r0)
            java.lang.String r0 = "Not initialized yet"
            X.02V.A07(r1, r0)
            java.lang.String r0 = "start cannot be negative"
            X.02V.A02(r11, r0)
            java.lang.String r0 = "end cannot be negative"
            X.02V.A02(r13, r0)
            java.lang.String r0 = "maxEmojiCount cannot be negative"
            X.02V.A02(r10, r0)
            r2 = 1
            boolean r1 = X.Pxg.A1T(r11, r13)
            java.lang.String r0 = "start should be <= than end"
            X.02V.A06(r1, r0)
            if (r25 == 0) goto L_0x0226
            int r0 = r12.length()
            boolean r1 = X.Pxg.A1T(r11, r0)
            java.lang.String r0 = "start should be < than charSequence length"
            X.02V.A06(r1, r0)
            int r0 = r12.length()
            boolean r1 = X.Pxg.A1T(r13, r0)
            java.lang.String r0 = "end should be < than charSequence length"
            X.02V.A06(r1, r0)
            int r0 = r12.length()
            if (r0 == 0) goto L_0x0226
            if (r11 == r13) goto L_0x0226
            r0 = r29
            if (r0 == r2) goto L_0x006c
            r21 = 0
        L_0x005a:
            X.VUI r0 = r3.A02
            X.W16 r9 = r0.A01
            boolean r8 = r12 instanceof X.Q8H
            if (r8 == 0) goto L_0x0068
            r0 = r12
            X.Q8H r0 = (X.Q8H) r0
            X.Q8H.A02(r0)
        L_0x0068:
            r7 = 0
            if (r8 != 0) goto L_0x008c
            goto L_0x006f
        L_0x006c:
            r21 = 1
            goto L_0x005a
        L_0x006f:
            boolean r0 = r12 instanceof android.text.Spannable     // Catch:{ all -> 0x021d }
            if (r0 != 0) goto L_0x008c
            boolean r0 = r12 instanceof android.text.Spanned     // Catch:{ all -> 0x021d }
            if (r0 == 0) goto L_0x008f
            r3 = r12
            android.text.Spanned r3 = (android.text.Spanned) r3     // Catch:{ all -> 0x021d }
            int r2 = r26 + -1
            int r1 = r27 + 1
            java.lang.Class<X.U2Y> r0 = X.U2Y.class
            int r0 = r3.nextSpanTransition(r2, r1, r0)     // Catch:{ all -> 0x021d }
            if (r0 > r13) goto L_0x008f
            android.text.SpannableString r7 = new android.text.SpannableString     // Catch:{ all -> 0x021d }
            r7.<init>(r12)     // Catch:{ all -> 0x021d }
            goto L_0x008f
        L_0x008c:
            r7 = r12
            android.text.Spannable r7 = (android.text.Spannable) r7     // Catch:{ all -> 0x021d }
        L_0x008f:
            r4 = 0
            if (r7 == 0) goto L_0x00bc
            java.lang.Class<X.U2Y> r0 = X.U2Y.class
            java.lang.Object[] r6 = r7.getSpans(r11, r13, r0)     // Catch:{ all -> 0x021d }
            X.U2Y[] r6 = (X.U2Y[]) r6     // Catch:{ all -> 0x021d }
            if (r6 == 0) goto L_0x00bc
            int r5 = r6.length     // Catch:{ all -> 0x021d }
            if (r5 <= 0) goto L_0x00bc
            r3 = 0
        L_0x00a0:
            if (r3 >= r5) goto L_0x00bc
            r2 = r6[r3]     // Catch:{ all -> 0x021d }
            int r1 = r7.getSpanStart(r2)     // Catch:{ all -> 0x021d }
            int r0 = r7.getSpanEnd(r2)     // Catch:{ all -> 0x021d }
            if (r1 == r13) goto L_0x00b1
            r7.removeSpan(r2)     // Catch:{ all -> 0x021d }
        L_0x00b1:
            int r11 = java.lang.Math.min(r1, r11)     // Catch:{ all -> 0x021d }
            int r13 = java.lang.Math.max(r0, r13)     // Catch:{ all -> 0x021d }
            int r3 = r3 + 1
            goto L_0x00a0
        L_0x00bc:
            if (r11 == r13) goto L_0x0214
            int r0 = r12.length()     // Catch:{ all -> 0x021d }
            if (r11 >= r0) goto L_0x0214
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r10 == r0) goto L_0x00da
            if (r7 == 0) goto L_0x00da
            int r1 = r7.length()     // Catch:{ all -> 0x021d }
            java.lang.Class<X.U2Y> r0 = X.U2Y.class
            java.lang.Object[] r0 = r7.getSpans(r4, r1, r0)     // Catch:{ all -> 0x021d }
            X.U2Y[] r0 = (X.U2Y[]) r0     // Catch:{ all -> 0x021d }
            int r0 = r0.length     // Catch:{ all -> 0x021d }
            int r10 = r28 - r0
        L_0x00da:
            X.VsM r0 = r9.A01     // Catch:{ all -> 0x021d }
            X.Vu1 r0 = r0.A01     // Catch:{ all -> 0x021d }
            r23 = r0
            r1 = 0
            r20 = 0
            r19 = 0
            r6 = 1
            r5 = r0
            int r4 = java.lang.Character.codePointAt(r12, r11)     // Catch:{ all -> 0x021d }
            r3 = 0
        L_0x00ec:
            r2 = r11
        L_0x00ed:
            if (r11 >= r13) goto L_0x01b2
            if (r3 >= r10) goto L_0x01b2
            android.util.SparseArray r0 = r5.A01     // Catch:{ all -> 0x021d }
            java.lang.Object r15 = r0.get(r4)     // Catch:{ all -> 0x021d }
            X.Vu1 r15 = (X.C18549Vu1) r15     // Catch:{ all -> 0x021d }
            r14 = 3
            r18 = 1
            r17 = 2
            r0 = r17
            if (r6 == r0) goto L_0x0103
            goto L_0x0165
        L_0x0103:
            if (r15 == 0) goto L_0x0116
            r5 = r15
            int r1 = r1 + 1
        L_0x0108:
            r14 = 2
        L_0x0109:
            r19 = r4
            r0 = r18
            if (r14 == r0) goto L_0x01a0
            r0 = r17
            if (r14 == r0) goto L_0x0193
            if (r21 != 0) goto L_0x017a
            goto L_0x0170
        L_0x0116:
            r0 = 65038(0xfe0e, float:9.1138E-41)
            boolean r0 = X.AnonymousClass7TF.A1S(r4, r0)
            if (r0 != 0) goto L_0x016a
            r15 = 65039(0xfe0f, float:9.1139E-41)
            boolean r0 = X.AnonymousClass7TF.A1S(r4, r15)
            if (r0 != 0) goto L_0x0108
            X.Vzk r0 = r5.A00     // Catch:{ all -> 0x021d }
            if (r0 == 0) goto L_0x016a
            r0 = r18
            if (r1 != r0) goto L_0x015e
            X.Vzk r0 = r5.A00     // Catch:{ all -> 0x021d }
            X.UEx r6 = X.C18749Vzk.A00(r0)     // Catch:{ all -> 0x021d }
            r0 = 6
            int r1 = r6.A00(r0)     // Catch:{ all -> 0x021d }
            r16 = 0
            if (r1 == 0) goto L_0x0150
            java.nio.ByteBuffer r0 = r6.A01     // Catch:{ all -> 0x021d }
            r22 = r0
            int r0 = r6.A00     // Catch:{ all -> 0x021d }
            int r1 = r1 + r0
            r0 = r22
            byte r0 = r0.get(r1)     // Catch:{ all -> 0x021d }
            if (r0 == 0) goto L_0x0150
            r16 = 1
        L_0x0150:
            if (r16 != 0) goto L_0x015b
            r0 = r19
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r15)
            r1 = 0
            if (r0 == 0) goto L_0x015c
        L_0x015b:
            r1 = 1
        L_0x015c:
            if (r1 == 0) goto L_0x016a
        L_0x015e:
            r20 = r5
            r6 = 1
            r5 = r23
            r1 = 0
            goto L_0x0109
        L_0x0165:
            r6 = 2
            r5 = r15
            r1 = 1
            if (r15 != 0) goto L_0x0108
        L_0x016a:
            r6 = 1
            r5 = r23
            r1 = 0
            r14 = 1
            goto L_0x0109
        L_0x0170:
            r0 = r20
            X.Vzk r0 = r0.A00     // Catch:{ all -> 0x021d }
            boolean r0 = X.W16.A02(r0, r9, r12, r2, r11)     // Catch:{ all -> 0x021d }
            if (r0 != 0) goto L_0x00ec
        L_0x017a:
            if (r7 != 0) goto L_0x0181
            android.text.SpannableString r7 = new android.text.SpannableString     // Catch:{ all -> 0x021d }
            r7.<init>(r12)     // Catch:{ all -> 0x021d }
        L_0x0181:
            r0 = r20
            X.Vzk r0 = r0.A00     // Catch:{ all -> 0x021d }
            X.U7p r14 = new X.U7p     // Catch:{ all -> 0x021d }
            r14.<init>(r0)     // Catch:{ all -> 0x021d }
            r0 = 33
            r7.setSpan(r14, r2, r11, r0)     // Catch:{ all -> 0x021d }
            int r3 = r3 + 1
            goto L_0x00ec
        L_0x0193:
            int r0 = java.lang.Character.charCount(r4)     // Catch:{ all -> 0x021d }
            int r11 = r11 + r0
            if (r11 >= r13) goto L_0x00ed
            int r4 = java.lang.Character.codePointAt(r12, r11)     // Catch:{ all -> 0x021d }
            goto L_0x00ed
        L_0x01a0:
            int r0 = java.lang.Character.codePointAt(r12, r2)     // Catch:{ all -> 0x021d }
            int r0 = java.lang.Character.charCount(r0)     // Catch:{ all -> 0x021d }
            int r2 = r2 + r0
            if (r2 >= r13) goto L_0x01af
            int r4 = java.lang.Character.codePointAt(r12, r2)     // Catch:{ all -> 0x021d }
        L_0x01af:
            r11 = r2
            goto L_0x00ed
        L_0x01b2:
            r4 = 1
            r0 = 2
            if (r6 != r0) goto L_0x01e6
            X.Vzk r0 = r5.A00     // Catch:{ all -> 0x021d }
            if (r0 == 0) goto L_0x01e6
            if (r1 > r4) goto L_0x01e7
            X.UEx r14 = X.C18749Vzk.A00(r0)     // Catch:{ all -> 0x021d }
            r0 = 6
            int r13 = r14.A00(r0)     // Catch:{ all -> 0x021d }
            r6 = 0
            if (r13 == 0) goto L_0x01d4
            java.nio.ByteBuffer r1 = r14.A01     // Catch:{ all -> 0x021d }
            int r0 = r14.A00     // Catch:{ all -> 0x021d }
            int r13 = r13 + r0
            byte r0 = r1.get(r13)     // Catch:{ all -> 0x021d }
            if (r0 == 0) goto L_0x01d4
            r6 = 1
        L_0x01d4:
            if (r6 != 0) goto L_0x01e2
            r1 = 65039(0xfe0f, float:9.1139E-41)
            r0 = r19
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x01e3
        L_0x01e2:
            r1 = 1
        L_0x01e3:
            if (r1 == 0) goto L_0x01e6
            goto L_0x01e7
        L_0x01e6:
            r4 = 0
        L_0x01e7:
            if (r4 == 0) goto L_0x0208
            if (r3 >= r10) goto L_0x0208
            if (r21 != 0) goto L_0x01f5
            X.Vzk r0 = r5.A00     // Catch:{ all -> 0x021d }
            boolean r0 = X.W16.A02(r0, r9, r12, r2, r11)     // Catch:{ all -> 0x021d }
            if (r0 != 0) goto L_0x0208
        L_0x01f5:
            if (r7 != 0) goto L_0x01fc
            android.text.SpannableString r7 = new android.text.SpannableString     // Catch:{ all -> 0x021d }
            r7.<init>(r12)     // Catch:{ all -> 0x021d }
        L_0x01fc:
            X.Vzk r0 = r5.A00     // Catch:{ all -> 0x021d }
            X.U7p r1 = new X.U7p     // Catch:{ all -> 0x021d }
            r1.<init>(r0)     // Catch:{ all -> 0x021d }
            r0 = 33
            r7.setSpan(r1, r2, r11, r0)     // Catch:{ all -> 0x021d }
        L_0x0208:
            if (r7 != 0) goto L_0x020b
            r7 = r12
        L_0x020b:
            if (r8 == 0) goto L_0x0213
            X.Q8H r12 = (X.Q8H) r12
            r12.A03()
            return r7
        L_0x0213:
            return r7
        L_0x0214:
            if (r8 == 0) goto L_0x021c
            r0 = r12
            X.Q8H r0 = (X.Q8H) r0
            r0.A03()
        L_0x021c:
            return r12
        L_0x021d:
            r0 = move-exception
            if (r8 == 0) goto L_0x0225
            X.Q8H r12 = (X.Q8H) r12
            r12.A03()
        L_0x0225:
            throw r0
        L_0x0226:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W0M.A03(java.lang.CharSequence, int, int, int, int):java.lang.CharSequence");
    }

    /* JADX INFO: finally extract failed */
    public final void A04(Throwable th) {
        ArrayList arrayList = new ArrayList();
        ReadWriteLock readWriteLock = this.A05;
        readWriteLock.writeLock().lock();
        try {
            this.A00 = 2;
            Set set = this.A04;
            arrayList.addAll(set);
            set.clear();
            C13988Tno.A1V(readWriteLock);
            this.A01.post(new C20267WoI(th, arrayList, this.A00));
        } catch (Throwable th2) {
            C13988Tno.A1V(readWriteLock);
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public W0M(X01 x01, Set set) {
        this.A03 = x01;
        this.A01 = AnonymousClass7TF.A0D();
        04u r1 = new 04u(0);
        this.A04 = r1;
        if (!set.isEmpty()) {
            r1.addAll(set);
        }
        this.A02 = new VUI(this);
        ReadWriteLock readWriteLock = this.A05;
        readWriteLock.writeLock().lock();
        try {
            this.A00 = 0;
            C13988Tno.A1V(readWriteLock);
            if (A01() == 0) {
                VUI vui = this.A02;
                try {
                    C18412VrH vrH = new C18412VrH(vui);
                    C18946WDz wDz = (C18946WDz) vui.A00.A03;
                    synchronized (wDz.A05) {
                        Handler handler = wDz.A00;
                        if (handler == null) {
                            HandlerThread A0J = Pxf.A0J("emojiCompat", 10);
                            wDz.A01 = A0J;
                            A0J.start();
                            handler = new Handler(wDz.A01.getLooper());
                            wDz.A00 = handler;
                        }
                        handler.post(new C20118Wle(vrH, wDz));
                    }
                } catch (Throwable th) {
                    vui.A00.A04(th);
                }
            }
        } catch (Throwable th2) {
            C13988Tno.A1V(readWriteLock);
            throw th2;
        }
    }
}
