package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.Gxj  reason: case insensitive filesystem */
public final class C54001Gxj extends C251253mo {
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public int A00;
    @Prop(optional = false, resType = C54606HKp.A0A)
    @Comparable(type = 10)
    public C251263mp A01;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A02;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A03;
    @Prop(optional = true, resType = C54606HKp.A01)
    @Comparable(type = 3)
    public boolean A04 = true;

    public final boolean A0N() {
        return true;
    }

    public final void A0n(2V1 r7) {
        Boolean bool = null;
        TypedArray A022 = r7.A02(0, C55417HhN.A01);
        int indexCount = A022.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = A022.getIndex(i);
            if (index == 0) {
                bool = Boolean.valueOf(AnonymousClass7TF.A1P(A022.getInt(index, 0)));
            }
        }
        A022.recycle();
        if (bool != null) {
            this.A04 = bool.booleanValue();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.2T3, java.lang.Object] */
    public final void A0q(2V1 r8, C70672Tq r9, AnonymousClass2T3 r10, 2Tc r11, int i, int i2) {
        int i3;
        Integer num = null;
        Integer num2 = null;
        C251263mp r6 = this.A01;
        ComponentTree A002 = A00(r8);
        if (A002.Cab()) {
            if (r10 != null) {
                num = 0;
                num2 = 0;
                r10.A01 = Math.max(0, r10.A01);
                i3 = Math.max(0, r10.A00);
            }
            IIM iim = (IIM) r9;
            iim.A04 = num;
            iim.A03 = num2;
        }
        ? obj = new Object();
        A002.A0O(r6, obj, View.MeasureSpec.makeMeasureSpec(0, 0), i2);
        int i4 = obj.A01;
        i3 = obj.A00;
        num = Integer.valueOf(i4);
        num2 = Integer.valueOf(i3);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            r10.A01 = i4;
        } else {
            r10.A01 = size;
        }
        r10.A00 = i3;
        IIM iim2 = (IIM) r9;
        iim2.A04 = num;
        iim2.A03 = num2;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.2T3, java.lang.Object] */
    public final void A0r(2V1 r11, C70672Tq r12, 2Tc r13) {
        C245033cB r1 = null;
        C251263mp r7 = this.A01;
        boolean z = this.A02;
        ComponentTree A002 = A00(r11);
        IIM iim = (IIM) r12;
        Integer num = iim.A04;
        Integer num2 = iim.A03;
        int A05 = (r13.A05() - r13.A02()) - r13.A03();
        int i = 0;
        if (num != null && num2 != null) {
            int intValue = num.intValue();
            if (!z) {
                A05 = 0;
            }
            i = Integer.valueOf(Math.max(intValue, A05));
        } else if (A002.Cab()) {
            num2 = 0;
            iim.A02 = i;
            iim.A01 = num2;
            iim.A00 = r1;
        } else {
            ? obj = new Object();
            A002.A0O(r7, obj, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(r13.A00(), SN3.MAX_SIGNED_POWER_OF_TWO));
            int i2 = obj.A01;
            if (!z) {
                A05 = 0;
            }
            int max = Math.max(i2, A05);
            int i3 = obj.A00;
            i = Integer.valueOf(max);
            num2 = Integer.valueOf(i3);
        }
        r1 = r13.A06();
        iim.A02 = i;
        iim.A01 = num2;
        iim.A00 = r1;
    }

    public final boolean A10() {
        return true;
    }

    public final boolean A11() {
        return true;
    }

    public final boolean A16() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (X.2Vb.A04(r1, r0, r6) == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A18(X.C251263mp r5, boolean r6) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x003b
            r2 = 0
            if (r5 == 0) goto L_0x001e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x001e
            X.Gxj r5 = (X.C54001Gxj) r5
            X.3mp r1 = r4.A01
            X.3mp r0 = r5.A01
            if (r1 == 0) goto L_0x001f
            boolean r0 = X.2Vb.A04(r1, r0, r6)
            if (r0 != 0) goto L_0x0022
        L_0x001e:
            return r2
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            return r2
        L_0x0022:
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x001e
            boolean r1 = r4.A02
            boolean r0 = r5.A02
            if (r1 != r0) goto L_0x001e
            boolean r1 = r4.A03
            boolean r0 = r5.A03
            if (r1 != r0) goto L_0x001e
            boolean r1 = r4.A04
            boolean r0 = r5.A04
            if (r1 == r0) goto L_0x003b
            return r2
        L_0x003b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54001Gxj.A18(X.3mp, boolean):boolean");
    }

    public C54001Gxj() {
        super("HorizontalScroll");
    }

    public final Integer A0G() {
        return AnonymousClass05K.A0C;
    }

    public final Object A0H(Context context) {
        return new C52872Ge6(context);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2Tq, java.lang.Object] */
    public final /* bridge */ /* synthetic */ C70672Tq A0d() {
        return new Object();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2TB, java.lang.Object] */
    public final /* bridge */ /* synthetic */ 2TB A0f() {
        return new Object();
    }

    public final void A0v(2V1 r4, C70672Tq r5, Object obj) {
        C52872Ge6 ge6 = (C52872Ge6) obj;
        ge6.A03.A0k((ComponentTree) null, false);
        ge6.A01 = 0;
        ge6.A00 = 0;
        ge6.A02 = null;
        ge6.setScrollX(0);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.HQS] */
    public final void A0w(2V1 r3, 2TB r4) {
        ? obj = new Object();
        obj.A00 = -1;
        ((C54003Gxl) r4).A00 = obj;
    }

    public final void A0x(C70672Tq r2, C70672Tq r3) {
        IIM iim = (IIM) r2;
        IIM iim2 = (IIM) r3;
        iim.A01 = iim2.A01;
        iim.A02 = iim2.A02;
        iim.A00 = iim2.A00;
        iim.A03 = iim2.A03;
        iim.A04 = iim2.A04;
    }

    private ComponentTree A00(2V1 r6) {
        String A08 = r6.A08();
        C56021HrT hrT = new C56021HrT(A08);
        ComponentTree componentTree = (ComponentTree) r6.A07(hrT, A08, 0);
        if (componentTree != null) {
            return componentTree;
        }
        AnonymousClass3X6 A012 = ComponentTree.A01((C251263mp) null, r6);
        A012.A07 = false;
        ComponentTree A002 = A012.A00();
        r6.A0D(hrT, A002, A08, 0);
        return A002;
    }

    public final /* bridge */ /* synthetic */ C251263mp A0E() {
        C251263mp r0;
        C54001Gxj gxj = (C54001Gxj) super.A0E();
        C251263mp r02 = gxj.A01;
        if (r02 != null) {
            r0 = r02.A0E();
        } else {
            r0 = null;
        }
        gxj.A01 = r0;
        return gxj;
    }

    public final void A0t(2V1 r10, C70672Tq r11, Object obj) {
        C52872Ge6 ge6 = (C52872Ge6) obj;
        boolean z = this.A04;
        boolean z2 = this.A03;
        int i = this.A00;
        HQS hqs = C51969G9p.A0e(r10).A00;
        ComponentTree A002 = A00(r10);
        IIM iim = (IIM) r11;
        Integer num = iim.A02;
        Integer num2 = iim.A01;
        C245033cB r4 = iim.A00;
        ge6.setHorizontalScrollBarEnabled(z);
        ge6.setOverScrollMode(1);
        ge6.setHorizontalFadingEdgeEnabled(z2);
        ge6.setFadingEdgeLength(i);
        int A012 = DbX.A01(num);
        int A013 = DbX.A01(num2);
        ge6.A03.A0k(A002, true);
        ge6.A02 = hqs;
        ge6.A01 = A012;
        ge6.A00 = A013;
        C57888Ii5 ii5 = new C57888Ii5(hqs, ge6, r4);
        if (2Sa.useOneShotPreDrawListener) {
            03T.A00(ge6, ii5);
        } else {
            ge6.getViewTreeObserver().addOnPreDrawListener(new WCI(1, ge6, ii5));
        }
    }
}
