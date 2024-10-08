package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Tp4  reason: case insensitive filesystem */
public final class C14056Tp4 extends C249403jg {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public VUM A04 = new Object();
    public C14072TpM A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final LinearLayoutManager A0A;
    public final RecyclerView A0B;
    public final ViewPager2 A0C;

    public static void A00(C14056Tp4 tp4) {
        tp4.A00 = 0;
        tp4.A02 = 0;
        VUM vum = tp4.A04;
        vum.A02 = -1;
        vum.A00 = 0.0f;
        vum.A01 = 0;
        tp4.A01 = -1;
        tp4.A03 = -1;
        tp4.A08 = false;
        tp4.A09 = false;
        tp4.A07 = false;
        tp4.A06 = false;
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [java.lang.Object, X.VrR] */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010e, code lost:
        if (r6.A00.A0T() <= 1) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011f, code lost:
        if (r7[r8 - 1][1] >= r1) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C14056Tp4 r13) {
        /*
            X.VUM r3 = r13.A04
            androidx.recyclerview.widget.LinearLayoutManager r9 = r13.A0A
            int r1 = r9.A1a()
            r3.A02 = r1
            r0 = -1
            if (r1 == r0) goto L_0x0161
            android.view.View r10 = r9.A1D(r1)
            if (r10 == 0) goto L_0x0161
            int r8 = X.C252553pI.A05(r10)
            int r5 = X.C252553pI.A07(r10)
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            X.3MX r0 = (X.AnonymousClass3MX) r0
            android.graphics.Rect r0 = r0.A02
            int r7 = r0.top
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            X.3MX r0 = (X.AnonymousClass3MX) r0
            android.graphics.Rect r0 = r0.A02
            int r2 = r0.bottom
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0045
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.leftMargin
            int r8 = r8 + r0
            int r0 = r1.rightMargin
            int r5 = r5 + r0
            int r0 = r1.topMargin
            int r7 = r7 + r0
            int r0 = r1.bottomMargin
            int r2 = r2 + r0
        L_0x0045:
            int r6 = r10.getHeight()
            int r6 = r6 + r7
            int r6 = r6 + r2
            int r4 = r10.getWidth()
            int r4 = r4 + r8
            int r4 = r4 + r5
            int r0 = r9.A01
            r2 = 1
            r5 = 0
            if (r0 != 0) goto L_0x00d9
            int r1 = r10.getLeft()
            int r1 = r1 - r8
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0B
            int r0 = r0.getPaddingLeft()
            int r1 = r1 - r0
            androidx.viewpager2.widget.ViewPager2 r0 = r13.A0C
            androidx.recyclerview.widget.LinearLayoutManager r0 = r0.A02
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            int r0 = r0.getLayoutDirection()
            if (r0 != r2) goto L_0x0070
            int r1 = -r1
        L_0x0070:
            r6 = r4
        L_0x0071:
            int r0 = -r1
            r3.A01 = r0
            if (r0 >= 0) goto L_0x0157
            X.VrR r6 = new X.VrR
            r6.<init>()
            r6.A00 = r9
            int r8 = r9.A0T()
            if (r8 == 0) goto L_0x0108
            int r0 = r9.A01
            r13 = 0
            if (r0 != 0) goto L_0x0089
            r13 = 1
        L_0x0089:
            r0 = 2
            int[] r1 = new int[r0]
            r1[r2] = r0
            r1[r5] = r8
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r0, r1)
            int[][] r7 = (int[][]) r7
            r11 = 0
        L_0x0099:
            if (r11 >= r8) goto L_0x00ee
            android.view.View r12 = r9.A0X(r11)
            if (r12 == 0) goto L_0x00e6
            android.view.ViewGroup$LayoutParams r10 = r12.getLayoutParams()
            boolean r0 = r10 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00d6
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
        L_0x00ab:
            r4 = r7[r11]
            if (r13 == 0) goto L_0x00cf
            int r1 = r12.getLeft()
            int r0 = r10.leftMargin
        L_0x00b5:
            int r1 = r1 - r0
            r4[r5] = r1
            r4 = r7[r11]
            if (r13 == 0) goto L_0x00c8
            int r1 = r12.getRight()
            int r0 = r10.rightMargin
        L_0x00c2:
            int r1 = r1 + r0
            r4[r2] = r1
            int r11 = r11 + 1
            goto L_0x0099
        L_0x00c8:
            int r1 = r12.getBottom()
            int r0 = r10.bottomMargin
            goto L_0x00c2
        L_0x00cf:
            int r1 = r12.getTop()
            int r0 = r10.topMargin
            goto L_0x00b5
        L_0x00d6:
            android.view.ViewGroup$MarginLayoutParams r10 = X.C18422VrR.A01
            goto L_0x00ab
        L_0x00d9:
            int r1 = r10.getTop()
            int r1 = r1 - r7
            androidx.recyclerview.widget.RecyclerView r0 = r13.A0B
            int r0 = r0.getPaddingTop()
            int r1 = r1 - r0
            goto L_0x0071
        L_0x00e6:
            java.lang.String r1 = "null view contained in the view hierarchy"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00ee:
            X.WqM r0 = new X.WqM
            r0.<init>((java.lang.Object) r6, (int) r5)
            java.util.Arrays.sort(r7, r0)
            r4 = 1
        L_0x00f7:
            if (r4 >= r8) goto L_0x0111
            int r0 = r4 + -1
            r0 = r7[r0]
            r1 = r0[r2]
            r0 = r7[r4]
            r0 = r0[r5]
            if (r1 != r0) goto L_0x0121
            int r4 = r4 + 1
            goto L_0x00f7
        L_0x0108:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r6.A00
            int r0 = r0.A0T()
            if (r0 > r2) goto L_0x013f
            goto L_0x0121
        L_0x0111:
            r0 = r7[r5]
            r1 = r0[r2]
            r0 = r0[r5]
            int r1 = r1 - r0
            if (r0 > 0) goto L_0x0121
            int r8 = r8 - r2
            r0 = r7[r8]
            r0 = r0[r2]
            if (r0 >= r1) goto L_0x0108
        L_0x0121:
            androidx.recyclerview.widget.LinearLayoutManager r4 = r6.A00
            int r2 = r4.A0T()
            r1 = 0
        L_0x0128:
            if (r1 >= r2) goto L_0x013f
            android.view.View r0 = r4.A0X(r1)
            boolean r0 = X.C18422VrR.A00(r0)
            if (r0 == 0) goto L_0x013c
            java.lang.String r1 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x013c:
            int r1 = r1 + 1
            goto L_0x0128
        L_0x013f:
            java.util.Locale r2 = java.util.Locale.US
            int r0 = r3.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Page can only be offset by a positive amount, not by %d"
            java.lang.String r1 = java.lang.String.format(r2, r0, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0157:
            if (r6 != 0) goto L_0x015d
            r1 = 0
        L_0x015a:
            r3.A00 = r1
            return
        L_0x015d:
            float r1 = (float) r0
            float r0 = (float) r6
            float r1 = r1 / r0
            goto L_0x015a
        L_0x0161:
            r3.A02 = r0
            r0 = 0
            r3.A00 = r0
            r0 = 0
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14056Tp4.A01(X.Tp4):void");
    }

    public static void A02(C14056Tp4 tp4, int i) {
        if ((tp4.A00 != 3 || tp4.A02 != 0) && tp4.A02 != i) {
            tp4.A02 = i;
            C14072TpM tpM = tp4.A05;
            if (tpM != null) {
                tpM.A00(i);
            }
        }
    }

    public static void A03(C14056Tp4 tp4, boolean z) {
        tp4.A07 = z;
        int i = 1;
        if (z) {
            i = 4;
        }
        tp4.A00 = i;
        int i2 = tp4.A03;
        if (i2 != -1) {
            tp4.A01 = i2;
            tp4.A03 = -1;
        } else if (tp4.A01 == -1) {
            tp4.A01 = tp4.A0A.A1a();
        }
        A02(tp4, 1);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.VUM, java.lang.Object] */
    public C14056Tp4(ViewPager2 viewPager2) {
        this.A0C = viewPager2;
        RecyclerView recyclerView = viewPager2.A04;
        this.A0B = recyclerView;
        this.A0A = (LinearLayoutManager) recyclerView.A0D;
        A00(this);
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        C14072TpM tpM;
        C14072TpM tpM2;
        int A032 = AnonymousClass0fD.A03(-79209008);
        int i3 = this.A00;
        if (!(i3 == 1 && this.A02 == 1) && i == 1) {
            A03(this, false);
            i2 = -1531420113;
        } else {
            boolean z = true;
            if (!(i3 == 1 || i3 == 4)) {
                z = false;
            }
            if (!z || i != 2) {
                if (z && i == 0) {
                    A01(this);
                    boolean z2 = this.A09;
                    VUM vum = this.A04;
                    if (!z2) {
                        int i4 = vum.A02;
                        if (!(i4 == -1 || (tpM2 = this.A05) == null)) {
                            tpM2.A02(i4, 0.0f, 0);
                        }
                    } else if (vum.A01 == 0) {
                        int i5 = this.A01;
                        int i6 = vum.A02;
                        if (!(i5 == i6 || (tpM = this.A05) == null)) {
                            tpM.A01(i6);
                        }
                    }
                    A02(this, 0);
                    A00(this);
                }
                if (this.A00 == 2 && i == 0 && this.A06) {
                    A01(this);
                    VUM vum2 = this.A04;
                    if (vum2.A01 == 0) {
                        int i7 = this.A03;
                        int i8 = vum2.A02;
                        if (i7 != i8) {
                            if (i8 == -1) {
                                i8 = 0;
                            }
                            C14072TpM tpM3 = this.A05;
                            if (tpM3 != null) {
                                tpM3.A01(i8);
                            }
                        }
                        A02(this, 0);
                        A00(this);
                    }
                }
                i2 = -2129678176;
            } else {
                if (this.A09) {
                    A02(this, 2);
                    this.A08 = true;
                }
                i2 = -1792880667;
            }
        }
        AnonymousClass0fD.A0A(i2, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r2 == r0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r9.A01 != r1) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r10, int r11, int r12) {
        /*
            r9 = this;
            r0 = -1017266303(0xffffffffc35dbf81, float:-221.74806)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r5 = 1
            r9.A09 = r5
            A01(r9)
            boolean r0 = r9.A08
            r7 = -1
            r3 = 0
            if (r0 == 0) goto L_0x0078
            r9.A08 = r3
            if (r12 > 0) goto L_0x002d
            if (r12 != 0) goto L_0x0073
            r2 = 0
            if (r11 >= 0) goto L_0x001d
            r2 = 1
        L_0x001d:
            androidx.viewpager2.widget.ViewPager2 r0 = r9.A0C
            androidx.recyclerview.widget.LinearLayoutManager r0 = r0.A02
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            int r1 = r0.getLayoutDirection()
            r0 = 1
            if (r1 == r5) goto L_0x002b
            r0 = 0
        L_0x002b:
            if (r2 != r0) goto L_0x0073
        L_0x002d:
            X.VUM r1 = r9.A04
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0073
            int r0 = r1.A02
            int r1 = r0 + 1
        L_0x0037:
            r9.A03 = r1
            int r0 = r9.A01
            if (r0 == r1) goto L_0x0044
        L_0x003d:
            X.TpM r0 = r9.A05
            if (r0 == 0) goto L_0x0044
            r0.A01(r1)
        L_0x0044:
            X.VUM r8 = r9.A04
            int r6 = r8.A02
            if (r6 != r7) goto L_0x004b
            r6 = 0
        L_0x004b:
            float r2 = r8.A00
            int r1 = r8.A01
            X.TpM r0 = r9.A05
            if (r0 == 0) goto L_0x0056
            r0.A02(r6, r2, r1)
        L_0x0056:
            int r1 = r8.A02
            int r0 = r9.A03
            if (r1 == r0) goto L_0x005e
            if (r0 != r7) goto L_0x006c
        L_0x005e:
            int r0 = r8.A01
            if (r0 != 0) goto L_0x006c
            int r0 = r9.A02
            if (r0 == r5) goto L_0x006c
            A02(r9, r3)
            A00(r9)
        L_0x006c:
            r0 = 161333262(0x99dc00e, float:3.7976983E-33)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0073:
            X.VUM r0 = r9.A04
            int r1 = r0.A02
            goto L_0x0037
        L_0x0078:
            int r0 = r9.A00
            if (r0 != 0) goto L_0x0044
            X.VUM r0 = r9.A04
            int r1 = r0.A02
            if (r1 != r7) goto L_0x003d
            r1 = 0
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14056Tp4.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
