package X;

import android.content.Context;

/* renamed from: X.LQx  reason: case insensitive filesystem */
public final class C64156LQx {
    public static final C64156LQx A00 = new Object();

    public static final Integer[] A00(Context context, float f, int i, int i2) {
        Number number;
        Number number2;
        Number number3;
        Number number4;
        Integer[][] numArr = {new Integer[]{6, 11, 9, 6}, JTQ.A1a((Integer) null, 38, 37, 29), new Integer[]{null, null, 45, 45}, JTQ.A1a((Integer) null, (Integer) null, (Integer) null, 43)};
        Integer[][] numArr2 = {new Integer[]{7, 13, 13, 11}, JTQ.A1a((Integer) null, 37, 45, 44), new Integer[]{null, null, 23, 26}, new Integer[]{null, null, null, 11}};
        Integer[][] numArr3 = {JTQ.A1a(6, 32, 31, 33), JTQ.A1a((Integer) null, 14, 21, 25), JTQ.A1a((Integer) null, (Integer) null, 8, 5), JTQ.A1a((Integer) null, (Integer) null, (Integer) null, 18)};
        Integer[][] numArr4 = {new Integer[]{7, 28, 26, 28}, JTQ.A1a((Integer) null, 13, 12, 10), JTQ.A1a((Integer) null, (Integer) null, 28, 24), JTQ.A1a((Integer) null, (Integer) null, (Integer) null, 50)};
        Object[] objArr = (Object[]) 03t.A06(numArr, i);
        if (objArr == null || (number = (Number) 03t.A06(objArr, i2)) == null) {
            return null;
        }
        int intValue = number.intValue();
        Object[] objArr2 = (Object[]) 03t.A06(numArr2, i);
        if (objArr2 == null || (number2 = (Number) 03t.A06(objArr2, i2)) == null) {
            return null;
        }
        int intValue2 = number2.intValue();
        Object[] objArr3 = (Object[]) 03t.A06(numArr3, i);
        if (objArr3 == null || (number3 = (Number) 03t.A06(objArr3, i2)) == null) {
            return null;
        }
        int intValue3 = number3.intValue();
        Object[] objArr4 = (Object[]) 03t.A06(numArr4, i);
        if (objArr4 == null || (number4 = (Number) 03t.A06(objArr4, i2)) == null) {
            return null;
        }
        return JTQ.A1a(Integer.valueOf((int) 0nA.A00(context, ((float) intValue) * f)), Integer.valueOf((int) 0nA.A00(context, ((float) intValue2) * f)), Integer.valueOf((int) 0nA.A00(context, ((float) intValue3) * f)), (int) 0nA.A00(context, ((float) number4.intValue()) * f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0030 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass0iw r19, X.C240933Nf r20, X.AnonymousClass3NU r21, float r22, boolean r23) {
        /*
            r18 = this;
            r7 = 0
            r6 = 1
            r8 = r20
            X.0qQ.A0B(r8, r6)
            r5 = 2
            r1 = r21
            boolean r0 = r1.A04
            r4 = 8
            if (r0 != 0) goto L_0x0031
            if (r23 == 0) goto L_0x0020
            X.0eM r0 = r8.A05
            java.lang.Object r0 = r0.getValue()
            X.3Nc r0 = (X.C240913Nc) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0025
        L_0x0020:
            X.0eM r0 = r8.A04
            X.DbW.A1R(r0, r4)
        L_0x0025:
            X.0eM r0 = r8.A06
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.cancel()
        L_0x0030:
            return
        L_0x0031:
            X.0eM r9 = r8.A04
            X.DbW.A1R(r9, r7)
            X.0eM r0 = r8.A06
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.start()
            X.3BT r13 = r1.A00
            com.instagram.model.reels.Reel r0 = r13.A03
            X.1Ns r0 = r0.A0W
            r17 = r19
            if (r0 == 0) goto L_0x005e
            com.instagram.common.typedurl.ImageUrl r2 = r0.Ary()
            if (r2 == 0) goto L_0x005e
            X.0eM r0 = r8.A01
            android.view.View r1 = X.JTR.A0W(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            r0 = r17
            r1.setUrl(r2, r0)
        L_0x005e:
            android.view.View r0 = X.AnonymousClass7TE.A0c(r9)
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r0)
            java.util.Set r0 = r13.A01()
            int r1 = r0.size()
            r16 = r22
            r0 = r16
            java.lang.Integer[] r15 = A00(r2, r0, r7, r1)
            r11 = 3
            r10 = -1
            if (r15 == 0) goto L_0x009b
            X.0eM r0 = r8.A01
            android.view.View r14 = X.JTR.A0W(r0)
            X.2dQ r12 = new X.2dQ
            r12.<init>(r10, r10)
            int r3 = X.JTO.A0A(r15, r7)
            int r2 = X.JTO.A0A(r15, r6)
            int r1 = X.JTO.A0A(r15, r5)
            int r0 = X.JTO.A0A(r15, r11)
            r12.setMargins(r3, r2, r1, r0)
            r14.setLayoutParams(r12)
        L_0x009b:
            java.util.Set r0 = r13.A01()
            java.util.List r3 = X.00k.A0a(r0)
            r2 = 0
        L_0x00a4:
            X.0eM r0 = r8.A03
        L_0x00a6:
            java.lang.Object r12 = r0.getValue()
            X.3Nc r12 = (X.C240913Nc) r12
        L_0x00ac:
            java.lang.Object r13 = X.00k.A0O(r3, r2)
            com.instagram.user.model.User r13 = (com.instagram.user.model.User) r13
            if (r13 == 0) goto L_0x010e
            if (r12 == 0) goto L_0x00c3
            android.view.View r1 = r12.A00()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            if (r1 == 0) goto L_0x00c3
            r0 = r17
            X.DbU.A1S(r0, r1, r13)
        L_0x00c3:
            android.view.View r0 = X.AnonymousClass7TE.A0c(r9)
            android.content.Context r14 = X.AnonymousClass7TE.A0S(r0)
            int r13 = r2 + 1
            int r1 = r3.size()
            r0 = r16
            java.lang.Integer[] r0 = A00(r14, r0, r13, r1)
            if (r0 == 0) goto L_0x010e
            if (r12 == 0) goto L_0x00fc
            android.view.View r15 = r12.A00()
            if (r15 == 0) goto L_0x00fc
            X.2dQ r14 = new X.2dQ
            r14.<init>(r10, r10)
            int r13 = X.JTO.A0A(r0, r7)
            int r12 = X.JTO.A0A(r0, r6)
            int r1 = X.JTO.A0A(r0, r5)
            int r0 = X.JTO.A0A(r0, r11)
            r14.setMargins(r13, r12, r1, r0)
            r15.setLayoutParams(r14)
        L_0x00fc:
            int r2 = r2 + 1
            if (r2 >= r11) goto L_0x0030
            if (r2 == 0) goto L_0x00a4
            if (r2 == r6) goto L_0x010b
            if (r2 == r5) goto L_0x0108
            r12 = 0
            goto L_0x00ac
        L_0x0108:
            X.0eM r0 = r8.A00
            goto L_0x00a6
        L_0x010b:
            X.0eM r0 = r8.A02
            goto L_0x00a6
        L_0x010e:
            if (r12 == 0) goto L_0x00fc
            boolean r0 = r12.A01()
            if (r0 != r6) goto L_0x00fc
            android.view.View r0 = r12.A00()
            if (r0 == 0) goto L_0x00fc
            r0.setVisibility(r4)
            goto L_0x00fc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64156LQx.A01(X.0iw, X.3Nf, X.3NU, float, boolean):void");
    }
}
