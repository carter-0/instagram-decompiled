package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.3Tx  reason: invalid class name and case insensitive filesystem */
public final class C242403Tx {
    public VXS A00;
    public VXS A01;
    public VXS A02;
    public final View A03;
    public final AnonymousClass2X7 A04 = AnonymousClass2X7.A01();

    public final void A03() {
        this.A00 = null;
        A02();
        A02();
    }

    public final ColorStateList A00() {
        VXS vxs = this.A02;
        if (vxs != null) {
            return vxs.A00;
        }
        return null;
    }

    public final PorterDuff.Mode A01() {
        VXS vxs = this.A02;
        if (vxs != null) {
            return vxs.A01;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [X.VXS, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r0 != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r5 = this;
            android.view.View r4 = r5.A03
            android.graphics.drawable.Drawable r3 = r4.getBackground()
            if (r3 == 0) goto L_0x0045
            X.VXS r0 = r5.A00
            if (r0 == 0) goto L_0x0046
            X.VXS r2 = r5.A01
            if (r2 != 0) goto L_0x0017
            X.VXS r2 = new X.VXS
            r2.<init>()
            r5.A01 = r2
        L_0x0017:
            r1 = 0
            r2.A00 = r1
            r0 = 0
            r2.A02 = r0
            r2.A01 = r1
            r2.A03 = r0
            android.content.res.ColorStateList r0 = r4.getBackgroundTintList()
            r1 = 1
            if (r0 == 0) goto L_0x002c
            r2.A02 = r1
            r2.A00 = r0
        L_0x002c:
            android.graphics.PorterDuff$Mode r0 = r4.getBackgroundTintMode()
            if (r0 == 0) goto L_0x0036
            r2.A03 = r1
            r2.A01 = r0
        L_0x0036:
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x003e
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0046
        L_0x003e:
            int[] r0 = r4.getDrawableState()
            X.2X8.A03(r3, r2, r0)
        L_0x0045:
            return
        L_0x0046:
            X.VXS r2 = r5.A02
            if (r2 != 0) goto L_0x003e
            X.VXS r2 = r5.A00
            if (r2 == 0) goto L_0x0045
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C242403Tx.A02():void");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.VXS, java.lang.Object] */
    public final void A04(int i) {
        ColorStateList A032;
        AnonymousClass2X7 r1 = this.A04;
        if (r1 == null || (A032 = r1.A03(this.A03.getContext(), i)) == null) {
            this.A00 = null;
        } else {
            VXS vxs = this.A00;
            VXS vxs2 = vxs;
            if (vxs == null) {
                ? obj = new Object();
                this.A00 = obj;
                vxs2 = obj;
            }
            vxs2.A00 = A032;
            vxs2.A02 = true;
        }
        A02();
        A02();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.VXS, java.lang.Object] */
    public final void A05(ColorStateList colorStateList) {
        VXS vxs = this.A02;
        VXS vxs2 = vxs;
        if (vxs == null) {
            ? obj = new Object();
            this.A02 = obj;
            vxs2 = obj;
        }
        vxs2.A00 = colorStateList;
        vxs2.A02 = true;
        A02();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.VXS, java.lang.Object] */
    public final void A06(PorterDuff.Mode mode) {
        VXS vxs = this.A02;
        VXS vxs2 = vxs;
        if (vxs == null) {
            ? obj = new Object();
            this.A02 = obj;
            vxs2 = obj;
        }
        vxs2.A01 = mode;
        vxs2.A03 = true;
        A02();
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [X.VXS, java.lang.Object] */
    public final void A07(AttributeSet attributeSet, int i) {
        ColorStateList A032;
        View view = this.A03;
        Context context = view.getContext();
        int[] iArr = AnonymousClass2Z3.A0Q;
        2Yi A002 = 2Yi.A00(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = A002.A02;
        03v.A06(context, typedArray, attributeSet, view, iArr, i, 0);
        try {
            if (typedArray.hasValue(0) && (A032 = this.A04.A03(context, typedArray.getResourceId(0, -1))) != null) {
                VXS vxs = this.A00;
                VXS vxs2 = vxs;
                if (vxs == null) {
                    ? obj = new Object();
                    this.A00 = obj;
                    vxs2 = obj;
                }
                vxs2.A00 = A032;
                vxs2.A02 = true;
                A02();
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(A002.A01(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(AnonymousClass3NX.A00((PorterDuff.Mode) null, typedArray.getInt(2, -1)));
            }
        } finally {
            typedArray.recycle();
        }
    }

    public C242403Tx(View view) {
        this.A03 = view;
    }
}
