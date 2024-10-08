package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: X.3Lu  reason: invalid class name and case insensitive filesystem */
public final class C240673Lu implements Runnable {
    public static Comparator A04 = new C240683Lv();
    public static final ThreadLocal A05 = new ThreadLocal();
    public long A00;
    public long A01;
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();

    public static C249703kE A00(RecyclerView recyclerView, int i, long j) {
        C238053Aj r4 = recyclerView.A08;
        int A042 = r4.A04();
        for (int i2 = 0; i2 < A042; i2++) {
            C249703kE A06 = RecyclerView.A06(r4.A07(i2));
            if (A06.mPosition == i && !A06.isInvalid()) {
                return null;
            }
        }
        AnonymousClass3AN r2 = recyclerView.A0y;
        try {
            recyclerView.A01++;
            C249703kE A052 = r2.A05(i, j);
            if (A052 != null) {
                if (!A052.isBound() || A052.isInvalid()) {
                    r2.A0E(A052, false);
                } else {
                    r2.A0A(A052.itemView);
                }
            }
            return A052;
        } finally {
            recyclerView.A18(false);
        }
    }

    public final void A01(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.A0T) {
            if (RecyclerView.A1C && !this.A02.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            } else if (this.A01 == 0) {
                this.A01 = System.nanoTime();
                recyclerView.post(this);
            }
        }
        AnonymousClass3AU r0 = recyclerView.A09;
        r0.A01 = i;
        r0.A02 = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.5ir} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: X.5ir} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: X.5ir} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r2 = 0
            r6 = r18
            java.lang.String r1 = "RV Prefetch"
            r0 = -966120296(0xffffffffc66a2c98, float:-14987.148)
            X.0ff.A01(r1, r0)     // Catch:{ all -> 0x0199 }
            java.util.ArrayList r12 = r6.A02     // Catch:{ all -> 0x0199 }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x0016
            goto L_0x0190
        L_0x0016:
            int r8 = r12.size()     // Catch:{ all -> 0x0199 }
            r7 = 0
            r4 = 0
        L_0x001d:
            if (r7 >= r8) goto L_0x0036
            java.lang.Object r1 = r12.get(r7)     // Catch:{ all -> 0x0199 }
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1     // Catch:{ all -> 0x0199 }
            int r0 = r1.getWindowVisibility()     // Catch:{ all -> 0x0199 }
            if (r0 != 0) goto L_0x0033
            long r0 = r1.getDrawingTime()     // Catch:{ all -> 0x0199 }
            long r4 = java.lang.Math.max(r0, r4)     // Catch:{ all -> 0x0199 }
        L_0x0033:
            int r7 = r7 + 1
            goto L_0x001d
        L_0x0036:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0041
            r6.A01 = r2
            r0 = 583900495(0x22cd9d4f, float:5.573192E-18)
            goto L_0x0195
        L_0x0041:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0199 }
            long r4 = r0.toNanos(r4)     // Catch:{ all -> 0x0199 }
            long r0 = r6.A00     // Catch:{ all -> 0x0199 }
            long r4 = r4 + r0
            int r17 = r12.size()     // Catch:{ all -> 0x0199 }
            r11 = 0
            r7 = 0
            r8 = 0
        L_0x0051:
            r0 = r17
            if (r7 >= r0) goto L_0x006c
            java.lang.Object r1 = r12.get(r7)     // Catch:{ all -> 0x0199 }
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1     // Catch:{ all -> 0x0199 }
            int r0 = r1.getWindowVisibility()     // Catch:{ all -> 0x0199 }
            if (r0 != 0) goto L_0x0069
            X.3AU r0 = r1.A09     // Catch:{ all -> 0x0199 }
            r0.A00(r1, r11)     // Catch:{ all -> 0x0199 }
            int r0 = r0.A00     // Catch:{ all -> 0x0199 }
            int r8 = r8 + r0
        L_0x0069:
            int r7 = r7 + 1
            goto L_0x0051
        L_0x006c:
            java.util.ArrayList r7 = r6.A03     // Catch:{ all -> 0x0199 }
            r7.ensureCapacity(r8)     // Catch:{ all -> 0x0199 }
            r13 = 0
        L_0x0072:
            r0 = r17
            if (r11 >= r0) goto L_0x00cd
            java.lang.Object r14 = r12.get(r11)     // Catch:{ all -> 0x0199 }
            androidx.recyclerview.widget.RecyclerView r14 = (androidx.recyclerview.widget.RecyclerView) r14     // Catch:{ all -> 0x0199 }
            int r0 = r14.getWindowVisibility()     // Catch:{ all -> 0x0199 }
            if (r0 != 0) goto L_0x00ca
            X.3AU r10 = r14.A09     // Catch:{ all -> 0x0199 }
            int r0 = r10.A01     // Catch:{ all -> 0x0199 }
            int r9 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0199 }
            int r0 = r10.A02     // Catch:{ all -> 0x0199 }
            int r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0199 }
            int r9 = r9 + r0
            r8 = 0
        L_0x0092:
            int r0 = r10.A00     // Catch:{ all -> 0x0199 }
            int r0 = r0 * 2
            if (r8 >= r0) goto L_0x00ca
            int r0 = r7.size()     // Catch:{ all -> 0x0199 }
            if (r13 < r0) goto L_0x00c3
            X.5ir r1 = new X.5ir     // Catch:{ all -> 0x0199 }
            r1.<init>()     // Catch:{ all -> 0x0199 }
            r7.add(r1)     // Catch:{ all -> 0x0199 }
        L_0x00a6:
            int[] r0 = r10.A03     // Catch:{ all -> 0x0199 }
            r16 = r0
            int r0 = r8 + 1
            r15 = r16[r0]     // Catch:{ all -> 0x0199 }
            r0 = 0
            if (r15 > r9) goto L_0x00b2
            r0 = 1
        L_0x00b2:
            r1.A04 = r0     // Catch:{ all -> 0x0199 }
            r1.A02 = r9     // Catch:{ all -> 0x0199 }
            r1.A00 = r15     // Catch:{ all -> 0x0199 }
            r1.A03 = r14     // Catch:{ all -> 0x0199 }
            r0 = r16[r8]     // Catch:{ all -> 0x0199 }
            r1.A01 = r0     // Catch:{ all -> 0x0199 }
            int r13 = r13 + 1
            int r8 = r8 + 2
            goto L_0x0092
        L_0x00c3:
            java.lang.Object r1 = r7.get(r13)     // Catch:{ all -> 0x0199 }
            X.5ir r1 = (X.C292385ir) r1     // Catch:{ all -> 0x0199 }
            goto L_0x00a6
        L_0x00ca:
            int r11 = r11 + 1
            goto L_0x0072
        L_0x00cd:
            java.util.Comparator r0 = A04     // Catch:{ all -> 0x0199 }
            java.util.Collections.sort(r7, r0)     // Catch:{ all -> 0x0199 }
            r9 = 0
        L_0x00d3:
            int r0 = r7.size()     // Catch:{ all -> 0x0199 }
            if (r9 >= r0) goto L_0x018a
            java.lang.Object r8 = r7.get(r9)     // Catch:{ all -> 0x0199 }
            X.5ir r8 = (X.C292385ir) r8     // Catch:{ all -> 0x0199 }
            androidx.recyclerview.widget.RecyclerView r0 = r8.A03     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x018a
            boolean r0 = r8.A04     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x00ed
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00ee
        L_0x00ed:
            r0 = r4
        L_0x00ee:
            androidx.recyclerview.widget.RecyclerView r11 = r8.A03     // Catch:{ all -> 0x0199 }
            int r10 = r8.A01     // Catch:{ all -> 0x0199 }
            X.3kE r10 = A00(r11, r10, r0)     // Catch:{ all -> 0x0199 }
            if (r10 == 0) goto L_0x0172
            java.lang.ref.WeakReference r1 = r10.mNestedRecyclerView     // Catch:{ all -> 0x0199 }
            if (r1 == 0) goto L_0x0172
            boolean r0 = r10.isBound()     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x0172
            boolean r0 = r10.isInvalid()     // Catch:{ all -> 0x0199 }
            if (r0 != 0) goto L_0x0172
            java.lang.Object r11 = r1.get()     // Catch:{ all -> 0x0199 }
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11     // Catch:{ all -> 0x0199 }
            if (r11 == 0) goto L_0x0172
            boolean r0 = r11.A0P     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x0136
            X.3Aj r0 = r11.A08     // Catch:{ all -> 0x0199 }
            int r0 = r0.A04()     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x0136
            X.3AS r0 = r11.A0C     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x0123
            r0.A0I()     // Catch:{ all -> 0x0199 }
        L_0x0123:
            X.3pI r0 = r11.A0D     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x0131
            X.3AN r1 = r11.A0y     // Catch:{ all -> 0x0199 }
            r0.A0o(r1)     // Catch:{ all -> 0x0199 }
            X.3pI r0 = r11.A0D     // Catch:{ all -> 0x0199 }
            r0.A0p(r1)     // Catch:{ all -> 0x0199 }
        L_0x0131:
            X.3AN r0 = r11.A0y     // Catch:{ all -> 0x0199 }
            r0.A06()     // Catch:{ all -> 0x0199 }
        L_0x0136:
            X.3AU r10 = r11.A09     // Catch:{ all -> 0x0199 }
            r12 = 1
            r10.A00(r11, r12)     // Catch:{ all -> 0x0199 }
            int r0 = r10.A00     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x0172
            java.lang.String r1 = "RV Nested Prefetch"
            r0 = -1882727927(0xffffffff8fc7da09, float:-1.9706899E-29)
            X.0ff.A01(r1, r0)     // Catch:{ all -> 0x0182 }
            X.3AW r1 = r11.mState     // Catch:{ all -> 0x0182 }
            X.2Rw r0 = r11.A0A     // Catch:{ all -> 0x0182 }
            r1.A04 = r12     // Catch:{ all -> 0x0182 }
            int r0 = r0.getItemCount()     // Catch:{ all -> 0x0182 }
            r1.A03 = r0     // Catch:{ all -> 0x0182 }
            r0 = 0
            r1.A08 = r0     // Catch:{ all -> 0x0182 }
            r1.A0D = r0     // Catch:{ all -> 0x0182 }
            r1.A09 = r0     // Catch:{ all -> 0x0182 }
            r1 = 0
        L_0x015c:
            int r0 = r10.A00     // Catch:{ all -> 0x0182 }
            int r0 = r0 * 2
            if (r1 >= r0) goto L_0x016c
            int[] r0 = r10.A03     // Catch:{ all -> 0x0182 }
            r0 = r0[r1]     // Catch:{ all -> 0x0182 }
            A00(r11, r0, r4)     // Catch:{ all -> 0x0182 }
            int r1 = r1 + 2
            goto L_0x015c
        L_0x016c:
            r0 = -839132815(0xffffffffcdfbd971, float:-5.28166432E8)
            X.0ff.A00(r0)     // Catch:{ all -> 0x0199 }
        L_0x0172:
            r1 = 0
            r8.A04 = r1     // Catch:{ all -> 0x0199 }
            r8.A02 = r1     // Catch:{ all -> 0x0199 }
            r8.A00 = r1     // Catch:{ all -> 0x0199 }
            r0 = 0
            r8.A03 = r0     // Catch:{ all -> 0x0199 }
            r8.A01 = r1     // Catch:{ all -> 0x0199 }
            int r9 = r9 + 1
            goto L_0x00d3
        L_0x0182:
            r1 = move-exception
            r0 = -931095275(0xffffffffc8809d15, float:-263400.66)
            X.0ff.A00(r0)     // Catch:{ all -> 0x0199 }
            throw r1     // Catch:{ all -> 0x0199 }
        L_0x018a:
            r6.A01 = r2
            r0 = 1577108253(0x5e00c31d, float:2.31957289E18)
            goto L_0x0195
        L_0x0190:
            r6.A01 = r2
            r0 = 264918373(0xfca5565, float:1.995163E-29)
        L_0x0195:
            X.0ff.A00(r0)
            return
        L_0x0199:
            r1 = move-exception
            r6.A01 = r2
            r0 = 679703661(0x2883746d, float:1.4594413E-14)
            X.0ff.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C240673Lu.run():void");
    }
}
