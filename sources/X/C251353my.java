package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;
import com.instagram.android.R;

/* renamed from: X.3my  reason: invalid class name and case insensitive filesystem */
public final class C251353my extends C251253mo {
    @Prop(optional = true, resType = C54606HKp.A04)
    @Comparable(type = 3)
    public int A00;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public int A01;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public int A02 = 1;
    @Prop(optional = false, resType = C54606HKp.A0A)
    @Comparable(type = 10)
    public C251263mp A03;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public JLU A04;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A05;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A06;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A07 = true;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A08;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A09;

    public final boolean A0N() {
        return true;
    }

    public final boolean A10() {
        return true;
    }

    public final boolean A11() {
        return true;
    }

    public C251353my() {
        super("VerticalScroll");
    }

    public final Integer A0G() {
        return AnonymousClass05K.A0C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0046, code lost:
        if (r4.booleanValue() == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0T(X.C251263mp r17, X.C251263mp r18, X.2TB r19, X.2TB r20) {
        /*
            r16 = this;
            r5 = r18
            r6 = r17
            X.3my r6 = (X.C251353my) r6
            X.3my r5 = (X.C251353my) r5
            r4 = 0
            if (r6 != 0) goto L_0x00c0
            r3 = r4
        L_0x000c:
            if (r5 != 0) goto L_0x00bc
            r2 = r4
        L_0x000f:
            if (r6 != 0) goto L_0x00b4
            r1 = r4
        L_0x0012:
            if (r5 != 0) goto L_0x00ac
            r7 = r4
        L_0x0015:
            if (r6 != 0) goto L_0x00a4
            r8 = r4
        L_0x0018:
            if (r5 != 0) goto L_0x009c
            r9 = r4
        L_0x001b:
            if (r6 != 0) goto L_0x0096
            r10 = r4
        L_0x001e:
            if (r5 != 0) goto L_0x0090
            r11 = r4
        L_0x0021:
            if (r6 != 0) goto L_0x0089
            r12 = r4
        L_0x0024:
            if (r5 != 0) goto L_0x0082
            r13 = r4
        L_0x0027:
            if (r6 != 0) goto L_0x007c
            r14 = r4
        L_0x002a:
            if (r5 != 0) goto L_0x0076
            r15 = r4
        L_0x002d:
            if (r6 != 0) goto L_0x006f
            r6 = r4
        L_0x0030:
            if (r5 == 0) goto L_0x0038
            boolean r0 = r5.A08
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L_0x0038:
            boolean r0 = r6.equals(r4)
            r5 = 1
            if (r0 == 0) goto L_0x006e
            if (r4 == 0) goto L_0x0048
            boolean r4 = r4.booleanValue()
            r0 = 1
            if (r4 != 0) goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            boolean r0 = X.2Vb.A04(r3, r2, r0)
            if (r0 == 0) goto L_0x006e
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x006e
            boolean r0 = r8.equals(r9)
            if (r0 == 0) goto L_0x006e
            boolean r0 = r10.equals(r11)
            if (r0 == 0) goto L_0x006e
            boolean r0 = r12.equals(r13)
            if (r0 == 0) goto L_0x006e
            boolean r0 = r14.equals(r15)
            if (r0 == 0) goto L_0x006e
            r5 = 0
        L_0x006e:
            return r5
        L_0x006f:
            boolean r0 = r6.A08
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            goto L_0x0030
        L_0x0076:
            r0 = 0
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)
            goto L_0x002d
        L_0x007c:
            r0 = 0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
            goto L_0x002a
        L_0x0082:
            boolean r0 = r5.A05
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            goto L_0x0027
        L_0x0089:
            boolean r0 = r6.A05
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            goto L_0x0024
        L_0x0090:
            r0 = 0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            goto L_0x0021
        L_0x0096:
            r0 = 0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            goto L_0x001e
        L_0x009c:
            boolean r0 = r5.A07
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            goto L_0x001b
        L_0x00a4:
            boolean r0 = r6.A07
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            goto L_0x0018
        L_0x00ac:
            boolean r0 = r5.A06
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            goto L_0x0015
        L_0x00b4:
            boolean r0 = r6.A06
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            goto L_0x0012
        L_0x00bc:
            X.3mp r2 = r5.A03
            goto L_0x000f
        L_0x00c0:
            X.3mp r3 = r6.A03
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251353my.A0T(X.3mp, X.3mp, X.2TB, X.2TB):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2Tq, java.lang.Object] */
    public final /* bridge */ /* synthetic */ C70672Tq A0d() {
        return new Object();
    }

    public static ComponentTree A00(2V1 r5) {
        String A082 = r5.A08();
        AnonymousClass9OG r2 = new AnonymousClass9OG(A082);
        ComponentTree componentTree = (ComponentTree) r5.A07(r2, A082, 0);
        if (componentTree != null) {
            return componentTree;
        }
        AnonymousClass3X6 A012 = ComponentTree.A01((C251263mp) null, r5);
        A012.A07 = false;
        ComponentTree A002 = A012.A00();
        r5.A0D(r2, A002, A082, 0);
        return A002;
    }

    public final /* bridge */ /* synthetic */ C251263mp A0E() {
        C251263mp r0;
        C251353my r1 = (C251353my) super.A0E();
        C251263mp r02 = r1.A03;
        if (r02 != null) {
            r0 = r02.A0E();
        } else {
            r0 = null;
        }
        r1.A03 = r0;
        return r1;
    }

    public final Object A0H(Context context) {
        return LayoutInflater.from(context).inflate(R.layout.litho_scroll_view, (ViewGroup) null, false);
    }
}
