package com.facebook.common.staggeredgrid;

import X.00k;
import X.0qQ;
import X.0sr;
import X.AnonymousClass00P;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import X.AnonymousClass3MX;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C15048ULb;
import X.C249703kE;
import X.C252553pI;
import X.C61065Jw3;
import X.C66580MXl;
import X.C66581MXm;
import X.C73279PZx;
import X.G9w;
import android.content.Context;
import android.graphics.Rect;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class HorizontalStaggeredLayoutManager extends C252553pI {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public RecyclerView A07;
    public final SparseArray A08 = new SparseArray();
    public final C61065Jw3 A09;
    public final ConcurrentMap A0A;
    public final Context A0B;
    public final LruCache A0C = new LruCache(100);

    public final AnonymousClass3MX A0Z() {
        return new AnonymousClass3MX(-2, -2);
    }

    public final int A1K(AnonymousClass3AN r4, AnonymousClass3AW r5, int i) {
        0qQ.A0B(r4, 1);
        int i2 = this.A00;
        int i3 = i2 + i;
        if (i3 < i2) {
            this.A03 = 0;
        }
        this.A00 = i3;
        int i4 = (this.A01 + this.A09.A00) - this.A03;
        if (i3 < 0) {
            i4 = 0;
        } else {
            if (i3 <= i4) {
                i4 = i3;
            }
            if (i4 < i3) {
                this.A03 = 0;
            }
        }
        this.A00 = i4;
        A01(r4, r5);
        return i;
    }

    public final boolean A1X() {
        return true;
    }

    public final boolean A1Y() {
        return false;
    }

    private final C15048ULb A00(int i) {
        Object obj;
        if (this.A04 == 0) {
            return null;
        }
        SparseArray sparseArray = this.A08;
        if (i < sparseArray.size()) {
            obj = sparseArray.get(i);
        } else {
            LruCache lruCache = this.A0C;
            Integer valueOf = Integer.valueOf(i);
            if (lruCache.get(valueOf) != null) {
                obj = lruCache.get(valueOf);
            } else {
                C15048ULb uLb = (C15048ULb) sparseArray.get(i % this.A04);
                C15048ULb A002 = A00(i - this.A05);
                if (A002 == null) {
                    return null;
                }
                int i2 = A002.A02 + this.A09.A00;
                C15048ULb uLb2 = new C15048ULb(i2, uLb.A03, (uLb.A02 - uLb.A01) + i2, uLb.A00, 0);
                lruCache.put(valueOf, uLb2);
                return uLb2;
            }
        }
        return (C15048ULb) obj;
    }

    private final void A01(AnonymousClass3AN r18, AnonymousClass3AW r19) {
        int i;
        int A0U;
        int i2;
        int A0U2;
        int i3;
        int i4;
        if (A0U() != 0 && (i = this.A05) != 0) {
            AnonymousClass3AN r2 = r18;
            A0n(r2);
            if (r19 != null) {
                A0U = r19.A00();
            } else {
                A0U = A0U();
            }
            if (this.A04 != A0U) {
                this.A04 = A0U;
                Integer[] numArr = new Integer[i];
                for (int i5 = 0; i5 < i; i5++) {
                    G9w.A1Z(numArr, 0, i5);
                }
                C61065Jw3 jw3 = this.A09;
                Iterator A10 = C66581MXm.A10((Iterable) jw3.A02, i);
                int i6 = 0;
                while (A10.hasNext()) {
                    Object next = A10.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    } else {
                        G9w.A1Z(numArr, AnonymousClass7TE.A0M(next), i6);
                        i6 = i7;
                    }
                }
                for (int i8 = 0; i8 < A0U; i8++) {
                    if (r19 != null) {
                        A0U2 = r19.A00();
                    } else {
                        A0U2 = A0U();
                    }
                    if (i8 < A0U2) {
                        try {
                            View A042 = r2.A04(i8);
                            if (A042 != null) {
                                A042.measure(0, 0);
                                i3 = A042.getMeasuredWidth();
                                i4 = A042.getMeasuredHeight();
                            }
                        } catch (IndexOutOfBoundsException unused) {
                        }
                    } else {
                        C15048ULb uLb = (C15048ULb) this.A08.get(i8 % A0U2);
                        i3 = uLb.A02 - uLb.A01;
                        i4 = uLb.A00 - uLb.A03;
                    }
                    int i9 = i8 % i;
                    int i10 = (i9 + 1) * jw3.A01;
                    int intValue = numArr[i9].intValue() + jw3.A00;
                    int i11 = i3 + intValue;
                    int i12 = (i9 * i4) + i10;
                    G9w.A1Z(numArr, i11, i9);
                    this.A08.put(i8, new C15048ULb(intValue, i12, i11, i12 + i4, 0));
                    int max = Math.max(this.A01, i11);
                    this.A01 = max;
                    if (A0U - i8 <= i) {
                        max = Math.min(this.A02, intValue);
                    }
                    this.A02 = max;
                }
            }
            int i13 = this.A00;
            int i14 = this.A02 - this.A03;
            if (i13 < i14) {
                i2 = 0;
            } else {
                i2 = i13 / i14;
            }
            int i15 = this.A03;
            SparseArray sparseArray = this.A08;
            int size = (i2 * sparseArray.size()) + sparseArray.size();
            while (true) {
                if (i15 < size) {
                    C15048ULb A002 = A00(i15);
                    if (A002 != null && A002.A02 >= this.A00) {
                        break;
                    }
                    i15++;
                } else {
                    i15 = 0;
                    break;
                }
            }
            this.A03 = i15;
            int i16 = size - 1;
            int i17 = i16;
            if (i15 <= i16) {
                while (true) {
                    C15048ULb A003 = A00(i17);
                    if (A003 != null && A003.A01 <= this.A00 + this.A03) {
                        i16 = i17;
                        break;
                    }
                    int i18 = i17;
                    i17--;
                    if (i18 == i15) {
                        break;
                    }
                }
            }
            int i19 = i + i16;
            if (i19 >= A0U()) {
                i19 = A0U();
            }
            Integer valueOf = Integer.valueOf(i15);
            Integer valueOf2 = Integer.valueOf(i19);
            int intValue2 = valueOf2.intValue();
            for (int intValue3 = valueOf.intValue(); intValue3 < intValue2; intValue3++) {
                View A043 = r2.A04(intValue3);
                0qQ.A07(A043);
                A0h(A043, -1);
                C15048ULb A004 = A00(intValue3);
                if (A004 != null) {
                    int i20 = A004.A01;
                    int i21 = i20 - this.A00;
                    int i22 = i21 + (A004.A02 - i20);
                    int i23 = A004.A03;
                    int i24 = (A004.A00 - i23) + i23;
                    boolean z = false;
                    float f = 0.0f;
                    if (intValue3 % i < this.A06) {
                        z = true;
                        f = 1.0f;
                    }
                    if (A043.getAlpha() != f) {
                        ConcurrentMap concurrentMap = this.A0A;
                        if (!0qQ.A0I((Float) concurrentMap.get(A043), f)) {
                            concurrentMap.put(A043, Float.valueOf(f));
                            C66580MXl.A1A(A043);
                            C66580MXl.A1D(C66581MXm.A0C(A043, f).setDuration(80), new C73279PZx(A043, this, z));
                        }
                    }
                    int i25 = A004.A02 - A004.A01;
                    int i26 = A004.A00 - A004.A03;
                    AnonymousClass3MX r14 = (AnonymousClass3MX) A043.getLayoutParams();
                    Rect A0T = this.A07.A0T(A043);
                    int i27 = i25 + A0T.left + A0T.right;
                    int i28 = i26 + A0T.top + A0T.bottom;
                    int A044 = C252553pI.A04(this.A03, this.A04, Ba9() + BaB() + i27, r14.width, A1X());
                    int A045 = C252553pI.A04(this.A00, this.A01, BaC() + Ba8() + i28, r14.height, A1Y());
                    if (A0z(A043, r14, A044, A045)) {
                        A043.measure(A044, A045);
                    }
                    C252553pI.A08(A043, i21, i23, i22, i24);
                }
            }
            List list = r2.A07;
            0qQ.A07(list);
            for (C249703kE r0 : 00k.A0a(list)) {
                r2.A0A(r0.itemView);
            }
        }
    }

    public final void A0u(RecyclerView recyclerView) {
        this.A0C.evictAll();
    }

    public HorizontalStaggeredLayoutManager(Context context, C61065Jw3 jw3, int i) {
        this.A0B = context;
        this.A09 = jw3;
        this.A05 = i;
        this.A06 = i;
        this.A0A = new ConcurrentHashMap();
    }

    public final void A0r(AnonymousClass3AN r6, AnonymousClass3AW r7, int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = 0;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            i3 = View.MeasureSpec.getSize(i2);
        } else {
            SparseArray sparseArray = this.A08;
            int i4 = this.A05 - 1;
            if (sparseArray.indexOfKey(i4) >= 0) {
                i3 = this.A09.A01 + ((C15048ULb) sparseArray.get(i4)).A00;
            }
        }
        this.A07.setMeasuredDimension(size, i3);
    }

    public final void A0s(AnonymousClass3AN r2, RecyclerView recyclerView) {
        A0u(recyclerView);
        this.A07 = null;
    }

    public final void A1O(int i) {
        super.A1O(i);
        if (i < this.A00) {
            this.A03 = 0;
        }
        this.A00 = i;
    }

    public final void A1R(AnonymousClass3AN r1, AnonymousClass3AW r2) {
        AnonymousClass7TG.A1N(r1, r2);
        A01(r1, r2);
    }

    public final void A1U(RecyclerView recyclerView) {
        this.A07 = recyclerView;
    }
}
