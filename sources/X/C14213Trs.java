package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Trs  reason: case insensitive filesystem */
public final class C14213Trs implements C46205DQi {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C231332rR A03;
    public final String A04;
    public final AnonymousClass32N A05;

    public C14213Trs(Fragment fragment, UserSession userSession, AnonymousClass4DU r4, C231332rR r5, AnonymousClass32N r6, String str) {
        0qQ.A0B(r6, 6);
        this.A01 = userSession;
        this.A02 = r4;
        this.A00 = fragment;
        this.A03 = r5;
        this.A04 = str;
        this.A05 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bd, code lost:
        if (r8 != null) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D4R(X.1Xj r23, X.AnonymousClass3W1 r24) {
        /*
            r22 = this;
            r6 = 0
            r4 = 1
            r7 = r22
            androidx.fragment.app.Fragment r3 = r7.A00
            android.content.Context r5 = r3.getContext()
            if (r5 == 0) goto L_0x017e
            com.instagram.common.session.UserSession r9 = r7.A01
            X.4DU r11 = r7.A02
            r10 = r23
            java.lang.Integer r2 = X.AnonymousClass3YA.A00(r9, r10, r11)
            java.lang.String r13 = X.C16944VBw.A00(r2)
            java.lang.String r14 = r7.A04
            r15 = 0
            r12 = r24
            r16 = r15
            r17 = r15
            r18 = r6
            X.W3r.A06(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.W07 r0 = X.VKH.A00
            boolean r0 = r0.A04(r9, r10)
            if (r0 == 0) goto L_0x00c2
            X.AnonymousClass3KE.A00()
            X.Wbr r1 = new X.Wbr
            r1.<init>(r6, r7, r10)
            java.lang.String r0 = "cta_bar"
            X.AnonymousClass3KD.A00(r5, r9, r10, r1, r0)
        L_0x003d:
            int r1 = r2.intValue()
            if (r1 == r4) goto L_0x013b
            r0 = 2
            if (r1 != r0) goto L_0x017e
            androidx.fragment.app.FragmentActivity r15 = r3.getActivity()
            if (r15 == 0) goto L_0x017e
            X.3YD r0 = X.AnonymousClass3YC.A00
            java.lang.String r5 = r0.A05(r10)
            java.lang.String r4 = r0.A07(r10)
            X.1Xy r0 = r10.A0C
            X.DUl r0 = r0.Bg2()
            if (r0 == 0) goto L_0x0087
            java.lang.String r8 = r0.BDT()
            if (r8 == 0) goto L_0x0087
        L_0x0064:
            r0 = 3
            java.lang.Integer[] r7 = X.AnonymousClass05K.A00(r0)
            int r6 = r7.length
            r2 = 0
        L_0x006b:
            if (r2 >= r6) goto L_0x00cf
            r1 = r7[r2]
            int r0 = r1.intValue()
            switch(r0) {
                case 1: goto L_0x0081;
                case 2: goto L_0x0084;
                default: goto L_0x0076;
            }
        L_0x0076:
            java.lang.String r0 = "discount_screen"
        L_0x0078:
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x00d0
            int r2 = r2 + 1
            goto L_0x006b
        L_0x0081:
            java.lang.String r0 = "shop"
            goto L_0x0078
        L_0x0084:
            java.lang.String r0 = "pdp"
            goto L_0x0078
        L_0x0087:
            java.util.List r0 = X.AnonymousClass3YD.A01(r10)
            r1 = 0
            if (r0 == 0) goto L_0x00d0
            java.util.Iterator r6 = r0.iterator()
        L_0x0092:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r2 = r6.next()
            r0 = r2
            X.1Xj r0 = (X.1Xj) r0
            X.1Xy r0 = r0.A0C
            X.DUl r0 = r0.Bg2()
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = r0.BDT()
            if (r0 == 0) goto L_0x0092
        L_0x00ad:
            X.1Xj r2 = (X.1Xj) r2
            if (r2 == 0) goto L_0x00d0
            X.1Xy r0 = r2.A0C
            X.DUl r0 = r0.Bg2()
            if (r0 == 0) goto L_0x00d0
            java.lang.String r8 = r0.BDT()
            if (r8 == 0) goto L_0x00d0
            goto L_0x0064
        L_0x00c0:
            r2 = r1
            goto L_0x00ad
        L_0x00c2:
            java.util.HashMap r1 = X.AnonymousClass3KD.A05
            java.lang.String r0 = r10.A2n()
            if (r0 == 0) goto L_0x0179
            r1.put(r0, r15)
            goto L_0x003d
        L_0x00cf:
            r1 = 0
        L_0x00d0:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            java.lang.String r2 = "cta_bar"
            if (r1 != r0) goto L_0x00fd
            X.3YH r0 = X.VKF.A00
            java.util.List r0 = r0.A04(r10)
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x017e
            androidx.fragment.app.FragmentActivity r4 = r3.getActivity()
            if (r4 == 0) goto L_0x017e
            X.3kF r3 = X.C249713kF.A00
            r5 = r9
            r6 = r10
            r7 = r11
            r8 = r12
            r9 = r0
            r10 = r2
            r11 = r14
            X.W2P r0 = r3.A0O(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 == 0) goto L_0x017e
            r0.A05()
            return
        L_0x00fd:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x011a
            java.util.ArrayList r0 = X.AnonymousClass3YH.A00(r10)
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L_0x011a
            X.3kF r14 = X.C249713kF.A00
            r16 = r9
            r17 = r10
            r18 = r11
            r19 = r12
            r14.A0r(r15, r16, r17, r18, r19)
            return
        L_0x011a:
            if (r5 == 0) goto L_0x017e
            if (r4 == 0) goto L_0x017e
            X.3kF r16 = X.C249713kF.A00
            java.lang.String r21 = r11.getModuleName()
            X.UzB r19 = X.C16675UzB.DISCOUNTS
            r18 = r9
            r20 = r14
            r17 = r15
            X.Vk1 r3 = r16.A0J(r17, r18, r19, r20, r21)
            r3.A04 = r5
            r3.A08 = r4
            java.lang.String r0 = r10.getId()
            r3.A07 = r0
            goto L_0x016e
        L_0x013b:
            X.3YD r2 = X.AnonymousClass3YC.A00
            java.lang.String r1 = r2.A03(r10)
            if (r1 == 0) goto L_0x017e
            androidx.fragment.app.FragmentActivity r4 = r3.getActivity()
            if (r4 == 0) goto L_0x017e
            X.3kF r3 = X.C249713kF.A00
            java.lang.String r8 = r11.getModuleName()
            X.UzB r6 = X.C16675UzB.PRODUCT_COLLECTION
            r5 = r9
            r7 = r14
            X.Vk1 r3 = r3.A0J(r4, r5, r6, r7, r8)
            X.57K r0 = r2.A02(r10)
            if (r0 == 0) goto L_0x0174
            r3.A01(r0, r1)
            java.lang.String r0 = r10.getId()
            r3.A07 = r0
            java.lang.String r0 = r2.A07(r10)
            r3.A08 = r0
            java.lang.String r2 = "cta_bar"
        L_0x016e:
            r3.A0A = r2
            r3.A00()
            return
        L_0x0174:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0179:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x017e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14213Trs.D4R(X.1Xj, X.3W1):void");
    }

    public final void EBV(View view, 1Xj r3) {
        this.A05.A00(view, r3);
    }
}
