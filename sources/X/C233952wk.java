package X;

import android.content.Context;
import android.os.Message;
import android.widget.Adapter;

/* renamed from: X.2wk  reason: invalid class name and case insensitive filesystem */
public abstract class C233952wk {
    public int A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A01 = Integer.MAX_VALUE;
    public final int A02;

    public static final Object A00(Adapter adapter, int i) {
        if (i < 0 || i >= adapter.getCount()) {
            return null;
        }
        return adapter.getItem(i);
    }

    public void A01(Adapter adapter, int i) {
        if (this instanceof C233962wl) {
            C233962wl r3 = (C233962wl) this;
            if (i >= 0) {
                C231332rR r1 = r3.A02;
                if (i < r1.getCount() && (r1.getItem(i) instanceof 1Xj)) {
                    1Xj r7 = (1Xj) r1.getItem(i);
                    AnonymousClass3W1 BQr = r1.BQr(r7);
                    C233922wh r8 = r3.A01;
                    int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                    0Pl r2 = r8.A03;
                    Context context = r3.A00;
                    boolean z = BQr.A1q;
                    boolean A0L = 1sx.A0L(r7, BQr.A03);
                    boolean z2 = false;
                    if (BQr.A3b.A00 == AnonymousClass3W9.Translated) {
                        z2 = true;
                    }
                    int i3 = 0;
                    if (A0L) {
                        i3 = 1 << 0;
                    }
                    if (z) {
                        i3 |= 1 << 1;
                    }
                    if (z2) {
                        i3 |= 1 << 2;
                    }
                    1sy r4 = BQr.A0o;
                    String moduleName = r8.A02.getModuleName();
                    0qQ.A0B(r7, 1);
                    0qQ.A0B(moduleName, 4);
                    AnonymousClass0s8 r22 = r2.A0L;
                    Message obtainMessage = r22.obtainMessage(2, new C292485j2(context, r7, r4, moduleName));
                    0qQ.A07(obtainMessage);
                    obtainMessage.arg1 = i3;
                    r22.A00(obtainMessage);
                    return;
                }
                return;
            }
            return;
        }
        C233932wi r0 = (C233932wi) this;
        C233922wh.A00(r0.A00, adapter, r0.A01, i);
    }

    public final void A02(Adapter adapter, int i) {
        int i2;
        if (this instanceof C233942wj) {
            C233942wj r5 = (C233942wj) this;
            r5.A01 = Integer.MAX_VALUE;
            int max = Math.max(i, r5.A00);
            Object A002 = A00(adapter, max);
            int i3 = i + 1;
            int i4 = 0;
            while (i4 < r5.A02 && i3 < adapter.getCount()) {
                if (r5.A04(adapter, i3) && A002 != A00(adapter, i3)) {
                    if (i3 > max) {
                        r5.A01(adapter, i3);
                        A002 = adapter.getItem(i3);
                    }
                    r5.A00 = i3;
                    i4++;
                }
                i3++;
            }
            return;
        }
        this.A01 = Integer.MAX_VALUE;
        boolean z = true;
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.A02 && (i2 = i + i6) < adapter.getCount()) {
            if (A00(adapter, i2) != A00(adapter, i2 - 1)) {
                i5++;
            }
            i6++;
        }
        int i7 = i + i6;
        for (int max2 = Math.max(i, this.A00) + 1; max2 <= i7; max2++) {
            if (z || A00(adapter, max2) != A00(adapter, max2 - 1)) {
                if (max2 >= 0 && max2 < adapter.getCount()) {
                    A01(adapter, max2);
                }
                z = false;
            }
        }
        this.A00 = i7;
    }

    public final void A03(Adapter adapter, int i) {
        int i2;
        if (this instanceof C233942wj) {
            C233942wj r5 = (C233942wj) this;
            r5.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
            int min = Math.min(i, r5.A01);
            Object A002 = A00(adapter, min);
            int i3 = i - 1;
            int i4 = 0;
            while (i4 < r5.A02 && i3 >= 0) {
                if (i3 < adapter.getCount() && r5.A04(adapter, i3) && A002 != A00(adapter, i3)) {
                    if (i3 < min) {
                        r5.A01(adapter, i3);
                        A002 = A00(adapter, i3);
                    }
                    r5.A01 = i3;
                    i4++;
                }
                i3--;
            }
            return;
        }
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        boolean z = true;
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.A02 && (i2 = i - i6) >= 0) {
            if (A00(adapter, i2) != A00(adapter, i2 + 1)) {
                i5++;
            }
            i6++;
        }
        int i7 = i - i6;
        for (int min2 = Math.min(i, this.A01) - 1; min2 >= i7; min2--) {
            if (z || A00(adapter, min2) != A00(adapter, min2 + 1)) {
                if (min2 >= 0 && min2 < adapter.getCount()) {
                    A01(adapter, min2);
                }
                z = false;
            }
        }
        this.A01 = i7;
    }

    public C233952wk(int i) {
        this.A02 = i;
    }
}
