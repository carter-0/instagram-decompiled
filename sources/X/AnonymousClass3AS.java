package X;

import java.util.ArrayList;

/* renamed from: X.3AS  reason: invalid class name */
public abstract class AnonymousClass3AS {
    public long A00 = 120;
    public long A01 = 250;
    public long A02 = 250;
    public long A03 = 120;
    public AnonymousClass3AY A04 = null;
    public ArrayList A05 = new ArrayList();

    public void A0B(C249703kE r1) {
    }

    public boolean A0D(C241463Ph r9, C241463Ph r10, C249703kE r11) {
        AnonymousClass3AR r2 = (AnonymousClass3AR) this;
        int i = r9.A00;
        int i2 = r10.A00;
        C249703kE r3 = r11;
        if (i != i2 || r9.A01 != r10.A01) {
            return r2.A0T(r3, i, r9.A01, i2, r10.A01);
        }
        r2.A0P(r11);
        return false;
    }

    public abstract boolean A0E(C241463Ph r1, C241463Ph r2, C249703kE r3);

    public abstract boolean A0F(C241463Ph r1, C241463Ph r2, C249703kE r3);

    public abstract boolean A0G(C241463Ph r1, C241463Ph r2, C249703kE r3, C249703kE r4);

    public boolean A0H(C249703kE r3) {
        if (!((AnonymousClass3AR) this).A00 || r3.isInvalid()) {
            return true;
        }
        return false;
    }

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K(C249703kE r1);

    public abstract boolean A0L();

    public static void A04(C249703kE r2) {
        int i = r2.mFlags & 14;
        if (!r2.isInvalid() && (i & 4) == 0) {
            r2.getAbsoluteAdapterPosition();
        }
    }

    public long A06() {
        return this.A00;
    }

    public long A07() {
        return this.A01;
    }

    public long A08() {
        return this.A02;
    }

    public long A09() {
        return this.A03;
    }

    public final void A0A() {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C74289PsH) arrayList.get(i)).CvT();
        }
        arrayList.clear();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.C249703kE r9) {
        /*
            r8 = this;
            r8.A0B(r9)
            X.3AY r3 = r8.A04
            if (r3 == 0) goto L_0x009f
            X.3AX r3 = (X.AnonymousClass3AX) r3
            r2 = 1
            r9.setIsRecyclable(r2)
            X.3kE r0 = r9.mShadowedHolder
            r1 = 0
            if (r0 == 0) goto L_0x0018
            X.3kE r0 = r9.mShadowingHolder
            if (r0 != 0) goto L_0x0018
            r9.mShadowedHolder = r1
        L_0x0018:
            r9.mShadowingHolder = r1
            boolean r0 = r9.shouldBeKeptAsChild()
            if (r0 != 0) goto L_0x009f
            androidx.recyclerview.widget.RecyclerView r5 = r3.A00
            android.view.View r6 = r9.itemView
            r5.A0k()
            X.3Aj r7 = r5.A08
            int r1 = r7.A00
            r4 = 0
            if (r1 != r2) goto L_0x003a
            android.view.View r0 = r7.A01
            if (r0 == r6) goto L_0x0070
            java.lang.String r1 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x003a:
            r0 = 2
            if (r1 == r0) goto L_0x0076
            r7.A00 = r0     // Catch:{ all -> 0x0072 }
            X.3Ai r0 = r7.A03     // Catch:{ all -> 0x0072 }
            X.3Ah r0 = (X.C238043Ah) r0     // Catch:{ all -> 0x0072 }
            androidx.recyclerview.widget.RecyclerView r3 = r0.A00     // Catch:{ all -> 0x0072 }
            int r2 = r3.indexOfChild(r6)     // Catch:{ all -> 0x0072 }
            r0 = -1
            if (r2 != r0) goto L_0x0050
            X.C238053Aj.A02(r6, r7)     // Catch:{ all -> 0x0072 }
            goto L_0x007e
        L_0x0050:
            X.3Ak r1 = r7.A02     // Catch:{ all -> 0x0072 }
            boolean r0 = r1.A06(r2)     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x006e
            r1.A07(r2)     // Catch:{ all -> 0x0072 }
            X.C238053Aj.A02(r6, r7)     // Catch:{ all -> 0x0072 }
            android.view.View r0 = r3.getChildAt(r2)     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x006a
            r3.A0y(r0)     // Catch:{ all -> 0x0072 }
            r0.clearAnimation()     // Catch:{ all -> 0x0072 }
        L_0x006a:
            r3.removeViewAt(r2)     // Catch:{ all -> 0x0072 }
            goto L_0x007e
        L_0x006e:
            r7.A00 = r4
        L_0x0070:
            r2 = 0
            goto L_0x008d
        L_0x0072:
            r0 = move-exception
            r7.A00 = r4
            throw r0
        L_0x0076:
            java.lang.String r1 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x007e:
            r7.A00 = r4
            r2 = 1
            X.3kE r1 = androidx.recyclerview.widget.RecyclerView.A06(r6)
            X.3AN r0 = r5.A0y
            r0.A0D(r1)
            r0.A0C(r1)
        L_0x008d:
            r0 = r2 ^ 1
            r5.A1A(r0)
            if (r2 != 0) goto L_0x009f
            boolean r0 = r9.isTmpDetached()
            if (r0 == 0) goto L_0x009f
            android.view.View r0 = r9.itemView
            r5.removeDetachedView(r0, r4)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AS.A0C(X.3kE):void");
    }
}
