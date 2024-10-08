package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.7D1  reason: invalid class name */
public final class AnonymousClass7D1 implements AnonymousClass7D2 {
    public final 2cp A00;
    public final C332927Wz A01;
    public final AnonymousClass9HC A02;

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0182, code lost:
        if (r2 != null) goto L_0x0153;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass7G7 r17, X.C328137Dq r18, X.C331547Rk r19) {
        /*
            r16 = this;
            r12 = r18
            r8 = r19
            r4 = r16
            if (r19 != 0) goto L_0x002b
            X.9HC r1 = r4.A02
            X.0eM r0 = r1.A0A
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x002a
            X.0eM r0 = r1.A0G
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x002a
            r0 = 0
            r12.A00(r0)
        L_0x002a:
            return
        L_0x002b:
            X.9HC r11 = r4.A02
            X.0eM r9 = r11.A0G
            java.lang.Object r0 = r9.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x003f
            r0 = 0
            r12.A00(r0)
        L_0x003f:
            X.MaE r0 = new X.MaE
            r1 = r17
            r0.<init>(r1, r4, r8)
            r12.A06 = r0
            java.lang.String r14 = r8.A05
            X.GAV r13 = r8.A02
            X.GAV r7 = r8.A01
            int r15 = r8.A00
            boolean r3 = r8.A09
            java.lang.String r2 = r8.A03
            X.7Wz r1 = r4.A01
            r0 = 1
            X.0qQ.A0B(r14, r0)
            r0 = 2
            X.0qQ.A0B(r13, r0)
            r0 = 3
            X.0qQ.A0B(r7, r0)
            r0 = 6
            X.0qQ.A0B(r2, r0)
            if (r3 == 0) goto L_0x0185
            X.OiL r6 = new X.OiL
            r6.<init>(r1, r2)
        L_0x006d:
            X.2eb r5 = r12.A04
            X.0qQ.A06(r5)
            int r4 = r7.A03
            if (r4 == 0) goto L_0x0136
            r0 = 8
        L_0x0078:
            r5.A03(r0)
            float r0 = r7.A00
            r12.A00 = r0
            r1 = 0
            if (r4 != 0) goto L_0x0083
            r1 = 1
        L_0x0083:
            android.view.View r0 = r12.A08
            android.content.Context r6 = r0.getContext()
            if (r1 == 0) goto L_0x0133
            android.content.res.Resources r2 = r6.getResources()
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            int r1 = r2.getDimensionPixelSize(r0)
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r2.getDimensionPixelSize(r0)
            int r1 = r1 - r0
            boolean r0 = X.0mk.A02(r6)
            if (r0 != 0) goto L_0x00a5
            int r1 = -r1
        L_0x00a5:
            float r2 = (float) r1
        L_0x00a6:
            r12.A01 = r2
            X.7Dt r3 = r12.A0A
            float r1 = r3.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r2 = r2 * r0
            r1 = 0
            X.MaE r0 = r12.A06
            if (r0 == 0) goto L_0x00bc
            X.7G7 r0 = r0.A00
            if (r0 == 0) goto L_0x00bc
            r0.E0W(r1, r2)
        L_0x00bc:
            java.lang.Object r0 = r9.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            X.3oV r1 = r12.A05
            if (r0 != 0) goto L_0x012a
            android.view.View r0 = r1.getView()
            X.0qQ.A07(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            X.C66644MaD.A03(r0, r13, r15)
            android.view.View r2 = r1.getView()
            X.0qQ.A07(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            X.0eM r0 = r11.A0a
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x00f1
            r2.setVisibility(r0)
        L_0x00f1:
            boolean r0 = X.00l.A0W(r14)
            if (r0 != 0) goto L_0x00fd
            r2.setText(r14)
            r2.setTextColor(r15)
        L_0x00fd:
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            int r5 = r1.getDimensionPixelSize(r0)
            r0 = 2131165217(0x7f070021, float:1.7944645E38)
            int r4 = r1.getDimensionPixelSize(r0)
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r2 = r1.getDimensionPixelSize(r0)
            boolean r1 = X.0mk.A02(r6)
            r0 = 1
            if (r1 == 0) goto L_0x011e
            r0 = -1
        L_0x011e:
            int r5 = r5 + r4
            int r5 = r5 + r2
            int r0 = r0 * r5
            float r2 = (float) r0
            float r1 = r12.A00
            boolean r0 = r8.A06
            r3.A02(r2, r1, r0)
            return
        L_0x012a:
            X.MaF r10 = new X.MaF
            r10.<init>(r11, r12, r13, r14, r15)
            r1.EeU(r10)
            goto L_0x00fd
        L_0x0133:
            r2 = 0
            goto L_0x00a6
        L_0x0136:
            android.view.View r3 = r5.A01()
            X.0qQ.A07(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.Context r1 = r3.getContext()
            int r0 = r7.A02
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0182
            if (r2 == 0) goto L_0x015d
            r0 = 1
            r2.setAutoMirrored(r0)
        L_0x0153:
            r2.mutate()
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r15)
            r2.setColorFilter(r0)
        L_0x015d:
            int r10 = r7.A01
            if (r10 == 0) goto L_0x0174
            android.view.View r1 = r5.A01()
            android.view.View r0 = r5.A01()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getString(r10)
            r1.setContentDescription(r0)
        L_0x0174:
            r3.setImageDrawable(r2)
            X.AnonymousClass0fU.A00(r6, r3)
            r0 = 0
            if (r6 != 0) goto L_0x0078
            r3.setClickable(r0)
            goto L_0x0078
        L_0x0182:
            if (r2 == 0) goto L_0x015d
            goto L_0x0153
        L_0x0185:
            r6 = 0
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7D1.A00(X.7G7, X.7Dq, X.7Rk):void");
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        A00((AnonymousClass7G7) null, (C328137Dq) r2, (C331547Rk) r3);
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C328137Dq(viewGroup, this.A00, this.A02);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        C328137Dq r22 = (C328137Dq) r2;
        r22.A0A.A01();
        r22.A06 = null;
    }

    public AnonymousClass7D1(C332927Wz r2, AnonymousClass9HC r3) {
        this(C61340me.A00(), r2, r3);
    }

    public AnonymousClass7D1(2cp r1, C332927Wz r2, AnonymousClass9HC r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
