package X;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: X.Mh3  reason: case insensitive filesystem */
public final class C67030Mh3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ WeakReference A00;
    public final /* synthetic */ WeakReference A01;
    public final /* synthetic */ WeakReference A02;
    public final /* synthetic */ WeakReference A03;
    public final /* synthetic */ boolean A04;

    public C67030Mh3(WeakReference weakReference, WeakReference weakReference2, WeakReference weakReference3, WeakReference weakReference4, boolean z) {
        this.A03 = weakReference;
        this.A02 = weakReference2;
        this.A01 = weakReference3;
        this.A04 = z;
        this.A00 = weakReference4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGlobalLayout() {
        /*
            r11 = this;
            java.lang.ref.WeakReference r0 = r11.A03
            java.lang.Object r9 = r0.get()
            X.MhK r9 = (X.C67047MhK) r9
            r1 = 1
            r10 = 0
            if (r9 == 0) goto L_0x0049
            boolean r0 = r9.A03
            if (r0 != r1) goto L_0x0049
            java.lang.ref.WeakReference r0 = r11.A02
            java.lang.Object r0 = r0.get()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r8 = 0
            if (r0 == 0) goto L_0x001d
            X.2Rw r8 = r0.A0A
        L_0x001d:
            boolean r0 = r8 instanceof X.AnonymousClass2t9
            if (r0 == 0) goto L_0x0049
            X.2t9 r8 = (X.AnonymousClass2t9) r8
            if (r8 == 0) goto L_0x0049
            java.lang.ref.WeakReference r0 = r11.A01
            java.lang.Object r7 = r0.get()
            X.Mku r7 = (X.C67260Mku) r7
            if (r7 == 0) goto L_0x0049
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x005c
            X.2tH r0 = r8.A04
            java.util.List r1 = r0.Au8()
            X.0qQ.A07(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x004a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x004a
        L_0x0046:
            r7.A01(r10, r10, r10)
        L_0x0049:
            return
        L_0x004a:
            java.util.Iterator r1 = r1.iterator()
        L_0x004e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C66702Mb9
            if (r0 == 0) goto L_0x004e
        L_0x005c:
            int r1 = r8.getItemCount()
            java.lang.ref.WeakReference r0 = r11.A00
            java.lang.Object r0 = r0.get()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            if (r0 == 0) goto L_0x0046
            int r6 = r0.A1a()
            int r5 = r0.A1b()
            if (r6 < 0) goto L_0x0046
            if (r5 < 0) goto L_0x0046
            if (r6 >= r1) goto L_0x0046
            if (r5 >= r1) goto L_0x0046
            r4 = 0
            r3 = 0
            if (r6 > r5) goto L_0x00ac
        L_0x007e:
            X.2tH r0 = r8.A04
            java.util.List r0 = r0.Au8()
            X.0qQ.A07(r0)
            java.lang.Object r2 = X.00k.A0O(r0, r6)
            boolean r0 = r2 instanceof X.C66702Mb9
            if (r0 == 0) goto L_0x009b
            X.Mb9 r2 = (X.C66702Mb9) r2
            if (r2 == 0) goto L_0x009b
            X.3tH r1 = r2.A0E
            X.3tH r0 = X.C254923tH.ACT
            if (r1 == r0) goto L_0x00a0
            int r4 = r4 + 1
        L_0x009b:
            if (r6 == r5) goto L_0x00a9
            int r6 = r6 + 1
            goto L_0x007e
        L_0x00a0:
            int r10 = r10 + 1
            boolean r0 = r2.A0V
            if (r0 == 0) goto L_0x009b
            int r3 = r3 + 1
            goto L_0x009b
        L_0x00a9:
            r0 = r10
            r10 = r4
            r4 = r0
        L_0x00ac:
            boolean r0 = r7.A01(r10, r4, r3)
            if (r0 == 0) goto L_0x0049
            r9.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67030Mh3.onGlobalLayout():void");
    }
}
