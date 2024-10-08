package X;

import android.util.SparseArray;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.lispy.lang.BloksScript;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: X.4tV  reason: invalid class name and case insensitive filesystem */
public class C276544tV implements AnonymousClass2TS {
    public static final C276574tY A0A = new C276564tX();
    public int A00;
    public C276634te A01;
    public Set A02;
    public final int A03;
    public final int A04;
    public final SparseArray A05;
    public final C276594ta A06;
    public final C276544tV A07;
    public final LinkedList A08;
    public final List A09;

    public final void A0Q(AnonymousClass6TD r7) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A05;
            if (i >= sparseArray.size()) {
                break;
            }
            Object valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                r7.FN6(sparseArray.keyAt(i), valueAt);
            }
            i++;
        }
        C276694tk A002 = C276674ti.A00();
        C276704tl r4 = (C276704tl) C276684tj.A01.get();
        if (r4 == null) {
            r4 = C276704tl.DEFAULT;
        }
        if (A002 != null && r4 != C276704tl.UNBOUND) {
            SparseArray sparseArray2 = (SparseArray) this.A06.A00();
            for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
                int keyAt = sparseArray2.keyAt(i2);
                Object A012 = C276674ti.A01(r4, A002, new TPR(this, keyAt));
                if (A012 != null) {
                    r7.FN6(keyAt, A012);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Throwable, java.lang.RuntimeException, X.4tW] */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010a, code lost:
        if (r6.A02.AgE().AgI().EJJ() != false) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb A[Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2Ta AEy(X.C244943c0 r15, int r16, int r17) {
        /*
            r14 = this;
            r11 = r14
            r9 = r15
            X.4tk r6 = X.C276674ti.A00()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r12 = r16
            r13 = r17
            if (r6 == 0) goto L_0x0060
            r0 = 1
            X.0qQ.A0B(r15, r0)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            java.lang.Object[] r0 = X.C276694tk.A00()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r1 = 2
            r8 = 2
            r7 = r0[r1]     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            java.lang.Object[] r0 = X.C276694tk.A00()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r0[r1] = r15     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.S6C r1 = new X.S6C     // Catch:{ all -> 0x0058 }
            r1.<init>(r14, r12, r13)     // Catch:{ all -> 0x0058 }
            java.lang.Object[] r0 = X.C276694tk.A00()     // Catch:{ all -> 0x0058 }
            r5 = 0
            r4 = r0[r5]     // Catch:{ all -> 0x0058 }
            java.lang.Object[] r0 = X.C276694tk.A00()     // Catch:{ all -> 0x0058 }
            r0[r5] = r1     // Catch:{ all -> 0x0058 }
            int r0 = r14.A03     // Catch:{ all -> 0x0050 }
            long r2 = (long) r0     // Catch:{ all -> 0x0050 }
            r0 = 27
            long r2 = r2 << r0
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r2 = r2 | r0
            X.VVU r1 = r6.A02(r2)     // Catch:{ all -> 0x0050 }
            java.lang.Object[] r0 = X.C276694tk.A00()     // Catch:{ all -> 0x0058 }
            r0[r5] = r4     // Catch:{ all -> 0x0058 }
            java.lang.Object[] r0 = X.C276694tk.A00()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r0[r8] = r7     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            java.lang.Object r0 = r1.A01     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.S6O r0 = (X.S6O) r0     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.2Ta r5 = r0.A02     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            return r5
        L_0x0050:
            r1 = move-exception
            java.lang.Object[] r0 = X.C276694tk.A00()     // Catch:{ all -> 0x0058 }
            r0[r5] = r4     // Catch:{ all -> 0x0058 }
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            java.lang.Object[] r0 = X.C276694tk.A00()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r0[r8] = r7     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            throw r1     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
        L_0x0060:
            r0 = 1
            X.0qQ.A0B(r15, r0)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.0eM r2 = r15.A06     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.3bz r0 = (X.C244933bz) r0     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            java.lang.Object r3 = r0.A00(r14)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            boolean r0 = r3 instanceof X.C244963c2     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            if (r0 == 0) goto L_0x00b2
            X.3c2 r3 = (X.C244963c2) r3     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            if (r3 == 0) goto L_0x00b3
            int r1 = r3.A01     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.2Ta r5 = r3.A02     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            int r0 = r5.getWidth()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            boolean r0 = X.Q33.A00(r1, r12, r0)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            if (r0 == 0) goto L_0x00b3
            int r1 = r3.A00     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            int r0 = r5.getHeight()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            boolean r0 = X.Q33.A00(r1, r13, r0)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            if (r0 == 0) goto L_0x00b3
            X.3kJ r0 = X.1KZ.A01     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            boolean r0 = r0.isTracing()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            if (r0 == 0) goto L_0x00a5
            java.lang.String r1 = "Bloks cacheTraversal: "
            int r0 = r14.A04     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            java.lang.String r0 = X.002.A0O(r1, r0)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.1KZ.A01(r0)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
        L_0x00a5:
            X.Tyu r0 = new X.Tyu     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r0.<init>(r15, r14)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r14.A0S(r0)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
        L_0x00ad:
            X.1KZ.A00()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            goto L_0x0182
        L_0x00b2:
            r3 = 0
        L_0x00b3:
            X.3kJ r0 = X.1KZ.A01     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            boolean r7 = r0.isTracing()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            if (r7 == 0) goto L_0x00ea
            java.lang.String r0 = r14.A0B()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            java.lang.String r1 = "Bloks Layout: "
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.1KZ.A01(r0)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
        L_0x00ca:
            int r0 = r14.A04     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            java.lang.String r1 = X.002.A0O(r1, r0)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r0 = 0
            X.0qQ.A0B(r1, r0)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.3kJ r0 = X.1KZ.A01     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.1Kb r4 = r0.ADH(r1)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r0 = 128(0x80, float:1.794E-43)
            java.lang.String r1 = r14.A0K(r0)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            if (r1 == 0) goto L_0x00e7
            java.lang.String r0 = "bloks_debug_metadata"
            r4.ACP(r1, r0)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
        L_0x00e7:
            r4.flush()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
        L_0x00ea:
            java.lang.Object r6 = r15.A05     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.6Rm r6 = (X.C307786Rm) r6     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r6.getClass()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            if (r3 == 0) goto L_0x010c
            X.2Ta r0 = r3.A02     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.2Th r0 = r0.Blo()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            if (r0 == 0) goto L_0x010c
            X.2nJ r0 = r6.A02     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.2nt r0 = r0.AgE()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.2nr r0 = r0.AgI()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            boolean r0 = r0.EJJ()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r1 = 1
            if (r0 != 0) goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            r10 = 0
            r0 = 156(0x9c, float:2.19E-43)
            java.lang.Object r0 = A00(r14, r0)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.2TS r0 = (X.AnonymousClass2TS) r0     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            if (r0 == 0) goto L_0x0133
            X.2Ta r5 = r0.AEy(r15, r12, r13)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            boolean r0 = r5 instanceof X.AnonymousClass6TQ     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            if (r0 != 0) goto L_0x015a
            if (r1 != 0) goto L_0x015a
            X.2Th r4 = r5.Blo()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            if (r4 == 0) goto L_0x0156
            long r0 = r4.A0H()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.Tz5 r3 = new X.Tz5     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r3.<init>(r4, r0)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r4 = r3
            goto L_0x0156
        L_0x0133:
            if (r1 == 0) goto L_0x0136
            goto L_0x0145
        L_0x0136:
            X.1Kj r0 = X.C64361Kj.A00()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.4ts r0 = r0.A08     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.2Th r0 = r0.A03(r6, r14)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.2Th r10 = r14.A06(r0, r6)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            goto L_0x014b
        L_0x0145:
            X.2Ta r0 = r3.A02     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.2Th r10 = r0.Blo()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
        L_0x014b:
            X.1Kj r0 = X.C64361Kj.A00()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.4ts r8 = r0.A08     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.2Ta r5 = r8.A02(r9, r10, r11, r12, r13)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            goto L_0x015a
        L_0x0156:
            X.2Th r10 = r14.A06(r4, r6)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
        L_0x015a:
            X.C64361Kj.A00()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            boolean r0 = r5 instanceof X.AnonymousClass6TQ     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            if (r0 != 0) goto L_0x0167
            X.6TQ r0 = new X.6TQ     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r0.<init>(r5, r10)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r5 = r0
        L_0x0167:
            X.3c2 r1 = new X.3c2     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r1.<init>(r5, r12, r13)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            X.3bz r0 = (X.C244933bz) r0     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            r0.A01(r14, r1)     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            if (r7 == 0) goto L_0x0183
            X.1KZ.A00()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            java.lang.String r0 = r14.A0B()     // Catch:{ 4tW -> 0x020f, RuntimeException -> 0x0184 }
            if (r0 == 0) goto L_0x0183
            goto L_0x00ad
        L_0x0182:
            return r5
        L_0x0183:
            return r5
        L_0x0184:
            r7 = move-exception
            X.RhZ.A00(r14)
            X.4tW r6 = new X.4tW
            r6.<init>(r7)
            r0 = 0
            r6.A00 = r0
            java.lang.Object r1 = r15.A05
            X.6Rm r1 = (X.C307786Rm) r1
            r1.getClass()
            boolean r0 = r7 instanceof X.V21
            if (r0 == 0) goto L_0x0210
            r0 = r7
            X.V21 r0 = (X.V21) r0
            long r3 = r0.A00
            r0 = 2131428758(0x7f0b0596, float:1.847917E38)
            java.lang.Object r0 = r1.A00(r0)
            X.6Rj r0 = (X.C307766Rj) r0
            int r8 = (int) r3
            java.lang.Object r5 = r0.A00
            monitor-enter(r5)
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x020c }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x020c }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x020c }
        L_0x01b7:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x020c }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x020c }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x020c }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x020c }
            int r0 = r0.intValue()     // Catch:{ all -> 0x020c }
            if (r0 != r8) goto L_0x01b7
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x020c }
            X.9Vg r0 = (X.C379779Vg) r0     // Catch:{ all -> 0x020c }
            monitor-exit(r5)     // Catch:{ all -> 0x020c }
            goto L_0x01d9
        L_0x01d7:
            monitor-exit(r5)     // Catch:{ all -> 0x020c }
            r0 = 0
        L_0x01d9:
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x020a
            java.lang.String r2 = r0.A02
        L_0x01df:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Duplicate RenderUnit IDs - scope key: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", client ID: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "\n\nOriginal message:\n"
            r1.append(r0)
            java.lang.String r0 = r7.getMessage()
            if (r0 == 0) goto L_0x0200
            r5 = r0
        L_0x0200:
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            r6.A00 = r0
            throw r6
        L_0x020a:
            r2 = r5
            goto L_0x01df
        L_0x020c:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x020c }
            throw r6
        L_0x020f:
            r6 = move-exception
        L_0x0210:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C276544tV.AEy(X.3c0, int, int):X.2Ta");
    }

    public final /* synthetic */ AnonymousClass2Ta AEz(C244943c0 r2, long j) {
        return C308016Sj.A00(r2, this, j);
    }

    public final float A02(int i, float f) {
        Object A012 = A01(Number.class, A00(this, i), Float.valueOf(f));
        0Sd.A00(A012);
        return ((Number) A012).floatValue();
    }

    public final View A05(C307786Rm r3) {
        if (r3 == null) {
            return null;
        }
        return ((C308166Sz) r3.A01(A0A, this, R.id.bk_context_key_associated_mutable_container)).A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (A02(145, 0.0f) != 0.0f) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.2Th A06(X.2Th r6, X.C307786Rm r7) {
        /*
            r5 = this;
            r0 = 136(0x88, float:1.9E-43)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r5.A02(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 137(0x89, float:1.92E-43)
            float r0 = r5.A02(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 138(0x8a, float:1.93E-43)
            r1 = 0
            float r0 = r5.A02(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 141(0x8d, float:1.98E-43)
            float r0 = r5.A02(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 144(0x90, float:2.02E-43)
            float r0 = r5.A02(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 145(0x91, float:2.03E-43)
            float r0 = r5.A02(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 0
            if (r0 == 0) goto L_0x0041
        L_0x0040:
            r3 = 1
        L_0x0041:
            r0 = 133(0x85, float:1.86E-43)
            java.util.List r4 = r5.A0N(r0)
            if (r3 != 0) goto L_0x0058
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0058
            if (r6 == 0) goto L_0x0057
            java.lang.Integer r1 = r6.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0058
        L_0x0057:
            return r6
        L_0x0058:
            if (r6 == 0) goto L_0x0068
            java.lang.Integer r1 = r6.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0074
            java.lang.String r1 = "Trying to apply View attributes to a Drawable Node is not yet supported"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0068:
            int r0 = r5.A03
            long r1 = (long) r0
            boolean r0 = X.C307476Qg.A0A(r7)
            X.6Sk r6 = new X.6Sk
            r6.<init>(r7, r1, r0)
        L_0x0074:
            r1 = 2131428733(0x7f0b057d, float:1.8479119E38)
            X.4tY r0 = A0A
            java.lang.Object r0 = r7.A01(r0, r5, r1)
            X.6Sz r0 = (X.C308166Sz) r0
            X.6T0 r1 = new X.6T0
            r1.<init>(r0)
            X.3ar r0 = new X.3ar
            r0.<init>(r1, r6)
            r6.A0D(r0)
            if (r3 == 0) goto L_0x009f
            long r2 = r6.A0H()
            X.Ug0 r1 = new X.Ug0
            r1.<init>(r5, r2)
            X.3ar r0 = new X.3ar
            r0.<init>(r1, r6)
            r6.A0D(r0)
        L_0x009f:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0057
            X.4tk r0 = X.C276674ti.A00()
            if (r0 == 0) goto L_0x00b9
            X.WK3 r0 = new X.WK3
            r0.<init>(r7, r5)
            X.3ar r1 = new X.3ar
            r1.<init>(r0, r4)
        L_0x00b5:
            r6.A0D(r1)
            return r6
        L_0x00b9:
            java.util.List r1 = java.util.Collections.unmodifiableList(r4)
            X.6TO r0 = new X.6TO
            r0.<init>(r7, r5, r1)
            X.3ar r1 = new X.3ar
            r1.<init>(r0, r6)
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C276544tV.A06(X.2Th, X.6Rm):X.2Th");
    }

    public final C277014uI A08() {
        return A0A(36);
    }

    public final C277014uI A09() {
        return A0A(35);
    }

    public final C277014uI A0A(int i) {
        Object obj = this.A05.get(i);
        if (obj == null) {
            return null;
        }
        return C280054zv.A00(this, obj, i);
    }

    public final String A0B() {
        return (String) A01(String.class, A00(this, 158), (Object) null);
    }

    public final String A0C() {
        Object A002 = A00(this, 33);
        if (A002 == null) {
            return null;
        }
        if (A002 instanceof String) {
            return (String) A002;
        }
        if (A002 instanceof Number) {
            return String.valueOf(((Number) A002).longValue());
        }
        1Kn.A02("BloksModel", 002.A0g("Unsupported value type: ", A002.getClass().getSimpleName(), " for Server Id Value"));
        return null;
    }

    public final String A0D() {
        return A0K(35);
    }

    public final String A0E() {
        return A0K(40);
    }

    public final String A0F() {
        return A0K(36);
    }

    public final String A0G() {
        return A0K(42);
    }

    public final String A0H() {
        return A0K(38);
    }

    public final String A0I() {
        return A0K(41);
    }

    public final String A0J() {
        return A0K(43);
    }

    public final List A0N(int i) {
        Object A012 = A01(List.class, A00(this, i), Collections.emptyList());
        0Sd.A00(A012);
        return (List) A012;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O() {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C276534tU
            if (r0 == 0) goto L_0x011c
            r0 = 135(0x87, float:1.89E-43)
            java.lang.Object r0 = A00(r8, r0)
            if (r0 != 0) goto L_0x0035
            r0 = 153(0x99, float:2.14E-43)
            java.lang.Object r0 = A00(r8, r0)
            if (r0 != 0) goto L_0x0035
            r5 = 0
            X.1Kj r0 = X.C64361Kj.A00()
            X.1KX r0 = r0.A03()
            int r4 = r8.A04
            int[] r3 = r0.A01(r4)
            int r2 = r3.length
            r1 = 0
        L_0x0025:
            if (r1 >= r2) goto L_0x008e
            r0 = r3[r1]
            X.4tV r0 = r8.A07(r0)
            if (r0 == 0) goto L_0x008b
            int r0 = r0.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x008b
        L_0x0035:
            r5 = 1
        L_0x0036:
            int r1 = r8.A00
            r0 = r1 & -2
            if (r5 == 0) goto L_0x003e
            r0 = r1 | 1
        L_0x003e:
            r8.A00 = r0
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            X.C64361Kj.A00()
            int r7 = r8.A04
            boolean r0 = X.C250563lf.A0m(r7)
            if (r0 == 0) goto L_0x0059
            int r0 = r8.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
        L_0x0059:
            X.1Kj r0 = X.C64361Kj.A00()
            X.1KX r0 = r0.A03()
            int[] r4 = r0.A01(r7)
            int r3 = r4.length
            r6 = 0
            r2 = 0
        L_0x0068:
            if (r2 >= r3) goto L_0x00c1
            r0 = r4[r2]
            X.4tV r0 = r8.A07(r0)
            if (r0 == 0) goto L_0x0088
            java.util.Set r1 = r0.A02
            if (r1 != 0) goto L_0x007a
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x007a:
            X.0qQ.A0A(r1)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0088
            r5.addAll(r1)
        L_0x0088:
            int r2 = r2 + 1
            goto L_0x0068
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0025
        L_0x008e:
            X.1Kj r0 = X.C64361Kj.A00()
            X.1KX r0 = r0.A03()
            int[] r4 = r0.A00(r4)
            int r3 = r4.length
            r2 = 0
        L_0x009c:
            if (r2 >= r3) goto L_0x0036
            r0 = r4[r2]
            java.util.List r0 = r8.A0M(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00a8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r0 = r1.next()
            X.4tV r0 = (X.C276544tV) r0
            if (r0 == 0) goto L_0x00a8
            int r0 = r0.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00a8
            goto L_0x0035
        L_0x00be:
            int r2 = r2 + 1
            goto L_0x009c
        L_0x00c1:
            X.1Kj r0 = X.C64361Kj.A00()
            X.1KX r0 = r0.A03()
            int[] r4 = r0.A00(r7)
            int r3 = r4.length
        L_0x00ce:
            if (r6 >= r3) goto L_0x0102
            r0 = r4[r6]
            java.util.List r0 = r8.A0M(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x00da:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r0 = r2.next()
            X.4tV r0 = (X.C276544tV) r0
            if (r0 == 0) goto L_0x00da
            java.util.Set r1 = r0.A02
            if (r1 != 0) goto L_0x00f0
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x00f0:
            X.0qQ.A0A(r1)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00da
            r5.addAll(r1)
            goto L_0x00da
        L_0x00ff:
            int r6 = r6 + 1
            goto L_0x00ce
        L_0x0102:
            r1 = r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x010a
            r1 = 0
        L_0x010a:
            r8.A02 = r1
            boolean r0 = r5.isEmpty()
            r2 = r0 ^ 1
            int r1 = r8.A00
            r0 = r1 & -3
            if (r2 == 0) goto L_0x011a
            r0 = r1 | 2
        L_0x011a:
            r8.A00 = r0
        L_0x011c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C276544tV.A0O():void");
    }

    public final void A0P(int i, Object obj) {
        this.A05.put(i, obj);
    }

    public final boolean A0T(boolean z) {
        return A0R(38, z);
    }

    public C276544tV(int i) {
        this.A06 = new C276594ta(new C276584tZ(this));
        this.A08 = null;
        this.A05 = new SparseArray();
        this.A04 = i;
        this.A03 = C276604tb.A00.incrementAndGet();
        this.A09 = null;
        this.A07 = null;
        this.A01 = null;
        C276614tc.A04.incrementAndGet();
    }

    public static Object A00(C276544tV r10, int i) {
        long j;
        VVU A002;
        BloksScript bloksScript;
        C276694tk A003 = C276674ti.A00();
        Object obj = C276684tj.A01.get();
        if (obj == null) {
            obj = C276704tl.DEFAULT;
        }
        SparseArray sparseArray = r10.A05;
        Object obj2 = sparseArray.get(i);
        if (C276714tm.A00() && A003 != null && obj != C276704tl.UNBOUND) {
            SparseArray sparseArray2 = (SparseArray) r10.A06.A00();
            if (sparseArray2.size() == 0 || (bloksScript = (BloksScript) sparseArray2.get(i)) == null) {
                int[] A004 = C64361Kj.A00().A03().A00(r10.A04);
                int length = A004.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    int i3 = A004[i2];
                    if (i3 == i) {
                        List<C276544tV> list = (List) sparseArray.get(i3);
                        if (list != null) {
                            for (C276544tV r0 : list) {
                                if (r0.A04 == 16851) {
                                    j = ((long) i) | (((long) r10.A03) << 27) | 2305843009213693952L;
                                    if (obj != C276704tl.CACHED_ONLY) {
                                        A002 = C16920VAx.A00(A003, list, j);
                                    }
                                }
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            } else {
                j = ((long) i) | (((long) r10.A03) << 27) | 1152921504606846976L;
                if (obj != C276704tl.CACHED_ONLY) {
                    A002 = C16920VAx.A00(A003, new S6N(r10, bloksScript, obj2, i), j);
                }
                A002 = A003.A03.A00(j);
                if (A002 == null) {
                    return null;
                }
            }
            return ((C10290Rpo) A002.A01).A00;
        }
        return obj2;
    }

    private final Object A01(Class cls, Object obj, Object obj2) {
        if (cls.isInstance(obj)) {
            return obj;
        }
        if (obj != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported value type: ");
            sb.append(obj.getClass().getSimpleName());
            sb.append(" for expected type: ");
            sb.append(cls);
            sb.append(" on model with styleId: ");
            sb.append(this.A04);
            1Kn.A02("BloksModel", sb.toString());
        }
        return obj2;
    }

    public final int A03(int i, int i2) {
        Object A002 = A00(this, i);
        if (A002 instanceof String) {
            try {
                return Integer.parseInt((String) A002);
            } catch (NumberFormatException unused) {
                1Kn.A02("BloksModel", "Non-int string parsed as int");
                return i2;
            }
        } else {
            Object A012 = A01(Number.class, A002, Integer.valueOf(i2));
            0Sd.A00(A012);
            return ((Number) A012).intValue();
        }
    }

    public final long A04(int i, long j) {
        Object A002 = A00(this, i);
        if (A002 instanceof String) {
            try {
                return Long.parseLong((String) A002);
            } catch (NumberFormatException unused) {
                1Kn.A02("BloksModel", "Non-long string parsed as long");
                return j;
            }
        } else {
            Object A012 = A01(Number.class, A002, Long.valueOf(j));
            0Sd.A00(A012);
            return ((Number) A012).longValue();
        }
    }

    public final C276544tV A07(int i) {
        Object A002 = A00(this, i);
        if (A002 instanceof List) {
            List A0M = A0M(i);
            if (A0M.isEmpty()) {
                return null;
            }
            A002 = A0M.get(0);
        } else if (!(A002 instanceof C276544tV)) {
            return null;
        }
        return (C276544tV) A002;
    }

    public final String A0K(int i) {
        return (String) A01(String.class, A00(this, i), (Object) null);
    }

    public final List A0L() {
        return A0M(C64361Kj.A00().A08.A00(this));
    }

    public final List A0M(int i) {
        Object A002 = A00(this, i);
        if (A002 instanceof C276544tV) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(A002);
            return arrayList;
        }
        Object A012 = A01(List.class, A002, Collections.emptyList());
        0Sd.A00(A012);
        return (List) A012;
    }

    public final boolean A0R(int i, boolean z) {
        Object A002 = A00(this, i);
        if (A002 == null) {
            return z;
        }
        if (A002 instanceof Boolean) {
            return ((Boolean) A002).booleanValue();
        }
        if (!(A002 instanceof Number)) {
            1Kn.A02("ParseUtils", "Attempting to extract boolean value from unrecognized value type");
            return z;
        } else if (((Number) A002).intValue() != 1) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean A0S(C13669Ted ted) {
        if (!ted.FN7(this)) {
            AnonymousClass1KX A032 = C64361Kj.A00().A03();
            int i = this.A04;
            int[] A012 = A032.A01(i);
            int i2 = 0;
            while (i2 < A012.length) {
                C276544tV A072 = A07(A012[i2]);
                if (A072 == null || !A072.A0S(ted)) {
                    i2++;
                }
            }
            int[] A002 = C64361Kj.A00().A03().A00(i);
            for (int A0M : A002) {
                List A0M2 = A0M(A0M);
                for (int i3 = 0; i3 < A0M2.size(); i3++) {
                    C276544tV r0 = (C276544tV) A0M2.get(i3);
                    if (r0 != null && r0.A0S(ted)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C276544tV(List list, int i, int i2) {
        this.A06 = new C276594ta(new C276584tZ(this));
        this.A08 = null;
        this.A05 = new SparseArray(i2 + 1);
        this.A04 = i;
        this.A03 = C276604tb.A00.incrementAndGet();
        this.A09 = list;
        this.A07 = null;
        this.A01 = null;
        C276614tc.A04.incrementAndGet();
    }

    public C276544tV(C276634te r3, C276544tV r4, C276544tV r5, List list, int i) {
        this.A06 = new C276594ta(new C276584tZ(this));
        this.A08 = r4.A08;
        this.A05 = r4.A05.clone();
        this.A04 = r4.A04;
        this.A03 = i;
        this.A09 = list;
        this.A07 = r5;
        this.A01 = r3;
        this.A00 = r4.A00;
        this.A02 = r4.A02;
        C276614tc.A04.incrementAndGet();
    }

    public C276544tV(C276544tV r3, C7304Q3g q3g) {
        this.A06 = new C276594ta(new C276584tZ(this));
        LinkedList linkedList = r3.A08;
        linkedList = linkedList == null ? new LinkedList() : linkedList;
        this.A08 = linkedList;
        linkedList.addFirst(q3g);
        this.A05 = r3.A05;
        this.A04 = r3.A04;
        this.A03 = r3.A03;
        this.A09 = r3.A09;
        C276544tV r0 = r3.A07;
        this.A07 = r0 == null ? null : r0;
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        this.A02 = r3.A02;
        C276614tc.A04.incrementAndGet();
    }
}
