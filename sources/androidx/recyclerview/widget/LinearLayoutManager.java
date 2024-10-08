package androidx.recyclerview.widget;

import X.002;
import X.AnonymousClass0fD;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import X.AnonymousClass3B7;
import X.AnonymousClass3B9;
import X.AnonymousClass3BA;
import X.AnonymousClass3BB;
import X.AnonymousClass3MX;
import X.AnonymousClass52S;
import X.AnonymousClass972;
import X.C238093An;
import X.C240123Jr;
import X.C249703kE;
import X.C252553pI;
import X.C252563pJ;
import X.C252573pK;
import X.C266524Zi;
import X.C376409Hw;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends C252553pI implements C252563pJ, C252573pK {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C240123Jr A04;
    public SavedState A05;
    public AnonymousClass3BB A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public final AnonymousClass3B9 A0D;
    public final AnonymousClass3BA A0E;

    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C376409Hw(3);
        public int A00;
        public int A01;
        public boolean A02;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A02 ? 1 : 0);
        }
    }

    public static int A0J(LinearLayoutManager linearLayoutManager, AnonymousClass3AW r7) {
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        if (linearLayoutManager.A0T() == 0) {
            return 0;
        }
        linearLayoutManager.A1n();
        AnonymousClass3BB r3 = linearLayoutManager.A06;
        boolean z = linearLayoutManager.A0A;
        boolean z2 = !z;
        return C266524Zi.A00(linearLayoutManager2.A1m(z2), linearLayoutManager2.A1l(z2), r3, linearLayoutManager2, r7, z);
    }

    public static int A0K(LinearLayoutManager linearLayoutManager, AnonymousClass3AW r8) {
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        if (linearLayoutManager.A0T() == 0) {
            return 0;
        }
        linearLayoutManager.A1n();
        AnonymousClass3BB r3 = linearLayoutManager.A06;
        boolean z = linearLayoutManager.A0A;
        boolean z2 = !z;
        return C266524Zi.A02(linearLayoutManager.A1m(z2), linearLayoutManager.A1l(z2), r3, linearLayoutManager2, r8, z, linearLayoutManager.A09);
    }

    public static int A0L(LinearLayoutManager linearLayoutManager, AnonymousClass3AW r7) {
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        if (linearLayoutManager.A0T() == 0) {
            return 0;
        }
        linearLayoutManager.A1n();
        AnonymousClass3BB r3 = linearLayoutManager.A06;
        boolean z = linearLayoutManager.A0A;
        boolean z2 = !z;
        return C266524Zi.A01(linearLayoutManager2.A1m(z2), linearLayoutManager2.A1l(z2), r3, linearLayoutManager2, r7, z);
    }

    public boolean A1H() {
        return true;
    }

    public void A1S(AnonymousClass3AW r2) {
        this.A05 = null;
        this.A02 = -1;
        this.A03 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A0D.A00();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0046 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A1e(int r5) {
        /*
            r4 = this;
            r3 = -1
            r2 = 1
            if (r5 == r2) goto L_0x0037
            r0 = 2
            if (r5 == r0) goto L_0x0024
            r0 = 17
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r0) goto L_0x0042
            r0 = 33
            if (r5 == r0) goto L_0x001f
            r0 = 66
            if (r5 == r0) goto L_0x002f
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L_0x001a
            return r1
        L_0x001a:
            int r0 = r4.A01
            if (r0 != r2) goto L_0x0034
            return r2
        L_0x001f:
            int r0 = r4.A01
            if (r0 != r2) goto L_0x0047
            return r3
        L_0x0024:
            int r0 = r4.A01
            if (r0 == r2) goto L_0x0033
            boolean r0 = r4.A1u()
            if (r0 == 0) goto L_0x0033
            return r3
        L_0x002f:
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            return r2
        L_0x0034:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            return r2
        L_0x0037:
            int r0 = r4.A01
            if (r0 == r2) goto L_0x0046
            boolean r0 = r4.A1u()
            if (r0 == 0) goto L_0x0046
            return r2
        L_0x0042:
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0047
        L_0x0046:
            return r3
        L_0x0047:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1e(int):int");
    }

    public final View A1l(boolean z) {
        int A0T;
        int i;
        if (this.A09) {
            A0T = 0;
            i = A0T();
        } else {
            A0T = A0T() - 1;
            i = -1;
        }
        return A1j(A0T, i, z, true);
    }

    public final View A1m(boolean z) {
        int i;
        int A0T;
        if (this.A09) {
            i = A0T() - 1;
            A0T = -1;
        } else {
            i = 0;
            A0T = A0T();
        }
        return A1j(i, A0T, z, true);
    }

    public void A1q(AnonymousClass3B9 r1, AnonymousClass3AN r2, AnonymousClass3AW r3, int i) {
    }

    public void A1t(boolean z) {
        A1G((String) null);
        if (this.A0B != z) {
            this.A0B = z;
            A0b();
        }
    }

    private void A0M(int i, int i2) {
        this.A04.A00 = this.A06.A03() - i2;
        C240123Jr r3 = this.A04;
        int i3 = 1;
        if (this.A09) {
            i3 = -1;
        }
        r3.A03 = i3;
        r3.A01 = i;
        r3.A05 = 1;
        r3.A07 = i2;
        r3.A08 = AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    private void A0N(int i, int i2) {
        this.A04.A00 = i2 - this.A06.A06();
        C240123Jr r3 = this.A04;
        r3.A01 = i;
        int i3 = -1;
        if (this.A09) {
            i3 = 1;
        }
        r3.A03 = i3;
        r3.A05 = -1;
        r3.A07 = i2;
        r3.A08 = AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    private void A0O(C240123Jr r8, AnonymousClass3AN r9) {
        int i;
        int i2;
        if (r8.A0B && !r8.A0A) {
            int i3 = r8.A08;
            int i4 = r8.A06;
            if (r8.A05 == -1) {
                int A0T = A0T();
                if (i3 >= 0) {
                    int A022 = (this.A06.A02() - i3) + i4;
                    if (this.A09) {
                        i = 0;
                        i2 = 0;
                        while (i2 < A0T) {
                            View A0X = A0X(i2);
                            if (this.A06.A0D(A0X) >= A022 && this.A06.A0A(A0X) >= A022) {
                                i2++;
                            }
                        }
                        return;
                    }
                    i = A0T - 1;
                    int i5 = i;
                    while (i2 >= 0) {
                        View A0X2 = A0X(i2);
                        if (this.A06.A0D(A0X2) >= A022 && this.A06.A0A(A0X2) >= A022) {
                            i5 = i2 - 1;
                        }
                    }
                    return;
                }
                return;
            } else if (i3 >= 0) {
                int i6 = i3 - i4;
                int A0T2 = A0T();
                if (this.A09) {
                    i = A0T2 - 1;
                    int i7 = i;
                    while (i2 >= 0) {
                        View A0X3 = A0X(i2);
                        if (this.A06.A08(A0X3) <= i6 && this.A06.A09(A0X3) <= i6) {
                            i7 = i2 - 1;
                        }
                    }
                    return;
                }
                i = 0;
                int i8 = 0;
                while (i2 < A0T2) {
                    View A0X4 = A0X(i2);
                    if (this.A06.A08(A0X4) <= i6 && this.A06.A09(A0X4) <= i6) {
                        i8 = i2 + 1;
                    }
                }
                return;
            } else {
                return;
            }
            A0R(r9, i, i2);
        }
    }

    public static void A0P(LinearLayoutManager linearLayoutManager) {
        boolean z;
        if (linearLayoutManager.A01 == 1 || !linearLayoutManager.A1u()) {
            z = linearLayoutManager.A08;
        } else {
            z = !linearLayoutManager.A08;
        }
        linearLayoutManager.A09 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1.A02() != 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0Q(androidx.recyclerview.widget.LinearLayoutManager r6, X.AnonymousClass3AW r7, int r8, int r9, boolean r10) {
        /*
            X.3Jr r2 = r6.A04
            X.3BB r1 = r6.A06
            int r0 = r1.A05()
            if (r0 != 0) goto L_0x0011
            int r1 = r1.A02()
            r0 = 1
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r2.A0A = r0
            r2.A05 = r8
            int[] r1 = r6.A0C
            r4 = 0
            r1[r4] = r4
            r5 = 1
            r1[r5] = r4
            r6.A1s(r7, r1)
            r0 = r1[r4]
            int r3 = java.lang.Math.max(r4, r0)
            r0 = r1[r5]
            int r0 = java.lang.Math.max(r4, r0)
            if (r8 != r5) goto L_0x0030
            r4 = 1
        L_0x0030:
            X.3Jr r2 = r6.A04
            r1 = r3
            if (r4 == 0) goto L_0x0036
            r1 = r0
        L_0x0036:
            r2.A02 = r1
            if (r4 != 0) goto L_0x003b
            r3 = r0
        L_0x003b:
            r2.A06 = r3
            if (r4 == 0) goto L_0x008d
            X.3BB r0 = r6.A06
            int r0 = r0.A04()
            int r1 = r1 + r0
            r2.A02 = r1
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x0086
            r0 = 0
        L_0x004d:
            android.view.View r4 = r6.A0X(r0)
            X.3Jr r3 = r6.A04
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x0058
            r5 = -1
        L_0x0058:
            r3.A03 = r5
            int r2 = X.C252553pI.A06(r4)
            X.3Jr r1 = r6.A04
            int r0 = r1.A03
            int r2 = r2 + r0
            r3.A01 = r2
            X.3BB r0 = r6.A06
            int r0 = r0.A08(r4)
            r1.A07 = r0
            X.3BB r0 = r6.A06
            int r1 = r0.A08(r4)
            X.3BB r0 = r6.A06
            int r0 = r0.A03()
            int r1 = r1 - r0
        L_0x007a:
            X.3Jr r0 = r6.A04
            r0.A00 = r9
            if (r10 == 0) goto L_0x0083
            int r9 = r9 - r1
            r0.A00 = r9
        L_0x0083:
            r0.A08 = r1
            return
        L_0x0086:
            int r0 = r6.A0T()
            int r0 = r0 + -1
            goto L_0x004d
        L_0x008d:
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x00d3
            int r0 = r6.A0T()
            int r0 = r0 + -1
        L_0x0097:
            android.view.View r4 = r6.A0X(r0)
            X.3Jr r2 = r6.A04
            int r1 = r2.A02
            X.3BB r0 = r6.A06
            int r0 = r0.A06()
            int r1 = r1 + r0
            r2.A02 = r1
            X.3Jr r3 = r6.A04
            boolean r0 = r6.A09
            if (r0 != 0) goto L_0x00af
            r5 = -1
        L_0x00af:
            r3.A03 = r5
            int r2 = X.C252553pI.A06(r4)
            X.3Jr r1 = r6.A04
            int r0 = r1.A03
            int r2 = r2 + r0
            r3.A01 = r2
            X.3BB r0 = r6.A06
            int r0 = r0.A0D(r4)
            r1.A07 = r0
            X.3BB r0 = r6.A06
            int r0 = r0.A0D(r4)
            int r1 = -r0
            X.3BB r0 = r6.A06
            int r0 = r0.A06()
            int r1 = r1 + r0
            goto L_0x007a
        L_0x00d3:
            r0 = 0
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0Q(androidx.recyclerview.widget.LinearLayoutManager, X.3AW, int, int, boolean):void");
    }

    private void A0R(AnonymousClass3AN r1, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            while (true) {
                i2--;
                if (i2 >= i) {
                    A0q(r1, i2);
                } else {
                    return;
                }
            }
        } else {
            while (i > i2) {
                A0q(r1, i);
                i--;
            }
        }
    }

    public final void A1G(String str) {
        if (this.A05 == null) {
            super.A1G(str);
        }
    }

    public final boolean A1I() {
        if (this.A01 == 1073741824 || this.A04 == 1073741824) {
            return false;
        }
        int A0T = A0T();
        for (int i = 0; i < A0T; i++) {
            ViewGroup.LayoutParams layoutParams = A0X(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean A1J() {
        if (this.A05 == null && this.A07 == this.A0B) {
            return true;
        }
        return false;
    }

    public int A1K(AnonymousClass3AN r3, AnonymousClass3AW r4, int i) {
        if (this.A01 == 1) {
            return 0;
        }
        return A1g(r3, r4, i);
    }

    public int A1L(AnonymousClass3AN r2, AnonymousClass3AW r3, int i) {
        if (this.A01 == 0) {
            return 0;
        }
        return A1g(r2, r3, i);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.Parcelable, androidx.recyclerview.widget.LinearLayoutManager$SavedState, java.lang.Object] */
    public Parcelable A1M() {
        ? obj;
        int i;
        int i2;
        int A0T;
        SavedState savedState = this.A05;
        if (savedState != null) {
            obj.A01 = savedState.A01;
            obj.A00 = savedState.A00;
            obj.A02 = savedState.A02;
            return obj;
        }
        obj = new Object();
        if (A0T() > 0) {
            A1n();
            boolean z = this.A07;
            boolean z2 = this.A09;
            boolean z3 = z ^ z2;
            obj.A02 = z3;
            if (z3) {
                if (z2) {
                    A0T = 0;
                } else {
                    A0T = A0T() - 1;
                }
                View A0X = A0X(A0T);
                obj.A00 = this.A06.A03() - this.A06.A08(A0X);
                i = C252553pI.A06(A0X);
            } else {
                if (z2) {
                    i2 = A0T() - 1;
                } else {
                    i2 = 0;
                }
                View A0X2 = A0X(i2);
                obj.A01 = C252553pI.A06(A0X2);
                obj.A00 = this.A06.A0D(A0X2) - this.A06.A06();
                return obj;
            }
        } else {
            i = -1;
        }
        obj.A01 = i;
        return obj;
    }

    public void A1O(int i) {
        this.A02 = i;
        this.A03 = AnonymousClass972.MUTABLE_FLAG_MASK;
        SavedState savedState = this.A05;
        if (savedState != null) {
            savedState.A01 = -1;
        }
        A0b();
    }

    public void A1P(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.A05 = savedState;
            if (this.A02 != -1) {
                savedState.A01 = -1;
            }
            A0b();
        }
    }

    public boolean A1X() {
        if (this.A01 == 0) {
            return true;
        }
        return false;
    }

    public boolean A1Y() {
        if (this.A01 != 1) {
            return false;
        }
        return true;
    }

    public final int A1f(C240123Jr r8, AnonymousClass3AN r9, AnonymousClass3AW r10, boolean z) {
        int i;
        int i2 = r8.A00;
        int i3 = r8.A08;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                r8.A08 = i3 + i2;
            }
            A0O(r8, r9);
        }
        int i4 = r8.A00 + r8.A02;
        AnonymousClass3BA r2 = this.A0E;
        while (true) {
            if ((!r8.A0A && i4 <= 0) || (i = r8.A01) < 0 || i >= r10.A00()) {
                break;
            }
            r2.A00 = 0;
            r2.A01 = false;
            r2.A03 = false;
            r2.A02 = false;
            A1r(r2, r8, r9, r10);
            if (r2.A01) {
                break;
            }
            int i5 = r8.A07;
            int i6 = r2.A00;
            r8.A07 = i5 + (r8.A05 * i6);
            if (!r2.A03 || r8.A09 != null || !r10.A08) {
                r8.A00 -= i6;
                i4 -= i6;
            }
            int i7 = r8.A08;
            if (i7 != Integer.MIN_VALUE) {
                int i8 = i7 + i6;
                r8.A08 = i8;
                int i9 = r8.A00;
                if (i9 < 0) {
                    r8.A08 = i8 + i9;
                }
                A0O(r8, r9);
            }
            if (z && r2.A02) {
                break;
            }
        }
        return i2 - r8.A00;
    }

    @Deprecated
    public int A1h(AnonymousClass3AW r3) {
        if (r3.A06 != -1) {
            return this.A06.A07();
        }
        return 0;
    }

    public final void A1n() {
        if (this.A04 == null) {
            this.A04 = new C240123Jr();
        }
    }

    public final void A1o(int i) {
        if (i == 0 || i == 1) {
            A1G((String) null);
            if (i != this.A01 || this.A06 == null) {
                AnonymousClass3BB A002 = AnonymousClass3BB.A00(this, i);
                this.A06 = A002;
                this.A0D.A02 = A002;
                this.A01 = i;
                A0b();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(002.A0O("invalid orientation:", i));
    }

    public void A1p(int i, int i2) {
        this.A02 = i;
        this.A03 = i2;
        SavedState savedState = this.A05;
        if (savedState != null) {
            savedState.A01 = -1;
        }
        A0b();
    }

    public final boolean A1u() {
        if (this.A07.getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.3BA, java.lang.Object] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A01 = 1;
        this.A08 = false;
        this.A09 = false;
        this.A0B = false;
        this.A0A = true;
        this.A02 = -1;
        this.A03 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A05 = null;
        this.A0D = new AnonymousClass3B9();
        this.A0E = new Object();
        this.A00 = 2;
        this.A0C = new int[2];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C238093An.A00, i, i2);
        int i3 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.getInt(10, 1);
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        boolean z2 = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        A1o(i3);
        A1G((String) null);
        if (z != this.A08) {
            this.A08 = z;
            A0b();
        }
        A1t(z2);
    }

    public final View A1D(int i) {
        int A0T = A0T();
        if (A0T == 0) {
            return null;
        }
        int A062 = i - C252553pI.A06(A0X(0));
        if (A062 >= 0 && A062 < A0T) {
            View A0X = A0X(A062);
            if (C252553pI.A06(A0X) == i) {
                return A0X;
            }
        }
        return super.A1D(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (r6.A09 != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (r6.A09 != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1E(android.view.View r7, X.AnonymousClass3AN r8, X.AnonymousClass3AW r9, int r10) {
        /*
            r6 = this;
            A0P(r6)
            int r0 = r6.A0T()
            r5 = 0
            if (r0 == 0) goto L_0x007c
            int r4 = r6.A1e(r10)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r3) goto L_0x007c
            r6.A1n()
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            X.3BB r0 = r6.A06
            int r0 = r0.A07()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            r2 = 0
            A0Q(r6, r9, r4, r0, r2)
            X.3Jr r1 = r6.A04
            r1.A08 = r3
            r1.A0B = r2
            r0 = 1
            r6.A1f(r1, r8, r9, r0)
            r1 = -1
            boolean r0 = r6.A09
            if (r4 != r1) goto L_0x0060
            if (r0 == 0) goto L_0x0057
            int r0 = r6.A0T()
            int r0 = r0 + -1
            android.view.View r2 = r6.A1i(r0, r1)
        L_0x0040:
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x006e
        L_0x0044:
            int r0 = r6.A0T()
            int r0 = r0 + -1
        L_0x004a:
            android.view.View r1 = r6.A0X(r0)
            boolean r0 = r1.hasFocusable()
            if (r0 == 0) goto L_0x007b
            if (r2 == 0) goto L_0x007c
            return r1
        L_0x0057:
            int r0 = r6.A0T()
            android.view.View r2 = r6.A1i(r2, r0)
            goto L_0x0040
        L_0x0060:
            if (r0 == 0) goto L_0x0070
            int r0 = r6.A0T()
            android.view.View r2 = r6.A1i(r2, r0)
        L_0x006a:
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x0044
        L_0x006e:
            r0 = 0
            goto L_0x004a
        L_0x0070:
            int r0 = r6.A0T()
            int r0 = r0 + -1
            android.view.View r2 = r6.A1i(r0, r1)
            goto L_0x006a
        L_0x007b:
            return r2
        L_0x007c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1E(android.view.View, X.3AN, X.3AW, int):android.view.View");
    }

    public final void A1F(AccessibilityEvent accessibilityEvent) {
        super.A1F(accessibilityEvent);
        if (A0T() > 0) {
            accessibilityEvent.setFromIndex(A1a());
            accessibilityEvent.setToIndex(A1b());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03e6, code lost:
        if (r12 >= r1) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        if (r1.A02() != 0) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0181, code lost:
        if (r0 > 0) goto L_0x0183;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1R(X.AnonymousClass3AN r20, X.AnonymousClass3AW r21) {
        /*
            r19 = this;
            r0 = -210731910(0xfffffffff3707c7a, float:-1.9053283E31)
            int r18 = X.AnonymousClass0fD.A03(r0)
            r7 = r19
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r1 = r7.A05
            r8 = -1
            r6 = r20
            r5 = r21
            if (r1 != 0) goto L_0x0016
            int r0 = r7.A02
            if (r0 == r8) goto L_0x0028
        L_0x0016:
            int r0 = r5.A00()
            if (r0 != 0) goto L_0x0028
            r7.A0o(r6)
            r1 = -880097599(0xffffffffcb8ac6c1, float:-1.8189698E7)
        L_0x0022:
            r0 = r18
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0028:
            if (r1 == 0) goto L_0x0030
            int r0 = r1.A01
            if (r0 < 0) goto L_0x0030
            r7.A02 = r0
        L_0x0030:
            r7.A1n()
            X.3Jr r0 = r7.A04
            r4 = 0
            r0.A0B = r4
            A0P(r7)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            r3 = 0
            if (r0 == 0) goto L_0x0050
            android.view.View r1 = r0.getFocusedChild()
            if (r1 == 0) goto L_0x0050
            X.3Aj r0 = r7.A05
            java.util.List r0 = r0.A04
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0051
        L_0x0050:
            r1 = r3
        L_0x0051:
            X.3B9 r9 = r7.A0D
            boolean r0 = r9.A04
            r10 = 1
            if (r0 == 0) goto L_0x026c
            int r0 = r7.A02
            if (r0 != r8) goto L_0x026c
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r7.A05
            if (r0 != 0) goto L_0x026c
            if (r1 == 0) goto L_0x0085
            X.3BB r0 = r7.A06
            int r2 = r0.A0D(r1)
            X.3BB r0 = r7.A06
            int r0 = r0.A03()
            if (r2 >= r0) goto L_0x007e
            X.3BB r0 = r7.A06
            int r2 = r0.A08(r1)
            X.3BB r0 = r7.A06
            int r0 = r0.A06()
            if (r2 > r0) goto L_0x0085
        L_0x007e:
            int r0 = X.C252553pI.A06(r1)
            r9.A01(r1, r0)
        L_0x0085:
            X.3Jr r2 = r7.A04
            int r1 = r2.A04
            r0 = -1
            if (r1 < 0) goto L_0x008d
            r0 = 1
        L_0x008d:
            r2.A05 = r0
            int[] r1 = r7.A0C
            r1[r4] = r4
            r1[r10] = r4
            r7.A1s(r5, r1)
            r0 = r1[r4]
            int r11 = java.lang.Math.max(r4, r0)
            X.3BB r0 = r7.A06
            int r0 = r0.A06()
            int r11 = r11 + r0
            r0 = r1[r10]
            int r10 = java.lang.Math.max(r4, r0)
            X.3BB r0 = r7.A06
            int r0 = r0.A04()
            int r10 = r10 + r0
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x00dd
            int r2 = r7.A02
            if (r2 == r8) goto L_0x00dd
            int r1 = r7.A03
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x00dd
            android.view.View r12 = r7.A1D(r2)
            if (r12 == 0) goto L_0x00dd
            boolean r1 = r7.A09
            X.3BB r0 = r7.A06
            if (r1 == 0) goto L_0x025d
            int r2 = r0.A03()
            X.3BB r0 = r7.A06
            int r0 = r0.A08(r12)
            int r2 = r2 - r0
            int r1 = r7.A03
        L_0x00d9:
            int r2 = r2 - r1
            if (r2 <= 0) goto L_0x025a
            int r11 = r11 + r2
        L_0x00dd:
            boolean r1 = r9.A03
            boolean r0 = r7.A09
            if (r1 == 0) goto L_0x0256
            if (r0 == 0) goto L_0x00e6
        L_0x00e5:
            r8 = 1
        L_0x00e6:
            r7.A1q(r9, r6, r5, r8)
            r7.A0n(r6)
            X.3Jr r2 = r7.A04
            X.3BB r1 = r7.A06
            int r0 = r1.A05()
            if (r0 != 0) goto L_0x00fd
            int r1 = r1.A02()
            r0 = 1
            if (r1 == 0) goto L_0x00fe
        L_0x00fd:
            r0 = 0
        L_0x00fe:
            r2.A0A = r0
            r2.A06 = r4
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x0210
            int r1 = r9.A01
            int r0 = r9.A00
            r7.A0N(r1, r0)
            X.3Jr r0 = r7.A04
            r0.A02 = r11
            r7.A1f(r0, r6, r5, r4)
            X.3Jr r0 = r7.A04
            int r2 = r0.A07
            int r11 = r0.A01
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x011f
            int r10 = r10 + r0
        L_0x011f:
            int r1 = r9.A01
            int r0 = r9.A00
            r7.A0M(r1, r0)
            X.3Jr r8 = r7.A04
            r8.A02 = r10
            int r1 = r8.A01
            int r0 = r8.A03
            int r1 = r1 + r0
            r8.A01 = r1
            r7.A1f(r8, r6, r5, r4)
            X.3Jr r0 = r7.A04
            int r8 = r0.A07
            int r1 = r0.A00
            if (r1 <= 0) goto L_0x014a
            r7.A0N(r11, r2)
            X.3Jr r0 = r7.A04
            r0.A02 = r1
            r7.A1f(r0, r6, r5, r4)
            X.3Jr r0 = r7.A04
            int r2 = r0.A07
        L_0x014a:
            int r0 = r7.A0T()
            if (r0 <= 0) goto L_0x018a
            boolean r1 = r7.A09
            boolean r0 = r7.A0B
            r1 = r1 ^ r0
            X.3BB r0 = r7.A06
            if (r1 == 0) goto L_0x01de
            int r0 = r0.A03()
            int r0 = r0 - r8
            if (r0 <= 0) goto L_0x01db
            int r0 = -r0
            int r0 = r7.A1g(r6, r5, r0)
            int r11 = -r0
            int r10 = r8 + r11
            X.3BB r0 = r7.A06
            int r1 = r0.A03()
            int r1 = r1 - r10
            if (r1 <= 0) goto L_0x01dc
            X.3BB r0 = r7.A06
            r0.A0E(r1)
            int r1 = r1 + r11
        L_0x0177:
            int r2 = r2 + r1
            int r8 = r8 + r1
            X.3BB r0 = r7.A06
            int r0 = r0.A06()
            int r0 = r2 - r0
            if (r0 <= 0) goto L_0x020d
        L_0x0183:
            int r0 = r7.A1g(r6, r5, r0)
            int r0 = -r0
        L_0x0188:
            int r2 = r2 + r0
            int r8 = r8 + r0
        L_0x018a:
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x046c
            int r0 = r7.A0T()
            if (r0 == 0) goto L_0x046c
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x046c
            boolean r0 = r7.A1J()
            if (r0 == 0) goto L_0x046c
            java.util.List r12 = r6.A07
            int r17 = r12.size()
            android.view.View r0 = r7.A0X(r4)
            int r16 = X.C252553pI.A06(r0)
            r13 = 0
            r10 = 0
            r1 = 0
        L_0x01af:
            r0 = r17
            if (r13 >= r0) goto L_0x041f
            java.lang.Object r15 = r12.get(r13)
            X.3kE r15 = (X.C249703kE) r15
            boolean r0 = r15.isRemoved()
            if (r0 != 0) goto L_0x01d6
            int r11 = r15.getLayoutPosition()
            r14 = 0
            r0 = r16
            if (r11 >= r0) goto L_0x01c9
            r14 = 1
        L_0x01c9:
            boolean r11 = r7.A09
            X.3BB r0 = r7.A06
            android.view.View r15 = r15.itemView
            int r0 = r0.A0B(r15)
            if (r14 == r11) goto L_0x01d9
            int r10 = r10 + r0
        L_0x01d6:
            int r13 = r13 + 1
            goto L_0x01af
        L_0x01d9:
            int r1 = r1 + r0
            goto L_0x01d6
        L_0x01db:
            r11 = 0
        L_0x01dc:
            r1 = r11
            goto L_0x0177
        L_0x01de:
            int r0 = r0.A06()
            int r0 = r2 - r0
            if (r0 <= 0) goto L_0x020b
            int r0 = r7.A1g(r6, r5, r0)
            int r11 = -r0
            int r10 = r2 + r11
            X.3BB r0 = r7.A06
            int r0 = r0.A06()
            int r10 = r10 - r0
            if (r10 <= 0) goto L_0x01fd
            X.3BB r1 = r7.A06
            int r0 = -r10
            r1.A0E(r0)
            int r11 = r11 - r10
        L_0x01fd:
            int r2 = r2 + r11
            int r8 = r8 + r11
            X.3BB r0 = r7.A06
            int r0 = r0.A03()
            int r0 = r0 - r8
            if (r0 <= 0) goto L_0x020d
            int r0 = -r0
            goto L_0x0183
        L_0x020b:
            r11 = 0
            goto L_0x01fd
        L_0x020d:
            r0 = 0
            goto L_0x0188
        L_0x0210:
            int r1 = r9.A01
            int r0 = r9.A00
            r7.A0M(r1, r0)
            X.3Jr r0 = r7.A04
            r0.A02 = r10
            r7.A1f(r0, r6, r5, r4)
            X.3Jr r0 = r7.A04
            int r8 = r0.A07
            int r10 = r0.A01
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x0229
            int r11 = r11 + r0
        L_0x0229:
            int r1 = r9.A01
            int r0 = r9.A00
            r7.A0N(r1, r0)
            X.3Jr r2 = r7.A04
            r2.A02 = r11
            int r1 = r2.A01
            int r0 = r2.A03
            int r1 = r1 + r0
            r2.A01 = r1
            r7.A1f(r2, r6, r5, r4)
            X.3Jr r0 = r7.A04
            int r2 = r0.A07
            int r1 = r0.A00
            if (r1 <= 0) goto L_0x014a
            r7.A0M(r10, r8)
            X.3Jr r0 = r7.A04
            r0.A02 = r1
            r7.A1f(r0, r6, r5, r4)
            X.3Jr r0 = r7.A04
            int r8 = r0.A07
            goto L_0x014a
        L_0x0256:
            if (r0 == 0) goto L_0x00e5
            goto L_0x00e6
        L_0x025a:
            int r10 = r10 - r2
            goto L_0x00dd
        L_0x025d:
            int r1 = r0.A0D(r12)
            X.3BB r0 = r7.A06
            int r0 = r0.A06()
            int r1 = r1 - r0
            int r2 = r7.A03
            goto L_0x00d9
        L_0x026c:
            r9.A00()
            boolean r12 = r7.A09
            boolean r0 = r7.A0B
            r0 = r0 ^ r12
            r9.A03 = r0
            boolean r0 = r5.A08
            r11 = 0
            if (r0 != 0) goto L_0x035c
            int r13 = r7.A02
            if (r13 == r8) goto L_0x035c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 < 0) goto L_0x0358
            int r0 = r5.A00()
            if (r13 >= r0) goto L_0x0358
            r9.A01 = r13
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r1 = r7.A05
            if (r1 == 0) goto L_0x02b4
            int r0 = r1.A01
            if (r0 < 0) goto L_0x02b4
            boolean r1 = r1.A02
            r9.A03 = r1
            X.3BB r0 = r7.A06
            if (r1 == 0) goto L_0x02aa
            int r1 = r0.A03()
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r7.A05
            int r0 = r0.A00
        L_0x02a3:
            int r1 = r1 - r0
        L_0x02a4:
            r9.A00 = r1
        L_0x02a6:
            r9.A04 = r10
            goto L_0x0085
        L_0x02aa:
            int r1 = r0.A06()
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r7.A05
            int r0 = r0.A00
            goto L_0x034f
        L_0x02b4:
            int r0 = r7.A03
            if (r0 != r2) goto L_0x032a
            android.view.View r2 = r7.A1D(r13)
            if (r2 == 0) goto L_0x02fe
            X.3BB r0 = r7.A06
            int r1 = r0.A0B(r2)
            X.3BB r0 = r7.A06
            int r0 = r0.A07()
            if (r1 > r0) goto L_0x0319
            X.3BB r0 = r7.A06
            int r1 = r0.A0D(r2)
            X.3BB r0 = r7.A06
            int r0 = r0.A06()
            int r1 = r1 - r0
            X.3BB r0 = r7.A06
            if (r1 >= 0) goto L_0x02e6
            int r0 = r0.A06()
            r9.A00 = r0
            r9.A03 = r4
            goto L_0x02a6
        L_0x02e6:
            int r1 = r0.A03()
            X.3BB r0 = r7.A06
            int r0 = r0.A08(r2)
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x033f
            X.3BB r0 = r7.A06
            int r0 = r0.A03()
            r9.A00 = r0
            r9.A03 = r10
            goto L_0x02a6
        L_0x02fe:
            int r0 = r7.A0T()
            if (r0 <= 0) goto L_0x0319
            android.view.View r0 = r7.A0X(r4)
            int r2 = X.C252553pI.A06(r0)
            int r0 = r7.A02
            r1 = 0
            if (r0 >= r2) goto L_0x0312
            r1 = 1
        L_0x0312:
            boolean r0 = r7.A09
            if (r1 != r0) goto L_0x0317
            r11 = 1
        L_0x0317:
            r9.A03 = r11
        L_0x0319:
            boolean r1 = r9.A03
            X.3BB r0 = r9.A02
            if (r1 == 0) goto L_0x0324
            int r1 = r0.A03()
            goto L_0x02a4
        L_0x0324:
            int r1 = r0.A06()
            goto L_0x02a4
        L_0x032a:
            r9.A03 = r12
            X.3BB r0 = r7.A06
            if (r12 == 0) goto L_0x0338
            int r1 = r0.A03()
            int r0 = r7.A03
            goto L_0x02a3
        L_0x0338:
            int r1 = r0.A06()
            int r0 = r7.A03
            goto L_0x034f
        L_0x033f:
            boolean r1 = r9.A03
            X.3BB r0 = r7.A06
            if (r1 == 0) goto L_0x0352
            int r1 = r0.A08(r2)
            X.3BB r0 = r7.A06
            int r0 = r0.A01()
        L_0x034f:
            int r1 = r1 + r0
            goto L_0x02a4
        L_0x0352:
            int r1 = r0.A0D(r2)
            goto L_0x02a4
        L_0x0358:
            r7.A02 = r8
            r7.A03 = r2
        L_0x035c:
            int r0 = r7.A0T()
            r13 = 0
            if (r0 == 0) goto L_0x03fe
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            if (r0 == 0) goto L_0x039a
            android.view.View r2 = r0.getFocusedChild()
            if (r2 == 0) goto L_0x039a
            X.3Aj r0 = r7.A05
            java.util.List r0 = r0.A04
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x039a
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            X.3MX r0 = (X.AnonymousClass3MX) r0
            X.3kE r1 = r0.mViewHolder
            boolean r0 = r1.isRemoved()
            if (r0 != 0) goto L_0x039a
            int r1 = r1.getLayoutPosition()
            if (r1 < 0) goto L_0x039a
            int r0 = r5.A00()
            if (r1 >= r0) goto L_0x039a
            int r0 = X.C252553pI.A06(r2)
            r9.A01(r2, r0)
            goto L_0x02a6
        L_0x039a:
            boolean r0 = r7.A07
            boolean r1 = r7.A0B
            if (r0 != r1) goto L_0x03fe
            boolean r0 = r9.A03
            android.view.View r1 = r7.A1k(r6, r5, r0, r1)
            if (r1 == 0) goto L_0x03fe
            int r11 = X.C252553pI.A06(r1)
            boolean r2 = r9.A03
            X.3BB r0 = r9.A02
            if (r2 == 0) goto L_0x03f9
            int r2 = r0.A08(r1)
            X.3BB r0 = r9.A02
            int r0 = r0.A01()
            int r2 = r2 + r0
        L_0x03bd:
            r9.A00 = r2
            r9.A01 = r11
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x02a6
            boolean r0 = r7.A1J()
            if (r0 == 0) goto L_0x02a6
            X.3BB r0 = r7.A06
            int r12 = r0.A0D(r1)
            X.3BB r0 = r7.A06
            int r11 = r0.A08(r1)
            X.3BB r0 = r7.A06
            int r1 = r0.A06()
            X.3BB r0 = r7.A06
            int r2 = r0.A03()
            if (r11 > r1) goto L_0x03e8
            r0 = 1
            if (r12 < r1) goto L_0x03e9
        L_0x03e8:
            r0 = 0
        L_0x03e9:
            if (r12 < r2) goto L_0x03ee
            if (r11 <= r2) goto L_0x03ee
            r13 = 1
        L_0x03ee:
            if (r0 != 0) goto L_0x03f2
            if (r13 == 0) goto L_0x02a6
        L_0x03f2:
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x02a4
            r1 = r2
            goto L_0x02a4
        L_0x03f9:
            int r2 = r0.A0D(r1)
            goto L_0x03bd
        L_0x03fe:
            boolean r1 = r9.A03
            X.3BB r0 = r9.A02
            if (r1 == 0) goto L_0x041a
            int r0 = r0.A03()
        L_0x0408:
            r9.A00 = r0
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0418
            int r0 = r5.A00()
            int r0 = r0 + -1
        L_0x0414:
            r9.A01 = r0
            goto L_0x02a6
        L_0x0418:
            r0 = 0
            goto L_0x0414
        L_0x041a:
            int r0 = r0.A06()
            goto L_0x0408
        L_0x041f:
            X.3Jr r0 = r7.A04
            r0.A09 = r12
            if (r10 <= 0) goto L_0x0448
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x048c
            int r0 = r7.A0T()
            int r0 = r0 + -1
        L_0x042f:
            android.view.View r0 = r7.A0X(r0)
            int r0 = X.C252553pI.A06(r0)
            r7.A0N(r0, r2)
            X.3Jr r0 = r7.A04
            r0.A02 = r10
            r0.A00 = r4
            r0.A01(r3)
            X.3Jr r0 = r7.A04
            r7.A1f(r0, r6, r5, r4)
        L_0x0448:
            if (r1 <= 0) goto L_0x0468
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0485
            r0 = 0
        L_0x044f:
            android.view.View r0 = r7.A0X(r0)
            int r0 = X.C252553pI.A06(r0)
            r7.A0M(r0, r8)
            X.3Jr r0 = r7.A04
            r0.A02 = r1
            r0.A00 = r4
            r0.A01(r3)
            X.3Jr r0 = r7.A04
            r7.A1f(r0, r6, r5, r4)
        L_0x0468:
            X.3Jr r0 = r7.A04
            r0.A09 = r3
        L_0x046c:
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0481
            X.3BB r1 = r7.A06
            int r0 = r1.A07()
            r1.A00 = r0
        L_0x0478:
            boolean r0 = r7.A0B
            r7.A07 = r0
            r1 = 709568416(0x2a4b27a0, float:1.804377E-13)
            goto L_0x0022
        L_0x0481:
            r9.A00()
            goto L_0x0478
        L_0x0485:
            int r0 = r7.A0T()
            int r0 = r0 + -1
            goto L_0x044f
        L_0x048c:
            r0 = 0
            goto L_0x042f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1R(X.3AN, X.3AW):void");
    }

    public void A1T(AnonymousClass3AW r3, RecyclerView recyclerView, int i) {
        AnonymousClass52S r0 = new AnonymousClass52S(recyclerView.getContext());
        r0.A00 = i;
        A0t(r0);
    }

    public int A1a() {
        int A062;
        int A032 = AnonymousClass0fD.A03(-1788126990);
        View A1j = A1j(0, A0T(), false, true);
        if (A1j == null) {
            A062 = -1;
        } else {
            A062 = C252553pI.A06(A1j);
        }
        AnonymousClass0fD.A0A(1291391454, A032);
        return A062;
    }

    public int A1b() {
        int A032 = AnonymousClass0fD.A03(-1893337041);
        int i = -1;
        View A1j = A1j(A0T() - 1, -1, false, true);
        if (A1j != null) {
            i = C252553pI.A06(A1j);
        }
        AnonymousClass0fD.A0A(-203774900, A032);
        return i;
    }

    public final int A1c() {
        View A1j = A1j(0, A0T(), true, false);
        if (A1j == null) {
            return -1;
        }
        return C252553pI.A06(A1j);
    }

    public final int A1d() {
        View A1j = A1j(A0T() - 1, -1, true, false);
        if (A1j != null) {
            return C252553pI.A06(A1j);
        }
        return -1;
    }

    public final int A1g(AnonymousClass3AN r6, AnonymousClass3AW r7, int i) {
        if (!(A0T() == 0 || i == 0)) {
            A1n();
            this.A04.A0B = true;
            int i2 = -1;
            if (i > 0) {
                i2 = 1;
            }
            int abs = Math.abs(i);
            A0Q(this, r7, i2, abs, true);
            C240123Jr r0 = this.A04;
            int A1f = r0.A08 + A1f(r0, r6, r7, false);
            if (A1f >= 0) {
                if (abs > A1f) {
                    i = i2 * A1f;
                }
                this.A06.A0E(-i);
                this.A04.A04 = i;
                return i;
            }
        }
        return 0;
    }

    public final View A1i(int i, int i2) {
        AnonymousClass3B7 r0;
        A1n();
        if (i2 <= i && i2 >= i) {
            return A0X(i);
        }
        int i3 = 4161;
        int i4 = 4097;
        if (this.A06.A0D(A0X(i)) < this.A06.A06()) {
            i3 = 16644;
            i4 = 16388;
        }
        if (this.A01 == 0) {
            r0 = this.A08;
        } else {
            r0 = this.A09;
        }
        return r0.A00(i, i2, i3, i4);
    }

    public final View A1j(int i, int i2, boolean z, boolean z2) {
        AnonymousClass3B7 r0;
        A1n();
        int i3 = 320;
        int i4 = 320;
        if (z) {
            i4 = 24579;
        }
        if (!z2) {
            i3 = 0;
        }
        if (this.A01 == 0) {
            r0 = this.A08;
        } else {
            r0 = this.A09;
        }
        return r0.A00(i, i2, i4, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        if (r3 >= r6) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r2 <= r5) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1k(X.AnonymousClass3AN r15, X.AnonymousClass3AW r16, boolean r17, boolean r18) {
        /*
            r14 = this;
            r14.A1n()
            int r1 = r14.A0T()
            r8 = -1
            r0 = 1
            if (r18 == 0) goto L_0x006f
            int r9 = r14.A0T()
            int r9 = r9 - r0
            r13 = -1
        L_0x0011:
            int r7 = r16.A00()
            X.3BB r0 = r14.A06
            int r6 = r0.A06()
            X.3BB r0 = r14.A06
            int r5 = r0.A03()
            r12 = 0
            r11 = r12
            r10 = r12
        L_0x0024:
            if (r9 == r8) goto L_0x0073
            android.view.View r4 = r14.A0X(r9)
            int r1 = X.C252553pI.A06(r4)
            X.3BB r0 = r14.A06
            int r3 = r0.A0D(r4)
            X.3BB r0 = r14.A06
            int r2 = r0.A08(r4)
            if (r1 < 0) goto L_0x004f
            if (r1 >= r7) goto L_0x004f
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            X.3MX r0 = (X.AnonymousClass3MX) r0
            X.3kE r0 = r0.mViewHolder
            boolean r0 = r0.isRemoved()
            if (r0 == 0) goto L_0x0051
            if (r10 != 0) goto L_0x004f
            r10 = r4
        L_0x004f:
            int r9 = r9 + r13
            goto L_0x0024
        L_0x0051:
            if (r2 > r6) goto L_0x0056
            r1 = 1
            if (r3 < r6) goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            if (r3 < r5) goto L_0x005c
            r0 = 1
            if (r2 > r5) goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            if (r1 != 0) goto L_0x0062
            if (r0 != 0) goto L_0x0062
            return r4
        L_0x0062:
            if (r17 == 0) goto L_0x0068
            if (r0 == 0) goto L_0x006b
        L_0x0066:
            r11 = r4
            goto L_0x004f
        L_0x0068:
            if (r1 == 0) goto L_0x006b
            goto L_0x0066
        L_0x006b:
            if (r12 != 0) goto L_0x004f
            r12 = r4
            goto L_0x004f
        L_0x006f:
            r8 = r1
            r9 = 0
            r13 = 1
            goto L_0x0011
        L_0x0073:
            if (r12 != 0) goto L_0x0079
            r12 = r10
            if (r11 == 0) goto L_0x0079
            return r11
        L_0x0079:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1k(X.3AN, X.3AW, boolean, boolean):android.view.View");
    }

    public void A1r(AnonymousClass3BA r12, C240123Jr r13, AnonymousClass3AN r14, AnonymousClass3AW r15) {
        int BaC;
        int A0C2;
        int i;
        int i2;
        View A002 = r13.A00(r14);
        if (A002 == null) {
            r12.A01 = true;
            return;
        }
        AnonymousClass3MX r7 = (AnonymousClass3MX) A002.getLayoutParams();
        List list = r13.A09;
        boolean z = this.A09;
        int i3 = r13.A05;
        boolean z2 = false;
        if (list == null) {
            if (i3 == -1) {
                z2 = true;
            }
            if (z == z2) {
                A0h(A002, -1);
            } else {
                A0h(A002, 0);
            }
        } else {
            if (i3 == -1) {
                z2 = true;
            }
            if (z == z2) {
                C252553pI.A0A(A002, this, -1, true);
            } else {
                C252553pI.A0A(A002, this, 0, true);
            }
        }
        A0j(A002, 0, 0);
        r12.A00 = this.A06.A0B(A002);
        if (this.A01 == 1) {
            if (A1u()) {
                i2 = this.A03 - BaB();
                i = i2 - this.A06.A0C(A002);
            } else {
                i = Ba9();
                i2 = this.A06.A0C(A002) + i;
            }
            int i4 = r13.A05;
            int i5 = r13.A07;
            int i6 = r12.A00;
            A0C2 = i5 + i6;
            BaC = i5;
            if (i4 == -1) {
                BaC = i5 - i6;
                A0C2 = i5;
            }
        } else {
            BaC = BaC();
            A0C2 = this.A06.A0C(A002) + BaC;
            int i7 = r13.A05;
            i = r13.A07;
            int i8 = r12.A00;
            i2 = i + i8;
            if (i7 == -1) {
                i2 = i;
                i -= i8;
            }
        }
        C252553pI.A09(A002, i, BaC, i2, A0C2);
        C249703kE r1 = r7.mViewHolder;
        if (r1.isRemoved() || r1.isUpdated()) {
            r12.A03 = true;
        }
        r12.A02 = A002.hasFocusable();
    }

    public void A1s(AnonymousClass3AW r6, int[] iArr) {
        int A1h = A1h(r6);
        int i = 0;
        if (this.A04.A05 != -1) {
            i = A1h;
            A1h = 0;
        }
        iArr[0] = A1h;
        iArr[1] = i;
    }

    public PointF AIp(int i) {
        PointF pointF;
        if (A0T() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < C252553pI.A06(A0X(0))) {
            z = true;
        }
        if (z != this.A09) {
            i2 = -1;
        }
        float f = (float) i2;
        if (this.A01 == 0) {
            return pointF;
        }
        pointF = new PointF(0.0f, f);
        return pointF;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.3BA, java.lang.Object] */
    public LinearLayoutManager(Context context, int i, boolean z) {
        this.A01 = 1;
        this.A08 = false;
        this.A09 = false;
        this.A0B = false;
        this.A0A = true;
        this.A02 = -1;
        this.A03 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A05 = null;
        this.A0D = new AnonymousClass3B9();
        this.A0E = new Object();
        this.A00 = 2;
        this.A0C = new int[2];
        A1o(i);
        A1G((String) null);
        if (z != this.A08) {
            this.A08 = z;
            A0b();
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }
}
